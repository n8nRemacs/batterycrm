package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.File;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class rf7 {
    public final pf7 a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final ie7 g;
    public final ynd h;
    public final ysd i;
    public final m9c j;
    public final qf7 k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final y6c o;
    public final uk0 p;
    public final Boolean q;
    public final v25 r;

    public rf7(sf7 sf7Var) {
        this.a = sf7Var.g;
        Uri uri = sf7Var.a;
        this.b = uri;
        int i = -1;
        if (uri != null) {
            if (mwg.d(uri)) {
                i = 0;
            } else if (uri.getPath() != null && "file".equals(mwg.b(uri))) {
                String strA = zb9.a(uri.getPath());
                i = strA != null ? dnf.r(strA, "video/", false) : false ? 2 : 3;
            } else if ("content".equals(mwg.b(uri))) {
                i = 4;
            } else if ("asset".equals(mwg.b(uri))) {
                i = 5;
            } else if ("res".equals(mwg.b(uri))) {
                i = 6;
            } else if ("data".equals(uri.getScheme())) {
                i = 7;
            } else if ("android.resource".equals(mwg.b(uri))) {
                i = 8;
            }
        }
        this.c = i;
        this.e = sf7Var.h;
        this.f = sf7Var.i;
        this.g = sf7Var.f;
        this.h = sf7Var.d;
        ysd ysdVar = sf7Var.e;
        this.i = ysdVar == null ? ysd.c : ysdVar;
        this.j = sf7Var.j;
        this.k = sf7Var.b;
        boolean z = (sf7Var.c & 48) == 0 && (mwg.d(sf7Var.a) || sf7.c(sf7Var.a));
        this.m = z;
        int i2 = sf7Var.c;
        this.l = !z ? i2 | 48 : i2;
        this.n = (i2 & 15) == 0;
        this.o = sf7Var.k;
        this.p = sf7Var.l;
        this.q = sf7Var.m;
        this.r = sf7Var.n;
    }

    public static rf7 a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return sf7.d(uri).a();
    }

    public static rf7 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return a(Uri.parse(str));
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.f;
    }

    public final synchronized File d() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final boolean e(int i) {
        return (i & this.l) == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rf7)) {
            return false;
        }
        rf7 rf7Var = (rf7) obj;
        if (this.e != rf7Var.e || this.m != rf7Var.m || this.n != rf7Var.n || !yyi.b(this.b, rf7Var.b) || !yyi.b(this.a, rf7Var.a)) {
            return false;
        }
        if (!yyi.b(null, null) || !yyi.b(this.d, rf7Var.d) || !yyi.b(null, null) || !yyi.b(this.g, rf7Var.g) || !yyi.b(this.h, rf7Var.h) || !yyi.b(this.j, rf7Var.j) || !yyi.b(this.k, rf7Var.k) || !yyi.b(Integer.valueOf(this.l), Integer.valueOf(rf7Var.l)) || !yyi.b(null, null) || !yyi.b(this.q, rf7Var.q) || !yyi.b(this.r, rf7Var.r) || !yyi.b(this.i, rf7Var.i) || this.f != rf7Var.f) {
            return false;
        }
        y6c y6cVar = this.o;
        ty0 ty0VarB = y6cVar != null ? y6cVar.b() : null;
        y6c y6cVar2 = rf7Var.o;
        return yyi.b(ty0VarB, y6cVar2 != null ? y6cVar2.b() : null);
    }

    public final int hashCode() {
        y6c y6cVar = this.o;
        return mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(mfh.c(0, this.a), this.b), Boolean.valueOf(this.e)), null), this.j), this.k), Integer.valueOf(this.l)), Boolean.valueOf(this.m)), Boolean.valueOf(this.n)), this.g), null), this.h), this.i), y6cVar != null ? y6cVar.b() : null), this.q), this.r), 0), Boolean.valueOf(this.f));
    }

    public final String toString() {
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.r(this.b, "uri");
        hc8VarC.r(this.a, "cacheChoice");
        hc8VarC.r(this.g, "decodeOptions");
        hc8VarC.r(this.o, "postprocessor");
        hc8VarC.r(this.j, LogFactory.PRIORITY_KEY);
        hc8VarC.r(this.h, "resizeOptions");
        hc8VarC.r(this.i, "rotationOptions");
        hc8VarC.r(null, "bytesRange");
        hc8VarC.r(this.q, "resizingAllowedOverride");
        hc8VarC.r(this.r, "downsampleOverride");
        hc8VarC.p("progressiveRenderingEnabled", false);
        hc8VarC.p("localThumbnailPreviewsEnabled", this.e);
        hc8VarC.p("loadThumbnailOnly", this.f);
        hc8VarC.r(this.k, "lowestPermittedRequestLevel");
        hc8VarC.c(this.l, "cachesDisabled");
        hc8VarC.p("isDiskCacheEnabled", this.m);
        hc8VarC.p("isMemoryCacheEnabled", this.n);
        hc8VarC.r(null, "decodePrefetches");
        hc8VarC.c(0, "delayMs");
        return hc8VarC.toString();
    }
}
