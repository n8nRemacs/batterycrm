package com.avito.android.developments_agency_search.adapter.error_layout;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorLayoutItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/error_layout/i;", "Lcom/avito/android/developments_agency_search/adapter/error_layout/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f136274e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f136275b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f136276c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f136277d;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.error_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136275b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.error_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136276c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f136277d = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.developments_agency_search.adapter.error_layout.h
    public final void A4(@k PrintableText printableText) {
        TextView textView = this.f136275b;
        I5.a(textView, printableText.k0(textView.getContext()), false);
    }

    @Override // com.avito.android.developments_agency_search.adapter.error_layout.h
    public final void Bv(@k PrintableText printableText) {
        Button button = this.f136277d;
        com.avito.android.lib.design.button.b.a(button, printableText.k0(button.getContext()), false);
    }

    @Override // com.avito.android.developments_agency_search.adapter.error_layout.h
    public final void L0(@k Y41.a<G0> aVar) {
        this.f136277d.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(8, aVar));
    }

    @Override // com.avito.android.developments_agency_search.adapter.error_layout.h
    public final void PE(@k PrintableText printableText) {
        TextView textView = this.f136276c;
        I5.a(textView, printableText.k0(textView.getContext()), false);
    }

    @Override // com.avito.android.developments_agency_search.adapter.error_layout.h
    public final void g8(boolean z12) {
        D6.G(this.f136277d, z12);
    }

    @Override // com.avito.android.developments_agency_search.adapter.error_layout.h
    public final void ke(@InterfaceC42150f int i12) {
        TextView textView = this.f136275b;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
    }
}
