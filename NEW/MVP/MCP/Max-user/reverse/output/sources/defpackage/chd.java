package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class chd implements j1h {
    public final nsc b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public chd(l22 l22Var) {
        cf5 cf5VarN = l22Var.n();
        i17 i17Var = pv4.a;
        vhb vhbVar = new vhb(l22Var, cf5VarN, i17Var);
        jkc jkcVar = new jkc();
        jkcVar.c = new HashMap();
        jkcVar.a = vhbVar;
        jkcVar.b = i17Var;
        Iterator it = l22Var.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            u75 u75Var = (u75) it.next();
            Integer numValueOf = Integer.valueOf(u75Var.a);
            int i = u75Var.b;
            if (numValueOf.equals(3) && i == 10) {
                lz1 lz1Var = g3h.d;
                te8 te8Var = new te8();
                te8Var.c = new HashMap();
                te8Var.a = jkcVar;
                te8Var.b = lz1Var;
                jkcVar = te8Var;
                break;
            }
        }
        this.b = new nsc(l22Var, jkcVar, i17Var);
        for (u75 u75Var2 : l22Var.a()) {
            y42 y42Var = new y42(new sa9(this.b, u75Var2));
            if (!new ArrayList(y42Var.a.keySet()).isEmpty()) {
                this.c.put(u75Var2, y42Var);
            }
        }
        l22Var.c();
    }

    @Override // defpackage.j1h
    public final gc0 a(Size size, u75 u75Var) {
        Object value;
        y42 y42VarD = d(u75Var);
        gc0 gc0VarA = null;
        if (y42VarD == null) {
            return null;
        }
        TreeMap treeMap = y42VarD.b;
        Size size2 = d4f.a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        fb0 fb0Var = (fb0) value;
        if (fb0Var == null) {
            fb0Var = fb0.j;
        }
        gri.a("CapabilitiesByQuality", "Using supported quality of " + fb0Var + " for size " + size);
        if (fb0Var == fb0.j || (gc0VarA = y42VarD.a(fb0Var)) != null) {
            return gc0VarA;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @Override // defpackage.j1h
    public final gc0 b(fb0 fb0Var, u75 u75Var) {
        y42 y42VarD = d(u75Var);
        if (y42VarD == null) {
            return null;
        }
        return y42VarD.a(fb0Var);
    }

    @Override // defpackage.j1h
    public final ArrayList c(u75 u75Var) {
        y42 y42VarD = d(u75Var);
        return y42VarD == null ? new ArrayList() : new ArrayList(y42VarD.a.keySet());
    }

    public final y42 d(u75 u75Var) {
        Object next;
        boolean zContains;
        boolean zB = u75Var.b();
        HashMap map = this.c;
        if (zB) {
            return (y42) map.get(u75Var);
        }
        HashMap map2 = this.d;
        if (map2.containsKey(u75Var)) {
            return (y42) map2.get(u75Var);
        }
        Set setKeySet = map.keySet();
        if (u75Var.b()) {
            zContains = setKeySet.contains(u75Var);
        } else {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                u75 u75Var2 = (u75) next;
                z5j.f("Fully specified range is not actually fully specified.", u75Var2.b());
                int i = u75Var.b;
                if (i == 0 || i == u75Var2.b) {
                    z5j.f("Fully specified range is not actually fully specified.", u75Var2.b());
                    int i2 = u75Var.a;
                    if (i2 != 0) {
                        int i3 = u75Var2.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        y42 y42Var = zContains ? new y42(new sa9(this.b, u75Var)) : null;
        map2.put(u75Var, y42Var);
        return y42Var;
    }
}
