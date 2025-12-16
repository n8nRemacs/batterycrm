package kotlin.jvm.internal;

import Z41.g;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC43072x;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes8.dex */
public class v0 {
    public static Collection a(Object obj) {
        if ((obj instanceof Z41.a) && !(obj instanceof Z41.b)) {
            i(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e12) {
            L.i(e12, v0.class.getName());
            throw e12;
        }
    }

    public static List b(List list) {
        if ((list instanceof Z41.a) && !(list instanceof Z41.e)) {
            i(list, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return list;
        } catch (ClassCastException e12) {
            L.i(e12, v0.class.getName());
            throw e12;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof Z41.a) && !(obj instanceof Z41.g)) {
            i(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e12) {
            L.i(e12, v0.class.getName());
            throw e12;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof Z41.a) && !(obj instanceof Z41.h)) {
            i(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e12) {
            L.i(e12, v0.class.getName());
            throw e12;
        }
    }

    public static Object e(int i12, Object obj) {
        if (obj == null || f(i12, obj)) {
            return obj;
        }
        i(obj, "kotlin.jvm.functions.Function" + i12);
        throw null;
    }

    public static boolean f(int i12, Object obj) {
        if (obj instanceof InterfaceC43072x) {
            return (obj instanceof E ? ((E) obj).getArity() : obj instanceof Y41.a ? 0 : obj instanceof Y41.l ? 1 : obj instanceof Y41.p ? 2 : obj instanceof Y41.q ? 3 : obj instanceof Y41.r ? 4 : obj instanceof Y41.s ? 5 : obj instanceof Y41.t ? 6 : obj instanceof Y41.u ? 7 : obj instanceof Y41.v ? 8 : obj instanceof Y41.w ? 9 : obj instanceof Y41.b ? 10 : obj instanceof Y41.c ? 11 : obj instanceof Y41.d ? 12 : obj instanceof Y41.e ? 13 : obj instanceof Y41.f ? 14 : obj instanceof Y41.g ? 15 : obj instanceof Y41.h ? 16 : obj instanceof Y41.i ? 17 : obj instanceof Y41.j ? 18 : obj instanceof Y41.k ? 19 : obj instanceof Y41.m ? 20 : obj instanceof Y41.n ? 21 : obj instanceof Y41.o ? 22 : -1) == i12;
        }
        return false;
    }

    public static boolean g(Object obj) {
        return (obj instanceof List) && (!(obj instanceof Z41.a) || (obj instanceof Z41.e));
    }

    public static boolean h(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof Z41.a) || (obj instanceof g.a));
    }

    public static void i(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(androidx.appcompat.app.r.r(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        L.i(classCastException, v0.class.getName());
        throw classCastException;
    }
}
