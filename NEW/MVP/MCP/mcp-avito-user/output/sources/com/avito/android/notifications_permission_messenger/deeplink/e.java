package com.avito.android.notifications_permission_messenger.deeplink;

import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: NotificationPermissionMessengerDialogDeeplinkModule_ProvideMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/e;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f207984b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f207985a;

    /* compiled from: NotificationPermissionMessengerDialogDeeplinkModule_ProvideMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/e$a;", "", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k c cVar) {
        this.f207985a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f207985a;
        f207984b.getClass();
        d.f207983a.getClass();
        return new C43834a(NotificationPermissionMessengerDialogDeeplink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(NotificationPermissionMessengerDialogDeeplink.class), cVar));
    }
}
