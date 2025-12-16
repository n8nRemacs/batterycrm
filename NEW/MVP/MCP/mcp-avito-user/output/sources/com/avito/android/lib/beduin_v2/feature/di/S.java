package com.avito.android.lib.beduin_v2.feature.di;

import cU0.C27105c;
import cU0.InterfaceC27108f;
import com.avito.beduin.v2.engine.H;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideBeduinContextFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/S;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/engine/k;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class S implements dagger.internal.h<InterfaceC36274k> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f176050i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176051a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176052b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.engine.component.o> f176053c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<C27105c> f176054d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<dU0.g> f176055e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<aU0.b> f176056f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176057g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<YT0.a> f176058h;

    /* compiled from: BeduinFeatureModule_ProvideBeduinContextFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/S$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public S(@Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.l lVar2, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k Provider provider5) {
        this.f176051a = lVar;
        this.f176052b = lVar2;
        this.f176053c = provider;
        this.f176054d = provider2;
        this.f176055e = provider3;
        this.f176056f = provider4;
        this.f176057g = uVar;
        this.f176058h = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.engine.component.z zVar = (com.avito.beduin.v2.engine.component.z) this.f176051a.f393949a;
        InterfaceC27108f interfaceC27108f = (InterfaceC27108f) this.f176052b.f393949a;
        com.avito.beduin.v2.engine.component.o oVar = this.f176053c.get();
        C27105c c27105c = this.f176054d.get();
        dU0.g gVar = this.f176055e.get();
        aU0.b bVar = this.f176056f.get();
        H.a aVar = (H.a) this.f176057g.get();
        YT0.a aVar2 = this.f176058h.get();
        f176050i.getClass();
        L.f176033a.getClass();
        return new com.avito.beduin.v2.engine.x(zVar, interfaceC27108f, oVar, c27105c, gVar, bVar, aVar2, aVar);
    }
}
