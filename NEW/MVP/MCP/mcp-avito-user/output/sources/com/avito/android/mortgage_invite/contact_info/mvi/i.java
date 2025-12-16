package com.avito.android.mortgage_invite.contact_info.mvi;

import b20.InterfaceC25394a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationContactInfoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lb20/a;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lb20/d;", "Lb20/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<q<InterfaceC25394a, ApplicationContactInfoInternalAction, b20.d, b20.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f205734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f205735m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f205736n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f205737o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f205738p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, e eVar, l lVar) {
        super(1);
        this.f205734l = gVar;
        this.f205735m = screenPerformanceTracker;
        this.f205736n = nVar;
        this.f205737o = eVar;
        this.f205738p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25394a, ApplicationContactInfoInternalAction, b20.d, b20.c> qVar) {
        q<InterfaceC25394a, ApplicationContactInfoInternalAction, b20.d, b20.c> qVar2 = qVar;
        qVar2.f92008d = this.f205734l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f205735m, this.f205736n);
        qVar2.f92009e = this.f205737o;
        qVar2.f92010f = this.f205738p;
        return G0.f406611a;
    }
}
