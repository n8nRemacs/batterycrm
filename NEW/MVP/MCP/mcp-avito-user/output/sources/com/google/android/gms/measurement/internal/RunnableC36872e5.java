package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36872e5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f355119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36879f5 f355120c;

    public RunnableC36872e5(C36879f5 c36879f5, long j12) {
        this.f355119b = j12;
        this.f355120c = c36879f5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36879f5.p(this.f355120c, this.f355119b);
    }
}
