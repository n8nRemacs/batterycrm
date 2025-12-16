package com.avito.android.passport.profiles_list.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profiles_list.mvi.entity.PassportProfilesListInternalAction;
import j60.C42206c;
import j60.InterfaceC42204a;
import j60.InterfaceC42205b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportProfilesListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lj60/a;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lj60/c;", "Lj60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<InterfaceC42204a, PassportProfilesListInternalAction, C42206c, InterfaceC42205b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f213837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f213838m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f213839n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f213840o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f213841p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f213837l = dVar;
        this.f213838m = aVar;
        this.f213839n = screenPerformanceTracker;
        this.f213840o = kVar;
        this.f213841p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42204a, PassportProfilesListInternalAction, C42206c, InterfaceC42205b> qVar) {
        q<InterfaceC42204a, PassportProfilesListInternalAction, C42206c, InterfaceC42205b> qVar2 = qVar;
        qVar2.f92008d = this.f213837l;
        qVar2.f92009e = this.f213838m;
        qVar2.f92011g = new o(this.f213839n, this.f213840o);
        qVar2.f92010f = this.f213841p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
