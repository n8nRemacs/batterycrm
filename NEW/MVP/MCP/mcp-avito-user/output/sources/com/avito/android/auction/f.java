package com.avito.android.auction;

import android.content.Context;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29675a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AuctionAddDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/f;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AuctionAddLink;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC40161a<AuctionAddLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.g f92397f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final z f92398g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f92399h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f92400i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f92401j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f92402k;

    @Inject
    public f(@Y61.k Context context, @Y61.k a.g gVar, @Y61.k z zVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f92397f = gVar;
        this.f92398g = zVar;
        this.f92399h = aVar;
        this.f92400i = interfaceC35745a5;
        this.f92401j = context.getResources().getString(R.string.unknown_error);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        if (bundle != null) {
            AuctionAddLink.f133013b.getClass();
            AuctionAddLink.Arguments arguments = (AuctionAddLink.Arguments) bundle.getParcelable("publish_draft_id_key");
            if (arguments != null) {
                this.f92402k = A1.h(this.f92398g.a(arguments).j0(this.f92400i.e()).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C28620b(this)).I(new C28621c(this)), new d(this), new e(this), 2);
                return;
            }
        }
        j(new InterfaceC29675a.C4022a(this.f92401j));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f92402k;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
