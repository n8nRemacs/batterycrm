package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DevelopmentTooltipTableItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development_tooltip_table/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development_tooltip_table/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f138404c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f138405b;

    public i(@k View view) {
        super(view);
        this.f138405b = (ListItem) view;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f138405b.setOnClickListener(new h(0, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.g
    public final void b(@k String str) {
        this.f138405b.setTitle(str);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.g
    public final void j(@k String str) {
        this.f138405b.setSubtitle(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f138405b.setOnClickListener(null);
    }
}
