package com.avito.beduin.v2.engine.field.entity;

import androidx.camera.camera2.internal.G;
import androidx.camera.core.Q;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.a;
import com.avito.beduin.v2.engine.field.exception.NotFoundArgException;
import com.avito.beduin.v2.engine.field.exception.NullReferenceException;
import com.avito.beduin.v2.engine.field.f;
import com.avito.beduin.v2.engine.field.r;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ReferenceField.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/z;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class z implements com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336861b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.r f336862c;

    public z(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.r rVar) {
        this.f336861b = jVar;
        this.f336862c = rVar;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) throws NullReferenceException, NotFoundArgException {
        K<? extends com.avito.beduin.v2.engine.field.d> k12;
        com.avito.beduin.v2.engine.field.d dVarC;
        com.avito.beduin.v2.engine.field.r rVar = this.f336862c;
        com.avito.beduin.v2.engine.field.q qVar = rVar.f336880b;
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        if (qVar.f336878c != null) {
            k12 = map.get(qVar);
        } else {
            Object obj = null;
            for (Object obj2 : map.entrySet()) {
                if (L.f(qVar.f336877b, ((com.avito.beduin.v2.engine.field.q) ((Map.Entry) obj2).getKey()).f336877b)) {
                    obj = obj2;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            k12 = entry != null ? (K) entry.getValue() : null;
        }
        String str = rVar.f336879a;
        if (k12 == null || (dVarC = (com.avito.beduin.v2.engine.field.d) k12.k(zVar)) == null) {
            throw new NotFoundArgException(Q.a("Arg '", rVar.f336880b.f336876a, "' (ref: '", str, "') is not found"));
        }
        Iterator it = rVar.f336882d.iterator();
        r.a aVar = rVar.f336881c;
        while (it.hasNext()) {
            r.a aVar2 = (r.a) it.next();
            A a12 = dVarC.a(zVar);
            if (a12 == null) {
                if (aVar.f336885b) {
                    return f.f336800b;
                }
                throw new NullReferenceException(G.h(new StringBuilder("Property '"), aVar.f336884a, "' (ref: '", str, "') is null. You can use '?.' to work with nullable fields"));
            }
            dVarC = a12.f336778b.c(aVar2.f336884a);
            if (dVarC == null) {
                dVarC = f.f336800b;
            }
            aVar = aVar2;
        }
        return dVarC;
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
        return Collections.singleton(this.f336862c.f336880b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f336861b, zVar.f336861b) && L.f(this.f336862c, zVar.f336862c);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        boolean z12 = fVar instanceof z;
        com.avito.beduin.v2.engine.field.j jVar = this.f336861b;
        return z12 ? new z(jVar, ((z) fVar).f336862c) : fVar.l(jVar).h();
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336861b() {
        return this.f336861b;
    }

    public final int hashCode() {
        return this.f336862c.f336879a.hashCode() + (this.f336861b.hashCode() * 31);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> l(@Y61.k com.avito.beduin.v2.engine.field.j jVar) {
        return new z(jVar, this.f336862c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReferenceField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336861b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("refFieldName=" + this.f336862c.f336879a);
        sb2.append(")");
        return sb2.toString();
    }

    public z(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str) {
        this(jVar, new com.avito.beduin.v2.engine.field.r(str));
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return this;
    }
}
