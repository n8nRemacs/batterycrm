package com.google.android.play.core.splitinstall.internal;

import android.os.Build;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37222o {
    public static InterfaceC37221n a() {
        return (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT == 0) ? new F() : new H();
    }
}
