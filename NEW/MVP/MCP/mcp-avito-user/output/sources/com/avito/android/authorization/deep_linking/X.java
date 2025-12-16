package com.avito.android.authorization.deep_linking;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deep_linking.links.auth.PhoneUnavailableReasonLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PhoneUnavailableReasonAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/X;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class X extends AbstractC40161a<PhoneUnavailableReasonLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Zd.i f93729f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93730g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f93731h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f93732i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93733j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PhoneUnavailableReasonAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(X.this);
        }
    }

    @Inject
    public X(@Y61.k Zd.i iVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f93729f = iVar;
        this.f93730g = interfaceC4053a;
        this.f93731h = bVar;
        this.f93732i = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutoRecoveryLink.Source source = ((PhoneUnavailableReasonLink) deepLink).f133948b;
        this.f93732i.c(new he.r(source.f133910b, AutoRecoveryLink.Scenario.f133900d));
        this.f93730g.J(this.f93729f.d(source), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f93733j.b(this.f93731h.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.authorization.deep_linking.X.b
            @Override // l41.g
            public final void accept(Object obj) {
                X.this.j(((C47918a) obj).f437156b == -1 ? PhoneUnavailableReasonLink.b.C4028b.f133950b : PhoneUnavailableReasonLink.b.a.f133949b);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f93733j.e();
    }
}
