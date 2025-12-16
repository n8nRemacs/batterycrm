package com.avito.beduin.v2.engine.component;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetaComponentBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/component/y;", "Lcom/avito/beduin/v2/engine/component/b;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class y implements InterfaceC36242b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.field.h f336587a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.d f336588b;

    public y(@Y61.l com.avito.beduin.v2.engine.field.h hVar, @Y61.k com.avito.beduin.v2.engine.field.entity.d dVar) {
        this.f336587a = hVar;
        this.f336588b = dVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f336587a, yVar.f336587a) && L.f(this.f336588b, yVar.f336588b);
    }

    public final int hashCode() {
        com.avito.beduin.v2.engine.field.h hVar = this.f336587a;
        return this.f336588b.hashCode() + ((hVar == null ? 0 : hVar.f336867a.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        return "MetaComponentBlueprint(params=" + this.f336587a + ", result=" + this.f336588b + ')';
    }
}
