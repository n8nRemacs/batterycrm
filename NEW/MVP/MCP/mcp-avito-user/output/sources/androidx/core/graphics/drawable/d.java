package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Drawable.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    @Y61.k
    public static final Bitmap a(@Y61.k Drawable drawable, @U int i12, @U int i13, @Y61.l Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i12 == bitmapDrawable.getBitmap().getWidth() && i13 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i12, i13, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i14 = bounds.left;
        int i15 = bounds.top;
        int i16 = bounds.right;
        int i17 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, config);
        drawable.setBounds(0, 0, i12, i13);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i14, i15, i16, i17);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap b(int i12, int i13, int i14, Drawable drawable) {
        if ((i14 & 1) != 0) {
            i12 = drawable.getIntrinsicWidth();
        }
        if ((i14 & 2) != 0) {
            i13 = drawable.getIntrinsicHeight();
        }
        return a(drawable, i12, i13, null);
    }
}
