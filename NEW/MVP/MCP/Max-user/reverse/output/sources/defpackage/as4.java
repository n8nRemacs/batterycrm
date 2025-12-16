package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class as4 implements rn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;

    public /* synthetic */ as4(tu1 tu1Var, int i) {
        this.a = i;
        this.b = tu1Var;
    }

    @Override // defpackage.rn6, defpackage.v2f
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                this.b.b(new ArrayList(list));
                break;
            default:
                tu1 tu1Var = this.b;
                try {
                    tu1Var.b(obj);
                    break;
                } catch (Throwable th) {
                    tu1Var.d(th);
                }
        }
    }

    @Override // defpackage.rn6
    public final void onFailure(Throwable th) {
        switch (this.a) {
            case 0:
                boolean z = th instanceof TimeoutException;
                tu1 tu1Var = this.b;
                if (!z) {
                    tu1Var.b(Collections.EMPTY_LIST);
                    break;
                } else {
                    tu1Var.d(th);
                    break;
                }
            default:
                this.b.d(th);
                break;
        }
    }
}
