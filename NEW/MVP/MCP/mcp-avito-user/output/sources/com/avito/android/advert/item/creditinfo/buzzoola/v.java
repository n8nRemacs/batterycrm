package com.avito.android.advert.item.creditinfo.buzzoola;

import Fc1.E0;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.advert.item.creditinfo.buzzoola.a;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.N;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: BuzzoolaCreditBannerViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/v;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/advert/item/creditinfo/buzzoola/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class v extends M0 implements d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final BuzzoolaCreditBannerLoader f74988E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f74989J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f74990K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f74991L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f74992M;

    /* renamed from: P, reason: collision with root package name */
    public boolean f74995P;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f74997R;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<a> f74993N = new C23038g0<>();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0<BuzzoolaBanner.BuzzoolaCredit> f74994O = new C23038g0<>();

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f74996Q = new io.reactivex.rxjava3.disposables.c();

    public v(@Y61.k BuzzoolaCreditBannerLoader buzzoolaCreditBannerLoader, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f74988E = buzzoolaCreditBannerLoader;
        this.f74989J = interfaceC35745a5;
        this.f74990K = aVar;
        this.f74991L = cVar;
        this.f74992M = aVar2;
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.d
    public final void Kc() {
        a value = this.f74993N.getValue();
        if (value != null && (value instanceof a.c)) {
            this.f74994O.setValue(((a.c) value).f74924b);
            AdvertDetails advertDetails = this.f74997R;
            if (advertDetails != null) {
                this.f74990K.g7(advertDetails);
            }
        }
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.d
    public final void Md() {
        this.f74994O.setValue(null);
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.d
    public final void Xc() {
        a value = this.f74993N.getValue();
        if (value != null && (value instanceof a.c)) {
            ke((a.c) value);
        }
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.d
    public final void k6() {
        a value = this.f74993N.getValue();
        if (value != null && (value instanceof a.c)) {
            ke((a.c) value);
        }
    }

    public final void ke(a.c cVar) {
        AdvertDetails advertDetails = this.f74997R;
        if (advertDetails != null) {
            this.f74990K.u7(cVar.f74925c, advertDetails);
        }
        BuzzoolaBanner.BuzzoolaCredit buzzoolaCredit = cVar.f74924b;
        this.f74991L.d(buzzoolaCredit.f88214h);
        b.a.a(this.f74992M, new WebViewLink.AnyDomain(Uri.parse(buzzoolaCredit.f88213g.f88281b), null, null, 6, null), null, null, 6);
    }

    public final void le(@Y61.k AdvertDetails advertDetails) {
        this.f74997R = advertDetails;
        if (this.f74995P) {
            return;
        }
        C23038g0<a> c23038g0 = this.f74993N;
        if (c23038g0.getValue() == null) {
            I0 i0J0 = this.f74988E.a(advertDetails).j0(this.f74989J.e());
            s sVar = new s(this);
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            this.f74996Q.b(new N(i0J0.J(interfaceC43543a, sVar), new E0(this, 5)).v0(new t(this), new u(this), interfaceC43543a));
            c23038g0.setValue(a.b.f74923b);
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f74995P = false;
        this.f74996Q.e();
        super.onCleared();
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.d
    public final void x3() {
        a value = this.f74993N.getValue();
        if (value != null && (value instanceof a.c)) {
            ke((a.c) value);
        }
    }
}
