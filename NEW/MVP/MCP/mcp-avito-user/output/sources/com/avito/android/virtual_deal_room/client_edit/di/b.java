package com.avito.android.virtual_deal_room.client_edit.di;

import Y41.l;
import androidx.view.C22977J;
import androidx.view.Lifecycle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment;
import com.avito.android.virtual_deal_room.client_edit.di.a;
import com.avito.android.virtual_deal_room.client_edit.i;
import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import com.avito.android.virtual_deal_room.client_edit.mvi.f;
import com.avito.android.virtual_deal_room.client_edit.mvi.k;
import com.avito.android.virtual_deal_room.client_edit.mvi.n;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import kotlinx.coroutines.T;

/* compiled from: DaggerClientEditComponent.java */
@e
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: DaggerClientEditComponent.java */
    /* renamed from: com.avito.android.virtual_deal_room.client_edit.di.b$b, reason: collision with other inner class name */
    public static final class C10082b implements com.avito.android.virtual_deal_room.client_edit.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super CN0.a, G0> f326139a;

        /* renamed from: b, reason: collision with root package name */
        public final Lifecycle f326140b;

        /* renamed from: c, reason: collision with root package name */
        public final T f326141c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f326142d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f326143e;

        /* renamed from: f, reason: collision with root package name */
        public final u<BN0.a> f326144f;

        /* renamed from: g, reason: collision with root package name */
        public final f f326145g;

        /* renamed from: h, reason: collision with root package name */
        public final u<IN0.a> f326146h;

        /* renamed from: i, reason: collision with root package name */
        public final u<R0> f326147i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room.client_edit.mvi.d f326148j;

        /* renamed from: k, reason: collision with root package name */
        public final n f326149k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f326150l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f326151m;

        /* renamed from: n, reason: collision with root package name */
        public final i f326152n;

        /* compiled from: DaggerClientEditComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room.client_edit.di.b$b$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final HN0.a f326153a;

            public a(HN0.a aVar) {
                this.f326153a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f326153a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerClientEditComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room.client_edit.di.b$b$b, reason: collision with other inner class name */
        public static final class C10083b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final HN0.a f326154a;

            public C10083b(HN0.a aVar) {
                this.f326154a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f326154a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerClientEditComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room.client_edit.di.b$b$c */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final HN0.a f326155a;

            public c(HN0.a aVar) {
                this.f326155a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f326155a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerClientEditComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room.client_edit.di.b$b$d */
        public static final class d implements u<IN0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final HN0.a f326156a;

            public d(HN0.a aVar) {
                this.f326156a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IN0.a aVarCk = this.f326156a.ck();
                t.c(aVarCk);
                return aVarCk;
            }
        }

        public C10082b() {
            throw null;
        }

        public C10082b(HN0.a aVar, C28478k c28478k, ClientEditArguments clientEditArguments, l lVar, Lifecycle lifecycle, T t12, a aVar2) {
            this.f326139a = lVar;
            this.f326140b = lifecycle;
            this.f326141c = t12;
            this.f326142d = new a(aVar);
            dagger.internal.l lVarA = dagger.internal.l.a(clientEditArguments);
            this.f326143e = lVarA;
            u<BN0.a> uVarA = B.a(new BN0.c(lVarA, this.f326142d));
            this.f326144f = uVarA;
            this.f326145g = new f(uVarA);
            this.f326148j = new com.avito.android.virtual_deal_room.client_edit.mvi.d(new d(aVar), new C10083b(aVar));
            this.f326149k = new n(this.f326143e, uVarA);
            this.f326150l = new c(aVar);
            this.f326151m = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f326150l);
            this.f326152n = new i(new com.avito.android.virtual_deal_room.client_edit.mvi.i(this.f326145g, this.f326148j, k.a(), this.f326149k, this.f326151m, this.f326143e));
        }

        @Override // com.avito.android.virtual_deal_room.client_edit.di.a
        public final void a(ClientEditDialogFragment clientEditDialogFragment) {
            clientEditDialogFragment.f326106h0 = this.f326152n;
            clientEditDialogFragment.f326108j0 = this.f326151m.get();
            clientEditDialogFragment.f326109k0 = new com.avito.android.virtual_deal_room.client_edit.f(this.f326139a, this.f326140b, this.f326141c);
        }
    }

    /* compiled from: DaggerClientEditComponent.java */
    public static final class c implements a.b {
        public c() {
        }

        @Override // com.avito.android.virtual_deal_room.client_edit.di.a.b
        public final com.avito.android.virtual_deal_room.client_edit.di.a a(HN0.a aVar, C28478k c28478k, ClientEditArguments clientEditArguments, l lVar, Lifecycle lifecycle, C22977J c22977j) {
            clientEditArguments.getClass();
            return new C10082b(aVar, c28478k, clientEditArguments, lVar, lifecycle, c22977j, null);
        }
    }

    public static a.b a() {
        return new c();
    }
}
