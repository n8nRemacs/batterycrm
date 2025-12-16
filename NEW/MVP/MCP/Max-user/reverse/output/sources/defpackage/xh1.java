package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xh1 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ ci1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh1(ci1 ci1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.o = ci1Var;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xh1 xh1Var = (xh1) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xh1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xh1(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ci1 ci1Var = this.o;
        k18 k18Var = ci1Var.Z;
        String str = this.X;
        ci1Var.x0 = str;
        onb onbVar = (onb) ((dob) ci1Var.d).z0.getValue();
        if (vmf.F(str)) {
            o98 o98VarD = ve3.d();
            o98VarD.add(onbVar.a);
            o98VarD.addAll(onbVar.c.values());
            ci1.t(ci1Var, ve3.a(o98VarD), onbVar.g);
        } else {
            o98 o98VarD2 = ve3.d();
            if (((o7e) k18Var.getValue()).i(onbVar.a.b.getName(), str)) {
                o98VarD2.add(onbVar.a);
            }
            Collection collectionValues = onbVar.c.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (((o7e) k18Var.getValue()).i(((cnb) obj2).b.getName(), str)) {
                    arrayList.add(obj2);
                }
            }
            o98VarD2.addAll(arrayList);
            ci1.t(ci1Var, ve3.a(o98VarD2), onbVar.g);
        }
        return qqg.a;
    }
}
