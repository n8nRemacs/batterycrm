package UY0;

import Y61.k;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: Toolkit.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_renderscript-toolkit"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d {

    /* compiled from: Toolkit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16444a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16444a = iArr;
        }
    }

    @k
    public static final Bitmap a(@k Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(width, height, config);
    }

    public static void b(Bitmap bitmap, String str) {
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            StringBuilder sbA = r.A("RenderScript Toolkit. ", str, " supports only ARGB_8888 and ALPHA_8 bitmaps. ");
            sbA.append(bitmap.getConfig());
            sbA.append(" provided.");
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if (c(bitmap) * bitmap.getWidth() == bitmap.getRowBytes()) {
            return;
        }
        StringBuilder sbA2 = r.A("RenderScript Toolkit ", str, ". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=");
        sbA2.append(bitmap.getRowBytes());
        sbA2.append(", width={");
        sbA2.append(bitmap.getWidth());
        sbA2.append(", and vectorSize=");
        sbA2.append(c(bitmap));
        sbA2.append('.');
        throw new IllegalArgumentException(sbA2.toString().toString());
    }

    public static final int c(@k Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        int i12 = config == null ? -1 : a.f16444a[config.ordinal()];
        if (i12 == 1) {
            return 4;
        }
        if (i12 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }
}
