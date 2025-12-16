package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36670t0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f349212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36676w0 f349213c;

    public RunnableC36670t0(C36676w0 c36676w0, int i12) {
        this.f349213c = c36676w0;
        this.f349212b = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f349213c.g(this.f349212b);
    }
}
