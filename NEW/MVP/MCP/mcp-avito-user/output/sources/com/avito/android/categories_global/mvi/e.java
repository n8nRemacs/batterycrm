package com.avito.android.categories_global.mvi;

import Ln.InterfaceC14416a;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.categories_global.mvi.entity.CategoriesInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoriesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LLn/a;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "LLn/e;", "LLn/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<q<InterfaceC14416a, CategoriesInternalAction, Ln.e, Ln.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f116414l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f116415m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f116416n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f116417o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f116418p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, c cVar, h hVar) {
        super(1);
        this.f116414l = aVar;
        this.f116415m = screenPerformanceTracker;
        this.f116416n = jVar;
        this.f116417o = cVar;
        this.f116418p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14416a, CategoriesInternalAction, Ln.e, Ln.d> qVar) {
        q<InterfaceC14416a, CategoriesInternalAction, Ln.e, Ln.d> qVar2 = qVar;
        qVar2.f92009e = this.f116414l;
        qVar2.f92011g = new o(this.f116415m, this.f116416n);
        qVar2.f92008d = this.f116417o;
        qVar2.f92010f = this.f116418p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
