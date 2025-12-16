package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: StructureKeysFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/J0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J0 f336973a = new J0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336974b = "StructureKeys";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.A aX2 = mVar.x(zVar, "structure");
        if (aX2 == null) {
            return new C36268a(C42784z0.f406748b);
        }
        Map<String, com.avito.beduin.v2.engine.field.d> map = aX2.f336778b.f336870a;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, com.avito.beduin.v2.engine.field.d>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(C36273j.e(zVar, it.next().getKey()));
        }
        return new C36268a(arrayList);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414534b() {
        return f336974b;
    }
}
