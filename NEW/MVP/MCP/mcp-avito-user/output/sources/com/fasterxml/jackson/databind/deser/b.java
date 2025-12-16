package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.InterfaceC36434d;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.annotation.z;
import com.fasterxml.jackson.databind.AbstractC36441a;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.deser.impl.C36445d;
import com.fasterxml.jackson.databind.deser.impl.C36446e;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.introspect.G;
import com.fasterxml.jackson.databind.introspect.L;
import com.fasterxml.jackson.databind.util.C36497c;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: BasicDeserializerFactory.java */
/* loaded from: classes4.dex */
public abstract class b extends p implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.cfg.h f341529c;

    /* compiled from: BasicDeserializerFactory.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341530a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f341531b;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            f341531b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341531b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341531b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f341531b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            f341530a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f341530a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f341530a[0] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BasicDeserializerFactory.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.b$b, reason: collision with other inner class name */
    public static class C10545b {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Class<? extends Collection>> f341532a;

        /* renamed from: b, reason: collision with root package name */
        public static final HashMap<String, Class<? extends Map>> f341533b;

        static {
            HashMap<String, Class<? extends Collection>> map = new HashMap<>();
            map.put(Collection.class.getName(), ArrayList.class);
            map.put(List.class.getName(), ArrayList.class);
            map.put(Set.class.getName(), HashSet.class);
            map.put(SortedSet.class.getName(), TreeSet.class);
            map.put(Queue.class.getName(), LinkedList.class);
            map.put(AbstractList.class.getName(), ArrayList.class);
            map.put(AbstractSet.class.getName(), HashSet.class);
            map.put(Deque.class.getName(), LinkedList.class);
            map.put(NavigableSet.class.getName(), TreeSet.class);
            f341532a = map;
            HashMap<String, Class<? extends Map>> map2 = new HashMap<>();
            map2.put(Map.class.getName(), LinkedHashMap.class);
            map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            map2.put(SortedMap.class.getName(), TreeMap.class);
            map2.put(NavigableMap.class.getName(), TreeMap.class);
            map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            f341533b = map2;
        }
    }

    /* compiled from: BasicDeserializerFactory.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.f f341534a;

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.b f341535b;

        /* renamed from: c, reason: collision with root package name */
        public final L<?> f341536c;

        /* renamed from: d, reason: collision with root package name */
        public final C36446e f341537d;

        /* renamed from: e, reason: collision with root package name */
        public final Map<com.fasterxml.jackson.databind.introspect.o, com.fasterxml.jackson.databind.introspect.u[]> f341538e;

        /* renamed from: f, reason: collision with root package name */
        public LinkedList f341539f;

        /* renamed from: g, reason: collision with root package name */
        public int f341540g;

        /* renamed from: h, reason: collision with root package name */
        public LinkedList f341541h;

        /* renamed from: i, reason: collision with root package name */
        public int f341542i;

        public c(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, L<?> l12, C36446e c36446e, Map<com.fasterxml.jackson.databind.introspect.o, com.fasterxml.jackson.databind.introspect.u[]> map) {
            this.f341534a = fVar;
            this.f341535b = bVar;
            this.f341536c = l12;
            this.f341537d = c36446e;
            this.f341538e = map;
        }
    }

    static {
        new com.fasterxml.jackson.databind.v("@JsonUnwrapped", null);
    }

    public b(com.fasterxml.jackson.databind.cfg.h hVar) {
        this.f341529c = hVar;
    }

    public static boolean d(AnnotationIntrospector annotationIntrospector, com.fasterxml.jackson.databind.introspect.o oVar, com.fasterxml.jackson.databind.introspect.u uVar) {
        String name;
        if ((uVar == null || !uVar.A()) && annotationIntrospector.q(oVar.s(0)) == null) {
            return (uVar == null || (name = uVar.getName()) == null || name.isEmpty() || !uVar.f()) ? false : true;
        }
        return true;
    }

    public static void f(C36446e c36446e, com.fasterxml.jackson.databind.introspect.o oVar, boolean z12, boolean z13) {
        Class<?> clsV = oVar.v(0);
        if (clsV == String.class || clsV == CharSequence.class) {
            if (z12 || z13) {
                c36446e.e(oVar, 1, z12);
                return;
            }
            return;
        }
        if (clsV == Integer.TYPE || clsV == Integer.class) {
            if (z12 || z13) {
                c36446e.e(oVar, 2, z12);
                return;
            }
            return;
        }
        if (clsV == Long.TYPE || clsV == Long.class) {
            if (z12 || z13) {
                c36446e.e(oVar, 3, z12);
                return;
            }
            return;
        }
        if (clsV == Double.TYPE || clsV == Double.class) {
            if (z12 || z13) {
                c36446e.e(oVar, 5, z12);
                return;
            }
            return;
        }
        if (clsV == Boolean.TYPE || clsV == Boolean.class) {
            if (z12 || z13) {
                c36446e.e(oVar, 7, z12);
                return;
            }
            return;
        }
        if (clsV == BigInteger.class && (z12 || z13)) {
            c36446e.e(oVar, 4, z12);
        }
        if (clsV == BigDecimal.class && (z12 || z13)) {
            c36446e.e(oVar, 6, z12);
        }
        if (z12) {
            c36446e.b(oVar, z12, null, 0);
        }
    }

    public static boolean g(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.introspect.o oVar) {
        JsonCreator.Mode modeE;
        AnnotationIntrospector annotationIntrospectorD = fVar.f341921d.d();
        return (annotationIntrospectorD == null || (modeE = annotationIntrospectorD.e(fVar.f341921d, oVar)) == null || modeE == JsonCreator.Mode.f340925e) ? false : true;
    }

    public static com.fasterxml.jackson.databind.util.j i(Class cls, com.fasterxml.jackson.databind.e eVar, AbstractC36471j abstractC36471j) throws SecurityException {
        if (abstractC36471j != null) {
            eVar.getClass();
            if (eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                com.fasterxml.jackson.databind.util.g.e(abstractC36471j.k(), eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            AnnotationIntrospector annotationIntrospectorD = eVar.d();
            boolean zK2 = eVar.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
            Enum<?>[] enumArrA = com.fasterxml.jackson.databind.util.j.a(cls);
            HashMap map = new HashMap();
            int length = enumArrA.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Enum<?> r22 = enumArrA[length];
                try {
                    Object objL = abstractC36471j.l(r22);
                    if (objL != null) {
                        map.put(objL.toString(), r22);
                    }
                } catch (Exception e12) {
                    throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r22 + ": " + e12.getMessage());
                }
            }
            Enum<?> enumG = annotationIntrospectorD != null ? annotationIntrospectorD.g(cls) : null;
            Class<?> clsE = abstractC36471j.e();
            if (clsE.isPrimitive()) {
                clsE = com.fasterxml.jackson.databind.util.g.H(clsE);
            }
            return new com.fasterxml.jackson.databind.util.j(cls, enumArrA, map, enumG, zK2, clsE == Long.class || clsE == Integer.class || clsE == Short.class || clsE == Byte.class);
        }
        AnnotationIntrospector annotationIntrospectorD2 = eVar.d();
        boolean zK3 = eVar.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArrA2 = com.fasterxml.jackson.databind.util.j.a(cls);
        String[] strArrM = annotationIntrospectorD2.m(cls, enumArrA2, new String[enumArrA2.length]);
        String[][] strArr = new String[strArrM.length][];
        annotationIntrospectorD2.l(cls, enumArrA2, strArr);
        HashMap map2 = new HashMap();
        int length2 = enumArrA2.length;
        for (int i12 = 0; i12 < length2; i12++) {
            Enum<?> r62 = enumArrA2[i12];
            String strName = strArrM[i12];
            if (strName == null) {
                strName = r62.name();
            }
            map2.put(strName, r62);
            String[] strArr2 = strArr[i12];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!map2.containsKey(str)) {
                        map2.put(str, r62);
                    }
                }
            }
        }
        return new com.fasterxml.jackson.databind.util.j(cls, enumArrA2, map2, annotationIntrospectorD2.g(cls), zK3, false);
    }

    public static com.fasterxml.jackson.databind.i m(com.fasterxml.jackson.databind.f fVar, AbstractC36463b abstractC36463b) {
        Object objK;
        AnnotationIntrospector annotationIntrospectorD = fVar.f341921d.d();
        if (annotationIntrospectorD == null || (objK = annotationIntrospectorD.k(abstractC36463b)) == null) {
            return null;
        }
        return fVar.m(abstractC36463b, objK);
    }

    public static com.fasterxml.jackson.databind.m n(com.fasterxml.jackson.databind.f fVar, AbstractC36463b abstractC36463b) {
        Object objS;
        AnnotationIntrospector annotationIntrospectorD = fVar.f341921d.d();
        if (annotationIntrospectorD == null || (objS = annotationIntrospectorD.s(abstractC36463b)) == null) {
            return null;
        }
        return fVar.P(abstractC36463b, objS);
    }

    public final void a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, C36446e c36446e, C36445d c36445d, ConstructorDetector constructorDetector) throws InvalidDefinitionException {
        int i12 = 0;
        C36445d.a[] aVarArr = c36445d.f341615d;
        int i13 = c36445d.f341614c;
        if (1 != i13) {
            constructorDetector.getClass();
            int i14 = -1;
            int i15 = -1;
            while (true) {
                if (i12 >= i13) {
                    i14 = i15;
                    break;
                }
                if (aVarArr[i12].f341618c == null) {
                    if (i15 >= 0) {
                        break;
                    } else {
                        i15 = i12;
                    }
                }
                i12++;
            }
            if (i14 < 0 || c36445d.c(i14) != null) {
                c(fVar, bVar, c36446e, c36445d);
                return;
            } else {
                b(fVar, bVar, c36446e, c36445d);
                return;
            }
        }
        C36445d.a aVar = aVarArr[0];
        com.fasterxml.jackson.databind.introspect.n nVar = aVar.f341616a;
        InterfaceC36434d.a aVar2 = aVar.f341618c;
        constructorDetector.getClass();
        com.fasterxml.jackson.databind.introspect.u uVarD = c36445d.d(0);
        com.fasterxml.jackson.databind.introspect.u uVar = aVarArr[0].f341617b;
        com.fasterxml.jackson.databind.v vVarC = (uVar == null || !uVar.A()) ? null : uVar.c();
        boolean z12 = (vVarC == null && aVar2 == null) ? false : true;
        if (!z12 && uVarD != null) {
            vVarC = c36445d.c(0);
            z12 = vVarC != null && uVarD.f();
        }
        com.fasterxml.jackson.databind.v vVar = vVarC;
        com.fasterxml.jackson.databind.introspect.o oVar = c36445d.f341613b;
        if (z12) {
            c36446e.c(oVar, true, new v[]{h(fVar, bVar, vVar, 0, nVar, aVar2)});
            return;
        }
        f(c36446e, oVar, true, true);
        com.fasterxml.jackson.databind.introspect.u uVarD2 = c36445d.d(0);
        if (uVarD2 != null) {
            ((G) uVarD2).f341973i = null;
        }
    }

    public final void b(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, C36446e c36446e, C36445d c36445d) throws InvalidDefinitionException {
        int i12 = c36445d.f341614c;
        v[] vVarArr = new v[i12];
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            C36445d.a aVar = c36445d.f341615d[i14];
            com.fasterxml.jackson.databind.introspect.n nVar = aVar.f341616a;
            InterfaceC36434d.a aVar2 = aVar.f341618c;
            if (aVar2 != null) {
                vVarArr[i14] = h(fVar, bVar, null, i14, nVar, aVar2);
            } else {
                if (i13 >= 0) {
                    fVar.T(bVar, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i13), Integer.valueOf(i14), c36445d);
                    throw null;
                }
                i13 = i14;
            }
        }
        if (i13 < 0) {
            fVar.T(bVar, "No argument left as delegating for Creator %s: exactly one required", c36445d);
            throw null;
        }
        com.fasterxml.jackson.databind.introspect.o oVar = c36445d.f341613b;
        if (i12 != 1) {
            c36446e.b(oVar, true, vVarArr, i13);
            return;
        }
        f(c36446e, oVar, true, true);
        com.fasterxml.jackson.databind.introspect.u uVarD = c36445d.d(0);
        if (uVarD != null) {
            ((G) uVarD).f341973i = null;
        }
    }

    public final void c(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, C36446e c36446e, C36445d c36445d) throws InvalidDefinitionException {
        int i12 = c36445d.f341614c;
        v[] vVarArr = new v[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            C36445d.a aVar = c36445d.f341615d[i13];
            InterfaceC36434d.a aVar2 = aVar.f341618c;
            com.fasterxml.jackson.databind.introspect.n nVar = aVar.f341616a;
            com.fasterxml.jackson.databind.v vVarC = c36445d.c(i13);
            if (vVarC == null) {
                if (fVar.f341921d.d().d0(nVar) != null) {
                    fVar.T(bVar, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(nVar.f342068f));
                    throw null;
                }
                vVarC = c36445d.b(i13);
                if (vVarC == null && aVar2 == null) {
                    fVar.T(bVar, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i13), c36445d);
                    throw null;
                }
            }
            vVarArr[i13] = h(fVar, bVar, vVarC, i13, nVar, aVar2);
        }
        c36446e.c(c36445d.f341613b, true, vVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.deser.std.H e(com.fasterxml.jackson.databind.b r36, com.fasterxml.jackson.databind.f r37) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.b.e(com.fasterxml.jackson.databind.b, com.fasterxml.jackson.databind.f):com.fasterxml.jackson.databind.deser.std.H");
    }

    public final k h(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.v vVar, int i12, com.fasterxml.jackson.databind.introspect.n nVar, InterfaceC36434d.a aVar) {
        com.fasterxml.jackson.databind.v vVarG0;
        com.fasterxml.jackson.databind.u uVar;
        Nulls nulls;
        Nulls nulls2;
        Nulls nulls3;
        z.a aVarZ;
        com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
        AnnotationIntrospector annotationIntrospectorD = eVar.d();
        if (annotationIntrospectorD == null) {
            uVar = com.fasterxml.jackson.databind.u.f342514k;
            vVarG0 = null;
        } else {
            com.fasterxml.jackson.databind.u uVarA = com.fasterxml.jackson.databind.u.a(annotationIntrospectorD.I(nVar), annotationIntrospectorD.O(nVar), annotationIntrospectorD.H(nVar), annotationIntrospectorD.q0(nVar));
            vVarG0 = annotationIntrospectorD.g0();
            uVar = uVarA;
        }
        com.fasterxml.jackson.databind.h hVarR = r(fVar, nVar, nVar.f342067e);
        com.fasterxml.jackson.databind.jsontype.l lVarO = (com.fasterxml.jackson.databind.jsontype.l) hVarR.f341933e;
        if (lVarO == null) {
            lVarO = o(eVar, hVarR);
        }
        com.fasterxml.jackson.databind.e eVar2 = fVar.f341921d;
        AnnotationIntrospector annotationIntrospectorD2 = eVar2.d();
        Nulls nulls4 = Nulls.f340982e;
        if (annotationIntrospectorD2 == null || (aVarZ = annotationIntrospectorD2.Z(nVar)) == null) {
            nulls = null;
            nulls2 = null;
        } else {
            nulls2 = aVarZ.f341000b;
            if (nulls2 == nulls4) {
                nulls2 = null;
            }
            nulls = aVarZ.f341001c;
            if (nulls == nulls4) {
                nulls = null;
            }
        }
        eVar2.l(hVarR.f341930b).getClass();
        z.a aVar2 = eVar2.f341514h.f341489c;
        if (nulls2 == null && (nulls2 = aVar2.f341000b) == nulls4) {
            nulls2 = null;
        }
        Nulls nulls5 = nulls2;
        if (nulls == null) {
            Nulls nulls6 = aVar2.f341001c;
            nulls3 = nulls6 != nulls4 ? nulls6 : null;
        } else {
            nulls3 = nulls;
        }
        v kVar = new k(vVar, hVarR, vVarG0, lVarO, bVar.l(), nVar, i12, aVar, (nulls5 == null && nulls3 == null) ? uVar : new com.fasterxml.jackson.databind.u(uVar.f342515b, uVar.f342516c, uVar.f342517d, uVar.f342518e, uVar.f342519f, nulls5, nulls3));
        com.fasterxml.jackson.databind.i<?> iVarM = m(fVar, nVar);
        if (iVarM == null) {
            iVarM = (com.fasterxml.jackson.databind.i) hVarR.f341932d;
        }
        if (iVarM != null) {
            kVar = kVar.E(fVar.z(iVarM, kVar, hVarR));
        }
        return (k) kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.i<?> k(com.fasterxml.jackson.databind.f r11, com.fasterxml.jackson.databind.type.e r12, com.fasterxml.jackson.databind.b r13) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.b.k(com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.type.e, com.fasterxml.jackson.databind.b):com.fasterxml.jackson.databind.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        r2 = new java.lang.StringBuilder("Unsuitable method (");
        r2.append(r10);
        r2.append(") decorated with @JsonCreator (for Enum type ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        throw new java.lang.IllegalArgumentException(com.akita.compose.theme.re23.style.C0.f(r1, r2, ")"));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.m l(com.fasterxml.jackson.databind.f r17, com.fasterxml.jackson.databind.h r18) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.b.l(com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.h):com.fasterxml.jackson.databind.m");
    }

    public final com.fasterxml.jackson.databind.jsontype.l o(com.fasterxml.jackson.databind.e eVar, com.fasterxml.jackson.databind.h hVar) {
        com.fasterxml.jackson.databind.introspect.s sVar = (com.fasterxml.jackson.databind.introspect.s) eVar.i(hVar.f341930b);
        AnnotationIntrospector annotationIntrospectorD = eVar.d();
        C36465d c36465d = sVar.f342086e;
        com.fasterxml.jackson.databind.jsontype.n nVarC0 = annotationIntrospectorD.c0(hVar, eVar, c36465d);
        if (nVarC0 == null) {
            eVar.f341506c.getClass();
            return null;
        }
        Collection<com.fasterxml.jackson.databind.jsontype.j> collectionE = eVar.f341511e.e(eVar, c36465d);
        if (nVarC0.b() == null && hVar.y()) {
            com.fasterxml.jackson.databind.h hVarQ = q(eVar, hVar);
            if (!hVarQ.x(hVar.f341930b)) {
                nVarC0 = nVarC0.f(hVarQ.f341930b);
            }
        }
        try {
            return nVarC0.c(eVar, hVar, collectionE);
        } catch (IllegalArgumentException | IllegalStateException e12) {
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(null, com.fasterxml.jackson.databind.util.g.i(e12));
            invalidDefinitionException.initCause(e12);
            throw invalidDefinitionException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.deser.x p(com.fasterxml.jackson.databind.b r5, com.fasterxml.jackson.databind.f r6) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.e r0 = r6.f341921d
            com.fasterxml.jackson.databind.introspect.d r1 = r5.m()
            com.fasterxml.jackson.databind.e r2 = r6.f341921d
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r2.d()
            java.lang.Object r1 = r2.e0(r1)
            r2 = 0
            if (r1 == 0) goto L76
            boolean r3 = r1 instanceof com.fasterxml.jackson.databind.deser.x
            if (r3 == 0) goto L1a
            com.fasterxml.jackson.databind.deser.x r1 = (com.fasterxml.jackson.databind.deser.x) r1
            goto L77
        L1a:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L55
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r3 = com.fasterxml.jackson.databind.util.g.v(r1)
            if (r3 == 0) goto L27
            goto L76
        L27:
            java.lang.Class<com.fasterxml.jackson.databind.deser.x> r3 = com.fasterxml.jackson.databind.deser.x.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L42
            com.fasterxml.jackson.databind.cfg.a r3 = r0.f341506c
            r3.getClass()
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r0 = r0.k(r3)
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.g.h(r0, r1)
            r1 = r0
            com.fasterxml.jackson.databind.deser.x r1 = (com.fasterxml.jackson.databind.deser.x) r1
            goto L77
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            r6.<init>(r0)
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.String r6 = com.akita.compose.theme.re23.style.C0.f(r1, r6, r0)
            r5.<init>(r6)
            throw r5
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "AnnotationIntrospector returned key deserializer definition of type "
            r6.<init>(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            r6.append(r0)
            java.lang.String r0 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L76:
            r1 = r2
        L77:
            if (r1 != 0) goto L87
            com.fasterxml.jackson.databind.h r0 = r5.f341454a
            java.lang.Class<?> r0 = r0.f341930b
            com.fasterxml.jackson.databind.deser.x$a r1 = com.fasterxml.jackson.databind.deser.impl.k.a(r0)
            if (r1 != 0) goto L87
            com.fasterxml.jackson.databind.deser.std.H r1 = r4.e(r5, r6)
        L87:
            com.fasterxml.jackson.databind.cfg.h r0 = r4.f341529c
            com.fasterxml.jackson.databind.deser.y[] r0 = r0.f341504f
            int r3 = r0.length
            if (r3 <= 0) goto Lb8
            com.fasterxml.jackson.databind.util.c r3 = new com.fasterxml.jackson.databind.util.c
            r3.<init>(r0)
        L93:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r3.next()
            com.fasterxml.jackson.databind.deser.y r0 = (com.fasterxml.jackson.databind.deser.y) r0
            com.fasterxml.jackson.databind.deser.x r1 = r0.a(r5, r1)
            if (r1 == 0) goto La6
            goto L93
        La6:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator"
            r6.T(r5, r1, r0)
            throw r2
        Lb8:
            com.fasterxml.jackson.databind.deser.x r5 = r1.n(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.b.p(com.fasterxml.jackson.databind.b, com.fasterxml.jackson.databind.f):com.fasterxml.jackson.databind.deser.x");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.fasterxml.jackson.databind.h q(com.fasterxml.jackson.databind.e eVar, com.fasterxml.jackson.databind.h hVar) {
        com.fasterxml.jackson.databind.h hVar2;
        while (true) {
            Class<?> cls = hVar.f341930b;
            AbstractC36441a[] abstractC36441aArr = this.f341529c.f341503e;
            if (abstractC36441aArr.length > 0) {
                C36497c c36497c = new C36497c(abstractC36441aArr);
                while (c36497c.hasNext()) {
                    com.fasterxml.jackson.databind.h hVarA = ((AbstractC36441a) c36497c.next()).a(eVar, hVar);
                    if (hVarA != null && !hVarA.x(cls)) {
                        hVar2 = hVarA;
                        break;
                    }
                }
                hVar2 = null;
            } else {
                hVar2 = null;
            }
            if (hVar2 == null) {
                return hVar;
            }
            Class<?> cls2 = hVar.f341930b;
            Class<?> cls3 = hVar2.f341930b;
            if (cls2 == cls3 || !cls2.isAssignableFrom(cls3)) {
                break;
            }
            hVar = hVar2;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + hVar + " to " + hVar2 + ": latter is not a subtype of former");
    }

    public final com.fasterxml.jackson.databind.h r(com.fasterxml.jackson.databind.f fVar, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.h hVar) {
        Object objC;
        com.fasterxml.jackson.databind.m mVarP;
        AnnotationIntrospector annotationIntrospectorD = fVar.f341921d.d();
        if (annotationIntrospectorD == null) {
            return hVar;
        }
        if (hVar.G() && hVar.r() != null && (mVarP = fVar.P(abstractC36471j, annotationIntrospectorD.s(abstractC36471j))) != null) {
            hVar = ((com.fasterxml.jackson.databind.type.f) hVar).Z(mVarP);
        }
        boolean zU2 = hVar.u();
        com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
        if (zU2) {
            com.fasterxml.jackson.databind.i<Object> iVarM = fVar.m(abstractC36471j, annotationIntrospectorD.c(abstractC36471j));
            if (iVarM != null) {
                hVar = hVar.O(iVarM);
            }
            com.fasterxml.jackson.databind.jsontype.n<?> nVarG = eVar.d().G(eVar, abstractC36471j, hVar);
            com.fasterxml.jackson.databind.h hVarN = hVar.n();
            Object objO = nVarG == null ? o(eVar, hVarN) : nVarG.c(eVar, hVarN, eVar.f341511e.f(eVar, abstractC36471j, hVarN));
            if (objO != null) {
                hVar = hVar.N(objO);
            }
        }
        com.fasterxml.jackson.databind.jsontype.n<?> nVarP = eVar.d().P(eVar, abstractC36471j, hVar);
        if (nVarP == null) {
            objC = o(eVar, hVar);
        } else {
            try {
                objC = nVarP.c(eVar, hVar, eVar.f341511e.f(eVar, abstractC36471j, hVar));
            } catch (IllegalArgumentException | IllegalStateException e12) {
                InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(null, com.fasterxml.jackson.databind.util.g.i(e12));
                invalidDefinitionException.initCause(e12);
                throw invalidDefinitionException;
            }
        }
        if (objC != null) {
            hVar = hVar.R(objC);
        }
        return annotationIntrospectorD.u0(eVar, abstractC36471j, hVar);
    }
}
