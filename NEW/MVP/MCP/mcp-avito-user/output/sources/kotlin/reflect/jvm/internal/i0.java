package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42893e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42956m;

/* compiled from: util.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001an\u0010\u0011\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/protobuf/o;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "D", "Ljava/lang/Class;", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/a;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/z;", "Lkotlin/w;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;LY41/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(LY41/a;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/descriptors/X;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407157a = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmStatic");

    /* compiled from: util.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f407158a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.f407160g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.f407161h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.f407162i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.f407163j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.f407164k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.f407165l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.f407166m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.f407167n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f407158a = iArr;
        }
    }

    @Y61.l
    public static final AbstractC43003l a(@Y61.l kotlin.reflect.c cVar) {
        AbstractC43003l abstractC43003l = cVar instanceof AbstractC43003l ? (AbstractC43003l) cVar : null;
        if (abstractC43003l != null) {
            return abstractC43003l;
        }
        A aB2 = b(cVar);
        return aB2 != null ? aB2 : c(cVar);
    }

    @Y61.l
    public static final A b(@Y61.l Object obj) {
        A a12 = obj instanceof A ? (A) obj : null;
        if (a12 != null) {
            return a12;
        }
        kotlin.jvm.internal.G g12 = obj instanceof kotlin.jvm.internal.G ? (kotlin.jvm.internal.G) obj : null;
        kotlin.reflect.c cVarCompute = g12 != null ? g12.compute() : null;
        if (cVarCompute instanceof A) {
            return (A) cVarCompute;
        }
        return null;
    }

    @Y61.l
    public static final N<?> c(@Y61.l Object obj) {
        N<?> n12 = obj instanceof N ? (N) obj : null;
        if (n12 != null) {
            return n12;
        }
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        kotlin.reflect.c cVarCompute = k0Var != null ? k0Var.compute() : null;
        if (cVarCompute instanceof N) {
            return (N) cVarCompute;
        }
        return null;
    }

    @Y61.k
    public static final ArrayList d(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar) {
        Annotation annotationH;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : annotations) {
            kotlin.reflect.jvm.internal.impl.descriptors.b0 b0VarE = cVar.e();
            if (b0VarE instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b) {
                annotationH = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b) b0VarE).f407805b;
            } else if (b0VarE instanceof l.a) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x xVar = ((l.a) b0VarE).f407819b;
                C42893e c42893e = xVar instanceof C42893e ? (C42893e) xVar : null;
                annotationH = c42893e != null ? c42893e.f407855a : null;
            } else {
                annotationH = h(cVar);
            }
            if (annotationH != null) {
                arrayList.add(annotationH);
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((InterfaceC42819t) X41.b.a((Annotation) it.next())).f().getSimpleName().equals("Container")) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Annotation annotation = (Annotation) it2.next();
                    Class<?> clsF = ((InterfaceC42819t) X41.b.a(annotation)).f();
                    C42745f0.h((!clsF.getSimpleName().equals("Container") || clsF.getAnnotation(o0.class) == null) ? Collections.singletonList(annotation) : Arrays.asList((Annotation[]) clsF.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0])), arrayList2);
                }
                return arrayList2;
            }
        }
        return arrayList;
    }

    @Y61.l
    public static final Object e(@Y61.k Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    @Y61.k
    public static final InterfaceC42848a f(@Y61.k Class cls, @Y61.k h.d dVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @Y61.k Y41.p pVar) {
        List<ProtoBuf.TypeParameter> list;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVarA = Y.a(cls);
        if (dVar instanceof ProtoBuf.e) {
            list = ((ProtoBuf.e) dVar).f408925j;
        } else {
            if (!(dVar instanceof ProtoBuf.h)) {
                throw new IllegalStateException(("Unsupported message: " + dVar).toString());
            }
            list = ((ProtoBuf.h) dVar).f408993j;
        }
        List<ProtoBuf.TypeParameter> list2 = list;
        C42954k c42954k = kVarA.f407816a;
        kotlin.reflect.jvm.internal.impl.descriptors.E e12 = c42954k.f409915b;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f409142b.getClass();
        return (InterfaceC42848a) pVar.invoke(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.z(new C42956m(c42954k, cVar, e12, gVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f409143c, aVar, null, null, list2)), dVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class<?> g(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.b bVar, int i12) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407238a;
        kotlin.reflect.jvm.internal.impl.name.d dVarI = bVar.b().i();
        cVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.b bVarE = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.e(dVarI);
        if (bVarE != null) {
            bVar = bVarE;
        }
        String strB = bVar.g().b();
        String strB2 = bVar.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i12 > 0) {
            for (int i13 = 0; i13 < i12; i13++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (strB.length() > 0) {
            sb2.append(strB.concat("."));
        }
        sb2.append(strB2.replace('.', '$'));
        if (i12 > 0) {
            sb2.append(";");
        }
        try {
            return Class.forName(sb2.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Annotation h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        InterfaceC42851d interfaceC42851dD = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.d(cVar);
        Class<?> clsI = interfaceC42851dD != null ? i(interfaceC42851dD) : null;
        if (clsI == null) {
            clsI = null;
        }
        if (clsI == null) {
            return null;
        }
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> setEntrySet = cVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            Object objJ = j((kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue(), clsI.getClassLoader());
            kotlin.Q q12 = objJ != null ? new kotlin.Q(fVar.b(), objJ) : null;
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        Map mapP = P0.p(arrayList);
        Set setKeySet = mapP.keySet();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsI.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return (Annotation) kotlin.reflect.jvm.internal.calls.b.a(clsI, mapP, arrayList2);
    }

    @Y61.l
    public static final Class<?> i(@Y61.k InterfaceC42851d interfaceC42851d) {
        kotlin.reflect.jvm.internal.impl.descriptors.b0 b0VarE = interfaceC42851d.e();
        if (b0VarE instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.B) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) ((kotlin.reflect.jvm.internal.impl.load.kotlin.B) b0VarE).f408429b).f407809a;
        }
        if (b0VarE instanceof l.a) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t) ((l.a) b0VarE).f407819b).f407871a;
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarF = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(interfaceC42851d);
        if (bVarF == null) {
            return null;
        }
        Class<?> cls = interfaceC42851d.getClass();
        List<kotlin.reflect.d<? extends Object>> list = C42892d.f407849a;
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return g(classLoader, bVarF, 0);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r8v15, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r8v17, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v19, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v20, types: [float[]] */
    /* JADX WARN: Type inference failed for: r8v21, types: [long[]] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r7, java.lang.ClassLoader r8) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.i0.j(kotlin.reflect.jvm.internal.impl.resolve.constants.g, java.lang.ClassLoader):java.lang.Object");
    }
}
