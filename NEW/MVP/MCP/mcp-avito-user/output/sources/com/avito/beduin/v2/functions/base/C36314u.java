package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: CheckNullFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/u;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36314u extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36314u f337128a = new C36314u();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337129b = "CheckNull";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.d dVarP = mVar.p(zVar, "value");
        if (dVarP == null) {
            dVarP = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        return C36273j.f(zVar, kotlin.jvm.internal.L.f(dVarP, com.avito.beduin.v2.engine.field.entity.f.f336800b));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337129b;
    }
}
