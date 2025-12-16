package com.avito.android.trx_promo_goods.screens.configure.item.header;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsConfigureHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/header/g;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f303560b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f303561c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f303562d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f303563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f303564f;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f303560b = aVar;
        this.f303561c = (TextView) view.findViewById(R.id.trx_promo_goods_configure_header_title);
        TextView textView = (TextView) view.findViewById(R.id.trx_promo_goods_configure_header_description);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f303562d = textView;
        this.f303563e = (SimpleDraweeView) view.findViewById(R.id.trx_promo_goods_configure_header_image);
        this.f303564f = y6.b(16);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.header.g
    public final void g(@l AttributedText attributedText) {
        j.a(this.f303562d, attributedText, this.f303560b);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.header.g
    public final void i(@l UniversalImage universalImage) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.itemView, universalImage) : null;
        int i12 = this.f303564f;
        SimpleDraweeView simpleDraweeView = this.f303563e;
        if (imageG == null) {
            this.itemView.setPadding(i12, 0, i12, 0);
            D6.w(simpleDraweeView);
            return;
        }
        this.itemView.setPadding(i12, 0, 0, 0);
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageG));
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.header.g
    public final void setTitle(@k String str) {
        this.f303561c.setText(str);
    }
}
