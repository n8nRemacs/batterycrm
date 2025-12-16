package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ul0 implements yl {
    public final Uri a;
    public final nm b;
    public final gm c;
    public final ox7 d;

    public ul0(Uri uri, nm nmVar, gm gmVar, ox7 ox7Var) {
        this.a = uri;
        this.b = nmVar;
        this.c = gmVar;
        this.d = ox7Var;
    }

    @Override // defpackage.yl
    public final ox7 getOkParser() {
        return this.d;
    }

    @Override // defpackage.hm
    public final int getPriority() {
        return 16;
    }

    @Override // defpackage.hm
    public final nm getScope() {
        return this.b;
    }

    @Override // defpackage.hm
    public final Uri getUri() {
        return this.a;
    }

    @Override // defpackage.hm
    public final boolean shouldPost() {
        return this.c.c;
    }

    @Override // defpackage.hm
    public final boolean willWriteParams() {
        return this.c.d;
    }

    @Override // defpackage.hm
    public final boolean willWriteSupplyParams() {
        return this.c.e;
    }

    @Override // defpackage.hm
    public final void writeParams(gy7 gy7Var) {
        this.c.c(gy7Var);
    }

    @Override // defpackage.hm
    public final void writeSupplyParams(gy7 gy7Var) {
        this.c.d(gy7Var);
    }
}
