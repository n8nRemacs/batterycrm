package defpackage;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class el4 implements ne4 {
    public final /* synthetic */ int a = 0;
    public final vgg b;
    public final Object c;
    public final Object d;

    public el4(Context context, String str, dk4 dk4Var) {
        en4 en4Var = new en4();
        en4Var.b = str;
        this.c = context.getApplicationContext();
        this.b = dk4Var;
        this.d = en4Var;
    }

    @Override // defpackage.ne4
    public final qe4 a() {
        switch (this.a) {
            case 0:
                cl4 cl4Var = new cl4((Context) this.c, ((en4) this.d).a());
                vgg vggVar = this.b;
                if (vggVar != null) {
                    cl4Var.S(vggVar);
                }
                return cl4Var;
            default:
                return new a0g((h01) this.c, (String) this.d, this.b);
        }
    }

    public el4(sua suaVar, dk4 dk4Var) {
        new HashMap();
        this.c = suaVar;
        this.d = "ExoPlayer";
        this.b = dk4Var;
    }
}
