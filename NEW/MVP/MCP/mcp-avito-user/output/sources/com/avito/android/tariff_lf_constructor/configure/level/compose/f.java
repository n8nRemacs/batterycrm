package com.avito.android.tariff_lf_constructor.configure.level.compose;

import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mD0.InterfaceC43949a;

/* compiled from: ConstructorConfigureLevelItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f299760l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC43949a, G0> f299761m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y41.l lVar, AttributedText attributedText) {
        super(1);
        this.f299760l = attributedText;
        this.f299761m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f299760l.setOnDeepLinkClickListener(new B(23, this.f299761m));
        return G0.f406611a;
    }
}
