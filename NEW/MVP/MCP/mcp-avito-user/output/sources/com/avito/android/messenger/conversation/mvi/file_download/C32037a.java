package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32056u;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import okhttp3.OkHttpClient;
import ru.avito.messenger.C0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerFileDownloadWorkerComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32037a {

    /* compiled from: DaggerFileDownloadWorkerComponent.java */
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$b */
    public static final class b implements InterfaceC32056u.a {
        public b() {
        }
    }

    /* compiled from: DaggerFileDownloadWorkerComponent.java */
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c */
    public static final class c implements InterfaceC32056u {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC32057v f190883a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<w0> f190884b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32024m> f190885c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47842z> f190886d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<OkHttpClient> f190887e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<C0> f190888f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.service.d> f190889g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32046j> f190890h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.n> f190891i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f190892j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f190893k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.notification.m> f190894l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<w> f190895m;

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$a, reason: collision with other inner class name */
        public static final class C5645a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190896a;

            public C5645a(InterfaceC32057v interfaceC32057v) {
                this.f190896a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f190896a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$b */
        public static final class b implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.n> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190897a;

            public b(InterfaceC32057v interfaceC32057v) {
                this.f190897a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.file_attachment.n nVarA2 = this.f190897a.a2();
                dagger.internal.t.c(nVarA2);
                return nVarA2;
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$c, reason: collision with other inner class name */
        public static final class C5646c implements dagger.internal.u<InterfaceC32024m> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190898a;

            public C5646c(InterfaceC32057v interfaceC32057v) {
                this.f190898a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32024m interfaceC32024mP1 = this.f190898a.P1();
                dagger.internal.t.c(interfaceC32024mP1);
                return interfaceC32024mP1;
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$d */
        public static final class d implements dagger.internal.u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190899a;

            public d(InterfaceC32057v interfaceC32057v) {
                this.f190899a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f190899a.d0();
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$e */
        public static final class e implements dagger.internal.u<com.avito.android.messenger.service.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190900a;

            public e(InterfaceC32057v interfaceC32057v) {
                this.f190900a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f190900a.yh();
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$f */
        public static final class f implements dagger.internal.u<com.avito.android.notification.m> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190901a;

            public f(InterfaceC32057v interfaceC32057v) {
                this.f190901a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.notification.m mVarA0 = this.f190901a.A0();
                dagger.internal.t.c(mVarA0);
                return mVarA0;
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$g */
        public static final class g implements dagger.internal.u<OkHttpClient> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190902a;

            public g(InterfaceC32057v interfaceC32057v) {
                this.f190902a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                OkHttpClient okHttpClientN4 = this.f190902a.n4();
                dagger.internal.t.c(okHttpClientN4);
                return okHttpClientN4;
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$h */
        public static final class h implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190903a;

            public h(InterfaceC32057v interfaceC32057v) {
                this.f190903a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f190903a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$i */
        public static final class i implements dagger.internal.u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190904a;

            public i(InterfaceC32057v interfaceC32057v) {
                this.f190904a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f190904a.li();
            }
        }

        /* compiled from: DaggerFileDownloadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.a$c$j */
        public static final class j implements dagger.internal.u<w0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32057v f190905a;

            public j(InterfaceC32057v interfaceC32057v) {
                this.f190905a = interfaceC32057v;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                w0 w0VarK0 = this.f190905a.k0();
                dagger.internal.t.c(w0VarK0);
                return w0VarK0;
            }
        }

        public c(InterfaceC32057v interfaceC32057v, C5644a c5644a) {
            this.f190883a = interfaceC32057v;
            this.f190884b = new j(interfaceC32057v);
            this.f190885c = new C5646c(interfaceC32057v);
            this.f190886d = new d(interfaceC32057v);
            dagger.internal.u<InterfaceC32046j> uVarA = dagger.internal.B.a(new C32048l(new g(interfaceC32057v), new i(interfaceC32057v), new e(interfaceC32057v)));
            this.f190890h = uVarA;
            this.f190895m = dagger.internal.B.a(new L(uVarA, this.f190884b, this.f190885c, this.f190886d, new b(interfaceC32057v), new C5645a(interfaceC32057v), new h(interfaceC32057v), new f(interfaceC32057v)));
        }
    }
}
