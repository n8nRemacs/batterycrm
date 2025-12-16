package com.avito.beduin.v2.engine.field.entity;

import androidx.compose.foundation.H;
import cU0.InterfaceC27104b;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.f;
import com.avito.beduin.v2.engine.field.l;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FunctionField.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/k;", "Lcom/avito/beduin/v2/engine/field/l;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k implements com.avito.beduin.v2.engine.field.l<com.avito.beduin.v2.engine.field.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336805b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f336806c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.h f336807d;

    public k(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.h hVar) {
        this.f336805b = jVar;
        this.f336806c = str;
        this.f336807d = hVar;
    }

    public static k c(k kVar, com.avito.beduin.v2.engine.field.j jVar, String str, com.avito.beduin.v2.engine.field.h hVar, int i12) {
        if ((i12 & 1) != 0) {
            jVar = kVar.f336805b;
        }
        if ((i12 & 2) != 0) {
            str = kVar.f336806c;
        }
        if ((i12 & 4) != 0) {
            hVar = kVar.f336807d;
        }
        kVar.getClass();
        return new k(jVar, str, hVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        Object objQ;
        Object objA;
        com.avito.beduin.v2.engine.core.z zVarX = zVar.x(this.f336805b.getF336872b(), zVar.F());
        boolean zF2 = zVarX.F();
        String str = this.f336806c;
        if (zF2) {
            InterfaceC36252b interfaceC36252bE = zVarX.E(zVarX.getF336696a(), "@factory", str);
            zVarX.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336616h()) {
                try {
                    interfaceC36252bE.l(interfaceC36252bE.g().q(str));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            objQ = interfaceC36252bE.getF336702c();
        } else {
            objQ = zVarX.q(str);
        }
        InterfaceC27104b interfaceC27104b = (InterfaceC27104b) objQ;
        boolean z12 = zVarX.a().f336483j;
        List listU = C42745f0.U(this.f336807d, interfaceC27104b, str, com.avito.beduin.v2.engine.field.a.a(map));
        if (z12) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVarX, "@functionResult", listU);
            if (!interfaceC36252bK.getF336616h()) {
                try {
                    interfaceC36252bK.l(interfaceC27104b.a(interfaceC36252bK.g(), this.f336805b, this.f336806c, this.f336807d, map));
                } catch (Throwable th3) {
                    interfaceC36252bK.l(null);
                    throw th3;
                }
            }
            objA = interfaceC36252bK.getF336702c();
        } else {
            objA = interfaceC27104b.a(zVarX, this.f336805b, this.f336806c, this.f336807d, map);
        }
        return (com.avito.beduin.v2.engine.field.d) objA;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return str.equals(this.f336805b.getF336873c()) ? g(fVar) : l.a.a(this, this.f336807d.a(str, fVar));
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return this.f336807d.b();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f336805b, kVar.f336805b) && L.f(this.f336806c, kVar.f336806c) && L.f(this.f336807d, kVar.f336807d);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
        boolean z12 = fVar instanceof k;
        com.avito.beduin.v2.engine.field.h hVar = this.f336807d;
        if (!z12) {
            return fVar instanceof B ? l.a.a(this, hVar.c(((B) fVar).f336781c)) : fVar.l(this.f336805b).h();
        }
        k kVar = (k) fVar;
        return c(this, null, kVar.f336806c, hVar.c(kVar.f336807d), 1);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336805b() {
        return this.f336805b;
    }

    @Override // com.avito.beduin.v2.engine.field.l
    @Y61.k
    /* renamed from: getParams, reason: from getter */
    public final com.avito.beduin.v2.engine.field.h getF336807d() {
        return this.f336807d;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return l.a.a(this, this.f336807d.h());
    }

    public final int hashCode() {
        return this.f336807d.f336867a.hashCode() + H.d(this.f336805b.hashCode() * 31, 31, this.f336806c);
    }

    @Override // com.avito.beduin.v2.engine.field.l
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> j(@Y61.k com.avito.beduin.v2.engine.field.h hVar) {
        return c(this, null, null, hVar, 3);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> l(@Y61.k com.avito.beduin.v2.engine.field.j jVar) {
        return c(this, jVar, null, null, 6);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FunctionField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336805b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("functionType=" + this.f336806c + ", ");
        StringBuilder sb3 = new StringBuilder("params=");
        sb3.append(this.f336807d);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
