package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.field.f;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyField.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/g;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/entity/f;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g implements com.avito.beduin.v2.engine.field.f<f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336801b;

    public g(@Y61.k com.avito.beduin.v2.engine.field.j jVar) {
        this.f336801b = jVar;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
        return f.f336800b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.a(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return B0.f406639b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && L.f(this.f336801b, ((g) obj).f336801b);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
        return fVar instanceof g ? this : fVar.l(this.f336801b).h();
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336801b() {
        return this.f336801b;
    }

    public final int hashCode() {
        return this.f336801b.hashCode();
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
        return new g(jVar);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336801b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return this;
    }
}
