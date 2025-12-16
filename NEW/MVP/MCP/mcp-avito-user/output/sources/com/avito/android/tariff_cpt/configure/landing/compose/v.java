package com.avito.android.tariff_cpt.configure.landing.compose;

import com.avito.android.mortgage.document_upload.B;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oC0.C44625c;
import oC0.InterfaceC44623a;

/* compiled from: TariffCptConfigureLandingScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class v extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C44625c.C12178c f297727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC44623a, G0> f297728m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(C44625c.C12178c c12178c, Y41.l<? super InterfaceC44623a, G0> lVar) {
        super(1);
        this.f297727l = c12178c;
        this.f297728m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f297727l.f419610a.setOnDeepLinkClickListener(new B(19, this.f297728m));
        return G0.f406611a;
    }
}
