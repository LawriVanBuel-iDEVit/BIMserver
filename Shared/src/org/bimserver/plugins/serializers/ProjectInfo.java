package org.bimserver.plugins.serializers;

import org.bimserver.interfaces.objects.SVector3f;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
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
 *****************************************************************************/

public class ProjectInfo {
	private String name;
	private String description;
	private double x;
	private double y;
	private double z;
	private double directionAngle;
	private String authorName;
	private SVector3f minBounds;
	private SVector3f maxBounds;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getDirectionAngle() {
		return directionAngle;
	}

	public void setDirectionAngle(double directionAngle) {
		this.directionAngle = directionAngle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public SVector3f getMinBounds() {
		return minBounds;
	}

	public void setMinBounds(SVector3f minBounds) {
		this.minBounds = minBounds;
	}

	public SVector3f getMaxBounds() {
		return maxBounds;
	}

	public void setMaxBounds(SVector3f maxBounds) {
		this.maxBounds = maxBounds;
	}
}