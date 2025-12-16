package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class w44 implements ztd {
    public final /* synthetic */ int a;
    public final /* synthetic */ c54 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Cloneable d;

    public /* synthetic */ w44(c54 c54Var, Cloneable cloneable, int i, int i2) {
        this.a = i2;
        this.b = c54Var;
        this.d = cloneable;
        this.c = i;
    }

    @Override // defpackage.ztd
    public final void a() {
        switch (this.a) {
            case 0:
                Intent intent = (Intent) this.d;
                c54 c54Var = this.b;
                c54Var.router.V(c54Var.instanceId, intent, this.c);
                break;
            default:
                String[] strArr = (String[]) this.d;
                c54 c54Var2 = this.b;
                c54Var2.router.N(c54Var2.instanceId, strArr, this.c);
                break;
        }
    }
}
