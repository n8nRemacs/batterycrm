package com.avito.android.lib.beduin_v2.feature.di;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCommonInteractionsModule_ProvideSendV1ActionsToFormInteractionHandlerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/w;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/j;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31154w implements dagger.internal.h<com.avito.beduin.v2.handler.flow.j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176159c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176160a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<PU0.b> f176161b;

    /* compiled from: BeduinCommonInteractionsModule_ProvideSendV1ActionsToFormInteractionHandlerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/w$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.w$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31154w(@Y61.k C31117d c31117d, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f176160a = uVar;
        this.f176161b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.interaction.send_v1_action.a aVar = (com.avito.beduin.v2.interaction.send_v1_action.a) this.f176160a.get();
        PU0.b bVar = this.f176161b.get();
        f176159c.getClass();
        return new com.avito.beduin.v2.interaction.send_v1_action.d(aVar, bVar);
    }
}
