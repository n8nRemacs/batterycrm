package defpackage;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class pv2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ pv2(y8 y8Var, int i) {
        this.a = i;
        this.b = y8Var;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((fr2) this.b).invoke(obj);
                break;
            case 1:
                ((fr2) this.b).invoke(obj);
                break;
            default:
                ((fr2) this.b).invoke(obj);
                break;
        }
    }
}
