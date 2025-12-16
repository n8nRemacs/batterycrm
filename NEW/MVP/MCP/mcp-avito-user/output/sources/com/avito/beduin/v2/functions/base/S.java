package com.avito.beduin.v2.functions.base;

import androidx.compose.ui.platform.C22491k0;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: FormatUriFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/S;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class S extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final S f337001a = new S();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337002b = "FormatUri";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Map mapC;
        String strL = mVar.l(zVar, "path");
        com.avito.beduin.v2.engine.field.entity.A aX2 = mVar.x(zVar, "queryParams");
        if (aX2 != null) {
            Set<Map.Entry<String, com.avito.beduin.v2.engine.field.d>> setEntrySet = aX2.f336778b.f336870a.entrySet();
            mapC = new LinkedHashMap();
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) entry.getValue();
                String strA = C22491k0.a(']', "queryParams[", str);
                try {
                    com.avito.beduin.v2.engine.field.entity.v vVarQ = dVar.q(zVar);
                    String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                    if (f336843b != null) {
                        mapC.put(str, f336843b);
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                } catch (Exception e12) {
                    throw new BeduinPropertyException(strA, e12);
                }
            }
        } else {
            mapC = kotlin.collections.P0.c();
        }
        HV0.e eVar = new HV0.e(strL);
        eVar.a(mapC);
        return C36273j.e(zVar, eVar.b());
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414539b() {
        return f337002b;
    }
}
