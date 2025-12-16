package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.internal.C36729v;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class N implements InterfaceC36655l0 {

    /* renamed from: a, reason: collision with root package name */
    public final C36661o0 f349036a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f349037b = false;

    public N(C36661o0 c36661o0) {
        this.f349036a = c36661o0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void d() {
        if (this.f349037b) {
            this.f349037b = false;
            M m12 = new M(this, this);
            HandlerC36659n0 handlerC36659n0 = this.f349036a.f349193r;
            handlerC36659n0.sendMessage(handlerC36659n0.obtainMessage(1, m12));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void e(int i12) {
        C36661o0 c36661o0 = this.f349036a;
        c36661o0.j();
        c36661o0.f349188A.a(i12, this.f349037b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final C36634e.a f(C36634e.a aVar) {
        h(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final boolean g() {
        if (this.f349037b) {
            return false;
        }
        C36661o0 c36661o0 = this.f349036a;
        HashSet hashSet = c36661o0.f349201z.f349168w;
        if (hashSet == null || hashSet.isEmpty()) {
            c36661o0.j();
            return true;
        }
        this.f349037b = true;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C36648i1) it.next()).getClass();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final C36634e.a h(C36634e.a aVar) {
        C36661o0 c36661o0 = this.f349036a;
        try {
            k1 k1Var = c36661o0.f349201z.f349169x;
            k1Var.f349172a.add(aVar);
            aVar.zan(k1Var.f349173b);
            C36653k0 c36653k0 = c36661o0.f349201z;
            C36616a.f fVar = (C36616a.f) c36653k0.f349160o.get(aVar.getClientKey());
            C36729v.k(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !c36661o0.f349195t.containsKey(aVar.getClientKey())) {
                aVar.run(fVar);
            } else {
                aVar.setFailedResult(new Status(17, null, null, null));
            }
        } catch (DeadObjectException unused) {
            L l12 = new L(this, this);
            HandlerC36659n0 handlerC36659n0 = c36661o0.f349193r;
            handlerC36659n0.sendMessage(handlerC36659n0.obtainMessage(1, l12));
        }
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void c() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void a(@j.P Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void b(ConnectionResult connectionResult, C36616a c36616a, boolean z12) {
    }
}
