package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class de1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x26[] b;

    public /* synthetic */ de1(x26[] x26VarArr, int i) {
        this.a = i;
        this.b = x26VarArr;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ku3[this.b.length];
            case 1:
                return new f86[this.b.length];
            case 2:
                return new List[this.b.length];
            case 3:
                return new Object[this.b.length];
            case 4:
                return new ku3[this.b.length];
            case 5:
                return new z4b[this.b.length];
            case 6:
                return new kyb[this.b.length];
            default:
                return new Object[this.b.length];
        }
    }
}
