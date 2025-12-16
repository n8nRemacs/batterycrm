package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ii7 extends dtf implements sm6 {
    public final /* synthetic */ ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii7(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.o = arrayList;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ii7 ii7Var = (ii7) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ii7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ii7(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ArrayList arrayList = this.o;
        if (arrayList.size() > 1) {
            ze3.s(new vs6(3), arrayList);
        }
        return qqg.a;
    }
}
