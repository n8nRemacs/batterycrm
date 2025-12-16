package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class cv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cv2 cv2Var = (cv2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cv2 cv2Var = new cv2(continuation, this.X);
        cv2Var.o = obj;
        return cv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Drawable drawable = (Drawable) this.o;
        yy7[] yy7VarArr = ChatScreen.l1;
        ChatScreen chatScreen = this.X;
        ((View) chatScreen.e1.D(chatScreen, ChatScreen.l1[22])).setBackground(drawable);
        return qqg.a;
    }
}
