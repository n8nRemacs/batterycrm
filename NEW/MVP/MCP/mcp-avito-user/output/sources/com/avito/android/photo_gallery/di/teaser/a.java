package com.avito.android.photo_gallery.di.teaser;

import com.avito.android.photo_gallery.di.teaser.b;
import com.avito.android.photo_gallery.teaser.GalleryTeaserFragment;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerGalleryTeaserComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerGalleryTeaserComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.photo_gallery.di.teaser.b.a
        public final com.avito.android.photo_gallery.di.teaser.b a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerGalleryTeaserComponent.java */
    public static final class c implements com.avito.android.photo_gallery.di.teaser.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f217069a;

        public c(cv.b bVar, C6501a c6501a) {
            this.f217069a = bVar;
        }

        @Override // com.avito.android.photo_gallery.di.teaser.b
        public final void a(GalleryTeaserFragment galleryTeaserFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f217069a.u4();
            t.c(aVarU4);
            galleryTeaserFragment.f217662o0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
