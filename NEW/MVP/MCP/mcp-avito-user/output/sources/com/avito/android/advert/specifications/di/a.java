package com.avito.android.advert.specifications.di;

import com.avito.android.advert.specifications.SpecificationsFragment;
import com.avito.android.advert.specifications.di.b;
import com.avito.android.advert.specifications.f;
import com.avito.android.remote.model.ModelSpecifications;
import com.avito.android.serp.adapter.InterfaceC34736h0;
import com.avito.android.util.L0;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSpecificationsComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: DaggerSpecificationsComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.advert.specifications.di.c f80985a;

        /* renamed from: b, reason: collision with root package name */
        public ModelSpecifications f80986b;

        public b() {
        }

        @Override // com.avito.android.advert.specifications.di.b.a
        public final b.a a(ModelSpecifications modelSpecifications) {
            this.f80986b = modelSpecifications;
            return this;
        }

        @Override // com.avito.android.advert.specifications.di.b.a
        public final b.a b(com.avito.android.advert.specifications.di.c cVar) {
            this.f80985a = cVar;
            return this;
        }

        @Override // com.avito.android.advert.specifications.di.b.a
        public final com.avito.android.advert.specifications.di.b build() {
            t.a(com.avito.android.advert.specifications.di.c.class, this.f80985a);
            return new c(this.f80985a, this.f80986b, null);
        }
    }

    /* compiled from: DaggerSpecificationsComponent.java */
    public static final class c implements com.avito.android.advert.specifications.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f80987a;

        /* renamed from: b, reason: collision with root package name */
        public final u<L0> f80988b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC34736h0> f80989c;

        /* renamed from: d, reason: collision with root package name */
        public final u<U9.b> f80990d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.advert.specifications.d> f80991e;

        /* compiled from: DaggerSpecificationsComponent.java */
        /* renamed from: com.avito.android.advert.specifications.di.a$c$a, reason: collision with other inner class name */
        public static final class C2401a implements u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.specifications.di.c f80992a;

            public C2401a(com.avito.android.advert.specifications.di.c cVar) {
                this.f80992a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                L0 l0Z = this.f80992a.z();
                t.c(l0Z);
                return l0Z;
            }
        }

        public c(com.avito.android.advert.specifications.di.c cVar, ModelSpecifications modelSpecifications, C2400a c2400a) {
            this.f80987a = l.b(modelSpecifications);
            u<InterfaceC34736h0> uVarD = g.d(new e(new C2401a(cVar)));
            this.f80989c = uVarD;
            u<U9.b> uVarD2 = g.d(new U9.c(uVarD));
            this.f80990d = uVarD2;
            this.f80991e = g.d(new f(this.f80987a, uVarD2));
        }

        @Override // com.avito.android.advert.specifications.di.b
        public final void a(SpecificationsFragment specificationsFragment) {
            specificationsFragment.f80982n0 = this.f80991e.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
