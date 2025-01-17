/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.log.impl;

import org.bimserver.models.log.ExtendedDataAddedToProject;
import org.bimserver.models.log.LogPackage;
import org.bimserver.models.store.ExtendedData;
import org.bimserver.models.store.Project;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data Added To Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.log.impl.ExtendedDataAddedToProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bimserver.models.log.impl.ExtendedDataAddedToProjectImpl#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataAddedToProjectImpl extends LogActionImpl implements ExtendedDataAddedToProject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataAddedToProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.EXTENDED_DATA_ADDED_TO_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		return (Project) eGet(LogPackage.Literals.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		eSet(LogPackage.Literals.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT, newProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedData getExtendedData() {
		return (ExtendedData) eGet(LogPackage.Literals.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedData(ExtendedData newExtendedData) {
		eSet(LogPackage.Literals.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA, newExtendedData);
	}

} //ExtendedDataAddedToProjectImpl
