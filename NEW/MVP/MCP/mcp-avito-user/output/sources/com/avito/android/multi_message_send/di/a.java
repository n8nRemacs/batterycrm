package com.avito.android.multi_message_send.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.multi_message_send.di.e;
import com.avito.android.multi_message_send.mvi.p;
import com.avito.android.multi_message_send.mvi.r;
import com.avito.android.multi_message_send.mvi.v;
import com.avito.android.multi_message_send.view.MultiMessageSendActivity;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.t;
import dagger.internal.u;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;

/* compiled from: DaggerMultiMessageSendComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMultiMessageSendComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.multi_message_send.di.e.a
        public final e a(i iVar, long j12, String str, String str2) {
            return new c(iVar, Long.valueOf(j12), str, str2, null);
        }
    }

    /* compiled from: DaggerMultiMessageSendComponent.java */
    public static final class c implements com.avito.android.multi_message_send.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final u<A20.a> f206658a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f206659b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.multi_message_send.domain.f f206660c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.multi_message_send.mvi.m f206661d;

        /* renamed from: e, reason: collision with root package name */
        public final u<A> f206662e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35863o4> f206663f;

        /* renamed from: g, reason: collision with root package name */
        public final u<F0> f206664g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.multi_message_send.domain.m f206665h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f206666i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.multi_message_send.mvi.k f206667j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f206668k;

        /* renamed from: l, reason: collision with root package name */
        public final v f206669l;

        /* compiled from: DaggerMultiMessageSendComponent.java */
        /* renamed from: com.avito.android.multi_message_send.di.a$c$a, reason: collision with other inner class name */
        public static final class C6159a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f206670a;

            public C6159a(i iVar) {
                this.f206670a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f206670a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMultiMessageSendComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final i f206671a;

            public b(i iVar) {
                this.f206671a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f206671a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMultiMessageSendComponent.java */
        /* renamed from: com.avito.android.multi_message_send.di.a$c$c, reason: collision with other inner class name */
        public static final class C6160c implements u<A> {

            /* renamed from: a, reason: collision with root package name */
            public final i f206672a;

            public C6160c(i iVar) {
                this.f206672a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A aD2 = this.f206672a.D2();
                t.c(aD2);
                return aD2;
            }
        }

        /* compiled from: DaggerMultiMessageSendComponent.java */
        public static final class d implements u<A20.a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f206673a;

            public d(i iVar) {
                this.f206673a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A20.a aVarDh = this.f206673a.Dh();
                t.c(aVarDh);
                return aVarDh;
            }
        }

        /* compiled from: DaggerMultiMessageSendComponent.java */
        public static final class e implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final i f206674a;

            public e(i iVar) {
                this.f206674a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f206674a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerMultiMessageSendComponent.java */
        public static final class f implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final i f206675a;

            public f(i iVar) {
                this.f206675a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f206675a.ad();
            }
        }

        public c(i iVar, Long l12, String str, String str2, C6158a c6158a) {
            dagger.internal.l lVarA = dagger.internal.l.a(l12);
            d dVar = new d(iVar);
            b bVar = new b(iVar);
            com.avito.android.multi_message_send.domain.f fVar = new com.avito.android.multi_message_send.domain.f(lVarA, dVar, bVar);
            this.f206660c = fVar;
            this.f206661d = new com.avito.android.multi_message_send.mvi.m(fVar);
            this.f206665h = new com.avito.android.multi_message_send.domain.m(dVar, new C6160c(iVar), new e(iVar), bVar, new f(iVar));
            this.f206667j = new com.avito.android.multi_message_send.mvi.k(this.f206660c, this.f206665h, dagger.internal.l.a(str2), new C6159a(iVar));
            this.f206668k = dagger.internal.l.a(str);
            this.f206669l = new v(new p(this.f206661d, this.f206667j, r.a(), com.avito.android.multi_message_send.mvi.t.a(), this.f206668k));
        }

        @Override // com.avito.android.multi_message_send.di.e
        public final void a(MultiMessageSendActivity multiMessageSendActivity) {
            multiMessageSendActivity.f206805m = this.f206669l;
        }
    }

    public static e.a a() {
        return new b();
    }
}
