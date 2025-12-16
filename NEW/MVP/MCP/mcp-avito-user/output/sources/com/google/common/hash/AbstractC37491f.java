package com.google.common.hash;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: AbstractNonStreamingHashFunction.java */
@InterfaceC37497l
@aZ0.j
/* renamed from: com.google.common.hash.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37491f extends AbstractC37489d {

    /* compiled from: AbstractNonStreamingHashFunction.java */
    /* renamed from: com.google.common.hash.f$a */
    public final class a extends AbstractC37490e {

        /* renamed from: a, reason: collision with root package name */
        public final b f360246a = new b(32);

        public a() {
        }

        @Override // com.google.common.hash.s
        public final q e() {
            b bVar = this.f360246a;
            byte[] bArrA = bVar.a();
            return AbstractC37491f.this.c(bVar.b(), bArrA);
        }

        @Override // com.google.common.hash.s
        public final s f(byte b12) throws IOException {
            this.f360246a.write(b12);
            return this;
        }

        @Override // com.google.common.hash.AbstractC37490e
        public final s h(int i12, byte[] bArr) throws IOException {
            this.f360246a.write(bArr, 0, i12);
            return this;
        }
    }

    /* compiled from: AbstractNonStreamingHashFunction.java */
    /* renamed from: com.google.common.hash.f$b */
    public static final class b extends ByteArrayOutputStream {
        public final byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final int b() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    @Override // com.google.common.hash.r
    public final s a() {
        return new a();
    }

    public abstract q c(int i12, byte[] bArr);
}
