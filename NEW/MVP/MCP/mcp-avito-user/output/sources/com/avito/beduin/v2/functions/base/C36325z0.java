package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.functions.base.C36279c;
import com.avito.beduin.v2.functions.base.C36279c.b;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ReduceFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/z0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36325z0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36325z0 f337150a = new C36325z0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337151b = "Reduce";

    /* JADX WARN: Type inference failed for: r15v1, types: [T, com.avito.beduin.v2.engine.field.d] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.x xVarK = mVar.k(zVar, "operation");
        C36268a c36268aD = mVar.d(zVar, "items");
        l0.h hVar = new l0.h();
        ?? C12 = mVar.c("default");
        if (C12 == 0) {
            throw new IllegalArgumentException("Property default is mandatory");
        }
        hVar.f406842b = C12;
        C36279c c36279c = new C36279c(xVarK, "it", "acc", "index");
        List<com.avito.beduin.v2.engine.field.d> list = c36268aD.f336782b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            com.avito.beduin.v2.engine.field.d dVar = list.get(i12);
            C36279c.b bVar = c36279c.new b();
            LinkedHashSet linkedHashSet = c36279c.f337049c;
            boolean zContains = linkedHashSet.contains("acc");
            LinkedHashMap linkedHashMap = bVar.f337052a;
            if (zContains) {
                linkedHashMap.put("acc", (com.avito.beduin.v2.engine.field.d) hVar.f406842b);
            }
            if (linkedHashSet.contains("it")) {
                linkedHashMap.put("it", dVar);
            }
            if (linkedHashSet.contains("index")) {
                linkedHashMap.put("index", C36273j.c(zVar, i12));
            }
            C36279c.a aVarA = bVar.a();
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), String.valueOf(i12), aVarA);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336616h()) {
                interfaceC36252bE.g();
                try {
                    interfaceC36252bE.l(xVarK.o(zVar, aVarA.a()));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            hVar.f406842b = interfaceC36252bE.getF336702c();
        }
        return (com.avito.beduin.v2.engine.field.d) hVar.f406842b;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337151b;
    }
}
