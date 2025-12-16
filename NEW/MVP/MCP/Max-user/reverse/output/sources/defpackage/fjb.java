package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class fjb implements ao3 {
    public static final ov5 b;
    public static final fjb c;
    public final TreeMap a;

    static {
        ov5 ov5Var = new ov5(18);
        b = ov5Var;
        c = new fjb(new TreeMap(ov5Var));
    }

    public fjb(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static fjb a(ao3 ao3Var) {
        if (fjb.class.equals(ao3Var.getClass())) {
            return (fjb) ao3Var;
        }
        TreeMap treeMap = new TreeMap(b);
        for (s90 s90Var : ao3Var.e()) {
            Set<zn3> setG = ao3Var.g(s90Var);
            ArrayMap arrayMap = new ArrayMap();
            for (zn3 zn3Var : setG) {
                arrayMap.put(zn3Var, ao3Var.h(s90Var, zn3Var));
            }
            treeMap.put(s90Var, arrayMap);
        }
        return new fjb(treeMap);
    }

    @Override // defpackage.ao3
    public final void c(i00 i00Var) {
        for (Map.Entry entry : this.a.tailMap(new s90("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((s90) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            s90 s90Var = (s90) entry.getKey();
            a3b a3bVar = (a3b) i00Var.b;
            ao3 ao3Var = (ao3) i00Var.c;
            ((x8a) a3bVar.b).m(s90Var, ao3Var.j(s90Var), ao3Var.f(s90Var));
        }
    }

    @Override // defpackage.ao3
    public final Object d(s90 s90Var, Object obj) {
        try {
            return f(s90Var);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // defpackage.ao3
    public final Set e() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.ao3
    public final Object f(s90 s90Var) {
        Map map = (Map) this.a.get(s90Var);
        if (map != null) {
            return map.get((zn3) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + s90Var);
    }

    @Override // defpackage.ao3
    public final Set g(s90 s90Var) {
        Map map = (Map) this.a.get(s90Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.ao3
    public final Object h(s90 s90Var, zn3 zn3Var) {
        Map map = (Map) this.a.get(s90Var);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + s90Var);
        }
        if (map.containsKey(zn3Var)) {
            return map.get(zn3Var);
        }
        throw new IllegalArgumentException("Option does not exist: " + s90Var + " with priority=" + zn3Var);
    }

    @Override // defpackage.ao3
    public final boolean i(s90 s90Var) {
        return this.a.containsKey(s90Var);
    }

    @Override // defpackage.ao3
    public final zn3 j(s90 s90Var) {
        Map map = (Map) this.a.get(s90Var);
        if (map != null) {
            return (zn3) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + s90Var);
    }
}
