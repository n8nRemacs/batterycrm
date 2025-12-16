package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o4g extends dtf implements sm6 {
    public final /* synthetic */ cie o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4g(cie cieVar, Continuation continuation) {
        super(2, continuation);
        this.o = cieVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        o4g o4gVar = (o4g) l((yeb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        o4gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o4g(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        lg8 lg8Var = lg8.d;
        g8j.b(obj);
        String str = (String) this.o.f;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "Theme changed: updating cached layouts", null);
        }
        cie cieVar = this.o;
        ((t4g) ((bwf) cieVar.h).getValue()).evictAll();
        int i = a93.s0.x(((pc2) cieVar.c).a).k().getText().g;
        Map mapSnapshot = cieVar.b().snapshot();
        int i2 = 0;
        if (mapSnapshot != null) {
            Iterator it = mapSnapshot.entrySet().iterator();
            while (it.hasNext()) {
                u4g u4gVar = (u4g) ((Map.Entry) it.next()).getValue();
                u4gVar.a.a().getPaint().setColor(i);
                f5g f5gVar = u4gVar.a;
                f5g f5gVar2 = u4gVar.b;
                if (f5gVar != f5gVar2) {
                    f5gVar2.a().getPaint().setColor(i);
                }
                i2++;
            }
        }
        if (i2 > 0) {
            String str2 = (String) cieVar.f;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str2, wy1.e(i2, "Theme changed: updated color in ", " cached layouts"), null);
            }
        }
        return qqg.a;
    }
}
