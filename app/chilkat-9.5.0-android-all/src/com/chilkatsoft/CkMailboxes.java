/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkMailboxes {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkMailboxes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkMailboxes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkMailboxes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkMailboxes() {
    this(chilkatJNI.new_CkMailboxes(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkMailboxes_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkMailboxes_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkMailboxes_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkMailboxes_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkMailboxes_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkMailboxes_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkMailboxes_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkMailboxes_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkMailboxes_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkMailboxes_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkMailboxes_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkMailboxes_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkMailboxes_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkMailboxes_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkMailboxes_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkMailboxes_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkMailboxes_SaveLastError(swigCPtr, this, path);
  }

  public int get_Count() {
    return chilkatJNI.CkMailboxes_get_Count(swigCPtr, this);
  }

  public boolean HasInferiors(int index) {
    return chilkatJNI.CkMailboxes_HasInferiors(swigCPtr, this, index);
  }

  public boolean IsMarked(int index) {
    return chilkatJNI.CkMailboxes_IsMarked(swigCPtr, this, index);
  }

  public boolean IsSelectable(int index) {
    return chilkatJNI.CkMailboxes_IsSelectable(swigCPtr, this, index);
  }

  public boolean GetName(int index, CkString outStrName) {
    return chilkatJNI.CkMailboxes_GetName(swigCPtr, this, index, CkString.getCPtr(outStrName), outStrName);
  }

  public String getName(int index) {
    return chilkatJNI.CkMailboxes_getName(swigCPtr, this, index);
  }

  public String name(int index) {
    return chilkatJNI.CkMailboxes_name(swigCPtr, this, index);
  }

  public boolean GetFlags(int index, CkString outStr) {
    return chilkatJNI.CkMailboxes_GetFlags(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getFlags(int index) {
    return chilkatJNI.CkMailboxes_getFlags(swigCPtr, this, index);
  }

  public String flags(int index) {
    return chilkatJNI.CkMailboxes_flags(swigCPtr, this, index);
  }

  public boolean HasFlag(int index, String flagName) {
    return chilkatJNI.CkMailboxes_HasFlag(swigCPtr, this, index, flagName);
  }

  public int GetNumFlags(int index) {
    return chilkatJNI.CkMailboxes_GetNumFlags(swigCPtr, this, index);
  }

  public boolean GetNthFlag(int index, int flagIndex, CkString outStr) {
    return chilkatJNI.CkMailboxes_GetNthFlag(swigCPtr, this, index, flagIndex, CkString.getCPtr(outStr), outStr);
  }

  public String getNthFlag(int index, int flagIndex) {
    return chilkatJNI.CkMailboxes_getNthFlag(swigCPtr, this, index, flagIndex);
  }

  public String nthFlag(int index, int flagIndex) {
    return chilkatJNI.CkMailboxes_nthFlag(swigCPtr, this, index, flagIndex);
  }

  public int GetMailboxIndex(String mbxName) {
    return chilkatJNI.CkMailboxes_GetMailboxIndex(swigCPtr, this, mbxName);
  }

}
