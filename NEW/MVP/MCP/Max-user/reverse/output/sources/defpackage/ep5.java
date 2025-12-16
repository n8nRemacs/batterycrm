package defpackage;

import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public final class ep5 extends n2 implements Comparable {
    public final ZipEntry d;
    public final int o;

    public ep5(String str, ZipEntry zipEntry, int i) {
        super(str, 13, String.valueOf(zipEntry.getCrc()));
        this.d = zipEntry;
        this.o = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.b).compareTo((String) ((ep5) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ep5.class == obj.getClass()) {
            ep5 ep5Var = (ep5) obj;
            if (this.d.equals(ep5Var.d) && this.o == ep5Var.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.o * 31);
    }
}
