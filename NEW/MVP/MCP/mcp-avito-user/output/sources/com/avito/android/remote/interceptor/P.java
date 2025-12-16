package com.avito.android.remote.interceptor;

import f90.InterfaceC40255d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FingerprintHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/P;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/N;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class P implements dagger.internal.h<N> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253502b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f90.s f253503a;

    /* compiled from: FingerprintHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/P$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public P(@Y61.k f90.s sVar) {
        this.f253503a = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40255d interfaceC40255d = (InterfaceC40255d) this.f253503a.get();
        f253502b.getClass();
        return new N(interfaceC40255d);
    }
}
