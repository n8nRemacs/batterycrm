package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public final /* synthetic */ s85 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw3(tw3 tw3Var, s85 s85Var, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
        this.Y = s85Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rw3(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        o04 o04Var = (o04) this.X.v.getValue();
        long j = this.X.n;
        String str = this.Y.c;
        String string = str != null ? vmf.c0(uog.j(str)).toString() : null;
        String str2 = this.Y.f;
        String string2 = str2 != null ? vmf.c0(uog.j(str2)).toString() : null;
        this.o = 1;
        String name = o04.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            o04Var.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, a9h.e("rename, id = ", j, " => ", wqi.a() ? u45.k(string, " ", string2) : "***** *****"), null);
            }
        }
        ku3 ku3VarI = ((qv3) o04Var.a.getValue()).i(j, false);
        if (ku3VarI != null) {
            tv3 tv3Var = (tv3) ue3.I(ku3VarI.k());
            ((qv3) o04Var.a.getValue()).c(j, new lv3(string, string2, 1));
            ((tw0) o04Var.d.getValue()).c(new t24(j));
            hwa hwaVar = (hwa) o04Var.c.getValue();
            hwa.r(hwaVar, new y04(5, hwaVar.t().a.k(), j, tv3Var != null ? tv3Var.a : null, tv3Var != null ? tv3Var.b : null, string, string2));
            ((jzf) o04Var.b.getValue()).f(Collections.singletonList(new Long(j)));
            ((tw0) o04Var.d.getValue()).c(new t24(j));
        }
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
