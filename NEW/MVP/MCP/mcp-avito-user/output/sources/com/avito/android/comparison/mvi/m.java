package com.avito.android.comparison.mvi;

import Pq.InterfaceC14826a;
import Rq.InterfaceC15071a;
import Rq.b;
import com.avito.android.arch.mvi.a;
import com.avito.android.comparison.ComparisonFragmentMvi;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.internal.operators.observable.M;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ComparisonActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comparison/mvi/m;", "Lcom/avito/android/arch/mvi/a;", "LRq/a;", "LRq/b;", "LRq/d;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements com.avito.android.arch.mvi.a<InterfaceC15071a, Rq.b, Rq.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comparison.domain.a f124141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComparisonFragmentMvi.a f124142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Sq.g f124143c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comparison.e f124144d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f124145e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14826a f124146f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<Integer> f124147g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public String f124148h;

    @Inject
    public m(@Y61.k com.avito.android.comparison.domain.a aVar, @Y61.k ComparisonFragmentMvi.a aVar2, @Y61.k Sq.g gVar, @Y61.k com.avito.android.comparison.e eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k InterfaceC14826a interfaceC14826a, @com.avito.android.comparison.di.i @Y61.k io.reactivex.rxjava3.subjects.b<Integer> bVar) {
        this.f124141a = aVar;
        this.f124142b = aVar2;
        this.f124143c = gVar;
        this.f124144d = eVar;
        this.f124145e = aVar3;
        this.f124146f = interfaceC14826a;
        this.f124147g = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Rq.b> b(InterfaceC15071a interfaceC15071a, Rq.d dVar) {
        InterfaceC15071a interfaceC15071a2 = interfaceC15071a;
        Rq.d dVar2 = dVar;
        if (interfaceC15071a2 instanceof InterfaceC15071a.i) {
            return new C43210w(new b.h(false, 1, null));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.k) {
            return C43175k.B(new e(interfaceC15071a2, this, null), C43175k.G(new d(interfaceC15071a2, this, null)));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.d) {
            return C43175k.G(new f(interfaceC15071a2, this, null));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.j) {
            InterfaceC15071a.j jVar = (InterfaceC15071a.j) interfaceC15071a2;
            io.reactivex.rxjava3.core.z zVarA = Y5.a(this.f124141a.a(this.f124142b.f123787a, jVar.f14672a, jVar.f14673b));
            final Sq.g gVar = this.f124143c;
            io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(b.j.f14682a), zVarA.d0(new l41.o() { // from class: com.avito.android.comparison.mvi.g
                @Override // l41.o
                public final Object apply(Object obj) {
                    return gVar.a((ComparisonResponse) obj, false);
                }
            }).d0(h.f124134b));
            i iVar = new i(this);
            zVarQ.getClass();
            return kotlinx.coroutines.rx3.y.a(new M(zVarQ, iVar).m0(new j(this)));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.e) {
            return new C43210w(new b.i(((InterfaceC15071a.e) interfaceC15071a2).f14665a));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.b) {
            return new C43210w(b.a.f14675a);
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.h) {
            return C43175k.G(new k(interfaceC15071a2, this, null));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.f) {
            return C43175k.G(new l(interfaceC15071a2, this, null));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.c) {
            return C43175k.G(new C29517a(dVar2, null));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.C0984a) {
            return C43175k.G(new b(interfaceC15071a2, dVar2, this, null));
        }
        if (interfaceC15071a2 instanceof InterfaceC15071a.g) {
            return C43175k.G(new c(interfaceC15071a2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
