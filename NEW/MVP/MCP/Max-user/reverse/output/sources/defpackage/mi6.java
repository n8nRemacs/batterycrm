package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.c;
import java.util.Map;

/* loaded from: classes.dex */
public final class mi6 implements b48 {
    public final /* synthetic */ String a;
    public final /* synthetic */ wi6 b;
    public final /* synthetic */ l48 c;
    public final /* synthetic */ c d;

    public mi6(c cVar, String str, wi6 wi6Var, l48 l48Var) {
        this.d = cVar;
        this.a = str;
        this.b = wi6Var;
        this.c = l48Var;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        Bundle bundle;
        c cVar = this.d;
        Map map = cVar.l;
        k38 k38Var2 = k38.ON_START;
        String str = this.a;
        if (k38Var == k38Var2 && (bundle = (Bundle) map.get(str)) != null) {
            this.b.b(str, bundle);
            map.remove(str);
            if (c.K(2)) {
                Log.v("FragmentManager", "Clearing fragment result with key " + str);
            }
        }
        if (k38Var == k38.ON_DESTROY) {
            this.c.f(this);
            cVar.m.remove(str);
        }
    }
}
