package com.avito.android.str_seller_orders.orders_seller.items.booking_info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/booking_info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_seller/items/booking_info/g;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f289418b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f289419c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f289420d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f289421e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f289422f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f289423g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f289424h;

    public h(@k View view) {
        super(view);
        this.f289418b = view;
        this.f289419c = (TextView) view.findViewById(R.id.order_title_tv);
        this.f289420d = (TextView) view.findViewById(R.id.order_subtitle_tv);
        this.f289421e = (TextView) view.findViewById(R.id.estate_info_tv);
        this.f289422f = (TextView) view.findViewById(R.id.address_tv);
        this.f289423g = (ImageView) view.findViewById(R.id.estate_pic_iv);
        this.f289424h = (ImageView) view.findViewById(R.id.buyer_pic_iv);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.booking_info.g
    public final void Nc(@l AttributedText attributedText) {
        j.a(this.f289421e, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.booking_info.g
    public final void R(@l AttributedText attributedText) {
        j.a(this.f289420d, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.booking_info.g
    public final void X(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f289418b);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.booking_info.g
    public final void e(@k AttributedText attributedText) {
        j.a(this.f289419c, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.booking_info.g
    public final void q(@l AttributedText attributedText) {
        j.a(this.f289422f, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.booking_info.g
    public final void rI(@l Image image) {
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(this.f289423g));
        aVar.d(com.avito.android.image_loader.b.b(image));
        aVar.f169486d = true;
        aVar.e(kotlin.math.b.b(this.f289418b.getResources().getDimension(R.dimen.order_image_radius)));
        aVar.c();
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.booking_info.g
    public final void zu(@l Image image) {
        int i12 = image != null ? 0 : 8;
        ImageView imageView = this.f289424h;
        imageView.setVisibility(i12);
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.d(com.avito.android.image_loader.b.b(image));
        aVar.f169486d = true;
        aVar.e(kotlin.math.b.b(this.f289418b.getResources().getDimension(R.dimen.buyer_avatar_image_radius)));
        aVar.c();
    }
}
