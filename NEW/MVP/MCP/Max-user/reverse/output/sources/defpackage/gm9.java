package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gm9 implements Serializable {
    public final long a;
    public final fh9 b;
    public final String c;
    public final List d;

    public gm9(String str, ArrayList arrayList, long j, fh9 fh9Var) {
        this.c = str;
        this.d = arrayList;
        this.a = j;
        this.b = fh9Var;
    }

    public final String toString() {
        StringBuilder sbM = utb.m(zdi.a(this.d), "{, feedback='", l8g.f(this.c), "', highlights=", ", chatId='");
        sbM.append(this.a);
        sbM.append("', message=");
        sbM.append(this.b);
        sbM.append("}");
        return sbM.toString();
    }
}
