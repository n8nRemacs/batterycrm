package com.avito.beduin.v2.engine.component;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.L;
import com.avito.beduin.v2.engine.core.M;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.logger.LogLevel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/l;", "Lcom/avito/beduin/v2/engine/component/i;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l implements InterfaceC36249i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336564a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f336565b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f336566c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final K<Object> f336567d;

    /* compiled from: ComponentState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/l$a;", "Lcom/avito/beduin/v2/engine/core/M;", "Lcom/avito/beduin/v2/engine/component/I;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements M, I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public H f336568a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public l f336569b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public N.a f336570c;

        @Override // com.avito.beduin.v2.engine.component.I
        public final void a() {
            N.a aVar = this.f336570c;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f336570c = null;
            this.f336569b = null;
            this.f336568a = null;
        }

        @Override // com.avito.beduin.v2.engine.core.M
        public final void e(@Y61.k Y41.l<? super M, G0> lVar) {
            l lVar2 = this.f336569b;
            boolean z12 = false;
            if (lVar2 != null) {
                K<Object> k12 = lVar2.f336567d;
                L l12 = k12 instanceof L ? (L) k12 : null;
                if (!(l12 != null ? l12.p() : false)) {
                    z12 = true;
                }
            }
            if (z12) {
                this.f336568a.a(this.f336569b);
            }
        }
    }

    public l(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k K<? extends Object> k12) {
        this.f336564a = str;
        this.f336565b = str2;
        this.f336566c = str3;
        this.f336567d = k12;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void b() {
        K<Object> k12 = this.f336567d;
        ZT0.i iVar = k12 instanceof ZT0.i ? (ZT0.i) k12 : null;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void destroy() {
        K<Object> k12 = this.f336567d;
        if (k12 instanceof L) {
            L l12 = (L) k12;
            if (l12.getF20192a().getF336545b().f336488o) {
                l12.j();
                l12.destroy();
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.L.f(this.f336564a, lVar.f336564a) && kotlin.jvm.internal.L.f(this.f336565b, lVar.f336565b) && kotlin.jvm.internal.L.f(this.f336566c, lVar.f336566c) && kotlin.jvm.internal.L.f(this.f336567d, lVar.f336567d);
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF336564a() {
        return this.f336564a;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.l
    public final Object getState() {
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (RU0.b.f14469c <= 0) {
            RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Component"), "Get: " + this.f336566c);
        }
        return this.f336567d.k(com.avito.beduin.v2.engine.core.F.f336593b);
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.l
    public final String getTag() {
        Object state = getState();
        J j12 = state instanceof J ? (J) state : null;
        String f333760m = j12 != null ? j12.getF333760m() : null;
        return f333760m == null ? this.f336565b : f333760m;
    }

    public final int hashCode() {
        int iHashCode = this.f336564a.hashCode() * 31;
        String str = this.f336565b;
        return this.f336567d.hashCode() + androidx.compose.foundation.H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f336566c);
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final String getF336566c() {
        return this.f336566c;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    public final I n(@Y61.k H h12) {
        a aVar = new a();
        aVar.f336568a = h12;
        aVar.f336569b = this;
        aVar.f336570c = this.f336567d.f(aVar, true);
        return aVar;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void release() {
        K<Object> k12 = this.f336567d;
        ZT0.i iVar = k12 instanceof ZT0.i ? (ZT0.i) k12 : null;
        if (iVar != null) {
            iVar.release();
        }
    }

    @Y61.k
    public final String toString() {
        return "ComponentStateImpl(id=" + this.f336564a + ", layoutTag=" + this.f336565b + ", componentType=" + this.f336566c + ", componentValue=" + this.f336567d + ')';
    }
}
