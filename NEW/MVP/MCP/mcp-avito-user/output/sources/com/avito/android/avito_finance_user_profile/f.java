package com.avito.android.avito_finance_user_profile;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.avito_finance_user_profile.a;
import com.avito.android.avito_finance_user_profile.view.mvi.i;
import com.avito.android.avito_finance_user_profile.view.mvi.k;
import com.avito.android.avito_finance_user_profile.view.mvi.n;
import com.avito.android.avito_finance_user_profile.view.mvi.q;
import com.avito.android.deep_linking.x;
import com.avito.android.util.R0;
import dagger.internal.t;
import dagger.internal.u;
import ig.InterfaceC41395a;
import lg.C43765a;
import mg.InterfaceC44077a;
import mg.InterfaceC44078b;
import qg.C47395a;

/* compiled from: DaggerAvitoFinanceBlockComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerAvitoFinanceBlockComponent.java */
    public static final class b implements com.avito.android.avito_finance_user_profile.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC44078b f97967a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC44077a f97968b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC41395a> f97969c;

        /* compiled from: DaggerAvitoFinanceBlockComponent.java */
        public static final class a implements u<InterfaceC41395a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44077a f97970a;

            public a(InterfaceC44077a interfaceC44077a) {
                this.f97970a = interfaceC44077a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41395a interfaceC41395aMk = this.f97970a.mk();
                t.c(interfaceC41395aMk);
                return interfaceC41395aMk;
            }
        }

        public b(InterfaceC44077a interfaceC44077a, InterfaceC44078b interfaceC44078b, a aVar) {
            this.f97967a = interfaceC44078b;
            this.f97968b = interfaceC44077a;
            this.f97969c = new a(interfaceC44077a);
        }

        @Override // mg.InterfaceC44079c
        public final q.a a() {
            InterfaceC44077a interfaceC44077a = this.f97968b;
            InterfaceC28373a interfaceC28373aA = interfaceC44077a.a();
            t.c(interfaceC28373aA);
            C43765a c43765a = new C43765a(dagger.internal.g.a(this.f97969c));
            R0 r0C = interfaceC44077a.c();
            t.c(r0C);
            x xVarQ = interfaceC44077a.q();
            t.c(xVarQ);
            com.avito.android.avito_finance_user_profile.view.domain.b bVar = new com.avito.android.avito_finance_user_profile.view.domain.b(c43765a, r0C, xVarQ);
            C47395a c47395aZi = interfaceC44077a.Zi();
            t.c(c47395aZi);
            com.avito.android.avito_finance_user_profile.view.mvi.g gVar = new com.avito.android.avito_finance_user_profile.view.mvi.g(interfaceC28373aA, bVar, c47395aZi);
            k kVar = new k();
            new com.avito.android.avito_finance_user_profile.view.item.c();
            return new q.a(new i(this.f97967a, gVar, kVar, new n()));
        }
    }

    /* compiled from: DaggerAvitoFinanceBlockComponent.java */
    public static final class c implements a.InterfaceC2936a {
        public c() {
        }
    }
}
