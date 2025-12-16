package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ilc extends dtf implements sm6 {
    public final /* synthetic */ wac X;
    public final /* synthetic */ klc Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilc(wac wacVar, klc klcVar, Continuation continuation) {
        super(2, continuation);
        this.X = wacVar;
        this.Y = klcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ilc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ilc(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ghc ghcVar;
        int i = this.o;
        wac wacVar = this.X;
        klc klcVar = this.Y;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            gx3 gx3Var = wacVar.a;
            if (gx3Var != null) {
                l24 l24Var = (l24) klcVar.b.getValue();
                List listSingletonList = Collections.singletonList(gx3Var);
                this.o = 1;
                if (l24Var.f(listSingletonList, yv3.a, this) != g84Var) {
                }
                return g84Var;
            }
            return qqgVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        gx3 gx3Var2 = wacVar.a;
        if (gx3Var2 != null) {
            long j = gx3Var2.a;
            LinkedHashMap linkedHashMap = wacVar.b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(to8.i(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), new epd(((fpd) entry.getValue()).a));
            }
            ghcVar = new ghc(0L, j, new py0(linkedHashMap2, 29, wacVar.c));
        } else {
            ghcVar = null;
        }
        if (ghcVar != null) {
            jdc jdcVar = klcVar.a;
            this.o = 2;
            if (k7j.b((lrd) jdcVar.b, new ci(jdcVar, 27, ghcVar), this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
