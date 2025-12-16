package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes.dex */
public final class ze4 {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        e19.a("media3.datasource");
    }

    public ze4(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0);
    }

    public static String b(int i) {
        if (i == 1) {
            return HttpGet.METHOD_NAME;
        }
        if (i == 2) {
            return HttpPost.METHOD_NAME;
        }
        if (i == 3) {
            return HttpHead.METHOD_NAME;
        }
        throw new IllegalStateException();
    }

    public final xe4 a() {
        xe4 xe4Var = new xe4();
        xe4Var.a = this.a;
        xe4Var.b = this.b;
        xe4Var.c = this.c;
        xe4Var.d = this.d;
        xe4Var.e = this.e;
        xe4Var.f = this.f;
        xe4Var.g = this.g;
        xe4Var.h = this.h;
        xe4Var.i = this.i;
        return xe4Var;
    }

    public final ze4 c(long j) {
        long j2 = this.g;
        return d(j, j2 != -1 ? j2 - j : -1L);
    }

    public final ze4 d(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new ze4(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return ho7.j(sb, this.i, "]");
    }

    public ze4(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        hsi.b(j + j2 >= 0);
        hsi.b(j2 >= 0);
        hsi.b(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }
}
