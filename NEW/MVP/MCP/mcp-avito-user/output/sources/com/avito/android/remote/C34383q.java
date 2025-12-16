package com.avito.android.remote;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallAdapterFactoryResourceProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/q;", "Ldagger/internal/h;", "Lcom/avito/android/remote/o;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.q, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34383q implements dagger.internal.h<C34354o> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f254332b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f254333a;

    /* compiled from: CallAdapterFactoryResourceProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/q$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.q$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34383q(@Y61.k dagger.internal.l lVar) {
        this.f254333a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f254333a.f393949a;
        f254332b.getClass();
        return new C34354o(application);
    }
}
