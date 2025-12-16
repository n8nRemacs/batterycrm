package defpackage;

import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class fb3 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ fb3(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                if (((jbg) obj).a == this.b) {
                }
                break;
            case 1:
                if (((Integer) ((Map.Entry) obj).getKey()).intValue() < this.b) {
                }
                break;
            case 2:
                if (((jbg) obj).a == this.b) {
                }
                break;
            case 3:
                if (((ylf) obj).a == (this.b & 3)) {
                }
                break;
            case 4:
                if (((obg) obj).a == this.b) {
                }
                break;
            case 5:
                if (((mbg) obj).a == this.b) {
                }
                break;
            default:
                if (((nbg) obj).a == this.b) {
                }
                break;
        }
        return false;
    }
}
