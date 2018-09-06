// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.

package com.mapbox.mapboxsdk.testapp.symbol;

import android.support.test.runner.AndroidJUnit4;

import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.annotations.fill.Fill;
import com.mapbox.mapboxsdk.annotations.fill.FillManager;
import timber.log.Timber;

import com.mapbox.mapboxsdk.testapp.activity.BaseActivityTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.mapbox.mapboxsdk.testapp.action.MapboxMapAction.invoke;
import static org.junit.Assert.*;
import static com.mapbox.mapboxsdk.style.layers.Property.*;

import com.mapbox.mapboxsdk.testapp.activity.espresso.EspressoTestActivity;

/**
 * Basic smoke tests for FillManager
 */
@RunWith(AndroidJUnit4.class)
public class FillManagerTest extends BaseActivityTest {

  private FillManager fillManager;

  @Override
  protected Class getActivityClass() {
    return EspressoTestActivity.class;
  }

  private void setupFillManager() {
    Timber.i("Retrieving layer");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      fillManager = new FillManager(mapboxMap);
    });
  }

  @Test
  public void testFillAntialiasAsConstant() {
    validateTestSetup();
    setupFillManager();
    Timber.i("fill-antialias");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(fillManager);

      fillManager.setFillAntialias(true);
      assertEquals((Boolean) fillManager.getFillAntialias(), (Boolean) true);
    });
  }

  @Test
  public void testFillTranslateAsConstant() {
    validateTestSetup();
    setupFillManager();
    Timber.i("fill-translate");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(fillManager);

      fillManager.setFillTranslate(new Float[] {0f, 0f});
      assertEquals((Float[]) fillManager.getFillTranslate(), (Float[]) new Float[] {0f, 0f});
    });
  }

  @Test
  public void testFillTranslateAnchorAsConstant() {
    validateTestSetup();
    setupFillManager();
    Timber.i("fill-translate-anchor");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(fillManager);

      fillManager.setFillTranslateAnchor(FILL_TRANSLATE_ANCHOR_MAP);
      assertEquals((String) fillManager.getFillTranslateAnchor(), (String) FILL_TRANSLATE_ANCHOR_MAP);
    });
  }
}