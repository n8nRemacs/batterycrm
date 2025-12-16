package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class qac {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final dr6 d;
    public final je7 e;
    public final kme f;
    public final v25 g;
    public final boolean h;
    public final bk5 i;
    public final py0 j;
    public final brf k;
    public final jf9 l;
    public final jf9 m;
    public final kk4 n;
    public final r2c o;
    public final x6i p;
    public final int q;

    public qac(Context context, dr6 dr6Var, kn4 kn4Var, kme kmeVar, v25 v25Var, boolean z, bk5 bk5Var, py0 py0Var, lo7 lo7Var, lo7 lo7Var2, brf brfVar, kk4 kk4Var, r2c r2cVar, int i, x6i x6iVar) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = dr6Var;
        this.e = kn4Var;
        this.f = kmeVar;
        this.g = v25Var;
        this.h = z;
        this.i = bk5Var;
        this.j = py0Var;
        this.m = lo7Var;
        this.l = lo7Var2;
        this.k = brfVar;
        this.n = kk4Var;
        this.o = r2cVar;
        new mni();
        new mni();
        this.q = i;
        this.p = x6iVar;
    }

    public final xnd a(nac nacVar, boolean z, uf7 uf7Var) {
        return new xnd(this.i.e(), this.j, nacVar, z, uf7Var);
    }
}
