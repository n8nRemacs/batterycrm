package ZT0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.InterfaceC36254d;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.M;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RecycleCalculationValue.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LZT0/e;", "LZT0/i;", "Lcom/avito/beduin/v2/engine/core/M;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements i, M {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC36274k f20182a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20183b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.engine.field.b<Object> f20184c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public m f20185d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public b f20186e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super Exception, ? extends Object> f20187f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public InterfaceC36254d f20188g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.engine.core.manager.i f20189h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public N.a f20190i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20191j;

    public e(@k InterfaceC36274k interfaceC36274k, boolean z12) {
        this.f20182a = interfaceC36274k;
        this.f20183b = z12;
        this.f20189h = com.avito.beduin.v2.engine.m.a(interfaceC36274k, this);
    }

    @Override // ZT0.i
    public final void b() {
        if (this.f20188g != null) {
            return;
        }
        InterfaceC36254d interfaceC36254dB = this.f20186e.b();
        interfaceC36254dB.o(this.f20184c, this.f20185d, this.f20187f);
        this.f20188g = interfaceC36254dB;
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c */
    public final boolean getF336683f() {
        InterfaceC36254d interfaceC36254d = this.f20188g;
        return interfaceC36254d != null && interfaceC36254d.getF336683f();
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        if (this.f20191j) {
            return;
        }
        this.f20191j = true;
        InterfaceC36254d interfaceC36254d = this.f20188g;
        if (interfaceC36254d != null) {
            interfaceC36254d.destroy();
            this.f20186e = new g(this.f20182a);
        }
    }

    @Override // com.avito.beduin.v2.engine.core.M
    public final void e(@k Y41.l<? super M, G0> lVar) {
        if (this.f20191j) {
            return;
        }
        this.f20189h.d(lVar);
    }

    @Override // com.avito.beduin.v2.engine.core.N
    @k
    public final N.a f(@k M m12, boolean z12) {
        if (this.f20183b) {
            b();
        }
        InterfaceC36254d interfaceC36254d = this.f20188g;
        if (interfaceC36254d == null) {
            throw new IllegalStateException("Prohibited to read 'state' or subscribe on recyclable value before `capture`");
        }
        N.a aVar = this.f20190i;
        if (aVar == null || aVar.getF336603c()) {
            this.f20190i = interfaceC36254d.f(this, false);
        }
        return this.f20189h.a(m12, z12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF20182a() {
        return this.f20182a;
    }

    @Override // ZT0.i
    @k
    public final K<Object> i(@k b bVar, @k com.avito.beduin.v2.engine.field.b<Object> bVar2, @k m mVar, @l Y41.l<? super Exception, ? extends Object> lVar) {
        InterfaceC36254d interfaceC36254d;
        if (this.f20191j) {
            throw new IllegalStateException("Forbidden to modify a destroyed node");
        }
        b bVar3 = this.f20186e;
        com.avito.beduin.v2.engine.field.b<Object> bVar4 = this.f20184c;
        m mVar2 = this.f20185d;
        this.f20186e = bVar;
        this.f20184c = bVar2;
        this.f20185d = mVar;
        this.f20187f = lVar;
        if (bVar3 != null && bVar3 != bVar) {
            throw new IllegalStateException("Prohibited to change pool after first calculation in RecycleCalculationValue");
        }
        if ((!L.f(bVar4, bVar2) || !L.f(mVar2, mVar)) && (interfaceC36254d = this.f20188g) != null) {
            interfaceC36254d.o(bVar2, mVar, lVar);
        }
        return this;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
        InterfaceC36254d interfaceC36254d = this.f20188g;
        if (interfaceC36254d != null) {
            interfaceC36254d.j();
        }
    }

    @Override // com.avito.beduin.v2.engine.core.K
    @l
    public final Object k(@k z zVar) {
        if (this.f20183b) {
            b();
        }
        InterfaceC36254d interfaceC36254d = this.f20188g;
        if (interfaceC36254d != null) {
            return interfaceC36254d.k(zVar);
        }
        throw new IllegalStateException("Prohibited to read 'state' or subscribe on recyclable value before `capture`");
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@k M m12) {
        this.f20189h.c(m12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p, reason: from getter */
    public final boolean getF20191j() {
        return this.f20191j;
    }

    @Override // ZT0.i
    public final void release() {
        N.a aVar = this.f20190i;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f20190i = null;
        InterfaceC36254d interfaceC36254d = this.f20188g;
        if (interfaceC36254d != null) {
            this.f20186e.a(interfaceC36254d);
            this.f20188g = null;
        }
    }
}
