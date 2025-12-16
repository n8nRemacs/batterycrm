package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* loaded from: classes2.dex */
public final class qkb extends lk0 {
    public final /* synthetic */ int c = 1;
    public Object d;

    public /* synthetic */ qkb() {
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final ty0 b() {
        switch (this.c) {
            case 0:
                return new c1f(String.valueOf(((Uri) this.d).hashCode()));
            default:
                if (((c1f) this.d) == null) {
                    this.d = new c1f("RoundAsCirclePostprocessor#AntiAliased");
                }
                return (c1f) this.d;
        }
    }

    @Override // defpackage.lk0
    public final void c(Bitmap bitmap) throws Throwable {
        switch (this.c) {
            case 0:
                Bitmap bitmapC = sfi.c((Uri) this.d);
                if (bitmapC != null) {
                    Canvas canvas = new Canvas(bitmap);
                    float width = bitmap.getWidth() / bitmapC.getWidth();
                    canvas.scale(width, width);
                    canvas.drawBitmap(bitmapC, 0.0f, 0.0f, (Paint) null);
                    break;
                }
                break;
            default:
                NativeRoundingFilter.toCircleFast(bitmap, true);
                break;
        }
    }

    public qkb(Uri uri) {
        this.d = uri;
    }
}
