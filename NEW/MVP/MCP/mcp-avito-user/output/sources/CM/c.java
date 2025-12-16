package CM;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.palette.graphics.b;
import com.facebook.cache.common.j;
import kotlin.Metadata;

/* compiled from: DominantColorEdgePostProcessor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCM/c;", "Lcom/facebook/imagepipeline/request/a;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends com.facebook.imagepipeline.request.a {
    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @l
    public final com.facebook.cache.common.c a() {
        return new j("EdgePostProcessor");
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void d(@k Bitmap bitmap) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        b.c cVar = androidx.palette.graphics.b.f53263e;
        b.e eVar = new b.C1877b(bitmap).a().f53267d;
        int i12 = eVar != null ? eVar.f53277d : 0;
        int width = bitmap.getWidth() - 1;
        if (width >= 0) {
            int i13 = 0;
            while (true) {
                bitmap.setPixel(i13, 0, i12);
                bitmap.setPixel(i13, bitmap.getHeight() - 1, i12);
                if (i13 == width) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        int height = bitmap.getHeight() - 1;
        if (height < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            bitmap.setPixel(0, i14, i12);
            bitmap.setPixel(bitmap.getWidth() - 1, i14, i12);
            if (i14 == height) {
                return;
            } else {
                i14++;
            }
        }
    }
}
