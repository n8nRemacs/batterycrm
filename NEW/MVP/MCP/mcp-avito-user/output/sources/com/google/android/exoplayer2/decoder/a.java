package com.google.android.exoplayer2.decoder;

/* compiled from: Buffer.java */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public int f344210b;

    public final void e(int i12) {
        this.f344210b = i12 | this.f344210b;
    }

    public final boolean f(int i12) {
        return (this.f344210b & i12) == i12;
    }
}
