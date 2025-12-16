package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class czg extends dzg {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public czg() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // defpackage.dzg
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((dzg) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.dzg
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((dzg) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public czg(czg czgVar, us usVar) {
        azg azgVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = czgVar.c;
        this.d = czgVar.d;
        this.e = czgVar.e;
        this.f = czgVar.f;
        this.g = czgVar.g;
        this.h = czgVar.h;
        this.i = czgVar.i;
        String str = czgVar.k;
        this.k = str;
        if (str != null) {
            usVar.put(str, this);
        }
        matrix.set(czgVar.j);
        ArrayList arrayList = czgVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof czg) {
                this.b.add(new czg((czg) obj, usVar));
            } else {
                if (obj instanceof bzg) {
                    bzg bzgVar = (bzg) obj;
                    bzg bzgVar2 = new bzg(bzgVar);
                    bzgVar2.e = 0.0f;
                    bzgVar2.g = 1.0f;
                    bzgVar2.h = 1.0f;
                    bzgVar2.i = 0.0f;
                    bzgVar2.j = 1.0f;
                    bzgVar2.k = 0.0f;
                    bzgVar2.l = Paint.Cap.BUTT;
                    bzgVar2.m = Paint.Join.MITER;
                    bzgVar2.n = 4.0f;
                    bzgVar2.d = bzgVar.d;
                    bzgVar2.e = bzgVar.e;
                    bzgVar2.g = bzgVar.g;
                    bzgVar2.f = bzgVar.f;
                    bzgVar2.c = bzgVar.c;
                    bzgVar2.h = bzgVar.h;
                    bzgVar2.i = bzgVar.i;
                    bzgVar2.j = bzgVar.j;
                    bzgVar2.k = bzgVar.k;
                    bzgVar2.l = bzgVar.l;
                    bzgVar2.m = bzgVar.m;
                    bzgVar2.n = bzgVar.n;
                    azgVar = bzgVar2;
                } else if (obj instanceof azg) {
                    azgVar = new azg((azg) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(azgVar);
                Object obj2 = azgVar.b;
                if (obj2 != null) {
                    usVar.put(obj2, azgVar);
                }
            }
        }
    }
}
