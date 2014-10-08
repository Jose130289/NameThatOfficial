/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkStringArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkStringArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkStringArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkStringArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkStringArray() {
    this(chilkatJNI.new_CkStringArray(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkStringArray_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkStringArray_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkStringArray_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkStringArray_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkStringArray_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkStringArray_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkStringArray_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkStringArray_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkStringArray_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkStringArray_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkStringArray_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkStringArray_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkStringArray_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkStringArray_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkStringArray_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkStringArray_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkStringArray_SaveLastError(swigCPtr, this, path);
  }

  public boolean get_Crlf() {
    return chilkatJNI.CkStringArray_get_Crlf(swigCPtr, this);
  }

  public void put_Crlf(boolean newVal) {
    chilkatJNI.CkStringArray_put_Crlf(swigCPtr, this, newVal);
  }

  public boolean get_Trim() {
    return chilkatJNI.CkStringArray_get_Trim(swigCPtr, this);
  }

  public void put_Trim(boolean newVal) {
    chilkatJNI.CkStringArray_put_Trim(swigCPtr, this, newVal);
  }

  public boolean get_Unique() {
    return chilkatJNI.CkStringArray_get_Unique(swigCPtr, this);
  }

  public void put_Unique(boolean newVal) {
    chilkatJNI.CkStringArray_put_Unique(swigCPtr, this, newVal);
  }

  public int get_Length() {
    return chilkatJNI.CkStringArray_get_Length(swigCPtr, this);
  }

  public int get_Count() {
    return chilkatJNI.CkStringArray_get_Count(swigCPtr, this);
  }

  public boolean Append(String str) {
    return chilkatJNI.CkStringArray_Append(swigCPtr, this, str);
  }

  public boolean AppendSerialized(String encodedStr) {
    return chilkatJNI.CkStringArray_AppendSerialized(swigCPtr, this, encodedStr);
  }

  public void Clear() {
    chilkatJNI.CkStringArray_Clear(swigCPtr, this);
  }

  public boolean Contains(String str) {
    return chilkatJNI.CkStringArray_Contains(swigCPtr, this, str);
  }

  public int Find(String str, int firstIndex) {
    return chilkatJNI.CkStringArray_Find(swigCPtr, this, str, firstIndex);
  }

  public int FindFirstMatch(String str, int firstIndex) {
    return chilkatJNI.CkStringArray_FindFirstMatch(swigCPtr, this, str, firstIndex);
  }

  public boolean GetString(int index, CkString outStr) {
    return chilkatJNI.CkStringArray_GetString(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getString(int index) {
    return chilkatJNI.CkStringArray_getString(swigCPtr, this, index);
  }

  public String string(int index) {
    return chilkatJNI.CkStringArray_string(swigCPtr, this, index);
  }

  public int GetStringLen(int index) {
    return chilkatJNI.CkStringArray_GetStringLen(swigCPtr, this, index);
  }

  public void InsertAt(int index, String str) {
    chilkatJNI.CkStringArray_InsertAt(swigCPtr, this, index, str);
  }

  public boolean LastString(CkString outStr) {
    return chilkatJNI.CkStringArray_LastString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String lastString() {
    return chilkatJNI.CkStringArray_lastString(swigCPtr, this);
  }

  public boolean LoadFromFile(String filename) {
    return chilkatJNI.CkStringArray_LoadFromFile(swigCPtr, this, filename);
  }

  public boolean LoadFromFile2(String filename, String charset) {
    return chilkatJNI.CkStringArray_LoadFromFile2(swigCPtr, this, filename, charset);
  }

  public void LoadFromText(String str) {
    chilkatJNI.CkStringArray_LoadFromText(swigCPtr, this, str);
  }

  public boolean Pop(CkString outStr) {
    return chilkatJNI.CkStringArray_Pop(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String pop() {
    return chilkatJNI.CkStringArray_pop(swigCPtr, this);
  }

  public void Prepend(String str) {
    chilkatJNI.CkStringArray_Prepend(swigCPtr, this, str);
  }

  public void Remove(String str) {
    chilkatJNI.CkStringArray_Remove(swigCPtr, this, str);
  }

  public boolean RemoveAt(int index) {
    return chilkatJNI.CkStringArray_RemoveAt(swigCPtr, this, index);
  }

  public boolean SaveNthToFile(int index, String filename) {
    return chilkatJNI.CkStringArray_SaveNthToFile(swigCPtr, this, index, filename);
  }

  public boolean SaveToFile(String filename) {
    return chilkatJNI.CkStringArray_SaveToFile(swigCPtr, this, filename);
  }

  public boolean SaveToFile2(String filename, String charset) {
    return chilkatJNI.CkStringArray_SaveToFile2(swigCPtr, this, filename, charset);
  }

  public boolean SaveToText(CkString outStr) {
    return chilkatJNI.CkStringArray_SaveToText(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String saveToText() {
    return chilkatJNI.CkStringArray_saveToText(swigCPtr, this);
  }

  public boolean Serialize(CkString outStr) {
    return chilkatJNI.CkStringArray_Serialize(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String serialize() {
    return chilkatJNI.CkStringArray_serialize(swigCPtr, this);
  }

  public void Sort(boolean ascending) {
    chilkatJNI.CkStringArray_Sort(swigCPtr, this, ascending);
  }

  public void SplitAndAppend(String str, String boundary) {
    chilkatJNI.CkStringArray_SplitAndAppend(swigCPtr, this, str, boundary);
  }

  public boolean StrAt(int index, CkString outStr) {
    return chilkatJNI.CkStringArray_StrAt(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String strAt(int index) {
    return chilkatJNI.CkStringArray_strAt(swigCPtr, this, index);
  }

  public void Subtract(CkStringArray sa) {
    chilkatJNI.CkStringArray_Subtract(swigCPtr, this, CkStringArray.getCPtr(sa), sa);
  }

  public void Union(CkStringArray sa) {
    chilkatJNI.CkStringArray_Union(swigCPtr, this, CkStringArray.getCPtr(sa), sa);
  }

}
