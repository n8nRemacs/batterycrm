package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36984v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36905j3 f355402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC36963s f355403c;

    public RunnableC36984v(AbstractC36963s abstractC36963s, InterfaceC36905j3 interfaceC36905j3) {
        this.f355402b = interfaceC36905j3;
        this.f355403c = abstractC36963s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355402b.zzd();
        if (C36852c.a()) {
            this.f355402b.zzl().n(this);
            return;
        }
        boolean z12 = this.f355403c.f355357c != 0;
        this.f355403c.f355357c = 0L;
        if (z12) {
            this.f355403c.c();
        }
    }
}
