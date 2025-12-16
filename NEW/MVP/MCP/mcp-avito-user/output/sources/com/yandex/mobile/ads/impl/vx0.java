package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;

/* loaded from: classes8.dex */
public interface vx0 {
    static int a(int i12) {
        return i12 | 128;
    }

    @SuppressLint({"WrongConstant"})
    static int b(int i12) {
        return i12 & 128;
    }

    @SuppressLint({"WrongConstant"})
    static int c(int i12) {
        return i12 & 64;
    }

    int a(vw vwVar);

    int f();

    String getName();
}
