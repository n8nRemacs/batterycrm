package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e27 extends yt3 {
    public yt3[] q0 = new yt3[4];
    public int r0 = 0;

    public final void R(int i, w2i w2iVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            yt3 yt3Var = this.q0[i2];
            ArrayList arrayList2 = w2iVar.a;
            if (!arrayList2.contains(yt3Var)) {
                arrayList2.add(yt3Var);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            h2f.a(this.q0[i3], i, arrayList, w2iVar);
        }
    }

    public void S() {
    }
}
