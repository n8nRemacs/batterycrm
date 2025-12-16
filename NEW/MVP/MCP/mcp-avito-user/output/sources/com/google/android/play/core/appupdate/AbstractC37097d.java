package com.google.android.play.core.appupdate;

import j.N;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: com.google.android.play.core.appupdate.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37097d {

    /* compiled from: com.google.android.play:app-update@@2.1.0 */
    /* renamed from: com.google.android.play.core.appupdate.d$a */
    public static abstract class a {
        @N
        public abstract AbstractC37097d a();
    }

    @N
    public static a c(@JY0.b int i12) {
        A a12 = new A();
        a12.f357996a = i12;
        a12.f357997b = (byte) (((byte) (a12.f357997b | 1)) | 2);
        return a12;
    }

    public abstract boolean a();

    @JY0.b
    public abstract int b();
}
