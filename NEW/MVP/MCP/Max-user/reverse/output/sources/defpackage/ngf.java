package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ngf extends l0g {
    public ArrayList c;
    public long d;

    public ngf(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.d = tm9Var.t0();
            return;
        }
        if (!str.equals("stickers")) {
            tm9Var.v();
            return;
        }
        int iF = efi.f(tm9Var);
        this.c = new ArrayList(iF);
        for (int i = 0; i < iF; i++) {
            this.c.add(Long.valueOf(tm9Var.t0()));
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{stickerIds=" + this.c + ", marker=" + this.d + "}";
    }
}
