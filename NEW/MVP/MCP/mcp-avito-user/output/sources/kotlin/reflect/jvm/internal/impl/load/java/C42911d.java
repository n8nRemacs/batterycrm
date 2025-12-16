package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42939b;

/* compiled from: AnnotationTypeQualifierResolver.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42911d extends AbstractC42908a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
    public static List l(kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar) {
        if (!(gVar instanceof C42939b)) {
            return gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.k ? Collections.singletonList(((kotlin.reflect.jvm.internal.impl.resolve.constants.k) gVar).f409590c.c()) : C42784z0.f406748b;
        }
        Iterable iterable = (Iterable) ((C42939b) gVar).f409586a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C42745f0.h(l((kotlin.reflect.jvm.internal.impl.resolve.constants.g) it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC42908a
    public final ArrayList a(Object obj, boolean z12) {
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> mapB = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) obj).b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> entry : mapB.entrySet()) {
            C42745f0.h((!z12 || L.f(entry.getKey(), E.f407915b)) ? l(entry.getValue()) : C42784z0.f406748b, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC42908a
    public final kotlin.reflect.jvm.internal.impl.name.c e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        return cVar.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC42908a
    public final InterfaceC42851d f(Object obj) {
        return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.d((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC42908a
    public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> g(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations;
        InterfaceC42851d interfaceC42851dD = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.d(cVar);
        return (interfaceC42851dD == null || (annotations = interfaceC42851dD.getAnnotations()) == null) ? C42784z0.f406748b : annotations;
    }
}
