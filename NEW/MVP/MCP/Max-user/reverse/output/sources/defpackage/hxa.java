package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class hxa {
    public static final nc0 a = new nc0(0);
    public static final oc0 b = new oc0();

    public static lk0 a(nxa nxaVar) {
        if (nxaVar instanceof kxa) {
            return a;
        }
        if (nxaVar instanceof mxa) {
            return b;
        }
        if (nxaVar.equals(lxa.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static rf7 b(String str, nxa nxaVar) {
        Uri uriC = rz3.c(str);
        if (uriC == null) {
            uriC = Uri.EMPTY;
        }
        sf7 sf7VarD = sf7.d(uriC);
        sf7VarD.g = pf7.b;
        sf7VarD.k = a(nxaVar);
        sf7VarD.j = m9c.c;
        return sf7VarD.a();
    }
}
