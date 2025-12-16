package com.avito.android.help_center.help_center_articles;

import android.content.Intent;
import android.net.Uri;
import android.webkit.CookieManager;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.help_center.E;
import com.avito.android.help_center.H;
import com.avito.android.help_center.InterfaceC30756m;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;

/* compiled from: HelpCenterArticlesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/help_center_articles/k;", "Lcom/avito/android/help_center/help_center_articles/e;", "Lcom/avito/android/help_center/E$a;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements e, E.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f161731a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CookieManager f161732b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f161733c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30756m f161734d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f161735e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final E f161736f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f161737g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public q f161738h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public HelpCenterArticlesActivity f161739i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f161740j;

    @Inject
    public k(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k CookieManager cookieManager, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k InterfaceC30756m interfaceC30756m, @Y61.k H h12, @Y61.k E e12, @com.avito.android.help_center.help_center_articles.di.b @Y61.k String str, @com.avito.android.help_center.help_center_articles.di.i @Y61.l String str2, @com.avito.android.help_center.help_center_articles.di.a @Y61.l String str3, @Y61.l @com.avito.android.help_center.help_center_articles.di.c String str4) {
        Uri.Builder builderBuildUpon;
        this.f161731a = interfaceC35745a5;
        this.f161732b = cookieManager;
        this.f161733c = eVar;
        this.f161734d = interfaceC30756m;
        this.f161735e = h12;
        this.f161736f = e12;
        String strConcat = "articles/".concat(str);
        Uri url = h12.getUrl();
        Uri.Builder builderPath = (url == null || (builderBuildUpon = url.buildUpon()) == null) ? null : builderBuildUpon.path(strConcat);
        if ((str2 != null && !C43066x.K(str2)) || ((str3 != null && !C43066x.K(str3)) || (str4 != null && !C43066x.K(str4)))) {
            if (builderPath != null) {
                builderPath.appendQueryParameter("appId", "3");
            }
            if (str2 != null && !C43066x.K(str2) && builderPath != null) {
                builderPath.appendQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_THEME, str2);
            }
            if (str3 != null && !C43066x.K(str3) && builderPath != null) {
                builderPath.appendQueryParameter("problemInfo[itemId]", str3);
            }
            if (str4 != null && !C43066x.K(str4) && builderPath != null) {
                builderPath.appendQueryParameter("eventData[contextId]", str4);
            }
        }
        this.f161740j = Uri.decode(String.valueOf(builderPath != null ? builderPath.build() : null));
    }

    @Override // com.avito.android.help_center.help_center_articles.e
    public final boolean a() {
        q qVar = this.f161738h;
        if (qVar != null) {
            return qVar.f161755c.c();
        }
        return false;
    }

    @Override // com.avito.android.help_center.help_center_articles.e
    public final void b(@Y61.k q qVar) {
        this.f161738h = qVar;
        E e12 = this.f161736f;
        e12.a(this);
        com.avito.android.ui.view.d dVar = qVar.f161755c;
        InterfaceC30756m interfaceC30756m = this.f161734d;
        dVar.b(interfaceC30756m, "android");
        dVar.a(e12);
        e();
        dVar.d(this.f161740j);
        com.jakewharton.rxrelay3.c f161840a = interfaceC30756m.getF161840a();
        InterfaceC35745a5 interfaceC35745a5 = this.f161731a;
        y yVarG = C35896f0.g(f161840a.j0(interfaceC35745a5.e()), new f(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f161737g;
        cVar.b(yVarG);
        I0 i0J0 = ((z) qVar.f161754b.getValue()).j0(interfaceC35745a5.e());
        g gVar = new g(qVar);
        l41.g<? super Throwable> gVar2 = h.f161728b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(i0J0.v0(gVar, gVar2, interfaceC43543a));
        cVar.b(qVar.f161753a.j0(interfaceC35745a5.e()).v0(new i(this), j.f161730b, interfaceC43543a));
    }

    @Override // com.avito.android.help_center.help_center_articles.e
    public final void c(@Y61.k HelpCenterArticlesActivity helpCenterArticlesActivity) {
        this.f161739i = helpCenterArticlesActivity;
    }

    @Override // com.avito.android.help_center.help_center_articles.e
    public final void c0() {
        this.f161739i = null;
    }

    @Override // com.avito.android.help_center.E.a
    public final void d(@Y61.k Uri uri) {
        HelpCenterArticlesActivity helpCenterArticlesActivity = this.f161739i;
        if (helpCenterArticlesActivity != null) {
            InterfaceC35845m2 interfaceC35845m2 = helpCenterArticlesActivity.f161678n;
            if (interfaceC35845m2 == null) {
                interfaceC35845m2 = null;
            }
            Intent intentT = interfaceC35845m2.t(uri);
            C35974x2.d(intentT);
            try {
                helpCenterArticlesActivity.startActivity(intentT);
            } catch (Exception unused) {
                L5.a(helpCenterArticlesActivity, R.string.no_application_installed_to_perform_this_action, 0);
            }
        }
    }

    public final void e() {
        CookieManager cookieManager = this.f161732b;
        cookieManager.setAcceptCookie(true);
        for (com.avito.android.cookie_provider.a aVar : this.f161733c.getCookies()) {
            cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
        }
    }

    @Override // com.avito.android.help_center.help_center_articles.e
    public final void e0() {
        q qVar = this.f161738h;
        if (qVar != null) {
            qVar.f161755c.e("android");
        }
        q qVar2 = this.f161738h;
        if (qVar2 != null) {
            qVar2.f161755c.f304687a.f392926d.remove(this.f161736f);
        }
        this.f161738h = null;
        this.f161737g.e();
    }
}
