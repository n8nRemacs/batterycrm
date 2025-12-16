package L2;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import coil.view.C27253g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: CircleCropTransformation.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LL2/a;", "LL2/c;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f9753a = a.class.getName();

    public final boolean equals(@l Object obj) {
        return obj instanceof a;
    }

    @Override // L2.c
    @k
    /* renamed from: getCacheKey, reason: from getter */
    public final String getF9753a() {
        return this.f9753a;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }

    @Override // L2.c
    @l
    public final Object transform(@k Bitmap bitmap, @k C27253g c27253g, @k Continuation<? super Bitmap> continuation) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f12 = iMin / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f12, f12, f12, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f12 - (bitmap.getWidth() / 2.0f), f12 - (bitmap.getHeight() / 2.0f), paint);
        return bitmapCreateBitmap;
    }
}
