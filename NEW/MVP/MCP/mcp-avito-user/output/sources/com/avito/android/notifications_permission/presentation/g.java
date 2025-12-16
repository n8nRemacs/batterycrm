package com.avito.android.notifications_permission.presentation;

import Y61.k;
import com.avito.android.notifications_permission.presentation.mvi.i;
import com.avito.android.notifications_permission.presentation.mvi.j;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionInfoViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/g;", "Ldagger/internal/h;", "Lcom/avito/android/notifications_permission/presentation/f;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements h<f> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f207857b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f207858a;

    /* compiled from: NotificationPermissionInfoViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/g$a;", "", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k j jVar) {
        this.f207858a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f207858a.get();
        f207857b.getClass();
        return new f(iVar, null, 2, null);
    }
}
