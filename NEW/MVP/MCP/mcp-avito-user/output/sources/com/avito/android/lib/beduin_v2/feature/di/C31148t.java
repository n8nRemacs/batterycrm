package com.avito.android.lib.beduin_v2.feature.di;

import android.app.Application;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCommonInteractionsModule_ProvideNetworkInteractionFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/t;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/j;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31148t implements dagger.internal.h<com.avito.beduin.v2.handler.flow.j> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f176146e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<SU0.g> f176148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<PU0.b> f176149c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.feature.tracker.j f176150d;

    /* compiled from: BeduinCommonInteractionsModule_ProvideNetworkInteractionFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/t$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.t$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31148t(@Y61.k C31117d c31117d, @Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k com.avito.android.lib.beduin_v2.feature.tracker.j jVar) {
        this.f176147a = lVar;
        this.f176148b = provider;
        this.f176149c = provider2;
        this.f176150d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f176147a.f393949a;
        SU0.g gVar = this.f176148b.get();
        PU0.b bVar = this.f176149c.get();
        SU0.k kVar = (SU0.k) this.f176150d.get();
        f176146e.getClass();
        CU0.b bVar2 = new CU0.b(bVar);
        com.avito.beduin.v2.interaction.network.parser.serializer.c cVar = new com.avito.beduin.v2.interaction.network.parser.serializer.c(bVar);
        cVar.e(new JV0.a(application));
        return new com.avito.beduin.v2.interaction.network.flow.h(gVar, bVar2, cVar, kVar, SU0.a.f14997a);
    }
}
