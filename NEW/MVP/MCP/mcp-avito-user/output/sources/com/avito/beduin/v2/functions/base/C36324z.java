package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: CoerceInFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/z;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36324z extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36324z f337148a = new C36324z();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337149b = "CoerceIn";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Long lU2 = mVar.u(zVar, "min");
        long jLongValue = lU2 != null ? lU2.longValue() : Long.MIN_VALUE;
        Long lU3 = mVar.u(zVar, "max");
        long jLongValue2 = lU3 != null ? lU3.longValue() : Long.MAX_VALUE;
        Long lU4 = mVar.u(zVar, "value");
        return lU4 != null ? C36273j.d(zVar, kotlin.ranges.s.i(lU4.longValue(), jLongValue, jLongValue2)) : com.avito.beduin.v2.engine.field.entity.f.f336800b;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414527b() {
        return f337149b;
    }
}
