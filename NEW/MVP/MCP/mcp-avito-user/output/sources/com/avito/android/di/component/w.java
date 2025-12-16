package com.avito.android.di.component;

import android.content.ContentResolver;
import com.avito.android.di.component.J;
import com.avito.android.di.module.G6;
import com.avito.android.photo_picker.legacy.provider.PhotoContentProvider;
import com.avito.android.util.InterfaceC35827k0;

/* compiled from: DaggerPhotoContentProviderComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class w {

    /* compiled from: DaggerPhotoContentProviderComponent.java */
    public static final class b implements J.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.photo_picker.legacy.di.c f143747a;

        /* renamed from: b, reason: collision with root package name */
        public ContentResolver f143748b;

        public b() {
        }

        @Override // com.avito.android.di.component.J.a
        public final J.a a(ContentResolver contentResolver) {
            contentResolver.getClass();
            this.f143748b = contentResolver;
            return this;
        }

        @Override // com.avito.android.di.component.J.a
        public final J.a b(com.avito.android.photo_picker.legacy.di.c cVar) {
            this.f143747a = cVar;
            return this;
        }

        @Override // com.avito.android.di.component.J.a
        public final J build() {
            dagger.internal.t.a(com.avito.android.photo_picker.legacy.di.c.class, this.f143747a);
            dagger.internal.t.a(ContentResolver.class, this.f143748b);
            return new c(this.f143747a, this.f143748b, null);
        }
    }

    /* compiled from: DaggerPhotoContentProviderComponent.java */
    public static final class c implements J {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f143749a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.db.f> f143750b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35827k0> f143751c;

        /* compiled from: DaggerPhotoContentProviderComponent.java */
        public static final class a implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.c f143752a;

            public a(com.avito.android.photo_picker.legacy.di.c cVar) {
                this.f143752a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f143752a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerPhotoContentProviderComponent.java */
        public static final class b implements dagger.internal.u<com.avito.android.db.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.c f143753a;

            public b(com.avito.android.photo_picker.legacy.di.c cVar) {
                this.f143753a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.db.f fVarXa = this.f143753a.xa();
                dagger.internal.t.c(fVarXa);
                return fVarXa;
            }
        }

        public c(com.avito.android.photo_picker.legacy.di.c cVar, ContentResolver contentResolver, a aVar) {
            this.f143749a = new a(cVar);
            this.f143750b = new b(cVar);
            this.f143751c = dagger.internal.g.d(new G6(dagger.internal.l.a(contentResolver), this.f143749a, this.f143750b));
        }

        @Override // com.avito.android.di.component.J
        public final void a(PhotoContentProvider photoContentProvider) {
            photoContentProvider.f219835b = this.f143751c.get();
        }
    }

    public static J.a a() {
        return new b();
    }
}
