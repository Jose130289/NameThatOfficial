/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkCsv {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkCsv(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkCsv obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkCsv(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkCsv() {
    this(chilkatJNI.new_CkCsv(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkCsv_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkCsv_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkCsv_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkCsv_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkCsv_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkCsv_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkCsv_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkCsv_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkCsv_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkCsv_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkCsv_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkCsv_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkCsv_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkCsv_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkCsv_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkCsv_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkCsv_SaveLastError(swigCPtr, this, path);
  }

  public boolean get_Crlf() {
    return chilkatJNI.CkCsv_get_Crlf(swigCPtr, this);
  }

  public void put_Crlf(boolean newVal) {
    chilkatJNI.CkCsv_put_Crlf(swigCPtr, this, newVal);
  }

  public void get_Delimiter(CkString str) {
    chilkatJNI.CkCsv_get_Delimiter(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String delimiter() {
    return chilkatJNI.CkCsv_delimiter(swigCPtr, this);
  }

  public void put_Delimiter(String newVal) {
    chilkatJNI.CkCsv_put_Delimiter(swigCPtr, this, newVal);
  }

  public boolean get_HasColumnNames() {
    return chilkatJNI.CkCsv_get_HasColumnNames(swigCPtr, this);
  }

  public void put_HasColumnNames(boolean newVal) {
    chilkatJNI.CkCsv_put_HasColumnNames(swigCPtr, this, newVal);
  }

  public int get_NumColumns() {
    return chilkatJNI.CkCsv_get_NumColumns(swigCPtr, this);
  }

  public int get_NumRows() {
    return chilkatJNI.CkCsv_get_NumRows(swigCPtr, this);
  }

  public boolean get_AutoTrim() {
    return chilkatJNI.CkCsv_get_AutoTrim(swigCPtr, this);
  }

  public void put_AutoTrim(boolean newVal) {
    chilkatJNI.CkCsv_put_AutoTrim(swigCPtr, this, newVal);
  }

  public boolean DeleteColumn(int index) {
    return chilkatJNI.CkCsv_DeleteColumn(swigCPtr, this, index);
  }

  public boolean DeleteColumnByName(String columnName) {
    return chilkatJNI.CkCsv_DeleteColumnByName(swigCPtr, this, columnName);
  }

  public boolean DeleteRow(int index) {
    return chilkatJNI.CkCsv_DeleteRow(swigCPtr, this, index);
  }

  public boolean GetCell(int row, int col, CkString outStr) {
    return chilkatJNI.CkCsv_GetCell(swigCPtr, this, row, col, CkString.getCPtr(outStr), outStr);
  }

  public String getCell(int row, int col) {
    return chilkatJNI.CkCsv_getCell(swigCPtr, this, row, col);
  }

  public String cell(int row, int col) {
    return chilkatJNI.CkCsv_cell(swigCPtr, this, row, col);
  }

  public boolean GetCellByName(int row, String columnName, CkString outStr) {
    return chilkatJNI.CkCsv_GetCellByName(swigCPtr, this, row, columnName, CkString.getCPtr(outStr), outStr);
  }

  public String getCellByName(int row, String columnName) {
    return chilkatJNI.CkCsv_getCellByName(swigCPtr, this, row, columnName);
  }

  public String cellByName(int row, String columnName) {
    return chilkatJNI.CkCsv_cellByName(swigCPtr, this, row, columnName);
  }

  public boolean GetColumnName(int index, CkString outStr) {
    return chilkatJNI.CkCsv_GetColumnName(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getColumnName(int index) {
    return chilkatJNI.CkCsv_getColumnName(swigCPtr, this, index);
  }

  public String columnName(int index) {
    return chilkatJNI.CkCsv_columnName(swigCPtr, this, index);
  }

  public int GetIndex(String columnName) {
    return chilkatJNI.CkCsv_GetIndex(swigCPtr, this, columnName);
  }

  public int GetNumCols(int row) {
    return chilkatJNI.CkCsv_GetNumCols(swigCPtr, this, row);
  }

  public boolean LoadFile(String path) {
    return chilkatJNI.CkCsv_LoadFile(swigCPtr, this, path);
  }

  public boolean LoadFile2(String path, String charset) {
    return chilkatJNI.CkCsv_LoadFile2(swigCPtr, this, path, charset);
  }

  public boolean LoadFromString(String csvData) {
    return chilkatJNI.CkCsv_LoadFromString(swigCPtr, this, csvData);
  }

  public boolean RowMatches(int row, String matchPattern, boolean bCaseSensitive) {
    return chilkatJNI.CkCsv_RowMatches(swigCPtr, this, row, matchPattern, bCaseSensitive);
  }

  public boolean SaveFile(String path) {
    return chilkatJNI.CkCsv_SaveFile(swigCPtr, this, path);
  }

  public boolean SaveFile2(String path, String charset) {
    return chilkatJNI.CkCsv_SaveFile2(swigCPtr, this, path, charset);
  }

  public boolean SaveToString(CkString outStr) {
    return chilkatJNI.CkCsv_SaveToString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String saveToString() {
    return chilkatJNI.CkCsv_saveToString(swigCPtr, this);
  }

  public boolean SetCell(int row, int col, String content) {
    return chilkatJNI.CkCsv_SetCell(swigCPtr, this, row, col, content);
  }

  public boolean SetCellByName(int row, String columnName, String content) {
    return chilkatJNI.CkCsv_SetCellByName(swigCPtr, this, row, columnName, content);
  }

  public boolean SetColumnName(int index, String columnName) {
    return chilkatJNI.CkCsv_SetColumnName(swigCPtr, this, index, columnName);
  }

  public boolean SortByColumn(String columnName, boolean bAscending, boolean bCaseSensitive) {
    return chilkatJNI.CkCsv_SortByColumn(swigCPtr, this, columnName, bAscending, bCaseSensitive);
  }

}
