package androidx.core.graphics.drawable;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import j.N;
import j.X;

/* compiled from: RoundedBitmapDrawable21.java */
@X
/* loaded from: classes.dex */
class f extends g {
    @Override // androidx.core.graphics.drawable.g
    public final void a(int i12, int i13, int i14, Rect rect, Rect rect2) {
        Gravity.apply(i12, i13, i14, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@N Outline outline) {
        c();
        outline.setRoundRect(this.f44755h, this.f44754g);
    }
}
