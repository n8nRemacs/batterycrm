package com.avito.android.photo_picker.edit.di;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.b0;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.edit.EditPhotoFragment;
import com.avito.android.photo_picker.edit.di.b;
import com.avito.android.photo_picker.edit.r;
import com.avito.android.photo_storage.h;
import com.avito.android.photo_storage.k;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import w80.C49468b;

/* compiled from: DaggerEditPhotoComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerEditPhotoComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.photo_picker.edit.di.c f219378a;

        /* renamed from: b, reason: collision with root package name */
        public PhotoPickerIntentFactory.PhotoPickerMode f219379b;

        /* renamed from: c, reason: collision with root package name */
        public EditPhotoFragment f219380c;

        public b() {
        }

        @Override // com.avito.android.photo_picker.edit.di.b.a
        public final b.a a(com.avito.android.photo_picker.edit.di.c cVar) {
            this.f219378a = cVar;
            return this;
        }

        @Override // com.avito.android.photo_picker.edit.di.b.a
        public final b.a b(PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode) {
            photoPickerMode.getClass();
            this.f219379b = photoPickerMode;
            return this;
        }

        @Override // com.avito.android.photo_picker.edit.di.b.a
        public final com.avito.android.photo_picker.edit.di.b build() {
            t.a(com.avito.android.photo_picker.edit.di.c.class, this.f219378a);
            t.a(PhotoPickerIntentFactory.PhotoPickerMode.class, this.f219379b);
            t.a(Fragment.class, this.f219380c);
            return new c(new d(), this.f219378a, this.f219379b, this.f219380c, null);
        }

        @Override // com.avito.android.photo_picker.edit.di.b.a
        public final b.a c(EditPhotoFragment editPhotoFragment) {
            this.f219380c = editPhotoFragment;
            return this;
        }
    }

    /* compiled from: DaggerEditPhotoComponent.java */
    public static final class c implements com.avito.android.photo_picker.edit.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f219381a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Context> f219382b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f219383c;

        /* renamed from: d, reason: collision with root package name */
        public final C49468b f219384d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f219385e;

        /* renamed from: f, reason: collision with root package name */
        public final u<b0> f219386f;

        /* renamed from: g, reason: collision with root package name */
        public final k f219387g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Gson> f219388h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.edit.t> f219389i;

        /* renamed from: j, reason: collision with root package name */
        public final u<P0.c> f219390j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.edit.k> f219391k;

        /* compiled from: DaggerEditPhotoComponent.java */
        /* renamed from: com.avito.android.photo_picker.edit.di.a$c$a, reason: collision with other inner class name */
        public static final class C6594a implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.edit.di.c f219392a;

            public C6594a(com.avito.android.photo_picker.edit.di.c cVar) {
                this.f219392a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219392a.g();
            }
        }

        /* compiled from: DaggerEditPhotoComponent.java */
        public static final class b implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.edit.di.c f219393a;

            public b(com.avito.android.photo_picker.edit.di.c cVar) {
                this.f219393a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f219393a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerEditPhotoComponent.java */
        /* renamed from: com.avito.android.photo_picker.edit.di.a$c$c, reason: collision with other inner class name */
        public static final class C6595c implements u<b0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.edit.di.c f219394a;

            public C6595c(com.avito.android.photo_picker.edit.di.c cVar) {
                this.f219394a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219394a.Z3();
            }
        }

        /* compiled from: DaggerEditPhotoComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.edit.di.c f219395a;

            public d(com.avito.android.photo_picker.edit.di.c cVar) {
                this.f219395a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219395a.d();
            }
        }

        public c(com.avito.android.photo_picker.edit.di.d dVar, com.avito.android.photo_picker.edit.di.c cVar, PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, Fragment fragment, C6593a c6593a) {
            this.f219381a = l.a(fragment);
            C6594a c6594a = new C6594a(cVar);
            this.f219382b = c6594a;
            this.f219383c = com.avito.android.photo_storage.f.a(c6594a);
            this.f219384d = C49468b.a(this.f219383c, h.a(this.f219382b));
            this.f219385e = new d(cVar);
            this.f219386f = new C6595c(cVar);
            this.f219387g = k.a(this.f219382b);
            this.f219389i = g.d(new e(dVar, this.f219382b, this.f219387g, N70.d.a(new b(cVar))));
            u<P0.c> uVarD = g.d(new r(this.f219384d, this.f219385e, this.f219386f, this.f219389i, l.a(photoPickerMode)));
            this.f219390j = uVarD;
            this.f219391k = g.d(new f(dVar, this.f219381a, uVarD));
        }

        @Override // com.avito.android.photo_picker.edit.di.b
        public final void a(EditPhotoFragment editPhotoFragment) {
            editPhotoFragment.f219348f0 = this.f219391k.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
