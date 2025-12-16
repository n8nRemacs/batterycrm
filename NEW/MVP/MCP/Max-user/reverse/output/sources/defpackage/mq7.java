package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class mq7 {
    public final lq7 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public mq7(lq7 lq7Var, int[] iArr, String[] strArr) {
        this.a = lq7Var;
        this.b = iArr;
        this.c = strArr;
        this.d = strArr.length == 0 ? rd5.a : Collections.singleton(strArr[0]);
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set set) {
        int[] iArr = this.b;
        int length = iArr.length;
        Set setA = rd5.a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                bke bkeVar = new bke();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        bkeVar.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                setA = gke.a(bkeVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setA = this.d;
            }
        }
        if (setA.isEmpty()) {
            return;
        }
        this.a.a(setA);
    }
}
