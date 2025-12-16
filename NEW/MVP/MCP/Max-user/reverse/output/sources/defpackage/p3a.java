package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p3a extends oy {
    public final long c;
    public final ArrayList d;
    public final ArrayList o;

    public p3a(int i, long j) {
        super(i, 4);
        this.c = j;
        this.d = new ArrayList();
        this.o = new ArrayList();
    }

    @Override // defpackage.oy
    public final String toString() {
        return oy.i(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.o.toArray());
    }

    public final p3a w(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            p3a p3aVar = (p3a) arrayList.get(i2);
            if (p3aVar.b == i) {
                return p3aVar;
            }
        }
        return null;
    }

    public final q3a x(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q3a q3aVar = (q3a) arrayList.get(i2);
            if (q3aVar.b == i) {
                return q3aVar;
            }
        }
        return null;
    }
}
