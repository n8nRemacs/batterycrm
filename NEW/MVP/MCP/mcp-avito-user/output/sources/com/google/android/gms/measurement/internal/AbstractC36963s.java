package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzcp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC36963s {

    /* renamed from: d, reason: collision with root package name */
    public static volatile zzcp f355354d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36905j3 f355355a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f355356b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f355357c;

    public AbstractC36963s(InterfaceC36905j3 interfaceC36905j3) {
        C36729v.j(interfaceC36905j3);
        this.f355355a = interfaceC36905j3;
        this.f355356b = new RunnableC36984v(this, interfaceC36905j3);
    }

    public final void a() {
        this.f355357c = 0L;
        d().removeCallbacks(this.f355356b);
    }

    public final void b(long j12) {
        a();
        if (j12 >= 0) {
            this.f355357c = this.f355355a.zzb().b();
            if (d().postDelayed(this.f355356b, j12)) {
                return;
            }
            this.f355355a.zzj().f354889f.c("Failed to schedule delayed post. time", Long.valueOf(j12));
        }
    }

    public abstract void c();

    public final Handler d() {
        zzcp zzcpVar;
        if (f355354d != null) {
            return f355354d;
        }
        synchronized (AbstractC36963s.class) {
            try {
                if (f355354d == null) {
                    f355354d = new zzcp(this.f355355a.zza().getMainLooper());
                }
                zzcpVar = f355354d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzcpVar;
    }
}
