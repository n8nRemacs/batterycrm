package com.avito.android.messenger.blacklist.mvi.di;

import com.avito.android.C30277e1;
import com.avito.android.messenger.blacklist.mvi.BlacklistActivity;
import com.avito.android.messenger.blacklist.mvi.di.a;
import dagger.internal.u;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.F0;

/* compiled from: DaggerBlacklistActivityComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class n {

    /* compiled from: DaggerBlacklistActivityComponent.java */
    public static final class b implements com.avito.android.messenger.blacklist.mvi.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.messenger.blacklist.mvi.di.b f186428a;

        /* renamed from: b, reason: collision with root package name */
        public final u<F0> f186429b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C30277e1> f186430c;

        /* renamed from: d, reason: collision with root package name */
        public final C47743i f186431d;

        /* compiled from: DaggerBlacklistActivityComponent.java */
        public static final class a implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.b f186432a;

            public a(com.avito.android.messenger.blacklist.mvi.di.b bVar) {
                this.f186432a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f186432a.C();
            }
        }

        /* compiled from: DaggerBlacklistActivityComponent.java */
        /* renamed from: com.avito.android.messenger.blacklist.mvi.di.n$b$b, reason: collision with other inner class name */
        public static final class C5467b implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.b f186433a;

            public C5467b(com.avito.android.messenger.blacklist.mvi.di.b bVar) {
                this.f186433a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f186433a.B0();
            }
        }

        public b(com.avito.android.messenger.blacklist.mvi.di.b bVar, a aVar) {
            this.f186428a = bVar;
            this.f186431d = new C47743i(new C5467b(bVar), new a(bVar));
        }

        @Override // com.avito.android.messenger.blacklist.mvi.di.a
        public final void a(BlacklistActivity blacklistActivity) {
            blacklistActivity.f186328m = this.f186428a.x();
            blacklistActivity.f186329n = this.f186431d;
        }
    }

    /* compiled from: DaggerBlacklistActivityComponent.java */
    public static final class c implements a.InterfaceC5466a {
        public c() {
        }

        @Override // com.avito.android.messenger.blacklist.mvi.di.a.InterfaceC5466a
        public final com.avito.android.messenger.blacklist.mvi.di.a a(com.avito.android.messenger.blacklist.mvi.di.b bVar) {
            return new b(bVar, null);
        }
    }

    public static a.InterfaceC5466a a() {
        return new c();
    }
}
