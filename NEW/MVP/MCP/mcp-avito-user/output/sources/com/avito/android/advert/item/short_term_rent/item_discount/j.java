package com.avito.android.advert.item.short_term_rent.item_discount;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.short_term_rent.entity.ShortTermRentItemDiscount;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsShortTermRentItemDiscountView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/item_discount/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/short_term_rent/item_discount/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f80058i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f80059b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f80060c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f80061d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f80062e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f80063f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f80064g;

    /* renamed from: h, reason: collision with root package name */
    public final Switcher f80065h;

    /* compiled from: AdvertDetailsShortTermRentItemDiscountView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, G0> f80066l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ShortTermRentItemDiscount f80067m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Boolean, G0> lVar, ShortTermRentItemDiscount shortTermRentItemDiscount) {
            super(0);
            this.f80066l = lVar;
            this.f80067m = shortTermRentItemDiscount;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f80066l.invoke(Boolean.valueOf(this.f80067m.f80026d));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsShortTermRentItemDiscountView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<Uri, G0> f80068l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ShortTermRentItemDiscount f80069m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Uri, G0> lVar, ShortTermRentItemDiscount shortTermRentItemDiscount) {
            super(0);
            this.f80068l = lVar;
            this.f80069m = shortTermRentItemDiscount;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f80068l.invoke(this.f80069m.f80030h);
            return G0.f406611a;
        }
    }

    public j(@k View view) {
        super(view);
        this.f80059b = view;
        this.f80060c = (TextView) view.findViewById(R.id.str_discount_item_title);
        this.f80061d = (TextView) view.findViewById(R.id.str_discount_item_description);
        this.f80062e = (TextView) view.findViewById(R.id.str_discount_item_total_price);
        this.f80063f = (TextView) view.findViewById(R.id.str_discount_item_price_with_discount);
        this.f80064g = (TextView) view.findViewById(R.id.str_discount_item_discount_percent);
        this.f80065h = (Switcher) view.findViewById(R.id.str_discount_item_switcher);
    }

    @Override // com.avito.android.advert.item.short_term_rent.item_discount.i
    public final void f10(@k ShortTermRentItemDiscount shortTermRentItemDiscount, @k l<? super Boolean, G0> lVar, @k l<? super Uri, G0> lVar2) throws Resources.NotFoundException {
        this.f80060c.setText(shortTermRentItemDiscount.f80024b);
        String str = shortTermRentItemDiscount.f80025c;
        TextView textView = this.f80061d;
        textView.setText(str);
        FV.a.f4720a.f(textView, R.attr.textIconQuestionOutline, y6.b(4));
        this.f80062e.setText(shortTermRentItemDiscount.f80027e);
        this.f80063f.setText(shortTermRentItemDiscount.f80028f);
        this.f80064g.setText(shortTermRentItemDiscount.f80029g);
        boolean z12 = shortTermRentItemDiscount.f80026d;
        Switcher switcher = this.f80065h;
        switcher.setChecked(z12);
        switcher.setOnClickListener(new com.avito.android.advert.item.parking.h(18, new a(lVar, shortTermRentItemDiscount)));
        if (shortTermRentItemDiscount.f80030h != null) {
            textView.setOnClickListener(new com.avito.android.advert.item.parking.h(19, new b(lVar2, shortTermRentItemDiscount)));
        }
    }

    @Override // com.avito.android.advert.item.short_term_rent.item_discount.i
    public final void hide() {
        D6.w(this.f80059b);
    }
}
