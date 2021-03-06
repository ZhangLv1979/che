/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.menu;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.che.ide.api.mvp.Presenter;

/**
 * Manages Main Menu Items, their runtime visibility and enabled state.
 *
 * @author Nikolay Zamosenchuk
 */
@Singleton
public class MainMenuPresenter implements Presenter, MainMenuView.ActionDelegate {

  private final MainMenuView view;

  /**
   * Main Menu Presenter requires View implementation
   *
   * @param view
   */
  @Inject
  public MainMenuPresenter(MainMenuView view) {
    this.view = view;
    this.view.setDelegate(this);
  }

  /** {@inheritDoc} */
  @Override
  public void go(AcceptsOneWidget container) {
    container.setWidget(view);
  }
}
