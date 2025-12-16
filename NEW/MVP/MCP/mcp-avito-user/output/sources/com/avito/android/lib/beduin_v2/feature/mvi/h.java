package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import gT.C40620a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/h;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/g;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f176293i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.avito.parser.b> f176294a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f176295b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.handler.flow.processor.b> f176296c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.interaction.navigation_controller.c> f176297d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC36238a> f176298e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.lib.beduin_v2.feature.tracker.c> f176299f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<C40620a> f176300g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.feature.cache.d f176301h;

    /* compiled from: BeduinActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/h$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k Provider provider5, @Y61.k Provider provider6, @Y61.k Provider provider7, @Y61.k com.avito.android.lib.beduin_v2.feature.cache.d dVar) {
        this.f176294a = provider;
        this.f176295b = provider2;
        this.f176296c = provider3;
        this.f176297d = provider4;
        this.f176298e = provider5;
        this.f176299f = provider6;
        this.f176300g = provider7;
        this.f176301h = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.avito.parser.b bVar = this.f176294a.get();
        R0 r02 = this.f176295b.get();
        com.avito.beduin.v2.handler.flow.processor.b bVar2 = this.f176296c.get();
        com.avito.beduin.v2.interaction.navigation_controller.c cVar = this.f176297d.get();
        InterfaceC36238a interfaceC36238a = this.f176298e.get();
        com.avito.android.lib.beduin_v2.feature.tracker.c cVar2 = this.f176299f.get();
        C40620a c40620a = this.f176300g.get();
        com.avito.android.lib.beduin_v2.feature.cache.c cVar3 = (com.avito.android.lib.beduin_v2.feature.cache.c) this.f176301h.get();
        f176293i.getClass();
        return new g(bVar, r02, bVar2, cVar, interfaceC36238a, cVar2, c40620a, cVar3);
    }
}
