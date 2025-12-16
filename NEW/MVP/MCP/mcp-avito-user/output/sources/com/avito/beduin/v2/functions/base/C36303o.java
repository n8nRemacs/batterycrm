package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ArrayRemoveAtFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/o;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36303o extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36303o f337103a = new C36303o();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337104b = "ArrayRemoveAt";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        C36268a c36268aN = mVar.n(zVar, "array");
        if (c36268aN == null) {
            return com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        Integer numS = mVar.s(zVar, "position");
        if (numS == null) {
            return c36268aN;
        }
        int iIntValue = numS.intValue();
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.addAll(c36268aN.f336782b);
        bVarT.a(iIntValue);
        return new C36268a(C42745f0.p(bVarT));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414537c() {
        return f337104b;
    }
}
