package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.f;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StructureField.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/B;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/entity/A;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class B implements com.avito.beduin.v2.engine.field.f<A> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336780b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.h f336781c;

    public B(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.h hVar) {
        this.f336780b = jVar;
        this.f336781c = hVar;
    }

    public static B c(B b12, com.avito.beduin.v2.engine.field.j jVar, com.avito.beduin.v2.engine.field.h hVar, int i12) {
        if ((i12 & 1) != 0) {
            jVar = b12.f336780b;
        }
        if ((i12 & 2) != 0) {
            hVar = b12.f336781c;
        }
        b12.getClass();
        return new B(jVar, hVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (str.equals(this.f336780b.getF336873c())) {
            return g(fVar);
        }
        com.avito.beduin.v2.engine.field.h hVar = this.f336781c;
        com.avito.beduin.v2.engine.field.h hVarA = hVar.a(str, fVar);
        return hVarA == hVar ? this : c(this, null, hVarA, 1);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return this.f336781c.b();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return L.f(this.f336780b, b12.f336780b) && L.f(this.f336781c, b12.f336781c);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        com.avito.beduin.v2.engine.field.j jVar = this.f336780b;
        return new A(this.f336781c.e(zVar, map, jVar.c()), jVar.c());
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (!(fVar instanceof B)) {
            return fVar.l(this.f336780b).h();
        }
        com.avito.beduin.v2.engine.field.h hVar = ((B) fVar).f336781c;
        com.avito.beduin.v2.engine.field.h hVar2 = this.f336781c;
        com.avito.beduin.v2.engine.field.h hVarC = hVar2.c(hVar);
        return hVarC == hVar2 ? this : c(this, null, hVarC, 1);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336783b() {
        return this.f336780b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        com.avito.beduin.v2.engine.field.h hVar = this.f336781c;
        com.avito.beduin.v2.engine.field.h hVarH = hVar.h();
        return hVarH == hVar ? this : c(this, null, hVarH, 1);
    }

    public final int hashCode() {
        return this.f336781c.f336867a.hashCode() + (this.f336780b.hashCode() * 31);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
        return c(this, jVar, null, 2);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StructureField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336780b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("fields=" + this.f336781c);
        sb2.append(")");
        return sb2.toString();
    }
}
