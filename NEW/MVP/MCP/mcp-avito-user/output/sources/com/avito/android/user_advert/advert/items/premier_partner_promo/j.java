package com.avito.android.user_advert.advert.items.premier_partner_promo;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PremierPartnerPromoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/premier_partner_promo/j;", "Lcom/avito/android/user_advert/advert/items/premier_partner_promo/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f309834h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f309835b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309836c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f309837d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f309838e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f309839f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f309840g;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.button_more);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f309835b = button;
        View viewFindViewById2 = view.findViewById(R.id.text_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309836c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text_body);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309837d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.keys_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309838e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.graph_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309839f = (TextView) viewFindViewById5;
        this.f309840g = button.getContext();
    }

    @Override // com.avito.android.user_advert.advert.items.premier_partner_promo.f
    public final void XO(@k Y41.a<G0> aVar) {
        this.f309835b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(21, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.premier_partner_promo.f
    public final void dh() {
        Context context = this.f309840g;
        I5.a(this.f309836c, context.getString(R.string.item_premier_partner_offer_title), false);
        I5.a(this.f309837d, context.getString(R.string.item_premier_partner_offer_description), false);
        I5.a(this.f309838e, context.getString(R.string.item_premier_partner_offer_market_price), false);
        I5.a(this.f309839f, context.getString(R.string.item_premier_partner_offer_confortable_time), false);
        com.avito.android.lib.design.button.b.a(this.f309835b, context.getString(R.string.item_premier_partner_offer_button_title), false);
    }
}
