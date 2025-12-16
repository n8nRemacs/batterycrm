package com.google.net.cronet.okhttptransport;

import com.google.common.base.M;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.D0;
import com.google.common.util.concurrent.InterfaceC37564s0;
import com.google.net.cronet.okhttptransport.n;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okio.C44800j;
import okio.i0;

/* compiled from: CronetCallFactory.java */
/* loaded from: classes14.dex */
public final class b implements Call.Factory {

    /* renamed from: b, reason: collision with root package name */
    public final n f362501b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f362502c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362503d;

    /* renamed from: e, reason: collision with root package name */
    public final int f362504e;

    /* renamed from: f, reason: collision with root package name */
    public final int f362505f;

    /* compiled from: CronetCallFactory.java */
    public static final class a extends o<a, b> {
    }

    /* compiled from: CronetCallFactory.java */
    /* renamed from: com.google.net.cronet.okhttptransport.b$b, reason: collision with other inner class name */
    public static class C10745b implements Call {

        /* renamed from: b, reason: collision with root package name */
        public final Request f362506b;

        /* renamed from: c, reason: collision with root package name */
        public final b f362507c;

        /* renamed from: d, reason: collision with root package name */
        public final n f362508d;

        /* renamed from: e, reason: collision with root package name */
        public final ExecutorService f362509e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f362510f = new AtomicBoolean();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f362511g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference<n.a> f362512h = new AtomicReference<>();

        /* renamed from: i, reason: collision with root package name */
        public final C44800j f362513i;

        /* compiled from: CronetCallFactory.java */
        /* renamed from: com.google.net.cronet.okhttptransport.b$b$a */
        public class a implements InterfaceC37564s0<Response> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Callback f362514a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C10745b f362515b;

            public a(Callback callback, C10745b c10745b) {
                this.f362514a = callback;
                this.f362515b = c10745b;
            }

            @Override // com.google.common.util.concurrent.InterfaceC37564s0
            public final void a(Throwable th2) {
                boolean z12 = th2 instanceof IOException;
                C10745b c10745b = this.f362515b;
                Callback callback = this.f362514a;
                if (z12) {
                    callback.onFailure(c10745b, (IOException) th2);
                } else {
                    callback.onFailure(c10745b, new IOException(th2));
                }
            }

            @Override // com.google.common.util.concurrent.InterfaceC37564s0
            public final void onSuccess(Response response) {
                Response response2 = response;
                try {
                    Callback callback = this.f362514a;
                    C10745b c10745b = this.f362515b;
                    response2.body().getClass();
                    callback.onResponse(c10745b, response2.newBuilder().body(new com.google.net.cronet.okhttptransport.a(response2.body(), c10745b)).build());
                } catch (IOException unused) {
                    C10745b.this.f362506b.url().redact();
                }
            }
        }

        public C10745b(Request request, b bVar, n nVar, ExecutorService executorService, com.google.net.cronet.okhttptransport.a aVar) {
            this.f362506b = request;
            this.f362507c = bVar;
            this.f362508d = nVar;
            this.f362509e = executorService;
            c cVar = new c(this);
            this.f362513i = cVar;
            cVar.timeout(bVar.f362505f, TimeUnit.MILLISECONDS);
        }

        public final void a() throws IOException {
            if (this.f362511g.get()) {
                throw new IOException("Can't execute canceled requests");
            }
            M.n("Already Executed", !this.f362510f.getAndSet(true));
        }

        @Override // okhttp3.Call
        public final void cancel() {
            n.a aVar;
            if (this.f362511g.getAndSet(true) || (aVar = this.f362512h.get()) == null) {
                return;
            }
            aVar.f362570a.cancel();
        }

        public final void e() {
            n.a aVar = this.f362512h.get();
            M.n("convertedRequestAndResponse must be set!", aVar != null);
            if (this.f362511g.get()) {
                aVar.f362570a.cancel();
            } else {
                aVar.f362570a.start();
            }
        }

        @Override // okhttp3.Call
        public final void enqueue(Callback callback) {
            C44800j c44800j = this.f362513i;
            try {
                c44800j.enter();
                a();
                n nVar = this.f362508d;
                Request request = this.f362506b;
                b bVar = this.f362507c;
                n.a aVarA = nVar.a(request, bVar.f362503d, bVar.f362504e);
                this.f362512h.set(aVarA);
                m mVar = aVarA.f362571b;
                q qVar = mVar.f362564c.f362567c;
                g gVar = mVar.f362563b;
                C37568u0.a(new C37568u0.b(false, AbstractC37401r1.w(new D0[]{gVar.f362529e, gVar.f362525a}), null).a(new p(qVar, mVar.f362562a, gVar)), new a(callback, this), this.f362509e);
                e();
            } catch (IOException e12) {
                c44800j.exit();
                callback.onFailure(this, e12);
            }
        }

        @Override // okhttp3.Call
        public final Response execute() throws IOException {
            C44800j c44800j = this.f362513i;
            a();
            try {
                c44800j.enter();
                n nVar = this.f362508d;
                Request request = this.f362506b;
                b bVar = this.f362507c;
                n.a aVarA = nVar.a(request, bVar.f362503d, bVar.f362504e);
                this.f362512h.set(aVarA);
                e();
                Response responseA = aVarA.f362571b.a();
                responseA.body().getClass();
                return responseA.newBuilder().body(new com.google.net.cronet.okhttptransport.a(responseA.body(), this)).build();
            } catch (IOException | RuntimeException e12) {
                c44800j.exit();
                throw e12;
            }
        }

        @Override // okhttp3.Call
        public final boolean isCanceled() {
            return this.f362511g.get();
        }

        @Override // okhttp3.Call
        public final boolean isExecuted() {
            return this.f362510f.get();
        }

        @Override // okhttp3.Call
        public final Request request() {
            return this.f362506b;
        }

        @Override // okhttp3.Call
        public final i0 timeout() {
            return this.f362513i;
        }

        @Override // okhttp3.Call
        public final Call clone() {
            return this.f362507c.newCall(this.f362506b);
        }
    }

    public b(n nVar, ExecutorService executorService, int i12, int i13, int i14, com.google.net.cronet.okhttptransport.a aVar) {
        M.d("Read timeout mustn't be negative!", i12 >= 0);
        M.d("Write timeout mustn't be negative!", i13 >= 0);
        M.d("Call timeout mustn't be negative!", i14 >= 0);
        this.f362501b = nVar;
        this.f362502c = executorService;
        this.f362503d = i12;
        this.f362504e = i13;
        this.f362505f = i14;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        return new C10745b(request, this, this.f362501b, this.f362502c, null);
    }
}
