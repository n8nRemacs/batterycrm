package com.google.android.material.progressindicator;

/* compiled from: LinearProgressIndicatorSpec.java */
/* loaded from: classes6.dex */
public final class w extends c {

    /* renamed from: g, reason: collision with root package name */
    public int f356982g;

    /* renamed from: h, reason: collision with root package name */
    public int f356983h;

    public final void a() {
        if (this.f356982g == 0) {
            if (this.f356908b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f356909c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
