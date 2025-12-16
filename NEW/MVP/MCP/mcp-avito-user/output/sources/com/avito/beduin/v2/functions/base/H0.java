package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: StructureEntriesFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/H0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final H0 f336963a = new H0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336964b = "StructureEntries";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.A aX2 = mVar.x(zVar, "structure");
        if (aX2 == null) {
            return new C36268a(C42784z0.f406748b);
        }
        Map<String, com.avito.beduin.v2.engine.field.d> map = aX2.f336778b.f336870a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : map.entrySet()) {
            arrayList.add(new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new kotlin.Q[]{new kotlin.Q("key", C36273j.e(zVar, entry.getKey())), new kotlin.Q("value", entry.getValue())}), null, 2, null));
        }
        return new C36268a(arrayList);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414539b() {
        return f336964b;
    }
}
