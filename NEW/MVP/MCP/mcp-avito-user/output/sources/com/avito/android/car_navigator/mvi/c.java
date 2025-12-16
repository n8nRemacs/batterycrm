package com.avito.android.car_navigator.mvi;

import Dm.C13416c;
import Dm.InterfaceC13414a;
import Dm.InterfaceC13415b;
import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.car_navigator.mvi.entity.CarNavigatorInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarNavigatorFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDm/a;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "LDm/c;", "LDm/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements l<q<InterfaceC13414a, CarNavigatorInternalAction, C13416c, InterfaceC13415b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f115197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f115198m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f115199n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, f fVar, h hVar) {
        super(1);
        this.f115197l = aVar;
        this.f115198m = fVar;
        this.f115199n = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13414a, CarNavigatorInternalAction, C13416c, InterfaceC13415b> qVar) {
        q<InterfaceC13414a, CarNavigatorInternalAction, C13416c, InterfaceC13415b> qVar2 = qVar;
        qVar2.f92009e = this.f115197l;
        qVar2.f92010f = this.f115198m;
        qVar2.f92011g = this.f115199n;
        AW.a aVar = AW.a.f430a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(aVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
