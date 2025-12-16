package com.avito.android.sx_address.list.view.recycler.promo_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.list.domain.PromotionData;
import com.avito.android.sx_address.list.domain.PromotionImageData;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/list/view/recycler/promo_banner/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/sx_address/list/view/recycler/promo_banner/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f293540b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f293541c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f293542d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f293543e;

    public d(@k View view) {
        super(view);
        this.f293540b = view;
        View viewFindViewById = view.findViewById(R.id.banner_constraint);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = constraintLayout.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293541c = (TextView) viewFindViewById2;
        View viewFindViewById3 = constraintLayout.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293542d = (TextView) viewFindViewById3;
        View viewFindViewById4 = constraintLayout.findViewById(R.id.picture);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f293543e = (SimpleDraweeView) viewFindViewById4;
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        PromotionData promotionData = (PromotionData) aVar;
        j.a(this.f293541c, new AttributedText(promotionData.f293162d, C42784z0.f406748b, 1), null);
        j.a(this.f293542d, promotionData.f293160b, null);
        boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(this.f293540b.getContext());
        PromotionImageData promotionImageData = promotionData.f293161c;
        C35949t5.c(this.f293543e, com.avito.android.image_loader.b.b(zB2 ? promotionImageData.f293165c : promotionImageData.f293164b), null, null, null, 14);
    }
}
