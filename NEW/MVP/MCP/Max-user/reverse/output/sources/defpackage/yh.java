package defpackage;

/* loaded from: classes2.dex */
public final class yh implements ti {
    public final /* synthetic */ zh a;

    public yh(zh zhVar) {
        this.a = zhVar;
    }

    @Override // defpackage.ti
    public final void a(Double[] dArr) {
        zh zhVar = this.a;
        ti1 ti1Var = zhVar.a.k0.a.a;
        if (ti1Var != null) {
            int length = dArr.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (float) dArr[i].doubleValue();
            }
            ej ejVar = zhVar.h;
            ejVar.g.post(new cj(ejVar, ti1Var, fArr, 0));
        }
    }

    @Override // defpackage.ti
    public final void b() {
    }
}
