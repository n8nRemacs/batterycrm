package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class tu extends l0g {
    public Map X;
    public List Y;
    public Map Z;
    public long c;
    public List d;
    public Map o;
    public Map s0;

    public tu(tm9 tm9Var) {
        super(tm9Var);
        if (this.d == null) {
            this.d = Collections.EMPTY_LIST;
        }
        if (this.o == null) {
            this.o = Collections.EMPTY_MAP;
        }
        if (this.X == null) {
            this.X = Collections.EMPTY_MAP;
        }
        if (this.Y == null) {
            this.Y = Collections.EMPTY_LIST;
        }
        if (this.Z == null) {
            this.Z = Collections.EMPTY_MAP;
        }
        if (this.s0 == null) {
            this.s0 = Collections.EMPTY_MAP;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.util.ArrayList] */
    @Override // defpackage.l0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.tm9 r18, java.lang.String r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.d(tm9, java.lang.String):void");
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{sync=" + this.c + ", sections=" + zdi.a(this.d) + ", stickersUpdates=" + zdi.d(this.o) + ", stickersSetsUpdates=" + zdi.d(this.X) + ", stickersOrder=" + zdi.a(this.Y) + ", animojiUpdates=" + zdi.d(this.Z) + ", animojiSetsUpdates=" + zdi.d(this.s0) + "}";
    }
}
