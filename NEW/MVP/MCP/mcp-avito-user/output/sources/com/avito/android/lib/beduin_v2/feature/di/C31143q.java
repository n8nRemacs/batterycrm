package com.avito.android.lib.beduin_v2.feature.di;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCommonInteractionsModule_ProvideLaunchInteractionFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/q;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/j;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31143q implements dagger.internal.h<com.avito.beduin.v2.handler.flow.j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176130b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176131a;

    /* compiled from: BeduinCommonInteractionsModule_ProvideLaunchInteractionFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/q$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.q$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31143q(@Y61.k C31117d c31117d, @Y61.k dagger.internal.u uVar) {
        this.f176131a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.interaction.launch.flow.a aVar = (com.avito.beduin.v2.interaction.launch.flow.a) this.f176131a.get();
        f176130b.getClass();
        return new com.avito.beduin.v2.interaction.launch.flow.h(aVar);
    }
}
