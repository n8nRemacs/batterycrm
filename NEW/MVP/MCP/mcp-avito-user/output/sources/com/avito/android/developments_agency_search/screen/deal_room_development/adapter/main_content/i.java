package com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content;

import Ow.C14742a;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.domain.Metro;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MainContentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/main_content/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/main_content/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f137887h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f137888b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f137889c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f137890d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C14742a f137891e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f137892f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f137893g;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137888b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.developer);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137889c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.address);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137890d = (TextView) viewFindViewById3;
        this.f137891e = new C14742a(view);
        View viewFindViewById4 = view.findViewById(R.id.fixation_info);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137892f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.developer_page_link);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137893g = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.h
    public final void C(@k String str) {
        I5.a(this.f137890d, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.h
    public final void D2(@l Metro metro) {
        this.f137891e.a(metro);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.h
    public final void T5(@k String str) {
        I5.a(this.f137889c, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.h
    public final void rT(@k String str) {
        I5.a(this.f137892f, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.h
    public final void setTitle(@k String str) {
        I5.a(this.f137888b, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.h
    public final void zM(@k Y41.a<G0> aVar) {
        this.f137893g.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(24, aVar));
    }
}
