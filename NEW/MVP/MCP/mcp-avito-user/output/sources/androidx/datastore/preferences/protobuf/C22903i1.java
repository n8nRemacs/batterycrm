package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* renamed from: androidx.datastore.preferences.protobuf.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22903i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f45843a;

    /* renamed from: b, reason: collision with root package name */
    public static final G1<?, ?> f45844b;

    /* renamed from: c, reason: collision with root package name */
    public static final G1<?, ?> f45845c;

    /* renamed from: d, reason: collision with root package name */
    public static final I1 f45846d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f45843a = cls;
        f45844b = A(false);
        f45845c = A(true);
        f45846d = new I1();
    }

    public static G1<?, ?> A(boolean z12) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (G1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z12));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(U u12, GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        C22884c0 c22884c0C = u12.c(generatedMessageLite2);
        if (c22884c0C.f45806a.isEmpty()) {
            return;
        }
        C22884c0 c22884c0D = u12.d(generatedMessageLite);
        c22884c0D.getClass();
        C22909k1<T, Object> c22909k1 = c22884c0C.f45806a;
        if (c22909k1.f45851c.size() > 0) {
            c22884c0D.k(c22909k1.c(0));
            throw null;
        }
        Iterator it = c22909k1.d().iterator();
        if (it.hasNext()) {
            c22884c0D.k((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB D(int i12, int i13, UB ub2, G1<UT, UB> g12) {
        if (ub2 == null) {
            ub2 = (UB) g12.m();
        }
        g12.e(ub2, i12, i13);
        return ub2;
    }

    public static void E(int i12, List<Boolean> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i12, list, z12);
    }

    public static void F(int i12, List<AbstractC22934w> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i12, list);
    }

    public static void G(int i12, List<Double> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i12, list, z12);
    }

    public static void H(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i12, list, z12);
    }

    public static void I(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i12, list, z12);
    }

    public static void J(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i12, list, z12);
    }

    public static void K(int i12, List<Float> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i12, list, z12);
    }

    public static void L(int i12, List<?> list, Writer writer, InterfaceC22897g1 interfaceC22897g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.d(i12, list, interfaceC22897g1);
    }

    public static void M(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i12, list, z12);
    }

    public static void N(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i12, list, z12);
    }

    public static void O(int i12, List<?> list, Writer writer, InterfaceC22897g1 interfaceC22897g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.f(i12, list, interfaceC22897g1);
    }

    public static void P(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i12, list, z12);
    }

    public static void Q(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i12, list, z12);
    }

    public static void R(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i12, list, z12);
    }

    public static void S(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i12, list, z12);
    }

    public static void T(int i12, List<String> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i12, list);
    }

    public static void U(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i12, list, z12);
    }

    public static void V(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i12, list, z12);
    }

    public static int a(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.i(i12) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i12, List<AbstractC22934w> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB2 = CodedOutputStream.B(i12) * size;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iB2 += CodedOutputStream.k(list.get(i13));
        }
        return iB2;
    }

    public static int d(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.B(i12) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int iS2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C22911l0) {
            C22911l0 c22911l0 = (C22911l0) list;
            iS2 = 0;
            while (i12 < size) {
                iS2 += CodedOutputStream.s(c22911l0.getInt(i12));
                i12++;
            }
        } else {
            iS2 = 0;
            while (i12 < size) {
                iS2 += CodedOutputStream.s(list.get(i12).intValue());
                i12++;
            }
        }
        return iS2;
    }

    public static int f(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.n(i12) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.o(i12) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i12, List<F0> list, InterfaceC22897g1 interfaceC22897g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iQ2 += CodedOutputStream.q(i12, list.get(i13), interfaceC22897g1);
        }
        return iQ2;
    }

    public static int k(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.B(i12) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int iS2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C22911l0) {
            C22911l0 c22911l0 = (C22911l0) list;
            iS2 = 0;
            while (i12 < size) {
                iS2 += CodedOutputStream.s(c22911l0.getInt(i12));
                i12++;
            }
        } else {
            iS2 = 0;
            while (i12 < size) {
                iS2 += CodedOutputStream.s(list.get(i12).intValue());
                i12++;
            }
        }
        return iS2;
    }

    public static int m(int i12, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.B(i12) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int iF2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C22935w0) {
            C22935w0 c22935w0 = (C22935w0) list;
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(c22935w0.getLong(i12));
                i12++;
            }
        } else {
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(list.get(i12).longValue());
                i12++;
            }
        }
        return iF2;
    }

    public static int o(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
        if (obj instanceof C22924q0) {
            return CodedOutputStream.u((C22924q0) obj) + CodedOutputStream.B(i12);
        }
        int iB2 = CodedOutputStream.B(i12);
        int iE2 = ((AbstractC22877a) ((F0) obj)).e(interfaceC22897g1);
        return CodedOutputStream.D(iE2) + iE2 + iB2;
    }

    public static int p(int i12, List<?> list, InterfaceC22897g1 interfaceC22897g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB2 = CodedOutputStream.B(i12) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (obj instanceof C22924q0) {
                iB2 = CodedOutputStream.u((C22924q0) obj) + iB2;
            } else {
                int iE2 = ((AbstractC22877a) ((F0) obj)).e(interfaceC22897g1);
                iB2 = CodedOutputStream.D(iE2) + iE2 + iB2;
            }
        }
        return iB2;
    }

    public static int q(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.B(i12) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int iD2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C22911l0) {
            C22911l0 c22911l0 = (C22911l0) list;
            iD2 = 0;
            while (i12 < size) {
                iD2 += CodedOutputStream.D(CodedOutputStream.G(c22911l0.getInt(i12)));
                i12++;
            }
        } else {
            iD2 = 0;
            while (i12 < size) {
                iD2 += CodedOutputStream.D(CodedOutputStream.G(list.get(i12).intValue()));
                i12++;
            }
        }
        return iD2;
    }

    public static int s(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.B(i12) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int iF2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C22935w0) {
            C22935w0 c22935w0 = (C22935w0) list;
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(CodedOutputStream.H(c22935w0.getLong(i12)));
                i12++;
            }
        } else {
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(CodedOutputStream.H(list.get(i12).longValue()));
                i12++;
            }
        }
        return iF2;
    }

    public static int u(int i12, List<?> list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int iB2 = CodedOutputStream.B(i12) * size;
        if (list instanceof InterfaceC22927s0) {
            InterfaceC22927s0 interfaceC22927s0 = (InterfaceC22927s0) list;
            while (i13 < size) {
                Object raw = interfaceC22927s0.getRaw(i13);
                iB2 = (raw instanceof AbstractC22934w ? CodedOutputStream.k((AbstractC22934w) raw) : CodedOutputStream.A((String) raw)) + iB2;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                iB2 = (obj instanceof AbstractC22934w ? CodedOutputStream.k((AbstractC22934w) obj) : CodedOutputStream.A((String) obj)) + iB2;
                i13++;
            }
        }
        return iB2;
    }

    public static int v(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.B(i12) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int iD2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C22911l0) {
            C22911l0 c22911l0 = (C22911l0) list;
            iD2 = 0;
            while (i12 < size) {
                iD2 += CodedOutputStream.D(c22911l0.getInt(i12));
                i12++;
            }
        } else {
            iD2 = 0;
            while (i12 < size) {
                iD2 += CodedOutputStream.D(list.get(i12).intValue());
                i12++;
            }
        }
        return iD2;
    }

    public static int x(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.B(i12) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int iF2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C22935w0) {
            C22935w0 c22935w0 = (C22935w0) list;
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(c22935w0.getLong(i12));
                i12++;
            }
        } else {
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(list.get(i12).longValue());
                i12++;
            }
        }
        return iF2;
    }

    public static <UT, UB> UB z(int i12, List<Integer> list, C22914m0.e eVar, UB ub2, G1<UT, UB> g12) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                Integer num = list.get(i14);
                int iIntValue = num.intValue();
                if (eVar.isInRange(iIntValue)) {
                    if (i14 != i13) {
                        list.set(i13, num);
                    }
                    i13++;
                } else {
                    ub2 = (UB) D(i12, iIntValue, ub2, g12);
                }
            }
            if (i13 != size) {
                list.subList(i13, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.isInRange(iIntValue2)) {
                    ub2 = (UB) D(i12, iIntValue2, ub2, g12);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
