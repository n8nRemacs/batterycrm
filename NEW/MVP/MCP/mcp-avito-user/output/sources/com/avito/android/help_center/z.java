package com.avito.android.help_center;

import android.net.Uri;
import android.webkit.CookieManager;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.help_center.E;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.rx3.C35896f0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;

/* compiled from: HelpCenterPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/z;", "Lcom/avito/android/help_center/p;", "Lcom/avito/android/help_center/E$a;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z implements p, E.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f161853a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CookieManager f161854b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f161855c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30756m f161856d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f161857e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f161858f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f161859g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f161860h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f161861i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public L f161862j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public HelpCenterFragment f161863k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f161864l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public String f161865m;

    @Inject
    public z(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k CookieManager cookieManager, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k InterfaceC30756m interfaceC30756m, @Y61.k E e12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k H h12, @Y61.l @com.avito.android.help_center.di.k String str, @Y61.l HelpCenterPresenterState helpCenterPresenterState) {
        String str2;
        this.f161853a = interfaceC35745a5;
        this.f161854b = cookieManager;
        this.f161855c = eVar;
        this.f161856d = interfaceC30756m;
        this.f161857e = e12;
        this.f161858f = aVar;
        this.f161859g = xVar;
        this.f161860h = interfaceC35845m2;
        String strValueOf = String.valueOf(h12.getUrl());
        String string = Uri.parse(str != null ? C43066x.z(strValueOf, "/", false) ? strValueOf.concat(str) : androidx.compose.foundation.H.i('/', strValueOf, str) : strValueOf).buildUpon().appendQueryParameter("appId", "3").build().toString();
        this.f161864l = string;
        if (helpCenterPresenterState != null && (str2 = helpCenterPresenterState.f161609b) != null) {
            string = str2;
        }
        this.f161865m = string;
    }

    @Override // com.avito.android.help_center.p
    public final boolean a() {
        L l12 = this.f161862j;
        if (l12 != null) {
            return l12.f161616d.c();
        }
        return false;
    }

    @Override // com.avito.android.help_center.p
    public final void b(@Y61.k HelpCenterFragment helpCenterFragment) {
        this.f161863k = helpCenterFragment;
    }

    @Override // com.avito.android.help_center.p
    public final void c(@Y61.k L l12) {
        this.f161862j = l12;
        E e12 = this.f161857e;
        e12.a(this);
        com.avito.android.ui.view.d dVar = l12.f161616d;
        InterfaceC30756m interfaceC30756m = this.f161856d;
        dVar.b(interfaceC30756m, "android");
        dVar.a(e12);
        l12.a(this.f161865m);
        com.jakewharton.rxrelay3.c f161840a = interfaceC30756m.getF161840a();
        InterfaceC35745a5 interfaceC35745a5 = this.f161853a;
        io.reactivex.rxjava3.internal.observers.y yVarG = C35896f0.g(f161840a.j0(interfaceC35745a5.e()), new q(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f161861i;
        cVar.b(yVarG);
        cVar.b(C35896f0.g(((io.reactivex.rxjava3.core.z) l12.f161615c.getValue()).j0(interfaceC35745a5.e()), new r(this, l12)));
        s sVar = new s(this);
        l41.g<? super Throwable> gVar = t.f161846b;
        com.jakewharton.rxrelay3.c<G0> cVar2 = l12.f161613a;
        cVar2.getClass();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(cVar2.v0(sVar, gVar, interfaceC43543a));
        u uVar = new u(this);
        l41.g<? super Throwable> gVar2 = v.f161848b;
        com.jakewharton.rxrelay3.c<G0> cVar3 = l12.f161614b;
        cVar3.getClass();
        cVar.b(cVar3.v0(uVar, gVar2, interfaceC43543a));
        cVar.b(this.f161858f.d9().N(w.f161849b).v0(new x(this, l12), y.f161852b, interfaceC43543a));
    }

    @Override // com.avito.android.help_center.p
    public final void c0() {
        this.f161863k = null;
    }

    @Override // com.avito.android.help_center.E.a
    public final void d(@Y61.k Uri uri) {
        DeepLink deepLinkE = this.f161859g.e(uri);
        if (deepLinkE instanceof NoMatchLink) {
            deepLinkE = null;
        }
        if (deepLinkE != null) {
            b.a.a(this.f161858f, deepLinkE, null, null, 6);
            return;
        }
        HelpCenterFragment helpCenterFragment = this.f161863k;
        if (helpCenterFragment != null) {
            C35966w1.g(helpCenterFragment, this.f161860h.t(uri), new C30747d(helpCenterFragment));
        }
    }

    @Override // com.avito.android.help_center.p
    @Y61.k
    public final HelpCenterPresenterState d0() {
        return new HelpCenterPresenterState(this.f161865m);
    }

    @Override // com.avito.android.help_center.p
    public final void e0() {
        L l12 = this.f161862j;
        if (l12 != null) {
            l12.f161616d.e("android");
        }
        L l13 = this.f161862j;
        if (l13 != null) {
            l13.f161616d.f304687a.f392926d.remove(this.f161857e);
        }
        this.f161862j = null;
        this.f161861i.e();
    }
}
