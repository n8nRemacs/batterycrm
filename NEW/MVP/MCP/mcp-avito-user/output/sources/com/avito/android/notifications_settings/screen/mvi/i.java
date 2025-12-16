package com.avito.android.notifications_settings.screen.mvi;

import c40.InterfaceC26936a;
import c40.InterfaceC26937b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationsSettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lc40/a;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsState;", "Lc40/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC26936a, NotificationsSettingsInternalAction, NotificationsSettingsState, InterfaceC26937b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f208144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f208145m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f208146n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f208147o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f208148p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, s sVar, q qVar) {
        super(1);
        this.f208144l = gVar;
        this.f208145m = eVar;
        this.f208146n = screenPerformanceTracker;
        this.f208147o = sVar;
        this.f208148p = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC26936a, NotificationsSettingsInternalAction, NotificationsSettingsState, InterfaceC26937b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC26936a, NotificationsSettingsInternalAction, NotificationsSettingsState, InterfaceC26937b> qVar2 = qVar;
        qVar2.f92008d = this.f208144l;
        qVar2.f92009e = this.f208145m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f208146n, this.f208147o);
        qVar2.f92010f = this.f208148p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
