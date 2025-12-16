package com.avito.android.passport.profile_add.merge.check.mvi;

import a60.InterfaceC19686a;
import a60.InterfaceC19687b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckMergePossibilityFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "La60/a;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "La60/c;", "La60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<q<InterfaceC19686a, CheckMergePossibilityInternalAction, a60.c, InterfaceC19687b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f212668l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f212669m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f212670n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f212671o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f212672p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f212668l = eVar;
        this.f212669m = aVar;
        this.f212670n = screenPerformanceTracker;
        this.f212671o = lVar;
        this.f212672p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC19686a, CheckMergePossibilityInternalAction, a60.c, InterfaceC19687b> qVar) {
        q<InterfaceC19686a, CheckMergePossibilityInternalAction, a60.c, InterfaceC19687b> qVar2 = qVar;
        qVar2.f92008d = this.f212668l;
        qVar2.f92009e = this.f212669m;
        qVar2.f92011g = new o(this.f212670n, this.f212671o);
        qVar2.f92010f = this.f212672p;
        AW.a aVar = AW.a.f430a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(aVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
