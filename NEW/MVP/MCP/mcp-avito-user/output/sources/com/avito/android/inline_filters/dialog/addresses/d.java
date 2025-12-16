package com.avito.android.inline_filters.dialog.addresses;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.addresses.SuggestAddressesDialogFragment;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestAddressesFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/addresses/d;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/addresses/f;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC30998a<f> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Filter f171155d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FragmentManager f171156e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final N f171157f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final N f171158g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final SuggestAddressesDialogFragment f171159h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k Context context, @k Filter filter, @l SearchParams searchParams, @k FragmentManager fragmentManager, @k p pVar, @k Y41.l lVar) {
        super(context, R.style.Re23_BottomSheet_Default);
        this.f171155d = filter;
        this.f171156e = fragmentManager;
        this.f171157f = (N) pVar;
        this.f171158g = (N) lVar;
        Fragment fragmentH = fragmentManager.H("tag.suggest_addresses_dialog_fragment");
        SuggestAddressesDialogFragment suggestAddressesDialogFragment = fragmentH instanceof SuggestAddressesDialogFragment ? (SuggestAddressesDialogFragment) fragmentH : null;
        if (suggestAddressesDialogFragment == null) {
            SuggestAddressesDialogFragment.a aVar = SuggestAddressesDialogFragment.f171148k0;
            String title = filter.getTitle();
            title = title == null ? "" : title;
            c cVar = new c(this);
            aVar.getClass();
            suggestAddressesDialogFragment = new SuggestAddressesDialogFragment();
            suggestAddressesDialogFragment.f171151j0 = cVar;
            suggestAddressesDialogFragment.setStyle(0, R.style.Re23_BottomSheet_Default);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.search_parameters", searchParams);
            bundle.putParcelable("key.filter", filter);
            bundle.putString("key.title", title);
            suggestAddressesDialogFragment.setArguments(bundle);
        }
        this.f171159h = suggestAddressesDialogFragment;
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        SuggestAddressesDialogFragment suggestAddressesDialogFragment = this.f171159h;
        if ((suggestAddressesDialogFragment == null || !suggestAddressesDialogFragment.isAdded()) && suggestAddressesDialogFragment != null) {
            suggestAddressesDialogFragment.show(this.f171156e, "tag.suggest_addresses_dialog_fragment");
        }
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
    }
}
