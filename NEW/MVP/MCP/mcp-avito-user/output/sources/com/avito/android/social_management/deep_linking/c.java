package com.avito.android.social_management.deep_linking;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.SocialsListLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.social_management.InterfaceC35040g;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import l90.o;
import rv.C47918a;
import sv.C48421d;

/* compiled from: SocialsListAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social_management/deep_linking/c;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/SocialsListLink;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AbstractC40161a<SocialsListLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final o f284570f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f284571g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f284572h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC35040g f284573i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f284574j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SocialsListAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    @Inject
    public c(@k o oVar, @k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k InterfaceC35040g interfaceC35040g) {
        this.f284570f = oVar;
        this.f284571g = bVar;
        this.f284572h = interfaceC4053a;
        this.f284573i = interfaceC35040g;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f284572h.J(this.f284573i.a().putExtra("up_intent", this.f284570f.b()), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f284574j.b(this.f284571g.Q().N(new a()).t0(new g() { // from class: com.avito.android.social_management.deep_linking.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                c cVar = c.this;
                int i12 = AbstractC14250d.f9169b;
                cVar.j(((C47918a) obj).f437156b == -1 ? AbstractC14250d.c.f9171c : AbstractC14250d.b.f9170c);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f284574j.e();
    }
}
