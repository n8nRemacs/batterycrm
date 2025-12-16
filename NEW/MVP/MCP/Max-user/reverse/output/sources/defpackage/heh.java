package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final class heh extends dtf implements sm6 {
    public final /* synthetic */ VideoWebViewScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public heh(Continuation continuation, VideoWebViewScreen videoWebViewScreen) {
        super(2, continuation);
        this.X = videoWebViewScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        heh hehVar = (heh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hehVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        heh hehVar = new heh(continuation, this.X);
        hehVar.o = obj;
        return hehVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        leh lehVar = (leh) this.o;
        yy7[] yy7VarArr = VideoWebViewScreen.H0;
        VideoWebViewScreen videoWebViewScreen = this.X;
        videoWebViewScreen.getClass();
        if ((lehVar == null || !lehVar.b) && (lehVar == null || lehVar.a != 2)) {
            videoWebViewScreen.J0(true);
        } else {
            videoWebViewScreen.J0(false);
        }
        Integer numValueOf = lehVar != null ? Integer.valueOf(lehVar.a) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            FrameLayout frameLayoutQ0 = videoWebViewScreen.Q0();
            ViewGroup.LayoutParams layoutParams = frameLayoutQ0.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            frameLayoutQ0.setLayoutParams(marginLayoutParams);
            videoWebViewScreen.Q0().requestLayout();
            videoWebViewScreen.Q0().invalidate();
            videoWebViewScreen.N0().bringToFront();
            videoWebViewScreen.M0().setVisibility(8);
        } else {
            FrameLayout frameLayoutQ02 = videoWebViewScreen.Q0();
            ViewGroup.LayoutParams layoutParams2 = frameLayoutQ02.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int height = videoWebViewScreen.N0().getHeight();
            Integer numN = dqi.n(videoWebViewScreen.N0());
            marginLayoutParams2.topMargin = height + (numN != null ? numN.intValue() : 0);
            int height2 = videoWebViewScreen.M0().getHeight();
            Integer numH = dqi.h(videoWebViewScreen.M0());
            marginLayoutParams2.bottomMargin = height2 + (numH != null ? numH.intValue() : 0);
            frameLayoutQ02.setLayoutParams(marginLayoutParams2);
            videoWebViewScreen.N0().bringToFront();
            videoWebViewScreen.M0().bringToFront();
            videoWebViewScreen.M0().setVisibility(0);
        }
        return qqg.a;
    }
}
