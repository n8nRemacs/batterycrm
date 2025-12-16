package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import uW0.C48986a;
import wW0.InterfaceC49570a;

/* compiled from: PartialDiskCacheProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class Y implements i0<YW0.d> {

    /* compiled from: PartialDiskCacheProducer.java */
    public static class a extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final C36378k f340622c;

        /* renamed from: d, reason: collision with root package name */
        public final com.facebook.cache.common.c f340623d;

        /* renamed from: e, reason: collision with root package name */
        public final wW0.g f340624e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC49570a f340625f;

        /* renamed from: g, reason: collision with root package name */
        @I41.h
        public final YW0.d f340626g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f340627h;

        public a() {
            throw null;
        }

        public a(InterfaceC36410l interfaceC36410l, C36378k c36378k, com.facebook.cache.common.c cVar, wW0.g gVar, InterfaceC49570a interfaceC49570a, YW0.d dVar, boolean z12, W w12) {
            super(interfaceC36410l);
            this.f340622c = c36378k;
            this.f340623d = cVar;
            this.f340624e = gVar;
            this.f340625f = interfaceC49570a;
            this.f340626g = dVar;
            this.f340627h = z12;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) throws Throwable {
            YW0.d dVar = (YW0.d) obj;
            if (AbstractC36395b.f(i12)) {
                return;
            }
            com.facebook.cache.common.c cVar = this.f340623d;
            C36378k c36378k = this.f340622c;
            InterfaceC36410l<O> interfaceC36410l = this.f340716b;
            YW0.d dVar2 = this.f340626g;
            if (dVar2 != null && dVar != null && dVar.f19506j != null) {
                try {
                    try {
                        o(n(dVar2, dVar));
                    } catch (IOException e12) {
                        C48986a.c("PartialDiskCacheProducer", "Error while merging image data", e12);
                        interfaceC36410l.a(e12);
                    }
                    c36378k.e(cVar);
                    return;
                } finally {
                    dVar.close();
                    dVar2.close();
                }
            }
            if (this.f340627h && AbstractC36395b.l(i12, 8) && AbstractC36395b.e(i12) && dVar != null) {
                dVar.m();
                if (dVar.f19499c != RW0.c.f14507b) {
                    c36378k.d(cVar, dVar);
                    interfaceC36410l.c(i12, dVar);
                    return;
                }
            }
            interfaceC36410l.c(i12, dVar);
        }

        public final void m(InputStream inputStream, wW0.i iVar, int i12) throws IOException {
            InterfaceC49570a interfaceC49570a = this.f340625f;
            byte[] bArr = interfaceC49570a.get(Http2.INITIAL_MAX_FRAME_SIZE);
            int i13 = i12;
            while (i13 > 0) {
                try {
                    int i14 = inputStream.read(bArr, 0, Math.min(Http2.INITIAL_MAX_FRAME_SIZE, i13));
                    if (i14 < 0) {
                        break;
                    } else if (i14 > 0) {
                        iVar.write(bArr, 0, i14);
                        i13 -= i14;
                    }
                } finally {
                    interfaceC49570a.a(bArr);
                }
            }
            if (i13 > 0) {
                throw new IOException(androidx.appcompat.app.r.l(i12, i13, "Failed to read ", " bytes - finished ", " short"));
            }
        }

        public final wW0.i n(YW0.d dVar, YW0.d dVar2) throws IOException {
            UW0.a aVar = dVar2.f19506j;
            aVar.getClass();
            int iG2 = dVar2.g();
            int i12 = aVar.f16405a;
            MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStreamE = this.f340624e.e(iG2 + i12);
            InputStream inputStreamF = dVar.f();
            inputStreamF.getClass();
            m(inputStreamF, memoryPooledByteBufferOutputStreamE, i12);
            InputStream inputStreamF2 = dVar2.f();
            inputStreamF2.getClass();
            m(inputStreamF2, memoryPooledByteBufferOutputStreamE, dVar2.g());
            return memoryPooledByteBufferOutputStreamE;
        }

        public final void o(wW0.i iVar) throws Throwable {
            YW0.d dVar;
            Throwable th2;
            com.facebook.common.references.a aVarM = com.facebook.common.references.a.m(iVar.a());
            try {
                dVar = new YW0.d(aVarM);
            } catch (Throwable th3) {
                dVar = null;
                th2 = th3;
            }
            try {
                dVar.h();
                this.f340716b.c(1, dVar);
                YW0.d.b(dVar);
                com.facebook.common.references.a.c(aVarM);
            } catch (Throwable th4) {
                th2 = th4;
                YW0.d.b(dVar);
                com.facebook.common.references.a.c(aVarM);
                throw th2;
            }
        }
    }

    @j.k0
    @I41.h
    public static Map<String, String> c(m0 m0Var, k0 k0Var, boolean z12, int i12) {
        if (m0Var.d(k0Var, "PartialDiskCacheProducer")) {
            return z12 ? com.facebook.common.internal.k.b("cached_value_found", String.valueOf(z12), "encodedImageSize", String.valueOf(i12)) : com.facebook.common.internal.k.a("cached_value_found", String.valueOf(z12));
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        ImageRequest imageRequestJ = k0Var.j();
        k0Var.j().getClass();
        k0Var.i().c(k0Var, "PartialDiskCacheProducer");
        imageRequestJ.f340782b.buildUpon().appendQueryParameter("fresco_partial", "true").build();
        throw null;
    }

    public final void d(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var, com.facebook.cache.common.c cVar, @I41.h YW0.d dVar) {
        k0Var.j().getClass();
        new a(interfaceC36410l, null, cVar, null, null, dVar, true, null);
        throw null;
    }
}
