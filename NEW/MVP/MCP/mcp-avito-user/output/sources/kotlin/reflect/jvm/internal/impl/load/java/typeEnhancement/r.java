package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.B;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: signatureEnhancement.kt */
@s0
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f408392a;

    public r(@Y61.k g gVar) {
        this.f408392a = gVar;
    }

    public final O a(kotlin.reflect.jvm.internal.impl.load.java.descriptors.a aVar, InterfaceC42848a interfaceC42848a, boolean z12, kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, v vVar, boolean z13, Y41.l lVar) {
        t tVar = new t(interfaceC42848a, z12, hVar, annotationQualifierApplicabilityType, false, 16, null);
        O o12 = (O) lVar.invoke(aVar);
        Collection<? extends CallableMemberDescriptor> collectionP = aVar.p();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionP, 10));
        Iterator<T> it = collectionP.iterator();
        while (it.hasNext()) {
            arrayList.add((O) lVar.invoke((CallableMemberDescriptor) it.next()));
        }
        return b(tVar, o12, arrayList, vVar, z13);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.O b(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.t r25, kotlin.reflect.jvm.internal.impl.types.O r26, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.O> r27, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.v r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r.b(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.t, kotlin.reflect.jvm.internal.impl.types.O, java.util.List, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.v, boolean):kotlin.reflect.jvm.internal.impl.types.O");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h r29, @Y61.k java.util.Collection r30) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r.c(kotlin.reflect.jvm.internal.impl.load.java.lazy.h, java.util.Collection):java.util.ArrayList");
    }

    @Y61.k
    public final O d(@Y61.k O o12, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar) {
        O oB2 = b(new t(null, false, hVar, AnnotationQualifierApplicabilityType.f407900f, true), o12, C42784z0.f406748b, null, false);
        return oB2 == null ? o12 : oB2;
    }

    @Y61.k
    public final ArrayList e(@Y61.k B b12, @Y61.k List list, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar) {
        List<O> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (O o12 : list2) {
            if (!G0.d(o12, q.f408391l, null)) {
                O oB2 = b(new t(b12, false, hVar, AnnotationQualifierApplicabilityType.f407901g, false, 16, null), o12, C42784z0.f406748b, null, false);
                if (oB2 != null) {
                    o12 = oB2;
                }
            }
            arrayList.add(o12);
        }
        return arrayList;
    }
}
