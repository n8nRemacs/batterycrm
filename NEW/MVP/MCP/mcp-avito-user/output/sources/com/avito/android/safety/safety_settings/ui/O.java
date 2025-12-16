package com.avito.android.safety.safety_settings.ui;

import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsTfa.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f257838l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f257839m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257840n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(AttributedText attributedText, boolean z12, Y41.l<? super com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar) {
        super(1);
        this.f257838l = attributedText;
        this.f257839m = z12;
        this.f257840n = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        AttributedText attributedTextCopy$default = AttributedText.copy$default(this.f257838l, null, null, 0, 7, null);
        attributedTextCopy$default.setOnDeepLinkClickListener(new com.avito.android.mortgage.document_upload.B(10, this.f257840n));
        com.avito.android.util.text.j.a(aVar2, attributedTextCopy$default, null);
        if (!this.f257839m) {
            aVar2.setTextColor(C35835l0.d(R.attr.red600, aVar2.getContext()));
        }
        return G0.f406611a;
    }
}
