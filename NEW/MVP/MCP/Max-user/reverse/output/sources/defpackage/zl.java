package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zl implements yl {
    public final hm a;
    public final ox7 b;

    public zl(hm hmVar, ox7 ox7Var) {
        this.a = hmVar;
        this.b = ox7Var;
    }

    @Override // defpackage.yl
    public final ox7 getFailParser() {
        return tha.c;
    }

    @Override // defpackage.yl
    public final ox7 getOkParser() {
        return this.b;
    }

    @Override // defpackage.hm
    public final int getPriority() {
        return this.a.getPriority();
    }

    @Override // defpackage.hm
    public final nm getScope() {
        return this.a.getScope();
    }

    @Override // defpackage.hm
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.hm
    public final boolean shouldGzip() {
        return this.a.shouldGzip();
    }

    @Override // defpackage.hm
    public final boolean shouldPost() {
        return this.a.shouldPost();
    }

    @Override // defpackage.hm
    public final boolean willWriteParams() {
        return this.a.willWriteParams();
    }

    @Override // defpackage.hm
    public final boolean willWriteSupplyParams() {
        return this.a.willWriteSupplyParams();
    }

    @Override // defpackage.hm
    public final void writeParams(gy7 gy7Var) {
        this.a.writeParams(gy7Var);
    }

    @Override // defpackage.hm
    public final void writeSupplyParams(gy7 gy7Var) {
        this.a.writeSupplyParams(gy7Var);
    }
}
