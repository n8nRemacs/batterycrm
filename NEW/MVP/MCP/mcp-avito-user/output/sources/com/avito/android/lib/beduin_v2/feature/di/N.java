package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.beduin.v2.handler.flow.f;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pU0.C47004a;

/* compiled from: BeduinFeatureModule_InteractionHandlersRegistryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/N;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/f;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class N implements dagger.internal.h<com.avito.beduin.v2.handler.flow.f> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176035c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f176036a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f176037b;

    /* compiled from: BeduinFeatureModule_InteractionHandlersRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/N$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public N(@Y61.k dagger.internal.A a12, @Y61.k dagger.internal.A a13) {
        this.f176036a = a12;
        this.f176037b = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f176036a.get();
        Set set2 = (Set) this.f176037b.get();
        f176035c.getClass();
        L.f176033a.getClass();
        C47004a.f428547a.getClass();
        f.a aVar = new f.a();
        aVar.a(com.avito.beduin.v2.interaction.mutate.flow.o.f337494c);
        aVar.a(MU0.c.f10694c);
        aVar.a(com.avito.beduin.v2.interaction.delay.flow.d.f337285c);
        aVar.a(com.avito.beduin.v2.interaction.delegate.flow.d.f337294c);
        aVar.a(com.avito.beduin.v2.interaction.mutate.flow.l.f337489c);
        aVar.a(com.avito.beduin.v2.interaction.mutate.flow.d.f337476c);
        aVar.a(com.avito.beduin.v2.interaction.mutate.flow.f.f337479c);
        aVar.a(com.avito.beduin.v2.interaction.sequence.flow.e.f337856c);
        aVar.a(LU0.c.f9968c);
        aVar.a(com.avito.beduin.v2.interaction.exception.flow.c.f337395b);
        aVar.a(HU0.c.f7099c);
        aVar.a(com.avito.beduin.v2.interaction.network.flow.o.f337689c);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((com.avito.beduin.v2.handler.flow.j) it.next());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            aVar.a((com.avito.beduin.v2.handler.flow.j) it2.next());
        }
        return new com.avito.beduin.v2.handler.flow.f(kotlin.collections.P0.q(aVar.f337163a), null);
    }
}
