package androidx.media3.datasource;

import androidx.camera.camera2.internal.G;
import androidx.media3.common.util.J;
import androidx.media3.datasource.j;
import com.adjust.sdk.network.ErrorCodes;
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

/* loaded from: classes.dex */
public interface HttpDataSource extends j {

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        @J
        public InvalidContentTypeException(String str) {
            super(G.f("Invalid content type: ", str), 2003);
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* renamed from: e, reason: collision with root package name */
        public final int f48178e;

        /* renamed from: f, reason: collision with root package name */
        @J
        public final Map<String, List<String>> f48179f;

        @J
        public InvalidResponseCodeException(int i12, @P DataSourceException dataSourceException, Map map) {
            super(AK.c.g(i12, "Response code: "), dataSourceException, 2004);
            this.f48178e = i12;
            this.f48179f = map;
        }
    }

    @J
    public static abstract class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final c f48180a = new c();

        @Override // androidx.media3.datasource.HttpDataSource.b, androidx.media3.datasource.j.a
        public final j a() {
            return b(this.f48180a);
        }

        public abstract androidx.media3.datasource.okhttp.c b(c cVar);

        @Override // androidx.media3.datasource.HttpDataSource.b, androidx.media3.datasource.j.a
        public final HttpDataSource a() {
            return b(this.f48180a);
        }
    }

    public interface b extends j.a {
        @Override // androidx.media3.datasource.j.a
        @J
        HttpDataSource a();
    }

    @J
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f48181a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        @P
        public Map<String, String> f48182b;

        public final synchronized Map<String, String> a() {
            try {
                if (this.f48182b == null) {
                    this.f48182b = Collections.unmodifiableMap(new HashMap(this.f48181a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f48182b;
        }
    }

    public static class HttpDataSourceException extends DataSourceException {

        /* renamed from: d, reason: collision with root package name */
        public final int f48177d;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @J
        public HttpDataSourceException(int i12) {
            super(a(i12, 1));
            this.f48177d = 1;
        }

        public static int a(int i12, int i13) {
            if (i12 == 2000 && i13 == 1) {
                return 2001;
            }
            return i12;
        }

        @J
        public static HttpDataSourceException b(IOException iOException, int i12) {
            String message = iOException.getMessage();
            int i13 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ErrorCodes.PROTOCOL_EXCEPTION : (message == null || !C37257c.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i13 == 2007 ? new CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new HttpDataSourceException(iOException, i13, i12);
        }

        @J
        public HttpDataSourceException(String str, int i12) {
            super(str, a(i12, 1));
            this.f48177d = 1;
        }

        @J
        public HttpDataSourceException(IOException iOException, int i12, int i13) {
            super(iOException, a(i12, i13));
            this.f48177d = i13;
        }

        @J
        public HttpDataSourceException(String str, @P IOException iOException, int i12) {
            super(a(i12, 1), str, iOException);
            this.f48177d = 1;
        }
    }
}
