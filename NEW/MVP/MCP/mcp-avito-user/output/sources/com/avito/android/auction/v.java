package com.avito.android.auction;

import android.view.View;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: AuctionView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/v;", "Landroid/view/View$OnLayoutChangeListener;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f92613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Image f92614c;

    public v(w wVar, Image image) {
        this.f92613b = wVar;
        this.f92614c = image;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        w wVar = this.f92613b;
        if (wVar.f92618d.getWidth() > 0) {
            wVar.f92618d.removeOnLayoutChangeListener(this);
            wVar.a(this.f92614c);
        }
    }
}
