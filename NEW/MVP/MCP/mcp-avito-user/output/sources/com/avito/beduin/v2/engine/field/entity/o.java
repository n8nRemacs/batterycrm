package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.core.K;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RawField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/o;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class o implements com.avito.beduin.v2.engine.field.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final K<com.avito.beduin.v2.engine.field.d> f336817b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k K<? extends com.avito.beduin.v2.engine.field.d> k12) {
        this.f336817b = k12;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).a(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return L.f(h(zVar), dVar.h(zVar));
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).c(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).e(zVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && L.f(this.f336817b, ((o) obj).f336817b);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).g(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d h(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).h(zVar);
    }

    public final int hashCode() {
        return this.f336817b.hashCode();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).k(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).l(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).m(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).q(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this.f336817b.k(zVar).r(zVar);
    }

    @Y61.k
    public final String toString() {
        return "LazyData(value=" + this.f336817b + ')';
    }
}
