package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pxf extends dtf implements sm6 {
    public final /* synthetic */ vxf X;
    public /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxf(vxf vxfVar, Continuation continuation) {
        super(2, continuation);
        this.X = vxfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pxf pxfVar = (pxf) l(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pxfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pxf pxfVar = new pxf(this.X, continuation);
        pxfVar.o = ((Number) obj).longValue();
        return pxfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        vxf vxfVar = this.X;
        g8j.b(obj);
        long j = this.o;
        try {
            if (j != -1) {
                j94 j94VarD = vxfVar.d();
                String strValueOf = String.valueOf(j);
                ((mq) j94VarD).getClass();
                if (((feg) mq.c.getValue()) != null) {
                    try {
                        pje pjeVar = feg.e;
                        if (pjeVar == null) {
                            pjeVar = null;
                        }
                        pjeVar.getClass();
                        pjeVar.f(Collections.singletonMap("userId", strValueOf));
                    } catch (Exception unused) {
                    }
                }
                j94 j94VarD2 = vxfVar.d();
                String strValueOf2 = String.valueOf(((int) j) & 255);
                ((mq) j94VarD2).getClass();
                if (((feg) mq.c.getValue()) != null) {
                    feg fegVar = feg.a;
                    Map mapSingletonMap = Collections.singletonMap("p", strValueOf2);
                    if (!feg.b) {
                        uyf uyfVar = feg.f;
                        (uyfVar != null ? uyfVar : null).c(mapSingletonMap);
                    }
                }
            } else {
                ((mq) vxfVar.d()).getClass();
                if (((feg) mq.c.getValue()) != null) {
                    pje pjeVar2 = feg.e;
                    if (pjeVar2 == null) {
                        pjeVar2 = null;
                    }
                    pjeVar2.getClass();
                    pjeVar2.f(Collections.singletonMap("userId", null));
                }
            }
        } catch (Exception unused2) {
        }
        return qqg.a;
    }
}
