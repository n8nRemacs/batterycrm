package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class y9h implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ y9h(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (this.a) {
            case 0:
                ScaleGestureDetector scaleGestureDetector = this.b.F0;
                if (scaleGestureDetector != null) {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                }
                break;
            default:
                ScaleGestureDetector scaleGestureDetector2 = this.b.F0;
                if (scaleGestureDetector2 != null) {
                    scaleGestureDetector2.onTouchEvent(motionEvent);
                }
                break;
        }
        return qqg.a;
    }
}
