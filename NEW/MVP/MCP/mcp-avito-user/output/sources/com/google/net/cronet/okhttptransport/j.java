package com.google.net.cronet.okhttptransport;

import android.util.Pair;
import androidx.compose.foundation.H;
import com.google.common.base.VerifyException;
import com.google.common.base.d0;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.D0;
import com.google.common.util.concurrent.H0;
import com.google.common.util.concurrent.Q0;
import com.google.common.util.concurrent.e1;
import com.google.net.cronet.okhttptransport.j;
import com.google.net.cronet.okhttptransport.r;
import j.k0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.RequestBody;
import okio.C44802l;
import okio.X;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: RequestBodyConverterImpl.java */
/* loaded from: classes14.dex */
final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final b f362546a;

    /* renamed from: b, reason: collision with root package name */
    public final c f362547b;

    /* compiled from: RequestBodyConverterImpl.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362548a;

        static {
            int[] iArr = new int[r.a.values().length];
            f362548a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362548a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: RequestBodyConverterImpl.java */
    @k0
    public static final class b implements i {

        /* compiled from: RequestBodyConverterImpl.java */
        class a extends UploadDataProvider {

            /* renamed from: b, reason: collision with root package name */
            public volatile boolean f362549b = false;

            /* renamed from: c, reason: collision with root package name */
            public final C44802l f362550c = new C44802l();

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f362551d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ RequestBody f362552e;

            public a(long j12, RequestBody requestBody) {
                this.f362551d = j12;
                this.f362552e = requestBody;
            }

            @Override // org.chromium.net.UploadDataProvider
            public final long getLength() {
                return this.f362551d;
            }

            @Override // org.chromium.net.UploadDataProvider
            public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                if (!this.f362549b) {
                    this.f362552e.writeTo(this.f362550c);
                    this.f362550c.getClass();
                    this.f362549b = true;
                    long j12 = this.f362551d;
                    long j13 = this.f362550c.f420125c;
                    if (j13 != j12) {
                        StringBuilder sbQ = H.q(j12, "Expected ", " bytes but got ");
                        sbQ.append(j13);
                        throw new IOException(sbQ.toString());
                    }
                }
                if (this.f362550c.read(byteBuffer) == -1) {
                    throw new IllegalStateException("The source has been exhausted but we expected more!");
                }
                uploadDataSink.onReadSucceeded(false);
            }

            @Override // org.chromium.net.UploadDataProvider
            public final void rewind(UploadDataSink uploadDataSink) {
                uploadDataSink.onRewindError(new UnsupportedOperationException());
            }
        }
    }

    /* compiled from: RequestBodyConverterImpl.java */
    @k0
    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public final ExecutorService f362553a;

        /* compiled from: RequestBodyConverterImpl.java */
        public static class a extends UploadDataProvider {

            /* renamed from: b, reason: collision with root package name */
            public final RequestBody f362554b;

            /* renamed from: c, reason: collision with root package name */
            public final r f362555c;

            /* renamed from: d, reason: collision with root package name */
            public final H0 f362556d;

            /* renamed from: e, reason: collision with root package name */
            public final long f362557e;

            /* renamed from: f, reason: collision with root package name */
            public D0<?> f362558f;

            /* renamed from: g, reason: collision with root package name */
            public long f362559g;

            public a(RequestBody requestBody, r rVar, ExecutorService executorService, long j12, a aVar) {
                this.f362554b = requestBody;
                this.f362555c = rVar;
                if (executorService instanceof H0) {
                    this.f362556d = (H0) executorService;
                } else {
                    this.f362556d = Q0.b(executorService);
                }
                this.f362557e = j12 == 0 ? 2147483647L : j12;
            }

            public final void a(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                int iPosition = byteBuffer.position();
                byteBuffer.position(0);
                if (!b(byteBuffer).equals(r.a.f362582c)) {
                    long jContentLength = this.f362554b.contentLength();
                    long j12 = this.f362559g;
                    StringBuilder sbQ = H.q(jContentLength, "Expected ", " bytes but got at least ");
                    sbQ.append(j12);
                    throw new IOException(sbQ.toString());
                }
                Object[] objArr = new Object[0];
                if (!(byteBuffer.position() == 0)) {
                    throw new VerifyException(d0.b("END_OF_BODY reads shouldn't write anything to the buffer", objArr));
                }
                byteBuffer.position(iPosition);
                uploadDataSink.onReadSucceeded(false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final r.a b(ByteBuffer byteBuffer) {
                D0 d0C;
                int iPosition = byteBuffer.position();
                r rVar = this.f362555c;
                AtomicReference<Throwable> atomicReference = rVar.f362580d;
                Throwable th2 = atomicReference.get();
                if (th2 != null) {
                    d0C = C37568u0.c(th2);
                } else {
                    e1 e1Var = new e1();
                    rVar.f362578b.add(Pair.create(byteBuffer, e1Var));
                    Throwable th3 = atomicReference.get();
                    if (th3 != null) {
                        e1Var.o(th3);
                    }
                    d0C = e1Var;
                }
                boolean z12 = false;
                try {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.f362557e);
                    while (true) {
                        try {
                            break;
                        } catch (InterruptedException unused) {
                            z12 = true;
                            nanos = (System.nanoTime() + nanos) - System.nanoTime();
                        }
                    }
                    r.a aVar = (r.a) d0C.get(nanos, TimeUnit.NANOSECONDS);
                    this.f362559g += byteBuffer.position() - iPosition;
                    return aVar;
                } finally {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public final long getLength() {
                return this.f362554b.contentLength();
            }

            @Override // org.chromium.net.UploadDataProvider
            public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                if (this.f362558f == null) {
                    D0<?> d0Submit = this.f362556d.submit(new Callable() { // from class: com.google.net.cronet.okhttptransport.k
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            j.c.a aVar = this.f362560b;
                            r rVar = aVar.f362555c;
                            X x12 = new X(rVar);
                            aVar.f362554b.writeTo(x12);
                            x12.flush();
                            if (rVar.f362579c.getAndSet(true)) {
                                throw new IllegalStateException("Already closed");
                            }
                            ((e1) rVar.a().second).n(r.a.f362582c);
                            return null;
                        }
                    });
                    this.f362558f = d0Submit;
                    C37568u0.a(d0Submit, new l(this), Q0.a());
                }
                RequestBody requestBody = this.f362554b;
                if (requestBody.contentLength() == -1) {
                    try {
                        uploadDataSink.onReadSucceeded(b(byteBuffer).equals(r.a.f362582c));
                        return;
                    } catch (ExecutionException | TimeoutException e12) {
                        this.f362558f.cancel(true);
                        uploadDataSink.onReadError(new IOException(e12));
                        return;
                    }
                }
                try {
                    r.a aVarB = b(byteBuffer);
                    if (this.f362559g > requestBody.contentLength()) {
                        throw new IOException("Expected " + requestBody.contentLength() + " bytes but got at least " + this.f362559g);
                    }
                    if (this.f362559g >= requestBody.contentLength()) {
                        a(uploadDataSink, byteBuffer);
                        return;
                    }
                    int iOrdinal = aVarB.ordinal();
                    if (iOrdinal == 0) {
                        uploadDataSink.onReadSucceeded(false);
                    } else if (iOrdinal == 1) {
                        throw new IOException("The source has been exhausted but we expected more data!");
                    }
                } catch (ExecutionException e13) {
                    e = e13;
                    this.f362558f.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                } catch (TimeoutException e14) {
                    e = e14;
                    this.f362558f.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public final void rewind(UploadDataSink uploadDataSink) {
                uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
            }
        }

        public c(ExecutorService executorService) {
            this.f362553a = executorService;
        }
    }

    public j(b bVar, c cVar) {
        this.f362546a = bVar;
        this.f362547b = cVar;
    }
}
