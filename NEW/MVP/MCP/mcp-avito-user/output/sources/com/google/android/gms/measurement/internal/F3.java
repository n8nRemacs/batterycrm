package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class F3 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354677b;

    public F3(C36967s3 c36967s3) {
        this.f354677b = c36967s3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f354677b.zzl().n(runnable);
    }
}
