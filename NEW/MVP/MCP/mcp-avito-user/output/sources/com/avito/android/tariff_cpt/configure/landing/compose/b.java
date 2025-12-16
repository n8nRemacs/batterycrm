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
final class b extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C44625c.b f297697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC44623a, G0> f297698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(C44625c.b bVar, Y41.l<? super InterfaceC44623a, G0> lVar) {
        super(1);
        this.f297697l = bVar;
        this.f297698m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f297697l.f419608b.setOnDeepLinkClickListener(new B(18, this.f297698m));
        return G0.f406611a;
    }
}
