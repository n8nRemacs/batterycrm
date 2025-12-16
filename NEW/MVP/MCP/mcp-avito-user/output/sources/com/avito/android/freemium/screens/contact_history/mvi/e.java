package com.avito.android.freemium.screens.contact_history.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction;
import dF.InterfaceC39572a;
import dF.InterfaceC39573b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreemiumContactHistoryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LdF/a;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "LdF/c;", "LdF/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<q<InterfaceC39572a, FreemiumContactHistoryInternalAction, dF.c, InterfaceC39573b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f158988l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f158989m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f158990n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f158991o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f158992p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f158988l = cVar;
        this.f158989m = aVar;
        this.f158990n = screenPerformanceTracker;
        this.f158991o = jVar;
        this.f158992p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39572a, FreemiumContactHistoryInternalAction, dF.c, InterfaceC39573b> qVar) {
        q<InterfaceC39572a, FreemiumContactHistoryInternalAction, dF.c, InterfaceC39573b> qVar2 = qVar;
        qVar2.f92008d = this.f158988l;
        qVar2.f92009e = this.f158989m;
        qVar2.f92011g = new o(this.f158990n, this.f158991o);
        qVar2.f92010f = this.f158992p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
