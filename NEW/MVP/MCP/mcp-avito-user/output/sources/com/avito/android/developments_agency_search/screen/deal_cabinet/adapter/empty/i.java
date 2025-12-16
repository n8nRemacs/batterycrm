package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.empty;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/empty/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/empty/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f136835f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f136836b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AppCompatTextView f136837c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AppCompatTextView f136838d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f136839e;

    public i(@k View view) {
        super(view);
        this.f136836b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        }
        this.f136837c = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        }
        this.f136838d = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f136839e = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.empty.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f136839e.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(11, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.empty.h
    public final void e2(@k PrintableText printableText) {
        I5.a(this.f136838d, printableText.k0(this.f136836b.getContext()), false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f136839e.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.empty.h
    public final void p1(@k PrintableText printableText) {
        I5.a(this.f136837c, printableText.k0(this.f136836b.getContext()), false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.empty.h
    public final void xM(@l PrintableText printableText) {
        String strK0 = printableText != null ? printableText.k0(this.f136836b.getContext()) : null;
        if (strK0 == null) {
            strK0 = "";
        }
        Button button = this.f136839e;
        button.setText(strK0);
        D6.G(button, printableText != null);
    }
}
