package com.google.android.gms.measurement.internal;

import com.google.common.util.concurrent.InterfaceC37564s0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class D3 implements InterfaceC37564s0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzmh f354555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354556b;

    public D3(C36967s3 c36967s3, zzmh zzmhVar) {
        this.f354555a = zzmhVar;
        this.f354556b = c36967s3;
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void a(Throwable th2) {
        C36967s3 c36967s3 = this.f354556b;
        c36967s3.e();
        c36967s3.f355368i = false;
        c36967s3.V();
        c36967s3.zzj().f354889f.c("registerTriggerAsync failed with throwable", th2);
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void onSuccess(Object obj) {
        C36967s3 c36967s3 = this.f354556b;
        c36967s3.e();
        c36967s3.f355368i = false;
        c36967s3.V();
        c36967s3.zzj().f354896m.c("registerTriggerAsync ran. uri", this.f354555a.f355551b);
    }
}
