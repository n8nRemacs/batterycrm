package com.avito.android.inline_filters.dialog.metro;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.metro.MetroSelectDialogFragment;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: MetroSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/metro/c;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/metro/h;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC30998a<h> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Filter f171859d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FragmentManager f171860e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final p<Filter, InlineFilterValue, G0> f171861f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Y41.a<G0> f171862g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final l<Integer, G0> f171863h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final MetroSelectDialogFragment f171864i;

    /* compiled from: MetroSelectFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f171865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f171865l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f171865l.invoke();
            return G0.f406611a;
        }
    }

    public /* synthetic */ c(Context context, Filter filter, MetroResponseBody metroResponseBody, SearchParams searchParams, FragmentManager fragmentManager, p pVar, Y41.a aVar, l lVar, int i12, int i13, C42822w c42822w) {
        this(context, filter, metroResponseBody, searchParams, fragmentManager, pVar, aVar, (i13 & 128) != 0 ? new a(aVar) : lVar, i12);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        MetroSelectDialogFragment metroSelectDialogFragment = this.f171864i;
        if ((metroSelectDialogFragment == null || !metroSelectDialogFragment.isAdded()) && metroSelectDialogFragment != null) {
            metroSelectDialogFragment.show(this.f171860e, "tag.metro_select_dialog_fragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k Context context, @k Filter filter, @Y61.l MetroResponseBody metroResponseBody, @Y61.l SearchParams searchParams, @k FragmentManager fragmentManager, @k p<? super Filter, ? super InlineFilterValue, G0> pVar, @k Y41.a<G0> aVar, @k l<? super Integer, G0> lVar, int i12) {
        super(context, i12);
        this.f171859d = filter;
        this.f171860e = fragmentManager;
        this.f171861f = pVar;
        this.f171862g = aVar;
        this.f171863h = lVar;
        Fragment fragmentH = fragmentManager.H("tag.metro_select_dialog_fragment");
        MetroSelectDialogFragment metroSelectDialogFragment = fragmentH instanceof MetroSelectDialogFragment ? (MetroSelectDialogFragment) fragmentH : null;
        if (metroSelectDialogFragment == null) {
            MetroSelectDialogFragment.a aVar2 = MetroSelectDialogFragment.f171850j0;
            String title = filter.getTitle();
            title = title == null ? "" : title;
            boolean z12 = filter.getValue() != null;
            d dVar = new d(this);
            aVar2.getClass();
            metroSelectDialogFragment = new MetroSelectDialogFragment();
            metroSelectDialogFragment.f171852i0 = dVar;
            metroSelectDialogFragment.setStyle(0, i12);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.search_parameters", searchParams);
            bundle.putParcelable("key.filter", filter);
            bundle.putParcelable("key.metro_data", metroResponseBody);
            bundle.putString("key.title", title);
            bundle.putBoolean("key.reset_is_clickable", z12);
            metroSelectDialogFragment.setArguments(bundle);
        }
        this.f171864i = metroSelectDialogFragment;
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
    }
}
