package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p39 extends dtf implements sm6 {
    public String X;
    public int Y;
    public final /* synthetic */ r39 Z;
    public File o;
    public final /* synthetic */ vd8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p39(r39 r39Var, vd8 vd8Var, Continuation continuation) {
        super(2, continuation);
        this.Z = r39Var;
        this.s0 = vd8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p39) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p39(this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        File fileP;
        String absolutePath;
        File file;
        String str;
        r39 r39Var = this.Z;
        k18 k18Var = r39Var.Y;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            fileP = ((iz5) ((qx5) r39Var.X.getValue())).p(String.valueOf(System.currentTimeMillis()));
            Uri uriG = tfi.g(this.s0.b.toString());
            absolutePath = fileP.getAbsolutePath();
            if (uriG != null) {
                this.o = fileP;
                this.X = absolutePath;
                this.Y = 1;
                Object objT = r39.t(r39Var, fileP, uriG, this);
                g84 g84Var = g84.a;
                if (objT == g84Var) {
                    return g84Var;
                }
                file = fileP;
                str = absolutePath;
            }
            xfh.r(r39Var.v0, new d39(Uri.fromFile(fileP).toString(), absolutePath));
            return qqg.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = this.X;
        file = this.o;
        g8j.b(obj);
        tfi.k((age) k18Var.getValue(), str, str);
        tfi.j((age) k18Var.getValue(), str);
        absolutePath = str;
        fileP = file;
        xfh.r(r39Var.v0, new d39(Uri.fromFile(fileP).toString(), absolutePath));
        return qqg.a;
    }
}
