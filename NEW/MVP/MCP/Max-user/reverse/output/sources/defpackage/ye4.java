package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes.dex */
public final class ye4 {
    public static final /* synthetic */ int j = 0;
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
        tm5.a("goog.exo.datasource");
    }

    public ye4(Uri uri, long j2, int i, byte[] bArr, Map map, long j3, long j4, String str, int i2) {
        fsi.b(j2 + j3 >= 0);
        fsi.b(j3 >= 0);
        fsi.b(j4 > 0 || j4 == -1);
        this.a = uri;
        this.b = j2;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j3;
        this.g = j4;
        this.h = str;
        this.i = i2;
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

    public final ye4 b(long j2) {
        long j3 = this.g;
        return c(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    public final ye4 c(long j2, long j3) {
        if (j2 == 0 && this.g == j3) {
            return this;
        }
        return new ye4(this.a, this.b, this.c, this.d, this.e, this.f + j2, j3, this.h, this.i);
    }

    public final String toString() {
        String str;
        int i = this.c;
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
        String strValueOf = String.valueOf(this.a);
        int length = strValueOf.length() + str.length() + 70;
        String str2 = this.h;
        StringBuilder sb = new StringBuilder(u45.f(length, str2));
        sb.append("DataSpec[");
        sb.append(str);
        sb.append(" ");
        sb.append(strValueOf);
        az1.r(this.f, ", ", ", ", sb);
        hf3.e(this.g, ", ", str2, sb);
        sb.append(", ");
        sb.append(this.i);
        sb.append("]");
        return sb.toString();
    }
}
