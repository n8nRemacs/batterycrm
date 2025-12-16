package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class fah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public final /* synthetic */ View Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fah(View view, Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fah) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fah(this.Y, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        VideoMessageWidget videoMessageWidget = this.X;
        j48 viewLifecycleOwner = videoMessageWidget.getViewLifecycleOwner();
        eah eahVar = new eah(this.Y, null, videoMessageWidget);
        this.o = 1;
        Object objB = b8j.b(viewLifecycleOwner.p(), l38.o, eahVar, this);
        g84 g84Var = g84.a;
        if (objB != g84Var) {
            objB = qqgVar;
        }
        return objB == g84Var ? g84Var : qqgVar;
    }
}
