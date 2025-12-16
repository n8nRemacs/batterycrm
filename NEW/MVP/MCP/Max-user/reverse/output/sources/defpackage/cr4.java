package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class cr4 {
    public final String a;
    public final iv6 b;

    public cr4(Set set, iv6 iv6Var) {
        this.a = b(set);
        this.b = iv6Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            na0 na0Var = (na0) it.next();
            sb.append(na0Var.a);
            sb.append('/');
            sb.append(na0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.a;
        iv6 iv6Var = this.b;
        synchronized (((HashSet) iv6Var.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) iv6Var.b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) iv6Var.b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) iv6Var.b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
