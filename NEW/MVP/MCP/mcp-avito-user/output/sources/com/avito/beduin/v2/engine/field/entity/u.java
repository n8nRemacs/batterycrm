package com.avito.beduin.v2.engine.field.entity;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.MergePolicy;
import com.avito.beduin.v2.engine.field.f;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PatchField.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/u;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/entity/t;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u implements com.avito.beduin.v2.engine.field.f<t> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336831b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> f336832c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.k f336833d;

    public u() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar, @Y61.k com.avito.beduin.v2.engine.field.k kVar) {
        this.f336831b = jVar;
        this.f336832c = fVar;
        this.f336833d = kVar;
    }

    public static u c(u uVar, com.avito.beduin.v2.engine.field.j jVar, com.avito.beduin.v2.engine.field.f fVar, int i12) {
        if ((i12 & 1) != 0) {
            jVar = uVar.f336831b;
        }
        if ((i12 & 2) != 0) {
            fVar = uVar.f336832c;
        }
        com.avito.beduin.v2.engine.field.k kVar = uVar.f336833d;
        uVar.getClass();
        return new u(jVar, (com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d>) fVar, kVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
        com.avito.beduin.v2.engine.field.a aVarA = com.avito.beduin.v2.engine.field.a.a(map);
        com.avito.beduin.v2.engine.field.k kVar = this.f336833d;
        InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@mergePolicy", C42745f0.U(kVar, aVarA));
        if (!interfaceC36252bK.getF336616h()) {
            try {
                interfaceC36252bK.l(kVar.a(interfaceC36252bK.g(), map));
            } finally {
            }
        }
        MergePolicy mergePolicy = (MergePolicy) interfaceC36252bK.getF336702c();
        com.avito.beduin.v2.engine.field.a aVarA2 = com.avito.beduin.v2.engine.field.a.a(map);
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar = this.f336832c;
        interfaceC36252bK = C31685o.k(zVar, "@value", C42745f0.U(fVar, aVarA2));
        if (!interfaceC36252bK.getF336616h()) {
            try {
                interfaceC36252bK.l(fVar.a(interfaceC36252bK.g(), map));
            } finally {
            }
        }
        return new t(mergePolicy, (com.avito.beduin.v2.engine.field.d) interfaceC36252bK.getF336702c());
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
        return this.f336832c.e();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f336831b, uVar.f336831b) && L.f(this.f336832c, uVar.f336832c) && L.f(this.f336833d, uVar.f336833d);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> f() {
        String f336766b = this.f336833d.get().getF336766b();
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar = this.f336832c;
        return f336766b != null ? fVar.l(F.f336593b.r(f336766b)) : fVar;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (!(fVar instanceof u)) {
            return fVar.l(this.f336831b).h();
        }
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar2 = ((u) fVar).f336832c;
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar3 = this.f336832c;
        return c(this, null, fVar3.b(fVar3.getF336794b().getF336873c(), fVar2), 5);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336794b() {
        return this.f336831b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return f().h();
    }

    public final int hashCode() {
        return this.f336833d.hashCode() + ((this.f336832c.hashCode() + (this.f336831b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
        return c(this, jVar, null, 6);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PatchField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336831b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("field=" + this.f336832c + ", ");
        StringBuilder sb3 = new StringBuilder("mergePolicy=");
        sb3.append(this.f336833d);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }

    public u(@Y61.k com.avito.beduin.v2.engine.field.o oVar, @Y61.k com.avito.beduin.v2.engine.field.f fVar, @Y61.k B b12) {
        this(oVar, (com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d>) fVar, new com.avito.beduin.v2.engine.field.p(b12));
    }
}
