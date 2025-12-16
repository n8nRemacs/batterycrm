package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32061b0;
import com.avito.android.messenger.conversation.mvi.file_upload.Q;
import com.avito.android.messenger.conversation.mvi.file_upload.S;
import com.avito.android.messenger.conversation.mvi.file_upload.worker.i;
import com.avito.android.messenger.w0;
import com.avito.android.remote.R0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;

/* compiled from: DaggerFileUploadWorkerComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerFileUploadWorkerComponent.java */
    public static final class b implements i.a {
        public b() {
        }
    }

    /* compiled from: DaggerFileUploadWorkerComponent.java */
    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<w0> f191263a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f191264b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32061b0> f191265c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<R0> f191266d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<q> f191267e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32024m> f191268f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.n> f191269g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<C31667x> f191270h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<k> f191271i;

        /* compiled from: DaggerFileUploadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.worker.a$c$a, reason: collision with other inner class name */
        public static final class C5652a implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.n> {

            /* renamed from: a, reason: collision with root package name */
            public final j f191272a;

            public C5652a(j jVar) {
                this.f191272a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.file_attachment.n nVarA2 = this.f191272a.a2();
                dagger.internal.t.c(nVarA2);
                return nVarA2;
            }
        }

        /* compiled from: DaggerFileUploadWorkerComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC32024m> {

            /* renamed from: a, reason: collision with root package name */
            public final j f191273a;

            public b(j jVar) {
                this.f191273a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32024m interfaceC32024mP1 = this.f191273a.P1();
                dagger.internal.t.c(interfaceC32024mP1);
                return interfaceC32024mP1;
            }
        }

        /* compiled from: DaggerFileUploadWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.worker.a$c$c, reason: collision with other inner class name */
        public static final class C5653c implements dagger.internal.u<C31667x> {

            /* renamed from: a, reason: collision with root package name */
            public final j f191274a;

            public C5653c(j jVar) {
                this.f191274a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f191274a.y2();
            }
        }

        /* compiled from: DaggerFileUploadWorkerComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC32061b0> {

            /* renamed from: a, reason: collision with root package name */
            public final j f191275a;

            public d(j jVar) {
                this.f191275a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32061b0 interfaceC32061b0H6 = this.f191275a.H6();
                dagger.internal.t.c(interfaceC32061b0H6);
                return interfaceC32061b0H6;
            }
        }

        /* compiled from: DaggerFileUploadWorkerComponent.java */
        public static final class e implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final j f191276a;

            public e(j jVar) {
                this.f191276a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0F2 = this.f191276a.f2();
                dagger.internal.t.c(r0F2);
                return r0F2;
            }
        }

        /* compiled from: DaggerFileUploadWorkerComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final j f191277a;

            public f(j jVar) {
                this.f191277a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f191277a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerFileUploadWorkerComponent.java */
        public static final class g implements dagger.internal.u<w0> {

            /* renamed from: a, reason: collision with root package name */
            public final j f191278a;

            public g(j jVar) {
                this.f191278a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                w0 w0VarK0 = this.f191278a.k0();
                dagger.internal.t.c(w0VarK0);
                return w0VarK0;
            }
        }

        public c(Q q12, j jVar, C5651a c5651a) {
            dagger.internal.u<q> uVarA = B.a(new u(new g(jVar), new f(jVar), new d(jVar), new S(q12, new e(jVar))));
            this.f191267e = uVarA;
            this.f191271i = B.a(new p(uVarA, new b(jVar), new C5652a(jVar), new C5653c(jVar)));
        }
    }
}
