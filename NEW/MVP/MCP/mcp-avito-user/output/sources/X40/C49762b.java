package x40;

import Y61.k;
import Y61.l;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealResponseBody;
import okio.C44802l;
import okio.InterfaceC44804n;
import okio.X;
import okio.Y;
import okio.e0;
import okio.i0;
import r40.InterfaceC47489c;

/* compiled from: CacheWritingResponse.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_offlinization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: x40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49762b {

    /* compiled from: CacheWritingResponse.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"x40/b$a", "Lokio/e0;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x40.b$a */
    public static final class a implements e0 {

        /* renamed from: b, reason: collision with root package name */
        public boolean f442204b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44804n f442205c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47489c f442206d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ X f442207e;

        public a(InterfaceC44804n interfaceC44804n, InterfaceC47489c interfaceC47489c, X x12) {
            this.f442205c = interfaceC44804n;
            this.f442206d = interfaceC47489c;
            this.f442207e = x12;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (!this.f442204b && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.f442204b = true;
                this.f442206d.abort();
            }
            this.f442205c.close();
        }

        @Override // okio.e0
        public final long read(@k C44802l c44802l, long j12) throws Throwable {
            try {
                long j13 = this.f442205c.read(c44802l, j12);
                X x12 = this.f442207e;
                if (j13 != -1) {
                    c44802l.k(c44802l.f420125c - j13, x12.f420043c, j13);
                    x12.W1();
                    return j13;
                }
                if (!this.f442204b) {
                    this.f442204b = true;
                    x12.close();
                }
                return -1L;
            } catch (IOException e12) {
                if (!this.f442204b) {
                    this.f442204b = true;
                    this.f442206d.abort();
                }
                throw e12;
            }
        }

        @Override // okio.e0
        @k
        /* renamed from: timeout */
        public final i0 getTimeout() {
            return this.f442205c.getTimeout();
        }
    }

    @k
    public static final Response a(@k Response response, @l InterfaceC47489c interfaceC47489c) {
        if (interfaceC47489c == null) {
            return response;
        }
        a aVar = new a(response.body().getBodySource(), interfaceC47489c, new X(interfaceC47489c.getF429593d()));
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().getContentLength(), new Y(aVar))).build();
    }
}
