package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cd6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gd6 Y;
    public final /* synthetic */ k18 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd6(gd6 gd6Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gd6Var;
        this.Z = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cd6) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cd6 cd6Var = new cd6(this.Y, this.Z, continuation);
        cd6Var.X = obj;
        return cd6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        xs xsVar;
        ArrayList arrayList;
        gd6 gd6Var = this.Y;
        tcf tcfVar = gd6Var.w0;
        tcf tcfVar2 = gd6Var.Z;
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            List<f86> list = (List) this.X;
            int size = list.size();
            g84 g84Var = g84.a;
            if (size == 1 && fni.a(((f86) ue3.G(list)).a, "all.chat.folder")) {
                this.o = 1;
                tcfVar2.m(null, hd5.a);
                if (qqgVar != g84Var) {
                    return qqgVar;
                }
            } else {
                xs xsVar2 = new xs((Collection) tcfVar.getValue());
                ArrayList arrayList2 = new ArrayList(we3.q(list, 10));
                for (f86 f86Var : list) {
                    String str = f86Var.a;
                    if (fni.a(str, "all.chat.folder")) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        if (f86Var.o.contains(new Long(gd6Var.b))) {
                            xsVar2.add(str);
                        }
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(new fxg(f86Var, fni.a(str, "all.chat.folder") ? exg.a : exg.b, new r5g(((e7b) this.Z.getValue()).a(f86Var.b, f86Var.X, 2, false, 0, true, false))));
                }
                if (((Set) gd6Var.v0.get()) == null) {
                    gd6Var.v0.updateAndGet(new j11(list, 1, gd6Var));
                }
                this.X = xsVar2;
                this.o = 2;
                tcfVar2.m(null, arrayList2);
                if (qqgVar != g84Var) {
                    xsVar = xsVar2;
                }
            }
            return g84Var;
        }
        if (i == 1) {
            g8j.b(obj);
            return qqgVar;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xsVar = (xs) this.X;
        g8j.b(obj);
        tcfVar.setValue(xsVar);
        return qqgVar;
    }
}
