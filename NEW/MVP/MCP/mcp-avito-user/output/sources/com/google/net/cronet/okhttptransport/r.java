package com.google.net.cronet.okhttptransport;

import android.util.Pair;
import com.google.common.base.M;
import com.google.common.util.concurrent.e1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okio.C44802l;
import okio.c0;
import okio.i0;

/* compiled from: UploadBodyDataBroker.java */
/* loaded from: classes14.dex */
final class r implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayBlockingQueue f362578b = new ArrayBlockingQueue(1);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f362579c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<Throwable> f362580d = new AtomicReference<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UploadBodyDataBroker.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f362581b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f362582c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f362583d;

        static {
            a aVar = new a("SUCCESS", 0);
            f362581b = aVar;
            a aVar2 = new a("END_OF_BODY", 1);
            f362582c = aVar2;
            f362583d = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f362583d.clone();
        }
    }

    public final Pair<ByteBuffer, e1<a>> a() throws IOException {
        try {
            return (Pair) this.f362578b.take();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for a read to finish!");
        }
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f362579c.set(true);
    }

    @Override // okio.c0
    /* renamed from: timeout */
    public final i0 getF420032c() {
        return i0.NONE;
    }

    @Override // okio.c0
    public final void write(C44802l c44802l, long j12) throws IOException {
        M.q(!this.f362579c.get());
        while (j12 != 0) {
            Pair<ByteBuffer, e1<a>> pairA = a();
            ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
            e1 e1Var = (e1) pairA.second;
            int iLimit = byteBuffer.limit();
            byteBuffer.limit((int) Math.min(iLimit, j12));
            try {
                long j13 = c44802l.read(byteBuffer);
                if (j13 == -1) {
                    IOException iOException = new IOException("The source has been exhausted but we expected more!");
                    e1Var.o(iOException);
                    throw iOException;
                }
                j12 -= j13;
                byteBuffer.limit(iLimit);
                e1Var.n(a.f362581b);
            } catch (IOException e12) {
                e1Var.o(e12);
                throw e12;
            }
        }
    }

    @Override // okio.c0, java.io.Flushable
    public final void flush() {
    }
}
