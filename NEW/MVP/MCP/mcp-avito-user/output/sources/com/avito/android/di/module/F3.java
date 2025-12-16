package com.avito.android.di.module;

import com.avito.android.remote.parse.adapter.stream_gson.TypedResultTypeAdapterFactory;
import com.avito.android.util.C35873q0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreOptimalJsonModule_ProvideTypedResultTypeAdapterFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/F3;", "Ldagger/internal/h;", "Lcom/avito/android/remote/parse/adapter/stream_gson/TypedResultTypeAdapterFactory;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class F3 implements dagger.internal.h<TypedResultTypeAdapterFactory> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f143952b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f143953a;

    /* compiled from: CoreOptimalJsonModule_ProvideTypedResultTypeAdapterFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/F3$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public F3(@Y61.k dagger.internal.A a12) {
        this.f143953a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set<C35873q0> set = (Set) this.f143953a.get();
        f143952b.getClass();
        C30200u3 c30200u3 = C30200u3.f144612a;
        TypedResultTypeAdapterFactory typedResultTypeAdapterFactory = new TypedResultTypeAdapterFactory();
        for (C35873q0 c35873q0 : set) {
            typedResultTypeAdapterFactory.f254305b.put(c35873q0.f318977a, c35873q0.f318978b);
        }
        return typedResultTypeAdapterFactory;
    }
}
