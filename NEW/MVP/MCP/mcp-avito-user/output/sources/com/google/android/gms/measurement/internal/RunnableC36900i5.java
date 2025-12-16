package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36900i5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f355195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36879f5 f355196c;

    public RunnableC36900i5(C36879f5 c36879f5, long j12) {
        this.f355195b = j12;
        this.f355196c = c36879f5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36879f5.l(this.f355196c, this.f355195b);
    }
}
