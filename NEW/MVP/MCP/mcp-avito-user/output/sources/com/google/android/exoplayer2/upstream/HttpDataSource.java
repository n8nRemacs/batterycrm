package com.google.android.exoplayer2.upstream;

import com.adjust.sdk.network.ErrorCodes;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.common.base.C37257c;
import j.P;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface HttpDataSource extends InterfaceC36583m {

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* renamed from: e, reason: collision with root package name */
        public final int f347735e;

        /* renamed from: f, reason: collision with root package name */
        public final Map<String, List<String>> f347736f;

        public InvalidResponseCodeException(int i12, @P DataSourceException dataSourceException, Map map) {
            super(AK.c.g(i12, "Response code: "), dataSourceException, 2004);
            this.f347735e = i12;
            this.f347736f = map;
        }
    }

    public static abstract class a implements b {
        public a() {
            new c();
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b, com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final InterfaceC36583m a() {
            return b();
        }

        public abstract HttpDataSource b();

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b, com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final HttpDataSource a() {
            return b();
        }
    }

    public interface b extends InterfaceC36583m.a {
        @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        HttpDataSource a();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f347737a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        @P
        public Map<String, String> f347738b;

        public final synchronized Map<String, String> a() {
            try {
                if (this.f347738b == null) {
                    this.f347738b = Collections.unmodifiableMap(new HashMap(this.f347737a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f347738b;
        }
    }

    public static class HttpDataSourceException extends DataSourceException {

        /* renamed from: d, reason: collision with root package name */
        public final int f347734d;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public HttpDataSourceException() {
            super(2008);
            this.f347734d = 1;
        }

        public static int a(int i12, int i13) {
            if (i12 == 2000 && i13 == 1) {
                return 2001;
            }
            return i12;
        }

        public static HttpDataSourceException b(IOException iOException, int i12) {
            String message = iOException.getMessage();
            int i13 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ErrorCodes.PROTOCOL_EXCEPTION : (message == null || !C37257c.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i13 == 2007 ? new CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007) : new HttpDataSourceException(iOException, i13, i12);
        }

        public HttpDataSourceException(String str, int i12) {
            super(str, a(i12, 1));
            this.f347734d = 1;
        }

        public HttpDataSourceException(IOException iOException, int i12, int i13) {
            super(iOException, a(i12, i13));
            this.f347734d = i13;
        }

        public HttpDataSourceException(String str, @P IOException iOException, int i12) {
            super(a(i12, 1), str, iOException);
            this.f347734d = 1;
        }
    }
}
