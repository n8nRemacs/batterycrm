package com.avito.android.cpt.activation.mvi;

import Lr.InterfaceC14431a;
import Lr.InterfaceC14432b;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CptActivationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LLr/a;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "LLr/c;", "LLr/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<q<InterfaceC14431a, CptActivationInternalAction, Lr.c, InterfaceC14432b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f126289l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f126290m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f126291n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f126292o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f126293p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f126289l = cVar;
        this.f126290m = aVar;
        this.f126291n = screenPerformanceTracker;
        this.f126292o = jVar;
        this.f126293p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14431a, CptActivationInternalAction, Lr.c, InterfaceC14432b> qVar) {
        q<InterfaceC14431a, CptActivationInternalAction, Lr.c, InterfaceC14432b> qVar2 = qVar;
        qVar2.f92008d = this.f126289l;
        qVar2.f92009e = this.f126290m;
        qVar2.f92011g = new o(this.f126291n, this.f126292o);
        qVar2.f92010f = this.f126293p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
