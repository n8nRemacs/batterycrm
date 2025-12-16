package com.avito.android.location;

import com.avito.android.I1;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nW.InterfaceC44343a;

/* compiled from: SavedLocationInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/A;", "Ldagger/internal/h;", "Lcom/avito/android/location/u;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements dagger.internal.h<u> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f181698e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f181699a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.geo_common.interactor.B> f181700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f181701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC44343a> f181702d;

    /* compiled from: SavedLocationInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/A$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A(@Y61.k dagger.internal.u uVar, @Y61.k dagger.internal.u uVar2, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f181699a = uVar;
        this.f181700b = provider;
        this.f181701c = uVar2;
        this.f181702d = provider2;
    }

    @X41.n
    @Y61.k
    public static final A a(@Y61.k dagger.internal.u uVar, @Y61.k dagger.internal.u uVar2, @Y61.k Provider provider, @Y61.k Provider provider2) {
        f181698e.getClass();
        return new A(uVar, uVar2, provider, provider2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f181699a.get();
        com.avito.android.geo_common.interactor.B b12 = this.f181700b.get();
        I1 i12 = (I1) this.f181701c.get();
        InterfaceC44343a interfaceC44343a = this.f181702d.get();
        f181698e.getClass();
        return new u(h12, b12, i12, interfaceC44343a);
    }
}
