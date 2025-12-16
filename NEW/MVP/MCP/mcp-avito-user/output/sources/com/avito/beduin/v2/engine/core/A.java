package com.avito.beduin.v2.engine.core;

import kotlin.Metadata;

/* compiled from: StaticValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/core/A;", "Lcom/avito/beduin/v2/engine/core/G;", "Lcom/avito/beduin/v2/engine/field/entity/A;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class A extends G<com.avito.beduin.v2.engine.field.entity.A> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.A f336589a;

    public A(@Y61.k com.avito.beduin.v2.engine.field.entity.A a12) {
        this.f336589a = a12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && kotlin.jvm.internal.L.f(this.f336589a, ((A) obj).f336589a);
    }

    public final int hashCode() {
        return this.f336589a.hashCode();
    }

    @Override // com.avito.beduin.v2.engine.core.K
    public final Object k(z zVar) {
        return this.f336589a;
    }

    @Y61.k
    public final String toString() {
        return "ScopeContainerValue(container=" + this.f336589a + ')';
    }
}
