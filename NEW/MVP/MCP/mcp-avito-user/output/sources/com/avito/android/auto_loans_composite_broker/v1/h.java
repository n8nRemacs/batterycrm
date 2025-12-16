package com.avito.android.auto_loans_composite_broker.v1;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsCompositeBrokerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f95547l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(0);
        this.f95547l = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AttributedText attributedText;
        j jVar = this.f95547l;
        l lVarL0 = jVar.f95553d.L0();
        if (lVarL0 != null && (attributedText = lVarL0.f95568i) != null) {
            attributedText.setOnUrlClickListener(null);
            attributedText.setOnDeepLinkClickListener(null);
        }
        jVar.f95554e = null;
        return G0.f406611a;
    }
}
