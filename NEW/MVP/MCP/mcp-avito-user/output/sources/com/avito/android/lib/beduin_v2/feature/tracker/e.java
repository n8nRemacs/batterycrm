package com.avito.android.lib.beduin_v2.feature.tracker;

import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureAnalyticsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/e;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/d;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176375c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f176376a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30276e0 f176377b;

    /* compiled from: BeduinFeatureAnalyticsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/e$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k dagger.internal.f fVar, @Y61.k C30276e0 c30276e0) {
        this.f176376a = fVar;
        this.f176377b = c30276e0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f176376a.get();
        C29270c0 c29270c0 = (C29270c0) this.f176377b.get();
        f176375c.getClass();
        return new d(interfaceC28373a, c29270c0);
    }
}
