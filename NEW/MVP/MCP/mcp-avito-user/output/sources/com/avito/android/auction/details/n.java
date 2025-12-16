package com.avito.android.auction.details;

import android.view.View;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: AuctionDetailsSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/details/n;", "Landroid/view/View$OnLayoutChangeListener;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f92376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Image f92377c;

    public n(o oVar, Image image) {
        this.f92376b = oVar;
        this.f92377c = image;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        o oVar = this.f92376b;
        if (oVar.f92381d.getWidth() > 0) {
            oVar.f92381d.removeOnLayoutChangeListener(this);
            oVar.a(this.f92377c);
        }
    }
}
