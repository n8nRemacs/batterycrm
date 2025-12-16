package com.avito.android.navigation_config.manager;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.n;

/* compiled from: NavigationConfigManagerModule_ProvideNavigationConfigManagerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation_config/manager/f;", "Ldagger/internal/h;", "Lcom/avito/android/navigation_config/manager/a;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<com.avito.android.navigation_config.manager.a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f207238d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final W20.c f207239a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f207240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f207241c;

    /* compiled from: NavigationConfigManagerModule_ProvideNavigationConfigManagerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation_config/manager/f$a;", "", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k e eVar, @Y61.k W20.c cVar, @Y61.k u uVar, @Y61.k h hVar) {
        this.f207239a = cVar;
        this.f207240b = uVar;
        this.f207241c = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        W20.a aVar = (W20.a) this.f207239a.get();
        u uVar = this.f207240b;
        f207238d.getClass();
        n<Object> nVar = W20.a.f17716j[0];
        if (((Boolean) aVar.f17717b.a().invoke()).booleanValue()) {
            return (com.avito.android.navigation_config.manager.a) uVar.get();
        }
        this.f207241c.getClass();
        return new g();
    }
}
