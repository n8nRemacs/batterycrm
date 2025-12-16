package com.avito.android.tariff_cpt.levels.deeplink;

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

/* compiled from: TariffCptLevelSaveV3DeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/deeplink/e;", "Lev/a;", "Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC40161a<TariffCptLevelSaveV3Link> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final JC0.a f298547f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f298548g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f298549h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f298550i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f298551j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f298552k = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public e(@Y61.k JC0.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k a.g gVar, @Y61.k a.i iVar) {
        this.f298547f = aVar;
        this.f298548g = interfaceC35745a5;
        this.f298549h = aVar2;
        this.f298550i = gVar;
        this.f298551j = iVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C42026y c42026yA = g1.a(this.f298547f.c(((TariffCptLevelSaveV3Link) deepLink).f298541b));
        InterfaceC35745a5 interfaceC35745a5 = this.f298548g;
        this.f298552k.b(z.u(new r(c42026yA.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new a(this)), new b(this)), new c(1, this, e.class, "handleResult", "handleResult(Lcom/avito/android/tariff_cpt/remote/model/CptSaveLevelResult;)V", 0), new d(1, this, e.class, "handleError", "handleError(Ljava/lang/String;)V", 0)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f298552k.e();
    }
}
