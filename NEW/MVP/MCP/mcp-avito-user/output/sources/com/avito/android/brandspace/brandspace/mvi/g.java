package com.avito.android.brandspace.brandspace.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction;
import jk.AbstractC42392c;
import jk.InterfaceC42390a;
import jk.InterfaceC42391b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandspaceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ljk/a;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Ljk/c;", "Ljk/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<q<InterfaceC42390a, BrandspaceInternalAction, AbstractC42392c, InterfaceC42391b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f107660l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f107661m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f107662n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f107663o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f107664p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f107660l = eVar;
        this.f107661m = bVar;
        this.f107662n = screenPerformanceTracker;
        this.f107663o = lVar;
        this.f107664p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42390a, BrandspaceInternalAction, AbstractC42392c, InterfaceC42391b> qVar) {
        q<InterfaceC42390a, BrandspaceInternalAction, AbstractC42392c, InterfaceC42391b> qVar2 = qVar;
        qVar2.f92008d = this.f107660l;
        qVar2.f92009e = this.f107661m;
        qVar2.f92011g = new o(this.f107662n, this.f107663o);
        qVar2.f92010f = this.f107664p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
