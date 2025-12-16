package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
public class tr0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f390293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f390294b;

    public tr0(@j.P String str, @j.P Exception exc, boolean z12, int i12) {
        super(str, exc);
        this.f390293a = z12;
        this.f390294b = i12;
    }

    public static tr0 a(@j.P String str, @j.P IllegalArgumentException illegalArgumentException) {
        return new tr0(str, illegalArgumentException, true, 0);
    }

    public static tr0 a(@j.P String str, @j.P Exception exc) {
        return new tr0(str, exc, true, 1);
    }

    public static tr0 a(@j.P String str) {
        return new tr0(str, null, false, 1);
    }
}
