package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.android.lib.beduin_v2.feature.di.K;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinLocalErrorTrackersProviderModule_ErrorTrackersFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002¢\u0006\u0002\b\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/P0;", "Ldagger/internal/h;", "", "LaU0/b;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/BeduinErrorTracker;", "LX41/o;", "a", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class P0 implements dagger.internal.h<Set<aU0.b>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176041b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N0 f176042a;

    /* compiled from: BeduinLocalErrorTrackersProviderModule_ErrorTrackersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/P0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public P0(@Y61.k N0 n02) {
        this.f176042a = n02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f176041b.getClass();
        K.b bVar = this.f176042a.f176038a;
        kotlin.collections.B0 b02 = kotlin.collections.B0.f406639b;
        dagger.internal.t.b(b02, "Cannot return null from a non-@Nullable @Provides method");
        return b02;
    }
}
