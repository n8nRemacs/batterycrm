package com.avito.android.mortgage_invite.lead.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage_invite.lead.mvi.entity.ApplicationLeadInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import n20.InterfaceC44171a;

/* compiled from: ApplicationLeadFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ln20/a;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "Ln20/c;", "Ln20/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<InterfaceC44171a, ApplicationLeadInternalAction, n20.c, n20.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f205914l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f205915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f205916n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f205917o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f205918p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, a aVar, i iVar) {
        super(1);
        this.f205914l = dVar;
        this.f205915m = screenPerformanceTracker;
        this.f205916n = kVar;
        this.f205917o = aVar;
        this.f205918p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC44171a, ApplicationLeadInternalAction, n20.c, n20.b> qVar) {
        q<InterfaceC44171a, ApplicationLeadInternalAction, n20.c, n20.b> qVar2 = qVar;
        qVar2.f92008d = this.f205914l;
        qVar2.f92011g = new o(this.f205915m, this.f205916n);
        qVar2.f92009e = this.f205917o;
        qVar2.f92010f = this.f205918p;
        return G0.f406611a;
    }
}
