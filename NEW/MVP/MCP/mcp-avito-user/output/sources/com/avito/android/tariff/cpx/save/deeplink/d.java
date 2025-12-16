package com.avito.android.tariff.cpx.save.deeplink;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.deeplink.TariffCpxSaveLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: TariffCpxSaveHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/save/deeplink/d;", "Lev/a;", "Lcom/avito/android/tariff/deeplink/TariffCpxSaveLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<TariffCpxSaveLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f297348f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f297349g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f297350h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.tariff.cpx.save.domain.a f297351i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f297352j;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.g gVar, @k a.i iVar, @k com.avito.android.tariff.cpx.save.domain.a aVar2, @k R0 r02) {
        this.f297348f = aVar;
        this.f297349g = gVar;
        this.f297350h = iVar;
        this.f297351i = aVar2;
        this.f297352j = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f297352j, null, null, new c(this, (TariffCpxSaveLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f297352j, null);
    }
}
