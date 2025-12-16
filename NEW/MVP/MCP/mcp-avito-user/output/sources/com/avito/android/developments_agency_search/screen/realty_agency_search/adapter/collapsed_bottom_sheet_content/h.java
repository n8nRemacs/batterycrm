package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CollapsedBottomSheetContentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f138297e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f138298b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f138299c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Spinner f138300d;

    public h(@k View view) {
        super(view);
        this.f138298b = view;
        View viewFindViewById = view.findViewById(R.id.search_result_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f138299c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.loading_spinner);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f138300d = (Spinner) viewFindViewById2;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f138298b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(26, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f138298b.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content.g
    public final void lj(boolean z12) {
        D6.G(this.f138300d, z12);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content.g
    public final void pC(@k String str) {
        this.f138299c.setText(str);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content.g
    public final void zV(boolean z12) {
        D6.G(this.f138299c, z12);
    }
}
