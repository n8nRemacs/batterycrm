package com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AccordionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/accordion/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/accordion/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f137257d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Accordion f137258b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f137259c;

    public h(@k View view) {
        super(view);
        Accordion accordion = (Accordion) view;
        accordion.setHasCustomContent(true);
        View viewFindViewById = accordion.findViewById(R.id.accordion_title_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        D6.f((TextView) viewFindViewById, y6.b(16), 0, 0, 0, 14);
        accordion.getCustomContentContainer().addView(new View(accordion.getContext()));
        this.f137258b = accordion;
        View viewFindViewById2 = accordion.findViewById(R.id.accordion_arrow);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f137259c = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.g
    public final void RG(boolean z12) {
        D6.G(this.f137259c, z12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f137258b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(14, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137258b.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.g
    public final void s2(boolean z12) {
        this.f137258b.a(z12, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.g
    public final void setTitle(@k String str) {
        this.f137258b.setTitleText(str);
    }
}
