package com.avito.android.seller_coach.adverts_hint.provider;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.seller_coach.adverts_hint.mvi.l;
import com.avito.android.seller_coach.adverts_hint.mvi.o;
import com.avito.android.seller_coach.adverts_hint.mvi.q;
import com.avito.android.seller_coach.adverts_hint.provider.b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.t;
import dagger.internal.u;
import sI0.InterfaceC48055a;
import vq0.C49370c;
import zq0.C50613b;

/* compiled from: DaggerShortAdvicesComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerShortAdvicesComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerShortAdvicesComponent.java */
    public static final class c implements com.avito.android.seller_coach.adverts_hint.provider.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.seller_coach.adverts_hint.provider.c f267315a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC48055a> f267316b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f267317c;

        /* renamed from: d, reason: collision with root package name */
        public final C49370c f267318d;

        /* compiled from: DaggerShortAdvicesComponent.java */
        /* renamed from: com.avito.android.seller_coach.adverts_hint.provider.a$c$a, reason: collision with other inner class name */
        public static final class C7982a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_coach.adverts_hint.provider.c f267319a;

            public C7982a(com.avito.android.seller_coach.adverts_hint.provider.c cVar) {
                this.f267319a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f267319a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerShortAdvicesComponent.java */
        public static final class b implements u<InterfaceC48055a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_coach.adverts_hint.provider.c f267320a;

            public b(com.avito.android.seller_coach.adverts_hint.provider.c cVar) {
                this.f267320a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48055a interfaceC48055aA1 = this.f267320a.A1();
                t.c(interfaceC48055aA1);
                return interfaceC48055aA1;
            }
        }

        public c(com.avito.android.seller_coach.adverts_hint.provider.c cVar, C7981a c7981a) {
            this.f267315a = cVar;
            this.f267318d = new C49370c(new b(cVar), new C7982a(cVar));
        }

        @Override // com.avito.android.seller_coach.adverts_hint.provider.e
        public final com.avito.android.seller_coach.adverts_hint.view.g a() {
            return new com.avito.android.seller_coach.adverts_hint.view.g();
        }

        @Override // com.avito.android.seller_coach.adverts_hint.provider.e
        public final C50613b b() {
            C49370c c49370c = this.f267318d;
            com.avito.android.seller_coach.adverts_hint.provider.c cVar = this.f267315a;
            E eI2 = cVar.i();
            t.c(eI2);
            R0 r0C = cVar.c();
            t.c(r0C);
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            com.avito.android.seller_coach.adverts_hint.mvi.a aVar = new com.avito.android.seller_coach.adverts_hint.mvi.a(c49370c, eI2, r0C, interfaceC28373aA);
            q qVar = new q();
            l lVar = new l();
            R0 r0C2 = cVar.c();
            t.c(r0C2);
            return new C50613b(new o.a(aVar, qVar, lVar, r0C2));
        }
    }
}
