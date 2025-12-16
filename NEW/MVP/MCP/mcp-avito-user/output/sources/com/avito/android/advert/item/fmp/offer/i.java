package com.avito.android.advert.item.fmp.offer;

import LV.c;
import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.fmp.FmpOfferButton;
import com.avito.android.remote.fmp.FmpOfferCondition;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpOfferView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/fmp/offer/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/fmp/offer/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f75551g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f75552b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f75553c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f75554d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f75555e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f75556f;

    public i(@k View view) {
        super(view);
        this.f75552b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.fmp_offer_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75553c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fmp_offer_condition_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f75554d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.fmp_offer_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f75555e = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fmp_offer_legal);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75556f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.advert.item.fmp.offer.h
    public final void KJ(@l FmpOfferButton fmpOfferButton) {
        if (fmpOfferButton != null) {
            Button button = this.f75555e;
            D6.G(button, true);
            String text = fmpOfferButton.getText();
            if (text != null) {
                button.setText(text);
            }
            String style = fmpOfferButton.getStyle();
            int iD2 = style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPrimaryMedium;
            b.a aVar = VU.b.f17147t;
            aVar.getClass();
            button.setStyle((VU.b) c.a.a(aVar, this.f75552b, iD2));
        }
    }

    @Override // com.avito.android.advert.item.fmp.offer.h
    public final void Y(@k Y41.a<G0> aVar) {
        this.f75555e.setOnClickListener(new n(17, aVar));
    }

    @Override // com.avito.android.advert.item.fmp.offer.h
    public final void e(@l AttributedText attributedText) {
        j.a(this.f75553c, attributedText, null);
    }

    @Override // com.avito.android.advert.item.fmp.offer.h
    public final void ni(@l List<FmpOfferCondition> list) {
        LinearLayout linearLayout = this.f75554d;
        linearLayout.removeAllViews();
        if (list != null) {
            for (FmpOfferCondition fmpOfferCondition : list) {
                View viewInflate = LayoutInflater.from(this.f75552b).inflate(R.layout.advert_details_fmp_offer_condition, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.fmp_condition_title);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                j.a((TextView) viewFindViewById, fmpOfferCondition.getTitle(), null);
                linearLayout.addView(viewInflate);
            }
        }
    }

    @Override // com.avito.android.advert.item.fmp.offer.h
    public final void x4(@l AttributedText attributedText) {
        j.a(this.f75556f, attributedText, null);
    }
}
