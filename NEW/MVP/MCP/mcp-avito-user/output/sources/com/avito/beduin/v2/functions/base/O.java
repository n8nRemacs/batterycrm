package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.functions.base.C36279c;
import com.avito.beduin.v2.functions.base.C36279c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FilterFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/O;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class O extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final O f336991a = new O();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336992b = "Filter";

    /* JADX WARN: Finally extract failed */
    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Object c36268a;
        String str = "items";
        List<com.avito.beduin.v2.engine.field.d> list = mVar.d(zVar, "items").f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.beduin.v2.engine.field.d) it.next()).c(zVar));
        }
        com.avito.beduin.v2.engine.field.entity.x xVarV = mVar.v(zVar, "predicate");
        if (xVarV == null) {
            com.avito.beduin.v2.engine.field.a.f336767b.getClass();
            xVarV = new com.avito.beduin.v2.engine.field.entity.x(com.avito.beduin.v2.engine.field.a.f336768c, new com.avito.beduin.v2.engine.field.entity.g(zVar.A()), "", null);
        }
        C36279c c36279c = new C36279c(xVarV, "it", "index");
        boolean zF2 = zVar.F();
        List listU = C42745f0.U(xVarV, arrayList);
        LinkedHashSet linkedHashSet = c36279c.f337049c;
        int i12 = 0;
        if (zF2) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@result", listU);
            if (!interfaceC36252bK.getF336616h()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
                try {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) next;
                        String str2 = str + '[' + i12 + ']';
                        try {
                            C36279c.b bVar = c36279c.new b();
                            String str3 = str;
                            LinkedHashMap linkedHashMap = bVar.f337052a;
                            if (linkedHashSet.contains("it")) {
                                linkedHashMap.put("it", dVar);
                            }
                            if (linkedHashSet.contains("index")) {
                                linkedHashMap.put("index", C36273j.c(zVarG, i12));
                            }
                            C36279c.a aVarA = bVar.a();
                            InterfaceC36252b interfaceC36252bE = zVarG.E(zVarG.getF336696a(), String.valueOf(i12), aVarA);
                            zVarG.w(interfaceC36252bE);
                            if (!interfaceC36252bE.getF336616h()) {
                                com.avito.beduin.v2.engine.core.z zVarG2 = interfaceC36252bE.g();
                                try {
                                    com.avito.beduin.v2.engine.field.entity.v vVarQ = xVarV.o(zVarG2, aVarA.a()).q(zVarG2);
                                    interfaceC36252bE.l(vVarQ != null ? Boolean.valueOf(vVarQ.getF336837b()) : null);
                                } catch (Throwable th2) {
                                    interfaceC36252bE.l(null);
                                    throw th2;
                                }
                            }
                            if (kotlin.jvm.internal.L.f(interfaceC36252bE.getF336702c(), Boolean.TRUE)) {
                                arrayList2.add(next);
                            }
                            i12 = i13;
                            str = str3;
                        } catch (Exception e12) {
                            throw new BeduinPropertyException(str2, e12);
                        }
                    }
                    interfaceC36252bK.l(new C36268a(arrayList2));
                } catch (Throwable th3) {
                    interfaceC36252bK.l(null);
                    throw th3;
                }
            }
            c36268a = interfaceC36252bK.getF336702c();
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int i14 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.beduin.v2.engine.field.d dVar2 = (com.avito.beduin.v2.engine.field.d) next2;
                String strP = androidx.appcompat.app.r.p("items[", i12, ']');
                try {
                    C36279c.b bVar2 = c36279c.new b();
                    LinkedHashMap linkedHashMap2 = bVar2.f337052a;
                    if (linkedHashSet.contains("it")) {
                        linkedHashMap2.put("it", dVar2);
                    }
                    if (linkedHashSet.contains("index")) {
                        linkedHashMap2.put("index", C36273j.c(zVar, i12));
                    }
                    C36279c.a aVarA2 = bVar2.a();
                    InterfaceC36252b interfaceC36252bE2 = zVar.E(zVar.getF336696a(), String.valueOf(i12), aVarA2);
                    zVar.w(interfaceC36252bE2);
                    if (!interfaceC36252bE2.getF336616h()) {
                        com.avito.beduin.v2.engine.core.z zVarG3 = interfaceC36252bE2.g();
                        try {
                            com.avito.beduin.v2.engine.field.entity.v vVarQ2 = xVarV.o(zVarG3, aVarA2.a()).q(zVarG3);
                            interfaceC36252bE2.l(vVarQ2 != null ? Boolean.valueOf(vVarQ2.getF336837b()) : null);
                        } catch (Throwable th4) {
                            interfaceC36252bE2.l(null);
                            throw th4;
                        }
                    }
                    if (kotlin.jvm.internal.L.f(interfaceC36252bE2.getF336702c(), Boolean.TRUE)) {
                        arrayList3.add(next2);
                    }
                    i12 = i14;
                } catch (Exception e13) {
                    throw new BeduinPropertyException(strP, e13);
                }
            }
            c36268a = new C36268a(arrayList3);
        }
        return (C36268a) c36268a;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f336992b;
    }
}
