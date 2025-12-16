package ZT0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.InterfaceC36254d;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.M;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.core.q;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;

/* compiled from: RecycleCalculationValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LZT0/h;", "LZT0/i;", "Lcom/avito/beduin/v2/engine/core/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements i, InterfaceC36254d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC36274k f20194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f20195b;

    public h(@k InterfaceC36274k interfaceC36274k) {
        this.f20194a = interfaceC36274k;
        this.f20195b = new q(interfaceC36274k);
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c */
    public final boolean getF336683f() {
        return this.f20195b.f336683f;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        this.f20195b.getClass();
    }

    @Override // com.avito.beduin.v2.engine.core.N
    @k
    public final N.a f(@k M m12, boolean z12) {
        return N.d.f336599a;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336678a() {
        return this.f20194a;
    }

    @Override // ZT0.i
    @k
    public final K<Object> i(@k b bVar, @k com.avito.beduin.v2.engine.field.b<Object> bVar2, @k m mVar, @l Y41.l<? super Exception, ? extends Object> lVar) {
        q qVar = this.f20195b;
        qVar.o(bVar2, mVar, lVar);
        return qVar;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
        this.f20195b.getClass();
    }

    @Override // com.avito.beduin.v2.engine.core.K
    @l
    public final Object k(@k z zVar) {
        return this.f20195b.k(zVar);
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@k M m12) {
        this.f20195b.getClass();
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36254d
    @k
    public final InterfaceC36254d o(@k com.avito.beduin.v2.engine.field.b<Object> bVar, @k m mVar, @l Y41.l<? super Exception, ? extends Object> lVar) {
        q qVar = this.f20195b;
        qVar.o(bVar, mVar, lVar);
        return qVar;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p */
    public final boolean getF336634f() {
        this.f20195b.getClass();
        return true;
    }

    @Override // ZT0.i
    public final void b() {
    }

    @Override // ZT0.i
    public final void release() {
    }
}
