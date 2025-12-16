package com.avito.android.remote.notification;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import com.avito.android.remote.notification.InterfaceC34334a;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ActiveNotificationProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/b;", "Lcom/avito/android/remote/notification/a;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.notification.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34335b implements InterfaceC34334a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254044a;

    /* compiled from: ActiveNotificationProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/NotificationManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.notification.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<NotificationManager> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.notification.m f254045l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.notification.m mVar) {
            super(0);
            this.f254045l = mVar;
        }

        @Override // Y41.a
        public final NotificationManager invoke() {
            return this.f254045l.a();
        }
    }

    @Inject
    public C34335b(@Y61.k com.avito.android.notification.m mVar) {
        this.f254044a = C42727D.c(new a(mVar));
    }

    @Override // com.avito.android.remote.notification.InterfaceC34334a
    @Y61.k
    public final ArrayList a(int i12) {
        StatusBarNotification[] activeNotifications = ((NotificationManager) this.f254044a.getValue()).getActiveNotifications();
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (statusBarNotification.getId() == i12 && kotlin.jvm.internal.L.f(statusBarNotification.getTag(), "tag_channel")) {
                arrayList.add(statusBarNotification);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
            arrayList2.add(new InterfaceC34334a.C7612a(statusBarNotification2.getId(), statusBarNotification2.getPostTime()));
        }
        return arrayList2;
    }
}
