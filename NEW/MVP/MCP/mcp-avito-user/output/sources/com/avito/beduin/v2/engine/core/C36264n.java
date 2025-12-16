package com.avito.beduin.v2.engine.core;

import kotlin.Metadata;

/* compiled from: StaticValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/core/n;", "T", "Lcom/avito/beduin/v2/engine/core/G;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C36264n<T> extends G<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336676a;

    /* renamed from: b, reason: collision with root package name */
    public final T f336677b;

    public C36264n(@Y61.k com.avito.beduin.v2.engine.field.j jVar, T t12) {
        this.f336676a = jVar;
        this.f336677b = t12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36264n)) {
            return false;
        }
        C36264n c36264n = (C36264n) obj;
        return kotlin.jvm.internal.L.f(this.f336676a, c36264n.f336676a) && kotlin.jvm.internal.L.f(this.f336677b, c36264n.f336677b);
    }

    public final int hashCode() {
        int iHashCode = this.f336676a.hashCode() * 31;
        T t12 = this.f336677b;
        return iHashCode + (t12 == null ? 0 : t12.hashCode());
    }

    @Override // com.avito.beduin.v2.engine.core.K
    public final T k(@Y61.k z zVar) {
        return this.f336677b;
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.n(new StringBuilder("ConstValue(currentValue="), this.f336677b, ')');
    }
}
