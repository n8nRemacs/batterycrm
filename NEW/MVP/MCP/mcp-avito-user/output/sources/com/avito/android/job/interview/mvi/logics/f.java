package com.avito.android.job.interview.mvi.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.job.interview.mvi.entity.InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vQ.C49251c;
import vQ.InterfaceC49249a;
import vQ.InterfaceC49252d;

/* compiled from: JobInterviewInvitationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LvQ/a;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "LvQ/c;", "LvQ/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC49249a, InternalAction, C49251c, InterfaceC49252d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f174608l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f174609m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f174610n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f174611o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f174612p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, l lVar, d dVar) {
        super(1);
        this.f174608l = aVar;
        this.f174609m = screenPerformanceTracker;
        this.f174610n = pVar;
        this.f174611o = lVar;
        this.f174612p = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC49249a, InternalAction, C49251c, InterfaceC49252d> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC49249a, InternalAction, C49251c, InterfaceC49252d> qVar2 = qVar;
        qVar2.f92009e = this.f174608l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f174609m, this.f174610n);
        qVar2.f92010f = this.f174611o;
        qVar2.f92008d = this.f174612p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
