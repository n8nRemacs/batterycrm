package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class yh0 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tcf b;

    public /* synthetic */ yh0(tcf tcfVar, int i) {
        this.a = i;
        this.b = tcfVar;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.d(new pg0(z26Var, 3), continuation);
                break;
            case 1:
                this.b.d(new pg0(z26Var, 16), continuation);
                break;
            case 2:
                this.b.d(new to1(z26Var, 2), continuation);
                break;
            case 3:
                this.b.d(new to1(z26Var, 28), continuation);
                break;
            case 4:
                this.b.d(new to1(z26Var, 29), continuation);
                break;
            case 5:
                this.b.d(new a53(z26Var, 7), continuation);
                break;
            case 6:
                this.b.d(new h28(z26Var, 11), continuation);
                break;
            case 7:
                this.b.d(new h28(z26Var, 12), continuation);
                break;
            case 8:
                this.b.d(new h28(z26Var, 15), continuation);
                break;
            case 9:
                this.b.d(new h28(z26Var, 25), continuation);
                break;
            case 10:
                this.b.d(new h28(z26Var, 26), continuation);
                break;
            case 11:
                this.b.d(new f0a(z26Var, 5), continuation);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                this.b.d(new f0a(z26Var, 15), continuation);
                break;
            case 13:
                this.b.d(new yjf(z26Var, 2), continuation);
                break;
            default:
                this.b.d(new yjf(z26Var, 3), continuation);
                break;
        }
        return g84.a;
    }
}
