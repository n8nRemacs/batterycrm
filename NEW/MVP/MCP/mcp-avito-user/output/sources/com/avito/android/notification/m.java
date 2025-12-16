package com.avito.android.notification;

import android.app.Application;
import android.app.NotificationManager;
import androidx.core.app.E;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.V2;
import j.InterfaceC42148d;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationManagerFactory.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification/m;", "", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f207454a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<p> f207455b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f207456c = C42727D.b(LazyThreadSafetyMode.f406614b, new b());

    /* compiled from: NotificationManagerFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification/m$a;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final NotificationManager f207457a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final E f207458b;

        public a(@Y61.k NotificationManager notificationManager, @Y61.k E e12) {
            this.f207457a = notificationManager;
            this.f207458b = e12;
        }
    }

    /* compiled from: NotificationManagerFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/notification/m$a;", "invoke", "()Lcom/avito/android/notification/m$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final a invoke() {
            m mVar = m.this;
            NotificationManager notificationManager = (NotificationManager) mVar.f207454a.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
            E e12 = new E(mVar.f207454a);
            for (p pVar : mVar.f207455b) {
                V2.f318762a.c("NotificationManagerFactory", "Execute: ".concat(pVar.getClass().getName()), null);
                pVar.a(e12);
            }
            return new a(notificationManager, e12);
        }
    }

    @Inject
    public m(@Y61.k Application application, @Y61.k Set<p> set) {
        this.f207454a = application;
        this.f207455b = set;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    @InterfaceC42148d
    public final NotificationManager a() {
        return ((a) this.f207456c.getValue()).f207457a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    @InterfaceC42148d
    public final E b() {
        return ((a) this.f207456c.getValue()).f207458b;
    }
}
