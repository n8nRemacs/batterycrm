package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class qyf {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public qyf(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        r8 = defpackage.gke.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bc, code lost:
    
        r2.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.qyf a(defpackage.pk6 r26, java.lang.String r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyf.a(pk6, java.lang.String):qyf");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyf)) {
            return false;
        }
        qyf qyfVar = (qyf) obj;
        if (!fni.a(this.a, qyfVar.a) || !fni.a(this.b, qyfVar.b) || !fni.a(this.c, qyfVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = qyfVar.d) == null) {
            return true;
        }
        return fni.a(set2, set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
