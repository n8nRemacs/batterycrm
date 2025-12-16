package com.avito.android.authorization.deep_linking;

import Ju.AbstractC14250d;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.LoginLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: LoginAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/I;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/LoginLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class I extends AbstractC40161a<LoginLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final l90.o f93687f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Zd.i f93688g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93689h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.b f93690i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f93691j;

    /* compiled from: LoginAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(I.this);
        }
    }

    /* compiled from: LoginAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            I.this.j(AbstractC14250d.c.f9171c);
        }
    }

    @Inject
    public I(@Y61.k l90.o oVar, @Y61.k Zd.i iVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f93687f = oVar;
        this.f93688g = iVar;
        this.f93689h = interfaceC4053a;
        this.f93690i = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        LoginLink loginLink = (LoginLink) deepLink;
        this.f93689h.J(this.f93688g.j(this.f93687f.b(), (248 & 2) != 0 ? null : loginLink.f133917b, (248 & 4) != 0 ? null : loginLink.f133918c, (248 & 8) == 0, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? false : false, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f93691j = (io.reactivex.rxjava3.internal.observers.y) this.f93690i.Q().N(new a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f93691j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
