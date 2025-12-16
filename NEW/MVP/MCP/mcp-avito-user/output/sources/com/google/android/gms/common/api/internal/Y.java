package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36729v;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class Y implements i.b, i.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36626b0 f349065a;

    public /* synthetic */ Y(C36626b0 c36626b0, X x12) {
        this.f349065a = c36626b0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnected(@j.P Bundle bundle) {
        C36626b0 c36626b0 = this.f349065a;
        C36729v.j(c36626b0.f349094r);
        com.google.android.gms.signin.f fVar = c36626b0.f349087k;
        C36729v.j(fVar);
        fVar.d(new W(c36626b0));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36664q
    public final void onConnectionFailed(@j.N ConnectionResult connectionResult) {
        C36626b0 c36626b0 = this.f349065a;
        ReentrantLock reentrantLock = c36626b0.f349078b;
        ReentrantLock reentrantLock2 = c36626b0.f349078b;
        reentrantLock.lock();
        try {
            if (c36626b0.f349088l && !connectionResult.h()) {
                c36626b0.i();
                c36626b0.n();
            } else {
                c36626b0.l(connectionResult);
            }
            reentrantLock2.unlock();
        } catch (Throwable th2) {
            reentrantLock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnectionSuspended(int i12) {
    }
}
