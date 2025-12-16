package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.beduin.v2.engine.InterfaceC36270g;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCommonInteractionsModule_BackInteractionHandlerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/e;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/j;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31119e implements dagger.internal.h<com.avito.beduin.v2.handler.flow.j> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f176088d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176089a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.interaction.navigation.flow.p> f176090b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC36270g> f176091c;

    /* compiled from: BeduinCommonInteractionsModule_BackInteractionHandlerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/e$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31119e(@Y61.k C31117d c31117d, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f176089a = uVar;
        this.f176090b = provider;
        this.f176091c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.interaction.navigation_controller.c cVar = (com.avito.beduin.v2.interaction.navigation_controller.c) this.f176089a.get();
        com.avito.beduin.v2.interaction.navigation.flow.p pVar = this.f176090b.get();
        InterfaceC36270g interfaceC36270g = this.f176091c.get();
        f176088d.getClass();
        return new com.avito.beduin.v2.interaction.navigation.flow.e(new com.avito.beduin.v2.interaction.navigation_controller.e(pVar, cVar, interfaceC36270g), interfaceC36270g);
    }
}
