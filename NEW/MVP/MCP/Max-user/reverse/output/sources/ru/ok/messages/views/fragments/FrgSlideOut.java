package ru.ok.messages.views.fragments;

import defpackage.d6;
import defpackage.k4f;
import defpackage.ql6;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public abstract class FrgSlideOut extends FrgBase implements k4f {
    public boolean u1 = true;

    public final ql6 B0() {
        if (u0() != null) {
            return (ql6) u0();
        }
        return null;
    }

    public boolean a() {
        return true;
    }

    public void m(int i) {
        if (u0() == null) {
            return;
        }
        t().finish();
        t().overridePendingTransition(0, 0);
    }

    public void o() {
        ql6 ql6VarB0 = B0();
        if (ql6VarB0 == null) {
            return;
        }
        ActLocalMedias actLocalMedias = (ActLocalMedias) ql6VarB0;
        this.u1 = actLocalMedias.X0;
        actLocalMedias.V(false, true);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public void x0(d6 d6Var) {
        this.j1 = false;
        if (!(d6Var instanceof ql6)) {
            throw new RuntimeException("Parent activity must implement FrgSlideOut.Listener interface");
        }
    }
}
