/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;

/**
 * A context wrapper that always wraps Android Application {@link Context} and {
 * CatalystInstance} by extending {@link ReactContext}
 */
public class ReactApplicationContext extends ReactContext {
  // We want to wrap ApplicationContext, since there is no easy way to verify that application
  // context is passed as a param, we use {@link Context#getApplicationContext} to ensure that
  // the context we're wrapping is in fact an application context.
  public ReactApplicationContext(Context context) {
    super(context.getApplicationContext());
  }

}

// Nothing reactish here, which is good news.
