package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oxb extends dtf implements sm6 {
    public final /* synthetic */ wxb X;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxb(Object obj, Continuation continuation, wxb wxbVar) {
        super(2, continuation);
        this.o = obj;
        this.X = wxbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oxb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new oxb(this.o, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        u6e u6eVar = (u6e) this.o;
        int i = u6eVar.a;
        wxb wxbVar = this.X;
        return i == 4 ? ((myb) wxbVar.t0.getValue()).a(u6eVar.o) : wxb.t(wxbVar, ((e23) wxbVar.s0.a).a(u6eVar.d));
    }
}
