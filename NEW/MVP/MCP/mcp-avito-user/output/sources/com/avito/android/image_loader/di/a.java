package com.avito.android.image_loader.di;

import com.avito.android.image_loader.di.b;
import com.avito.android.image_loader.di.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerImageLoaderComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerImageLoaderComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.image_loader.di.c f169518a;

        public b() {
        }

        @Override // com.avito.android.image_loader.di.b.a
        public final b.a a(com.avito.android.image_loader.di.c cVar) {
            this.f169518a = cVar;
            return this;
        }

        @Override // com.avito.android.image_loader.di.b.a
        @Deprecated
        public final b.a b(d dVar) {
            dVar.getClass();
            return this;
        }

        @Override // com.avito.android.image_loader.di.b.a
        public final com.avito.android.image_loader.di.b build() {
            t.a(com.avito.android.image_loader.di.c.class, this.f169518a);
            return new c(this.f169518a, null);
        }
    }

    /* compiled from: DaggerImageLoaderComponent.java */
    public static final class c implements com.avito.android.image_loader.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.image_loader.d> f169519a = g.d(e.a.f169521a);

        public c(com.avito.android.image_loader.di.c cVar, C5014a c5014a) {
        }

        @Override // com.avito.android.image_loader.di.b
        public final void a(com.avito.android.image_loader.e eVar) {
            eVar.f169522a = this.f169519a.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
