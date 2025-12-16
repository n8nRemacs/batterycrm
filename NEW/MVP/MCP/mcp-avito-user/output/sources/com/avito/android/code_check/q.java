package com.avito.android.code_check;

import android.app.Activity;
import androidx.view.InterfaceC23487e;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.code_check.c;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.R0;
import dagger.internal.B;
import hD.C40806a;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: DaggerCodeCheckComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class q {

    /* compiled from: DaggerCodeCheckComponent.java */
    public static final class b implements com.avito.android.code_check.c {

        /* renamed from: a, reason: collision with root package name */
        public final j f119224a;

        /* renamed from: b, reason: collision with root package name */
        public final s f119225b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f119226c;

        /* renamed from: d, reason: collision with root package name */
        public final CodeCheckLink.Flow f119227d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f119228e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<T0> f119229f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC23487e> f119230g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<P0.c> f119231h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<d> f119232i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u f119233j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.code_check_public.d> f119234k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<Activity> f119235l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.dialog.a> f119236m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30274a> f119237n;

        /* compiled from: DaggerCodeCheckComponent.java */
        public static final class a implements dagger.internal.u<Map<Class<? extends CodeCheckLink.Flow>, Provider<com.avito.android.code_check_public.e>>> {

            /* renamed from: a, reason: collision with root package name */
            public final j f119238a;

            public a(j jVar) {
                this.f119238a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Map<Class<? extends CodeCheckLink.Flow>, Provider<com.avito.android.code_check_public.e>> mapW4 = this.f119238a.w4();
                dagger.internal.t.c(mapW4);
                return mapW4;
            }
        }

        public b(l lVar, s sVar, j jVar, cv.b bVar, CodeCheckActivity codeCheckActivity, CodeCheckLink.Flow flow, a aVar) {
            this.f119224a = jVar;
            this.f119225b = sVar;
            this.f119226c = bVar;
            this.f119227d = flow;
            dagger.internal.l lVarA = dagger.internal.l.a(codeCheckActivity);
            this.f119228e = lVarA;
            this.f119229f = dagger.internal.g.d(lVarA);
            dagger.internal.u<InterfaceC23487e> uVarD = dagger.internal.g.d(this.f119228e);
            this.f119230g = uVarD;
            dagger.internal.u<P0.c> uVarD2 = dagger.internal.g.d(new f(uVarD));
            this.f119231h = uVarD2;
            this.f119232i = dagger.internal.g.d(new n(lVar, this.f119229f, uVarD2));
            this.f119234k = dagger.internal.g.d(new m(lVar, dagger.internal.l.a(flow), new a(jVar)));
            dagger.internal.u<Activity> uVarD3 = dagger.internal.g.d(this.f119228e);
            this.f119235l = uVarD3;
            dagger.internal.u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(uVarD3));
            this.f119236m = uVarA;
            this.f119237n = B.a(new com.avito.android.dialog.o(uVarA, this.f119235l));
        }

        @Override // com.avito.android.code_check.code_confirm.InterfaceC29384b
        public final C40806a R() {
            return this.f119224a.R();
        }

        @Override // com.avito.android.code_check.k
        public final d Vj() {
            return this.f119232i.get();
        }

        @Override // com.avito.android.code_check.k
        public final InterfaceC28481c b() {
            InterfaceC28481c interfaceC28481cB = this.f119224a.b();
            dagger.internal.t.c(interfaceC28481cB);
            return interfaceC28481cB;
        }

        @Override // com.avito.android.code_check.k
        public final R0 c() {
            R0 r0C = this.f119224a.c();
            dagger.internal.t.c(r0C);
            return r0C;
        }

        @Override // com.avito.android.code_check.phone_list.c
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f119224a.e();
            dagger.internal.t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.code_check.code_confirm.InterfaceC29384b
        public final com.avito.android.deeplink_handler.handler.composite.a u4() {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f119226c.u4();
            dagger.internal.t.c(aVarU4);
            return aVarU4;
        }

        @Override // com.avito.android.code_check.k
        public final Map<String, com.avito.android.code_check_public.screen.h> w4() {
            com.avito.android.code_check_public.d dVar = this.f119234k.get();
            this.f119225b.getClass();
            kotlin.collections.builders.d dVar2 = new kotlin.collections.builders.d();
            s.a(dVar.f119285a, dVar2);
            return dVar2.b();
        }
    }

    /* compiled from: DaggerCodeCheckComponent.java */
    public static final class c implements c.a {
        public c() {
        }
    }
}
