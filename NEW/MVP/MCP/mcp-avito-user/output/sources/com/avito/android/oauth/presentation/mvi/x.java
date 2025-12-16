package com.avito.android.oauth.presentation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l40.InterfaceC43542a;

/* compiled from: OAuthFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ll40/a;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Ll40/c;", "Ll40/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC43542a, OAuthInternalAction, l40.c, l40.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f208378l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C32904a f208379m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f208380n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H f208381o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f208382p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, C32904a c32904a, ScreenPerformanceTracker screenPerformanceTracker, H h12, F f12) {
        super(1);
        this.f208378l = vVar;
        this.f208379m = c32904a;
        this.f208380n = screenPerformanceTracker;
        this.f208381o = h12;
        this.f208382p = f12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC43542a, OAuthInternalAction, l40.c, l40.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC43542a, OAuthInternalAction, l40.c, l40.b> qVar2 = qVar;
        qVar2.f92008d = this.f208378l;
        qVar2.f92009e = this.f208379m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f208380n, this.f208381o);
        qVar2.f92010f = this.f208382p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
