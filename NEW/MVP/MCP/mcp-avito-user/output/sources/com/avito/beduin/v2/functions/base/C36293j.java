package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ArrayFirstFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/j;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36293j extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36293j f337083a = new C36293j();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337084b = "ArrayFirst";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        List<com.avito.beduin.v2.engine.field.d> list;
        com.avito.beduin.v2.engine.field.d dVar;
        C36268a c36268aN = mVar.n(zVar, "array");
        return (c36268aN == null || (list = c36268aN.f336782b) == null || (dVar = (com.avito.beduin.v2.engine.field.d) C42745f0.G(list)) == null) ? com.avito.beduin.v2.engine.field.entity.f.f336800b : dVar;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF415156b() {
        return f337084b;
    }
}
