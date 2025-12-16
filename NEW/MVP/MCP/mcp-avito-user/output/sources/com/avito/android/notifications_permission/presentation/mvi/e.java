package com.avito.android.notifications_permission.presentation.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionInfoActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/e;", "Ldagger/internal/h;", "Lcom/avito/android/notifications_permission/presentation/mvi/d;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f207872d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P30.c f207873a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N30.c f207874b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notifications_permission.analytics.c f207875c;

    /* compiled from: NotificationPermissionInfoActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/e$a;", "", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k P30.c cVar, @Y61.k N30.c cVar2, @Y61.k com.avito.android.notifications_permission.analytics.c cVar3) {
        this.f207873a = cVar;
        this.f207874b = cVar2;
        this.f207875c = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P30.a aVar = (P30.a) this.f207873a.get();
        N30.a aVar2 = (N30.a) this.f207874b.get();
        com.avito.android.notifications_permission.analytics.b bVar = (com.avito.android.notifications_permission.analytics.b) this.f207875c.get();
        f207872d.getClass();
        return new d(aVar, aVar2, bVar);
    }
}
