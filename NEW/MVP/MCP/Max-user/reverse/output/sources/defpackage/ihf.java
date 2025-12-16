package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class ihf extends dtf implements sm6 {
    public final /* synthetic */ StickersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihf(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.X = stickersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ihf ihfVar = (ihf) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ihfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ihf ihfVar = new ihf(continuation, this.X);
        ihfVar.o = obj;
        return ihfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sjf sjfVar = (sjf) this.o;
        yy7[] yy7VarArr = StickersScreen.u0;
        StickersScreen stickersScreen = this.X;
        yfb yfbVarZ0 = stickersScreen.z0();
        CharSequence charSequenceB = sjfVar.a.b(stickersScreen.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        yfbVarZ0.setTitle(charSequenceB);
        String str = sjfVar.b;
        if (str != null) {
            stickersScreen.z0().setSubtitle(str);
        }
        return qqg.a;
    }
}
