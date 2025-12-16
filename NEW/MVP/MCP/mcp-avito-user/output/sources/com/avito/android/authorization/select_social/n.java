package com.avito.android.authorization.select_social;

import Fc1.E0;
import Sm0.InterfaceC15202a;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.SocialCredentials;
import com.avito.android.authorization.select_social.adapter.SelectSocialField;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TfaSource;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.L5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: SelectSocialPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_social/n;", "Lcom/avito/android/authorization/select_social/g;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.select_social.c f94544a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f94545b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94546c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f94547d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<SelectSocialField> f94548e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f94549f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f94550g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94551h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f94552i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public s f94553j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public SelectSocialActivity f94554k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94555l = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94556m = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public SocialCredentials f94557n;

    /* compiled from: SelectSocialPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            s sVar = n.this.f94553j;
            if (sVar != null) {
                sVar.c();
            }
        }
    }

    /* compiled from: SelectSocialPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/SocialAuthResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SocialCredentials f94560c;

        public b(SocialCredentials socialCredentials) {
            this.f94560c = socialCredentials;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            s sVar;
            SocialAuthResult socialAuthResult = (SocialAuthResult) obj;
            boolean z12 = socialAuthResult instanceof SocialAuthResult.Ok;
            n nVar = n.this;
            if (z12) {
                String message = ((SocialAuthResult.Ok) socialAuthResult).getAuthResult().getMessage();
                if (message != null && (sVar = nVar.f94553j) != null) {
                    L5.b(sVar.f94573a.getContext(), message, 1);
                }
                SelectSocialActivity selectSocialActivity = nVar.f94554k;
                if (selectSocialActivity != null) {
                    selectSocialActivity.a2();
                    return;
                }
                return;
            }
            if (socialAuthResult instanceof SocialAuthResult.FollowDeeplink) {
                b.a.a(nVar.f94550g, ((SocialAuthResult.FollowDeeplink) socialAuthResult).getDeeplink(), null, null, 6);
                return;
            }
            if (!(socialAuthResult instanceof SocialAuthResult.TfaCheckWithPush)) {
                s sVar2 = nVar.f94553j;
                if (sVar2 != null) {
                    sVar2.b(com.avito.android.printable_text.b.f(nVar.f94549f.getF15141a().getString(R.string.social_error_authentication)));
                    return;
                }
                return;
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar = nVar.f94550g;
            SocialAuthResult.TfaCheckWithPush tfaCheckWithPush = (SocialAuthResult.TfaCheckWithPush) socialAuthResult;
            TfaFlow flow = tfaCheckWithPush.getFlow();
            TfaSource src = tfaCheckWithPush.getSrc();
            String str = this.f94560c.f92742b;
            b.a.a(aVar, new CodeCheckLink(new CodeCheckLink.Flow.TfaCheck(flow, src, new CodeCheckLink.Flow.TfaCheck.LoginInfo.BySocial(str, str)), new CodeCheckLink.Arguments(tfaCheckWithPush.getPhone(), null, 5, tfaCheckWithPush.getPhoneList(), 2, null)), "tfa_code_check", null, 4);
        }
    }

    /* compiled from: SelectSocialPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            boolean z12 = th2 instanceof ApiException;
            n nVar = n.this;
            if (z12) {
                com.avito.android.remote.error.q qVar = ((ApiException) th2).f318522b;
                if (qVar instanceof com.avito.android.remote.error.s) {
                    com.avito.android.remote.error.s sVar = (com.avito.android.remote.error.s) qVar;
                    s sVar2 = nVar.f94553j;
                    if (sVar2 != null) {
                        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, sVar2.f94573a.getContext(), new u(sVar.getUserDialog().getTitle(), sVar.getUserDialog().getMessage(), sVar2)));
                        return;
                    }
                    return;
                }
            }
            s sVar3 = nVar.f94553j;
            if (sVar3 != null) {
                sVar3.b(InterfaceC35741a1.a.a(nVar.f94547d, th2, null, new o(nVar), 2));
            }
        }
    }

    @Inject
    public n(@Y61.k com.avito.android.authorization.select_social.c cVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.jakewharton.rxrelay3.c<SelectSocialField> cVar2, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l String str, @Y61.l Kundle kundle) {
        this.f94544a = cVar;
        this.f94545b = aVar;
        this.f94546c = interfaceC35745a5;
        this.f94547d = interfaceC35741a1;
        this.f94548e = cVar2;
        this.f94549f = interfaceC15202a;
        this.f94550g = aVar2;
        this.f94551h = interfaceC28373a;
        this.f94552i = str;
        this.f94557n = kundle != null ? (SocialCredentials) kundle.d("credentials") : null;
    }

    @Override // com.avito.android.authorization.select_social.g
    public final void a() {
        s sVar = this.f94553j;
        if (sVar != null) {
            sVar.a();
        }
    }

    @Override // com.avito.android.authorization.select_social.g
    public final void b(@Y61.k SelectSocialActivity selectSocialActivity) {
        this.f94554k = selectSocialActivity;
        f();
    }

    @Override // com.avito.android.authorization.select_social.g
    public final void c() {
        s sVar = this.f94553j;
        if (sVar != null) {
            sVar.a();
        }
        s sVar2 = this.f94553j;
        if (sVar2 != null) {
            sVar2.b(com.avito.android.printable_text.b.f(this.f94549f.getF15141a().getString(R.string.social_error_authentication)));
        }
    }

    @Override // com.avito.android.authorization.select_social.g
    public final void c0() {
        this.f94555l.e();
        this.f94554k = null;
    }

    @Override // com.avito.android.authorization.select_social.g
    public final void d(@Y61.k s sVar) {
        this.f94553j = sVar;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f94548e.t0(new h(this, sVar));
        io.reactivex.rxjava3.disposables.c cVar = this.f94556m;
        cVar.b(dVarT0);
        com.jakewharton.rxrelay3.c<G0> cVar2 = sVar.f94575c;
        cVar.b(com.avito.android.advert.item.delivery_suggests.l.l(cVar2, cVar2).t0(new i(this)));
        cVar.b(this.f94544a.a().v0(new j(this, sVar), new k(this, sVar), io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar.b(this.f94550g.d9().N(l.f94542b).t0(new m(this)));
    }

    @Override // com.avito.android.authorization.select_social.g
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f94557n, "credentials");
        return kundle;
    }

    @Override // com.avito.android.authorization.select_social.g
    public final void e(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        if (str == null || str2 == null) {
            c();
        } else {
            this.f94557n = new SocialCredentials(str, str2, str3, str4, null, null, null, null, 240, null);
            f();
        }
    }

    @Override // com.avito.android.authorization.select_social.g
    public final void e0() {
        this.f94556m.e();
        this.f94553j = null;
    }

    public final void f() {
        SocialCredentials socialCredentials = this.f94557n;
        if (socialCredentials == null) {
            return;
        }
        String str = socialCredentials.f92742b;
        boolean zF2 = L.f(str, "apple");
        String str2 = this.f94552i;
        com.avito.android.authorization.select_social.c cVar = this.f94544a;
        String str3 = socialCredentials.f92743c;
        I0 i0J0 = (zF2 ? cVar.c(str3, socialCredentials.f92745e, str2) : cVar.b(str, str3, socialCredentials.f92744d, str2)).j0(this.f94546c.e());
        a aVar = new a();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f94555l.b(i0J0.J(interfaceC43543a, aVar).L(new E0(this, 17)).v0(new b(socialCredentials), new c(), interfaceC43543a));
    }
}
