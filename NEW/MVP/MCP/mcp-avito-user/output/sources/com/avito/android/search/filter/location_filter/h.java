package com.avito.android.search.filter.location_filter;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f263641l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar) {
        super(1);
        this.f263641l = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        r rVar = this.f263641l;
        rVar.f263658e.j(rVar.f263654a.f().getCategoryId());
        LocationFiltersDialogFragment locationFiltersDialogFragment = rVar.f263677x;
        if (locationFiltersDialogFragment != null) {
            locationFiltersDialogFragment.dismiss();
        }
        return G0.f406611a;
    }
}
