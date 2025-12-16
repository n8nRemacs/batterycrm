package com.avito.android.advert_details_items.price_discount;

import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.price_hint.j;
import com.avito.android.advert_details_items.price_hint.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonusesInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import t9.InterfaceC48520a;

/* compiled from: PriceWithDiscountView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/price_discount/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/price_discount/g;", "Lcom/avito/android/advert_details_items/price_hint/j;", "Lcom/avito/android/advert_details_items/buyer_bonuses/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, j, com.avito.android.advert_details_items.buyer_bonuses.f {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f85336o = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f85337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_details_items.buyer_bonuses.h f85338c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f85339d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f85340e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f85341f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f85342g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f85343h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f85344i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f85345j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f85346k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f85347l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f85348m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public InterfaceC48520a f85349n;

    /* compiled from: PriceWithDiscountView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = h.this;
            int top = hVar.f85345j.getTop();
            int top2 = hVar.f85346k.getTop();
            TextView textView = hVar.f85347l;
            if (top == top2) {
                D6.H(textView);
            } else {
                D6.g(textView);
            }
            return G0.f406611a;
        }
    }

    public h(@Y61.k View view) {
        super(view);
        this.f85337b = new k(view);
        this.f85338c = new com.avito.android.advert_details_items.buyer_bonuses.h(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.item_price_with_discount);
        this.f85339d = viewGroup;
        this.f85340e = (TextView) viewGroup.findViewById(R.id.price);
        this.f85341f = (TextView) viewGroup.findViewById(R.id.price_with_discount);
        this.f85342g = (TextView) viewGroup.findViewById(R.id.price_without_discount);
        this.f85343h = (ViewGroup) view.findViewById(R.id.price_normalized_container);
        this.f85344i = (TextView) view.findViewById(R.id.price_normalized_without_discount);
        this.f85345j = (TextView) view.findViewById(R.id.price_normalized_discount_percent);
        this.f85346k = (TextView) view.findViewById(R.id.price_normalized_with_discount);
        this.f85347l = (TextView) view.findViewById(R.id.divider);
        this.f85348m = C35835l0.e(R.attr.gray48, view.getContext());
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void B00(@Y61.k BuyerBonuses buyerBonuses) {
        this.f85338c.B00(buyerBonuses);
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void Eu(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        ViewGroup viewGroup = this.f85343h;
        D6.H(viewGroup);
        D6.w(this.f85342g);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
        I5.a(this.f85344i, spannableString, false);
        I5.a(this.f85345j, str2, false);
        I5.a(this.f85346k, str3, false);
        D6.B(new a(), viewGroup);
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void KP() {
        this.f85340e.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_info, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // com.avito.android.advert_details_items.price_discount.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NF(@Y61.l com.avito.android.remote.model.PriceWithDiscount r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            android.widget.TextView r2 = r6.f85341f
            com.avito.android.util.D6.G(r2, r1)
            if (r7 != 0) goto Le
            return
        Le:
            java.lang.String r1 = r7.getIcon()
            java.lang.String r3 = r7.getIconColor()
            android.content.Context r4 = r2.getContext()
            r5 = 0
            if (r1 != 0) goto L1f
        L1d:
            r1 = r5
            goto L5e
        L1f:
            java.lang.Integer r1 = com.avito.android.lib.util.q.a(r1)
            if (r1 == 0) goto L1d
            int r1 = r1.intValue()
            android.graphics.drawable.Drawable r1 = com.avito.android.util.C35835l0.h(r1, r4)
            if (r1 == 0) goto L1d
            if (r3 == 0) goto L50
            java.lang.Integer r3 = com.avito.android.lib.util.e.a(r3)
            if (r3 == 0) goto L48
            android.content.Context r4 = r6.getContext()
            int r3 = r3.intValue()
            int r3 = com.avito.android.util.C35835l0.d(r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L49
        L48:
            r3 = r5
        L49:
            if (r3 == 0) goto L50
            int r3 = r3.intValue()
            goto L5b
        L50:
            android.content.Context r3 = r6.getContext()
            r4 = 2130969131(0x7f04022b, float:1.7546935E38)
            int r3 = com.avito.android.util.C35835l0.d(r4, r3)
        L5b:
            com.avito.android.util.V0.a(r1, r3)
        L5e:
            java.lang.String r7 = r7.getTitle()
            com.avito.android.util.I5.a(r2, r7, r0)
            r7 = 14
            com.avito.android.util.I5.d(r2, r1, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_details_items.price_discount.h.NF(com.avito.android.remote.model.PriceWithDiscount):void");
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void Si(@l String str, @l String str2) {
        this.f85338c.Si(str, str2);
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void Su() {
        D6.w(this.f85342g);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void X70(boolean z12) {
        this.f85338c.X70(z12);
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void a(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.advert_collection.adapter.order.h hVar = new com.avito.android.advert_collection.adapter.order.h(23, aVar);
        ViewGroup viewGroup = this.f85339d;
        viewGroup.setOnClickListener(hVar);
        viewGroup.setClickable(true);
        viewGroup.setFocusable(true);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void bB(@l BuyerBonusesInfo buyerBonusesInfo, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f85338c.bB(buyerBonusesInfo, lVar);
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    public final void du(@l Y41.a<G0> aVar) {
        this.f85337b.du(aVar);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void fa() {
        this.f85338c.fa();
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void fs(@Y61.k String str) {
        I5.a(this.f85342g, str, false);
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    @Y61.k
    public final Context getContext() {
        return this.f85337b.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        InterfaceC48520a interfaceC48520a = this.f85349n;
        if (interfaceC48520a != null) {
            interfaceC48520a.dismiss();
        }
        this.f85349n = null;
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void lL() {
        this.f85340e.setCompoundDrawables(null, null, null, null);
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    public final void ox() {
        this.f85337b.ox();
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void pT(@Y61.k String str) {
        I5.a(this.f85340e, str, false);
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void qt(@Y61.k InterfaceC48520a interfaceC48520a) {
        InterfaceC48520a interfaceC48520a2 = this.f85349n;
        if (interfaceC48520a2 != null) {
            interfaceC48520a2.dismiss();
        }
        this.f85349n = interfaceC48520a;
        interfaceC48520a.b(this.itemView.getContext());
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void t3() {
        ViewGroup viewGroup = this.f85339d;
        viewGroup.setOnClickListener(null);
        viewGroup.setClickable(false);
        viewGroup.setFocusable(false);
    }

    @Override // com.avito.android.advert_details_items.price_discount.g
    public final void y1() {
        this.f85340e.setTextColor(this.f85348m);
    }
}
