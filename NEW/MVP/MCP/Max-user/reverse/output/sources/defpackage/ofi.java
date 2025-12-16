package defpackage;

import android.media.ImageReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ofi {
    public static final ree[] a = new ree[0];
    public static volatile o98 b;

    public static final Set a(ree reeVar) {
        if (reeVar instanceof iz0) {
            return ((iz0) reeVar).b();
        }
        HashSet hashSet = new HashSet(reeVar.f());
        int iF = reeVar.f();
        for (int i = 0; i < iF; i++) {
            hashSet.add(reeVar.g(i));
        }
        return hashSet;
    }

    public static final ree[] b(List list) {
        ree[] reeVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (reeVarArr = (ree[]) list.toArray(new ree[0])) == null) ? a : reeVarArr;
    }

    public static vd c(int i, int i2, int i3, int i4) {
        return new vd(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static final teg d(String str) {
        o98 o98VarA = b;
        if (o98VarA == null) {
            o98 o98VarD = ve3.d();
            try {
                Iterator it = Arrays.asList(new heg()).iterator();
                while (it.hasNext()) {
                    o98VarD.add(it.next());
                }
                b = o98VarD;
                o98VarA = ve3.a(o98VarD);
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
        if (o98VarA.getSize() > 1) {
            throw new IllegalStateException("More then one manifest found: ".concat(ue3.N(o98VarA, null, null, null, zx0.G0, 31)).toString());
        }
        if (o98VarA.getSize() != 1) {
            return null;
        }
        teg tegVar = (teg) o98VarA.get(0);
        tegVar.getClass();
        if ("ru.oneme.app".equals(str)) {
            return tegVar;
        }
        throw new IllegalStateException(("Unexpected " + tegVar.getClass().getName() + ".applicationId()").toString());
    }
}
