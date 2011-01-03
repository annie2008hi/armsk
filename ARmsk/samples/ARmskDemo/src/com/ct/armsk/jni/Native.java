/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ct.armsk.jni;

import com.opencv.jni.Mat;
import com.opencv.jni.image_pool;// import the image_pool interface for playing nice with
// android-opencv

/** ARmsk - for processing images that are stored in an image pool
*/
public class Native {
  private long swigCPtr;
  protected boolean swigCMemOwn;
  public Native(long cPtr, boolean cMemoryOwn) {
	swigCMemOwn = cMemoryOwn;
	swigCPtr = cPtr;
  }
  public static long getCPtr(Native obj) {
	return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      armskdemoappJNI.delete_Native(swigCPtr);
    }
    swigCPtr = 0;
  }

  public Native() {
    this(armskdemoappJNI.new_Native(), true);
  }

  public void processAR(int input_idx, image_pool pool, int detection_method, String filename) {
    armskdemoappJNI.Native_processAR(swigCPtr, this, input_idx, image_pool.getCPtr(pool), pool, detection_method, filename);
  }

  public void match(SWIGTYPE_p_IMAGEDATA trainData, SWIGTYPE_p_IMAGEDATA queryData, SWIGTYPE_p_vectorTint_t matches) {
    armskdemoappJNI.Native_match(swigCPtr, this, SWIGTYPE_p_IMAGEDATA.getCPtr(trainData), SWIGTYPE_p_IMAGEDATA.getCPtr(queryData), SWIGTYPE_p_vectorTint_t.getCPtr(matches));
  }

  public void setTemplate(int input_idx, image_pool pool) {
    armskdemoappJNI.Native_setTemplate(swigCPtr, this, input_idx, image_pool.getCPtr(pool), pool);
  }

  public void saveMarker(int input_idx, image_pool pool, String filePath) {
    armskdemoappJNI.Native_saveMarker(swigCPtr, this, input_idx, image_pool.getCPtr(pool), pool, filePath);
  }

  public void clearAll() {
    armskdemoappJNI.Native_clearAll(swigCPtr, this);
  }

  public float getMatrix(int i) {
    return armskdemoappJNI.Native_getMatrix(swigCPtr, this, i);
  }

}
