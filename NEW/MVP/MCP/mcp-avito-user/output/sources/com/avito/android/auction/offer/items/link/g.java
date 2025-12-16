package com.avito.android.auction.offer.items.link;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuctionLinkView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/offer/items/link/g;", "Lcom/avito/android/auction/offer/items/link/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f92553b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f92554c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f92555d;

    public g(@k View view) {
        super(view);
        this.f92553b = view;
        this.f92554c = (TextView) view;
    }

    @Override // com.avito.android.auction.offer.items.link.f
    public final void I30(@l CharSequence charSequence, @k Y41.a<G0> aVar) {
        TextView textView = this.f92554c;
        I5.a(textView, charSequence, false);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f92555d = aVar;
    }

    @Override // com.avito.android.auction.offer.items.link.f
    @k
    public final Context getContext() {
        return this.f92553b.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f92555d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
