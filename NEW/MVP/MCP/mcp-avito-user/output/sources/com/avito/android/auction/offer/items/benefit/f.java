package com.avito.android.auction.offer.items.benefit;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionBenefitView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/offer/items/benefit/f;", "Lcom/avito/android/auction/offer/items/benefit/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f92541b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f92542c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f92543d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f92544e;

    public f(@k View view) {
        super(view);
        this.f92541b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92542c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92543d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f92544e = (SimpleDraweeView) viewFindViewById3;
    }

    @Override // com.avito.android.auction.offer.items.benefit.e
    public final void M(@l UniversalImage universalImage) {
        Image imageQ = universalImage != null ? com.avito.android.actions_sheet.a.q(this.f92541b, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f92544e;
        Uri uriD = C35829k2.c(imageQ, simpleDraweeView, 1, 22).d();
        C35949t5.a(simpleDraweeView).b();
        if (uriD == null) {
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    @Override // com.avito.android.auction.offer.items.benefit.e
    public final void b(@l String str) {
        I5.a(this.f92542c, str, false);
    }

    @Override // com.avito.android.auction.offer.items.benefit.e
    public final void n(@l String str) {
        I5.a(this.f92543d, str, false);
    }
}
