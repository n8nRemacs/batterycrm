package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* loaded from: classes2.dex */
public final class t5e extends dtf implements sm6 {
    public final /* synthetic */ SearchMessageBottomWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5e(SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.X = searchMessageBottomWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        t5e t5eVar = (t5e) l((ei4) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        t5eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        t5e t5eVar = new t5e(this.X, continuation);
        t5eVar.o = obj;
        return t5eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        k6e.c.s0((ei4) this.o);
        return qqg.a;
    }
}
