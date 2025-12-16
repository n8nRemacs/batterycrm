package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class pah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pah(View view, Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pah pahVar = (pah) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pahVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pah pahVar = new pah(this.Y, continuation, this.X);
        pahVar.o = obj;
        return pahVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        VideoMessageWidget videoMessageWidget = this.X;
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        l5h l5hVarA0 = videoMessageWidget.A0();
        pt1 pt1Var = new pt1(this.X, 5, this.Y);
        l5hVarA0.addOnLayoutChangeListener(pt1Var);
        if (l5hVarA0.isLaidOut()) {
            String str = this.X.X;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.o;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "updating blur for video message screen", null);
                }
            }
            this.Y.getBackground().invalidateSelf();
        }
        dqi.d(this.X.A0(), new nb(new rah(l5hVarA0, pt1Var), this.X, this.Y, 3));
        return qqg.a;
    }
}
