package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h4g extends nc7 {
    public final String b;
    public final wg7 c;

    public h4g(String str, String str2, zjd zjdVar) {
        super(str);
        hsi.b(!zjdVar.isEmpty());
        this.b = str2;
        wg7 wg7VarJ = wg7.j(zjdVar);
        this.c = wg7VarJ;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // defpackage.ry9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.u19 r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4g.a(u19):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h4g.class == obj.getClass()) {
            h4g h4gVar = (h4g) obj;
            if (Objects.equals(this.a, h4gVar.a) && Objects.equals(this.b, h4gVar.b) && this.c.equals(h4gVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = u45.e(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nc7
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
