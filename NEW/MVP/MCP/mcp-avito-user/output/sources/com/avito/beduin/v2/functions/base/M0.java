package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SubArrayFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/M0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class M0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final M0 f336985a = new M0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336986b = "SubArray";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        List list;
        C36268a c36268aN = mVar.n(zVar, "array");
        if (c36268aN == null || (list = c36268aN.f336782b) == null) {
            list = C42784z0.f406748b;
        }
        Integer numS = mVar.s(zVar, "fromIndex");
        int iIntValue = numS != null ? numS.intValue() : 0;
        Integer numS2 = mVar.s(zVar, "toIndex");
        return new C36268a(list.subList(iIntValue, numS2 != null ? numS2.intValue() : list.size()));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f336986b;
    }
}
