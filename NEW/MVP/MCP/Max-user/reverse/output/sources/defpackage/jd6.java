package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jd6 extends n2 {
    public final ArrayList d;

    public jd6(ArrayList arrayList) {
        super(xhb.N2);
        this.d = arrayList;
        o("foldersOrder", arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd6) && fni.a(this.d, ((jd6) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
