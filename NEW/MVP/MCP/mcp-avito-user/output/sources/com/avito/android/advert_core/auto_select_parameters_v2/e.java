package com.avito.android.advert_core.auto_select_parameters_v2;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.text.AttributedText;
import hc.C40912b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectParametersV2Presenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/e;", "Lcom/avito/android/advert_core/auto_select_parameters_v2/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f82983b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82984c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f82985d;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k @InterfaceC30174s String str, @k InterfaceC28373a interfaceC28373a) {
        this.f82983b = aVar;
        this.f82984c = str;
        this.f82985d = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AutoSelectParametersV2Item autoSelectParametersV2Item = (AutoSelectParametersV2Item) aVar;
        C40912b.a aVar2 = C40912b.f397290g;
        AttributedText attributedText = autoSelectParametersV2Item.f82935b;
        String text = attributedText.getText();
        aVar2.getClass();
        this.f82985d.c(C40912b.a.a(this.f82984c, text, autoSelectParametersV2Item.f82940g));
        gVar.l(autoSelectParametersV2Item.f82937d);
        gVar.e(attributedText);
        gVar.g(autoSelectParametersV2Item.f82936c);
        gVar.n1(autoSelectParametersV2Item.f82938e);
        gVar.yj(new d(this), autoSelectParametersV2Item.f82939f);
    }
}
