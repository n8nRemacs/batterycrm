package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import kotlin.Metadata;

/* compiled from: CreateMarkerFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/I;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class I extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final I f336965a = new I();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336966b = "CreateMarker";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        return new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new kotlin.Q[]{new kotlin.Q("tag", C36273j.e(zVar, com.avito.beduin.v2.engine.utils.f.a()))}), null, 2, null);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF415152b() {
        return f336966b;
    }
}
