package com.avito.android.avl_entry.impl.di;

import Fg.InterfaceC13800a;
import Lg.InterfaceC14390a;
import Lg.InterfaceC14392c;
import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.avl_entry.impl.di.k;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerShortVideosViewComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerShortVideosViewComponent.java */
    /* renamed from: com.avito.android.avl_entry.impl.di.b$b, reason: collision with other inner class name */
    public static final class C2952b implements k.a {
        public C2952b() {
        }

        @Override // com.avito.android.avl_entry.impl.di.k.a
        public final k a(l lVar, InterfaceC14390a interfaceC14390a, Resources resources, com.avito.android.avl_entry.impl.util.d dVar) {
            resources.getClass();
            dVar.getClass();
            return new c(interfaceC14390a, lVar, resources, dVar, null);
        }
    }

    /* compiled from: DaggerShortVideosViewComponent.java */
    public static final class c implements k {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC14392c> f98453a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.avl_analytics.a> f98454b;

        /* renamed from: c, reason: collision with root package name */
        public final u<E> f98455c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.serp.analytics.widgets_tracker.g> f98456d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.avl_entry.impl.ui.internal_item.video.c> f98457e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f98458f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC13800a> f98459g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.avl_entry.impl.ui.internal_item.show_all.d> f98460h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f98461i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f98462j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f98463k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f98464l;

        /* compiled from: DaggerShortVideosViewComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final l f98465a;

            public a(l lVar) {
                this.f98465a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f98465a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerShortVideosViewComponent.java */
        /* renamed from: com.avito.android.avl_entry.impl.di.b$c$b, reason: collision with other inner class name */
        public static final class C2953b implements u<com.avito.android.avl_analytics.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14390a f98466a;

            public C2953b(InterfaceC14390a interfaceC14390a) {
                this.f98466a = interfaceC14390a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.avl_analytics.a aVarT4 = this.f98466a.t4();
                t.c(aVarT4);
                return aVarT4;
            }
        }

        /* compiled from: DaggerShortVideosViewComponent.java */
        /* renamed from: com.avito.android.avl_entry.impl.di.b$c$c, reason: collision with other inner class name */
        public static final class C2954c implements u<InterfaceC14392c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14390a f98467a;

            public C2954c(InterfaceC14390a interfaceC14390a) {
                this.f98467a = interfaceC14390a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14392c interfaceC14392cBc = this.f98467a.Bc();
                t.c(interfaceC14392cBc);
                return interfaceC14392cBc;
            }
        }

        /* compiled from: DaggerShortVideosViewComponent.java */
        public static final class d implements u<com.avito.android.serp.analytics.widgets_tracker.g> {

            /* renamed from: a, reason: collision with root package name */
            public final l f98468a;

            public d(l lVar) {
                this.f98468a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.serp.analytics.widgets_tracker.g gVarH2 = this.f98468a.h2();
                t.c(gVarH2);
                return gVarH2;
            }
        }

        public c(InterfaceC14390a interfaceC14390a, l lVar, Resources resources, com.avito.android.avl_entry.impl.util.d dVar, a aVar) {
            this.f98453a = new C2954c(interfaceC14390a);
            dagger.internal.l lVarA = dagger.internal.l.a(dVar);
            C2953b c2953b = new C2953b(interfaceC14390a);
            this.f98454b = c2953b;
            a aVar2 = new a(lVar);
            d dVar2 = new d(lVar);
            this.f98456d = dVar2;
            u<com.avito.android.avl_entry.impl.ui.internal_item.video.c> uVarD = dagger.internal.g.d(new com.avito.android.avl_entry.impl.ui.internal_item.video.h(lVarA, this.f98453a, c2953b, aVar2, dVar2));
            this.f98457e = uVarD;
            this.f98458f = dagger.internal.g.d(new com.avito.android.avl_entry.impl.ui.internal_item.video.b(uVarD));
            u<InterfaceC13800a> uVarD2 = dagger.internal.g.d(new Fg.c(dagger.internal.l.a(resources)));
            this.f98459g = uVarD2;
            u<com.avito.android.avl_entry.impl.ui.internal_item.show_all.d> uVarD3 = dagger.internal.g.d(new com.avito.android.avl_entry.impl.ui.internal_item.show_all.g(uVarD2, this.f98453a, this.f98454b, this.f98456d));
            this.f98460h = uVarD3;
            this.f98461i = dagger.internal.g.d(new com.avito.android.avl_entry.impl.ui.internal_item.show_all.c(uVarD3));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f98458f;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f98461i);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new f(bVarA.b()));
            this.f98462j = uVarD4;
            u<com.avito.konveyor.adapter.h> uVarD5 = dagger.internal.g.d(new e(uVarD4));
            this.f98463k = uVarD5;
            this.f98464l = dagger.internal.g.d(new com.avito.android.avl_entry.impl.di.d(uVarD5, this.f98462j));
        }

        @Override // com.avito.android.avl_entry.impl.di.k
        public final com.avito.konveyor.adapter.j a() {
            return this.f98464l.get();
        }

        @Override // com.avito.android.avl_entry.impl.di.k
        public final com.avito.konveyor.adapter.h b() {
            return this.f98463k.get();
        }
    }

    public static k.a a() {
        return new C2952b();
    }
}
