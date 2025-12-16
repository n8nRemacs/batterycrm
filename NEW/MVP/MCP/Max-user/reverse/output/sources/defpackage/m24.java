package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class m24 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ q24 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m24(q24 q24Var, String str, Continuation continuation) {
        super(2, continuation);
        this.o = q24Var;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((m24) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new m24(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        dv6 dv6Var;
        g8j.b(obj);
        te8 te8Var = this.o.c;
        List<jqc> list = (List) ((zm8) ((k18) te8Var.a).getValue()).d(this.X).e();
        ArrayList arrayList = new ArrayList();
        for (jqc jqcVar : list) {
            Context context = (Context) te8Var.c;
            rt5 rt5Var = (rt5) ((k18) te8Var.b).getValue();
            List list2 = jqcVar.b;
            r04 r04Var = jqcVar.c;
            if (r04Var == null) {
                dv6Var = null;
            } else {
                gx3 gx3Var = r04Var.a;
                uv1 uv1Var = new uv1((f7b) l14.a.getAccessor().c(HttpStatus.SC_GONE), jqcVar, context, 3);
                String strA = gx3Var.a();
                List list3 = gx3Var.t0;
                f7c f7cVarA = (strA == null || strA.length() == 0) ? f7c.a() : (f7c) uv1Var.invoke(gx3Var.a());
                String strB = m6g.b(gx3Var.v0);
                gu5 gu5Var = (gu5) rt5Var;
                gu5Var.getClass();
                f7c f7cVar = (gu5Var.j(PmsKey.f116officialbotnamingenabled, false) && gx3Var.f()) ? new f7c(context.getString(mvd.C), new String[0]) : (gx3Var.e() && list3.contains(fx3.SERVICE_ACCOUNT)) ? new f7c(context.getString(mvd.R1), new String[0]) : gx3Var.e() ? new f7c(context.getString(mvd.n), new String[0]) : !y4e.a.i().d(strB, list2).isEmpty() ? (f7c) uv1Var.invoke(strB) : f7c.a();
                po8.j(r04Var.d);
                long j = gx3Var.a;
                String strA2 = gx3Var.a();
                if (strA2 == null) {
                    strA2 = "";
                }
                dv6Var = new dv6(j, strA2, f7cVarA, f7cVar, list3.contains(fx3.OFFICIAL), tfi.g(gx3Var.d(il0.c)), gx3Var, list2);
            }
            if (dv6Var != null) {
                arrayList.add(dv6Var);
            }
        }
        return arrayList;
    }
}
