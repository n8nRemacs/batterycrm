package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class czi {
    public static final f82 a(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? new f82(context) : new g82(context, null, 0);
    }

    public static boolean b(lta ltaVar, vta vtaVar, tm6 tm6Var) {
        if (!(ltaVar instanceof drf)) {
            return false;
        }
        try {
            Object obj = ((drf) ltaVar).get();
            if (obj == null) {
                cd5.a(vtaVar);
                return true;
            }
            try {
                Object objApply = tm6Var.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                lta ltaVar2 = (lta) objApply;
                if (!(ltaVar2 instanceof drf)) {
                    ltaVar2.a(vtaVar);
                    return true;
                }
                try {
                    Object obj2 = ((drf) ltaVar2).get();
                    if (obj2 == null) {
                        cd5.a(vtaVar);
                        return true;
                    }
                    kta ktaVar = new kta(vtaVar, obj2);
                    vtaVar.c(ktaVar);
                    ktaVar.run();
                    return true;
                } catch (Throwable th) {
                    raj.c(th);
                    cd5.c(th, vtaVar);
                    return true;
                }
            } catch (Throwable th2) {
                raj.c(th2);
                cd5.c(th2, vtaVar);
                return true;
            }
        } catch (Throwable th3) {
            raj.c(th3);
            cd5.c(th3, vtaVar);
            return true;
        }
    }
}
