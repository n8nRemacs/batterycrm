package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class krc implements lrc {
    public final ArrayList a;
    public final boolean b;

    public krc(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krc)) {
            return false;
        }
        krc krcVar = (krc) obj;
        return this.a.equals(krcVar.a) && this.b == krcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(codes=" + this.a + ", fromLocalFile=" + this.b + ")";
    }
}
