package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class jp9 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x26 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ jp9(hbd hbdVar, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = hbdVar;
        this.c = messageWriteWidget;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new ip9(z26Var, this.c, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new ip9(z26Var, this.c, 1), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
            default:
                Object objD3 = this.b.d(new ip9(z26Var, this.c, 2), continuation);
                if (objD3 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
