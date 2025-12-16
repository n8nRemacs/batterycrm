package com.avito.android.authorization.deep_linking;

import Fc1.E0;
import Zd.InterfaceC19542a;
import android.os.Bundle;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.deep_linking.AuthResultLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.AuthResult;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;

/* compiled from: AuthResultAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/c;", "Lev/a;", "Lcom/avito/android/authorization/deep_linking/AuthResultLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.deep_linking.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28649c extends AbstractC40161a<AuthResultLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.g f93753f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f93754g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f93755h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f93756i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f93757j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93758k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93759l = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C28649c(@Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.i iVar, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k InterfaceC19542a interfaceC19542a, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f93753f = gVar;
        this.f93754g = aVar;
        this.f93755h = iVar;
        this.f93756i = interfaceC27663a;
        this.f93757j = interfaceC19542a;
        this.f93758k = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthResult authResult = ((AuthResultLink) deepLink).f93662b;
        if (authResult == null) {
            i(AuthResultLink.b.a.f93663b, this.f93754g, new AuthenticateLink(AuthSource.f92711k0, false, (DeepLink) null, 6, (C42822w) null));
            return;
        }
        io.reactivex.rxjava3.internal.operators.completable.K kN2 = InterfaceC27663a.C2131a.b(this.f93756i, authResult.getSession(), authResult.getProfile(), null, null, null, null, 120).n(new C28647a(this));
        E0 e02 = new E0(this, 12);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f93759l.b(kN2.m(gVar, gVar, interfaceC43543a, e02, interfaceC43543a, interfaceC43543a).v(new GL.a(6, this, authResult), new C28648b(this)));
    }
}
