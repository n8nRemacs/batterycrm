package com.avito.android.notifications_permission.analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35793f6;
import com.avito.android.util.C35801g6;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionInfoAnalytics_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/analytics/c;", "Ldagger/internal/h;", "Lcom/avito/android/notifications_permission/analytics/b;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f207835c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C35801g6 f207836a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dagger.internal.f f207837b;

    /* compiled from: NotificationPermissionInfoAnalytics_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/analytics/c$a;", "", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C35801g6 c35801g6, @k dagger.internal.f fVar) {
        this.f207836a = c35801g6;
        this.f207837b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f207836a.getClass();
        C35793f6 c35793f6 = new C35793f6();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f207837b.get();
        f207835c.getClass();
        return new b(interfaceC28373a, c35793f6);
    }
}
