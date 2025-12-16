package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xu0 {
    public final r2c a;
    public final we b;
    public final l16 c;
    public final a3b d;
    public final int e;
    public final ConcurrentHashMap f;
    public volatile int g;
    public volatile boolean h;
    public final l16 i;
    public int j;
    public Object k;
    public Set l;

    public xu0(r2c r2cVar, we weVar, l16 l16Var, a3b a3bVar, int i) {
        this.a = r2cVar;
        this.b = weVar;
        this.c = l16Var;
        this.d = a3bVar;
        int iD = (d(a3bVar) * i) / 1000;
        iD = iD < 1 ? 1 : iD;
        this.e = iD;
        this.f = new ConcurrentHashMap();
        this.i = new l16(a3bVar.p(), 6);
        this.j = -1;
        this.k = id5.a;
        this.l = rd5.a;
        a(d(a3bVar));
        this.g = (int) (iD * 0.5f);
    }

    public static int d(a3b a3bVar) {
        long millis = TimeUnit.SECONDS.toMillis(1L) / (((fs3) a3bVar.b).a / a3bVar.p());
        return (int) (millis >= 1 ? millis : 1L);
    }

    public final void a(int i) {
        a3b a3bVar = this.d;
        int i2 = ((fs3) a3bVar.b).a;
        int iV = a3bVar.v();
        if (iV < 1) {
            iV = 1;
        }
        int i3 = i2 * iV;
        int iP = a3bVar.p();
        int iD = d(a3bVar);
        if (i > iD) {
            i = iD;
        }
        int i4 = i >= 1 ? i : 1;
        int i5 = this.c.b;
        if (i4 > i5) {
            i4 = i5;
        }
        float f = (i3 / 1000.0f) * i4;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = iP;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i6 = 0;
        to7 to7VarH = n7j.h(0, iP);
        int i7 = to8.i(we3.q(to7VarH, 10));
        if (i7 < 16) {
            i7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
        Iterator it = to7VarH.iterator();
        while (true) {
            so7 so7Var = (so7) it;
            if (!so7Var.c) {
                this.k = linkedHashMap;
                this.l = ue3.h0(linkedHashMap.values());
                return;
            } else {
                Object next = so7Var.next();
                int iIntValue = ((Number) next).intValue();
                if (((int) (iIntValue % f3)) == 0) {
                    i6 = iIntValue;
                }
                linkedHashMap.put(next, Integer.valueOf(i6));
            }
        }
    }

    public final bg b(int i) {
        bg bgVar;
        l16 l16Var = this.i;
        Iterator it = new to7(0, l16Var.b, 1).iterator();
        do {
            bgVar = null;
            if (!((so7) it).c) {
                break;
            }
            int iD = l16Var.d(i - ((so7) it).nextInt());
            wu0 wu0Var = (wu0) this.f.get(Integer.valueOf(iD));
            if (wu0Var != null) {
                if (wu0Var.b || !wu0Var.a.h0()) {
                    wu0Var = null;
                }
                if (wu0Var != null) {
                    bgVar = new bg(iD, wu0Var.a);
                }
            }
        } while (bgVar == null);
        return bgVar;
    }

    public final dk6 c(int i) {
        bg bgVarB = b(i);
        if (bgVarB == null) {
            return new dk6(3, null);
        }
        vc3 vc3VarClone = bgVarB.b.clone();
        this.j = bgVarB.a;
        return new dk6(2, vc3VarClone);
    }

    public final void e(int i, int i2) {
        if (this.h) {
            return;
        }
        this.h = true;
        ng.a.execute(new vu0(this, i, i2, 0));
    }

    public final void f(int i, vc3 vc3Var) throws IOException {
        vc3 vc3VarW;
        bg bgVarB = b(i);
        we weVar = this.b;
        if (bgVarB != null && (vc3VarW = bgVarB.b.w()) != null) {
            try {
                int i2 = bgVarB.a;
                if (i2 < i) {
                    Bitmap bitmap = (Bitmap) vc3VarW.Z();
                    if (vc3Var.h0() && !vc3Var.Z().equals(bitmap)) {
                        Canvas canvas = new Canvas((Bitmap) vc3Var.Z());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    Iterator it = new to7(i2 + 1, i, 1).iterator();
                    while (((so7) it).c) {
                        weVar.n((Bitmap) vc3Var.Z(), ((so7) it).nextInt());
                    }
                    vc3VarW.close();
                    return;
                }
                vc3VarW.close();
            } finally {
            }
        }
        if (vc3Var.h0()) {
            new Canvas((Bitmap) vc3Var.Z()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Iterator it2 = new to7(0, i, 1).iterator();
        while (((so7) it2).c) {
            weVar.n((Bitmap) vc3Var.Z(), ((so7) it2).nextInt());
        }
    }
}
