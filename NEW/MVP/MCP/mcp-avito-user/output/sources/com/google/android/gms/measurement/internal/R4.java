package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class R4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354878c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzo f354880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f354881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354882g;

    public R4(C36996w4 c36996w4, AtomicReference atomicReference, String str, String str2, zzo zzoVar, boolean z12) {
        this.f354877b = atomicReference;
        this.f354878c = str;
        this.f354879d = str2;
        this.f354880e = zzoVar;
        this.f354881f = z12;
        this.f354882g = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4 c36996w4;
        L1 l12;
        synchronized (this.f354877b) {
            try {
                try {
                    c36996w4 = this.f354882g;
                    l12 = c36996w4.f355424d;
                } catch (RemoteException e12) {
                    this.f354882g.zzj().f354889f.d("(legacy) Failed to get user properties; remote exception", null, this.f354878c, e12);
                    this.f354877b.set(Collections.emptyList());
                }
                if (l12 == null) {
                    c36996w4.zzj().f354889f.d("(legacy) Failed to get user properties; not connected to service", null, this.f354878c, this.f354879d);
                    this.f354877b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    this.f354877b.set(l12.W3(this.f354878c, this.f354879d, this.f354881f, this.f354880e));
                } else {
                    this.f354877b.set(l12.x(null, this.f354878c, this.f354879d, this.f354881f));
                }
                this.f354882g.O();
                this.f354877b.notify();
            } finally {
                this.f354877b.notify();
            }
        }
    }
}
