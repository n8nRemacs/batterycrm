package com.avito.android.user_advert.advert.items.reject;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RejectReasonItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f310005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f310006m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, a aVar) {
        super(0);
        this.f310005l = mVar;
        this.f310006m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m mVar = this.f310005l;
        mVar.kc(null);
        AttributedText attributedText = this.f310006m.f309983f;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        mVar.U2(null);
        return G0.f406611a;
    }
}
