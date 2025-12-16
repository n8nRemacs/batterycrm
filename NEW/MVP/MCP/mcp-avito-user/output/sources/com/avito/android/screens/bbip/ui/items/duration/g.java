package com.avito.android.screens.bbip.ui.items.duration;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DurationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "duration", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f260355l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f260356m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, j jVar) {
        super(1);
        this.f260355l = hVar;
        this.f260356m = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        h hVar = this.f260355l;
        hVar.f260361f = iIntValue;
        hVar.f260360e.add(Integer.valueOf(iIntValue));
        ArrayList arrayListK = hVar.k();
        this.f260356m.ya(hVar.f260361f, arrayListK);
        hVar.f260357b.onNext(Integer.valueOf(iIntValue));
        return G0.f406611a;
    }
}
