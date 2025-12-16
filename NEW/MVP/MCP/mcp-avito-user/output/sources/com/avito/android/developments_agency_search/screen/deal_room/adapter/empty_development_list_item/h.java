package com.avito.android.developments_agency_search.screen.deal_room.adapter.empty_development_list_item;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyDevelopmentListItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/empty_development_list_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/empty_development_list_item/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f137384c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f137385b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.open_search_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f137385b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.empty_development_list_item.g
    public final void bJ(@k Y41.a<G0> aVar) {
        this.f137385b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(17, aVar));
    }
}
