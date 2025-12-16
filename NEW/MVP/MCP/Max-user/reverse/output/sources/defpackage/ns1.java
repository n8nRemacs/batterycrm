package defpackage;

import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ns1 implements gtd, w2f, dcb {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm6 b;

    public /* synthetic */ ns1(int i, cm6 cm6Var) {
        this.a = i;
        this.b = cm6Var;
    }

    @Override // defpackage.gtd
    public void a() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            case 1:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        CallsThreadUtilsKt.executeOnIoThread$lambda$0(this.b, i2fVar);
    }

    @Override // defpackage.dcb
    public void l(ecb ecbVar) {
        cm6 cm6Var = this.b;
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }
}
