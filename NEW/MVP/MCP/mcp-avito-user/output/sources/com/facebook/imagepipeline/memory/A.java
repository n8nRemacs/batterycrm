package com.facebook.imagepipeline.memory;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MemoryPooledByteBufferFactory.java */
@J41.d
@Nullsafe
/* loaded from: classes13.dex */
public class A implements wW0.g {

    /* renamed from: a, reason: collision with root package name */
    public final wW0.j f340410a;

    /* renamed from: b, reason: collision with root package name */
    public final x f340411b;

    public A(x xVar, wW0.j jVar) {
        this.f340411b = xVar;
        this.f340410a = jVar;
    }

    @Override // wW0.g
    public final z a(InputStream inputStream) throws Throwable {
        x xVar = this.f340411b;
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(xVar, xVar.f340489j[0]);
        try {
            this.f340410a.a(inputStream, memoryPooledByteBufferOutputStream);
            if (!com.facebook.common.references.a.k(memoryPooledByteBufferOutputStream.f340448c)) {
                throw new MemoryPooledByteBufferOutputStream.InvalidStreamException();
            }
            com.facebook.common.references.a<w> aVar = memoryPooledByteBufferOutputStream.f340448c;
            aVar.getClass();
            return new z(aVar, memoryPooledByteBufferOutputStream.f340449d);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // wW0.g
    public final z b(int i12, InputStream inputStream) throws Throwable {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f340411b, i12);
        try {
            this.f340410a.a(inputStream, memoryPooledByteBufferOutputStream);
            if (!com.facebook.common.references.a.k(memoryPooledByteBufferOutputStream.f340448c)) {
                throw new MemoryPooledByteBufferOutputStream.InvalidStreamException();
            }
            com.facebook.common.references.a<w> aVar = memoryPooledByteBufferOutputStream.f340448c;
            aVar.getClass();
            return new z(aVar, memoryPooledByteBufferOutputStream.f340449d);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // wW0.g
    public final MemoryPooledByteBufferOutputStream c() {
        x xVar = this.f340411b;
        return new MemoryPooledByteBufferOutputStream(xVar, xVar.f340489j[0]);
    }

    @Override // wW0.g
    public final z d(byte[] bArr) throws Throwable {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f340411b, bArr.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bArr, 0, bArr.length);
                if (!com.facebook.common.references.a.k(memoryPooledByteBufferOutputStream.f340448c)) {
                    throw new MemoryPooledByteBufferOutputStream.InvalidStreamException();
                }
                com.facebook.common.references.a<w> aVar = memoryPooledByteBufferOutputStream.f340448c;
                aVar.getClass();
                return new z(aVar, memoryPooledByteBufferOutputStream.f340449d);
            } catch (IOException e12) {
                com.facebook.common.internal.u.a(e12);
                throw null;
            }
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // wW0.g
    public final MemoryPooledByteBufferOutputStream e(int i12) {
        return new MemoryPooledByteBufferOutputStream(this.f340411b, i12);
    }
}
