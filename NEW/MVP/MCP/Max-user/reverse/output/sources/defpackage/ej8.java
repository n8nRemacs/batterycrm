package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ej8 implements z26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj8 b;

    public /* synthetic */ ej8(sj8 sj8Var, int i) {
        this.a = i;
        this.b = sj8Var;
    }

    @Override // defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                final List list = (List) obj;
                final int i = 0;
                final sj8 sj8Var = this.b;
                Object objI = vmi.i(bd5.a, new cm6() { // from class: dj8
                    @Override // defpackage.cm6
                    public final Object invoke() throws InterruptedException {
                        switch (i) {
                            case 0:
                                sj8Var.o.put(list);
                                break;
                            default:
                                sj8Var.Y.put(list);
                                break;
                        }
                        return qqg.a;
                    }
                }, continuation);
                if (objI != g84.a) {
                    break;
                }
                break;
            default:
                final List list2 = (List) obj;
                final int i2 = 1;
                final sj8 sj8Var2 = this.b;
                Object objI2 = vmi.i(bd5.a, new cm6() { // from class: dj8
                    @Override // defpackage.cm6
                    public final Object invoke() throws InterruptedException {
                        switch (i2) {
                            case 0:
                                sj8Var2.o.put(list2);
                                break;
                            default:
                                sj8Var2.Y.put(list2);
                                break;
                        }
                        return qqg.a;
                    }
                }, continuation);
                if (objI2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
