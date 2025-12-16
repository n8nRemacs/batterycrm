package com.avito.android.authorization.auth.auth_socials;

import be.C25637d;
import be.InterfaceC25635b;
import be.InterfaceC25636c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AuthSocialsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lbe/b;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "Lbe/d;", "Lbe/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC25635b, AuthSocialsInternalAction, C25637d, InterfaceC25636c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f92890l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f92891m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f92892n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f92893o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f92894p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, t tVar, r rVar) {
        super(1);
        this.f92890l = cVar;
        this.f92891m = aVar;
        this.f92892n = screenPerformanceTracker;
        this.f92893o = tVar;
        this.f92894p = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC25635b, AuthSocialsInternalAction, C25637d, InterfaceC25636c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC25635b, AuthSocialsInternalAction, C25637d, InterfaceC25636c> qVar2 = qVar;
        qVar2.f92008d = this.f92890l;
        qVar2.f92009e = this.f92891m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f92892n, this.f92893o);
        qVar2.f92010f = this.f92894p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
