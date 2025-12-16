package com.squareup.tape2;

import com.squareup.tape2.c;
import com.squareup.tape2.e;
import com.squareup.tape2.e.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: FileObjectQueue.java */
/* loaded from: classes7.dex */
final class a<T> extends c<T> {

    /* renamed from: b, reason: collision with root package name */
    public final e f366477b;

    /* renamed from: c, reason: collision with root package name */
    public final C10813a f366478c = new C10813a();

    /* renamed from: d, reason: collision with root package name */
    public final c.a<T> f366479d;

    /* compiled from: FileObjectQueue.java */
    /* renamed from: com.squareup.tape2.a$a, reason: collision with other inner class name */
    public static class C10813a extends ByteArrayOutputStream {
        public final byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* compiled from: FileObjectQueue.java */
    public final class b implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<byte[]> f366480b;

        public b(Iterator<byte[]> it) {
            this.f366480b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f366480b.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            try {
                return a.this.f366479d.b((byte[]) ((e.c) this.f366480b).next());
            } catch (IOException e12) {
                throw new RuntimeException("todo: throw a proper error", e12);
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f366480b.remove();
        }
    }

    public a(e eVar, c.a<T> aVar) {
        this.f366477b = eVar;
        this.f366479d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[LOOP:0: B:20:0x0061->B:55:0x0162, LOOP_START, PHI: r0 r5
  0x0061: PHI (r0v10 long) = (r0v5 long), (r0v11 long) binds: [B:18:0x005d, B:55:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r5v1 long) = (r5v0 long), (r5v15 long) binds: [B:18:0x005d, B:55:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // com.squareup.tape2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.tape2.a.a(java.lang.Object):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f366477b.close();
    }

    @Override // com.squareup.tape2.c
    public final void d(int i12) {
        this.f366477b.g(i12);
    }

    @Override // com.squareup.tape2.c
    public final boolean isEmpty() {
        return this.f366477b.f366494f == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        e eVar = this.f366477b;
        eVar.getClass();
        return new b(eVar.new c());
    }

    @Override // com.squareup.tape2.c
    public final int size() {
        return this.f366477b.f366494f;
    }
}
