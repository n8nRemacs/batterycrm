package com.avito.android.notification_center.list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationCenterFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LD30/a;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviState;", "LD30/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<q<D30.a, NotificationCenterMviInternalAction, NotificationCenterMviState, D30.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f207706l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f207707m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f207708n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f207709o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f207706l = hVar;
        this.f207707m = screenPerformanceTracker;
        this.f207708n = oVar;
        this.f207709o = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<D30.a, NotificationCenterMviInternalAction, NotificationCenterMviState, D30.b> qVar) {
        q<D30.a, NotificationCenterMviInternalAction, NotificationCenterMviState, D30.b> qVar2 = qVar;
        qVar2.f92009e = this.f207706l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f207707m, this.f207708n);
        qVar2.f92010f = this.f207709o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
