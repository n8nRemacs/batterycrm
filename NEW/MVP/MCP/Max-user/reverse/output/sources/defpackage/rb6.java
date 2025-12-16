package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class rb6 implements aid {
    @Override // defpackage.aid
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.aid
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @Override // defpackage.aid
    public final void e(boolean z) {
    }
}
