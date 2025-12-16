package com.avito.android.tariff.cpx.limit.save.deeplink;

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

/* compiled from: TariffCpxLimitSaveHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/save/deeplink/c;", "Lev/a;", "Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40161a<TariffCpxLimitSaveLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.g f297210f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f297211g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.tariff.cpx.limit.save.domain.a f297212h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f297213i;

    @Inject
    public c(@k a.g gVar, @k a.i iVar, @k com.avito.android.tariff.cpx.limit.save.domain.a aVar, @k R0 r02) {
        this.f297210f = gVar;
        this.f297211g = iVar;
        this.f297212h = aVar;
        this.f297213i = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f297213i, null, null, new b(bundle, this, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f297213i, null);
    }
}
