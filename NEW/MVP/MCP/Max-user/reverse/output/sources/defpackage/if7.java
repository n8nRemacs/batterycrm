package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class if7 implements eh6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf7 b;

    public /* synthetic */ if7(jf7 jf7Var, jf7 jf7Var2, int i) {
        this.a = i;
        this.b = jf7Var2;
    }

    @Override // defpackage.eh6
    public final void a(fh6 fh6Var) throws Exception {
        int i = this.a;
        jf7 jf7Var = this.b;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                if (jf7Var != null) {
                    jf7Var.close();
                    break;
                }
                break;
            default:
                int i3 = ImageProcessingUtil.a;
                jf7Var.close();
                break;
        }
    }
}
