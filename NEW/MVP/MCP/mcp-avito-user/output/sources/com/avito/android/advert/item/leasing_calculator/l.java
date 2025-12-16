package com.avito.android.advert.item.leasing_calculator;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;

/* compiled from: AdvertDetailsLeasingCalculatorItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f77401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f77402c;

    public l(f fVar, p pVar) {
        this.f77401b = fVar;
        this.f77402c = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        f fVar = this.f77401b;
        y yVar = fVar.f77380q;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        p pVar = this.f77402c;
        boolean zV2 = fVar.V(pVar);
        if (!fVar.Y(pVar)) {
            zV2 = false;
        }
        if (zV2) {
            fVar.f77380q = (y) fVar.f77366c.e().j0(fVar.f77371h.e()).t0(new m(fVar, pVar));
        }
    }
}
