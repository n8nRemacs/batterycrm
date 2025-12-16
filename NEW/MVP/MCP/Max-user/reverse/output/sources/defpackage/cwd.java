package defpackage;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
public final class cwd extends u08 implements em6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ah1 b;
    public final /* synthetic */ zg1 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwd(zg1 zg1Var, Object obj, ah1 ah1Var) {
        super(1);
        this.c = zg1Var;
        this.d = obj;
        this.b = ah1Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.d;
                zg1 zg1Var = this.c;
                zg1Var.b(obj2);
                this.b.i.add(zg1Var);
                return qqg.a;
            default:
                cm6 cm6Var = (cm6) this.d;
                yg1 yg1Var = (yg1) obj;
                try {
                    ah1 ah1Var = this.b;
                    zg1 zg1Var2 = this.c;
                    ah1Var.getClass();
                    EGLSurface eGLSurface = zg1Var2.a;
                    zg1Var2.a = null;
                    yg1Var.d(eGLSurface);
                    return qqg.a;
                } finally {
                    if (cm6Var != null) {
                        cm6Var.invoke();
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwd(ah1 ah1Var, zg1 zg1Var, cm6 cm6Var) {
        super(1);
        this.b = ah1Var;
        this.c = zg1Var;
        this.d = cm6Var;
    }
}
