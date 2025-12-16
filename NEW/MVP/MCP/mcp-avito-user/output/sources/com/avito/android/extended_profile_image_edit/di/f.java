package com.avito.android.extended_profile_image_edit.di;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.avito.android.extended_profile_image_edit.BannerImageEditFragment;
import com.avito.android.extended_profile_image_edit.di.a;
import com.avito.android.extended_profile_image_edit.mvi.i;
import com.avito.android.extended_profile_image_edit.mvi.k;
import com.avito.android.extended_profile_image_edit.mvi.n;
import com.avito.android.extended_profile_image_edit.mvi.p;
import com.avito.android.extended_profile_image_edit.mvi.r;
import com.avito.android.extended_profile_image_edit.x;
import com.avito.android.photo_storage.h;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import w80.C49468b;

/* compiled from: DaggerBannerImageEditComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class f {

    /* compiled from: DaggerBannerImageEditComponent.java */
    public static final class b implements com.avito.android.extended_profile_image_edit.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f150996a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f150997b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f150998c;

        /* renamed from: d, reason: collision with root package name */
        public final k f150999d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Context> f151000e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f151001f;

        /* renamed from: g, reason: collision with root package name */
        public final r f151002g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.extended_profile_image_edit.f f151003h;

        /* compiled from: DaggerBannerImageEditComponent.java */
        public static final class a implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_image_edit.di.b f151004a;

            public a(com.avito.android.extended_profile_image_edit.di.b bVar) {
                this.f151004a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f151004a.g();
            }
        }

        /* compiled from: DaggerBannerImageEditComponent.java */
        /* renamed from: com.avito.android.extended_profile_image_edit.di.f$b$b, reason: collision with other inner class name */
        public static final class C4409b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_image_edit.di.b f151005a;

            public C4409b(com.avito.android.extended_profile_image_edit.di.b bVar) {
                this.f151005a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f151005a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBannerImageEditComponent.java */
        public static final class c implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_image_edit.di.b f151006a;

            public c(com.avito.android.extended_profile_image_edit.di.b bVar) {
                this.f151006a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f151006a.F();
                t.c(bVarF);
                return bVarF;
            }
        }

        public b(com.avito.android.extended_profile_image_edit.di.b bVar, x xVar, Fragment fragment, Boolean bool, a aVar) {
            this.f150996a = l.a(xVar);
            this.f150997b = new c(bVar);
            l lVarA = l.a(bool);
            C4409b c4409b = new C4409b(bVar);
            this.f150998c = c4409b;
            this.f150999d = new k(this.f150996a, lVarA, this.f150997b, c4409b);
            a aVar2 = new a(bVar);
            this.f151000e = aVar2;
            this.f151001f = com.avito.android.photo_storage.f.a(aVar2);
            C49468b c49468bA = C49468b.a(this.f151001f, h.a(this.f151000e));
            l lVar = this.f150996a;
            i iVar = new i(lVar, this.f150997b, c49468bA, this.f150998c);
            this.f151002g = new r(lVar);
            this.f151003h = new com.avito.android.extended_profile_image_edit.f(new n(this.f150999d, iVar, p.a(), this.f151002g), this.f150997b, this.f150998c);
        }

        @Override // com.avito.android.extended_profile_image_edit.di.a
        public final void a(BannerImageEditFragment bannerImageEditFragment) {
            bannerImageEditFragment.f150977n0 = this.f151003h;
        }
    }

    /* compiled from: DaggerBannerImageEditComponent.java */
    public static final class c implements a.InterfaceC4408a {
        public c() {
        }

        @Override // com.avito.android.extended_profile_image_edit.di.a.InterfaceC4408a
        public final com.avito.android.extended_profile_image_edit.di.a a(x xVar, BannerImageEditFragment bannerImageEditFragment, boolean z12, com.avito.android.extended_profile_image_edit.di.b bVar) {
            return new b(bVar, xVar, bannerImageEditFragment, Boolean.valueOf(z12), null);
        }
    }

    public static a.InterfaceC4408a a() {
        return new c();
    }
}
