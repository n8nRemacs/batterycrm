package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class mah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mah(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mah mahVar = (mah) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mahVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mah mahVar = new mah(continuation, this.X);
        mahVar.o = obj;
        return mahVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((e9h) this.X.A0.getValue()).setFramesListBitmap((Bitmap) this.o);
        return qqg.a;
    }
}
