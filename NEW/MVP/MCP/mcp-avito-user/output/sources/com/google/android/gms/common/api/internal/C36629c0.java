package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.C36634e;
import java.util.Collections;
import java.util.Iterator;
import r61.InterfaceC47501c;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36629c0 implements InterfaceC36655l0 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC47501c
    public final C36661o0 f349103a;

    public C36629c0(C36661o0 c36661o0) {
        this.f349103a = c36661o0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void c() {
        C36661o0 c36661o0 = this.f349103a;
        Iterator it = c36661o0.f349194s.values().iterator();
        while (it.hasNext()) {
            ((C36616a.f) it.next()).disconnect();
        }
        c36661o0.f349201z.f349161p = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void d() {
        C36661o0 c36661o0 = this.f349103a;
        c36661o0.f349189a.lock();
        try {
            c36661o0.f349199x = new C36626b0(c36661o0, c36661o0.f349196u, c36661o0.f349197v, c36661o0.f349192q, c36661o0.f349198w, c36661o0.f349189a, c36661o0.f349191p);
            c36661o0.f349199x.c();
            c36661o0.f349190b.signalAll();
        } finally {
            c36661o0.f349189a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final C36634e.a f(C36634e.a aVar) {
        this.f349103a.f349201z.f349153h.add(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final C36634e.a h(C36634e.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void a(@j.P Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void e(int i12) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void b(ConnectionResult connectionResult, C36616a c36616a, boolean z12) {
    }
}
