package com.avito.android.beduin.v2.benchmark.impl.deeplinks;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2BenchmarkPageDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/deeplinks/c;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/benchmark/impl/deeplinks/b;", "a", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f104624c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f104625a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<C> f104626b;

    /* compiled from: BeduinV2BenchmarkPageDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/deeplinks/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k dv.b bVar, @k Provider provider) {
        this.f104625a = bVar;
        this.f104626b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f104625a.get();
        C c12 = this.f104626b.get();
        f104624c.getClass();
        return new b(interfaceC4053a, c12);
    }
}
