package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.items;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditDescription.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f320892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Y41.l lVar, AttributedText attributedText) {
        super(1);
        this.f320892l = attributedText;
        this.f320893m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f320892l.setOnDeepLinkClickListener(new B(28, this.f320893m));
        return G0.f406611a;
    }
}
