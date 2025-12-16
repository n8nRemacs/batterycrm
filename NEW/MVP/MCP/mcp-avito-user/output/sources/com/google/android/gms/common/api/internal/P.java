package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.C36729v;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class P implements AbstractC36699e.c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f349044a;

    /* renamed from: b, reason: collision with root package name */
    public final C36616a f349045b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f349046c;

    public P(C36626b0 c36626b0, C36616a c36616a, boolean z12) {
        this.f349044a = new WeakReference(c36626b0);
        this.f349045b = c36616a;
        this.f349046c = z12;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.c
    public final void a(@j.N ConnectionResult connectionResult) {
        C36626b0 c36626b0 = (C36626b0) this.f349044a.get();
        if (c36626b0 == null) {
            return;
        }
        C36729v.l("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c36626b0.f349077a.f349201z.f349152g);
        ReentrantLock reentrantLock = c36626b0.f349078b;
        reentrantLock.lock();
        try {
            if (c36626b0.o(0)) {
                if (!connectionResult.i()) {
                    c36626b0.m(connectionResult, this.f349045b, this.f349046c);
                }
                if (c36626b0.p()) {
                    c36626b0.n();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
