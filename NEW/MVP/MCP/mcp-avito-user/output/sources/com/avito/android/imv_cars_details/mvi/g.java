package com.avito.android.imv_cars_details.mvi;

import com.avito.android.arch.mvi.q;
import com.avito.android.imv_cars_details.mvi.entity.ImvCarsDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvCarsDetailsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LWM/a;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "LWM/c;", "LWM/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<q<WM.a, ImvCarsDetailsInternalAction, WM.c, WM.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f170001l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f170002m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f170003n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, j jVar, l lVar) {
        super(1);
        this.f170001l = eVar;
        this.f170002m = jVar;
        this.f170003n = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<WM.a, ImvCarsDetailsInternalAction, WM.c, WM.b> qVar) {
        q<WM.a, ImvCarsDetailsInternalAction, WM.c, WM.b> qVar2 = qVar;
        qVar2.f92009e = this.f170001l;
        qVar2.f92010f = this.f170002m;
        qVar2.f92011g = this.f170003n;
        AW.a aVar = AW.a.f430a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(aVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
