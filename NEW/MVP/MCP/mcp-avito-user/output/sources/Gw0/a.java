package GW0;

import I41.h;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.internal.o;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.drawable.e;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.k;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: GenericDraweeHierarchy.java */
/* loaded from: classes10.dex */
public class a implements IW0.c {

    /* renamed from: a, reason: collision with root package name */
    public final ColorDrawable f6529a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f6530b;

    /* renamed from: c, reason: collision with root package name */
    @h
    public RoundingParams f6531c;

    /* renamed from: d, reason: collision with root package name */
    public final d f6532d;

    /* renamed from: e, reason: collision with root package name */
    public final com.facebook.drawee.drawable.h f6533e;
    private final i mActualImageWrapper;

    public a(b bVar) {
        int i12;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f6529a = colorDrawable;
        com.facebook.imagepipeline.systrace.b.a();
        this.f6530b = bVar.f6536a;
        this.f6531c = bVar.f6552q;
        i iVar = new i(colorDrawable);
        this.mActualImageWrapper = iVar;
        List<Drawable> list = bVar.f6550o;
        int size = list != null ? list.size() : 1;
        int i13 = (size == 0 ? 1 : size) + (bVar.f6551p != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i13 + 6];
        drawableArr[0] = f(bVar.f6549n, null);
        drawableArr[1] = f(bVar.f6539d, bVar.f6540e);
        s.a aVar = bVar.f6547l;
        iVar.setColorFilter(bVar.f6548m);
        drawableArr[2] = com.facebook.drawee.generic.a.e(iVar, aVar);
        drawableArr[3] = f(bVar.f6545j, bVar.f6546k);
        drawableArr[4] = f(bVar.f6541f, bVar.f6542g);
        drawableArr[5] = f(bVar.f6543h, bVar.f6544i);
        if (i13 > 0) {
            List<Drawable> list2 = bVar.f6550o;
            if (list2 != null) {
                Iterator<Drawable> it = list2.iterator();
                i12 = 0;
                while (it.hasNext()) {
                    drawableArr[i12 + 6] = f(it.next(), null);
                    i12++;
                }
            } else {
                i12 = 1;
            }
            StateListDrawable stateListDrawable = bVar.f6551p;
            if (stateListDrawable != null) {
                drawableArr[i12 + 6] = f(stateListDrawable, null);
            }
        }
        com.facebook.drawee.drawable.h hVar = new com.facebook.drawee.drawable.h(drawableArr);
        this.f6533e = hVar;
        hVar.f340059m = bVar.f6537b;
        if (hVar.f340058l == 1) {
            hVar.f340058l = 0;
        }
        d dVar = new d(com.facebook.drawee.generic.a.d(hVar, this.f6531c));
        dVar.f6553f = null;
        this.f6532d = dVar;
        dVar.mutate();
        m();
        com.facebook.imagepipeline.systrace.b.a();
    }

    @Override // IW0.b
    public final d a() {
        return this.f6532d;
    }

    @Override // IW0.c
    public final void b() {
        com.facebook.drawee.drawable.h hVar = this.f6533e;
        hVar.f340065s++;
        h();
        if (hVar.a(5) != null) {
            g(5);
        } else {
            g(1);
        }
        hVar.d();
    }

    @Override // IW0.c
    public final void c(float f12, boolean z12) {
        com.facebook.drawee.drawable.h hVar = this.f6533e;
        if (hVar.a(3) == null) {
            return;
        }
        hVar.f340065s++;
        r(f12);
        if (z12) {
            hVar.g();
        }
        hVar.d();
    }

    @Override // IW0.c
    public final void d(Drawable drawable, float f12, boolean z12) {
        Drawable drawableC = com.facebook.drawee.generic.a.c(drawable, this.f6531c, this.f6530b);
        drawableC.mutate();
        this.mActualImageWrapper.n(drawableC);
        com.facebook.drawee.drawable.h hVar = this.f6533e;
        hVar.f340065s++;
        h();
        g(2);
        r(f12);
        if (z12) {
            hVar.g();
        }
        hVar.d();
    }

    @Override // IW0.c
    public final void e(@h EW0.a aVar) {
        d dVar = this.f6532d;
        dVar.f6553f = aVar;
        dVar.invalidateSelf();
    }

    @h
    public final Drawable f(@h Drawable drawable, @h s.a aVar) {
        return com.facebook.drawee.generic.a.e(com.facebook.drawee.generic.a.c(drawable, this.f6531c, this.f6530b), aVar);
    }

    public final void g(int i12) {
        if (i12 >= 0) {
            com.facebook.drawee.drawable.h hVar = this.f6533e;
            hVar.f340058l = 0;
            hVar.f340064r[i12] = true;
            hVar.invalidateSelf();
        }
    }

    @Override // IW0.b
    public final Rect getBounds() {
        return this.f6532d.getBounds();
    }

    public final void h() {
        i(1);
        i(2);
        i(3);
        i(4);
        i(5);
    }

