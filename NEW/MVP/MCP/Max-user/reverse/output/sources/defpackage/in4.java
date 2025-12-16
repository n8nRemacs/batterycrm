package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class in4 extends lj0 implements i97 {
    public final int X;
    public final String Y;
    public final py0 Z;
    public final int o;
    public final py0 s0;
    public ye4 t0;
    public HttpURLConnection u0;
    public InputStream v0;
    public boolean w0;
    public int x0;
    public long y0;
    public long z0;

    public in4(String str, int i, int i2, py0 py0Var) {
        super(true);
        this.Y = str;
        this.o = i;
        this.X = i2;
        this.Z = py0Var;
        this.s0 = new py0(18);
    }

    public static void h(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        if (httpURLConnection == null || (i = xxg.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    @Override // defpackage.qe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long R(defpackage.ye4 r23) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in4.R(ye4):long");
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        try {
            InputStream inputStream = this.v0;
            if (inputStream != null) {
                long j = this.y0;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.z0;
                }
                h(this.u0, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    ye4 ye4Var = this.t0;
                    int i = xxg.a;
                    throw new HttpDataSource$HttpDataSourceException(e, ye4Var, 2000, 3);
                }
            }
        } finally {
            this.v0 = null;
            f();
            if (this.w0) {
                this.w0 = false;
                c();
            }
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.u0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                pai.c("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.u0 = null;
        }
    }

    public final HttpURLConnection g(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.o);
        httpURLConnection.setReadTimeout(this.X);
        HashMap map2 = new HashMap();
        py0 py0Var = this.Z;
        if (py0Var != null) {
            map2.putAll(py0Var.D());
        }
        map2.putAll(this.s0.D());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = la7.a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbL = az1.l(j, "bytes=", "-");
            if (j2 != -1) {
                sbL.append((j + j2) - 1);
            }
            string = sbL.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.Y;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = ye4.j;
        if (i == 1) {
            str = HttpGet.METHOD_NAME;
        } else if (i == 2) {
            str = HttpPost.METHOD_NAME;
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = HttpHead.METHOD_NAME;
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.u0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void j(long j, ye4 ye4Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.v0;
            int i = xxg.a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), ye4Var, 2000, 1);
            }
            if (i2 == -1) {
                throw new HttpDataSource$HttpDataSourceException(2008);
            }
            j -= i2;
            b(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.je4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.y0     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.z0     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.v0     // Catch: java.io.IOException -> L32
            int r1 = defpackage.xxg.a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.z0     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.z0 = r8     // Catch: java.io.IOException -> L32
            r6.b(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            ye4 r8 = r6.t0
            int r9 = defpackage.xxg.a
            r9 = 2
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r7 = com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException.a(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in4.read(byte[], int, int):int");
    }

    @Override // defpackage.qe4
    public final Map x() {
        HttpURLConnection httpURLConnection = this.u0;
        return httpURLConnection == null ? ekd.Y : new hn4(httpURLConnection.getHeaderFields(), 0);
    }
}
