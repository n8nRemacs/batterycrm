package com.avito.android.clientEventBus.repository.clientEventBus;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import h31.e;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClientEventBusRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/repository/clientEventBus/c;", "Ldagger/internal/h;", "Lcom/avito/android/clientEventBus/repository/clientEventBus/b;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f118556c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f118557a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f118558b;

    /* compiled from: ClientEventBusRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/repository/clientEventBus/c$a;", "", "<init>", "()V", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k u uVar, @k Provider provider) {
        this.f118557a = uVar;
        this.f118558b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVarA = g.a(w.a(this.f118557a));
        InterfaceC35745a5 interfaceC35745a5 = this.f118558b.get();
        f118556c.getClass();
        return new b(interfaceC35745a5, eVarA);
    }
}
