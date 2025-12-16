package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class lah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lah(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lah lahVar = (lah) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lahVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lah lahVar = new lah(continuation, this.X);
        lahVar.o = obj;
        return lahVar;
    }

    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        n9h n9hVar = (n9h) this.o;
        VideoMessageWidget videoMessageWidget = this.X;
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        String name = VideoMessageWidget.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "Current video message state: " + n9hVar, null);
            }
        }
        if (n9hVar instanceof j9h) {
            videoMessageWidget.J0();
            videoMessageWidget.H0();
            j9h j9hVar = (j9h) n9hVar;
            videoMessageWidget.E0().setImageDrawable(j9hVar.a.b ? (Drawable) videoMessageWidget.C0.getValue() : (Drawable) videoMessageWidget.D0.getValue());
            videoMessageWidget.I0(j9hVar.a.a, j9hVar.b);
        } else if (n9hVar instanceof k9h) {
            videoMessageWidget.J0();
            videoMessageWidget.H0();
            videoMessageWidget.I0(false, ((k9h) n9hVar).a);
        } else if (n9hVar instanceof m9h) {
            m9h m9hVar = (m9h) n9hVar;
            g2h g2hVar = m9hVar.a;
            if (g2hVar == null) {
                dqi.a(videoMessageWidget.C0(), (View) videoMessageWidget.x0.getValue(), -1);
                dqi.a(videoMessageWidget.C0(), (View) videoMessageWidget.A0.getValue(), -1);
                ((e9h) videoMessageWidget.A0.getValue()).setPreviewBitmap(m9hVar.c);
                ((View) videoMessageWidget.A0.getValue()).setVisibility(0);
                if (videoMessageWidget.D0().getVisibility() == 0) {
                    AnimatorSet animatorSet = videoMessageWidget.E0;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        AnimatorSet animatorSet2 = videoMessageWidget.E0;
                        if (animatorSet2 != null) {
                            animatorSet2.end();
                        }
                        AnimatorSet animatorSet3 = videoMessageWidget.E0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                    }
                    videoMessageWidget.E0 = new AnimatorSet();
                    o98 o98VarD = ve3.d();
                    if (videoMessageWidget.E0().getVisibility() == 0) {
                        o98VarD.add(cqi.b(videoMessageWidget.E0(), View.ALPHA, videoMessageWidget.E0().getAlpha(), 0.0f, 200L, 0L, 112));
                    }
                    ImageView imageViewB0 = videoMessageWidget.B0();
                    Property property = View.ALPHA;
                    o98VarD.add(cqi.b(imageViewB0, property, videoMessageWidget.B0().getAlpha(), 0.0f, 200L, 0L, 112));
                    o98VarD.add(cqi.b(videoMessageWidget.D0(), property, videoMessageWidget.D0().getAlpha(), 0.0f, 200L, 0L, 112));
                    o98 o98VarA = ve3.a(o98VarD);
                    AnimatorSet animatorSet4 = videoMessageWidget.E0;
                    if (animatorSet4 != null) {
                        animatorSet4.playTogether(o98VarA);
                    }
                    AnimatorSet animatorSet5 = videoMessageWidget.E0;
                    if (animatorSet5 != null) {
                        animatorSet5.addListener(new qe(14, videoMessageWidget));
                    }
                    AnimatorSet animatorSet6 = videoMessageWidget.E0;
                    if (animatorSet6 != null) {
                        animatorSet6.start();
                    }
                    qt7 qt7Var = (qt7) videoMessageWidget.w0.D(videoMessageWidget, VideoMessageWidget.H0[5]);
                    if (qt7Var != null) {
                        qt7Var.cancel(null);
                    }
                }
            } else if (!g2hVar.equals(videoMessageWidget.y0)) {
                videoMessageWidget.F0().X(videoMessageWidget.o);
                dqi.a(videoMessageWidget.C0(), (View) videoMessageWidget.x0.getValue(), -1);
                dqi.a(videoMessageWidget.C0(), (View) videoMessageWidget.A0.getValue(), -1);
                ((e9h) videoMessageWidget.A0.getValue()).setPreviewBitmap(m9hVar.c);
                ((View) videoMessageWidget.A0.getValue()).setVisibility(0);
                ((View) videoMessageWidget.x0.getValue()).setVisibility(0);
                if (((gu5) ((rt5) videoMessageWidget.c.getValue())).r()) {
                    ((o7h) videoMessageWidget.x0.getValue()).setAlpha(0.0f);
                }
                videoMessageWidget.y0 = m9hVar.a;
                videoMessageWidget.F0().I0(m9hVar.a, true, bbh.VIDEO_MSG_VIEWER, (16 & 8) != 0 ? 1 : 4, (16 & 16) != 0);
                ((o7h) videoMessageWidget.x0.getValue()).a.a(videoMessageWidget.z0);
                if (m9hVar.b) {
                    videoMessageWidget.A0().setVisibility(8);
                }
            }
        } else if (!(n9hVar instanceof l9h)) {
            throw new NoWhenBranchMatchedException();
        }
        return qqg.a;
    }
}
