package com.avito.android.search.filter.adapter.more_filters;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.saved_searches.presentation.items.switcher.l;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MoreFIltesItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/more_filters/h;", "Lcom/avito/android/search/filter/adapter/more_filters/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f262534c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f262535b;

    public h(@k View view) {
        super(view);
        this.f262535b = (TextView) view;
    }

    @Override // com.avito.android.search.filter.adapter.more_filters.g
    public final void p30(@k Y41.a<G0> aVar) {
        this.f262535b.setOnClickListener(new l(15, aVar));
    }
}
