package com.avito.beduin.v2.engine.field.entity;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MutableField.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/q;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/entity/p;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class q implements com.avito.beduin.v2.engine.field.f<p> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> f336821c;

    /* compiled from: MutableField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "target", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.core.u<com.avito.beduin.v2.engine.field.d> f336822l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.beduin.v2.engine.core.u<com.avito.beduin.v2.engine.field.d> uVar) {
            super(1);
            this.f336822l = uVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.beduin.v2.engine.field.d dVar) {
            this.f336822l.set(dVar);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
        this.f336820b = jVar;
        this.f336821c = fVar;
    }

    public static q c(q qVar, com.avito.beduin.v2.engine.field.j jVar, com.avito.beduin.v2.engine.field.f fVar, int i12) {
        if ((i12 & 1) != 0) {
            jVar = qVar.f336820b;
        }
        if ((i12 & 2) != 0) {
            fVar = qVar.f336821c;
        }
        qVar.getClass();
        return new q(jVar, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (str.equals(this.f336820b.getF336873c())) {
            return g(fVar);
        }
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar2 = this.f336821c;
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVarD = fVar2.d(str, fVar);
        return L.f(fVarD, fVar2) ? this : c(this, null, fVarD, 1);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return this.f336821c.e();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f336820b, qVar.f336820b) && L.f(this.f336821c, qVar.f336821c);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final p a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        Object objA;
        com.avito.beduin.v2.engine.core.z zVarX = zVar.x(this.f336820b.getF336872b(), zVar.F());
        boolean zF2 = zVarX.F();
        com.avito.beduin.v2.engine.field.a aVarA = com.avito.beduin.v2.engine.field.a.a(map);
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar = this.f336821c;
        List listU = C42745f0.U(fVar, aVarA);
        if (zF2) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVarX, "@value", listU);
            if (!interfaceC36252bK.getF336616h()) {
                try {
                    interfaceC36252bK.l(fVar.a(interfaceC36252bK.g(), map));
                } catch (Throwable th2) {
                    interfaceC36252bK.l(null);
                    throw th2;
                }
            }
            objA = interfaceC36252bK.getF336702c();
        } else {
            objA = fVar.a(zVarX, map);
        }
        com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) objA;
        com.avito.beduin.v2.engine.core.u uVarF = zVarX.d(zVarX.getF336696a(), "@mutableValue", dVar) ? (com.avito.beduin.v2.engine.core.u) zVarX.C("@mutableValue") : zVarX.f(zVarX.l(zVarX.getF336696a(), "@mutableValue"), dVar, dVar);
        InterfaceC36252b interfaceC36252bE = zVarX.E(zVarX.getF336696a(), "@onMutate", uVarF);
        zVarX.w(interfaceC36252bE);
        if (!interfaceC36252bE.getF336616h()) {
            interfaceC36252bE.g();
            try {
                interfaceC36252bE.l(new a(uVarF));
            } catch (Throwable th3) {
                interfaceC36252bE.l(null);
                throw th3;
            }
        }
        return new p(uVarF, (Y41.l) interfaceC36252bE.getF336702c());
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (!(fVar instanceof q)) {
            return fVar.l(this.f336820b).h();
        }
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar2 = ((q) fVar).f336821c;
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar3 = this.f336821c;
        return c(this, null, fVar3.b(fVar3.getF336794b().getF336873c(), fVar2), 1);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336794b() {
        return this.f336820b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return c(this, null, this.f336821c.h(), 1);
    }

    public final int hashCode() {
        return this.f336821c.hashCode() + (this.f336820b.hashCode() * 31);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<p> l(@Y61.k com.avito.beduin.v2.engine.field.j jVar) {
        return c(this, jVar, null, 2);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336820b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("field=" + this.f336821c);
        sb2.append(")");
        return sb2.toString();
    }
}
