package com.avito.android.authorization.deep_linking;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.authorization.AuthScreenMode;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AuthenticateAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/f;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/AuthenticateLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.deep_linking.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28652f extends AbstractC40161a<AuthenticateLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f93770f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93771g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Zd.i f93772h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f93773i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f93774j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93775k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AuthenticateAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.authorization.deep_linking.f$a */
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C28652f.this);
        }
    }

    /* compiled from: AuthenticateAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.authorization.deep_linking.f$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            C28652f c28652f = C28652f.this;
            Intent intent = c47918a.f437157c;
            Parcelable parcelableExtra = intent == null ? null : intent.getParcelableExtra("SuccessAuthResultData");
            if (c47918a.f437156b != -1) {
                c28652f.j(AuthenticateLink.b.a.f133886b);
            } else if (parcelableExtra instanceof DeepLink) {
                c28652f.i(AuthenticateLink.b.c.f133888b, c28652f.f93773i, parcelableExtra);
            } else {
                c28652f.j(new AuthenticateLink.b.C4024b(parcelableExtra));
            }
        }
    }

    @Inject
    public C28652f(@Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k Zd.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.account.G g12) {
        this.f93770f = bVar;
        this.f93771g = interfaceC4053a;
        this.f93772h = iVar;
        this.f93773i = aVar;
        this.f93774j = g12;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthenticateLink authenticateLink = (AuthenticateLink) deepLink;
        if (this.f93774j.b()) {
            j(new AuthenticateLink.b.C4024b(null));
            return;
        }
        String str2 = authenticateLink.f133883b;
        if (str2 == null || str2.length() == 0) {
            AuthSource authSource = AuthSource.f92694c;
            str2 = "tst7";
        }
        Parcelable parcelable = bundle != null ? bundle.getParcelable("authenticate_result_data") : null;
        DeepLink deepLink2 = authenticateLink.f133885d;
        if (deepLink2 != null) {
            parcelable = deepLink2;
        }
        Intent intentI = this.f93772h.i(null, str2, parcelable, AuthScreenMode.f92662b);
        if (authenticateLink.f133884c) {
            intentI.setFlags(603979776);
        }
        this.f93771g.J(intentI, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f93775k.b(this.f93770f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f93775k.e();
    }
}
