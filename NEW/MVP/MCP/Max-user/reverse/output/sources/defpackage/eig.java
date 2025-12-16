package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class eig {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public eig(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eig)) {
            return false;
        }
        eig eigVar = (eig) obj;
        return this.b == eigVar.b && this.a.equals(eigVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = ho7.o("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbO.append(this.b);
        sbO.append("\n");
        String strI = az1.i(sbO.toString(), "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strI = strI + "    " + str + ": " + map.get(str) + "\n";
        }
        return strI;
    }
}
