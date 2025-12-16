package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* loaded from: classes2.dex */
public final class nz7 extends dtf implements sm6 {
    public final /* synthetic */ KeyboardEmojiWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.X = keyboardEmojiWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nz7 nz7Var = (nz7) l((rc5) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nz7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nz7 nz7Var = new nz7(this.X, continuation);
        nz7Var.o = obj;
        return nz7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        rc5 rc5Var = (rc5) this.o;
        KeyboardEmojiWidget keyboardEmojiWidget = this.X;
        keyboardEmojiWidget.X.E(rc5Var.a);
        keyboardEmojiWidget.o.E(rc5Var.b);
        return qqg.a;
    }
}
