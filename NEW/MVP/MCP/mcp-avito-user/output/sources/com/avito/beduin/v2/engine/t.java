package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EngineState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/t;", "Lcom/avito/beduin/v2/engine/n;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class t implements n {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f336899f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final String f336900g = "params";

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336901a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H.a f336902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H.b f336903c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.field.h f336904d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.d f336905e;

    /* compiled from: EngineState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/t$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static t a(a aVar, com.avito.beduin.v2.engine.field.h hVar, com.avito.beduin.v2.engine.field.entity.d dVar, H.a aVar2, H.b bVar, int i12) {
            if ((i12 & 2) != 0) {
                hVar = null;
            }
            com.avito.beduin.v2.engine.field.h hVar2 = hVar;
            aVar.getClass();
            boolean f336874d = dVar.f336794b.getF336874d();
            com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVarL = dVar;
            if (!f336874d) {
                fVarL = dVar.l(com.avito.beduin.v2.engine.field.t.f336888a);
            }
            return new t(com.avito.beduin.v2.engine.utils.f.a(), aVar2, bVar, hVar2, (com.avito.beduin.v2.engine.field.entity.d) fVarL, null);
        }

        public a() {
        }
    }

    public /* synthetic */ t(String str, H.a aVar, H.b bVar, com.avito.beduin.v2.engine.field.h hVar, com.avito.beduin.v2.engine.field.entity.d dVar, C42822w c42822w) {
        this(str, aVar, bVar, hVar, dVar);
    }

    @Override // com.avito.beduin.v2.engine.n
    @Y61.k
    public final n a(@Y61.k u uVar) {
        com.avito.beduin.v2.engine.field.h hVar;
        u.f336906c.getClass();
        String str = uVar.f336907a;
        String str2 = f336900g;
        boolean zEquals = str.equals(str2);
        com.avito.beduin.v2.engine.field.h hVarC = null;
        com.avito.beduin.v2.engine.field.h hVar2 = this.f336904d;
        com.avito.beduin.v2.engine.field.entity.d dVar = this.f336905e;
        com.avito.beduin.v2.engine.field.f<?> fVar = uVar.f336908b;
        if (zEquals) {
            if (hVar2 != null) {
                hVarC = (str.equals(str2) && (fVar instanceof com.avito.beduin.v2.engine.field.entity.B)) ? hVar2.c(((com.avito.beduin.v2.engine.field.entity.B) fVar).f336781c) : hVar2.a(str, fVar);
            }
        } else {
            if (str.equals(dVar.f336794b.getF336873c())) {
                dVar = (com.avito.beduin.v2.engine.field.entity.d) dVar.b(str, fVar);
                hVar = hVar2;
                return new t(this.f336901a, this.f336902b, this.f336903c, hVar, dVar);
            }
            if (hVar2 != null) {
                hVarC = (str.equals(str2) && (fVar instanceof com.avito.beduin.v2.engine.field.entity.B)) ? hVar2.c(((com.avito.beduin.v2.engine.field.entity.B) fVar).f336781c) : hVar2.a(str, fVar);
            }
            if (L.f(hVarC, hVar2)) {
                dVar = (com.avito.beduin.v2.engine.field.entity.d) dVar.b(str, fVar);
            }
        }
        hVar = hVarC;
        return new t(this.f336901a, this.f336902b, this.f336903c, hVar, dVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f336901a, tVar.f336901a) && L.f(this.f336902b, tVar.f336902b) && L.f(this.f336903c, tVar.f336903c) && L.f(this.f336904d, tVar.f336904d) && L.f(this.f336905e, tVar.f336905e);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((this.f336902b.hashCode() + (this.f336901a.hashCode() * 31)) * 31, 31, this.f336903c.f336511a);
        com.avito.beduin.v2.engine.field.h hVar = this.f336904d;
        return this.f336905e.hashCode() + ((i12 + (hVar == null ? 0 : hVar.f336867a.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "InternalEngineState(id=" + this.f336901a + ", preferences=" + this.f336902b + ", statistics=" + this.f336903c + ", params=" + this.f336904d + ", rootComponent=" + this.f336905e + ')';
    }

    public t(String str, H.a aVar, H.b bVar, com.avito.beduin.v2.engine.field.h hVar, com.avito.beduin.v2.engine.field.entity.d dVar) {
        this.f336901a = str;
        this.f336902b = aVar;
        this.f336903c = bVar;
        this.f336904d = hVar;
        this.f336905e = dVar;
    }
}
