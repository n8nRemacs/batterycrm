package defpackage;

import android.content.Context;
import java.util.ArrayList;
import one.me.sdk.media.transformer.impl.IllegalMediaTransformException;

/* loaded from: classes2.dex */
public final class ha9 {
    public final Context a;
    public String c;
    public int d;
    public int e;
    public float g;
    public boolean i;
    public boolean j;
    public boolean k;
    public s6b o;
    public boolean r;
    public final ArrayList b = new ArrayList();
    public int f = -1;
    public float h = 1.0f;
    public boolean l = true;
    public boolean m = true;
    public int n = -1;
    public long p = 500;
    public long q = 300000;

    public ha9(Context context) {
        this.a = context;
    }

    public final sa9 a() {
        String str;
        long j = this.p;
        String str2 = this.c;
        this.c = str2 != null ? vmf.c0(str2).toString() : null;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || (str = this.c) == null || str.length() == 0) {
            throw new IllegalMediaTransformException("Illegal input/output=" + arrayList + "/" + this.c, null);
        }
        float f = this.g;
        if (f >= 0.0f && 1.0f > f) {
            float f2 = this.h;
            if (f2 > f && 1.0d >= f2) {
                if ((this.d <= 0) != (this.e <= 0)) {
                    throw new IllegalMediaTransformException(ho7.g("Illegal requested size=", this.d, this.e, "x"), null);
                }
                if (j <= 0) {
                    throw new IllegalMediaTransformException(a9h.d(j, "Illegal ping delay=", " ms"), null);
                }
                ha9 ha9Var = new ha9(this.a);
                ha9Var.b.addAll(arrayList);
                ha9Var.c = this.c;
                ha9Var.d = this.d;
                ha9Var.e = this.e;
                ha9Var.f = this.f;
                ha9Var.i = this.i;
                ha9Var.j = this.j;
                ha9Var.k = this.k;
                ha9Var.h = this.h;
                ha9Var.g = this.g;
                ha9Var.l = this.l;
                ha9Var.m = this.m;
                ha9Var.n = this.n;
                ha9Var.o = this.o;
                ha9Var.p = j;
                ha9Var.q = this.q;
                ha9Var.r = this.r;
                sa9 sa9Var = new sa9();
                sa9Var.a = ha9Var;
                sa9Var.b = sa9.class.getName();
                sa9Var.c = ha9Var.a.getApplicationContext();
                return sa9Var;
            }
        }
        throw new IllegalMediaTransformException("Illegal requested position range=[" + this.g + ", " + this.h + "]", null);
    }
}
