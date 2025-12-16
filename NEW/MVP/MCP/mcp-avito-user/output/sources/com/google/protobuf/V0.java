package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
final class V0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f362774a;

    /* renamed from: b, reason: collision with root package name */
    public static final m1<?, ?> f362775b;

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f362776c;

    static {
        Class<?> cls;
        Class<?> cls2;
        m1<?, ?> m1Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f362774a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                m1Var = (m1) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f362775b = m1Var;
        f362776c = new o1();
    }

    @InterfaceC37704v
    public static <UT, UB> UB A(Object obj, int i12, List<Integer> list, C37670d0.e eVar, UB ub2, m1<UT, UB> m1Var) {
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
                    ub2 = (UB) C(obj, i12, iIntValue, ub2, m1Var);
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
                    ub2 = (UB) C(obj, i12, iIntValue2, ub2, m1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @InterfaceC37704v
    public static <UT, UB> UB C(Object obj, int i12, int i13, UB ub2, m1<UT, UB> m1Var) {
        if (ub2 == null) {
            ub2 = (UB) m1Var.f(obj);
        }
        m1Var.e(ub2, i12, i13);
        return ub2;
    }

    public static void D(int i12, List<Boolean> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i12, list, z12);
    }

    public static void E(int i12, List<AbstractC37700t> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i12, list);
    }

    public static void F(int i12, List<Double> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i12, list, z12);
    }

    public static void G(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i12, list, z12);
    }

    public static void H(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i12, list, z12);
    }

    public static void I(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i12, list, z12);
    }

    public static void J(int i12, List<Float> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i12, list, z12);
    }

    public static void K(int i12, List<?> list, Writer writer, T0 t02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.d(i12, list, t02);
    }

    public static void L(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i12, list, z12);
    }

    public static void M(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i12, list, z12);
    }

    public static void N(int i12, List<?> list, Writer writer, T0 t02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.b(i12, list, t02);
    }

    public static void O(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i12, list, z12);
    }

    public static void P(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i12, list, z12);
    }

    public static void Q(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i12, list, z12);
    }

    public static void R(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i12, list, z12);
    }

    public static void S(int i12, List<String> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i12, list);
    }

    public static void T(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i12, list, z12);
    }

    public static void U(int i12, List<Long> list, Writer writer, boolean z12) {
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

    public static int c(int i12, List<AbstractC37700t> list) {
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
        if (list instanceof C37668c0) {
            C37668c0 c37668c0 = (C37668c0) list;
            iS2 = 0;
            while (i12 < size) {
                iS2 += CodedOutputStream.s(c37668c0.getInt(i12));
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

    public static int j(int i12, List<InterfaceC37707w0> list, T0 t02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iQ2 += CodedOutputStream.q(i12, list.get(i13), t02);
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
        if (list instanceof C37668c0) {
            C37668c0 c37668c0 = (C37668c0) list;
            iS2 = 0;
            while (i12 < size) {
                iS2 += CodedOutputStream.s(c37668c0.getInt(i12));
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
        if (list instanceof C37690n0) {
            C37690n0 c37690n0 = (C37690n0) list;
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(c37690n0.getLong(i12));
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

    public static int o(int i12, Object obj, T0 t02) {
        if (obj instanceof C37680i0) {
            return CodedOutputStream.u((C37680i0) obj) + CodedOutputStream.B(i12);
        }
        int iB2 = CodedOutputStream.B(i12);
        int serializedSize = ((AbstractC37663a) ((InterfaceC37707w0) obj)).getSerializedSize(t02);
        return CodedOutputStream.D(serializedSize) + serializedSize + iB2;
    }

    public static int p(int i12, List<?> list, T0 t02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB2 = CodedOutputStream.B(i12) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (obj instanceof C37680i0) {
                iB2 = CodedOutputStream.u((C37680i0) obj) + iB2;
            } else {
                int serializedSize = ((AbstractC37663a) ((InterfaceC37707w0) obj)).getSerializedSize(t02);
                iB2 = CodedOutputStream.D(serializedSize) + serializedSize + iB2;
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
        if (list instanceof C37668c0) {
            C37668c0 c37668c0 = (C37668c0) list;
            iD2 = 0;
            while (i12 < size) {
                iD2 += CodedOutputStream.D(CodedOutputStream.G(c37668c0.getInt(i12)));
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
        if (list instanceof C37690n0) {
            C37690n0 c37690n0 = (C37690n0) list;
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(CodedOutputStream.H(c37690n0.getLong(i12)));
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
        if (list instanceof InterfaceC37684k0) {
            InterfaceC37684k0 interfaceC37684k0 = (InterfaceC37684k0) list;
            while (i13 < size) {
                Object raw = interfaceC37684k0.getRaw(i13);
                iB2 = (raw instanceof AbstractC37700t ? CodedOutputStream.k((AbstractC37700t) raw) : CodedOutputStream.A((String) raw)) + iB2;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                iB2 = (obj instanceof AbstractC37700t ? CodedOutputStream.k((AbstractC37700t) obj) : CodedOutputStream.A((String) obj)) + iB2;
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
        if (list instanceof C37668c0) {
            C37668c0 c37668c0 = (C37668c0) list;
            iD2 = 0;
            while (i12 < size) {
                iD2 += CodedOutputStream.D(c37668c0.getInt(i12));
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
        if (list instanceof C37690n0) {
            C37690n0 c37690n0 = (C37690n0) list;
            iF2 = 0;
            while (i12 < size) {
                iF2 += CodedOutputStream.F(c37690n0.getLong(i12));
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

    @InterfaceC37704v
    public static Object z(Object obj, int i12, AbstractList abstractList, C37670d0.d dVar, Object obj2, m1 m1Var) {
        if (dVar == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Integer num = (Integer) abstractList.get(i14);
            int iIntValue = num.intValue();
            if (dVar.findValueByNumber(iIntValue) != null) {
                if (i14 != i13) {
                    abstractList.set(i13, num);
                }
                i13++;
            } else {
                obj2 = C(obj, i12, iIntValue, obj2, m1Var);
            }
        }
        if (i13 != size) {
            abstractList.subList(i13, size).clear();
        }
        return obj2;
    }
}
