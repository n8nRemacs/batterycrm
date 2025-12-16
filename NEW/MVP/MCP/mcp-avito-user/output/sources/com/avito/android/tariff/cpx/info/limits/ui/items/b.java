package com.avito.android.tariff.cpx.info.limits.ui.items;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCpxInfoLimitsHeaderItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f296648l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f296649m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, AttributedText attributedText) {
        super(1);
        this.f296648l = attributedText;
        this.f296649m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f296648l.setOnDeepLinkClickListener(new B(16, this.f296649m));
        return G0.f406611a;
    }
}
