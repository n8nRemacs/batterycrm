package com.avito.android.analytics.statsd;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendStatsdEventsTaskDelegateImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/j;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/statsd/i;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.statsd.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28518j implements dagger.internal.h<C28517i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f91056b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91057a;

    /* compiled from: SendStatsdEventsTaskDelegateImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/j$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.statsd.j$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C28518j(@Y61.k dagger.internal.u uVar) {
        this.f91057a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J j12 = (J) this.f91057a.get();
        f91056b.getClass();
        return new C28517i(j12);
    }
}
