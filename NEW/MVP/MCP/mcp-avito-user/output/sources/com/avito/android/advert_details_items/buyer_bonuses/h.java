package com.avito.android.advert_details_items.buyer_bonuses;

import Ca1.ViewOnClickListenerC13236c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonusesInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BuyerBonusesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/buyer_bonuses/h;", "Lcom/avito/android/advert_details_items/buyer_bonuses/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Context f84489b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ViewGroup f84490c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ViewGroup f84491d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TextView f84492e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ImageView f84493f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ImageView f84494g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final TextView f84495h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final TextView f84496i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final TextView f84497j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ImageView f84498k;

    /* compiled from: BuyerBonusesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = h.this;
            TextView textView = hVar.f84496i;
            Integer numValueOf = textView != null ? Integer.valueOf(textView.getTop()) : null;
            ViewGroup viewGroup = hVar.f84491d;
            boolean zF2 = L.f(numValueOf, viewGroup != null ? Integer.valueOf(viewGroup.getTop()) : null);
            TextView textView2 = hVar.f84497j;
            if (zF2) {
                D6.H(textView2);
            } else {
                if (L.f(textView2 != null ? Integer.valueOf(textView2.getTop()) : null, viewGroup != null ? Integer.valueOf(viewGroup.getTop()) : null)) {
                    D6.w(textView2);
                } else {
                    D6.g(textView2);
                }
            }
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        this.f84489b = view.getContext();
        this.f84490c = (ViewGroup) view.findViewById(R.id.item_price);
        this.f84491d = (ViewGroup) view.findViewById(R.id.buyer_bonuses_container);
        this.f84492e = (TextView) view.findViewById(R.id.buyer_bonuses_text);
        this.f84493f = (ImageView) view.findViewById(R.id.buyer_bonuses_icon);
        this.f84494g = (ImageView) view.findViewById(R.id.buyer_bonuses_arrow);
        this.f84495h = (TextView) view.findViewById(R.id.buyer_bonuses_price);
        this.f84496i = (TextView) view.findViewById(R.id.buyer_bonuses_normalized_price);
        this.f84497j = (TextView) view.findViewById(R.id.divider);
        this.f84498k = (ImageView) view.findViewById(R.id.lastMinuteOffer_icon);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void B00(@k BuyerBonuses buyerBonuses) {
        D6.H(this.f84491d);
        Drawable drawableH = null;
        TextView textView = this.f84492e;
        if (textView != null) {
            j.a(textView, buyerBonuses.getText(), null);
        }
        String name = buyerBonuses.getIcon().getName();
        if (name != null) {
            Integer numA = q.a(name);
            if (numA != null) {
                drawableH = C35835l0.h(numA.intValue(), this.f84489b);
            }
            ImageView imageView = this.f84493f;
            if (imageView != null) {
                imageView.setImageDrawable(drawableH);
            }
        }
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void Si(@l String str, @l String str2) {
        TextView textView = this.f84495h;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        TextView textView2 = this.f84496i;
        if (textView2 != null) {
            I5.a(textView2, str2, false);
        }
        if (str2 == null || str2.length() == 0) {
            D6.w(this.f84497j);
            return;
        }
        ViewGroup viewGroup = this.f84490c;
        if (viewGroup != null) {
            D6.B(new a(), viewGroup);
        }
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void X70(boolean z12) {
        D6.G(this.f84498k, z12);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void bB(@l BuyerBonusesInfo buyerBonusesInfo, @k Y41.l<? super DeepLink, G0> lVar) {
        if (buyerBonusesInfo != null) {
            D6.H(this.f84494g);
            ViewGroup viewGroup = this.f84491d;
            if (viewGroup != null) {
                viewGroup.setOnClickListener(new ViewOnClickListenerC13236c(this, buyerBonusesInfo, lVar, 14));
            }
        }
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void fa() {
        D6.H(this.f84490c);
    }
}
