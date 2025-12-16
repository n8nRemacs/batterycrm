package com.avito.android.lib.beduin_v2.feature.di;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCommonInteractionsModule_ProvideCopyInteractionFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/k;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/j;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31131k implements dagger.internal.h<com.avito.beduin.v2.handler.flow.j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176117b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176118a;

    /* compiled from: BeduinCommonInteractionsModule_ProvideCopyInteractionFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/k$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.k$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31131k(@Y61.k C31117d c31117d, @Y61.k dagger.internal.l lVar) {
        this.f176118a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f176118a.f393949a;
        f176117b.getClass();
        return new com.avito.beduin.v2.interaction.copy.flow.e(new IV0.a(application));
    }
}
