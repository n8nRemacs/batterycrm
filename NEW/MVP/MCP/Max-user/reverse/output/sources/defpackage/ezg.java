package defpackage;

/* loaded from: classes.dex */
public abstract class ezg extends dzg {
    public xob[] a;
    public String b;
    public int c;

    public ezg() {
        this.a = null;
        this.c = 0;
    }

    public xob[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(xob[] xobVarArr) {
        if (!ve3.b(this.a, xobVarArr)) {
            this.a = ve3.g(xobVarArr);
            return;
        }
        xob[] xobVarArr2 = this.a;
        for (int i = 0; i < xobVarArr.length; i++) {
            xobVarArr2[i].a = xobVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = xobVarArr[i].b;
                if (i2 < fArr.length) {
                    xobVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public ezg(ezg ezgVar) {
        this.a = null;
        this.c = 0;
        this.b = ezgVar.b;
        this.a = ve3.g(ezgVar.a);
    }
}
