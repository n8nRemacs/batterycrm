package com.avito.android.tariff_cpt.configure.creation.deeplink;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.r;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptCreationDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/creation/deeplink/e;", "Lev/a;", "Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC40161a<TariffCptCreationLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final JC0.a f297571f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f297572g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f297573h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.g f297574i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f297575j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f297576k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f297577l = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public e(@k JC0.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k a.g gVar, @k a.i iVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f297571f = aVar;
        this.f297572g = interfaceC35745a5;
        this.f297573h = aVar2;
        this.f297574i = gVar;
        this.f297575j = iVar;
        this.f297576k = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TariffCptCreationLink tariffCptCreationLink = (TariffCptCreationLink) deepLink;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putBoolean("show_button_progress", true);
        this.f395445c.f134523a.set(new com.avito.android.deeplink_handler.handler.bundle.a(bundle2, tariffCptCreationLink, str));
        C42026y c42026yA = g1.a(this.f297571f.a(tariffCptCreationLink.f297564b));
        InterfaceC35745a5 interfaceC35745a5 = this.f297572g;
        this.f297577l.b(z.u(new r(c42026yA.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new a(this)), new b(this)), new c(this), new d(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f297577l.e();
    }
}
