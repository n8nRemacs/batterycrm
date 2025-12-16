package com.avito.android.loyalty.ui.quality_service.items.faq;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FaqItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f183858l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f183859m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, h hVar) {
        super(0);
        this.f183858l = aVar;
        this.f183859m = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AttributedText attributedText = this.f183858l.f183849d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        h hVar = this.f183859m;
        hVar.getClass();
        hVar.f183865b.setOnClickListener(new com.avito.android.lib.design.list_item.a(18, null));
        hVar.f183867d.setOnClickListener(new com.avito.android.lib.design.list_item.a(19, null));
        return G0.f406611a;
    }
}
