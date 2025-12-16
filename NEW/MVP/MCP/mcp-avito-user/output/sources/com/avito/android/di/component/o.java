package com.avito.android.di.component;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29893c;
import com.avito.android.di.component.InterfaceC29894a;
import com.avito.android.di.module.T0;

/* compiled from: DaggerAppUpdateServiceComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class o {

    /* compiled from: DaggerAppUpdateServiceComponent.java */
    public static final class b implements InterfaceC29894a {

        /* renamed from: a, reason: collision with root package name */
        public final T0 f139301a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC29893c f139302b;

        public b(T0 t02, InterfaceC29893c interfaceC29893c, a aVar) {
            this.f139301a = t02;
            this.f139302b = interfaceC29893c;
        }

        @Override // com.avito.android.di.component.InterfaceC29894a
        public final com.avito.android.service.short_task.app_update.g a() {
            InterfaceC29893c interfaceC29893c = this.f139302b;
            f90.L lQe = interfaceC29893c.qe();
            dagger.internal.t.c(lQe);
            com.avito.android.util.C cJ2 = interfaceC29893c.j();
            dagger.internal.t.c(cJ2);
            InterfaceC28373a interfaceC28373aA = interfaceC29893c.a();
            dagger.internal.t.c(interfaceC28373aA);
            com.avito.android.service.short_task.app_update.e eVar = new com.avito.android.service.short_task.app_update.e(lQe, cJ2, interfaceC28373aA, interfaceC29893c.E());
            this.f139301a.getClass();
            return new com.avito.android.service.short_task.app_update.g(eVar);
        }
    }

    /* compiled from: DaggerAppUpdateServiceComponent.java */
    public static final class c implements InterfaceC29894a.InterfaceC4201a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC29893c f139303a;

        public c() {
        }

        @Override // com.avito.android.di.component.InterfaceC29894a.InterfaceC4201a
        public final InterfaceC29894a.InterfaceC4201a a(InterfaceC29893c interfaceC29893c) {
            this.f139303a = interfaceC29893c;
            return this;
        }

        @Override // com.avito.android.di.component.InterfaceC29894a.InterfaceC4201a
        public final InterfaceC29894a build() {
            dagger.internal.t.a(InterfaceC29893c.class, this.f139303a);
            return new b(new T0(), this.f139303a, null);
        }
    }

    public static InterfaceC29894a.InterfaceC4201a a() {
        return new c();
    }
}
