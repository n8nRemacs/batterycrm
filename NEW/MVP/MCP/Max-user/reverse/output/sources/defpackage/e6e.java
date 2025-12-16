package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.search.usecase.InvalidSearchResultMarkerException;

/* loaded from: classes2.dex */
public final class e6e extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public String o;
    public final /* synthetic */ h6e s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ String u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6e(int i, h6e h6eVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = h6eVar;
        this.t0 = i;
        this.u0 = str2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e6e) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e6e e6eVar = new e6e(this.t0, this.s0, this.Z, this.u0, continuation);
        e6eVar.Y = obj;
        return e6eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        z26 z26Var;
        Object objF;
        List list;
        String str;
        int i = this.X;
        h6e h6eVar = this.s0;
        qqg qqgVar = qqg.a;
        String str2 = this.Z;
        String str3 = null;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            z26Var = (z26) this.Y;
            if (str2 == null || vmf.F(str2)) {
                y6e y6eVar = new y6e(hd5.a, null);
                this.X = 1;
                if (z26Var.a(y6eVar, this) != g84Var) {
                    return qqgVar;
                }
            } else {
                long j = i6e.a;
                d6e d6eVar = new d6e(this.t0, h6eVar, this.Z, this.u0, null);
                this.Y = z26Var;
                this.X = 2;
                objF = yei.f(s8j.f(j), d6eVar, this);
                if (objF != g84Var) {
                }
            }
            return g84Var;
        }
        if (i == 1) {
            g8j.b(obj);
            return qqgVar;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.o;
            list = (List) this.Y;
            g8j.b(obj);
            wqi.c("h6e", "search messages done " + list.size() + " for " + str2 + " / " + str, new Object[0]);
            return qqgVar;
        }
        z26Var = (z26) this.Y;
        g8j.b(obj);
        objF = obj;
        ay2 ay2Var = (ay2) objF;
        List<gm9> list2 = ay2Var.c;
        ArrayList arrayList = new ArrayList(we3.q(list2, 10));
        for (gm9 gm9Var : list2) {
            arrayList.add(u6e.c(gm9Var.b, gm9Var.a, gm9Var.c, gm9Var.d));
        }
        String str4 = ay2Var.o;
        if (str4 == null || !str4.equals("0")) {
            str3 = ay2Var.o;
        } else {
            ((j94) h6eVar.b.getValue()).a("ONEME-21055", new InvalidSearchResultMarkerException(ay2Var.o));
        }
        y6e y6eVar2 = new y6e(arrayList, str3);
        this.Y = arrayList;
        this.o = str3;
        this.X = 3;
        if (z26Var.a(y6eVar2, this) != g84Var) {
            list = arrayList;
            str = str3;
            wqi.c("h6e", "search messages done " + list.size() + " for " + str2 + " / " + str, new Object[0]);
            return qqgVar;
        }
        return g84Var;
    }
}
