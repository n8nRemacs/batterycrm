package com.avito.android.inline_filters.dialog.search_radius;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.inline_filters.InlineFiltersCommonViewInfo;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.search_radius.LocationPickerDialogFragment;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: LocationPickerFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/search_radius/b;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/search_radius/e;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC30998a<e> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Filter f171989d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FragmentManager f171990e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final p<Filter, InlineFilterValue, G0> f171991f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Y41.a<G0> f171992g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final l<Integer, G0> f171993h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final LocationPickerDialogFragment f171994i;

    /* compiled from: LocationPickerFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f171995l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f171995l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f171995l.invoke();
            return G0.f406611a;
        }
    }

    public /* synthetic */ b(Context context, Filter filter, SearchParams searchParams, LocationPickerScreenOpenEvent.EventSource eventSource, FragmentManager fragmentManager, p pVar, Y41.a aVar, l lVar, InlineFiltersCommonViewInfo inlineFiltersCommonViewInfo, String str, int i12, int i13, C42822w c42822w) {
        this(context, filter, searchParams, eventSource, fragmentManager, pVar, aVar, (i13 & 128) != 0 ? new a(aVar) : lVar, inlineFiltersCommonViewInfo, str, i12);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        LocationPickerDialogFragment locationPickerDialogFragment = this.f171994i;
        if ((locationPickerDialogFragment == null || !locationPickerDialogFragment.isAdded()) && locationPickerDialogFragment != null) {
            locationPickerDialogFragment.show(this.f171990e, "tag.location_picker_dialog_fragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Context context, @k Filter filter, @Y61.l SearchParams searchParams, @Y61.l LocationPickerScreenOpenEvent.EventSource eventSource, @k FragmentManager fragmentManager, @k p<? super Filter, ? super InlineFilterValue, G0> pVar, @k Y41.a<G0> aVar, @k l<? super Integer, G0> lVar, @Y61.l InlineFiltersCommonViewInfo inlineFiltersCommonViewInfo, @Y61.l String str, int i12) {
        super(context, i12);
        this.f171989d = filter;
        this.f171990e = fragmentManager;
        this.f171991f = pVar;
        this.f171992g = aVar;
        this.f171993h = lVar;
        Fragment fragmentH = fragmentManager.H("tag.location_picker_dialog_fragment");
        LocationPickerDialogFragment locationPickerDialogFragment = fragmentH instanceof LocationPickerDialogFragment ? (LocationPickerDialogFragment) fragmentH : null;
        if (locationPickerDialogFragment == null) {
            LocationPickerDialogFragment.a aVar2 = LocationPickerDialogFragment.f171982j0;
            InlineFilterValue value = filter.getValue();
            InlineFilterValue.InlineRadiusValue inlineRadiusValue = value instanceof InlineFilterValue.InlineRadiusValue ? (InlineFilterValue.InlineRadiusValue) value : null;
            Radius radius = inlineRadiusValue != null ? inlineRadiusValue.getRadius() : null;
            String title = filter.getTitle();
            title = title == null ? "" : title;
            boolean z12 = filter.getValue() != null;
            c cVar = new c(this);
            aVar2.getClass();
            locationPickerDialogFragment = new LocationPickerDialogFragment();
            locationPickerDialogFragment.f171984i0 = cVar;
            locationPickerDialogFragment.setStyle(0, i12);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.search_parameters", searchParams);
            bundle.putParcelable("key.search_radius", radius);
            bundle.putParcelable("key.open_event_source", eventSource);
            bundle.putString("key.title", title);
            bundle.putBoolean("key.reset_is_clickable", z12);
            bundle.putParcelable("key.inline_filters_common_view_info", inlineFiltersCommonViewInfo);
            bundle.putString("key.category_id", str);
            locationPickerDialogFragment.setArguments(bundle);
        }
        this.f171994i = locationPickerDialogFragment;
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
    }
}
