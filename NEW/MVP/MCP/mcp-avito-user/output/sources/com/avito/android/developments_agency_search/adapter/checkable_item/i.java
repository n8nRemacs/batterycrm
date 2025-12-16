package com.avito.android.developments_agency_search.adapter.checkable_item;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/checkable_item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/adapter/checkable_item/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f136226c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckmark f136227b;

    public i(@k View view) {
        super(view);
        this.f136227b = (ListItemCheckmark) view;
    }

    @Override // com.avito.android.developments_agency_search.adapter.checkable_item.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f136227b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(5, aVar));
    }

    @Override // com.avito.android.developments_agency_search.adapter.checkable_item.h
    public final void setChecked(boolean z12) {
        this.f136227b.setChecked(z12);
    }

    @Override // com.avito.android.developments_agency_search.adapter.checkable_item.h
    public final void setTitle(@k String str) {
        this.f136227b.setTitle(str);
    }
}
