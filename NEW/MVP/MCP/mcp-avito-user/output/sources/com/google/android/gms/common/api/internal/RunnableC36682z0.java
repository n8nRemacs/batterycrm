package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.InterfaceC36717n;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36682z0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f349252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0 f349253c;

    public RunnableC36682z0(A0 a02, ConnectionResult connectionResult) {
        this.f349253c = a02;
        this.f349252b = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC36717n interfaceC36717n;
        A0 a02 = this.f349253c;
        C36676w0 c36676w0 = (C36676w0) a02.f348961f.f349130k.get(a02.f348957b);
        if (c36676w0 == null) {
            return;
        }
        ConnectionResult connectionResult = this.f349252b;
        if (!connectionResult.i()) {
            c36676w0.n(connectionResult, null);
            return;
        }
        a02.f348960e = true;
        C36616a.f fVar = a02.f348956a;
        if (fVar.requiresSignIn()) {
            if (!a02.f348960e || (interfaceC36717n = a02.f348958c) == null) {
                return;
            }
            fVar.getRemoteService(interfaceC36717n, a02.f348959d);
            return;
        }
        try {
            fVar.getRemoteService(null, fVar.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException unused) {
            fVar.disconnect("Failed to get service from broker.");
            c36676w0.n(new ConnectionResult(10), null);
        }
    }
}
