package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42908a<TAnnotation> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f407992c;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f407993a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<Object, TAnnotation> f407994b = new ConcurrentHashMap<>();

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a$a, reason: collision with other inner class name */
    public static final class C11657a {
        public /* synthetic */ C11657a(C42822w c42822w) {
            this();
        }

        public C11657a() {
        }
    }

    static {
        new C11657a(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String str = annotationQualifierApplicabilityType.f407904b;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, annotationQualifierApplicabilityType);
            }
        }
        f407992c = linkedHashMap;
    }

    public AbstractC42908a(@Y61.k z zVar) {
        this.f407993a = zVar;
    }

    @Y61.k
    public abstract ArrayList a(@Y61.k Object obj, boolean z12);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Map] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.A b(@Y61.l kotlin.reflect.jvm.internal.impl.load.java.A r19, @Y61.k java.lang.Iterable<? extends TAnnotation> r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractC42908a.b(kotlin.reflect.jvm.internal.impl.load.java.A, java.lang.Iterable):kotlin.reflect.jvm.internal.impl.load.java.A");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j c(Y41.l lVar, Object obj) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVarI;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVarI2 = i(obj, ((Boolean) lVar.invoke(obj)).booleanValue());
        if (jVarI2 != null) {
            return jVarI2;
        }
        TAnnotation tannotationK = k(obj);
        if (tannotationK == null) {
            return null;
        }
        ReportLevel reportLevelJ = j(obj);
        if (reportLevelJ == null) {
            reportLevelJ = this.f407993a.f408424a.f407906a;
        }
        reportLevelJ.getClass();
        if (reportLevelJ == ReportLevel.f407957c || (jVarI = i(tannotationK, ((Boolean) lVar.invoke(tannotationK)).booleanValue())) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.a(jVarI, null, reportLevelJ == ReportLevel.f407958d, 1);
    }

    public final TAnnotation d(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        for (TAnnotation tannotation2 : g(tannotation)) {
            if (L.f(e(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    @Y61.l
    public abstract kotlin.reflect.jvm.internal.impl.name.c e(@Y61.k TAnnotation tannotation);

    @Y61.k
    public abstract InterfaceC42851d f(@Y61.k Object obj);

    @Y61.k
    public abstract Iterable<TAnnotation> g(@Y61.k TAnnotation tannotation);

    public final boolean h(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Iterable<TAnnotation> iterableG = g(tannotation);
        if ((iterableG instanceof Collection) && ((Collection) iterableG).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableG.iterator();
        while (it.hasNext()) {
            if (L.f(e(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r7.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r7.equals("MAYBE") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f408312c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j i(TAnnotation r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractC42908a.i(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j");
    }

    public final ReportLevel j(TAnnotation tannotation) {
        String str;
        z zVar = this.f407993a;
        ReportLevel reportLevel = zVar.f408424a.f407908c.get(e(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationD = d(tannotation, C42910c.f407999d);
        if (tannotationD == null || (str = (String) C42745f0.F(a(tannotationD, false))) == null) {
            return null;
        }
        ReportLevel reportLevel2 = zVar.f408424a.f407907b;
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.f407957c;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.f407959e;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.f407958d;
        }
        return null;
    }

    @Y61.l
    public final TAnnotation k(@Y61.k TAnnotation tannotation) {
        TAnnotation tannotationK;
        if (this.f407993a.f408424a.f407910e) {
            return null;
        }
        if (C42745f0.r(C42910c.f408003h, e(tannotation)) || h(tannotation, C42910c.f407997b)) {
            return tannotation;
        }
        if (!h(tannotation, C42910c.f407996a)) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f407994b;
        InterfaceC42851d interfaceC42851dF = f(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(interfaceC42851dF);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = g(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotationK = null;
                break;
            }
            tannotationK = k(it.next());
            if (tannotationK != null) {
                break;
            }
        }
        if (tannotationK == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC42851dF, tannotationK);
        return tannotationPutIfAbsent == null ? tannotationK : tannotationPutIfAbsent;
    }
}
