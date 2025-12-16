package com.avito.android.advert.item.icebreakers;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IceBreakersPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/advert/item/icebreakers/a;", "iceBreakerButton", "", "position", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert/item/icebreakers/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements p<a, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f76464l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f76465m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f76466n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z12, j jVar, m mVar) {
        super(2);
        this.f76464l = z12;
        this.f76465m = jVar;
        this.f76466n = mVar;
    }

    @Override // Y41.p
    public final G0 invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (!this.f76464l) {
            int i12 = aVar2.f76452b;
            j jVar = this.f76465m;
            jVar.f76478h = i12;
            jVar.f76472b.L1(iIntValue, i12, aVar2.f76453c);
            String strO = jVar.O();
            m mVar = this.f76466n;
            mVar.y0(strO);
            mVar.i0();
        }
        return G0.f406611a;
    }
}
