package CM;

import Y61.k;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import com.avito.android.util.K4;
import com.facebook.imagepipeline.bitmaps.f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RotationPostProcessor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCM/d;", "Lcom/facebook/imagepipeline/request/a;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends com.facebook.imagepipeline.request.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final K4 f2103c;

    public d(@k K4 k42) {
        this.f2103c = k42;
    }

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @k
    public final com.facebook.common.references.a<Bitmap> b(@k Bitmap bitmap, @k f fVar) {
        Point point;
        Point point2;
        K4.c cVar = new K4.c();
        K4 k42 = this.f2103c;
        boolean z12 = L.f(k42, cVar) || L.f(k42, new K4.d());
        int height = z12 ? bitmap.getHeight() : bitmap.getWidth();
        int width = z12 ? bitmap.getWidth() : bitmap.getHeight();
        com.facebook.common.references.a<Bitmap> aVarA = fVar.a(height, width, Bitmap.Config.ARGB_8888);
        try {
            if (k42 instanceof K4.d) {
                point = new Point(height / 2, height / 2);
            } else {
                if (k42 instanceof K4.c) {
                    point2 = new Point(width / 2, width / 2);
                } else if (k42 instanceof K4.b) {
                    point2 = new Point(height / 2, width / 2);
                } else {
                    point = new Point(0, 0);
                }
                point = point2;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(k42.f318644a, point.x, point.y);
            new Canvas(aVarA.i()).drawBitmap(bitmap, matrix, null);
            com.facebook.common.references.a<Bitmap> aVarClone = aVarA.clone();
            com.facebook.common.references.a.c(aVarA);
            return aVarClone;
        } catch (Throwable th2) {
            com.facebook.common.references.a.c(aVarA);
            throw th2;
        }
    }
}
