package com.avito.android.tariff.cpx.configure.landing.items.accordions_card;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureLandingAccordionsCardItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/accordions_card/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/landing/items/accordions_card/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f295959h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f295960b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f295961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f295962d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout.LayoutParams f295963e;

    /* renamed from: f, reason: collision with root package name */
    public final int f295964f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout.LayoutParams f295965g;

    public i(@k View view) {
        super(view);
        this.f295960b = (TextView) view.findViewById(R.id.cpx_configure_landing_accordions_card_title);
        this.f295961c = (LinearLayout) view.findViewById(R.id.cpx_configure_landing_accordions_card_accordions_container);
        this.f295962d = R.attr.accordionM20;
        this.f295963e = new LinearLayout.LayoutParams(-1, -2);
        this.f295964f = C35835l0.d(R.attr.gray12, this.itemView.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, y6.b(1));
        layoutParams.setMargins(0, 0, 0, y6.b(10));
        this.f295965g = layoutParams;
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.accordions_card.h
    public final void ZF(@k com.avito.android.util.text.a aVar, @k List<CpxConfigureLandingAccordionItem> list, @k l<? super String, G0> lVar) {
        LinearLayout linearLayout = this.f295961c;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            CpxConfigureLandingAccordionItem cpxConfigureLandingAccordionItem = (CpxConfigureLandingAccordionItem) obj;
            String str = cpxConfigureLandingAccordionItem.f295941b;
            Accordion accordion = new Accordion(this.itemView.getContext(), null, this.f295962d, 0, 10, null);
            accordion.setTag(str);
            accordion.setTitleText(aVar.c(this.itemView.getContext(), cpxConfigureLandingAccordionItem.f295942c));
            accordion.setContentText(aVar.c(this.itemView.getContext(), cpxConfigureLandingAccordionItem.f295943d));
            accordion.a(cpxConfigureLandingAccordionItem.f295944e, false);
            accordion.setArrowAlignedEnd(true);
            accordion.setOnClickListener(new Tf.b(4, lVar, str));
            linearLayout.addView(accordion, this.f295963e);
            if (i12 != list.size() - 1) {
                View view = new View(this.itemView.getContext());
                view.setBackgroundColor(this.f295964f);
                linearLayout.addView(view, this.f295965g);
            }
            i12 = i13;
        }
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.accordions_card.h
    public final void e(@Y61.l AttributedText attributedText) {
        j.a(this.f295960b, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.accordions_card.h
    public final void hj(@k String str) {
        ((Accordion) this.f295961c.findViewWithTag(str)).a(!r3.f178189m, true);
    }
}
