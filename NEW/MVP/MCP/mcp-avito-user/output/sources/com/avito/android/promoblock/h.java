package com.avito.android.promoblock;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TnsPromoBlockPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f231790l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f231791m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c f231792n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, AttributedText attributedText, io.reactivex.rxjava3.disposables.c cVar) {
        super(0);
        this.f231790l = kVar;
        this.f231791m = attributedText;
        this.f231792n = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f231790l.d(null);
        AttributedText attributedText = this.f231791m;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        this.f231792n.dispose();
        return G0.f406611a;
    }
}