    public final void i(int i12) {
        if (i12 >= 0) {
            com.facebook.drawee.drawable.h hVar = this.f6533e;
            hVar.f340058l = 0;
            hVar.f340064r[i12] = false;
            hVar.invalidateSelf();
        }
    }

    public final void j(RectF rectF) {
        i iVar = this.mActualImageWrapper;
        Matrix matrix = i.f340068e;
        iVar.m(matrix);
        rectF.set(iVar.getBounds());
        matrix.mapRect(rectF);
    }

    public final e k(int i12) {
        e eVarB = this.f6533e.b(i12);
        if (eVarB.a() instanceof k) {
            eVarB = (k) eVarB.a();
        }
        return eVarB.a() instanceof r ? (r) eVarB.a() : eVarB;
    }

    public final r l(int i12) {
        e eVarK = k(i12);
        if (eVarK instanceof r) {
            return (r) eVarK;
        }
        Drawable drawableE = com.facebook.drawee.generic.a.e(eVarK.g(com.facebook.drawee.generic.a.f340161a), (s.a) s.c.f340129a);
        eVarK.g(drawableE);
        o.c(drawableE, "Parent has no child drawable!");
        return (r) drawableE;
    }

    public final void m() {
        com.facebook.drawee.drawable.h hVar = this.f6533e;
        if (hVar != null) {
            hVar.f340065s++;
            hVar.f340058l = 0;
            Arrays.fill(hVar.f340064r, true);
            hVar.invalidateSelf();
            h();
            g(1);
            hVar.g();
            hVar.d();
        }
    }

    public final void n(s.c cVar) {
        cVar.getClass();
        l(2).r(cVar);
    }

    public final void o(@h Drawable drawable, int i12) {
        if (drawable == null) {
            this.f6533e.c(null, i12);
        } else {
            k(i12).g(com.facebook.drawee.generic.a.c(drawable, this.f6531c, this.f6530b));
        }
    }

    public final void p(@h Drawable drawable) {
        o.b("The given index does not correspond to an overlay image.", 6 < this.f6533e.f340041d.length);
        o(drawable, 6);
    }

    public final void q(Drawable drawable, s.a aVar) {
        o(drawable, 1);
        l(1).r(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(float f12) {
        Drawable drawableA = this.f6533e.a(3);
        if (drawableA == 0) {
            return;
        }
        if (f12 >= 0.999f) {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).stop();
            }
            i(3);
        } else {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).start();
            }
            g(3);
        }
        drawableA.setLevel(Math.round(f12 * 10000.0f));
    }

    @Override // IW0.c
    public final void reset() {
        this.mActualImageWrapper.n(this.f6529a);
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(@h RoundingParams roundingParams) {
        this.f6531c = roundingParams;
        ColorDrawable colorDrawable = com.facebook.drawee.generic.a.f340161a;
        d dVar = this.f6532d;
        Drawable drawable = dVar.f340069b;
        ColorDrawable colorDrawable2 = com.facebook.drawee.generic.a.f340161a;
        if (roundingParams == null || roundingParams.f340151a != RoundingParams.RoundingMethod.f340158b) {
            if (drawable instanceof RoundedCornersDrawable) {
                dVar.n(((RoundedCornersDrawable) drawable).n(colorDrawable2));
                colorDrawable2.setCallback(null);
            }
        } else if (drawable instanceof RoundedCornersDrawable) {
            RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawable;
            com.facebook.drawee.generic.a.b(roundedCornersDrawable, roundingParams);
            roundedCornersDrawable.f340029n = roundingParams.f340154d;
            roundedCornersDrawable.invalidateSelf();
        } else {
            dVar.n(com.facebook.drawee.generic.a.d(dVar.n(colorDrawable2), roundingParams));
        }
        for (int i12 = 0; i12 < this.f6533e.f340041d.length; i12++) {
            e eVarK = k(i12);
            RoundingParams roundingParams2 = this.f6531c;
            while (true) {
                Object objA = eVarK.a();
                if (objA == eVarK || !(objA instanceof e)) {
                    break;
                } else {
                    eVarK = (e) objA;
                }
            }
            Drawable drawableA = eVarK.a();
            if (roundingParams2 == null || roundingParams2.f340151a != RoundingParams.RoundingMethod.f340159c) {
                if (drawableA instanceof n) {
                    n nVar = (n) drawableA;
                    nVar.b(false);
                    nVar.i();
                    nVar.c(0.0f, 0);
                    nVar.d(0.0f);
                    nVar.l();
                    nVar.j();
                }
            } else if (drawableA instanceof n) {
                com.facebook.drawee.generic.a.b((n) drawableA, roundingParams2);
            } else if (drawableA != 0) {
                eVarK.g(com.facebook.drawee.generic.a.f340161a);
                eVarK.g(com.facebook.drawee.generic.a.a(drawableA, roundingParams2, this.f6530b));
            }
        }
    }
}
