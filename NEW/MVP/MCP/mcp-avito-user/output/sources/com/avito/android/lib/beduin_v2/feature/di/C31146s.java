package com.avito.android.lib.beduin_v2.feature.di;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.Z1;

/* compiled from: BeduinCommonInteractionsModule_ProvideNavigationClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/s;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/interaction/navigation/flow/p;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31146s implements dagger.internal.h<com.avito.beduin.v2.interaction.navigation.flow.p> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176141c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Z1<com.avito.beduin.v2.interaction.navigation.flow.t>> f176142a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176143b;

    /* compiled from: BeduinCommonInteractionsModule_ProvideNavigationClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/s$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.s$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31146s(@Y61.k C31117d c31117d, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f176142a = provider;
        this.f176143b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Z1<com.avito.beduin.v2.interaction.navigation.flow.t> z12 = this.f176142a.get();
        com.avito.beduin.v2.utils.navigate.a aVar = (com.avito.beduin.v2.utils.navigate.a) this.f176143b.get();
        f176141c.getClass();
        return new com.avito.beduin.v2.utils.navigate.b(z12, aVar, C31115c.f176082l);
    }
}
