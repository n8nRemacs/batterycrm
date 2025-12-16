package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class qah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qah(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qah qahVar = (qah) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qahVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qah qahVar = new qah(continuation, this.X);
        qahVar.o = obj;
        return qahVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        x5h x5hVar = (x5h) this.o;
        VideoMessageWidget videoMessageWidget = this.X;
        vnd vndVar = videoMessageWidget.x0;
        ?? r2 = videoMessageWidget.Y;
        if (fni.a(x5hVar, u5h.a)) {
            if (r2.e()) {
                cbh cbhVarF0 = videoMessageWidget.F0();
                float f = 0.0f;
                if (videoMessageWidget.F0().a() == 0.0f) {
                    if (vndVar.e()) {
                        ((o7h) vndVar.getValue()).c(false);
                    }
                    f = 1.0f;
                } else if (vndVar.e()) {
                    ((o7h) vndVar.getValue()).c(true);
                }
                cbhVarF0.b(f);
            }
        } else if (x5hVar instanceof w5h) {
            if (r2.e()) {
                if (!videoMessageWidget.F0().y0()) {
                    videoMessageWidget.F0().pause();
                }
                videoMessageWidget.F0().seekTo((long) (((w5h) x5hVar).a * videoMessageWidget.F0().getDuration()));
            }
        } else if (x5hVar instanceof v5h) {
            if (r2.e()) {
                if (!videoMessageWidget.F0().y0()) {
                    videoMessageWidget.F0().pause();
                }
                videoMessageWidget.F0().seekTo((long) (((v5h) x5hVar).a * videoMessageWidget.F0().getDuration()));
            }
        } else {
            if (!fni.a(x5hVar, u5h.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (r2.e()) {
                videoMessageWidget.F0().play();
            }
        }
        return qqg.a;
    }
}
