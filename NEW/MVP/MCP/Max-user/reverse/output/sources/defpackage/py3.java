package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class py3 extends dtf implements sm6 {
    public final /* synthetic */ zy3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py3(zy3 zy3Var, Continuation continuation) {
        super(2, continuation);
        this.o = zy3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        py3 py3Var = (py3) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        py3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new py3(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        zy3 zy3Var = this.o;
        l5c l5cVar = (l5c) ((age) zy3Var.y0.getValue());
        l5cVar.getClass();
        int i = l5cVar.j(PmsKey.f1accountnicknameenabled, false) ? v1b.n : v1b.m;
        tcf tcfVar = zy3Var.H0;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new n5g(i)));
        return qqg.a;
    }
}
