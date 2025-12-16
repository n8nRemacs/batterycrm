package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class oo6 {
    public static final List d = ve3.j(mo6.e, no6.e);
    public final String a;
    public final String b = az1.i(d(), " DESC");
    public final String[] c = (String[]) ys.t(new String[]{f(), b(), a(), c(), d(), h(), i(), e(), g()}).toArray(new String[0]);

    public oo6(String str) {
        this.a = str;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public String e() {
        return null;
    }

    public abstract String f();

    public String g() {
        return null;
    }

    public abstract String h();

    public String i() {
        return null;
    }

    public abstract Uri j();

    public abstract String k();

    public final String toString() {
        return "QueryParams(name='" + ((Object) '*') + "')";
    }
}
