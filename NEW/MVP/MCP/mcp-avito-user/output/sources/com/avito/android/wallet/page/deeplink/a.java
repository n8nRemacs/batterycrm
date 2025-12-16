package com.avito.android.wallet.page.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.TopUpFormLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: TopUpFormDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/TopUpFormLink;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40161a<TopUpFormLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f327767f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.page.c f327768g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f327769h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f327770i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: TopUpFormDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.page.deeplink.a$a, reason: collision with other inner class name */
    public static final class C10161a<T> implements r {
        public C10161a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    @Inject
    public a(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.wallet.page.c cVar, @Y61.k a.b bVar) {
        this.f327767f = interfaceC4053a;
        this.f327768g = cVar;
        this.f327769h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f327767f.J(this.f327768g.b(((TopUpFormLink) deepLink).f133742b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f327770i.b(this.f327769h.Q().N(new C10161a()).t0(new l41.g() { // from class: com.avito.android.wallet.page.deeplink.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                a aVar = a.this;
                if (((C47918a) obj).f437156b == -1) {
                    aVar.j(TopUpFormLink.b.a.f133743b);
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f327770i.e();
    }
}
