package com.avito.android.credits.credit_partner_screen.di;

import com.avito.android.V;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.credits.credit_partner_screen.CreditPartnerFragment;
import com.avito.android.credits.credit_partner_screen.a;
import com.avito.android.credits.credit_partner_screen.di.a;
import com.avito.android.credits.credit_partner_screen.mvi.k;
import com.avito.android.util.C35801g6;
import com.avito.android.util.Kundle;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.NoWhenBranchMatchedException;
import xs.C49989b;
import zs.C50622c;
import zs.InterfaceC50620a;

/* compiled from: DaggerCreditPartnerComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class j {

    /* compiled from: DaggerCreditPartnerComponent.java */
    public static final class b implements com.avito.android.credits.credit_partner_screen.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.credits.credit_partner_screen.di.b f128800a;

        /* renamed from: b, reason: collision with root package name */
        public final String f128801b;

        /* renamed from: c, reason: collision with root package name */
        public final Kundle f128802c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.credits.credit_partner_screen.a f128803d;

        /* renamed from: e, reason: collision with root package name */
        public final l f128804e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.credits.credit_partner_screen.i f128805f;

        /* renamed from: g, reason: collision with root package name */
        public final l f128806g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f128807h;

        /* renamed from: i, reason: collision with root package name */
        public final u<V> f128808i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f128809j;

        /* renamed from: k, reason: collision with root package name */
        public final u<H> f128810k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28499v> f128811l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28501x> f128812m;

        /* renamed from: n, reason: collision with root package name */
        public final u<o> f128813n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC50620a> f128814o;

        /* compiled from: DaggerCreditPartnerComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.credit_partner_screen.di.b f128815a;

            public a(com.avito.android.credits.credit_partner_screen.di.b bVar) {
                this.f128815a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f128815a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCreditPartnerComponent.java */
        /* renamed from: com.avito.android.credits.credit_partner_screen.di.j$b$b, reason: collision with other inner class name */
        public static final class C3818b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.credit_partner_screen.di.b f128816a;

            public C3818b(com.avito.android.credits.credit_partner_screen.di.b bVar) {
                this.f128816a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f128816a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.credits.credit_partner_screen.di.b bVar, com.avito.android.credits.credit_partner_screen.a aVar, String str, String str2, Boolean bool, Kundle kundle, r rVar, a aVar2) {
            this.f128800a = bVar;
            this.f128801b = str2;
            this.f128802c = kundle;
            this.f128803d = aVar;
            this.f128804e = l.a(str);
            l lVarA = l.a(bool);
            l lVar = this.f128804e;
            this.f128805f = new com.avito.android.credits.credit_partner_screen.i(new com.avito.android.credits.credit_partner_screen.mvi.g(new com.avito.android.credits.credit_partner_screen.mvi.d(lVar, lVarA), new com.avito.android.credits.credit_partner_screen.mvi.b(lVar), com.avito.android.credits.credit_partner_screen.mvi.i.a(), k.a()));
            this.f128806g = l.a(str2);
            this.f128807h = new a(bVar);
            this.f128808i = dagger.internal.g.d(new com.avito.android.credits.d(this.f128806g, this.f128807h, C35801g6.f318887a, l.a(kundle)));
            this.f128809j = new C3818b(bVar);
            u<H> uVarD = dagger.internal.g.d(new i(l.a(rVar), this.f128809j));
            this.f128810k = uVarD;
            this.f128811l = dagger.internal.g.d(new f(uVarD));
            this.f128812m = dagger.internal.g.d(new h(this.f128810k));
            u<o> uVarD2 = dagger.internal.g.d(new g(this.f128810k));
            this.f128813n = uVarD2;
            this.f128814o = dagger.internal.g.d(new C50622c(uVarD2, this.f128811l, this.f128812m));
        }

        @Override // com.avito.android.credits.credit_partner_screen.di.a
        public final void a(CreditPartnerFragment creditPartnerFragment) {
            creditPartnerFragment.f128748u0 = this.f128805f;
            com.avito.android.credits.credit_partner_screen.di.b bVar = this.f128800a;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            com.avito.android.analytics.provider.a aVarLh = bVar.Lh();
            t.c(aVarLh);
            creditPartnerFragment.f128753z0 = new com.avito.android.credits.credit_partner_screen.webview.b(new C49989b(interfaceC28373aA, this.f128801b, this.f128802c, this.f128803d, aVarLh));
            com.avito.android.credits.credit_partner_screen.a aVar = this.f128803d;
            creditPartnerFragment.f128740A0 = aVar;
            com.avito.android.credits.web_handler.f dVar = new com.avito.android.credits.web_handler.d(new com.avito.android.credits.web_logger.e(this.f128808i.get()));
            com.avito.android.credits.credit_partner_screen.di.c.f128793a.getClass();
            if (!(aVar instanceof a.c)) {
                if (!(aVar instanceof a.b ? true : aVar.equals(a.d.f128775h))) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = new com.avito.android.credits.web_handler.a();
            }
            creditPartnerFragment.f128741B0 = dVar;
            creditPartnerFragment.f128742C0 = this.f128808i.get();
            creditPartnerFragment.f128743D0 = this.f128808i.get();
            creditPartnerFragment.f128744E0 = this.f128814o.get();
        }
    }

    /* compiled from: DaggerCreditPartnerComponent.java */
    public static final class c implements a.InterfaceC3817a {
        public c() {
        }

        @Override // com.avito.android.credits.credit_partner_screen.di.a.InterfaceC3817a
        public final com.avito.android.credits.credit_partner_screen.di.a a(com.avito.android.credits.credit_partner_screen.di.b bVar, com.avito.android.credits.credit_partner_screen.a aVar, String str, String str2, boolean z12, Kundle kundle, r rVar) {
            aVar.getClass();
            return new b(bVar, aVar, str, str2, Boolean.valueOf(z12), kundle, rVar, null);
        }
    }

    public static a.InterfaceC3817a a() {
        return new c();
    }
}
