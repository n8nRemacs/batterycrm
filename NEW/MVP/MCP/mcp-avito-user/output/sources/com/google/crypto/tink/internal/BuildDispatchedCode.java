package com.google.crypto.tink.internal;

import I41.h;
import android.os.Build;

/* loaded from: classes6.dex */
final class BuildDispatchedCode {
    private BuildDispatchedCode() {
    }

    @h
    public static Integer getApiLevel() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
