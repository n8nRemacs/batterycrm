package com.avito.android.select.group_clearance_select.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.select.group_clearance_select.mvi.entity.GroupClearanceInternalAction;
import cq0.C39399c;
import cq0.InterfaceC39397a;
import cq0.InterfaceC39398b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupClearanceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcq0/a;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "Lcq0/c;", "Lcq0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.l<q<InterfaceC39397a, GroupClearanceInternalAction, C39399c, InterfaceC39398b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f265511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f265512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f265513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f265514o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f265515p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f265511l = cVar;
        this.f265512m = aVar;
        this.f265513n = screenPerformanceTracker;
        this.f265514o = jVar;
        this.f265515p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39397a, GroupClearanceInternalAction, C39399c, InterfaceC39398b> qVar) {
        q<InterfaceC39397a, GroupClearanceInternalAction, C39399c, InterfaceC39398b> qVar2 = qVar;
        qVar2.f92008d = this.f265511l;
        qVar2.f92009e = this.f265512m;
        qVar2.f92011g = new o(this.f265513n, this.f265514o);
        qVar2.f92010f = this.f265515p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
