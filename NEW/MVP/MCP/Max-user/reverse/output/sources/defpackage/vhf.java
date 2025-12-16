package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vhf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ whf Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhf(String str, whf whfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = whfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vhf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vhf vhfVar = new vhf(this.Y, this.Z, continuation);
        vhfVar.X = obj;
        return vhfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        vhf vhfVar;
        f84 f84Var;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.X;
            String str = this.Y;
            if (str == null || str.length() == 0) {
                this.Z.u0.updateAndGet(new lk2(12));
                this.Z.X.m(null, new f7e(2, (List) this.Z.t0.get()));
                return qqgVar;
            }
            this.Z.u0.updateAndGet(new uhf(this.Y, 0));
            ehf ehfVar = (ehf) this.Z.d.getValue();
            String str2 = this.Y;
            this.X = f84Var2;
            this.o = 1;
            vhfVar = this;
            Object objB = ehfVar.b(str2, 0L, 50, vhfVar);
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
            vhfVar = this;
        }
        zgf zgfVar = (zgf) obj;
        vhfVar.Z.u0.updateAndGet(new shf(zgfVar, 1));
        String name = f84Var.getClass().getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "Stickers search. finish, size:" + zgfVar.a.size() + "|marker:" + zgfVar.b, null);
            }
        }
        List list = zgfVar.a;
        whf whfVar = vhfVar.Z;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(whf.t(whfVar, (jef) it.next()));
        }
        vhfVar.Z.X.m(null, new f7e(arrayList.isEmpty() ? 3 : 2, arrayList));
        return qqgVar;
    }
}
