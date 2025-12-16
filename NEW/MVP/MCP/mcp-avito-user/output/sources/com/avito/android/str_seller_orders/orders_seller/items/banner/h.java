package com.avito.android.str_seller_orders.orders_seller.items.banner;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sK0.C48065c;

/* compiled from: BannerView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_seller/items/banner/g;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f289396e;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f289397b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f289398c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f289399d;

    /* compiled from: BannerView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/banner/h$a;", "", "<init>", "()V", "", "DEF_COLOR_ATTR", "I", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f289396e = R.attr.blue50;
    }

    public h(@k View view) {
        super(view);
        this.f289397b = (TextView) view.findViewById(R.id.banner_title_tv);
        this.f289398c = (TextView) view.findViewById(R.id.banner_subtitle_tv);
        this.f289399d = (ImageView) view.findViewById(R.id.banner_image_view);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.banner.g
    public final void A4(@k PrintableText printableText) {
        TextView textView = this.f289397b;
        textView.setText(printableText.k0(textView.getContext()));
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.banner.g
    public final void Kp(@k UniversalImage universalImage) {
        Image imageQ = com.avito.android.actions_sheet.a.q(this.itemView, universalImage);
        if (imageQ == null) {
            return;
        }
        l.w(imageQ, new ImageRequest.a(new DM.a(this.f289399d)));
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.banner.g
    public final void X(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.itemView);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.banner.g
    public final void Xh(@k AttributedText attributedText) {
        j.a(this.f289398c, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.banner.g
    public final void v(@k UniversalColor universalColor) {
        View view = this.itemView;
        view.setBackgroundTintList(C48065c.a(view.getContext(), universalColor, f289396e));
    }
}
