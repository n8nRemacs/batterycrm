package com.avito.android.safety.safety_settings.ui;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsSessions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class J extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f257830l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257831m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Y41.l lVar, AttributedText attributedText) {
        super(1);
        this.f257830l = attributedText;
        this.f257831m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        AttributedText attributedTextCopy$default = AttributedText.copy$default(this.f257830l, null, null, 0, 7, null);
        attributedTextCopy$default.setOnDeepLinkClickListener(new com.avito.android.mortgage.document_upload.B(9, this.f257831m));
        com.avito.android.util.text.j.a(aVar, attributedTextCopy$default, null);
        return G0.f406611a;
    }
}
