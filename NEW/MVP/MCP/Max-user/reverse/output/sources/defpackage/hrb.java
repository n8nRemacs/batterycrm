package defpackage;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class hrb {
    public final nv4 a;
    public final boolean b;

    public hrb(Context context) throws IOException {
        nv4 nv4VarB = c9j.b(context);
        this.a = nv4VarB;
        this.b = nv4VarB.compareTo(nv4.AVERAGE) >= 0;
    }

    public final String toString() {
        return wmf.d("\n        PerformanceConfig(\n            perfClass=" + this.a + ",\n        )\n    ");
    }
}
