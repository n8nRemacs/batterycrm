package com.avito.android.advert_details_items.services_discount_and_gifts;

import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/services_discount_and_gifts/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/services_discount_and_gifts/g;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f85673k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f85674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f85675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f85676d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f85677e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f85678f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f85679g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f85680h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f85681i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f85682j;

    /* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            i iVar = i.this;
            boolean zY2 = D6.y(iVar.f85681i);
            TextView textView = iVar.f85680h;
            if (zY2 && iVar.f85677e.getTop() == iVar.f85679g.getTop()) {
                D6.H(textView);
            } else {
                D6.w(textView);
            }
            return G0.f406611a;
        }
    }

    public i(@Y61.k View view) {
        super(view);
        this.f85674b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.discount_and_gift_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f85675c = (FlexboxLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_services_discount_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f85676d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_gift_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f85677e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.advert_services_discount_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85678f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.advert_services_discount_description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85679g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.divider);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85680h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.advert_buyer_gift_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85681i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.advert_buyer_gift_arrow);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85682j = (TextView) viewFindViewById8;
    }

    @Override // com.avito.android.advert_details_items.services_discount_and_gifts.g
    public final void hM(@l String str, @l String str2, @l String str3) {
        LinearLayout linearLayout = this.f85676d;
        linearLayout.setVisibility(0);
        D6.B(new a(), linearLayout);
        this.f85678f.setText(str + ' ' + str2);
        this.f85679g.setText(str3);
    }

    @Override // com.avito.android.advert_details_items.services_discount_and_gifts.g
    public final void oQ(@Y61.k final Y41.a aVar, @l String str, @l final String str2) {
        TextView textView = this.f85681i;
        textView.setVisibility(0);
        textView.setText(str);
        if (str2 != null) {
            TextView textView2 = this.f85682j;
            if (textView2.getVisibility() == 8) {
                textView2.setVisibility(0);
                FV.a.f4720a.f(textView2, R.attr.textIconChevronRight, FV.a.f4721b);
            }
            this.f85675c.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_details_items.services_discount_and_gifts.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i.f85673k;
                    ((d) aVar).invoke();
                    Context context = this.f85674b;
                    View viewInflate = View.inflate(context, R.layout.advert_details_buyer_gift_popup, null);
                    com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
                    dVar.setContentView(viewInflate);
                    com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                    com.avito.android.lib.design.bottom_sheet.j.b(dVar, true, 4);
                    dVar.setCanceledOnTouchOutside(true);
                    new k(viewInflate).f85684a.setText(str2);
                    com.avito.android.lib.util.g.a(dVar);
                }
            });
        }
    }
}
