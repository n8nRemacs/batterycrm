package com.avito.android.retrofit;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallAdapterFactoryRx_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/k;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/i;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34419k implements dagger.internal.h<C34417i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f255143b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f255144a;

    /* compiled from: CallAdapterFactoryRx_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/k$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.k$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34419k(@Y61.k Provider<InterfaceC35745a5> provider) {
        this.f255144a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f255144a.get();
        f255143b.getClass();
        return new C34417i(interfaceC35745a5);
    }
}
