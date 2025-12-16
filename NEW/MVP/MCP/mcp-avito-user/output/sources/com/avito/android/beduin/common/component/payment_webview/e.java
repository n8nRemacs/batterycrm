package com.avito.android.beduin.common.component.payment_webview;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinWebPaymentComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/e;", "Lej/b;", "Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel;", "Lcom/avito/android/beduin/common/component/payment_webview/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC40113b<BeduinWebPaymentModel, C28793a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f101854a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f101855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f101856c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Gson f101857d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_events.registry.d f101858e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f101859f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final p f101860g;

    @Inject
    public e(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k Gson gson, @Y61.k com.avito.android.deeplink_events.registry.d dVar, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k p pVar) {
        this.f101854a = interfaceC35745a5;
        this.f101855b = xVar;
        this.f101856c = aVar;
        this.f101857d = gson;
        this.f101858e = dVar;
        this.f101859f = eVar;
        this.f101860g = pVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new C28793a((BeduinWebPaymentModel) beduinModel, interfaceC15523b, this.f101854a, this.f101855b, this.f101856c, this.f101857d, this.f101858e, this.f101859f, this.f101860g);
    }
}
