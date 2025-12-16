package com.avito.android.mortgage_invite.participant.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import p20.C46879d;
import p20.InterfaceC46876a;
import p20.InterfaceC46878c;

/* compiled from: ParticipantFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lp20/a;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lp20/d;", "Lp20/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC46876a, ParticipantInternalAction, C46879d, InterfaceC46878c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f206233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f206234m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f206235n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f206236o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f206237p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, i iVar, p pVar) {
        super(1);
        this.f206233l = kVar;
        this.f206234m = screenPerformanceTracker;
        this.f206235n = rVar;
        this.f206236o = iVar;
        this.f206237p = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC46876a, ParticipantInternalAction, C46879d, InterfaceC46878c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC46876a, ParticipantInternalAction, C46879d, InterfaceC46878c> qVar2 = qVar;
        qVar2.f92008d = this.f206233l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f206234m, this.f206235n);
        qVar2.f92009e = this.f206236o;
        qVar2.f92010f = this.f206237p;
        return G0.f406611a;
    }
}
