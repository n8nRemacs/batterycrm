package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes.dex */
public final class v79 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ a5c g;

    public v79(int i, int i2, int i3, String str, Handler handler, a5c a5cVar) {
        this.f = handler;
        this.g = a5cVar;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        v79 v79Var;
        if (this.e != null) {
            v79Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            v79Var = this;
            v79Var.e = new cjh(v79Var, this.a, this.b, this.d, this.c);
        } else {
            v79Var = this;
            v79Var.e = new bp1(this, v79Var.a, v79Var.b, v79Var.d);
        }
        return v79Var.e;
    }
}
