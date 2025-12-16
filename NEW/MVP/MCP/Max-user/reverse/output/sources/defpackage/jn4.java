package defpackage;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class jn4 extends mj0 {
    public final int X;
    public final String Y;
    public final h79 Z;
    public final int o;
    public final h79 s0;
    public ze4 t0;
    public HttpURLConnection u0;
    public InputStream v0;
    public boolean w0;
    public int x0;
    public long y0;
    public long z0;

    public jn4(String str, int i, int i2, h79 h79Var) {
        super(true);
        this.Y = str;
        this.o = i;
        this.X = i2;
        this.Z = h79Var;
        this.s0 = new h79(21);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138 A[Catch: IOException -> 0x0143, TRY_LEAVE, TryCatch #0 {IOException -> 0x0143, blocks: (B:52:0x0130, B:54:0x0138), top: B:103:0x0130 }] */
    @Override // defpackage.se4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long H(defpackage.ze4 r25) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn4.H(ze4):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.se4
    public final void close() {
        try {
            InputStream inputStream = this.v0;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = zxg.a;
                    throw new HttpDataSource$HttpDataSourceException(2000, 3, e);
                }
            }
        } finally {
            this.v0 = null;
            f();
            if (this.w0) {
                this.w0 = false;
                c();
            }
            this.u0 = null;
            this.t0 = null;
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.u0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                a8i.h("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection g(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.o);
        httpURLConnection.setReadTimeout(this.X);
        HashMap map2 = new HashMap();
        h79 h79Var = this.Z;
        if (h79Var != null) {
            map2.putAll(h79Var.A());
        }
        map2.putAll(this.s0.A());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = ma7.a;
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
        String str = this.Y;
        if (str != null) {
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(ze4.b(i));
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

    @Override // defpackage.se4
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.u0;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        ze4 ze4Var = this.t0;
        if (ze4Var != null) {
            return ze4Var.a;
        }
        return null;
    }

    public final void h(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.v0;
            String str = zxg.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(2000, 1, new InterruptedIOException());
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j -= i;
            b(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.ke4
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
            java.lang.String r1 = defpackage.zxg.a     // Catch: java.io.IOException -> L32
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
            java.lang.String r8 = defpackage.zxg.a
            r8 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r7 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.a(r8, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn4.read(byte[], int, int):int");
    }

    @Override // defpackage.se4
    public final Map x() {
        HttpURLConnection httpURLConnection = this.u0;
        return httpURLConnection == null ? ekd.Y : new hn4(httpURLConnection.getHeaderFields(), 1);
    }
}
