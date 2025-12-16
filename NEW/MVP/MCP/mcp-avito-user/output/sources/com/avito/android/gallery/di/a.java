package com.avito.android.gallery.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.gallery.di.c;
import com.avito.android.gallery.ui.PhotoGalleryActivity;
import com.avito.android.gallery.ui.adapter.GalleryFragment;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerGalleryScreenComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGalleryScreenComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.gallery.di.c.a
        public final com.avito.android.gallery.di.c a(com.avito.android.gallery.di.b bVar) {
            return new c(bVar, null);
        }
    }

    /* compiled from: DaggerGalleryScreenComponent.java */
    public static final class c implements com.avito.android.gallery.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.gallery.di.b f159224a;

        public c(com.avito.android.gallery.di.b bVar, C4655a c4655a) {
            this.f159224a = bVar;
        }

        @Override // com.avito.android.gallery.di.c
        public final void a(PhotoGalleryActivity photoGalleryActivity) {
            InterfaceC28373a interfaceC28373aA = this.f159224a.a();
            t.c(interfaceC28373aA);
            photoGalleryActivity.f159240s = interfaceC28373aA;
        }

        @Override // com.avito.android.gallery.di.c
        public final void b(GalleryFragment galleryFragment) {
            com.avito.android.connection_quality.connectivity.a aVarU = this.f159224a.U();
            t.c(aVarU);
            galleryFragment.f159257v0 = aVarU;
        }
    }

    public static c.a a() {
        return new b();
    }
}
