package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class tl0 {
    public final Uri a;
    public nm b = nm.d;
    public final gm c = new gm();

    public tl0(Uri uri) {
        this.a = uri;
    }

    public final ul0 a(ox7 ox7Var) {
        return new ul0(this.a, this.b, this.c, ox7Var);
    }

    public final void b(String str, String str2) {
        this.c.a(new nmf(str, str2));
    }

    public final void c(String str, boolean z) {
        this.c.a(new br0(str, z));
    }
}
