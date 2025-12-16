package com.avito.android.inline_filters.dialog.suggest_location;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.suggest_location.SuggestLocationDialogFragment;
import com.avito.android.location.r;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuggestLocationFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest_location/e;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/suggest_location/g;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends AbstractC30998a<g> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Filter f172274d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final r f172275e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FragmentManager f172276f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final p<Filter, InlineFilterValue, G0> f172277g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Y41.l<Integer, G0> f172278h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f172279i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final SuggestLocationDialogFragment f172280j;

    public /* synthetic */ e(Context context, Filter filter, r rVar, int i12, SearchParams searchParams, FragmentManager fragmentManager, p pVar, Y41.l lVar, Y41.l lVar2, int i13, Boolean bool, int i14, C42822w c42822w) {
        this(context, filter, rVar, i12, searchParams, fragmentManager, pVar, lVar, lVar2, i13, (i14 & 1024) != 0 ? null : bool);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        SuggestLocationDialogFragment suggestLocationDialogFragment = this.f172280j;
        if ((suggestLocationDialogFragment == null || !suggestLocationDialogFragment.isAdded()) && suggestLocationDialogFragment != null) {
            suggestLocationDialogFragment.show(this.f172276f, "tag.suggest_location_dialog_fragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k Context context, @k Filter filter, @l r rVar, int i12, @l SearchParams searchParams, @k FragmentManager fragmentManager, @k p<? super Filter, ? super InlineFilterValue, G0> pVar, @k Y41.l<? super Integer, G0> lVar, @l Y41.l<? super Integer, G0> lVar2, int i13, @l Boolean bool) {
        super(context, i13);
        this.f172274d = filter;
        this.f172275e = rVar;
        this.f172276f = fragmentManager;
        this.f172277g = pVar;
        this.f172278h = lVar;
        this.f172279i = lVar2;
        Fragment fragmentH = fragmentManager.H("tag.suggest_location_dialog_fragment");
        SuggestLocationDialogFragment suggestLocationDialogFragment = fragmentH instanceof SuggestLocationDialogFragment ? (SuggestLocationDialogFragment) fragmentH : null;
        if (suggestLocationDialogFragment == null) {
            SuggestLocationDialogFragment.a aVar = SuggestLocationDialogFragment.f172261l0;
            String title = filter.getTitle();
            title = title == null ? "" : title;
            d dVar = new d(this);
            aVar.getClass();
            suggestLocationDialogFragment = new SuggestLocationDialogFragment();
            suggestLocationDialogFragment.f172263i0 = dVar;
            suggestLocationDialogFragment.setStyle(0, i13);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.search_parameters", searchParams);
            bundle.putParcelable("key.filter", filter);
            bundle.putString("key.title", title);
            bundle.putBoolean("key.suggest_address", false);
            bundle.putInt("key.from_block", i12);
            if (bool != null) {
                bundle.putBoolean("key.only_real_location", bool.booleanValue());
            }
            suggestLocationDialogFragment.setArguments(bundle);
        }
        this.f172280j = suggestLocationDialogFragment;
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
    }
}
