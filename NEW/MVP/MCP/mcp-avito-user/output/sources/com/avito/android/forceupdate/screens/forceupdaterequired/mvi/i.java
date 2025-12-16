package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import com.avito.android.arch.mvi.q;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ForceUpdateRequiredFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LME/a;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredState;", "LME/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.l<q<ME.a, ForceUpdateRequiredInternalAction, ForceUpdateRequiredState, ME.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f158527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f158528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f158529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f158530o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, l lVar, n nVar) {
        super(1);
        this.f158527l = gVar;
        this.f158528m = eVar;
        this.f158529n = lVar;
        this.f158530o = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<ME.a, ForceUpdateRequiredInternalAction, ForceUpdateRequiredState, ME.b> qVar) {
        q<ME.a, ForceUpdateRequiredInternalAction, ForceUpdateRequiredState, ME.b> qVar2 = qVar;
        qVar2.f92008d = this.f158527l;
        qVar2.f92009e = this.f158528m;
        qVar2.f92010f = this.f158529n;
        qVar2.f92011g = this.f158530o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
