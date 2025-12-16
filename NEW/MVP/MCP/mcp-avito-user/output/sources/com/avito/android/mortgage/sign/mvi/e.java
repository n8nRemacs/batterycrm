package com.avito.android.mortgage.sign.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.sign.mvi.entity.SignInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import o10.InterfaceC44504b;
import o10.InterfaceC44505c;

/* compiled from: SignFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lo10/b;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "Lo10/d;", "Lo10/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<q<InterfaceC44504b, SignInternalAction, o10.d, InterfaceC44505c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f203770l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f203771m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f203772n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f203773o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f203774p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, c cVar, h hVar) {
        super(1);
        this.f203770l = aVar;
        this.f203771m = screenPerformanceTracker;
        this.f203772n = jVar;
        this.f203773o = cVar;
        this.f203774p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC44504b, SignInternalAction, o10.d, InterfaceC44505c> qVar) {
        q<InterfaceC44504b, SignInternalAction, o10.d, InterfaceC44505c> qVar2 = qVar;
        qVar2.f92009e = this.f203770l;
        qVar2.f92011g = new o(this.f203771m, this.f203772n);
        qVar2.f92008d = this.f203773o;
        qVar2.f92010f = this.f203774p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
