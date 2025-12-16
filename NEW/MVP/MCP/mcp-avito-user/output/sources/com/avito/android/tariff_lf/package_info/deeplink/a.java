package com.avito.android.tariff_lf.package_info.deeplink;

import Ju.InterfaceC14249c;
import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import sv.C48421d;

/* compiled from: TariffPackageInfoDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/deeplink/a;", "Lev/a;", "Lcom/avito/android/tariff_lf/package_info/deeplink/TariffPackageInfoLink;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<TariffPackageInfoLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.paid_services.a f299180f;

    /* compiled from: TariffPackageInfoDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff_lf.package_info.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9144a extends H implements l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((a) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k com.avito.android.paid_services.a aVar) {
        this.f299180f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        int iA2 = C48421d.a(this);
        this.f299180f.a((TariffPackageInfoLink) deepLink, iA2, bundle, null);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f299180f.b(C48421d.a(this), new C9144a(1, this, a.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f299180f.e();
    }
}
