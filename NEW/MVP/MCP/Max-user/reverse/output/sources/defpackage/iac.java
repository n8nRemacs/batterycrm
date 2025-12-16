package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class iac {
    public final int a;
    public final Rect b;
    public final int c;
    public final int d;
    public final Matrix e;
    public final knd f;
    public final String g;
    public final ha8 i;
    public int j = -1;
    public final ArrayList h = new ArrayList();

    public iac(f52 f52Var, Rect rect, int i, int i2, Matrix matrix, knd kndVar, ha8 ha8Var, int i3) {
        this.a = i3;
        this.d = i2;
        this.c = i;
        this.b = rect;
        this.e = matrix;
        this.f = kndVar;
        this.g = String.valueOf(f52Var.hashCode());
        List<q52> list = f52Var.a;
        Objects.requireNonNull(list);
        for (q52 q52Var : list) {
            ArrayList arrayList = this.h;
            q52Var.getClass();
            arrayList.add(0);
        }
        this.i = ha8Var;
    }
}
