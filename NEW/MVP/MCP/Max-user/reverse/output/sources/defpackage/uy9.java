package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class uy9 {
    public final xo8 a;
    public final x94 b;
    public final HashMap c;

    public uy9(Context context, x94 x94Var) {
        xo8 xo8Var = new xo8(25, (Object) context, false);
        this.c = new HashMap();
        this.a = xo8Var;
        this.b = x94Var;
    }

    public final synchronized hig a(String str) {
        if (this.c.containsKey(str)) {
            return (hig) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryB = this.a.B(str);
        if (cctBackendFactoryB == null) {
            return null;
        }
        x94 x94Var = this.b;
        hig higVarCreate = cctBackendFactoryB.create(new t90(x94Var.a, x94Var.b, x94Var.c, str));
        this.c.put(str, higVarCreate);
        return higVarCreate;
    }
}
