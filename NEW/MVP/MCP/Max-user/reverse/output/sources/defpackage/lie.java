package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lie {
    public final kie a;

    public lie(ArrayList arrayList, qee qeeVar, b12 b12Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new jie(arrayList, qeeVar, b12Var);
        } else {
            this.a = new iie(arrayList, qeeVar, b12Var);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((ekb) it.next()).a.a());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lie)) {
            return false;
        }
        return this.a.equals(((lie) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
