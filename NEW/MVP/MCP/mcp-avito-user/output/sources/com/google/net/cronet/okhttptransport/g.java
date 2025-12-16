package com.google.net.cronet.okhttptransport;

import com.avito.android.remote.model.AdvertStatus;
import com.google.common.base.M;
import com.google.common.util.concurrent.e1;
import com.google.net.cronet.okhttptransport.h;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.C44802l;
import okio.e0;
import okio.i0;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: OkHttpBridgeRequestCallback.java */
/* loaded from: classes14.dex */
class g extends UrlRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final e1<e0> f362525a = new e1<>();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f362526b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f362527c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayBlockingQueue f362528d = new ArrayBlockingQueue(2);

    /* renamed from: e, reason: collision with root package name */
    public final e1<UrlResponseInfo> f362529e = new e1<>();

    /* renamed from: f, reason: collision with root package name */
    public final long f362530f;

    /* renamed from: g, reason: collision with root package name */
    public final h f362531g;

    /* renamed from: h, reason: collision with root package name */
    public volatile UrlRequest f362532h;

    /* compiled from: OkHttpBridgeRequestCallback.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362533a;

        static {
            int[] iArr = new int[c.values().length];
            f362533a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362533a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362533a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362533a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: OkHttpBridgeRequestCallback.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f362534a;

        /* renamed from: b, reason: collision with root package name */
        @I41.h
        public final ByteBuffer f362535b;

        /* renamed from: c, reason: collision with root package name */
        @I41.h
        public final CronetException f362536c;

        public b(c cVar, ByteBuffer byteBuffer, CronetException cronetException, a aVar) {
            this.f362534a = cVar;
            this.f362535b = byteBuffer;
            this.f362536c = cronetException;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OkHttpBridgeRequestCallback.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f362537b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f362538c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f362539d;

        /* renamed from: e, reason: collision with root package name */
        public static final c f362540e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ c[] f362541f;

        static {
            c cVar = new c("ON_READ_COMPLETED", 0);
            f362537b = cVar;
            c cVar2 = new c("ON_SUCCESS", 1);
            f362538c = cVar2;
            c cVar3 = new c("ON_FAILED", 2);
            f362539d = cVar3;
            c cVar4 = new c("ON_CANCELED", 3);
            f362540e = cVar4;
            f362541f = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f362541f.clone();
        }
    }

    /* compiled from: OkHttpBridgeRequestCallback.java */
    public class d implements e0 {

        /* renamed from: b, reason: collision with root package name */
        public ByteBuffer f362542b = ByteBuffer.allocateDirect(32768);

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f362543c = false;

        public d(a aVar) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f362543c) {
                return;
            }
            this.f362543c = true;
            if (g.this.f362526b.get()) {
                return;
            }
            g.this.f362532h.cancel();
        }

        @Override // okio.e0
        public final long read(C44802l c44802l, long j12) throws IOException {
            b bVar;
            if (g.this.f362527c.get()) {
                throw new IOException("The request was canceled!");
            }
            M.d("sink == null", c44802l != null);
            M.e("byteCount < 0: %s", j12 >= 0, j12);
            M.n(AdvertStatus.CLOSED, !this.f362543c);
            if (g.this.f362526b.get()) {
                return -1L;
            }
            if (j12 < this.f362542b.limit()) {
                this.f362542b.limit((int) j12);
            }
            g.this.f362532h.read(this.f362542b);
            try {
                g gVar = g.this;
                bVar = (b) gVar.f362528d.poll(gVar.f362530f, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                bVar = null;
            }
            if (bVar == null) {
                g.this.f362532h.cancel();
                throw new CronetTimeoutException();
            }
            int iOrdinal = bVar.f362534a.ordinal();
            if (iOrdinal == 0) {
                bVar.f362535b.flip();
                int iWrite = c44802l.write(bVar.f362535b);
                bVar.f362535b.clear();
                return iWrite;
            }
            if (iOrdinal == 1) {
                g.this.f362526b.set(true);
                this.f362542b = null;
                return -1L;
            }
            if (iOrdinal == 2) {
                g.this.f362526b.set(true);
                this.f362542b = null;
                throw new IOException(bVar.f362536c);
            }
            if (iOrdinal != 3) {
                throw new AssertionError("The switch block above is exhaustive!");
            }
            this.f362542b = null;
            throw new IOException("The request was canceled!");
        }

        @Override // okio.e0
        /* renamed from: timeout */
        public final i0 getF420025c() {
            return i0.NONE;
        }
    }

    public g(long j12, h hVar) {
        M.g(j12 >= 0);
        if (j12 == 0) {
            this.f362530f = 2147483647L;
        } else {
            this.f362530f = j12;
        }
        this.f362531g = hVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f362527c.set(true);
        this.f362528d.add(new b(c.f362540e, null, null, null));
        IOException iOException = new IOException("The request was canceled!");
        this.f362529e.o(iOException);
        this.f362525a.o(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.f362529e.o(cronetException) && this.f362525a.o(cronetException)) {
            return;
        }
        this.f362528d.add(new b(c.f362539d, null, cronetException, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f362528d.add(new b(c.f362537b, byteBuffer, null, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        ((h.b.a) this.f362531g).getClass();
        if (urlResponseInfo.getUrlChain().size() <= 16) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        ProtocolException protocolException = new ProtocolException(AK.c.g(17, "Too many follow-up requests: "));
        this.f362529e.o(protocolException);
        this.f362525a.o(protocolException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f362532h = urlRequest;
        M.q(this.f362529e.n(urlResponseInfo));
        M.q(this.f362525a.n(new d(null)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f362528d.add(new b(c.f362538c, null, null, null));
    }
}
