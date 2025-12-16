package defpackage;

import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class oa9 {
    public final long a;
    public final long b;
    public final ha9 c;
    public final pa9 d;
    public final Uri e;

    public oa9(long j, long j2, ha9 ha9Var, pa9 pa9Var) {
        this.a = j;
        this.b = j2;
        this.c = ha9Var;
        this.d = pa9Var;
        this.e = Uri.fromFile(new File(ha9Var.c));
    }
}
