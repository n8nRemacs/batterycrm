package com.avito.android.delivery_tarifikator.domain;

import com.avito.android.delivery_tarifikator.domain.I;
import com.squareup.anvil.annotations.ContributesBinding;
import cw.C39420a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: TarifikatorSettingsInteractor.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/q0;", "Lcom/avito/android/delivery_tarifikator/domain/p0;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes12.dex */
public final class q0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29820p f135324a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l0 f135325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t0 f135326c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final U f135327d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z1<Ov.n> f135328e = p2.a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f135329f = new LinkedHashMap();

    @Inject
    public q0(@Y61.k InterfaceC29820p interfaceC29820p, @Y61.k l0 l0Var, @Y61.k t0 t0Var, @Y61.k U u12) {
        this.f135324a = interfaceC29820p;
        this.f135325b = l0Var;
        this.f135326c = t0Var;
        this.f135327d = u12;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final void a(@Y61.k C39420a c39420a) {
        Ov.j jVar = new Ov.j(c39420a.getMaxPrice(), c39420a.getMaxDeliveryDays(), c39420a.getHasDeliveryDays());
        LinkedHashMap linkedHashMap = this.f135329f;
        linkedHashMap.clear();
        ArrayList arrayList = new ArrayList();
        List<cw.f> listG = c39420a.getTerms().g();
        if (listG != null) {
            for (cw.f fVar : listG) {
                ArrayList arrayList2 = new ArrayList();
                List<cw.f> listG2 = fVar.g();
                if (listG2 != null) {
                    Iterator<T> it = listG2.iterator();
                    while (it.hasNext()) {
                        Ov.g gVarA = this.f135324a.a((cw.f) it.next());
                        Ov.d dVar = gVarA.f12684a;
                        linkedHashMap.put(Long.valueOf(dVar.f12680a), gVarA);
                        arrayList2.add(dVar);
                    }
                }
                arrayList.add(new Ov.f(fVar.getName(), arrayList2));
            }
        }
        Map<Long, Ov.g> mapQ = P0.q(linkedHashMap);
        this.f135325b.da(mapQ);
        this.f135328e.setValue(new Ov.n(jVar, arrayList, mapQ, P0.c(), false));
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final void b(@Y61.l Long l12, @Y61.k List<Ov.d> list) {
        Ov.k kVarA;
        for (Ov.d dVar : list) {
            LinkedHashMap linkedHashMap = this.f135329f;
            Ov.g gVar = (Ov.g) linkedHashMap.get(Long.valueOf(dVar.f12680a));
            if (gVar != null && (kVarA = this.f135327d.a(gVar.f12685b)) != null && kVarA.getF12664e()) {
                linkedHashMap.put(Long.valueOf(dVar.f12680a), Ov.g.a(gVar, null, null, null, l12, 15));
            }
        }
        i();
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final void c(@Y61.l Long l12, @Y61.k List<Ov.d> list) {
        Ov.k kVarA;
        for (Ov.d dVar : list) {
            LinkedHashMap linkedHashMap = this.f135329f;
            Ov.g gVar = (Ov.g) linkedHashMap.get(Long.valueOf(dVar.f12680a));
            if (gVar != null && (kVarA = this.f135327d.a(gVar.f12685b)) != null && kVarA.getF12664e()) {
                linkedHashMap.put(Long.valueOf(dVar.f12680a), Ov.g.a(gVar, null, null, l12, null, 23));
            }
        }
        i();
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final void clear() {
        this.f135328e.setValue(null);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    @Y61.k
    public final I d() {
        Ov.n value = this.f135328e.getValue();
        if (value != null) {
            return value.f12702d.isEmpty() ? new I.b(this.f135325b.ba()) : I.a.f135243a;
        }
        throw new IllegalStateException("Settings Interactor not initialized");
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final boolean e() {
        return this.f135325b.ca();
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final void f() {
        LinkedHashMap linkedHashMap = this.f135329f;
        linkedHashMap.clear();
        for (Ov.g gVar : this.f135325b.e().f135241a) {
            linkedHashMap.put(Long.valueOf(gVar.f12684a.f12680a), gVar);
        }
        i();
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final void g(@Y61.l Long l12, @Y61.k List<Ov.d> list) {
        Ov.k kVarA;
        for (Ov.d dVar : list) {
            LinkedHashMap linkedHashMap = this.f135329f;
            Ov.g gVar = (Ov.g) linkedHashMap.get(Long.valueOf(dVar.f12680a));
            if (gVar != null && (kVarA = this.f135327d.a(gVar.f12685b)) != null && kVarA.getF12663d()) {
                linkedHashMap.put(Long.valueOf(dVar.f12680a), Ov.g.a(gVar, null, l12, null, null, 27));
            }
        }
        i();
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    @Y61.k
    public final C43189o1 getSettings() {
        return new C43189o1(this.f135328e);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.p0
    public final void h(@Y61.k Ov.k kVar, @Y61.k List<Ov.d> list) {
        if (kVar.getF12662c()) {
            List<Ov.d> list2 = list;
            boolean z12 = list2 instanceof Collection;
            LinkedHashMap linkedHashMap = this.f135329f;
            boolean z13 = true;
            if (!z12 || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    Ov.g gVar = (Ov.g) linkedHashMap.get(Long.valueOf(((Ov.d) it.next()).f12680a));
                    if (gVar == null || Ov.m.a(gVar.f12685b)) {
                        z13 = false;
                        break;
                    }
                }
            }
            for (Ov.d dVar : list2) {
                Ov.g gVar2 = (Ov.g) linkedHashMap.get(Long.valueOf(dVar.f12680a));
                if (gVar2 != null && (z13 || Ov.m.a(gVar2.f12685b))) {
                    linkedHashMap.put(Long.valueOf(dVar.f12680a), Ov.g.a(gVar2, kVar.c(), null, kVar.getF12664e() ? gVar2.f12687d : null, kVar.getF12664e() ? gVar2.f12688e : null, 1));
                }
            }
            i();
        }
    }

    public final void i() {
        Ov.n nVar;
        Z1<Ov.n> z12 = this.f135328e;
        Ov.n value = z12.getValue();
        if (value != null) {
            Map<Long, Ov.g> mapQ = P0.q(this.f135329f);
            l0 l0Var = this.f135325b;
            l0Var.ea(mapQ);
            nVar = new Ov.n(value.f12699a, value.f12700b, mapQ, this.f135326c.a(value.f12699a, l0Var.ba()), l0Var.ca());
        } else {
            nVar = null;
        }
        z12.setValue(nVar);
    }
}
