package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gte {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public gte() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        cte cteVar = new cte(f4, f5, f4, f5);
        cteVar.f = this.e;
        cteVar.g = f3;
        this.h.add(new ate(cteVar));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ete) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        dte dteVar = new dte();
        dteVar.b = f;
        dteVar.c = f2;
        this.g.add(dteVar);
        bte bteVar = new bte(dteVar, this.c, this.d);
        float fB = bteVar.b() + 270.0f;
        float fB2 = bteVar.b() + 270.0f;
        a(fB);
        this.h.add(bteVar);
        this.e = fB2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
