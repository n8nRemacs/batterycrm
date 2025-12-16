package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class O3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f354830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354831c;

    public O3(C36967s3 c36967s3, long j12) {
        this.f354830b = j12;
        this.f354831c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j12 = this.f354830b;
        C36967s3 c36967s3 = this.f354831c;
        c36967s3.p(j12, true);
        c36967s3.f355183a.n().y(new AtomicReference<>());
    }
}
