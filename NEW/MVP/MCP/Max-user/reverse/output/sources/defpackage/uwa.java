package defpackage;

import android.text.TextPaint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uwa extends dtf implements sm6 {
    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uwa uwaVar = (uwa) l((yeb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uwaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uwa(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gr9 gr9Var = (gr9) y4e.a.getAccessor().c(439);
        ((fr9) gr9Var.i.getValue()).i(-1);
        yk8 yk8VarE = gr9Var.e();
        yk8VarE.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (yk8VarE.c) {
            for (Map.Entry entry : ((LinkedHashMap) yk8VarE.b.b).entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            ar9 ar9Var = (ar9) entry2.getKey();
            j18 j18Var = (j18) entry2.getValue();
            pm9 pm9Var = j18Var.a;
            pm9 pm9Var2 = j18Var.b;
            TextPaint paint = pm9Var.a().getPaint();
            eu0 eu0VarD = gr9Var.d();
            boolean zD = pm9Var.b.d();
            v1a v1aVar = a93.s0;
            paint.setColor(v1aVar.x(((dza) eu0VarD).a).k().a().h(zD).d.e);
            j18 j18Var2 = (j18) gr9Var.e().c(ar9Var);
            if (j18Var2 != null) {
                j18Var2.a.b(pm9Var.a());
            }
            if (pm9Var != pm9Var2) {
                TextPaint paint2 = pm9Var2.a().getPaint();
                eu0 eu0VarD2 = gr9Var.d();
                paint2.setColor(v1aVar.x(((dza) eu0VarD2).a).k().a().h(pm9Var2.b.d()).d.e);
                j18 j18Var3 = (j18) gr9Var.e().c(ar9Var);
                if (j18Var3 != null) {
                    j18Var3.b.b(pm9Var2.a());
                }
            }
        }
        return qqg.a;
    }
}
