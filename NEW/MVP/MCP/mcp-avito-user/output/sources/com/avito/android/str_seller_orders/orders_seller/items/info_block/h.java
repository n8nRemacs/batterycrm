package com.avito.android.str_seller_orders.orders_seller.items.info_block;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/info_block/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_seller/items/info_block/g;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f289492b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f289493c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f289494d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f289495e;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f289492b = aVar;
        this.f289493c = (ImageView) view.findViewById(R.id.icon_iv);
        this.f289494d = (TextView) view.findViewById(R.id.group_title_tv);
        this.f289495e = (TextView) view.findViewById(R.id.group_subtitle_tv);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.info_block.g
    public final void R(@l AttributedText attributedText) {
        j.a(this.f289495e, attributedText, this.f289492b);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.info_block.g
    public final void X(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.itemView);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.info_block.g
    public final void Z(@l String str) {
        Integer numA;
        int iIntValue = (str == null || (numA = q.a(str)) == null) ? R.attr.ic_check20 : numA.intValue();
        ImageView imageView = this.f289493c;
        imageView.setImageDrawable(C35835l0.h(iIntValue, imageView.getContext()));
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.info_block.g
    public final void w(@l AttributedText attributedText) {
        j.a(this.f289494d, attributedText, this.f289492b);
    }
}
