package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;
import j.InterfaceC42151g;
import jY0.BinderC42328c;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class W extends BinderC42328c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f349063a;

    public W(C36626b0 c36626b0) {
        this.f349063a = new WeakReference(c36626b0);
    }

    @Override // jY0.BinderC42328c, jY0.InterfaceC42330e
    @InterfaceC42151g
    public final void T0(zak zakVar) {
        C36626b0 c36626b0 = (C36626b0) this.f349063a.get();
        if (c36626b0 == null) {
            return;
        }
        V v12 = new V(c36626b0, c36626b0, zakVar);
        HandlerC36659n0 handlerC36659n0 = c36626b0.f349077a.f349193r;
        handlerC36659n0.sendMessage(handlerC36659n0.obtainMessage(1, v12));
    }
}
