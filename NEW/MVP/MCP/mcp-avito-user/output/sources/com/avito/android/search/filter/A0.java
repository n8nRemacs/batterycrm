package com.avito.android.search.filter;

import android.os.Bundle;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.location_filter.Arguments;
import com.avito.android.search.filter.location_filter.InteractorState;
import com.avito.android.search.filter.location_filter.LocationFiltersDialogFragment;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$q;", "locationGroup", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/converter/ParameterElement$q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class A0 extends kotlin.jvm.internal.N implements Y41.l<ParameterElement.q, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f261737l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C34574h0 c34574h0) {
        super(1);
        this.f261737l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ParameterElement.q qVar) {
        ParameterElement.q qVar2 = qVar;
        C34574h0 c34574h0 = this.f261737l;
        FiltersFragment filtersFragment = c34574h0.f263316N;
        if (filtersFragment != null) {
            FiltersInteractor filtersInteractor = c34574h0.f263329a;
            SearchParams searchParamsF = filtersInteractor.f();
            searchParamsF.setLocalPriority(c34574h0.f263332b0);
            Arguments arguments = new Arguments(searchParamsF, qVar2.f262814f, filtersInteractor.getF261783t(), c34574h0.f263344l);
            FiltersInteractor filtersInteractor2 = filtersFragment.f261844u0;
            if (filtersInteractor2 == null) {
                filtersInteractor2 = null;
            }
            InteractorState interactorStateM = filtersInteractor2.m();
            LocationFiltersDialogFragment locationFiltersDialogFragment = new LocationFiltersDialogFragment();
            locationFiltersDialogFragment.f263439h0 = interactorStateM;
            Bundle bundle = new Bundle();
            bundle.putParcelable("location_filters_args", arguments);
            locationFiltersDialogFragment.setArguments(bundle);
            locationFiltersDialogFragment.show(filtersFragment.getChildFragmentManager(), "location_filter_fragment");
        }
        return kotlin.G0.f406611a;
    }
}
