package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class lz8 {
    public static final String b;
    public final Uri a;

    static {
        String str = zxg.a;
        b = Integer.toString(0, 36);
    }

    public lz8(usd usdVar) {
        this.a = (Uri) usdVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz8) && this.a.equals(((lz8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
