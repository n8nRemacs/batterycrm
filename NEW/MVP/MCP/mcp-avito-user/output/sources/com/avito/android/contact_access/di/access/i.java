package com.avito.android.contact_access.di.access;

import Fr.InterfaceC13828a;
import android.content.res.Resources;
import android.os.Bundle;
import cP.InterfaceC27082a;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.contact_access.contact_access_package.mvi.d;
import com.avito.android.contact_access.contact_access_package.mvi.k;
import com.avito.android.contact_access.contact_access_package.mvi.m;
import com.avito.android.contact_access.contact_access_package.view.ContactAccessPackageFragment;
import com.avito.android.contact_access.di.access.a;
import com.avito.android.util.InterfaceC35741a1;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerContactAccessPackageFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class i {

    /* compiled from: DaggerContactAccessPackageFragmentComponent.java */
    public static final class b implements a.InterfaceC3742a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC13828a f126094a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f126095b;

        /* renamed from: c, reason: collision with root package name */
        public String f126096c;

        /* renamed from: d, reason: collision with root package name */
        public Bundle f126097d;

        /* renamed from: e, reason: collision with root package name */
        public r f126098e;

        /* renamed from: f, reason: collision with root package name */
        public Resources f126099f;

        /* renamed from: g, reason: collision with root package name */
        public Boolean f126100g;

        /* renamed from: h, reason: collision with root package name */
        public Boolean f126101h;

        public b() {
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f126095b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a b(Resources resources) {
            this.f126099f = resources;
            return this;
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final com.avito.android.contact_access.di.access.a build() {
            t.a(InterfaceC13828a.class, this.f126094a);
            t.a(cv.b.class, this.f126095b);
            t.a(String.class, this.f126096c);
            t.a(r.class, this.f126098e);
            t.a(Resources.class, this.f126099f);
            t.a(Boolean.class, this.f126100g);
            t.a(Boolean.class, this.f126101h);
            return new c(this.f126094a, this.f126095b, this.f126096c, this.f126097d, this.f126098e, this.f126099f, this.f126100g, this.f126101h, null);
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a c(Bundle bundle) {
            this.f126097d = bundle;
            return this;
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a d(InterfaceC13828a interfaceC13828a) {
            this.f126094a = interfaceC13828a;
            return this;
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a e(r rVar) {
            this.f126098e = rVar;
            return this;
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a f(boolean z12) {
            this.f126100g = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a g(boolean z12) {
            this.f126101h = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.contact_access.di.access.a.InterfaceC3742a
        public final a.InterfaceC3742a r(String str) {
            this.f126096c = str;
            return this;
        }
    }

    /* compiled from: DaggerContactAccessPackageFragmentComponent.java */
    public static final class c implements com.avito.android.contact_access.di.access.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f126102a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f126103b;

        /* renamed from: c, reason: collision with root package name */
        public final u<H> f126104c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28499v> f126105d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28501x> f126106e;

        /* renamed from: f, reason: collision with root package name */
        public final u<o> f126107f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.contact_access.contact_access_package.view.f> f126108g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC27082a> f126109h;

        /* renamed from: i, reason: collision with root package name */
        public final l f126110i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.contact_access.contact_access_package.domain.a> f126111j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC35741a1> f126112k;

        /* renamed from: l, reason: collision with root package name */
        public final k f126113l;

        /* renamed from: m, reason: collision with root package name */
        public final l f126114m;

        /* compiled from: DaggerContactAccessPackageFragmentComponent.java */
        public static final class a implements u<InterfaceC27082a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126115a;

            public a(InterfaceC13828a interfaceC13828a) {
                this.f126115a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27082a interfaceC27082aWe = this.f126115a.we();
                t.c(interfaceC27082aWe);
                return interfaceC27082aWe;
            }
        }

        /* compiled from: DaggerContactAccessPackageFragmentComponent.java */
        public static final class b implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126116a;

            public b(InterfaceC13828a interfaceC13828a) {
                this.f126116a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f126116a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerContactAccessPackageFragmentComponent.java */
        /* renamed from: com.avito.android.contact_access.di.access.i$c$c, reason: collision with other inner class name */
        public static final class C3743c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126117a;

            public C3743c(InterfaceC13828a interfaceC13828a) {
                this.f126117a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126117a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC13828a interfaceC13828a, cv.b bVar, String str, Bundle bundle, r rVar, Resources resources, Boolean bool, Boolean bool2, a aVar) {
            this.f126102a = bVar;
            this.f126103b = new C3743c(interfaceC13828a);
            u<H> uVarD = dagger.internal.g.d(new g(l.a(rVar), this.f126103b));
            this.f126104c = uVarD;
            this.f126105d = dagger.internal.g.d(new e(uVarD));
            this.f126106e = dagger.internal.g.d(new f(this.f126104c));
            u<o> uVarD2 = dagger.internal.g.d(new h(this.f126104c));
            this.f126107f = uVarD2;
            this.f126108g = dagger.internal.g.d(new com.avito.android.contact_access.contact_access_package.view.h(uVarD2, this.f126105d, this.f126106e));
            this.f126109h = new a(interfaceC13828a);
            this.f126110i = l.a(str);
            u<com.avito.android.contact_access.contact_access_package.domain.a> uVarD3 = dagger.internal.g.d(new com.avito.android.contact_access.contact_access_package.domain.d(this.f126110i, l.a(bool2), this.f126109h));
            this.f126111j = uVarD3;
            b bVar2 = new b(interfaceC13828a);
            this.f126112k = bVar2;
            this.f126113l = new k(uVarD3, bVar2);
            this.f126114m = l.a(new com.avito.android.contact_access.contact_access_package.mvi.f(new com.avito.android.contact_access.contact_access_package.mvi.e(new com.avito.android.contact_access.contact_access_package.mvi.c(this.f126113l, new com.avito.android.contact_access.contact_access_package.mvi.i(l.a(bool), this.f126111j, this.f126112k), com.avito.android.contact_access.contact_access_package.mvi.o.a(), m.a()))));
        }

        @Override // com.avito.android.contact_access.di.access.a
        public final void a(ContactAccessPackageFragment contactAccessPackageFragment) {
            contactAccessPackageFragment.f125917h0 = this.f126108g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126102a.u4();
            t.c(aVarU4);
            contactAccessPackageFragment.f125918i0 = aVarU4;
            contactAccessPackageFragment.f125919j0 = (d.a) this.f126114m.f393949a;
        }
    }

    public static a.InterfaceC3742a a() {
        return new b();
    }
}
