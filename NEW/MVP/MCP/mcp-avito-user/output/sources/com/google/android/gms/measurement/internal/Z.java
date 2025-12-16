package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class Z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f355003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37005y f355004c;

    public Z(C37005y c37005y, long j12) {
        this.f355003b = j12;
        this.f355004c = c37005y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355004c.n(this.f355003b);
    }
}
