package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class vu8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vu8 vu8Var = (vu8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vu8 vu8Var = new vu8(continuation, this.X);
        vu8Var.o = obj;
        return vu8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        MediaBarWidget mediaBarWidget = this.X;
        k18 k18Var = mediaBarWidget.c;
        g8j.b(obj);
        rtc rtcVar = (rtc) this.o;
        if (rtcVar instanceof otc) {
            otc otcVar = (otc) rtcVar;
            pd8 pd8Var = otcVar.a;
            int i = otcVar.b;
            yy7[] yy7VarArr = MediaBarWidget.c1;
            mediaBarWidget.O0(pd8Var, i, "SELECTED_MEDIA_ALBUM");
        } else if (rtcVar instanceof qtc) {
            yy7[] yy7VarArr2 = MediaBarWidget.c1;
            ((qsb) k18Var.getValue()).m(new s2i(mediaBarWidget, 1));
        } else {
            if (!(rtcVar instanceof ptc)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr3 = MediaBarWidget.c1;
            qsb qsbVar = (qsb) k18Var.getValue();
            s2i s2iVar = new s2i(mediaBarWidget, 1);
            qsbVar.getClass();
            qsb.n(qsbVar, s2iVar, qsb.h, 171, i4d.permissions_audio_for_video_request, 0, 48);
        }
        return qqg.a;
    }
}
