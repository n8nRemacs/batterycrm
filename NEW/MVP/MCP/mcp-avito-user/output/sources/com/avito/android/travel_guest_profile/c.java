package com.avito.android.travel_guest_profile;

import QE0.a;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.travel_guest_profile.TravelGuestProfileFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TravelGuestProfileFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TravelGuestProfileFragment f301864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchParametersEntry.SearchParametersBlock.Sort.SortOption f301865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating_ui.reviews_options.c f301866n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelGuestProfileFragment travelGuestProfileFragment, SearchParametersEntry.SearchParametersBlock.Sort.SortOption sortOption, com.avito.android.rating_ui.reviews_options.c cVar) {
        super(0);
        this.f301864l = travelGuestProfileFragment;
        this.f301865m = sortOption;
        this.f301866n = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TravelGuestProfileFragment.a aVar = TravelGuestProfileFragment.f301839v0;
        this.f301864l.q5().accept(new a.l(this.f301865m.getValue()));
        this.f301866n.r();
        return G0.f406611a;
    }
}
