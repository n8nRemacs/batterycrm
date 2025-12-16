package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.Gravity;
import j.N;
import j.P;

/* compiled from: RoundedBitmapDrawableFactory.java */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: RoundedBitmapDrawableFactory.java */
    public static class a extends g {
        @Override // androidx.core.graphics.drawable.g
        public final void a(int i12, int i13, int i14, Rect rect, Rect rect2) {
            Gravity.apply(i12, i13, i14, rect, rect2, 0);
        }
    }

    @N
    public static g a(@N Resources resources, @P Bitmap bitmap) {
        return new f(resources, bitmap);
    }
}
