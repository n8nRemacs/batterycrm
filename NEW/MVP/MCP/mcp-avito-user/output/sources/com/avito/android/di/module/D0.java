package com.avito.android.di.module;

import com.avito.android.remote.interceptor.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiModule_ProvideDefineResponseBodyHeadersInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/D0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/E;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class D0 implements dagger.internal.h<com.avito.android.remote.interceptor.E> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f143879c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.G f143880a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.K1 f143881b;

    /* compiled from: ApiModule_ProvideDefineResponseBodyHeadersInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/D0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public D0(@Y61.k B0 b02, @Y61.k com.avito.android.remote.interceptor.G g12, @Y61.k com.avito.android.K1 k12) {
        this.f143880a = g12;
        this.f143881b = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object f12;
        com.avito.android.I1 i12 = (com.avito.android.I1) this.f143881b.get();
        f143879c.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.I1.f67278k0[52];
        if (((Boolean) i12.f67304Z.a().invoke()).booleanValue()) {
            this.f143880a.getClass();
            f12 = new com.avito.android.remote.interceptor.F();
        } else {
            f12 = E.a.f253487b;
        }
        dagger.internal.t.b(f12, "Cannot return null from a non-@Nullable @Provides method");
        return f12;
    }
}
