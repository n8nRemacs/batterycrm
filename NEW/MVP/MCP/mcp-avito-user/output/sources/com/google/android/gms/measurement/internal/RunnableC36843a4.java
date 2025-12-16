package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36843a4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzif f355022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f355023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f355024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzif f355026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f355027g;

    public RunnableC36843a4(C36967s3 c36967s3, zzif zzifVar, long j12, long j13, boolean z12, zzif zzifVar2) {
        this.f355022b = zzifVar;
        this.f355023c = j12;
        this.f355024d = j13;
        this.f355025e = z12;
        this.f355026f = zzifVar2;
        this.f355027g = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36967s3 c36967s3 = this.f355027g;
        zzif zzifVar = this.f355022b;
        c36967s3.t(zzifVar);
        c36967s3.p(this.f355023c, false);
        C36967s3.x(this.f355027g, this.f355022b, this.f355024d, true, this.f355025e);
        if (zzpt.zza() && c36967s3.f355183a.f354715g.o(null, E.f354640q0)) {
            C36967s3.y(c36967s3, zzifVar, this.f355026f);
        }
    }
}
