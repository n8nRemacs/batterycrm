package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iye extends dtf implements sm6 {
    public final /* synthetic */ lye o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iye(lye lyeVar, Continuation continuation) {
        super(2, continuation);
        this.o = lyeVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iye) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new iye(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        k18 k18Var = this.o.d;
        return tfi.o(pwc.ic_geolocation_filled_28, ctd.f(a93.s0, (Context) k18Var.getValue()).k, (Context) k18Var.getValue());
    }
}
