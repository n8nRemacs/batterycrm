package com.avito.android.services_onboarding.mvi;

import Zu0.InterfaceC19610a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesOnboardingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZu0/a;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "LZu0/c;", "LZu0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<q<InterfaceC19610a, ServicesOnboardingInternalAction, Zu0.c, Zu0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f279954l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f279955m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f279956n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f279957o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f279958p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f279954l = fVar;
        this.f279955m = aVar;
        this.f279956n = screenPerformanceTracker;
        this.f279957o = mVar;
        this.f279958p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC19610a, ServicesOnboardingInternalAction, Zu0.c, Zu0.b> qVar) {
        q<InterfaceC19610a, ServicesOnboardingInternalAction, Zu0.c, Zu0.b> qVar2 = qVar;
        qVar2.f92008d = this.f279954l;
        qVar2.f92009e = this.f279955m;
        qVar2.f92011g = new o(this.f279956n, this.f279957o);
        qVar2.f92010f = this.f279958p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
