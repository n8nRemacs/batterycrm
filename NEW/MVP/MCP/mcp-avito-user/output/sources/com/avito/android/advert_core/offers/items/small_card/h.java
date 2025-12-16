package com.avito.android.advert_core.offers.items.small_card;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SmallCardOfferItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/items/small_card/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/offers/items/small_card/g;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f83842d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f83843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83844c;

    /* compiled from: SmallCardOfferItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/offers/items/small_card/h$a;", "", "<init>", "()V", "", "cardCornerRadius", "I", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public h(@k View view) {
        super(view);
        this.f83843b = (TextView) view.findViewById(R.id.small_card_offer_item_title);
        this.f83844c = R.drawable.small_offer_card_default_background;
    }

    @Override // com.avito.android.advert_core.offers.items.small_card.g
    public final void a(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(12, aVar));
    }

    @Override // com.avito.android.advert_core.offers.items.small_card.g
    public final void qW(@l String str) {
        G0 g02;
        int i12 = this.f83844c;
        if (str == null) {
            D6.D(this.itemView, i12);
            return;
        }
        Integer numH = com.avito.android.lib.util.f.h(str);
        if (numH != null) {
            int iIntValue = numH.intValue();
            View view = this.itemView;
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.itemView.getContext(), iIntValue, 0, 4, null);
            c5275a.f179264a = y6.b(12);
            view.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
            g02 = G0.f406611a;
        } else {
            Integer numI = com.avito.android.lib.util.f.i(str);
            if (numI != null) {
                int iIntValue2 = numI.intValue();
                View view2 = this.itemView;
                Context context = this.itemView.getContext();
                a.C5276a.C5277a c5277a = new a.C5276a.C5277a(this.itemView.getContext(), iIntValue2, 0, 4, null);
                c5277a.f179264a = y6.b(12);
                view2.setBackground(new com.avito.android.lib.design.gradient.a(context, c5277a.a()));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
        }
        if (g02 == null) {
            D6.D(this.itemView, i12);
        }
    }

    @Override // com.avito.android.advert_core.offers.items.small_card.g
    public final void setTitle(@k String str) {
        this.f83843b.setText(str);
    }
}
