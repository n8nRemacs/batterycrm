package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f7c {
    public final CharSequence a;
    public final String[] b;

    public f7c(CharSequence charSequence, String[] strArr) {
        this.a = charSequence;
        this.b = strArr;
    }

    public static f7c a() {
        return new f7c("", new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7c)) {
            return false;
        }
        f7c f7cVar = (f7c) obj;
        if (this.a.equals(f7cVar.a)) {
            return Arrays.equals(this.b, f7cVar.b);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreProcessedText{text=");
        sb.append((Object) uog.h(this.a));
        sb.append(", tokens=");
        return xc0.h(sb, this.b.length, '}');
    }
}
