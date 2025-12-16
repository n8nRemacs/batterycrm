package com.avito.android.publish.screen.objects.mvi;

import Ge0.InterfaceC13872a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ObjectFillFormFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "LGe0/f;", "LGe0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.l<q<InterfaceC13872a, ObjectFillFormInternalAction, Ge0.f, Ge0.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f240232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f240233m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f240234n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f240235o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f240236p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f240232l = hVar;
        this.f240233m = fVar;
        this.f240234n = screenPerformanceTracker;
        this.f240235o = oVar;
        this.f240236p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13872a, ObjectFillFormInternalAction, Ge0.f, Ge0.d> qVar) {
        q<InterfaceC13872a, ObjectFillFormInternalAction, Ge0.f, Ge0.d> qVar2 = qVar;
        qVar2.f92008d = this.f240232l;
        qVar2.f92009e = this.f240233m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f240234n, this.f240235o);
        qVar2.f92010f = this.f240236p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
