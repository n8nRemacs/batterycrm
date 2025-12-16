package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.functions.base.C36279c;
import com.avito.beduin.v2.functions.base.C36279c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SumOfFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/S0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class S0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final S0 f337003a = new S0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337004b = "SumOf";

    /* JADX WARN: Finally extract failed */
    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Object objD;
        InterfaceC36252b interfaceC36252bE;
        com.avito.beduin.v2.engine.field.entity.x xVarK = mVar.k(zVar, "selector");
        List<com.avito.beduin.v2.engine.field.d> list = mVar.d(zVar, "items").f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.beduin.v2.engine.field.d) it.next()).c(zVar));
        }
        Long lU2 = mVar.u(zVar, "default");
        long jLongValue = lU2 != null ? lU2.longValue() : 0L;
        C36279c c36279c = new C36279c(xVarK, "it");
        boolean zF2 = zVar.F();
        List listU = C42745f0.U(xVarK, arrayList, Long.valueOf(jLongValue));
        LinkedHashSet linkedHashSet = c36279c.f337049c;
        int i12 = 0;
        if (zF2) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@result", listU);
            if (!interfaceC36252bK.getF336616h()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
                try {
                    Iterator it2 = arrayList.iterator();
                    long jLongValue2 = 0;
                    while (it2.hasNext()) {
                        com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) it2.next();
                        C36279c.b bVar = c36279c.new b();
                        if (linkedHashSet.contains("it")) {
                            bVar.f337052a.put("it", dVar);
                        }
                        C36279c.a aVarA = bVar.a();
                        int i13 = i12 + 1;
                        interfaceC36252bE = zVarG.E(zVarG.getF336696a(), String.valueOf(i12), aVarA);
                        zVarG.w(interfaceC36252bE);
                        if (!interfaceC36252bE.getF336616h()) {
                            com.avito.beduin.v2.engine.core.z zVarG2 = interfaceC36252bE.g();
                            try {
                                com.avito.beduin.v2.engine.field.entity.v vVarQ = xVarK.o(zVarG2, aVarA.a()).q(zVarG2);
                                Long lValueOf = vVarQ != null ? Long.valueOf(vVarQ.getF336840b()) : null;
                                interfaceC36252bE.l(Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L));
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        jLongValue2 += ((Number) interfaceC36252bE.getF336702c()).longValue();
                        i12 = i13;
                    }
                    interfaceC36252bK.l(C36273j.d(zVarG, jLongValue + jLongValue2));
                } catch (Throwable th3) {
                    interfaceC36252bK.l(null);
                    throw th3;
                }
            }
            objD = interfaceC36252bK.getF336702c();
        } else {
            Iterator it3 = arrayList.iterator();
            long jLongValue3 = 0;
            while (it3.hasNext()) {
                com.avito.beduin.v2.engine.field.d dVar2 = (com.avito.beduin.v2.engine.field.d) it3.next();
                C36279c.b bVar2 = c36279c.new b();
                if (linkedHashSet.contains("it")) {
                    bVar2.f337052a.put("it", dVar2);
                }
                C36279c.a aVarA2 = bVar2.a();
                int i14 = i12 + 1;
                interfaceC36252bE = zVar.E(zVar.getF336696a(), String.valueOf(i12), aVarA2);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336616h()) {
                    com.avito.beduin.v2.engine.core.z zVarG3 = interfaceC36252bE.g();
                    try {
                        com.avito.beduin.v2.engine.field.entity.v vVarQ2 = xVarK.o(zVarG3, aVarA2.a()).q(zVarG3);
                        Long lValueOf2 = vVarQ2 != null ? Long.valueOf(vVarQ2.getF336840b()) : null;
                        interfaceC36252bE.l(Long.valueOf(lValueOf2 != null ? lValueOf2.longValue() : 0L));
                    } finally {
                        interfaceC36252bE.l(null);
                    }
                }
                jLongValue3 += ((Number) interfaceC36252bE.getF336702c()).longValue();
                i12 = i14;
            }
            objD = C36273j.d(zVar, jLongValue + jLongValue3);
        }
        return (com.avito.beduin.v2.engine.field.entity.v) objD;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337004b;
    }
}
