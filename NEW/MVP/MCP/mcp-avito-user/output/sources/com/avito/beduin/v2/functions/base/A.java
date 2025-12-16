package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: CombineArraysFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/A;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A f336929a = new A();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336930b = "CombineArrays";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.avito.beduin.v2.engine.core.z] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        ?? arrayList;
        Object c36268a;
        List<com.avito.beduin.v2.engine.field.d> list;
        List<com.avito.beduin.v2.engine.field.d> listSingletonList;
        C36268a c36268aN = mVar.n(zVar, "arrays");
        if (c36268aN == null || (list = c36268aN.f336782b) == null) {
            arrayList = C42784z0.f406748b;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.avito.beduin.v2.engine.field.d dVarC = ((com.avito.beduin.v2.engine.field.d) it.next()).c(zVar);
                if (dVarC instanceof C36268a) {
                    C36268a c36268a2 = (C36268a) dVarC;
                    c36268a2.getClass();
                    listSingletonList = c36268a2.f336782b;
                } else {
                    listSingletonList = Collections.singletonList(dVarC);
                }
                C42745f0.h(listSingletonList, arrayList2);
            }
            arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((com.avito.beduin.v2.engine.field.d) it2.next()).c(zVar));
            }
        }
        if (zVar.F()) {
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), "@result", arrayList);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336701b()) {
                interfaceC36252bE.g();
                try {
                    interfaceC36252bE.l(new C36268a(arrayList));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            c36268a = interfaceC36252bE.getF336702c();
        } else {
            c36268a = new C36268a(arrayList);
        }
        return (C36268a) c36268a;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414537c() {
        return f336930b;
    }
}
