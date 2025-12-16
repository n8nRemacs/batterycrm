package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.ui.graphics.V;
import kotlin.Metadata;

/* compiled from: LayerSnapshot.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {
    public static final Bitmap a(Image image) {
        Image.Plane plane = image.getPlanes()[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i12 = 0; i12 < height; i12++) {
            int i13 = iArr[i12];
            iArr[i12] = V.j(V.c(i13 & 255, (i13 >> 8) & 255, (i13 >> 16) & 255, (i13 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
