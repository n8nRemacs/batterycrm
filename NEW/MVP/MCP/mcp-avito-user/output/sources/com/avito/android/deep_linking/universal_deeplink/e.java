package com.avito.android.deep_linking.universal_deeplink;

import Fc1.E0;
import Y61.k;
import android.content.res.Resources;
import android.os.Bundle;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.C29667e;
import com.avito.android.deep_linking.InterfaceC29669g;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.universal_deeplink.UniversalDeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.N;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: UniversalDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/e;", "Lev/a;", "Lcom/avito/android/deep_linking/universal_deeplink/UniversalDeepLink;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends AbstractC40161a<UniversalDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC29669g f134044f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f134045g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f134046h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C29667e f134047i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f134048j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.g f134049k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.i f134050l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f134051m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Resources f134052n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f134053o = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public e(@k InterfaceC29669g interfaceC29669g, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k C29667e c29667e, @k a.InterfaceC4053a interfaceC4053a, @k a.g gVar, @k a.i iVar, @k InterfaceC35845m2 interfaceC35845m2, @k Resources resources) {
        this.f134044f = interfaceC29669g;
        this.f134045g = interfaceC35745a5;
        this.f134046h = aVar;
        this.f134047i = c29667e;
        this.f134048j = interfaceC4053a;
        this.f134049k = gVar;
        this.f134050l = iVar;
        this.f134051m = interfaceC35845m2;
        this.f134052n = resources;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UniversalDeepLink universalDeepLink = (UniversalDeepLink) deepLink;
        I0 i0J0 = this.f134044f.a(universalDeepLink.f134035b.toString(), null).j0(this.f134045g.e());
        a aVar = new a(this);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f134053o.b(new N(i0J0.J(interfaceC43543a, aVar), new E0(this, 19)).v0(new b(this, universalDeepLink), new l41.g() { // from class: com.avito.android.deep_linking.universal_deeplink.c
            @Override // l41.g
            public final void accept(Object obj) {
                Throwable th2 = (Throwable) obj;
                e eVar = this.f134042b;
                a.i.C4057a.e(eVar.f134050l, z.l(th2), new f.c(th2), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                eVar.j(UniversalDeepLink.b.a.f134036b);
            }
        }, interfaceC43543a));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f134053o.e();
    }
}
