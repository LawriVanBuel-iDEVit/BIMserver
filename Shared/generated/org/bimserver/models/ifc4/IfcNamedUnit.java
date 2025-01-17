/**
 * Copyright (C) 2009-2013 BIMserver.org
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
package org.bimserver.models.ifc4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Named Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcNamedUnit#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcNamedUnit#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcNamedUnit()
 * @model
 * @generated
 */
public interface IfcNamedUnit extends IfcUnit {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference.
	 * @see #setDimensions(IfcDimensionalExponents)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcNamedUnit_Dimensions()
	 * @model
	 * @generated
	 */
	IfcDimensionalExponents getDimensions();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcNamedUnit#getDimensions <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(IfcDimensionalExponents value);

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcUnitEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcUnitEnum
	 * @see #setUnitType(IfcUnitEnum)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcNamedUnit_UnitType()
	 * @model
	 * @generated
	 */
	IfcUnitEnum getUnitType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcNamedUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcUnitEnum
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(IfcUnitEnum value);

} // IfcNamedUnit
