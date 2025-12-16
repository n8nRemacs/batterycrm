package com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory;

import Y61.k;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV1InMemoryRepositoryClientImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/c;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/b;", "a", "_design-modules_beduin-v2_interactions_repository_common_beduin-v1-in-memory_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f176434e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f176435a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<g> f176436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f176437c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f176438d;

    /* compiled from: BeduinV1InMemoryRepositoryClientImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_beduin-v1-in-memory_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k u uVar, @k Provider provider, @k e eVar, @k Provider provider2) {
        this.f176435a = uVar;
        this.f176436b = provider;
        this.f176437c = eVar;
        this.f176438d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f176435a.get();
        g gVar = this.f176436b.get();
        this.f176437c.getClass();
        d dVar = new d();
        R0 r02 = this.f176438d.get();
        f176434e.getClass();
        return new b(fVar, gVar, dVar, r02);
    }
}
