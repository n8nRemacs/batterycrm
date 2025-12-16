package com.avito.android.help_center.help_center_request;

import android.net.Uri;
import android.webkit.CookieManager;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.help_center.E;
import com.avito.android.help_center.H;
import com.avito.android.help_center.InterfaceC30756m;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HelpCenterRequestPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/help_center_request/l;", "Lcom/avito/android/help_center/help_center_request/h;", "Lcom/avito/android/help_center/E$a;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements h, E.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f161811a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CookieManager f161812b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f161813c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30756m f161814d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f161815e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final E f161816f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f161817g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public p f161818h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public HelpCenterRequestFragment f161819i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f161820j;

    @Inject
    public l(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k CookieManager cookieManager, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k InterfaceC30756m interfaceC30756m, @Y61.k H h12, @Y61.k E e12, @Y61.l @com.avito.android.help_center.help_center_request.di.h String str, @Y61.l @com.avito.android.help_center.help_center_request.di.a String str2, @com.avito.android.help_center.help_center_request.di.b @Y61.l String str3) {
        Uri.Builder builderBuildUpon;
        this.f161811a = interfaceC35745a5;
        this.f161812b = cookieManager;
        this.f161813c = eVar;
        this.f161814d = interfaceC30756m;
        this.f161815e = h12;
        this.f161816f = e12;
        Uri url = h12.getUrl();
        Uri.Builder builderPath = (url == null || (builderBuildUpon = url.buildUpon()) == null) ? null : builderBuildUpon.path("request");
        if ((str != null && !C43066x.K(str)) || ((str2 != null && !C43066x.K(str2)) || (str3 != null && !C43066x.K(str3)))) {
            if (builderPath != null) {
                builderPath.appendQueryParameter("appId", "3");
            }
            if (str != null && !C43066x.K(str) && builderPath != null) {
                builderPath.appendQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_THEME, str);
            }
            if (str2 != null && !C43066x.K(str2) && builderPath != null) {
                builderPath.appendQueryParameter("problemInfo[itemId]", str2);
            }
            if (str3 != null && !C43066x.K(str3) && builderPath != null) {
                builderPath.appendQueryParameter("eventData[contextId]", str3);
            }
        }
        this.f161820j = Uri.decode(String.valueOf(builderPath != null ? builderPath.build() : null));
    }

    @Override // com.avito.android.help_center.help_center_request.h
    public final boolean a() {
        p pVar = this.f161818h;
        if (pVar != null) {
            return pVar.f161833d.c();
        }
        return false;
    }

    @Override // com.avito.android.help_center.help_center_request.h
    public final void b(@Y61.k p pVar) {
        this.f161818h = pVar;
        E e12 = this.f161816f;
        e12.a(this);
        com.avito.android.ui.view.d dVar = pVar.f161833d;
        InterfaceC30756m interfaceC30756m = this.f161814d;
        dVar.b(interfaceC30756m, "android");
        dVar.a(e12);
        e();
        dVar.d(this.f161820j);
        com.jakewharton.rxrelay3.c f161840a = interfaceC30756m.getF161840a();
        InterfaceC35745a5 interfaceC35745a5 = this.f161811a;
        y yVarG = C35896f0.g(f161840a.j0(interfaceC35745a5.e()), new i(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f161817g;
        cVar.b(yVarG);
        cVar.b(C35896f0.g(((z) pVar.f161832c.getValue()).j0(interfaceC35745a5.e()), new j(pVar)));
        cVar.b(C35896f0.g(pVar.f161831b.j0(interfaceC35745a5.e()), new k(this)));
    }

    @Override // com.avito.android.help_center.help_center_request.h
    public final void c(@Y61.k HelpCenterRequestFragment helpCenterRequestFragment) {
        this.f161819i = helpCenterRequestFragment;
    }

    @Override // com.avito.android.help_center.help_center_request.h
    public final void c0() {
        this.f161819i = null;
    }

    @Override // com.avito.android.help_center.E.a
    public final void d(@Y61.k Uri uri) {
        HelpCenterRequestFragment helpCenterRequestFragment = this.f161819i;
        if (helpCenterRequestFragment != null) {
            InterfaceC35845m2 interfaceC35845m2 = helpCenterRequestFragment.f161758o0;
            if (interfaceC35845m2 == null) {
                interfaceC35845m2 = null;
            }
            C35966w1.g(helpCenterRequestFragment, interfaceC35845m2.t(uri), new e(helpCenterRequestFragment));
        }
    }

    public final void e() {
        CookieManager cookieManager = this.f161812b;
        cookieManager.setAcceptCookie(true);
        for (com.avito.android.cookie_provider.a aVar : this.f161813c.getCookies()) {
            cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
        }
    }

    @Override // com.avito.android.help_center.help_center_request.h
    public final void e0() {
        p pVar = this.f161818h;
        if (pVar != null) {
            pVar.f161833d.e("android");
        }
        p pVar2 = this.f161818h;
        if (pVar2 != null) {
            pVar2.f161833d.f304687a.f392926d.remove(this.f161816f);
        }
        this.f161818h = null;
        this.f161817g.e();
    }
}
