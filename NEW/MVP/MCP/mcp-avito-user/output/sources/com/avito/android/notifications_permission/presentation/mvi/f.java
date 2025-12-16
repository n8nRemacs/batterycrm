package com.avito.android.notifications_permission.presentation.mvi;

import com.avito.android.notifications_permission.ab_test.config.NotificationPermissionInfoTestGroup;
import com.avito.android.notifications_permission.presentation.mvi.entity.NotificationPermissionInfoInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: NotificationPermissionInfoBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.b<NotificationPermissionInfoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M30.a f207879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P30.a f207880b;

    @Inject
    public f(@Y61.k M30.a aVar, @Y61.k P30.a aVar2) {
        this.f207879a = aVar;
        this.f207880b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<NotificationPermissionInfoInternalAction> a() {
        String strB = this.f207880b.b();
        if (strB == null) {
            return new C43210w(NotificationPermissionInfoInternalAction.CloseScreen.f207876b);
        }
        NotificationPermissionInfoTestGroup notificationPermissionInfoTestGroupA = this.f207879a.a().a();
        notificationPermissionInfoTestGroupA.getClass();
        return new C43210w(notificationPermissionInfoTestGroupA == NotificationPermissionInfoTestGroup.f207821d ? NotificationPermissionInfoInternalAction.ShowNotificationPermissionRequestRational.f207878b : new NotificationPermissionInfoInternalAction.RequestPermission(strB));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
