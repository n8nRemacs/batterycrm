package com.avito.android.photo_picker.gallery.di;

import android.app.Application;
import android.content.ContentResolver;
import androidx.fragment.app.Fragment;
import com.avito.android.permissions.C33033c;
import com.avito.android.permissions.x;
import com.avito.android.photo_picker.gallery.GalleryPickerFragment;
import com.avito.android.photo_picker.gallery.di.b;
import com.avito.konveyor.adapter.j;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import q80.C47258e;
import q80.InterfaceC47255b;

/* compiled from: DaggerGalleryPickerComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerGalleryPickerComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.photo_picker.gallery.di.c f219478a;

        /* renamed from: b, reason: collision with root package name */
        public GalleryPickerFragment f219479b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f219480c;

        public b() {
        }

        @Override // com.avito.android.photo_picker.gallery.di.b.a
        public final b.a a(boolean z12) {
            this.f219480c = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.photo_picker.gallery.di.b.a
        public final b.a b(GalleryPickerFragment galleryPickerFragment) {
            this.f219479b = galleryPickerFragment;
            return this;
        }

        @Override // com.avito.android.photo_picker.gallery.di.b.a
        public final com.avito.android.photo_picker.gallery.di.b build() {
            t.a(com.avito.android.photo_picker.gallery.di.c.class, this.f219478a);
            t.a(Fragment.class, this.f219479b);
            t.a(Boolean.class, this.f219480c);
            return new c(this.f219478a, this.f219479b, this.f219480c, null);
        }

        @Override // com.avito.android.photo_picker.gallery.di.b.a
        public final b.a c(com.avito.android.photo_picker.gallery.di.c cVar) {
            this.f219478a = cVar;
            return this;
        }
    }

    /* compiled from: DaggerGalleryPickerComponent.java */
    public static final class c implements com.avito.android.photo_picker.gallery.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.photo_picker.gallery.di.c f219481a;

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f219482b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f219483c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Application> f219484d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ContentResolver> f219485e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC47255b> f219486f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.gallery.gallery_list.c> f219487g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f219488h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f219489i;

        /* renamed from: j, reason: collision with root package name */
        public final u<j> f219490j;

        /* compiled from: DaggerGalleryPickerComponent.java */
        /* renamed from: com.avito.android.photo_picker.gallery.di.a$c$a, reason: collision with other inner class name */
        public static final class C6599a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.gallery.di.c f219491a;

            public C6599a(com.avito.android.photo_picker.gallery.di.c cVar) {
                this.f219491a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219491a.k();
            }
        }

        public c(com.avito.android.photo_picker.gallery.di.c cVar, Fragment fragment, Boolean bool, C6598a c6598a) {
            this.f219481a = cVar;
            this.f219482b = bool;
            this.f219483c = dagger.internal.g.d(new C33033c(l.a(fragment)));
            u<ContentResolver> uVarD = dagger.internal.g.d(new f(new C6599a(cVar)));
            this.f219485e = uVarD;
            this.f219486f = dagger.internal.g.d(new C47258e(uVarD, this.f219483c));
            this.f219487g = dagger.internal.g.d(com.avito.android.photo_picker.gallery.gallery_list.g.a());
            l lVarA = l.a(bool);
            u<com.avito.android.photo_picker.gallery.gallery_list.c> uVar = this.f219487g;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new g(new com.avito.android.photo_picker.gallery.gallery_list.b(lVarA, uVar), new com.avito.android.photo_picker.gallery.gallery_list.re23.b(lVarA, uVar)));
            this.f219488h = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new h(uVarD2));
            this.f219489i = uVarD3;
            this.f219490j = dagger.internal.g.d(new e(uVarD3, this.f219488h));
        }

        @Override // com.avito.android.photo_picker.gallery.di.b
        public final void a(GalleryPickerFragment galleryPickerFragment) {
            x xVar = this.f219483c.get();
            com.avito.android.photo_picker.gallery.di.c cVar = this.f219481a;
            galleryPickerFragment.f219447f0 = new com.avito.android.photo_picker.gallery.h(xVar, cVar.d(), this.f219486f.get(), this.f219487g.get(), cVar.N(), this.f219482b.booleanValue());
            galleryPickerFragment.f219448g0 = this.f219489i.get();
            galleryPickerFragment.f219449h0 = this.f219490j.get();
            galleryPickerFragment.f219450i0 = cVar.a();
            galleryPickerFragment.f219451j0 = this.f219483c.get();
            galleryPickerFragment.f219452k0 = cVar.N();
        }
    }

    public static b.a a() {
        return new b();
    }
}
