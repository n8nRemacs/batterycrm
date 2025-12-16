package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z10 {
    public final Context a;
    public final p00 b;
    public final m4e c;
    public final Map d;
    public final LruCache e;

    public z10(Context context, p00 p00Var, m4e m4eVar) {
        this.a = context;
        this.b = p00Var;
        this.c = m4eVar;
        new HashMap();
        this.d = Collections.synchronizedMap(new kr8(200, 0));
        this.e = new LruCache(200);
        new HashSet();
    }

    public final Uri a(w10 w10Var) {
        k10 k10Var;
        f10 f10Var = w10Var.j;
        o10 o10Var = w10Var.g;
        Uri uri = (Uri) this.b.c.get(w10Var.r);
        if (uri == null) {
            if (w10Var.h() || ssi.h(w10Var)) {
                return tfi.g((ssi.h(w10Var) ? f10Var.d.d : w10Var.d).d);
            }
            if (w10Var.f() || ssi.g(w10Var)) {
                return tfi.g((ssi.g(w10Var) ? f10Var.d.b : w10Var.b).a());
            }
            if (!w10Var.g() || (k10Var = o10Var.f) == null) {
                return uri;
            }
            return tfi.g(k10Var != null ? k10Var.a() : null);
        }
        return uri;
    }

    public final Uri b(w10 w10Var, boolean z) {
        w10 w10Var2;
        y10 y10Var = new y10(w10Var.r, z);
        LruCache lruCache = this.e;
        Uri uri = (Uri) lruCache.get(y10Var);
        if (uri != null) {
            return uri;
        }
        f10 f10Var = w10Var.j;
        if (f10Var != null && (w10Var2 = f10Var.d) != null) {
            w10Var = w10Var2;
        }
        byte[] bArrD = ssi.d(w10Var);
        if (bArrD == null || bArrD.length == 0) {
            return null;
        }
        if (z) {
            try {
                this.c.getClass();
            } catch (Exception e) {
                wqi.e("z10", "AttachmentsPreviewCache:", e);
            }
        }
        Uri uri2 = Uri.parse("data:image/png;base64," + Base64.encodeToString(bArrD, 2));
        lruCache.put(y10Var, uri2);
        return uri2;
    }
}
