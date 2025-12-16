package defpackage;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pme extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tme Y;
    public final /* synthetic */ String Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pme(tme tmeVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = tmeVar;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pme) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pme pmeVar = new pme(this.Y, this.Z, continuation);
        pmeVar.X = obj;
        return pmeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        tme tmeVar = this.Y;
        ConcurrentHashMap concurrentHashMap = tmeVar.v0;
        int i = this.o;
        qqg qqgVar = qqg.a;
        String str = this.Z;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            File file = (File) concurrentHashMap.get(str);
            if (file == null) {
                wqi.q(f84Var.getClass().getName(), "Removing ringtone file not found", new Object[0]);
                return qqgVar;
            }
            nqd nqdVar = tmeVar.b.c;
            kqd kqdVar = nqdVar instanceof kqd ? (kqd) nqdVar : null;
            if (fni.a(kqdVar != null ? kqdVar.a : null, file.getAbsolutePath())) {
                tmeVar.y(lqd.a);
            }
            tmeVar.v().j();
            prd prdVar = new prd(14, file);
            this.o = 1;
            if (vmi.i(bd5.a, prdVar, this) != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        concurrentHashMap.remove(str);
        this.o = 2;
        return tme.t(tmeVar, this) == g84Var ? g84Var : qqgVar;
    }
}
