package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class c52 extends NestedScrollView {
    public final /* synthetic */ d52 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c52(Context context, d52 d52Var) {
        super(context, null);
        this.R0 = d52Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.R0.getPanelState() != b52.c) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
