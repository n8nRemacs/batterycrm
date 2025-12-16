package defpackage;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mhb extends ar4 {
    public final khb l;

    public mhb(Context context, khb khbVar, vh4 vh4Var) {
        o98 o98VarD = ve3.d();
        if (vh4Var.b) {
            o98VarD.add("video/av01");
        }
        if (vh4Var.a) {
            o98VarD.add("video/x-vnd.on2.vp9");
        }
        o98VarD.add("video/avc");
        o98 o98VarA = ve3.a(o98VarD);
        o98 o98VarD2 = ve3.d();
        if (vh4Var.c) {
            o98VarD2.add("audio/opus");
        }
        o98VarD2.add("audio/mp4a-latm");
        o98VarD2.add("audio/mp4");
        o98 o98VarA2 = ve3.a(o98VarD2);
        lq4 lq4Var = new lq4();
        String[] strArr = (String[]) o98VarA.toArray(new String[0]);
        lq4Var.m = wg7.k((String[]) Arrays.copyOf(strArr, strArr.length));
        String[] strArr2 = (String[]) o98VarA2.toArray(new String[0]);
        lq4Var.t = wg7.k((String[]) Arrays.copyOf(strArr2, strArr2.length));
        super(context, new nq4(lq4Var), khbVar);
        this.l = khbVar;
    }
}
