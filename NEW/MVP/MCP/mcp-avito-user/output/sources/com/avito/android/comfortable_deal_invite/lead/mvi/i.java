package com.avito.android.comfortable_deal_invite.lead.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.comfortable_deal_invite.lead.mvi.entity.ComfortableDealInviteInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zq.C50611c;
import zq.InterfaceC50609a;
import zq.InterfaceC50610b;

/* compiled from: ComfortableDealInviteFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lzq/a;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lzq/c;", "Lzq/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<q<InterfaceC50609a, ComfortableDealInviteInternalAction, C50611c, InterfaceC50610b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f123706l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f123707m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f123708n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f123709o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ScreenPerformanceTracker screenPerformanceTracker, n nVar, f fVar, l lVar) {
        super(1);
        this.f123706l = screenPerformanceTracker;
        this.f123707m = nVar;
        this.f123708n = fVar;
        this.f123709o = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC50609a, ComfortableDealInviteInternalAction, C50611c, InterfaceC50610b> qVar) {
        q<InterfaceC50609a, ComfortableDealInviteInternalAction, C50611c, InterfaceC50610b> qVar2 = qVar;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f123706l, this.f123707m);
        qVar2.f92009e = this.f123708n;
        qVar2.f92010f = this.f123709o;
        return G0.f406611a;
    }
}
