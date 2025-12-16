package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.field.MergePolicy;
import com.avito.beduin.v2.engine.field.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PatchField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/t;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class t implements com.avito.beduin.v2.engine.field.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MergePolicy f336829b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d f336830c;

    public t(@Y61.k MergePolicy mergePolicy, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        this.f336829b = mergePolicy;
        this.f336830c = dVar;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.g(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return h(zVar).equals(dVar.h(zVar));
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.c(zVar, this);
        throw null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f336829b, tVar.f336829b) && L.f(this.f336830c, tVar.f336830c);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.f(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d h(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return new t(this.f336829b, this.f336830c.h(zVar));
    }

    public final int hashCode() {
        return this.f336830c.hashCode() + (this.f336829b.hashCode() * 31);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.d(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.a(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return new u(zVar.A(), this.f336830c.m(zVar), this.f336829b);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.e(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.b(zVar, this);
        throw null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PatchData(");
        sb2.append("value=" + this.f336830c + ", ");
        StringBuilder sb3 = new StringBuilder("mergePolicy=");
        sb3.append(this.f336829b);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }
}
