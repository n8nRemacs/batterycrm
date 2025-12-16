package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class xhe implements Serializable {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean o;

    public xhe(long j, String str, String str2, String str3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.o = z;
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "Session{=", ", current=", this.o);
        sbJ.append("}");
        return sbJ.toString();
    }
}
