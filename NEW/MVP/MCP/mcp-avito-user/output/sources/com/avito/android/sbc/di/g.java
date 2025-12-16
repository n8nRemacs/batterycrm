package com.avito.android.sbc.di;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sbc.create.CreateDiscountDispatchActivity;
import com.avito.android.sbc.di.a;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.F0;

/* compiled from: DaggerCreateDiscountDispatchActivityComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class g {

    /* compiled from: DaggerCreateDiscountDispatchActivityComponent.java */
    public static final class b implements com.avito.android.sbc.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.sbc.di.b f259971a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<F0> f259972b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<C30277e1> f259973c;

        /* renamed from: d, reason: collision with root package name */
        public final C47743i f259974d;

        /* compiled from: DaggerCreateDiscountDispatchActivityComponent.java */
        public static final class a implements dagger.internal.u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.b f259975a;

            public a(com.avito.android.sbc.di.b bVar) {
                this.f259975a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f259975a.C();
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchActivityComponent.java */
        /* renamed from: com.avito.android.sbc.di.g$b$b, reason: collision with other inner class name */
        public static final class C7794b implements dagger.internal.u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.b f259976a;

            public C7794b(com.avito.android.sbc.di.b bVar) {
                this.f259976a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f259976a.B0();
            }
        }

        public b(com.avito.android.sbc.di.b bVar, a aVar) {
            this.f259971a = bVar;
            this.f259974d = new C47743i(new C7794b(bVar), new a(bVar));
        }

        @Override // com.avito.android.sbc.di.a
        public final void a(CreateDiscountDispatchActivity createDiscountDispatchActivity) {
            com.avito.android.sbc.di.b bVar = this.f259971a;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            createDiscountDispatchActivity.f259160m = interfaceC28373aA;
            createDiscountDispatchActivity.f259161n = this.f259974d;
            bVar.C();
        }
    }

    /* compiled from: DaggerCreateDiscountDispatchActivityComponent.java */
    public static final class c implements a.InterfaceC7793a {
        public c() {
        }

        @Override // com.avito.android.sbc.di.a.InterfaceC7793a
        public final com.avito.android.sbc.di.a a(com.avito.android.sbc.di.b bVar) {
            return new b(bVar, null);
        }
    }

    public static a.InterfaceC7793a a() {
        return new c();
    }
}
