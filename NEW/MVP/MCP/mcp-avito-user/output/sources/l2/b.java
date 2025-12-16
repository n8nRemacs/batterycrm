package L2;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.appcompat.app.r;
import coil.decode.g;
import coil.view.AbstractC27249c;
import coil.view.C27253g;
import coil.view.Scale;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RoundedCornersTransformation.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL2/b;", "LL2/c;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f9754a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9755b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9756c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9757d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f9758e;

    public b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f9754a == bVar.f9754a && this.f9755b == bVar.f9755b && this.f9756c == bVar.f9756c && this.f9757d == bVar.f9757d) {
                return true;
            }
        }
        return false;
    }

    @Override // L2.c
    @k
    /* renamed from: getCacheKey, reason: from getter */
    public final String getF9758e() {
        return this.f9758e;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9757d) + r.d(this.f9756c, r.d(this.f9755b, Float.hashCode(this.f9754a) * 31, 31), 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L2.c
    @l
    public final Object transform(@k Bitmap bitmap, @k C27253g c27253g, @k Continuation<? super Bitmap> continuation) {
        Q q12;
        Paint paint = new Paint(3);
        if (L.f(c27253g, C27253g.f58764c)) {
            q12 = new Q(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            AbstractC27249c abstractC27249c = c27253g.f58765a;
            boolean z12 = abstractC27249c instanceof AbstractC27249c.a;
            AbstractC27249c abstractC27249c2 = c27253g.f58766b;
            if (z12 && (abstractC27249c2 instanceof AbstractC27249c.a)) {
                q12 = new Q(Integer.valueOf(((AbstractC27249c.a) abstractC27249c).f58759a), Integer.valueOf(((AbstractC27249c.a) abstractC27249c2).f58759a));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                AbstractC27249c abstractC27249c3 = c27253g.f58765a;
                boolean z13 = abstractC27249c3 instanceof AbstractC27249c.a;
                int i12 = BeduinInputModel.MIN_TEXT_VERSION;
                int i13 = z13 ? ((AbstractC27249c.a) abstractC27249c3).f58759a : Integer.MIN_VALUE;
                if (abstractC27249c2 instanceof AbstractC27249c.a) {
                    i12 = ((AbstractC27249c.a) abstractC27249c2).f58759a;
                }
                double dA2 = g.a(width, height, i13, i12, Scale.f58755b);
                q12 = new Q(Integer.valueOf(kotlin.math.b.a(bitmap.getWidth() * dA2)), Integer.valueOf(kotlin.math.b.a(dA2 * bitmap.getHeight())));
            }
        }
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fA2 = (float) g.a(bitmap.getWidth(), bitmap.getHeight(), iIntValue, iIntValue2, Scale.f58755b);
        float f12 = 2;
        matrix.setTranslate((iIntValue - (bitmap.getWidth() * fA2)) / f12, (iIntValue2 - (bitmap.getHeight() * fA2)) / f12);
        matrix.preScale(fA2, fA2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f13 = this.f9754a;
        float f14 = this.f9755b;
        float f15 = this.f9757d;
        float f16 = this.f9756c;
        float[] fArr = {f13, f13, f14, f14, f15, f15, f16, f16};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public b(float f12, float f13, float f14, float f15, int i12, C42822w c42822w) {
        f12 = (i12 & 1) != 0 ? 0.0f : f12;
        f13 = (i12 & 2) != 0 ? 0.0f : f13;
        f14 = (i12 & 4) != 0 ? 0.0f : f14;
        f15 = (i12 & 8) != 0 ? 0.0f : f15;
        this.f9754a = f12;
        this.f9755b = f13;
        this.f9756c = f14;
        this.f9757d = f15;
        if (f12 < 0.0f || f13 < 0.0f || f14 < 0.0f || f15 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.f9758e = b.class.getName() + '-' + f12 + ',' + f13 + ',' + f14 + ',' + f15;
    }
}
