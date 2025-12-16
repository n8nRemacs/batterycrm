package com.google.android.gms.measurement.internal;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36865d5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36997w5 f355106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f355107c;

    public RunnableC36865d5(C36997w5 c36997w5, Runnable runnable) {
        this.f355106b = c36997w5;
        this.f355107c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C36997w5 c36997w5 = this.f355106b;
        c36997w5.Q();
        c36997w5.zzl().e();
        if (c36997w5.f355453p == null) {
            c36997w5.f355453p = new ArrayList();
        }
        c36997w5.f355453p.add(this.f355107c);
        c36997w5.S();
    }
}
