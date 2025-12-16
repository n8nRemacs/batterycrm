package com.avito.beduin.v2.engine.field.entity;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.a;
import com.avito.beduin.v2.engine.field.d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentField.kt */
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/c;", "Lcom/avito/beduin/v2/engine/field/d;", "Lcom/avito/beduin/v2/engine/field/b;", "", "Lcom/avito/beduin/v2/engine/field/j;", "id", "", "componentType", "Lcom/avito/beduin/v2/engine/field/m;", "layoutParams", "Lcom/avito/beduin/v2/engine/field/h;", "params", "Lcom/avito/beduin/v2/engine/field/a;", "args", "<init>", "(Lcom/avito/beduin/v2/engine/field/j;Ljava/lang/String;Lcom/avito/beduin/v2/engine/field/m;Lcom/avito/beduin/v2/engine/field/h;Ljava/util/Map;Lkotlin/jvm/internal/w;)V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.beduin.v2.engine.field.d, com.avito.beduin.v2.engine.field.b<Object> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336787b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f336788c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.field.m f336789d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.h f336790e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> f336791f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f336792g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f336793h;

    public c() {
        throw null;
    }

    public c(com.avito.beduin.v2.engine.field.j jVar, String str, com.avito.beduin.v2.engine.field.m mVar, com.avito.beduin.v2.engine.field.h hVar, Map map, C42822w c42822w) {
        this.f336787b = jVar;
        this.f336788c = str;
        this.f336789d = mVar;
        this.f336790e = hVar;
        this.f336791f = map;
        this.f336792g = jVar.getF336872b();
        this.f336793h = jVar.c();
    }

    public static c s(c cVar, com.avito.beduin.v2.engine.field.m mVar, com.avito.beduin.v2.engine.field.h hVar, int i12) {
        if ((i12 & 4) != 0) {
            mVar = cVar.f336789d;
        }
        com.avito.beduin.v2.engine.field.m mVar2 = mVar;
        if ((i12 & 8) != 0) {
            hVar = cVar.f336790e;
        }
        return new c(cVar.f336787b, cVar.f336788c, mVar2, hVar, cVar.f336791f, null);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        Object objF;
        boolean zF2 = zVar.F();
        StringBuilder sb2 = new StringBuilder("@componentAsStructure:");
        sb2.append(this.f336792g);
        sb2.append('+');
        com.avito.beduin.v2.engine.field.j jVar = this.f336787b;
        sb2.append(jVar.getF336873c());
        String string = sb2.toString();
        Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map = this.f336791f;
        com.avito.beduin.v2.engine.field.a aVarA = com.avito.beduin.v2.engine.field.a.a(map);
        com.avito.beduin.v2.engine.field.h hVar = this.f336790e;
        com.avito.beduin.v2.engine.field.m mVar = this.f336789d;
        List listU = C42745f0.U(hVar, mVar, aVarA);
        if (zF2) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, string, listU);
            if (!interfaceC36252bK.getF336701b()) {
                try {
                    interfaceC36252bK.l(new B(jVar, hVar.d(interfaceC36252bK.g(), mVar)).a(zVar, map));
                } catch (Throwable th2) {
                    interfaceC36252bK.l(null);
                    throw th2;
                }
            }
            objF = interfaceC36252bK.getF336702c();
        } else {
            objF = new B(jVar, hVar.d(zVar.x(string, zF2), mVar)).a(zVar, map);
        }
        return (A) objF;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return equals(dVar.h(zVar));
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!L.f(this.f336787b, cVar.f336787b) || !L.f(this.f336788c, cVar.f336788c) || !L.f(this.f336789d, cVar.f336789d) || !L.f(this.f336790e, cVar.f336790e)) {
            return false;
        }
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return L.f(this.f336791f, cVar.f336791f);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.f(zVar, this);
        throw null;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f336787b.hashCode() * 31, 31, this.f336788c);
        com.avito.beduin.v2.engine.field.m mVar = this.f336789d;
        int iC2 = AK.c.c((iD2 + (mVar == null ? 0 : mVar.f336870a.hashCode())) * 31, 31, this.f336790e.f336867a);
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return this.f336791f.hashCode() + iC2;
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
        throw new UnsupportedOperationException(d.a.a(com.avito.beduin.v2.engine.field.d.f336773a, this, zVar) + " can't be used as Patch");
    }

    @Override // com.avito.beduin.v2.engine.field.b
    @Y61.l
    public final Object o(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        Object objZ;
        Object objE;
        boolean zF2 = zVar.F();
        String str = this.f336788c;
        if (zF2) {
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336594a(), "@factory", str);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336701b()) {
                try {
                    interfaceC36252bE.l(interfaceC36252bE.g().z(str));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            objZ = interfaceC36252bE.getF336702c();
        } else {
            objZ = zVar.z(str);
        }
        AbstractC36250j abstractC36250j = (AbstractC36250j) objZ;
        boolean zF3 = zVar.F();
        Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map = this.f336791f;
        com.avito.beduin.v2.engine.field.a aVarA = com.avito.beduin.v2.engine.field.a.a(map);
        com.avito.beduin.v2.engine.field.h hVar = this.f336790e;
        List listU = C42745f0.U(hVar, aVarA);
        com.avito.beduin.v2.engine.field.j jVar = this.f336787b;
        if (zF3) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@params", listU);
            if (!interfaceC36252bK.getF336701b()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
                try {
                    interfaceC36252bK.l((!abstractC36250j.f336561b || zVarG.a().f336480g || zVarG.a().f336488o) ? hVar.e(zVarG, map, jVar.c()) : hVar.g(zVarG, map, jVar.c()));
                } catch (Throwable th3) {
                    interfaceC36252bK.l(null);
                    throw th3;
                }
            }
            objE = interfaceC36252bK.getF336702c();
        } else {
            com.avito.beduin.v2.engine.core.z zVarX = zVar.x("@params", zF3);
            objE = (!abstractC36250j.f336561b || zVarX.a().f336480g || zVarX.a().f336488o) ? hVar.e(zVarX, map, jVar.c()) : hVar.g(zVarX, map, jVar.c());
        }
        abstractC36250j.getClass();
        return abstractC36250j.a(new AbstractC36250j.b(zVar, (com.avito.beduin.v2.engine.field.m) objE), str);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.e(zVar, this);
        throw null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComponentData(");
        sb2.append("pointerId=" + this.f336792g + ", ");
        sb2.append("layoutTag=" + this.f336793h + ", ");
        sb2.append("componentType=" + this.f336788c + ", ");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d h(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }
}
