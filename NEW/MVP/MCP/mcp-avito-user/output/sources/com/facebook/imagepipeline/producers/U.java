package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.producers.V;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import wW0.InterfaceC49570a;

/* compiled from: NetworkFetchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class U implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final wW0.g f340611a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC49570a f340612b;

    /* renamed from: c, reason: collision with root package name */
    public final V f340613c;

    /* compiled from: NetworkFetchProducer.java */
    public class a implements V.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f340614a;

        public a(A a12) {
            this.f340614a = a12;
        }

        @Override // com.facebook.imagepipeline.producers.V.a
        public final void a(int i12, InputStream inputStream) throws Throwable {
            com.facebook.imagepipeline.systrace.b.a();
            U u12 = U.this;
            wW0.g gVar = u12.f340611a;
            MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStreamE = i12 > 0 ? gVar.e(i12) : gVar.c();
            InterfaceC49570a interfaceC49570a = u12.f340612b;
            byte[] bArr = interfaceC49570a.get(Http2.INITIAL_MAX_FRAME_SIZE);
            while (true) {
                try {
                    int i13 = inputStream.read(bArr);
                    V v12 = u12.f340613c;
                    A a12 = this.f340614a;
                    if (i13 < 0) {
                        v12.b(a12);
                        u12.c(memoryPooledByteBufferOutputStreamE, a12);
                        interfaceC49570a.a(bArr);
                        memoryPooledByteBufferOutputStreamE.close();
                        com.facebook.imagepipeline.systrace.b.a();
                        return;
                    }
                    if (i13 > 0) {
                        boolean zC2 = false;
                        memoryPooledByteBufferOutputStreamE.write(bArr, 0, i13);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        if (a12.f340513b.h()) {
                            zC2 = v12.c(a12);
                        }
                        InterfaceC36410l<YW0.d> interfaceC36410l = a12.f340512a;
                        if (zC2 && jUptimeMillis - a12.f340514c >= 100) {
                            a12.f340514c = jUptimeMillis;
                            k0 k0Var = a12.f340513b;
                            k0Var.i().a(k0Var);
                            U.d(memoryPooledByteBufferOutputStreamE, a12.f340515d, a12.f340516e, interfaceC36410l, k0Var);
                        }
                        interfaceC36410l.d(i12 > 0 ? memoryPooledByteBufferOutputStreamE.f340449d / i12 : 1.0f - ((float) Math.exp((-r8) / 50000.0d)));
                    }
                } catch (Throwable th2) {
                    interfaceC49570a.a(bArr);
                    memoryPooledByteBufferOutputStreamE.close();
                    throw th2;
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.V.a
        public final void b() {
            U.this.getClass();
            A a12 = this.f340614a;
            a12.f340513b.i().f(a12.f340513b, "NetworkFetchProducer");
            a12.f340512a.b();
        }

        @Override // com.facebook.imagepipeline.producers.V.a
        public final void onFailure(Exception exc) {
            U.this.getClass();
            A a12 = this.f340614a;
            m0 m0VarI = a12.f340513b.i();
            k0 k0Var = a12.f340513b;
            m0VarI.h(k0Var, "NetworkFetchProducer", exc, null);
            k0Var.i().b(k0Var, "NetworkFetchProducer", false);
            k0Var.l("network");
            a12.f340512a.a(exc);
        }
    }

    public U(wW0.g gVar, InterfaceC49570a interfaceC49570a, V v12) {
        this.f340611a = gVar;
        this.f340612b = interfaceC49570a;
        this.f340613c = v12;
    }

    public static void d(wW0.i iVar, int i12, @I41.h UW0.a aVar, InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) throws Throwable {
        com.facebook.common.references.a aVarM = com.facebook.common.references.a.m(iVar.a());
        YW0.d dVar = null;
        try {
            YW0.d dVar2 = new YW0.d(aVarM);
            try {
                dVar2.f19506j = aVar;
                dVar2.h();
                k0Var.getClass();
                interfaceC36410l.c(i12, dVar2);
                YW0.d.b(dVar2);
                com.facebook.common.references.a.c(aVarM);
            } catch (Throwable th2) {
                th = th2;
                dVar = dVar2;
                YW0.d.b(dVar);
                com.facebook.common.references.a.c(aVarM);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        k0Var.i().c(k0Var, "NetworkFetchProducer");
        V v12 = this.f340613c;
        A a12 = v12.a(interfaceC36410l, k0Var);
        v12.e(a12, new a(a12));
    }

    public final void c(wW0.i iVar, A a12) throws Throwable {
        int size = iVar.size();
        m0 m0VarI = a12.f340513b.i();
        k0 k0Var = a12.f340513b;
        Map<String, String> mapD = !m0VarI.d(k0Var, "NetworkFetchProducer") ? null : this.f340613c.d(a12, size);
        m0 m0VarI2 = k0Var.i();
        m0VarI2.j(k0Var, "NetworkFetchProducer", mapD);
        m0VarI2.b(k0Var, "NetworkFetchProducer", true);
        k0Var.l("network");
        d(iVar, 1 | a12.f340515d, a12.f340516e, a12.f340512a, k0Var);
    }
}
