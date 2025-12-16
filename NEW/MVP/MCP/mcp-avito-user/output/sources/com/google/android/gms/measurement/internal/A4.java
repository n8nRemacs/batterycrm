package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class A4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzo f354521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f354522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354523e;

    public A4(C36996w4 c36996w4, AtomicReference atomicReference, zzo zzoVar, Bundle bundle) {
        this.f354520b = atomicReference;
        this.f354521c = zzoVar;
        this.f354522d = bundle;
        this.f354523e = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4 c36996w4;
        L1 l12;
        synchronized (this.f354520b) {
            try {
                try {
                    c36996w4 = this.f354523e;
                    l12 = c36996w4.f355424d;
                } catch (RemoteException e12) {
                    this.f354523e.zzj().f354889f.c("Failed to get trigger URIs; remote exception", e12);
                }
                if (l12 == null) {
                    c36996w4.zzj().f354889f.b("Failed to get trigger URIs; not connected to service");
                    return;
                }
                this.f354520b.set(l12.m(this.f354522d, this.f354521c));
                this.f354523e.O();
                this.f354520b.notify();
            } finally {
                this.f354520b.notify();
            }
        }
    }
}
