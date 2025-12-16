package com.avito.android.short_term_rent.bookingform.items.info_banner;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: InfoBannerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/info_banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/info_banner/h;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f281537b;

    /* renamed from: c, reason: collision with root package name */
    public final SimpleDraweeView f281538c;

    public i(@k View view) {
        super(view);
        this.f281537b = (TextView) view.findViewById(R.id.info_banner_item_text);
        this.f281538c = (SimpleDraweeView) view.findViewById(R.id.info_banner_item_icon);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.info_banner.h
    public final void i(@l UniversalImage universalImage) {
        SimpleDraweeView simpleDraweeView = this.f281538c;
        if (universalImage == null) {
            D6.w(simpleDraweeView);
            return;
        }
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnTheme));
        aVarA.c();
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.info_banner.h
    public final void r(@k AttributedText attributedText) {
        j.a(this.f281537b, attributedText, null);
    }
}
