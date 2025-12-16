package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.f;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RawField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/y;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/entity/x;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class y implements com.avito.beduin.v2.engine.field.f<x> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336858b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> f336859c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> f336860d;

    /* compiled from: RawField.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/y$a;", "", "<init>", "()V", "", "RAW_SCOPE_NAME", "Ljava/lang/String;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar, @Y61.k Set<com.avito.beduin.v2.engine.field.q> set) {
        this.f336858b = jVar;
        this.f336859c = fVar;
        this.f336860d = set;
    }

    public static y c(y yVar, com.avito.beduin.v2.engine.field.j jVar, com.avito.beduin.v2.engine.field.f fVar, Set set, int i12) {
        if ((i12 & 1) != 0) {
            jVar = yVar.f336858b;
        }
        if ((i12 & 2) != 0) {
            fVar = yVar.f336859c;
        }
        if ((i12 & 4) != 0) {
            set = yVar.f336860d;
        }
        yVar.getClass();
        return new y(jVar, fVar, set);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
        Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> mapB = com.avito.beduin.v2.engine.field.a.b(map, this.f336860d);
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar = this.f336859c;
        String strC = fVar.getF336858b().c();
        if (strC == null) {
            strC = "raw";
        }
        return new x(mapB, fVar, strC, null);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (str.equals(this.f336858b.getF336873c())) {
            return g(fVar);
        }
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar2 = this.f336859c;
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVarD = fVar2.d(str, fVar);
        return L.f(fVarD, fVar2) ? this : c(this, null, fVarD, fVarD.e(), 1);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return this.f336860d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f336858b, yVar.f336858b) && L.f(this.f336859c, yVar.f336859c) && L.f(this.f336860d, yVar.f336860d);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (!(fVar instanceof y)) {
            return fVar.l(this.f336858b).h();
        }
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar2 = ((y) fVar).f336859c;
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar3 = this.f336859c;
        com.avito.beduin.v2.engine.field.f fVarB = fVar3.b(fVar3.getF336858b().getF336873c(), fVar2);
        return L.f(fVarB, fVar3) ? this : c(this, null, fVarB, fVarB.e(), 1);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336858b() {
        return this.f336858b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return c(this, null, this.f336859c.h(), null, 5);
    }

    public final int hashCode() {
        return this.f336860d.hashCode() + ((this.f336859c.hashCode() + (this.f336858b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
        return c(this, jVar, null, null, 6);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RawField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336858b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("field=" + this.f336859c);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ y(com.avito.beduin.v2.engine.field.j jVar, com.avito.beduin.v2.engine.field.f fVar, Set set, int i12, C42822w c42822w) {
        this(jVar, fVar, (i12 & 4) != 0 ? fVar.e() : set);
    }
}
