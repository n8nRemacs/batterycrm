package com.avito.android.tariff.cpx.limit.cancel.deeplink;

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

/* compiled from: TariffCpxLimitCancelHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/c;", "Lev/a;", "Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40161a<TariffCpxLimitCancelLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.g f297190f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f297191g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.tariff.cpx.limit.cancel.domain.a f297192h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f297193i;

    @Inject
    public c(@k a.g gVar, @k a.i iVar, @k com.avito.android.tariff.cpx.limit.cancel.domain.a aVar, @k R0 r02) {
        this.f297190f = gVar;
        this.f297191g = iVar;
        this.f297192h = aVar;
        this.f297193i = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f297193i, null, null, new b(this, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f297193i, null);
    }
}
