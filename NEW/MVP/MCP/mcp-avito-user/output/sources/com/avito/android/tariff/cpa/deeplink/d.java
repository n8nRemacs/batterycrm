package com.avito.android.tariff.cpa.deeplink;

import Ju.AbstractC14250d;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.tariff.deeplink.TariffCpaConfigureSaveLink;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: TariffCpaConfigureSaveHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/deeplink/d;", "Lev/a;", "Lcom/avito/android/tariff/deeplink/TariffCpaConfigureSaveLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<TariffCpaConfigureSaveLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f294567f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f294568g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f294569h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpa.configure_advance.viewmodel.j f294570i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f294571j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f294572k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public y f294573l;

    @Inject
    public d(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k com.avito.android.tariff.cpa.configure_advance.viewmodel.j jVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f294567f = aVar;
        this.f294568g = gVar;
        this.f294569h = iVar;
        this.f294570i = jVar;
        this.f294571j = interfaceC4053a;
        this.f294572k = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TariffCpaConfigureSaveLink tariffCpaConfigureSaveLink = (TariffCpaConfigureSaveLink) deepLink;
        if (bundle == null) {
            j(AbstractC14250d.b.f9170c);
            return;
        }
        B0 b0C = this.f294570i.c(bundle.getInt("keyCpaConfigureAdvance"), tariffCpaConfigureSaveLink.f297369b);
        InterfaceC35745a5 interfaceC35745a5 = this.f294572k;
        I0 i0J0 = b0C.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
        a aVar = new a(this);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f294573l = (y) i0J0.J(interfaceC43543a, aVar).F(new C31684n(this, 19)).v0(new b(this), new c(this), interfaceC43543a);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f294573l;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f294573l = null;
    }
}
