package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class wd8 {
    public final Context a;
    public final y6d b;
    public volatile boolean c;
    public volatile boolean d;

    public wd8(Context context, y6d y6dVar) {
        this.a = context;
        this.b = y6dVar;
        this.c = z7.b(context, "android.permission.RECORD_AUDIO") == 0;
        this.d = z7.b(context, "android.permission.CAMERA") == 0;
    }

    public final boolean a() {
        boolean z = false;
        boolean z2 = z7.b(this.a, "android.permission.RECORD_AUDIO") == 0;
        boolean z3 = z7.b(this.a, "android.permission.CAMERA") == 0;
        y6d y6dVar = this.b;
        boolean z4 = this.c;
        boolean z5 = this.d;
        StringBuilder sbP = ho7.p("call permissions state updated, audio: ", z4, "->", z2, ", video: ");
        sbP.append(z5);
        sbP.append("->");
        sbP.append(z3);
        y6dVar.log("LocalMediaPermissionProvider", sbP.toString());
        if (this.c != z2) {
            this.c = z2;
            z = true;
        }
        if (this.d == z3) {
            return z;
        }
        this.d = z3;
        return true;
    }
}
