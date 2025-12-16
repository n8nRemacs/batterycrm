package com.avito.android.navigation_config.manager;

import a30.InterfaceC19674b;
import com.avito.android.account.E;
import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationConfigManagerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation_config/manager/d;", "Ldagger/internal/h;", "Lcom/avito/android/navigation_config/manager/b;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f207233e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation_config.service.f f207234a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f207235b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f207236c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f207237d;

    /* compiled from: NavigationConfigManagerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation_config/manager/d$a;", "", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k com.avito.android.navigation_config.service.f fVar, @Y61.k u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f207234a = fVar;
        this.f207235b = uVar;
        this.f207236c = provider;
        this.f207237d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.navigation_config.service.b bVar = (com.avito.android.navigation_config.service.b) this.f207234a.get();
        InterfaceC19674b interfaceC19674b = (InterfaceC19674b) this.f207235b.get();
        E e12 = this.f207236c.get();
        R0 r02 = this.f207237d.get();
        f207233e.getClass();
        return new b(bVar, interfaceC19674b, e12, r02);
    }
}
