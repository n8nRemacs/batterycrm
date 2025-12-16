package defpackage;

import android.opengl.EGLSurface;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class epg extends u08 implements em6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zg1 b;
    public final /* synthetic */ ah1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epg(zg1 zg1Var, ah1 ah1Var) {
        super(1);
        this.b = zg1Var;
        this.c = ah1Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                yg1 yg1Var = (yg1) obj;
                ah1 ah1Var = this.c;
                ArrayList arrayList = ah1Var.i;
                zg1 zg1Var = this.b;
                if (arrayList.remove(zg1Var)) {
                    ah1Var.getClass();
                    EGLSurface eGLSurface = zg1Var.a;
                    zg1Var.a = null;
                    yg1Var.d(eGLSurface);
                    zg1Var.c(yg1Var);
                }
                break;
            default:
                this.b.d(this.c, (yg1) obj);
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epg(ah1 ah1Var, zg1 zg1Var) {
        super(1);
        this.c = ah1Var;
        this.b = zg1Var;
    }
}
