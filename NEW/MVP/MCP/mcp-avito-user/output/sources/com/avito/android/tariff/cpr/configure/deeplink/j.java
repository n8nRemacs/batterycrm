package com.avito.android.tariff.cpr.configure.deeplink;

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

/* compiled from: TariffCprConfigureSaveHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/j;", "Lev/a;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC40161a<TariffCprConfigureSaveLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f295511f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f295512g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f295513h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpr.configure.data.repository.a f295514i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f295515j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C43238h f295516k;

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k com.avito.android.tariff.cpr.configure.data.repository.a aVar2, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k R0 r02) {
        this.f295511f = aVar;
        this.f295512g = gVar;
        this.f295513h = iVar;
        this.f295514i = aVar2;
        this.f295515j = interfaceC4053a;
        this.f295516k = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f295516k, null, null, new i(bundle, this, (TariffCprConfigureSaveLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f295516k, null);
    }
}
