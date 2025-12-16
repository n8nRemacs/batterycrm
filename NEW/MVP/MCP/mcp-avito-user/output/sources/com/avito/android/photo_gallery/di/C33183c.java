package com.avito.android.photo_gallery.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_gallery.PhotoGalleryActivity;
import com.avito.android.photo_gallery.di.B;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;

/* compiled from: DaggerPhotoGalleryApplicationComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.photo_gallery.di.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33183c {

    /* compiled from: DaggerPhotoGalleryApplicationComponent.java */
    /* renamed from: com.avito.android.photo_gallery.di.c$b */
    public static final class b implements B.a {

        /* renamed from: a, reason: collision with root package name */
        public C f217014a;

        public b() {
        }

        @Override // com.avito.android.photo_gallery.di.B.a
        public final B.a b(C c12) {
            this.f217014a = c12;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.B.a
        public final B build() {
            dagger.internal.t.a(C.class, this.f217014a);
            return new C6499c(this.f217014a, null);
        }
    }

    /* compiled from: DaggerPhotoGalleryApplicationComponent.java */
    /* renamed from: com.avito.android.photo_gallery.di.c$c, reason: collision with other inner class name */
    public static final class C6499c implements B {

        /* renamed from: a, reason: collision with root package name */
        public final C f217015a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<SharedPhotosStorage> f217016b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<R0> f217017c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.u> f217018d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f217019e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.photo_download.feature.mvi.k f217020f;

        /* compiled from: DaggerPhotoGalleryApplicationComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.c$c$a */
        public static final class a implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217021a;

            public a(C c12) {
                this.f217021a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f217021a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerPhotoGalleryApplicationComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.c$c$b */
        public static final class b implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217022a;

            public b(C c12) {
                this.f217022a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f217022a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPhotoGalleryApplicationComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.c$c$c, reason: collision with other inner class name */
        public static final class C6500c implements dagger.internal.u<com.avito.android.permissions.u> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217023a;

            public C6500c(C c12) {
                this.f217023a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217023a.V();
            }
        }

        /* compiled from: DaggerPhotoGalleryApplicationComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.c$c$d */
        public static final class d implements dagger.internal.u<SharedPhotosStorage> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217024a;

            public d(C c12) {
                this.f217024a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217024a.b2();
            }
        }

        public C6499c(C c12, a aVar) {
            this.f217015a = c12;
            d dVar = new d(c12);
            b bVar = new b(c12);
            com.avito.android.photo_download.c cVar = com.avito.android.photo_download.c.f216431a;
            com.avito.android.photo_download.f.f216440d.getClass();
            com.avito.android.photo_download.f fVar = new com.avito.android.photo_download.f(dVar, cVar, bVar);
            C6500c c6500c = new C6500c(c12);
            a aVar2 = new a(c12);
            com.avito.android.photo_download.feature.mvi.d.f216453d.getClass();
            com.avito.android.photo_download.feature.mvi.d dVar2 = new com.avito.android.photo_download.feature.mvi.d(fVar, c6500c, aVar2);
            com.avito.android.photo_download.feature.mvi.i iVar = com.avito.android.photo_download.feature.mvi.i.f216462a;
            com.avito.android.photo_download.feature.mvi.g.f216459c.getClass();
            com.avito.android.photo_download.feature.mvi.g gVar = new com.avito.android.photo_download.feature.mvi.g(dVar2, iVar);
            com.avito.android.photo_download.feature.mvi.k.f216463b.getClass();
            this.f217020f = new com.avito.android.photo_download.feature.mvi.k(gVar);
        }

        @Override // com.avito.android.photo_gallery.di.B
        public final void a(PhotoGalleryActivity photoGalleryActivity) {
            C c12 = this.f217015a;
            photoGalleryActivity.f216652o = c12.h();
            photoGalleryActivity.f216653p = c12.s4();
            photoGalleryActivity.f216654q = c12.Nj();
            photoGalleryActivity.f216655r = c12.V();
            photoGalleryActivity.f216656s = this.f217020f;
            InterfaceC28373a interfaceC28373aA = c12.a();
            dagger.internal.t.c(interfaceC28373aA);
            photoGalleryActivity.f216658u = interfaceC28373aA;
        }
    }

    public static B.a a() {
        return new b();
    }
}
