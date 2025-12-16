package com.avito.android.user_advert.advert;

import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/a;", "data", "", "apply", "(Lcom/avito/android/notifications_permission_messenger/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class R0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f308423b;

    public R0(C35435m0 c35435m0) {
        this.f308423b = c35435m0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean z12;
        NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink = ((com.avito.android.notifications_permission_messenger.a) obj).f207901a;
        if (notificationPermissionMessengerDialogDeeplink != null) {
            MyAdvertDetailsActivity myAdvertDetailsActivity = this.f308423b.f310461c0;
            if (myAdvertDetailsActivity != null) {
                myAdvertDetailsActivity.a(notificationPermissionMessengerDialogDeeplink);
            }
            z12 = true;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
