package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36864d4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzif f355101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f355102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f355103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzif f355104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f355105f;

    public RunnableC36864d4(C36967s3 c36967s3, zzif zzifVar, long j12, boolean z12, zzif zzifVar2) {
        this.f355101b = zzifVar;
        this.f355102c = j12;
        this.f355103d = z12;
        this.f355104e = zzifVar2;
        this.f355105f = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36967s3 c36967s3 = this.f355105f;
        zzif zzifVar = this.f355101b;
        c36967s3.t(zzifVar);
        C36967s3.x(this.f355105f, this.f355101b, this.f355102c, false, this.f355103d);
        if (zzpt.zza() && c36967s3.f355183a.f354715g.o(null, E.f354640q0)) {
            C36967s3.y(c36967s3, zzifVar, this.f355104e);
        }
    }
}
