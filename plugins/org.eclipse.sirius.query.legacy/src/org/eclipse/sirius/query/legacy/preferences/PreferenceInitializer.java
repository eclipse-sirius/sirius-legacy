/*******************************************************************************
 * Copyright (c) 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.query.legacy.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.sirius.query.legacy.AcceleoInterpreterPlugin;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

  public PreferenceInitializer() {
  }

  @Override
  public void initializeDefaultPreferences() {
    IEclipsePreferences preferences = DefaultScope.INSTANCE.getNode(AcceleoInterpreterPlugin.PLUGIN_ID);
    preferences.putBoolean(AcceleoPreferenceConstants.PREF_USE_SPECIFIC_SCRIPTS_FIRST, AcceleoPreferenceConstants.PREF_USE_SPECIFIC_SCRIPTS_FIRST_DEFAULT_VALUE);
  }

}
