package com.avito.android.advert.item.leasing_calculator;

import com.avito.android.remote.model.LeasingCalculator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import oR.AbstractC44682a;

/* compiled from: AdvertDetailsLeasingCalculatorItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f77364l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f77364l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        LeasingCalculator.LeasingInputTerm period;
        String str2 = str;
        Long lZ02 = str2 != null ? C43066x.z0(new C43059p("[^0-9]").f(str2, "")) : null;
        f fVar = this.f77364l;
        LeasingCalculator f175120f = fVar.f77366c.getF175120f();
        if (f175120f != null && (period = f175120f.getPeriod()) != null && !L.f(period.getValue(), lZ02)) {
            period.setValue(lZ02);
            fVar.f77378o.a(AbstractC44682a.b.f419771b);
            fVar.f77381r.accept(G0.f406611a);
        }
        return G0.f406611a;
    }
}
