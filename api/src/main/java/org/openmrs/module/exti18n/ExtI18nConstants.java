/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.exti18n;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class ExtI18nConstants {
	
	/*
	 * Module ids
	 */
	public static final String MODULE_NAME = "Extended I18n";
	
	public static final String MODULE_ARTIFACT_ID = "exti18n";
	
	public static final String MODULE_SHORT_ID = "EI18N";
	
	public static final String MODULE_BASE_URL = "/" + MODULE_ARTIFACT_ID;
	
	public static final String COMPONENT_LEGACY_CONTROLLER = MODULE_ARTIFACT_ID + "." + MODULE_NAME + "Controller";
	
	/*
	 * Address Hierarchy
	 */
	public static final String GLOBAL_PROP_AH_I18N_SUPPORT = "addresshierarchy.i18nSupport";
}
