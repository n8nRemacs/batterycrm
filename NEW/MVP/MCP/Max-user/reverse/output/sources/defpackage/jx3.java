package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jx3 extends l0g implements xg8 {
    public final List c;

    public jx3(List list) {
        this.c = list;
    }

    @Override // defpackage.xg8
    public final String a(boolean z, boolean z2) {
        return "CONTACT_INFO.Response(contacts=" + eri.b(this.c, z, z2) + ')';
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.c) {
            if (((gx3) obj) != ex3.z0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx3) && fni.a(this.c, ((jx3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return a(false, false);
    }
}
