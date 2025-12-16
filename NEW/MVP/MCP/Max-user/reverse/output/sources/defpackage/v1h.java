package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class v1h extends l0g {
    public boolean X;
    public List c;
    public long d;
    public long o;

    public v1h(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "forwardMarker":
                this.d = efi.l(tm9Var, 0L);
                break;
            case "hasMore":
                this.X = efi.g(tm9Var);
                break;
            case "history":
                this.c = efi.s(tm9Var, new i0g());
                break;
            case "backwardMarker":
                this.o = efi.l(tm9Var, 0L);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        int iA = zdi.a(this.c);
        long j = this.d;
        long j2 = this.o;
        boolean z = this.X;
        StringBuilder sbM = u45.m(iA, j, "{calls=", ", forwardMarker=");
        az1.r(j2, ", backwardMarker=", ", hasMore=", sbM);
        return az1.k(sbM, z, "}");
    }
}
