package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zj2 extends l0g {
    public long X;
    public long Y;
    public ArrayList c;
    public int d;
    public int o;

    public zj2(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -677145915:
                    if (str.equals("forward")) {
                        this.X = tm9Var.t0();
                        return;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        this.c = sz.e(tm9Var);
                        return;
                    }
                    break;
                case 111188:
                    if (str.equals("pos")) {
                        this.d = tm9Var.s0();
                        return;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        this.o = tm9Var.s0();
                        return;
                    }
                    break;
                case 2121976803:
                    if (str.equals("backward")) {
                        this.Y = tm9Var.t0();
                        return;
                    }
                    break;
            }
        }
        tm9Var.v();
    }

    public final List e() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return ue3.d0(arrayList);
    }

    @Override // defpackage.pj0
    public final String toString() {
        int size = e().size();
        int i = this.d;
        int i2 = this.o;
        long j = this.X;
        long j2 = this.Y;
        StringBuilder sbK = wy1.k("{messages=", size, ", pos=", i, ", total=");
        sbK.append(i2);
        sbK.append(", forward=");
        sbK.append(j);
        return u45.i(j2, ", backward=", "}", sbK);
    }
}
