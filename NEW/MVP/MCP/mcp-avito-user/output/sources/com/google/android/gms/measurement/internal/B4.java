package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzif;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class B4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzo f354540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354541d;

    public B4(C36996w4 c36996w4, AtomicReference atomicReference, zzo zzoVar) {
        this.f354539b = atomicReference;
        this.f354540c = zzoVar;
        this.f354541d = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f354539b) {
            try {
                try {
                } catch (RemoteException e12) {
                    this.f354541d.zzj().f354889f.c("Failed to get app instance id", e12);
                }
                if (!this.f354541d.b().o().e(zzif.zza.ANALYTICS_STORAGE)) {
                    this.f354541d.zzj().f354894k.b("Analytics storage consent denied; will not get app instance id");
                    this.f354541d.f().B(null);
                    this.f354541d.b().f355130h.b(null);
                    this.f354539b.set(null);
                    return;
                }
                C36996w4 c36996w4 = this.f354541d;
                L1 l12 = c36996w4.f355424d;
                if (l12 == null) {
                    c36996w4.zzj().f354889f.b("Failed to get app instance id");
                    return;
                }
                this.f354539b.set(l12.x1(this.f354540c));
                String str = (String) this.f354539b.get();
                if (str != null) {
                    this.f354541d.f().B(str);
                    this.f354541d.b().f355130h.b(str);
                }
                this.f354541d.O();
                this.f354539b.notify();
            } finally {
                this.f354539b.notify();
            }
        }
    }
}
