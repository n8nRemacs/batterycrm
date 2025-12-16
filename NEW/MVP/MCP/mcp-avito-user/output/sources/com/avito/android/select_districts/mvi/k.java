package com.avito.android.select_districts.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.select_districts.mvi.entity.SelectDistrictsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pq0.InterfaceC47130a;

/* compiled from: SelectDistrictsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select_districts/mvi/k;", "Lcom/avito/android/arch/mvi/a;", "Lpq0/a;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lpq0/c;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements com.avito.android.arch.mvi.a<InterfaceC47130a, SelectDistrictsInternalAction, pq0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.j f267053a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.o f267054b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.b f267055c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.d f267056d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.m f267057e;

    @Inject
    public k(@Y61.k com.avito.android.select_districts.domain.j jVar, @Y61.k com.avito.android.select_districts.domain.o oVar, @Y61.k com.avito.android.select_districts.domain.b bVar, @Y61.k com.avito.android.select_districts.domain.d dVar, @Y61.k com.avito.android.select_districts.domain.m mVar) {
        this.f267053a = jVar;
        this.f267054b = oVar;
        this.f267055c = bVar;
        this.f267056d = dVar;
        this.f267057e = mVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectDistrictsInternalAction> b(InterfaceC47130a interfaceC47130a, pq0.c cVar) {
        InterfaceC47130a interfaceC47130a2 = interfaceC47130a;
        pq0.c cVar2 = cVar;
        if (interfaceC47130a2 instanceof InterfaceC47130a.h) {
            return new C43152f0(new C43137a0(new c(2, null), C43175k.G(new b(this, interfaceC47130a2, null))), new d(3, null));
        }
        if (interfaceC47130a2 instanceof InterfaceC47130a.b) {
            return C43175k.G(new e(this, interfaceC47130a2, cVar2, null));
        }
        if (interfaceC47130a2 instanceof InterfaceC47130a.f) {
            return C43175k.G(new f(this, interfaceC47130a2, cVar2, null));
        }
        if (interfaceC47130a2 instanceof InterfaceC47130a.C12293a) {
            this.f267054b.a(((InterfaceC47130a.C12293a) interfaceC47130a2).f428797a);
            return C43175k.w();
        }
        if (interfaceC47130a2 instanceof InterfaceC47130a.e) {
            return C43175k.G(new g(interfaceC47130a2, null));
        }
        if (interfaceC47130a2.equals(InterfaceC47130a.g.f428803a)) {
            return C43175k.G(new h(this, null));
        }
        if (interfaceC47130a2.equals(InterfaceC47130a.j.f428806a)) {
            return C43175k.G(new i(2, null));
        }
        if (interfaceC47130a2.equals(InterfaceC47130a.c.f428799a)) {
            return C43175k.G(new j(this, cVar2, null));
        }
        if (interfaceC47130a2 instanceof InterfaceC47130a.i) {
            this.f267056d.h(((InterfaceC47130a.i) interfaceC47130a2).f428805a);
            return C43175k.w();
        }
        if (interfaceC47130a2.equals(InterfaceC47130a.d.f428800a)) {
            return C43175k.G(new a(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
