package com.avito.android.authorization.deep_linking;

import Fc1.E0;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.TypedResult;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AutoRecoveryAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/A;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A extends AbstractC40161a<AutoRecoveryLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Zd.i f93652f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93653g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f93654h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.auto_recovery.a f93655i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.g f93656j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f93657k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f93658l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93659m = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AutoRecoveryAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(A.this);
        }
    }

    /* compiled from: AutoRecoveryAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            A.this.j(new AutoRecoveryLink.Result.Success(AutoRecoveryLink.Result.Success.ResultAction.f133895d));
        }
    }

    @Inject
    public A(@Y61.k Zd.i iVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k com.avito.android.authorization.auto_recovery.a aVar, @Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f93652f = iVar;
        this.f93653g = interfaceC4053a;
        this.f93654h = bVar;
        this.f93655i = aVar;
        this.f93656j = gVar;
        this.f93657k = aVar2;
        this.f93658l = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutoRecoveryLink autoRecoveryLink = (AutoRecoveryLink) deepLink;
        AutoRecoveryLink.Scenario scenario = autoRecoveryLink.f133890c;
        if (autoRecoveryLink.f133891d) {
            this.f93658l.c(new he.r(autoRecoveryLink.f133889b, scenario));
        }
        this.f93659m.b(new C42016n(this.f93655i.a(scenario).j(new B(this)), new E0(this, 13)).x(new l41.g() { // from class: com.avito.android.authorization.deep_linking.C
            @Override // l41.g
            public final void accept(Object obj) {
                A a12 = this.f93667b;
                com.avito.android.error.z.o((TypedResult) obj, new C28670y(a12), new C28671z(a12), null, 60);
            }
        }, new l41.g() { // from class: com.avito.android.authorization.deep_linking.D
            @Override // l41.g
            public final void accept(Object obj) {
                com.avito.android.error.z.h((Throwable) obj, new C28669x(this.f93668b), null, null, 62);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f93659m.b(this.f93654h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f93659m.e();
    }
}
