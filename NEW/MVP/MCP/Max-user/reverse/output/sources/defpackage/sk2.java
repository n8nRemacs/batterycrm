package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sk2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k10 Y;
    public final /* synthetic */ yk2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk2(k10 k10Var, yk2 yk2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k10Var;
        this.Z = yk2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sk2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sk2 sk2Var = new sk2(this.Y, this.Z, continuation);
        sk2Var.X = obj;
        return sk2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String strA;
        f84 f84Var;
        k10 k10Var = this.Y;
        boolean z = k10Var.o;
        yk2 yk2Var = this.Z;
        jve jveVar = yk2Var.u0;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.X;
            if (z) {
                String str = k10Var.a;
                strA = null;
                if (!l8g.c(str) && !l8g.c(str)) {
                    strA = az1.i(str, "&fn=legacy_44");
                }
            } else {
                strA = k10Var.a();
            }
            sxd sxdVar = yk2Var.d;
            this.X = f84Var2;
            this.o = 1;
            Object objC = sxd.c(sxdVar, strA, z, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
            f84Var = f84Var2;
            obj = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
        }
        Uri uri = (Uri) obj;
        jk2 jk2Var = (jk2) yk2Var.z0.getAndUpdate(new lk2(0));
        boolean zF = d7j.f(f84Var);
        qqg qqgVar = qqg.a;
        if (zF) {
            if (uri != null && jk2Var != null) {
                jveVar.h(new t05(uri, jk2Var.d));
                return qqgVar;
            }
            if (uri == null && jk2Var != null) {
                jveVar.h(new s05(yk2.y(jk2Var.d, false)));
            }
        }
        return qqgVar;
    }
}
