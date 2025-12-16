package defpackage;

import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sf7 {
    public static final HashSet o = new HashSet();
    public Uri a;
    public qf7 b;
    public int c;
    public ynd d;
    public ysd e;
    public ie7 f;
    public pf7 g;
    public boolean h;
    public boolean i;
    public m9c j;
    public y6c k;
    public uk0 l;
    public Boolean m;
    public v25 n;

    public static sf7 b(rf7 rf7Var) {
        sf7 sf7VarD = d(rf7Var.b);
        sf7VarD.f = rf7Var.g;
        sf7VarD.g = rf7Var.a;
        sf7VarD.h = rf7Var.e;
        sf7VarD.i = rf7Var.c();
        sf7VarD.b = rf7Var.k;
        sf7VarD.c = rf7Var.l;
        sf7VarD.k = rf7Var.o;
        sf7VarD.j = rf7Var.j;
        sf7VarD.d = rf7Var.h;
        sf7VarD.l = rf7Var.p;
        sf7VarD.e = rf7Var.i;
        sf7VarD.n = rf7Var.r;
        sf7VarD.m = rf7Var.q;
        return sf7VarD;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = o;
        if (hashSet == null || uri == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static sf7 d(Uri uri) {
        sf7 sf7Var = new sf7();
        sf7Var.a = null;
        sf7Var.b = qf7.FULL_FETCH;
        sf7Var.c = 0;
        sf7Var.d = null;
        sf7Var.e = null;
        sf7Var.f = ie7.c;
        sf7Var.g = pf7.b;
        sf7Var.h = false;
        sf7Var.i = false;
        sf7Var.j = m9c.c;
        sf7Var.k = null;
        sf7Var.m = null;
        sf7Var.n = null;
        uri.getClass();
        sf7Var.a = uri;
        return sf7Var;
    }

    public final rf7 a() throws NumberFormatException {
        Uri uri = this.a;
        if (uri == null) {
            final String str = "Source must be set!";
            throw new RuntimeException(str) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                {
                    super("Invalid request builder: ".concat(str));
                }
            };
        }
        if ("res".equals(mwg.b(uri))) {
            if (!this.a.isAbsolute()) {
                final String str2 = "Resource URI path must be absolute.";
                throw new RuntimeException(str2) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str2));
                    }
                };
            }
            if (this.a.getPath().isEmpty()) {
                final String str3 = "Resource URI must not be empty";
                throw new RuntimeException(str3) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str3));
                    }
                };
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                final String str4 = "Resource URI path must be a resource id.";
                throw new RuntimeException(str4) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str4));
                    }
                };
            }
        }
        if (!"asset".equals(mwg.b(this.a)) || this.a.isAbsolute()) {
            return new rf7(this);
        }
        final String str5 = "Asset URI path must be absolute.";
        throw new RuntimeException(str5) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
            {
                super("Invalid request builder: ".concat(str5));
            }
        };
    }
}
