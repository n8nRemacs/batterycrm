package com.avito.android.inline_filters.dialog.search_radius;

import Y61.k;
import com.avito.android.inline_filters.dialog.search_radius.LocationPickerDialogFragment;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: LocationPickerFilterDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/search_radius/c;", "Lcom/avito/android/inline_filters/dialog/search_radius/LocationPickerDialogFragment$b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements LocationPickerDialogFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f171996a;

    public c(b bVar) {
        this.f171996a = bVar;
    }

    public final void a() {
        b bVar = this.f171996a;
        LocationPickerDialogFragment locationPickerDialogFragment = bVar.f171994i;
        if (locationPickerDialogFragment != null) {
            locationPickerDialogFragment.dismiss();
        }
        bVar.f171993h.invoke(null);
    }

    public final void b(@k InlineFilterValue.InlineRadiusValue inlineRadiusValue) {
        b bVar = this.f171996a;
        LocationPickerDialogFragment locationPickerDialogFragment = bVar.f171994i;
        if (locationPickerDialogFragment != null) {
            locationPickerDialogFragment.dismiss();
        }
        bVar.f171991f.invoke(bVar.f171989d, inlineRadiusValue);
    }
}
