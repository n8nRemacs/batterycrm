package com.avito.android.vas_discount.di;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_discount.VasDiscountActivity;
import com.avito.android.vas_discount.di.q;
import dagger.internal.t;
import dagger.internal.u;
import mL0.InterfaceC43978a;
import xJ0.InterfaceC49850b;

/* compiled from: DaggerVasDiscountComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: DaggerVasDiscountComponent.java */
    /* renamed from: com.avito.android.vas_discount.di.b$b, reason: collision with other inner class name */
    public static final class C9907b implements q.a {

        /* renamed from: a, reason: collision with root package name */
        public d f319650a;

        /* renamed from: b, reason: collision with root package name */
        public e f319651b;

        public C9907b() {
        }

        @Override // com.avito.android.vas_discount.di.q.a
        public final q.a a(e eVar) {
            this.f319651b = eVar;
            return this;
        }

        @Override // com.avito.android.vas_discount.di.q.a
        public final q.a b(d dVar) {
            this.f319650a = dVar;
            return this;
        }

        @Override // com.avito.android.vas_discount.di.q.a
        public final q build() {
            t.a(d.class, this.f319650a);
            t.a(e.class, this.f319651b);
            return new c(this.f319651b, this.f319650a, null);
        }
    }

    /* compiled from: DaggerVasDiscountComponent.java */
    public static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public final d f319652a;

        /* renamed from: b, reason: collision with root package name */
        public final u<String> f319653b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC43978a> f319654c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f319655d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.business.a> f319656e;

        /* compiled from: DaggerVasDiscountComponent.java */
        public static final class a implements u<InterfaceC43978a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f319657a;

            public a(d dVar) {
                this.f319657a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43978a interfaceC43978aAa = this.f319657a.Aa();
                t.c(interfaceC43978aAa);
                return interfaceC43978aAa;
            }
        }

        /* compiled from: DaggerVasDiscountComponent.java */
        /* renamed from: com.avito.android.vas_discount.di.b$c$b, reason: collision with other inner class name */
        public static final class C9908b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final d f319658a;

            public C9908b(d dVar) {
                this.f319658a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f319658a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(e eVar, d dVar, a aVar) {
            this.f319652a = dVar;
            this.f319653b = dagger.internal.g.d(new f(eVar));
            this.f319656e = dagger.internal.g.d(new com.avito.android.vas_discount.business.c(new a(dVar), new C9908b(dVar)));
        }

        @Override // com.avito.android.vas_discount.di.q
        public final void Wb(VasDiscountActivity vasDiscountActivity) {
            String str = this.f319653b.get();
            com.avito.android.vas_discount.business.a aVar = this.f319656e.get();
            InterfaceC35745a5 interfaceC35745a5D = this.f319652a.d();
            t.c(interfaceC35745a5D);
            vasDiscountActivity.f319604m = new com.avito.android.vas_discount.b(str, aVar, interfaceC35745a5D);
        }

        @Override // com.avito.android.vas_discount.di.h
        public final InterfaceC35745a5 d() {
            InterfaceC35745a5 interfaceC35745a5D = this.f319652a.d();
            t.c(interfaceC35745a5D);
            return interfaceC35745a5D;
        }

        @Override // com.avito.android.vas_discount.di.h
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f319652a.e();
            t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.vas_discount.di.h
        public final InterfaceC49850b x1() {
            return this.f319652a.x1();
        }
    }

    public static q.a a() {
        return new C9907b();
    }
}
