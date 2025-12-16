package com.avito.android.wallet.page.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.wallet.page.deeplink.WalletLink;
import ev.AbstractC40161a;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: WalletLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/c;", "Lcom/avito/android/wallet/page/deeplink/WalletLink;", "D", "Lev/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class c<D extends WalletLink> extends AbstractC40161a<D> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f327776f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.page.c f327777g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f327778h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f327779i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: WalletLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink;", "D", "Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<D> f327780b;

        public a(c<D> cVar) {
            this.f327780b = cVar;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(this.f327780b);
        }
    }

    /* compiled from: WalletLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink;", "D", "Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<D> f327781b;

        public b(c<D> cVar) {
            this.f327781b = cVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            c<D> cVar = this.f327781b;
            if (i12 == -1) {
                cVar.j(WalletLink.a.b.f327766b);
            } else {
                Intent intent = c47918a.f437157c;
                cVar.j(new WalletLink.a.C10160a(intent != null ? intent.getStringExtra("payment_error_result") : null));
            }
        }
    }

    public c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.wallet.page.c cVar, @Y61.k a.b bVar) {
        this.f327776f = interfaceC4053a;
        this.f327777g = cVar;
        this.f327778h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        WalletLink walletLink = (WalletLink) deepLink;
        this.f327776f.J(this.f327777g.c(walletLink.getF327763b(), walletLink.getF327764c(), walletLink instanceof WalletLink.WalletServiceBalanceLink), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f327779i.b(this.f327778h.Q().N(new a(this)).t0(new b(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f327779i.e();
    }
}
