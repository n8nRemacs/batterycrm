package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class or6 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GestureDetector b;

    public /* synthetic */ or6(GestureDetector gestureDetector, int i) {
        this.a = i;
        this.b = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        GestureDetector gestureDetector = this.b;
        switch (i) {
            case 0:
                return gestureDetector.onTouchEvent(motionEvent);
            case 1:
                return gestureDetector.onTouchEvent(motionEvent);
            case 2:
                return gestureDetector.onTouchEvent(motionEvent);
            case 3:
                yy7[] yy7VarArr = MessageWriteWidget.L0;
                return gestureDetector.onTouchEvent(motionEvent);
            case 4:
                yy7[] yy7VarArr2 = ProfileAvatarWidget.o;
                if (motionEvent == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 5:
                return gestureDetector.onTouchEvent(motionEvent);
            default:
                return gestureDetector.onTouchEvent(motionEvent);
        }
    }
}
