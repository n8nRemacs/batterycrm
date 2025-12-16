package com.avito.android.position_in_search.storage.provider;

import AK0.l;
import com.avito.android.position_in_search.storage.h;
import com.avito.android.position_in_search.storage.provider.b;
import com.avito.android.position_in_search.storage.provider.c;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSearchPositionStorageComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSearchPositionStorageComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.position_in_search.storage.provider.c.b
        public final com.avito.android.position_in_search.storage.provider.c a(c.a aVar) {
            return new c(aVar, null);
        }
    }

    /* compiled from: DaggerSearchPositionStorageComponent.java */
    public static final class c implements com.avito.android.position_in_search.storage.provider.b {

        /* renamed from: a, reason: collision with root package name */
        public final c.a f221779a;

        /* renamed from: b, reason: collision with root package name */
        public final u<l> f221780b;

        /* compiled from: DaggerSearchPositionStorageComponent.java */
        /* renamed from: com.avito.android.position_in_search.storage.provider.a$c$a, reason: collision with other inner class name */
        public static final class C6709a implements u<l> {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f221781a;

            public C6709a(c.a aVar) {
                this.f221781a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f221781a.r();
            }
        }

        public c(c.a aVar, C6708a c6708a) {
            this.f221779a = aVar;
            this.f221780b = new C6709a(aVar);
        }

        @Override // com.avito.android.position_in_search.storage.provider.c
        public final com.avito.android.position_in_search.storage.a a() {
            h31.e eVarA = g.a(this.f221780b);
            R0 r0C = this.f221779a.c();
            t.c(r0C);
            return new com.avito.android.position_in_search.storage.a(r0C, eVarA);
        }

        @Override // com.avito.android.position_in_search.storage.provider.c
        public final h b() {
            h31.e eVarA = g.a(this.f221780b);
            R0 r0C = this.f221779a.c();
            t.c(r0C);
            return new h(r0C, eVarA);
        }

        @Override // com.avito.android.position_in_search.storage.provider.c
        public final com.avito.android.position_in_search.storage.e c() {
            h31.e eVarA = g.a(this.f221780b);
            R0 r0C = this.f221779a.c();
            t.c(r0C);
            return new com.avito.android.position_in_search.storage.e(r0C, eVarA);
        }
    }
}
