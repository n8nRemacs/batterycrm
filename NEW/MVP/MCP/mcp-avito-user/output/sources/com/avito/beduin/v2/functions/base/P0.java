package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SumFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/P0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class P0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final P0 f336995a = new P0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336996b = "Sum";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Iterable iterable;
        C36268a c36268aN = mVar.n(zVar, "array");
        if (c36268aN == null || (iterable = c36268aN.f336782b) == null) {
            iterable = C42784z0.f406748b;
        }
        Iterator it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            com.avito.beduin.v2.engine.field.entity.v vVarQ = ((com.avito.beduin.v2.engine.field.d) it.next()).q(zVar);
            Long lValueOf = vVarQ != null ? Long.valueOf(vVarQ.getF336840b()) : null;
            jLongValue += lValueOf != null ? lValueOf.longValue() : 0L;
        }
        return C36273j.d(zVar, jLongValue);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414527b() {
        return f336996b;
    }
}
