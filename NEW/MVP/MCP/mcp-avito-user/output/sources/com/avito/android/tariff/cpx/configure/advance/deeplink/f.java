package com.avito.android.tariff.cpx.configure.advance.deeplink;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CpxConfigureAdvanceSaveDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/deeplink/f;", "Lev/a;", "Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC40161a<TariffCpxConfigureAdvanceSaveDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f295571f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f295572g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f295573h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f295574i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.tariff.cpx.configure.advance.domain.a f295575j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C43238h f295576k;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.g gVar, @k a.i iVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.tariff.cpx.configure.advance.domain.a aVar2, @k R0 r02) {
        this.f295571f = aVar;
        this.f295572g = gVar;
        this.f295573h = iVar;
        this.f295574i = interfaceC4053a;
        this.f295575j = aVar2;
        this.f295576k = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f295576k, null, null, new e(bundle, this, (TariffCpxConfigureAdvanceSaveDeepLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f295576k, null);
    }
}
