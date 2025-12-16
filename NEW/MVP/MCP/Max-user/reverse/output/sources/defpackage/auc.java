package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class auc extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ buc Y;
    public final /* synthetic */ File Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auc(buc bucVar, File file, Continuation continuation) {
        super(2, continuation);
        this.Y = bucVar;
        this.Z = file;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((auc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        auc aucVar = new auc(this.Y, this.Z, continuation);
        aucVar.X = obj;
        return aucVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objI;
        Object ipdVar;
        int i = this.o;
        buc bucVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            vxd vxdVar = bucVar.c;
            this.X = f84Var;
            this.o = 1;
            vxdVar.getClass();
            objI = svi.i(bia.a.plus(vxdVar.b), new uxd(this.Z, vxdVar, null), this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objI = obj;
        }
        Uri uri = (Uri) objI;
        qqg qqgVar = qqg.a;
        if (uri == null) {
            return qqgVar;
        }
        try {
            ipdVar = bucVar.Y.h(uri.toString());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        vah vahVar = (vah) (ipdVar instanceof ipd ? null : ipdVar);
        pd8 pd8Var = new pd8(3, uri.toString().hashCode(), uri.toString(), vahVar != null ? vahVar.a : uri.toString(), 0, 0L, "video/mp4", 0L, null);
        xfh.r(bucVar.w0, new otc(pd8Var, bucVar.d.f.r(pd8Var)));
        return qqgVar;
    }
}
