package com.avito.android.inline_filters.dialog.metro;

import Y61.k;
import com.avito.android.inline_filters.dialog.metro.MetroSelectDialogFragment;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: MetroSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/metro/d;", "Lcom/avito/android/inline_filters/dialog/metro/MetroSelectDialogFragment$b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements MetroSelectDialogFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f171866a;

    public d(c cVar) {
        this.f171866a = cVar;
    }

    public final void a() {
        c cVar = this.f171866a;
        MetroSelectDialogFragment metroSelectDialogFragment = cVar.f171864i;
        if (metroSelectDialogFragment != null) {
            metroSelectDialogFragment.dismiss();
        }
        cVar.f171863h.invoke(null);
    }

    public final void b(@k InlineFilterValue inlineFilterValue) {
        c cVar = this.f171866a;
        MetroSelectDialogFragment metroSelectDialogFragment = cVar.f171864i;
        if (metroSelectDialogFragment != null) {
            metroSelectDialogFragment.dismiss();
        }
        cVar.f171861f.invoke(cVar.f171859d, inlineFilterValue);
    }
}
