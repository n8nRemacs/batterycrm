package com.avito.android.travel_search.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.error.z;
import com.avito.android.serp.adapter.S;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import is0.InterfaceC42100b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_search/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LvF0/a;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "LvF0/g;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC49206a, TravelSearchInternalAction, vF0.g> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_search.domain.h f303141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f303142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f303143c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42100b f303144d;

    @Inject
    public e(@Y61.k com.avito.android.travel_search.domain.h hVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k InterfaceC42100b interfaceC42100b) {
        this.f303141a = hVar;
        this.f303142b = nVar;
        this.f303143c = bVar;
        this.f303144d = interfaceC42100b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TravelSearchInternalAction> b(InterfaceC49206a interfaceC49206a, vF0.g gVar) {
        InterfaceC49206a interfaceC49206a2 = interfaceC49206a;
        vF0.g gVar2 = gVar;
        if (interfaceC49206a2 instanceof InterfaceC49206a.b) {
            return C43175k.G(new a(interfaceC49206a2, this, null));
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.C12753a) {
            InterfaceC49206a.C12753a c12753a = (InterfaceC49206a.C12753a) interfaceC49206a2;
            S s5 = c12753a.f440557a;
            this.f303142b.Ld(s5, c12753a.f440558b);
            this.f303143c.c(s5);
            return C43175k.w();
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.d) {
            return C43175k.G(new b(interfaceC49206a2, this, gVar2, null));
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.c) {
            return new C43210w(new TravelSearchInternalAction.OpenInlineFilter(gVar2.f440607b, ((InterfaceC49206a.c) interfaceC49206a2).f440563a));
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.h) {
            return new C43210w(new TravelSearchInternalAction.FiltersLoaded(((InterfaceC49206a.h) interfaceC49206a2).f440569a));
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.i) {
            return C43175k.G(new c(interfaceC49206a2, null));
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.g) {
            return new C43210w(new TravelSearchInternalAction.FiltersError(z.n(((InterfaceC49206a.g) interfaceC49206a2).f440568a)));
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.e) {
            return new C43210w(TravelSearchInternalAction.CloseScreen.f303145b);
        }
        if (interfaceC49206a2 instanceof InterfaceC49206a.f) {
            return C43175k.G(new d(this, gVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
