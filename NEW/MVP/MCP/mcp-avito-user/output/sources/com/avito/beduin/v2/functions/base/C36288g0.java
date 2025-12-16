package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import kotlin.Metadata;

/* compiled from: MinFloatFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/g0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36288g0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36288g0 f337075a = new C36288g0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337076b = "MinFloat";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        return C36273j.b(zVar, Math.min(mVar.g(zVar, "value1"), mVar.g(zVar, "value2")));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337076b;
    }
}
