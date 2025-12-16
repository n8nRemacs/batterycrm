package defpackage;

import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class g00 extends pd8 {
    public static final /* synthetic */ int x0 = 0;
    public w10 t0;
    public final long u0;
    public final long v0;
    public File w0;

    /* JADX WARN: Illegal instructions before constructor call */
    public g00(w10 w10Var, k10 k10Var, long j, long j2) {
        long jHashCode = w10Var.r.hashCode();
        String str = w10Var.s;
        String strA = (str == null || str.length() == 0) ? k10Var.a() : tfi.h(str);
        boolean z = k10Var.o;
        String strA2 = k10Var.u0;
        if (z) {
            if (strA2 == null) {
                strA2 = k10Var.a();
            }
        } else if (str != null && str.length() != 0) {
            strA2 = tfi.h(str);
        } else if (strA2 == null) {
            strA2 = k10Var.a();
        }
        super(1, jHashCode, strA, strA2, 0, 0L, k10Var.o ? "image/gif" : "image/jpeg", 0L, null);
        this.t0 = w10Var;
        this.u0 = j;
        this.v0 = j2;
    }

    @Override // defpackage.pd8, defpackage.d3
    public final String a() {
        File file = this.w0;
        if (file == null) {
            return super.a();
        }
        String path = file.getPath();
        if (path != null) {
            return path;
        }
        Uri uriC = c();
        if (uriC != null) {
            return uriC.getPath();
        }
        return null;
    }

    @Override // defpackage.pd8
    public final Uri c() {
        Uri uriG = tfi.g(this.t0.s);
        return uriG != null ? uriG : super.c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g00(w10 w10Var, v10 v10Var, int i, long j, long j2) {
        String string;
        int i2 = i == 2 ? 11 : 3;
        String str = w10Var.r;
        String str2 = w10Var.s;
        long jHashCode = str.hashCode();
        if (str2 != null && str2.length() != 0) {
            string = Uri.fromFile(new File(str2)).toString();
        } else {
            string = v10Var.h;
        }
        super(i2, jHashCode, string, v10Var.d, 0, v10Var.c, "video/mp4", 0L, null);
        this.t0 = w10Var;
        this.u0 = j;
        this.v0 = j2;
    }
}
