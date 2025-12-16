package com.avito.beduin.v2.engine.field.entity;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.c;
import com.avito.beduin.v2.engine.field.f;
import com.avito.beduin.v2.engine.field.h;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentField.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/d;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d implements com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336794b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f336795c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.h f336796d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.field.h f336797e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> f336798f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> f336799g;

    public d(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.h hVar, @Y61.l com.avito.beduin.v2.engine.field.h hVar2, @Y61.k Set<com.avito.beduin.v2.engine.field.q> set, @Y61.k Set<com.avito.beduin.v2.engine.field.q> set2) {
        this.f336794b = jVar;
        this.f336795c = str;
        this.f336796d = hVar;
        this.f336797e = hVar2;
        this.f336798f = set;
        this.f336799g = set2;
    }

    public static d c(d dVar, com.avito.beduin.v2.engine.field.j jVar, String str, com.avito.beduin.v2.engine.field.h hVar, com.avito.beduin.v2.engine.field.h hVar2, int i12) {
        if ((i12 & 1) != 0) {
            jVar = dVar.f336794b;
        }
        com.avito.beduin.v2.engine.field.j jVar2 = jVar;
        if ((i12 & 2) != 0) {
            str = dVar.f336795c;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            hVar = dVar.f336796d;
        }
        com.avito.beduin.v2.engine.field.h hVar3 = hVar;
        if ((i12 & 8) != 0) {
            hVar2 = dVar.f336797e;
        }
        Set<com.avito.beduin.v2.engine.field.q> set = dVar.f336798f;
        Set<com.avito.beduin.v2.engine.field.q> set2 = dVar.f336799g;
        dVar.getClass();
        return new d(jVar2, str2, hVar3, hVar2, set, set2);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (str.equals(this.f336794b.getF336873c())) {
            return g(fVar);
        }
        com.avito.beduin.v2.engine.field.h hVarA = this.f336796d.a(str, fVar);
        com.avito.beduin.v2.engine.field.h hVar = this.f336797e;
        return f(hVarA, hVar != null ? hVar.a(str, fVar) : null);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return this.f336799g;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f336794b, dVar.f336794b) && L.f(this.f336795c, dVar.f336795c) && L.f(this.f336796d, dVar.f336796d) && L.f(this.f336797e, dVar.f336797e) && L.f(this.f336798f, dVar.f336798f) && L.f(this.f336799g, dVar.f336799g);
    }

    public final d f(com.avito.beduin.v2.engine.field.h hVar, com.avito.beduin.v2.engine.field.h hVar2) {
        return (hVar == this.f336796d && hVar2 == this.f336797e) ? this : c(this, null, null, hVar, hVar2, 51);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
        boolean z12 = fVar instanceof d;
        com.avito.beduin.v2.engine.field.h hVar = this.f336796d;
        com.avito.beduin.v2.engine.field.h hVar2 = this.f336797e;
        if (z12) {
            d dVar = (d) fVar;
            com.avito.beduin.v2.engine.field.h hVarC = hVar.c(dVar.f336796d);
            com.avito.beduin.v2.engine.field.h hVarC2 = dVar.f336797e;
            if (hVar2 != null) {
                hVarC2 = hVar2.c(hVarC2);
            }
            return c(this, null, dVar.f336795c, hVarC, hVarC2, 49);
        }
        if (!(fVar instanceof B)) {
            return fVar.l(this.f336794b).h();
        }
        c.a aVar = new c.a(hVar2 != null);
        for (Map.Entry<String, com.avito.beduin.v2.engine.field.f<?>> entry : ((B) fVar).f336781c.f336867a.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        com.avito.beduin.v2.engine.field.h hVar3 = new com.avito.beduin.v2.engine.field.h(aVar.f336771b);
        com.avito.beduin.v2.engine.field.h hVar4 = aVar.f336770a ? new com.avito.beduin.v2.engine.field.h(aVar.f336772c) : null;
        com.avito.beduin.v2.engine.field.h hVarC3 = hVar.c(hVar3);
        if (hVar2 != null) {
            hVar4 = hVar2.c(hVar4);
        }
        return f(hVarC3, hVar4);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336813b() {
        return this.f336794b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        com.avito.beduin.v2.engine.field.h hVarH = this.f336796d.h();
        com.avito.beduin.v2.engine.field.h hVar = this.f336797e;
        return f(hVarH, hVar != null ? hVar.h() : null);
    }

    public final int hashCode() {
        int iC2 = AK.c.c(H.d(this.f336794b.hashCode() * 31, 31, this.f336795c), 31, this.f336796d.f336867a);
        com.avito.beduin.v2.engine.field.h hVar = this.f336797e;
        return this.f336799g.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f336798f, (iC2 + (hVar == null ? 0 : hVar.f336867a.hashCode())) * 31, 31);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final c a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        kotlin.collections.builders.d dVarF;
        String strC = this.f336794b.c();
        com.avito.beduin.v2.engine.field.a aVarA = com.avito.beduin.v2.engine.field.a.a(map);
        com.avito.beduin.v2.engine.field.h hVar = this.f336797e;
        InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@layoutParamsAsArgs", C42745f0.U(hVar, aVarA, strC));
        com.avito.beduin.v2.engine.field.m mVarC = null;
        if (!interfaceC36252bK.getF336616h()) {
            com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
            if (strC == null || hVar == null) {
                dVarF = null;
            } else {
                try {
                    h.a aVar = com.avito.beduin.v2.engine.field.h.f336865b;
                    dVarF = hVar.f(zVarG, map, strC, false);
                } finally {
                }
            }
            interfaceC36252bK.l(dVarF != null ? com.avito.beduin.v2.engine.field.a.a(dVarF) : null);
        }
        com.avito.beduin.v2.engine.field.a aVar2 = (com.avito.beduin.v2.engine.field.a) interfaceC36252bK.getF336702c();
        Map<com.avito.beduin.v2.engine.field.q, K<com.avito.beduin.v2.engine.field.d>> map2 = aVar2 != null ? aVar2.f336769a : null;
        if (hVar != null && map2 != null) {
            mVarC = com.avito.beduin.v2.engine.field.a.c(zVar, map2);
        } else if (hVar != null) {
            interfaceC36252bK = C31685o.k(zVar, "@layoutParams", C42745f0.U(hVar, com.avito.beduin.v2.engine.field.a.a(map), strC));
            if (!interfaceC36252bK.getF336616h()) {
                try {
                    interfaceC36252bK.l(hVar.e(interfaceC36252bK.g(), map, strC));
                } finally {
                }
            }
            mVarC = (com.avito.beduin.v2.engine.field.m) interfaceC36252bK.getF336702c();
        }
        com.avito.beduin.v2.engine.field.m mVar = mVarC;
        if (map2 != null) {
            map = P0.k(map, map2);
        }
        return new c(this.f336794b, this.f336795c, mVar, this.f336796d, com.avito.beduin.v2.engine.field.a.b(map, this.f336798f), null);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> l(@Y61.k com.avito.beduin.v2.engine.field.j jVar) {
        return c(this, jVar, null, null, null, 62);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComponentField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336794b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("componentType=" + this.f336795c + ", ");
        StringBuilder sb3 = new StringBuilder("params=");
        sb3.append(this.f336796d);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(com.avito.beduin.v2.engine.field.j jVar, String str, com.avito.beduin.v2.engine.field.h hVar, com.avito.beduin.v2.engine.field.h hVar2, Set set, Set set2, int i12, C42822w c42822w) {
        Set setB = (i12 & 16) != 0 ? hVar.b() : set;
        this(jVar, str, hVar, hVar2, setB, (i12 & 32) != 0 ? hVar2 != null ? b1.h(setB, hVar2.b()) : setB : set2);
    }
}
