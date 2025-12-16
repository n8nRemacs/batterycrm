package com.avito.android.trx_promo_impl.item.commission;

import Y41.l;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoCommissionPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f304234l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f304235m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f304236n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, h hVar, j jVar) {
        super(1);
        this.f304234l = cVar;
        this.f304235m = hVar;
        this.f304236n = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        c cVar = this.f304234l;
        if (iIntValue != cVar.f304227c) {
            cVar.f304227c = iIntValue;
            ArrayList arrayList = cVar.f304233i;
            h hVar = this.f304235m;
            hVar.getClass();
            h.O(this.f304236n, arrayList, iIntValue);
            hVar.f304240c.K5(Integer.valueOf(iIntValue));
        }
        return G0.f406611a;
    }
}
