package com.avito.android.notification;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationSettingsTrackerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification/u;", "Ldagger/internal/h;", "Lcom/avito/android/notification/t;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f207480c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f207481a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f207482b;

    /* compiled from: NotificationSettingsTrackerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification/u$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public u(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.f fVar2) {
        this.f207481a = fVar;
        this.f207482b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f207481a.get();
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f207482b));
        f207480c.getClass();
        return new t(interfaceC28373a, eVarA);
    }
}
