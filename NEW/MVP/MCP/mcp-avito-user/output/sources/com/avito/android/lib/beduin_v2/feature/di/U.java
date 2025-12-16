package com.avito.android.lib.beduin_v2.feature.di;

import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideBeduinErrorTrackersFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002¢\u0006\u0002\b\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/U;", "Ldagger/internal/h;", "", "LaU0/b;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/BeduinErrorTracker;", "LX41/o;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class U implements dagger.internal.h<Set<aU0.b>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176064c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<aU0.b> f176065a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f176066b;

    /* compiled from: BeduinFeatureModule_ProvideBeduinErrorTrackersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/U$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public U(@Y61.k dagger.internal.A a12, @Y61.k Provider provider) {
        this.f176065a = provider;
        this.f176066b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        aU0.b bVar = this.f176065a.get();
        Set set = (Set) this.f176066b.get();
        f176064c.getClass();
        L.f176033a.getClass();
        return b1.h(Collections.singleton(bVar), set);
    }
}
