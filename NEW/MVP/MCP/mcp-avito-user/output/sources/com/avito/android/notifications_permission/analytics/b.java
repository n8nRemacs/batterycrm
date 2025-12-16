package com.avito.android.notifications_permission.analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35793f6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationPermissionInfoAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission/analytics/b;", "", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C35793f6 f207831a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f207832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f207833c = C42727D.c(new a());

    /* compiled from: NotificationPermissionInfoAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return b.this.f207831a.a();
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k C35793f6 c35793f6) {
        this.f207831a = c35793f6;
        this.f207832b = interfaceC28373a;
    }
}
