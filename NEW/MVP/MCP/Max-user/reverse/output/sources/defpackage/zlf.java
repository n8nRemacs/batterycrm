package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zlf {
    public static final s90 a = new s90("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            zwg zwgVar = zwg.b;
            hashSet.add(zwgVar);
            zwg zwgVar2 = zwg.X;
            hashSet.add(zwgVar2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(zwgVar);
            hashSet2.add(zwgVar2);
            hashSet2.add(zwg.c);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            zwg zwgVar3 = zwg.a;
            hashSet3.add(zwgVar3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            zwg zwgVar4 = zwg.d;
            hashSet4.add(zwgVar4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(zwgVar);
            hashSet5.add(zwgVar3);
            hashSet5.add(zwgVar4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(zwgVar);
            hashSet6.add(zwgVar4);
            map2.put(3L, hashSet6);
        }
    }

    public static e02 a(ao3 ao3Var, long j) {
        s90 s90Var = a;
        if (ao3Var.i(s90Var) && ((Long) ao3Var.f(s90Var)).longValue() == j) {
            return null;
        }
        x8a x8aVarK = x8a.k(ao3Var);
        x8aVarK.n(s90Var, Long.valueOf(j));
        return new e02(9, x8aVarK);
    }

    public static boolean b(zwg zwgVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (zwgVar != zwg.o) {
            Long lValueOf = Long.valueOf(j);
            HashMap map = b;
            return map.containsKey(lValueOf) && ((Set) map.get(Long.valueOf(j))).contains(zwgVar);
        }
        Long lValueOf2 = Long.valueOf(j);
        HashMap map2 = c;
        if (!map2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((zwg) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(ao3 ao3Var, zwg zwgVar) {
        if (((Boolean) ao3Var.d(xwg.n0, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        s90 s90Var = fe7.b;
        if (ao3Var.i(s90Var)) {
            return zwgVar.ordinal() == 0 && ((Integer) ao3Var.f(s90Var)).intValue() == 2;
        }
        return false;
    }
}
