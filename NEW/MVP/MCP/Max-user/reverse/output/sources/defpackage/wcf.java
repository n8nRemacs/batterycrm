package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;

/* loaded from: classes.dex */
public class wcf extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public final xcf a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public final boolean i;
    public boolean j;
    public Rect k;
    public final boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public final int y;
    public final int z;

    public wcf(wcf wcfVar, xcf xcfVar, Resources resources) {
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = xcfVar;
        this.b = resources != null ? resources : wcfVar != null ? wcfVar.b : null;
        int i = resources != null ? resources.getDisplayMetrics().densityDpi : wcfVar != null ? wcfVar.c : 0;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (wcfVar != null) {
            this.d = wcfVar.d;
            this.e = wcfVar.e;
            this.u = true;
            this.v = true;
            this.i = wcfVar.i;
            this.l = wcfVar.l;
            this.w = wcfVar.w;
            this.x = wcfVar.x;
            this.y = wcfVar.y;
            this.z = wcfVar.z;
            this.A = wcfVar.A;
            this.B = wcfVar.B;
            this.C = wcfVar.C;
            this.D = wcfVar.D;
            this.E = wcfVar.E;
            this.F = wcfVar.F;
            this.G = wcfVar.G;
            if (wcfVar.c == i) {
                if (wcfVar.j) {
                    this.k = wcfVar.k != null ? new Rect(wcfVar.k) : null;
                    this.j = true;
                }
                if (wcfVar.m) {
                    this.n = wcfVar.n;
                    this.o = wcfVar.o;
                    this.p = wcfVar.p;
                    this.q = wcfVar.q;
                    this.m = true;
                }
            }
            if (wcfVar.r) {
                this.s = wcfVar.s;
                this.r = true;
            }
            if (wcfVar.t) {
                this.t = true;
            }
            Drawable[] drawableArr = wcfVar.g;
            this.g = new Drawable[drawableArr.length];
            this.h = wcfVar.h;
            SparseArray sparseArray = wcfVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i2 = this.h;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i3, constantState);
                    } else {
                        this.g[i3] = drawableArr[i3];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
        if (wcfVar != null) {
            this.H = wcfVar.H;
        } else {
            this.H = new int[this.g.length][];
        }
    }

    public final void a() {
        this.m = true;
        b();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void b() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.b);
                u35.b(drawableNewDrawable, this.x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f = null;
        }
    }

    public final Drawable c(int i) {
        int iIndexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(iIndexOfKey)).newDrawable(this.b);
        u35.b(drawableNewDrawable, this.x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.a);
        this.g[i] = drawableMutate;
        this.f.removeAt(iIndexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return drawableMutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (t35.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final int d(int[] iArr) {
        int[][] iArr2 = this.H;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public void e() {
        int[][] iArr = this.H;
        int[][] iArr2 = new int[iArr.length][];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[] iArr3 = this.H[length];
            iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
        }
        this.H = iArr2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new xcf(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new xcf(this, resources);
    }
}
