package com.avito.android.lib.beduin_v2.feature.di;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureProviderModule_MetaComponentsStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/r0;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/engine/component/B;", "a", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.r0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31145r0 implements dagger.internal.h<com.avito.beduin.v2.engine.component.B> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176139b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31138n0 f176140a;

    /* compiled from: BeduinFeatureProviderModule_MetaComponentsStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/r0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.r0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31145r0(@Y61.k C31138n0 c31138n0) {
        this.f176140a = c31138n0;
    }

    @X41.n
    @Y61.k
    public static final C31145r0 a(@Y61.k C31138n0 c31138n0) {
        f176139b.getClass();
        return new C31145r0(c31138n0);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f176139b.getClass();
        com.avito.beduin.v2.engine.component.B bE2 = this.f176140a.f176125a.e();
        dagger.internal.t.b(bE2, "Cannot return null from a non-@Nullable @Provides method");
        return bE2;
    }
}
