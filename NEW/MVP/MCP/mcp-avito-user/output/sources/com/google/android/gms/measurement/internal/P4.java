package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class P4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzo f354850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354851f;

    public P4(C36996w4 c36996w4, AtomicReference atomicReference, String str, String str2, zzo zzoVar) {
        this.f354847b = atomicReference;
        this.f354848c = str;
        this.f354849d = str2;
        this.f354850e = zzoVar;
        this.f354851f = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4 c36996w4;
        L1 l12;
        synchronized (this.f354847b) {
            try {
                try {
                    c36996w4 = this.f354851f;
                    l12 = c36996w4.f355424d;
                } catch (RemoteException e12) {
                    this.f354851f.zzj().f354889f.d("(legacy) Failed to get conditional properties; remote exception", null, this.f354848c, e12);
                    this.f354847b.set(Collections.emptyList());
                }
                if (l12 == null) {
                    c36996w4.zzj().f354889f.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f354848c, this.f354849d);
                    this.f354847b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    this.f354847b.set(l12.S1(this.f354848c, this.f354849d, this.f354850e));
                } else {
                    this.f354847b.set(l12.c2(null, this.f354848c, this.f354849d));
                }
                this.f354851f.O();
                this.f354847b.notify();
            } finally {
                this.f354847b.notify();
            }
        }
    }
}
