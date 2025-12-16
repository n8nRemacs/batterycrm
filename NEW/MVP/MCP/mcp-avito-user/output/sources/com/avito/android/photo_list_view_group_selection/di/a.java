package com.avito.android.photo_list_view_group_selection.di;

import Oi0.InterfaceC14698b;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30065i;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionActivity;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import com.avito.android.photo_list_view_group_selection.di.d;
import com.avito.android.photo_list_view_group_selection.di.j;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import e80.InterfaceC39964a;
import java.util.List;
import kotlin.G0;

/* compiled from: DaggerPhotoItemGroupSelectionComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerPhotoItemGroupSelectionComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.photo_list_view_group_selection.di.d.a
        public final d a(e eVar, String str, PhotoItemGroupSelectionParams photoItemGroupSelectionParams, r rVar, Y41.l<? super InterfaceC39964a, G0> lVar) {
            return new c(eVar, str, photoItemGroupSelectionParams, rVar, lVar, null);
        }
    }

    /* compiled from: DaggerPhotoItemGroupSelectionComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f218386a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.photo_list_view_group_selection.mvi.c f218387b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f218388c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C28478k> f218389d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f218390e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f218391f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.photo_list_view_group_selection.mvi.m f218392g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.f f218393h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f218394i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f218395j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f218396k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f218397l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC14698b> f218398m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f218399n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f218400o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f218401p;

        /* compiled from: DaggerPhotoItemGroupSelectionComponent.java */
        /* renamed from: com.avito.android.photo_list_view_group_selection.di.a$c$a, reason: collision with other inner class name */
        public static final class C6554a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f218402a;

            public C6554a(e eVar) {
                this.f218402a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cT3 = this.f218402a.t3();
                t.c(interfaceC28481cT3);
                return interfaceC28481cT3;
            }
        }

        public c() {
            throw null;
        }

        public c(e eVar, String str, PhotoItemGroupSelectionParams photoItemGroupSelectionParams, r rVar, Y41.l lVar, C6553a c6553a) {
            dagger.internal.l lVarA = dagger.internal.l.a(photoItemGroupSelectionParams);
            this.f218386a = lVarA;
            this.f218387b = new com.avito.android.photo_list_view_group_selection.mvi.c(lVarA);
            this.f218388c = new C6554a(eVar);
            u<C28478k> uVarD = dagger.internal.g.d(new m(dagger.internal.l.a(rVar)));
            this.f218389d = uVarD;
            this.f218390e = dagger.internal.g.d(new C30065i(this.f218388c, uVarD));
            this.f218391f = dagger.internal.l.a(str);
            this.f218392g = new com.avito.android.photo_list_view_group_selection.mvi.m(new com.avito.android.photo_list_view_group_selection.mvi.f(this.f218387b, com.avito.android.photo_list_view_group_selection.mvi.h.a(), com.avito.android.photo_list_view_group_selection.mvi.k.a(), this.f218390e, this.f218391f, this.f218386a));
            this.f218393h = new dagger.internal.f();
            this.f218394i = dagger.internal.l.a(lVar);
            this.f218395j = dagger.internal.g.d(new com.avito.android.photo_list_view_group_selection.items.imageGroup.b(com.avito.android.photo_list_view_group_selection.items.imageGroup.e.a(), this.f218394i));
            this.f218396k = dagger.internal.g.d(new com.avito.android.photo_list_view_group_selection.items.header.b(com.avito.android.photo_list_view_group_selection.items.header.e.a()));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f218395j;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f218396k);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new k(bVarA.b()));
            this.f218397l = uVarD2;
            u<InterfaceC14698b> uVarD3 = dagger.internal.g.d(new i(uVarD2));
            this.f218398m = uVarD3;
            this.f218399n = dagger.internal.g.d(new l(this.f218393h, uVarD3));
            this.f218400o = dagger.internal.g.d(new g(this.f218397l));
            u<com.avito.android.recycler.data_aware.e> uVarD4 = dagger.internal.g.d(j.a.f218409a);
            this.f218401p = uVarD4;
            dagger.internal.f.a(this.f218393h, dagger.internal.g.d(new h(uVarD4, this.f218399n, this.f218400o)));
        }

        @Override // com.avito.android.photo_list_view_group_selection.di.d
        public final void a(PhotoItemGroupSelectionActivity photoItemGroupSelectionActivity) {
            photoItemGroupSelectionActivity.f218363m = this.f218392g;
            photoItemGroupSelectionActivity.f218365o = this.f218390e.get();
            photoItemGroupSelectionActivity.f218366p = (com.avito.konveyor.adapter.a) this.f218393h.get();
            photoItemGroupSelectionActivity.f218367q = this.f218399n.get();
        }
    }

    public static d.a a() {
        return new b();
    }
}
