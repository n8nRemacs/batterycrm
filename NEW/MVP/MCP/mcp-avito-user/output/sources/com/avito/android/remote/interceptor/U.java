package com.avito.android.remote.interceptor;

import f90.InterfaceC40255d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FingerprintTokenHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/U;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/T;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253510b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f90.s f253511a;

    /* compiled from: FingerprintTokenHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/U$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public U(@Y61.k f90.s sVar) {
        this.f253511a = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40255d interfaceC40255d = (InterfaceC40255d) this.f253511a.get();
        f253510b.getClass();
        return new T(interfaceC40255d);
    }
}
