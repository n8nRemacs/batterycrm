package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class z75 implements y75 {
    public final DynamicRangeProfiles a;

    public z75(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            u75 u75Var = (u75) v75.a.get(l);
            z5j.e(u75Var, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(u75Var);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.y75
    public final Set a() {
        return d(this.a.getSupportedProfiles());
    }

    @Override // defpackage.y75
    public final DynamicRangeProfiles b() {
        return this.a;
    }

    @Override // defpackage.y75
    public final Set c(u75 u75Var) {
        Long lA = v75.a(u75Var, this.a);
        z5j.a("DynamicRange is not supported: " + u75Var, lA != null);
        return d(this.a.getProfileCaptureRequestConstraints(lA.longValue()));
    }
}
