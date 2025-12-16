package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class thf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ whf Y;
    public final /* synthetic */ rhf Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thf(whf whfVar, rhf rhfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = whfVar;
        this.Z = rhfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((thf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        thf thfVar = new thf(this.Y, this.Z, continuation);
        thfVar.X = obj;
        return thfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        thf thfVar;
        f84 f84Var;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.X;
            ehf ehfVar = (ehf) this.Y.d.getValue();
            rhf rhfVar = this.Z;
            String str = rhfVar.a;
            long j = rhfVar.b;
            this.X = f84Var2;
            this.o = 1;
            thfVar = this;
            Object objB = ehfVar.b(str, j, 50, thfVar);
            if (objB == g84Var) {
                return g84Var;
            }
            f84Var = f84Var2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
            thfVar = this;
        }
        zgf zgfVar = (zgf) obj;
        thfVar.Y.u0.updateAndGet(new shf(zgfVar, 0));
        String name = f84Var.getClass().getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "Stickers search next page. finish, size:" + zgfVar.a.size() + "|marker:" + zgfVar.b, null);
            }
        }
        List list = zgfVar.a;
        whf whfVar = thfVar.Y;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(whf.t(whfVar, (jef) it.next()));
        }
        thfVar.Y.X.m(null, new f7e(2, ue3.T(((f7e) thfVar.Y.X.getValue()).b, arrayList)));
        return qqg.a;
    }
}
