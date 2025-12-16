package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: CoerceFloatInFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/y;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36322y extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36322y f337144a = new C36322y();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337145b = "CoerceFloatIn";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Double dR2 = mVar.r(zVar, "min");
        double dDoubleValue = dR2 != null ? dR2.doubleValue() : Double.MIN_VALUE;
        Double dR3 = mVar.r(zVar, "max");
        double dDoubleValue2 = dR3 != null ? dR3.doubleValue() : Double.MAX_VALUE;
        Double dR4 = mVar.r(zVar, "value");
        return dR4 != null ? C36273j.b(zVar, kotlin.ranges.s.e(dR4.doubleValue(), dDoubleValue, dDoubleValue2)) : com.avito.beduin.v2.engine.field.entity.f.f336800b;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414527b() {
        return f337145b;
    }
}
