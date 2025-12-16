package com.avito.android.geo.di;

import com.avito.android.geo.GeoService;
import com.avito.android.geo.d;
import com.avito.android.geo.di.b;
import com.avito.android.geo.j;
import com.avito.android.server_time.h;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerGeoComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGeoComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.geo.di.c f159304a;

        public b() {
        }

        @Override // com.avito.android.geo.di.b.a
        public final b.a a(com.avito.android.geo.di.c cVar) {
            this.f159304a = cVar;
            return this;
        }

        @Override // com.avito.android.geo.di.b.a
        public final com.avito.android.geo.di.b build() {
            t.a(com.avito.android.geo.di.c.class, this.f159304a);
            return new c(this.f159304a, null);
        }
    }

    /* compiled from: DaggerGeoComponent.java */
    public static final class c implements com.avito.android.geo.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.geo.di.c f159305a;

        public c(com.avito.android.geo.di.c cVar, C4657a c4657a) {
            this.f159305a = cVar;
        }

        @Override // com.avito.android.geo.di.b
        public final void a(GeoService geoService) {
            com.avito.android.geo.di.c cVar = this.f159305a;
            h hVarY = cVar.y();
            t.c(hVarY);
            j jVarC0 = cVar.c0();
            t.c(jVarC0);
            geoService.f159282d = new d(hVarY, jVarC0);
            R0 r0I0 = cVar.i0();
            t.c(r0I0);
            geoService.f159283e = r0I0;
        }
    }

    public static b.a a() {
        return new b();
    }
}
