package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.beduin.v2.engine.C36271h;
import com.avito.beduin.v2.engine.InterfaceC36270g;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideCoreFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/Z;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/engine/g;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Z implements dagger.internal.h<InterfaceC36270g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176072b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30276e0 f176073a;

    /* compiled from: BeduinFeatureModule_ProvideCoreFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/Z$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Z(@Y61.k C30276e0 c30276e0) {
        this.f176073a = c30276e0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29270c0 c29270c0 = (C29270c0) this.f176073a.get();
        f176072b.getClass();
        L.f176033a.getClass();
        return new C36271h(c29270c0.v().invoke().booleanValue());
    }
}
