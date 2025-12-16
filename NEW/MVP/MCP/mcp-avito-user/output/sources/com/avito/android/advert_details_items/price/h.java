package com.avito.android.advert_details_items.price;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonusesInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35964w;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsPriceView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/price/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/price/g;", "Lcom/avito/android/advert_details_items/price_hint/j;", "Lcom/avito/android/advert_details_items/buyer_bonuses/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, com.avito.android.advert_details_items.price_hint.j, com.avito.android.advert_details_items.buyer_bonuses.f {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f85188n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_details_items.price_hint.k f85189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_details_items.buyer_bonuses.h f85190c;

    /* renamed from: d, reason: collision with root package name */
    public final View f85191d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f85192e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f85193f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final TextView f85194g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f85195h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f85196i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f85197j;

    /* renamed from: k, reason: collision with root package name */
    public final int f85198k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f85199l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f85200m;

    /* compiled from: AdvertDetailsPriceView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f85201l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f85201l = view;
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(this.f85201l.getResources().getDimension(R.dimen.advert_old_price_redesigned_size));
        }
    }

    /* compiled from: AdvertDetailsPriceView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r5 = this;
                com.avito.android.advert_details_items.price.h r0 = com.avito.android.advert_details_items.price.h.this
                android.widget.TextView r1 = r0.f85193f
                r2 = 0
                if (r1 == 0) goto L10
                int r1 = r1.getTop()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L11
            L10:
                r1 = r2
            L11:
                android.widget.TextView r3 = r0.f85195h
                if (r3 == 0) goto L1e
                int r4 = r3.getTop()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L1f
            L1e:
                r4 = r2
            L1f:
                boolean r1 = kotlin.jvm.internal.L.f(r1, r4)
                android.widget.TextView r4 = r0.f85196i
                if (r1 == 0) goto L45
                android.widget.TextView r0 = r0.f85193f
                if (r0 == 0) goto L45
                boolean r0 = com.avito.android.util.D6.y(r0)
                r1 = 1
                if (r0 != r1) goto L45
                if (r3 == 0) goto L38
                java.lang.CharSequence r2 = r3.getText()
            L38:
                if (r2 == 0) goto L45
                int r0 = r2.length()
                if (r0 != 0) goto L41
                goto L45
            L41:
                com.avito.android.util.D6.H(r4)
                goto L48
            L45:
                com.avito.android.util.D6.w(r4)
            L48:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_details_items.price.h.b.invoke():java.lang.Object");
        }
    }

    /* compiled from: AdvertDetailsPriceView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f85203l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f85203l = view;
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(this.f85203l.getResources().getDimension(R.dimen.advert_old_price_standard_size));
        }
    }

    public h(@Y61.k View view) {
        super(view);
        this.f85189b = new com.avito.android.advert_details_items.price_hint.k(view);
        this.f85190c = new com.avito.android.advert_details_items.buyer_bonuses.h(view);
        View viewFindViewById = view.findViewById(R.id.item_price);
        this.f85191d = viewFindViewById;
        this.f85192e = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.current_price) : null;
        this.f85193f = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.old_price) : null;
        this.f85194g = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.old_price_hint) : null;
        this.f85195h = (TextView) view.findViewById(R.id.price_normalized_with_discount);
        this.f85196i = (TextView) view.findViewById(R.id.divider);
        this.f85197j = (ViewGroup) view.findViewById(R.id.normalized_price_container);
        this.f85198k = C35835l0.d(R.attr.gray48, view.getContext());
        this.f85199l = C42727D.c(new c(view));
        this.f85200m = C42727D.c(new a(view));
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void B00(@Y61.k BuyerBonuses buyerBonuses) {
        this.f85190c.B00(buyerBonuses);
    }

    public final void B80(String str) {
        int i12 = C35964w.f319103a;
        boolean z12 = str == null || str.length() == 0;
        TextView textView = this.f85193f;
        if (z12) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
        if (textView != null) {
            textView.setText(spannableString);
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setTextSize(0, ((Number) this.f85199l.getValue()).floatValue());
        }
    }

    @Override // com.avito.android.advert_details_items.price.g
    public final void BP(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        TextView textView = this.f85192e;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        B80(str2);
        TextView textView2 = this.f85194g;
        if (textView2 != null) {
            I5.a(textView2, str3, false);
        }
    }

    @Override // com.avito.android.advert_details_items.price.g
    public final void Fw(boolean z12) {
        TextView textView = this.f85192e;
        if (textView != null) {
            textView.setTextColor(this.f85198k);
        }
        if (z12) {
            TextView textView2 = this.f85193f;
            if (textView2 != null) {
                D6.w(textView2);
            }
            TextView textView3 = this.f85194g;
            if (textView3 != null) {
                D6.w(textView3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    @Override // com.avito.android.advert_details_items.price.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GT(@Y61.l java.lang.String r4, @Y61.l java.lang.String r5, @Y61.l com.avito.android.remote.model.text.AttributedText r6, @Y61.l java.lang.String r7, @Y61.l java.lang.String r8) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.f85192e
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L11
            if (r0 == 0) goto Le
            com.avito.android.util.text.j.a(r0, r6, r2)
            kotlin.G0 r6 = kotlin.G0.f406611a
            goto Lf
        Le:
            r6 = r2
        Lf:
            if (r6 != 0) goto L18
        L11:
            if (r0 == 0) goto L18
            com.avito.android.util.I5.a(r0, r4, r1)
            kotlin.G0 r4 = kotlin.G0.f406611a
        L18:
            android.widget.TextView r4 = r3.f85193f
            if (r4 == 0) goto L1f
            com.avito.android.util.I5.a(r4, r5, r1)
        L1f:
            kotlin.C r5 = r3.f85200m
            if (r4 == 0) goto L30
            java.lang.Object r6 = r5.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r4.setTextSize(r1, r6)
        L30:
            android.widget.TextView r4 = r3.f85194g
            if (r4 == 0) goto L37
            com.avito.android.util.I5.a(r4, r7, r1)
        L37:
            if (r4 == 0) goto L46
            java.lang.Object r6 = r5.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r4.setTextSize(r1, r6)
        L46:
            android.widget.TextView r4 = r3.f85195h
            if (r4 == 0) goto L57
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r4.setTextSize(r1, r5)
        L57:
            if (r8 == 0) goto L6f
            com.avito.android.util.D6.H(r4)
            if (r4 == 0) goto L61
            com.avito.android.util.I5.a(r4, r8, r1)
        L61:
            android.view.ViewGroup r4 = r3.f85197j
            if (r4 == 0) goto L6f
            com.avito.android.advert_details_items.price.h$b r5 = new com.avito.android.advert_details_items.price.h$b
            r5.<init>()
            com.avito.android.util.D6.B(r5, r4)
            kotlin.G0 r2 = kotlin.G0.f406611a
        L6f:
            if (r2 != 0) goto L76
            android.widget.TextView r4 = r3.f85196i
            com.avito.android.util.D6.w(r4)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_details_items.price.h.GT(java.lang.String, java.lang.String, com.avito.android.remote.model.text.AttributedText, java.lang.String, java.lang.String):void");
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void Si(@Y61.l String str, @Y61.l String str2) {
        this.f85190c.Si(str, str2);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void X70(boolean z12) {
        this.f85190c.X70(z12);
    }

    @Override // com.avito.android.advert_details_items.price.g
    public final void YQ(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        TextView textView = this.f85192e;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        TextView textView2 = this.f85193f;
        if (textView2 != null) {
            I5.a(textView2, str2, false);
        }
        InterfaceC42726C interfaceC42726C = this.f85199l;
        if (textView2 != null) {
            textView2.setTextSize(0, ((Number) interfaceC42726C.getValue()).floatValue());
        }
        TextView textView3 = this.f85194g;
        if (textView3 != null) {
            I5.a(textView3, str3, false);
        }
        if (textView3 != null) {
            textView3.setTextSize(0, ((Number) interfaceC42726C.getValue()).floatValue());
        }
    }

    @Override // com.avito.android.advert_details_items.price.g
    public final void ZS(@Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f85194g;
        if (textView != null) {
            textView.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(21, aVar));
        }
        if (textView != null) {
            textView.setCompoundDrawablePadding(y6.b(2));
        }
        Drawable drawableH = C35835l0.h(R.attr.ic_arrowRight16, getContext());
        if (textView != null) {
            int currentTextColor = textView.getCurrentTextColor();
            if (drawableH != null) {
                V0.a(drawableH, currentTextColor);
            }
        }
        if (textView != null) {
            I5.d(textView, null, drawableH, 11);
        }
    }

    @Override // com.avito.android.advert_details_items.price.g
    public final void a20(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12) {
        TextView textView = this.f85192e;
        if (textView != null) {
            com.avito.android.util.text.j.c(textView, new AttributedText("{{price}} {{normalizedPrice}}", C42745f0.U(new FontAttribute("price", str, com.avito.android.advert.item.delivery_suggests.l.u(null, "textH2")), new FontAttribute("normalizedPrice", str2, C42745f0.U(new FontParameter.TextStyleParameter(null, "textBody"), new FontParameter.ColorParameter(new Color(0), null, z12 ? AvitoMapMarkerKt.AMENITY_TYPE_BLACK : "gray44")))), 0), null);
        }
        D6.H(textView);
        B80(str3);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void bB(@Y61.l BuyerBonusesInfo buyerBonusesInfo, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f85190c.bB(buyerBonusesInfo, lVar);
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    public final void du(@Y61.l Y41.a<G0> aVar) {
        this.f85189b.du(aVar);
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.f
    public final void fa() {
        this.f85190c.fa();
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    @Y61.k
    public final Context getContext() {
        return this.f85189b.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f85189b.j5();
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    public final void ox() {
        this.f85189b.ox();
    }
}
