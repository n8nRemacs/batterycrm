package com.avito.android.auth_tracker.tracker;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.auth_tracker.tracker.a;
import com.avito.android.remote.InterfaceC34264g;
import dagger.internal.t;

/* compiled from: DaggerAuthTrackerComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class o {

    /* compiled from: DaggerAuthTrackerComponent.java */
    public static final class b implements com.avito.android.auth_tracker.tracker.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.auth_tracker.tracker.b f92661a;

        public b(com.avito.android.auth_tracker.tracker.b bVar, a aVar) {
            this.f92661a = bVar;
        }

        @Override // com.avito.android.auth_tracker.tracker.a
        public final m a() {
            com.avito.android.auth_tracker.tracker.b bVar = this.f92661a;
            InterfaceC34264g interfaceC34264gPk = bVar.pk();
            t.c(interfaceC34264gPk);
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            return new m(new j(interfaceC34264gPk, interfaceC28373aA));
        }
    }

    /* compiled from: DaggerAuthTrackerComponent.java */
    public static final class c implements a.InterfaceC2739a {
        public c() {
        }

        @Override // com.avito.android.auth_tracker.tracker.a.InterfaceC2739a
        public final com.avito.android.auth_tracker.tracker.a a(com.avito.android.auth_tracker.tracker.b bVar) {
            return new b(bVar, null);
        }
    }

    public static a.InterfaceC2739a a() {
        return new c();
    }
}
