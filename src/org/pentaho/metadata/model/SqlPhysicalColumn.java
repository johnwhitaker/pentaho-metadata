/*
 * Copyright 2009 Pentaho Corporation.  All rights reserved.
 * This software was developed by Pentaho Corporation and is provided under the terms
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 */
package org.pentaho.metadata.model;

import java.util.List;

import org.pentaho.metadata.model.concept.Concept;
import org.pentaho.metadata.model.concept.types.AggregationType;
import org.pentaho.metadata.model.concept.types.DataType;
import org.pentaho.metadata.model.concept.types.TargetColumnType;


/**
 * this is the SQL implementation of physical column.
 * 
 * @author Will Gorman (wgorman@pentaho.com)
 *
 */
public class SqlPhysicalColumn extends Concept implements IPhysicalColumn {

  private static final long serialVersionUID = -9131564777458111496L;

  public static final String TARGET_COLUMN = "target_column";
  public static final String TARGET_COLUMN_TYPE = "target_column_type";

  private SqlPhysicalTable table;

  public SqlPhysicalColumn() {
    super();
  }
  
  public SqlPhysicalColumn(SqlPhysicalTable table) {
    this.table = table;
    setTargetColumnType(TargetColumnType.COLUMN_NAME);
  }
  
  public String getTargetColumn() {
    return (String)getProperty(TARGET_COLUMN);
  }

  public void setTargetColumn(String targetTable) {
    setProperty(TARGET_COLUMN, targetTable);
  }
  
  public TargetColumnType getTargetColumnType() {
    return (TargetColumnType)getProperty(TARGET_COLUMN_TYPE);
  }
  
  public void setTargetColumnType(TargetColumnType targetTableType) {
    setProperty(TARGET_COLUMN_TYPE, targetTableType);
  }
  
  public DataType getDataType() {
    return (DataType)getProperty(IPhysicalColumn.DATATYPE_PROPERTY);
  }

  public void setDataType(DataType dataType) {
    setProperty(IPhysicalColumn.DATATYPE_PROPERTY, dataType);
  }
  
  public AggregationType getAggregationType() {
    return (AggregationType)getProperty(IPhysicalColumn.AGGREGATIONTYPE_PROPERTY);
  }

  public void setAggregationType(AggregationType aggType) {
    setProperty(IPhysicalColumn.AGGREGATIONTYPE_PROPERTY, aggType);
  }
  
  @SuppressWarnings("unchecked")
  public List<AggregationType> getAggregationList() {
    return (List<AggregationType>)getProperty(IPhysicalColumn.AGGREGATIONTYPE_PROPERTY);
  }

  public void setAggregationList(List<AggregationType> aggList) {
    setProperty(IPhysicalColumn.AGGREGATIONTYPE_PROPERTY, aggList);
  }

  public IPhysicalTable getPhysicalTable() {
    return table;
  }
  
}