package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes8.dex */
public final class o80 {
    public static void a(@j.N View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
