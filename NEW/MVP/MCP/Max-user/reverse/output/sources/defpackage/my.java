package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class my extends oy {
    public final long c;
    public final ArrayList d;
    public final ArrayList o;

    public my(int i, long j) {
        super(i, 0);
        this.c = j;
        this.d = new ArrayList();
        this.o = new ArrayList();
    }

    @Override // defpackage.oy
    public final String toString() {
        String strH = oy.h(this.b);
        String string = Arrays.toString(this.d.toArray());
        String string2 = Arrays.toString(this.o.toArray());
        StringBuilder sb = new StringBuilder(u45.f(u45.f(u45.f(22, strH), string), string2));
        sb.append(strH);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final my w(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            my myVar = (my) arrayList.get(i2);
            if (myVar.b == i) {
                return myVar;
            }
        }
        return null;
    }

    public final ny x(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ny nyVar = (ny) arrayList.get(i2);
            if (nyVar.b == i) {
                return nyVar;
            }
        }
        return null;
    }
}
