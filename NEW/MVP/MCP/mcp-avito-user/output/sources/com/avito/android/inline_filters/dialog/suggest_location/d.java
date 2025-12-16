package com.avito.android.inline_filters.dialog.suggest_location;

import Y61.k;
import Y61.l;
import com.avito.android.inline_filters.dialog.suggest_location.SuggestLocationDialogFragment;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: SuggestLocationFilterDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest_location/d;", "Lcom/avito/android/inline_filters/dialog/suggest_location/SuggestLocationDialogFragment$b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements SuggestLocationDialogFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f172273a;

    public d(e eVar) {
        this.f172273a = eVar;
    }

    public final void a(@l Integer num) {
        e eVar = this.f172273a;
        SuggestLocationDialogFragment suggestLocationDialogFragment = eVar.f172280j;
        if (suggestLocationDialogFragment != null) {
            suggestLocationDialogFragment.dismiss();
        }
        eVar.f172278h.invoke(num);
    }

    public final void b(@k InlineFilterValue inlineFilterValue) {
        e eVar = this.f172273a;
        SuggestLocationDialogFragment suggestLocationDialogFragment = eVar.f172280j;
        if (suggestLocationDialogFragment != null) {
            suggestLocationDialogFragment.dismiss();
        }
        eVar.f172277g.invoke(eVar.f172274d, inlineFilterValue);
    }
}
