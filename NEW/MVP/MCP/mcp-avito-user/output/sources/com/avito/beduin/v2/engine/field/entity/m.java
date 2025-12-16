package com.avito.beduin.v2.engine.field.entity;

import androidx.compose.foundation.H;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.f;
import com.avito.beduin.v2.engine.field.l;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InteractionField.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/m;", "Lcom/avito/beduin/v2/engine/field/l;", "Lcom/avito/beduin/v2/engine/field/entity/l;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m implements com.avito.beduin.v2.engine.field.l<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336813b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f336814c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.h f336815d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> f336816e;

    public m(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.h hVar, @Y61.k Set<com.avito.beduin.v2.engine.field.q> set) {
        this.f336813b = jVar;
        this.f336814c = str;
        this.f336815d = hVar;
        this.f336816e = set;
    }

    public static m c(m mVar, com.avito.beduin.v2.engine.field.j jVar, String str, com.avito.beduin.v2.engine.field.h hVar, int i12) {
        if ((i12 & 1) != 0) {
            jVar = mVar.f336813b;
        }
        if ((i12 & 2) != 0) {
            str = mVar.f336814c;
        }
        if ((i12 & 4) != 0) {
            hVar = mVar.f336815d;
        }
        Set<com.avito.beduin.v2.engine.field.q> set = mVar.f336816e;
        mVar.getClass();
        return new m(jVar, str, hVar, set);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
        String strC = this.f336813b.c();
        Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> mapB = com.avito.beduin.v2.engine.field.a.b(map, this.f336816e);
        return new l(strC, this.f336814c, this.f336815d, mapB, null);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return str.equals(this.f336813b.getF336873c()) ? g(fVar) : this;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return this.f336816e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f336813b, mVar.f336813b) && L.f(this.f336814c, mVar.f336814c) && L.f(this.f336815d, mVar.f336815d) && L.f(this.f336816e, mVar.f336816e);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (!(fVar instanceof m)) {
            return fVar instanceof B ? l.a.a(this, ((B) fVar).f336781c) : fVar.l(this.f336813b).h();
        }
        m mVar = (m) fVar;
        return c(this, null, mVar.f336814c, this.f336815d.c(mVar.f336815d), 9);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336813b() {
        return this.f336813b;
    }

    @Override // com.avito.beduin.v2.engine.field.l
    @Y61.k
    /* renamed from: getParams, reason: from getter */
    public final com.avito.beduin.v2.engine.field.h getF336815d() {
        return this.f336815d;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return l.a.a(this, this.f336815d.h());
    }

    public final int hashCode() {
        return this.f336816e.hashCode() + AK.c.c(H.d(this.f336813b.hashCode() * 31, 31, this.f336814c), 31, this.f336815d.f336867a);
    }

    @Override // com.avito.beduin.v2.engine.field.l
    public final com.avito.beduin.v2.engine.field.f j(com.avito.beduin.v2.engine.field.h hVar) {
        return c(this, null, null, hVar, 11);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
        return c(this, jVar, null, null, 14);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InteractionField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336813b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("interactionType=" + this.f336814c + ", ");
        StringBuilder sb3 = new StringBuilder("params=");
        sb3.append(this.f336815d);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ m(com.avito.beduin.v2.engine.field.j jVar, String str, com.avito.beduin.v2.engine.field.h hVar, Set set, int i12, C42822w c42822w) {
        this(jVar, str, hVar, (i12 & 8) != 0 ? hVar.b() : set);
    }
}
