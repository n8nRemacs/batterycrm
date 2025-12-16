package com.avito.android.service_fee_conditions.ui.compose.items;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.B;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qu0.c;

/* compiled from: ServiceFeeConditionsBannerItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.a f278516l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f278517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(c.a aVar, Y41.l<? super DeepLink, G0> lVar) {
        super(1);
        this.f278516l = aVar;
        this.f278517m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f278516l.f429489a.setOnDeepLinkClickListener(new B(12, this.f278517m));
        return G0.f406611a;
    }
}
