package com.avito.android.notification;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WarmupNotificationManagerTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification/w;", "Ldagger/internal/h;", "Lcom/avito/android/notification/WarmupNotificationManagerTask;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<WarmupNotificationManagerTask> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f207483c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f207484a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<s> f207485b;

    /* compiled from: WarmupNotificationManagerTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification/w$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k dagger.internal.f fVar, @Y61.k Provider provider) {
        this.f207484a = fVar;
        this.f207485b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f207484a.get();
        s sVar = this.f207485b.get();
        f207483c.getClass();
        return new WarmupNotificationManagerTask(mVar, sVar);
    }
}
