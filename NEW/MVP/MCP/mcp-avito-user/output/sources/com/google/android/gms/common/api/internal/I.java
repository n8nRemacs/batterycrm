package com.google.android.gms.common.api.internal;

import androidx.collection.C20203c;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class I extends w1 {

    /* renamed from: g, reason: collision with root package name */
    public final C20203c f349011g;

    /* renamed from: h, reason: collision with root package name */
    public final C36646i f349012h;

    @j.k0
    public I(InterfaceC36656m interfaceC36656m, C36646i c36646i, C36687f c36687f) {
        super(interfaceC36656m, c36687f);
        this.f349011g = new C20203c();
        this.f349012h = c36646i;
        interfaceC36656m.u1("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        if (this.f349011g.isEmpty()) {
            return;
        }
        this.f349012h.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.f349245c = true;
        if (this.f349011g.isEmpty()) {
            return;
        }
        this.f349012h.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.f349245c = false;
        C36646i c36646i = this.f349012h;
        c36646i.getClass();
        synchronized (C36646i.f349119s) {
            try {
                if (c36646i.f349131l == this) {
                    c36646i.f349131l = null;
                    c36646i.f349132m.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w1
    public final void k(ConnectionResult connectionResult, int i12) {
        this.f349012h.j(connectionResult, i12);
    }

    @Override // com.google.android.gms.common.api.internal.w1
    public final void l() {
        zau zauVar = this.f349012h.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(3));
    }
}
