package com.avito.android.notifications_permission.presentation.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionInfoFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/j;", "Ldagger/internal/h;", "Lcom/avito/android/notifications_permission/presentation/mvi/i;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f207887d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f207888a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f207889b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f207890c;

    /* compiled from: NotificationPermissionInfoFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/j$a;", "", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k g gVar, @Y61.k e eVar, @Y61.k l lVar) {
        this.f207888a = gVar;
        this.f207889b = eVar;
        this.f207890c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f207888a.get();
        d dVar = (d) this.f207889b.get();
        this.f207890c.getClass();
        k kVar = new k();
        f207887d.getClass();
        return new i("NotificationPermissionInfo", Q30.c.f13448a, new h(fVar, dVar, kVar));
    }
}
