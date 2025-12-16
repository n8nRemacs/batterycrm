package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import c90.InterfaceC26960a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchDataHeader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33293q extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f221714l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221715m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33293q(Y41.l lVar, AttributedText attributedText) {
        super(1);
        this.f221714l = attributedText;
        this.f221715m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f221714l.setOnDeepLinkClickListener(new com.avito.android.mortgage.document_upload.B(3, this.f221715m));
        return G0.f406611a;
    }
}
