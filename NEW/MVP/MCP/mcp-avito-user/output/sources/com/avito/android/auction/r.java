package com.avito.android.auction;

import Rh.C15041a;
import android.view.View;
import com.avito.android.deep_linking.links.AuctionBody;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/r;", "Lcom/avito/android/auction/o;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AuctionBody f92604a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f92605b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AuctionFragment f92606c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C15041a f92607d = new C15041a(this, 9);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f92608e = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public r(@Y61.k AuctionBody auctionBody, @Y61.k com.avito.android.util.text.a aVar) {
        this.f92604a = auctionBody;
        this.f92605b = aVar;
    }

    @Override // com.avito.android.auction.o
    public final void a(@Y61.k w wVar) {
        AuctionBody auctionBody = this.f92604a;
        I5.a(wVar.f92616b, auctionBody.getTitle(), false);
        AttributedText subtitle = auctionBody.getSubtitle();
        if (subtitle != null) {
            subtitle.setOnDeepLinkClickListener(this.f92607d);
        }
        View view = wVar.f92615a;
        I5.a(wVar.f92617c, this.f92605b.c(view.getContext(), auctionBody.getSubtitle()), false);
        com.avito.android.lib.design.button.b.a(wVar.f92619e, auctionBody.getButtonText(), false);
        UniversalImage image = auctionBody.getImage();
        Image imageQ = image != null ? com.avito.android.actions_sheet.a.q(view, image) : null;
        SimpleDraweeView simpleDraweeView = wVar.f92618d;
        if (simpleDraweeView.getWidth() > 0) {
            wVar.a(imageQ);
        } else {
            simpleDraweeView.addOnLayoutChangeListener(new v(wVar, imageQ));
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = wVar.f92623i.t0(new p(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f92608e;
        cVar.b(dVarT0);
        cVar.b(wVar.f92621g.t0(new q(this)));
    }

    @Override // com.avito.android.auction.o
    public final void b(@Y61.k AuctionFragment auctionFragment) {
        this.f92606c = auctionFragment;
    }

    @Override // com.avito.android.auction.o
    public final void c0() {
        this.f92606c = null;
    }

    @Override // com.avito.android.auction.o
    public final void e0() {
        AttributedText subtitle = this.f92604a.getSubtitle();
        if (subtitle != null) {
            subtitle.setOnDeepLinkClickListener(null);
        }
        this.f92608e.e();
    }
}
