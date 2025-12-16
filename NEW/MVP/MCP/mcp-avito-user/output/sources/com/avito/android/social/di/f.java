package com.avito.android.social.di;

import android.content.Context;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.social.C35011c;
import com.avito.android.social.C35016h;
import com.avito.android.social.C35019k;
import com.avito.android.social.C35033z;
import com.avito.android.social.H;
import com.avito.android.social.InterfaceC35009a;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35014f;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.SocialActivity;
import com.avito.android.social.SocialType;
import com.avito.android.social.V;
import com.avito.android.social.X;
import com.avito.android.social.Z;
import com.avito.android.social.di.h;
import com.avito.android.util.R0;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;

/* compiled from: DaggerSocialActivityComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class f {

    /* compiled from: DaggerSocialActivityComponent.java */
    public static final class b implements h.a {
        public b() {
        }

        @Override // com.avito.android.social.di.h.a
        public final h a(i iVar, Bundle bundle, SocialType socialType, SocialActivity socialActivity) {
            return new c(iVar, bundle, socialType, socialActivity, null);
        }
    }

    /* compiled from: DaggerSocialActivityComponent.java */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f284341a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35029v> f284342b;

        /* renamed from: c, reason: collision with root package name */
        public final u<X> f284343c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f284344d;

        /* renamed from: e, reason: collision with root package name */
        public final u<S> f284345e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35017i> f284346f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35009a> f284347g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f284348h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC35014f> f284349i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35013e> f284350j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f284351k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C40806a> f284352l;

        /* renamed from: m, reason: collision with root package name */
        public final u<H> f284353m;

        /* compiled from: DaggerSocialActivityComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f284354a;

            public a(i iVar) {
                this.f284354a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f284354a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSocialActivityComponent.java */
        public static final class b implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f284355a;

            public b(i iVar) {
                this.f284355a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f284355a.R();
            }
        }

        /* compiled from: DaggerSocialActivityComponent.java */
        /* renamed from: com.avito.android.social.di.f$c$c, reason: collision with other inner class name */
        public static final class C8500c implements u<InterfaceC35013e> {

            /* renamed from: a, reason: collision with root package name */
            public final i f284356a;

            public C8500c(i iVar) {
                this.f284356a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35013e interfaceC35013eG3 = this.f284356a.g3();
                t.c(interfaceC35013eG3);
                return interfaceC35013eG3;
            }
        }

        /* compiled from: DaggerSocialActivityComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final i f284357a;

            public d(i iVar) {
                this.f284357a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f284357a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        public c(i iVar, Bundle bundle, SocialType socialType, Context context, a aVar) {
            dagger.internal.l lVarA = dagger.internal.l.a(context);
            this.f284341a = lVarA;
            this.f284342b = dagger.internal.g.d(new C35033z(lVarA));
            this.f284343c = B.a(Z.a());
            this.f284345e = B.a(new V(new d(iVar)));
            this.f284346f = B.a(new C35019k(this.f284341a));
            this.f284347g = B.a(C35011c.a());
            this.f284349i = B.a(new C35016h(new a(iVar)));
            this.f284350j = new C8500c(iVar);
            this.f284351k = dagger.internal.l.a(socialType);
            this.f284353m = dagger.internal.g.d(new k(this.f284342b, this.f284343c, this.f284345e, this.f284346f, this.f284347g, this.f284349i, this.f284350j, this.f284351k, dagger.internal.l.b(bundle), new b(iVar)));
        }

        @Override // com.avito.android.social.di.h
        public final void a(SocialActivity socialActivity) {
            socialActivity.f284278b = this.f284353m.get();
        }
    }

    public static h.a a() {
        return new b();
    }
}
