package com.avito.android.search.filter.location_filter;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.counter.CounterButton;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LocationFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.l<P2<? super ChangingParametersForButtons>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f263644l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f263645m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, u uVar) {
        super(1);
        this.f263644l = uVar;
        this.f263645m = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super ChangingParametersForButtons> p22) {
        P2<? super ChangingParametersForButtons> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        u uVar = this.f263644l;
        if (z12) {
            uVar.e(false);
            uVar.c();
        } else {
            boolean z13 = p23 instanceof P2.b;
            r rVar = this.f263645m;
            if (z13) {
                CounterButton counterButton = ((ChangingParametersForButtons) ((P2.b) p23).f318720a).getCounterButton();
                if (counterButton != null) {
                    uVar.e(true);
                    if (counterButton.getPresentationType() != null) {
                        rVar.getClass();
                    }
                }
                uVar.h();
            } else if (p23 instanceof P2.a) {
                uVar.e(true);
                PresentationType.INSTANCE.defaultValue();
                rVar.getClass();
                uVar.h();
            }
        }
        return G0.f406611a;
    }
}
