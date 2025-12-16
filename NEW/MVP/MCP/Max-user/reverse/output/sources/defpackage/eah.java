package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class eah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public final /* synthetic */ View Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eah(View view, Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((eah) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new eah(this.Y, continuation, this.X);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01c6  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eah.n(java.lang.Object):java.lang.Object");
    }
}
