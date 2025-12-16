package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class da3 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public da3(String str) {
        this.a = str;
    }

    public static void a(da3 da3Var, String str, ree reeVar) {
        if (!da3Var.c.add(str)) {
            StringBuilder sbN = az1.n("Element with name '", str, "' is already registered in ");
            sbN.append(da3Var.a);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        da3Var.b.add(str);
        da3Var.d.add(reeVar);
        da3Var.e.add(hd5.a);
        da3Var.f.add(false);
    }
}
