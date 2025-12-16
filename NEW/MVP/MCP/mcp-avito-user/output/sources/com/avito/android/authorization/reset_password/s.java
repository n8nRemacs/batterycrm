package com.avito.android.authorization.reset_password;

import Sm0.InterfaceC15202a;
import android.content.res.Resources;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/s;", "Lcom/avito/android/authorization/reset_password/k;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f94192a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94193b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f94194c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f94195d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f94196e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Resources f94197f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f94198g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public B f94199h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public ResetPasswordActivity f94200i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94201j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94202k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public String f94203l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public Map<String, String> f94204m;

    /* compiled from: ResetPasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            s sVar = s.this;
            B b12 = sVar.f94199h;
            if (b12 != null) {
                b12.b("");
            }
            b.a.a(sVar.f94198g, deepLink, null, null, 6);
        }
    }

    /* compiled from: ResetPasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f94206b = new b<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Inject
    public s(@Y61.k c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Resources resources, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l Kundle kundle) {
        Map<String, String> mapC;
        this.f94192a = cVar;
        this.f94193b = interfaceC35745a5;
        this.f94194c = interfaceC30274a;
        this.f94195d = interfaceC15202a;
        this.f94196e = screenPerformanceTracker;
        this.f94197f = resources;
        this.f94198g = aVar;
        String strG = kundle != null ? kundle.g("login") : null;
        this.f94203l = strG == null ? "" : strG;
        this.f94204m = (kundle == null || (mapC = kundle.c("messages")) == null) ? P0.c() : mapC;
    }

    @Override // com.avito.android.authorization.reset_password.k
    public final void a(@Y61.k B b12) {
        B b13;
        this.f94199h = b12;
        b12.b(this.f94203l);
        Map<String, String> map = this.f94204m;
        this.f94204m = map;
        if (!map.isEmpty() && (b13 = this.f94199h) != null) {
            b13.c((String) C42745f0.D(map.values()));
        }
        com.jakewharton.rxrelay3.c<G0> cVar = b12.f94098a;
        io.reactivex.rxjava3.disposables.d dVarT0 = com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).t0(new m(this));
        io.reactivex.rxjava3.disposables.c cVar2 = this.f94202k;
        cVar2.b(dVarT0);
        io.reactivex.rxjava3.core.z<G0> zVarA = C37722i.a(b12.f94102e);
        Input input = b12.f94100c;
        cVar2.b(io.reactivex.rxjava3.core.z.g0(zVarA, com.avito.android.lib.design.input.n.d(input)).t0(new n(this)));
        cVar2.b(com.avito.android.lib.design.input.n.e(input).t0(new o(this)));
        cVar2.b(this.f94198g.d9().N(t.f94207b).t0(new u(b12, this)));
    }

    @Override // com.avito.android.authorization.reset_password.k
    public final void b(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        this.f94203l = str;
    }

    @Override // com.avito.android.authorization.reset_password.k
    public final void c(@Y61.k ResetPasswordActivity resetPasswordActivity) {
        this.f94200i = resetPasswordActivity;
    }

    @Override // com.avito.android.authorization.reset_password.k
    public final void c0() {
        this.f94201j.e();
        this.f94200i = null;
    }

    public final void d(UserDialog userDialog) {
        this.f94202k.b(this.f94194c.f(userDialog).n(new a(), b.f94206b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.authorization.reset_password.k
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("login", this.f94203l);
        kundle.n("messages", this.f94204m);
        return kundle;
    }

    @Override // com.avito.android.authorization.reset_password.k
    public final void e0() {
        this.f94202k.e();
        this.f94199h = null;
    }
}
