package com.avito.android.bbl.screens.configure.v4.mvi;

import Bh.C13148c;
import Bh.InterfaceC13146a;
import Bh.InterfaceC13147b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.bbl.screens.configure.v4.mvi.entity.BblConfigureV4InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV4FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LBh/a;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "LBh/c;", "LBh/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<q<InterfaceC13146a, BblConfigureV4InternalAction, C13148c, InterfaceC13147b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f99501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f99502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f99503n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f99504o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f99505p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f99501l = eVar;
        this.f99502m = cVar;
        this.f99503n = screenPerformanceTracker;
        this.f99504o = lVar;
        this.f99505p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13146a, BblConfigureV4InternalAction, C13148c, InterfaceC13147b> qVar) {
        q<InterfaceC13146a, BblConfigureV4InternalAction, C13148c, InterfaceC13147b> qVar2 = qVar;
        qVar2.f92008d = this.f99501l;
        qVar2.f92009e = this.f99502m;
        qVar2.f92011g = new o(this.f99503n, this.f99504o);
        qVar2.f92010f = this.f99505p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
