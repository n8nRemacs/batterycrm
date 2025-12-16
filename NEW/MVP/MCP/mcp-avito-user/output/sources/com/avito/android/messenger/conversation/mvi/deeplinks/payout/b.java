package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import Ju.AbstractC14250d;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.R;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PayoutLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AbstractPayoutDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/b;", "Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "Lev/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class b<Deeplink extends PayoutLink> extends AbstractC40161a<Deeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f190534f = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Deeplink> f190535g = new com.jakewharton.rxrelay3.c<>();

    /* compiled from: AbstractPayoutDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "Lcom/avito/android/lib/deprecated_design/dialog/a;", "dialogRouter", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/deprecated_design/dialog/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.lib.deprecated_design.dialog.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b<Deeplink> f190536l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<Deeplink> bVar) {
            super(1);
            this.f190536l = bVar;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [T, androidx.appcompat.app.l] */
        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.deprecated_design.dialog.a aVar) throws Resources.NotFoundException {
            l0.h hVar = new l0.h();
            b<Deeplink> bVar = this.f190536l;
            hVar.f406842b = aVar.e(new com.avito.android.messenger.conversation.mvi.deeplinks.payout.a(hVar), bVar.getF190624o().getString(R.string.unknown_error), bVar.getF190624o().getString(R.string.ok));
            return G0.f406611a;
        }
    }

    /* compiled from: AbstractPayoutDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "kotlin.jvm.PlatformType", Constants.DEEPLINK, "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/util/P2;", "Landroid/net/Uri;", "apply", "(Lcom/avito/android/deep_linking/links/PayoutLink;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.deeplinks.payout.b$b, reason: collision with other inner class name */
    public static final class C5637b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<Deeplink> f190537b;

        public C5637b(b<Deeplink> bVar) {
            this.f190537b = bVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            PayoutLink payoutLink = (PayoutLink) obj;
            b<Deeplink> bVar = this.f190537b;
            return bVar.q().a(payoutLink.getF133693b(), payoutLink.getF133694c()).m0(new com.avito.android.messenger.conversation.mvi.deeplinks.payout.c(bVar)).j0(bVar.getF190618i().e()).K(new com.avito.android.messenger.conversation.mvi.deeplinks.payout.d(bVar));
        }
    }

    /* compiled from: AbstractPayoutDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "Lrv/a;", "activityResult", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<Deeplink> f190538b;

        public c(b<Deeplink> bVar) {
            this.f190538b = bVar;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(this.f190538b);
        }
    }

    /* compiled from: AbstractPayoutDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "Lrv/a;", "activityResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<Deeplink> f190539b;

        public d(b<Deeplink> bVar) {
            this.f190539b = bVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            b<Deeplink> bVar = this.f190539b;
            if (c47918a.f437156b != -1) {
                bVar.j(AbstractC14250d.b.f9170c);
                return;
            }
            Intent intent = c47918a.f437157c;
            DeepLink deepLink = intent != null ? (DeepLink) intent.getParcelableExtra("web_payment_final_deeplink_extra") : null;
            bVar.j(AbstractC14250d.c.f9171c);
            if ((deepLink instanceof ChannelDetailsLink) || deepLink == null) {
                return;
            }
            b.a.a(bVar.getF190626q(), deepLink, null, null, 6);
        }
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f190535g.accept((PayoutLink) deepLink);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        io.reactivex.rxjava3.disposables.d dVarS0 = this.f190535g.y0(new C5637b(this)).s0();
        io.reactivex.rxjava3.disposables.c cVar = this.f190534f;
        cVar.b(dVarS0);
        cVar.b(getF190625p().Q().N(new c(this)).t0(new d(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f190534f.e();
    }

    @Y61.k
    /* renamed from: k */
    public abstract a.InterfaceC4053a getF190620k();

    @Y61.k
    /* renamed from: l */
    public abstract a.b getF190625p();

    @Y61.k
    /* renamed from: m */
    public abstract com.avito.android.deeplink_handler.handler.composite.a getF190626q();

    @Y61.k
    /* renamed from: n */
    public abstract a.d getF190621l();

    @Y61.k
    /* renamed from: o */
    public abstract a.g getF190623n();

    @Y61.k
    /* renamed from: p */
    public abstract InterfaceC36134w1 getF190622m();

    @Y61.k
    public abstract k q();

    @Y61.k
    /* renamed from: r */
    public abstract Resources getF190624o();

    @Y61.k
    /* renamed from: s */
    public abstract InterfaceC35745a5 getF190618i();

    @Y61.k
    /* renamed from: t */
    public abstract com.avito.android.remote.error.f getF190619j();

    public void u(@Y61.k ApiError apiError) {
        getF190621l().k1(new a(this));
    }
}
