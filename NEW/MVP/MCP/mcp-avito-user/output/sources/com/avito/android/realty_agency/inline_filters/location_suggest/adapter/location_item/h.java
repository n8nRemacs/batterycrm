package com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/adapter/location_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/adapter/location_item/g;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f251654c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckmark f251655b;

    public h(@k View view) {
        super(view);
        this.f251655b = (ListItemCheckmark) view;
    }

    @Override // com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.g
    public final void Cf(@l String str) {
        this.f251655b.setSubtitle(str);
    }

    @Override // com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.g
    public final void J(@k String str) {
        this.f251655b.setTitle(str);
    }

    @Override // com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f251655b.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(24, aVar));
    }

    @Override // com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.g
    public final void hV(boolean z12) {
        ListItemCheckmark listItemCheckmark = this.f251655b;
        if (z12) {
            listItemCheckmark.l();
        } else {
            listItemCheckmark.k();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f251655b.setOnClickListener(null);
    }

    @Override // com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.g
    public final void setChecked(boolean z12) {
        this.f251655b.setChecked(z12);
    }
}
