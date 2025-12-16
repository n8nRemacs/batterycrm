package defpackage;

import android.util.Size;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class dah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public final /* synthetic */ sid Y;
    public final /* synthetic */ l5h Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dah(VideoMessageWidget videoMessageWidget, sid sidVar, l5h l5hVar, Continuation continuation) {
        super(2, continuation);
        this.X = videoMessageWidget;
        this.Y = sidVar;
        this.Z = l5hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dah) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dah(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = VideoMessageWidget.H0;
            x9h x9hVarG0 = this.X.G0();
            int i2 = this.Y.a;
            Size size = new Size(i2, i2);
            q8c surfaceProvider = this.Z.getSurfaceProvider();
            this.o = 1;
            Object objM = ((q8h) x9hVarG0.b).m(size, surfaceProvider, this);
            g84 g84Var = g84.a;
            if (objM != g84Var) {
                objM = qqgVar;
            }
            if (objM == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqgVar;
    }
}
