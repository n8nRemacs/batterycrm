package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ci5 implements fve {
    public final /* synthetic */ int a;
    public final jve b;

    public ci5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = kve.b(1, 0, 6);
                break;
            default:
                this.b = kve.b(0, Integer.MAX_VALUE, 4);
                break;
        }
    }

    @Override // defpackage.fve
    public final List b() {
        switch (this.a) {
        }
        return this.b.b();
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.d(z26Var, continuation);
                break;
            default:
                this.b.d(z26Var, continuation);
                break;
        }
        return g84.a;
    }
}
