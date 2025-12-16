package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36961r4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f355352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36934n4 f355353c;

    public RunnableC36961r4(C36934n4 c36934n4, long j12) {
        this.f355352b = j12;
        this.f355353c = c36934n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36934n4 c36934n4 = this.f355353c;
        c36934n4.f355183a.i().i(this.f355352b);
        c36934n4.f355279e = null;
    }
}
