package com.avito.android.lib.beduin_v2.feature.di;

import bT.C25555c;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCommonInteractionsModule_ProvideAnalyticsInteractionFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/j;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/j;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31129j implements dagger.internal.h<com.avito.beduin.v2.handler.flow.j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176112c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C25555c f176113a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<PU0.b> f176114b;

    /* compiled from: BeduinCommonInteractionsModule_ProvideAnalyticsInteractionFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/j$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.j$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31129j(@Y61.k C31117d c31117d, @Y61.k C25555c c25555c, @Y61.k Provider provider) {
        this.f176113a = c25555c;
        this.f176114b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.interaction.analytics.flow.a aVar = (com.avito.beduin.v2.interaction.analytics.flow.a) this.f176113a.get();
        PU0.b bVar = this.f176114b.get();
        f176112c.getClass();
        return new com.avito.beduin.v2.interaction.analytics.flow.g(aVar, bVar, false, 4, null);
    }
}
