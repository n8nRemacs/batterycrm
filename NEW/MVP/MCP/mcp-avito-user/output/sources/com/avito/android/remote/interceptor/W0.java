package com.avito.android.remote.interceptor;

import com.avito.android.remote.t1;
import com.avito.android.util.C35833k6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAgentHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/W0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/V0;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class W0 implements dagger.internal.h<V0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253514b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C35833k6 f253515a;

    /* compiled from: UserAgentHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/W0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public W0(@Y61.k C35833k6 c35833k6) {
        this.f253515a = c35833k6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t1 t1Var = (t1) this.f253515a.get();
        f253514b.getClass();
        return new V0(t1Var);
    }
}
