package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: OrFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/t0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.t0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36313t0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36313t0 f337126a = new C36313t0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337127b = "Or";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        boolean zE2 = mVar.e(zVar, "value1");
        boolean z12 = true;
        if (zE2) {
            return C36273j.f(zVar, true);
        }
        boolean zE3 = mVar.e(zVar, "value2");
        f337126a.getClass();
        if (!zE2 && !zE3) {
            z12 = false;
        }
        return C36273j.f(zVar, z12);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337127b;
    }
}
