package com.avito.android.advert.item.leasing_calculator;

import android.content.Context;
import com.avito.android.leasing_calculator.view.u;
import com.avito.android.remote.model.LeasingCalculator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsLeasingCalculatorItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f77394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f77395m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, p pVar) {
        super(0);
        this.f77394l = fVar;
        this.f77395m = pVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        LeasingCalculator.LeasingInfo leasingInfo;
        LeasingCalculator.LeasingInfo.InfoModal modal;
        f fVar = this.f77394l;
        LeasingCalculator f175120f = fVar.f77366c.getF175120f();
        if (f175120f != null && (leasingInfo = f175120f.getLeasingInfo()) != null && (modal = leasingInfo.getModal()) != null) {
            p pVar = this.f77395m;
            Context context = pVar.getContext();
            com.avito.android.leasing_calculator.view.j jVar = fVar.f77372i;
            u uVar = fVar.f77375l;
            com.avito.android.leasing_calculator.view.o oVarB = jVar.b(context, modal, uVar);
            uVar.c(new k(oVarB, fVar, pVar));
            oVarB.b();
            fVar.f77377n.c();
        }
        return G0.f406611a;
    }
}
