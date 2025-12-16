package com.avito.android.lib.beduin_v2.feature.di;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureProviderModule_ErrorTrackerFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/q0;", "Ldagger/internal/h;", "LaU0/b;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/BeduinErrorTracker;", "a", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.q0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31144q0 implements dagger.internal.h<aU0.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176132b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31138n0 f176133a;

    /* compiled from: BeduinFeatureProviderModule_ErrorTrackerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/q0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.q0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31144q0(@Y61.k C31138n0 c31138n0) {
        this.f176133a = c31138n0;
    }

    @X41.n
    @Y61.k
    public static final C31144q0 a(@Y61.k C31138n0 c31138n0) {
        f176132b.getClass();
        return new C31144q0(c31138n0);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f176132b.getClass();
        aU0.b bVarB = this.f176133a.f176125a.b();
        dagger.internal.t.b(bVarB, "Cannot return null from a non-@Nullable @Provides method");
        return bVarB;
    }
}
