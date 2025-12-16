package AV;

import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.util.C1;
import kotlin.Metadata;

/* compiled from: ShimmerDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV/b;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends Drawable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f350g = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f351a = new a(this, 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f352b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Rect f353c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Matrix f354d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ValueAnimator f355e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.skeleton.shimmer.a f356f;

    public b() {
        Paint paint = new Paint();
        this.f352b = paint;
        this.f353c = new Rect();
        this.f354d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f355e;
        com.avito.android.lib.design.skeleton.shimmer.a aVar = this.f356f;
        C1.f318564a.getClass();
        if (!C1.a() || valueAnimator == null || valueAnimator.isStarted() || aVar == null || !aVar.f180551o || getCallback() == null) {
            return;
        }
        valueAnimator.start();
    }

    public final void b() {
        Shader linearGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        com.avito.android.lib.design.skeleton.shimmer.a aVar = this.f356f;
        if (iWidth == 0 || iHeight == 0 || aVar == null) {
            return;
        }
        C1.f318564a.getClass();
        if (C1.a()) {
            int iRound = aVar.f180543g;
            if (iRound <= 0) {
                iRound = Math.round(aVar.f180545i * iWidth);
            }
            int iB2 = aVar.f180544h;
            if (iB2 <= 0) {
                iB2 = kotlin.math.b.b(aVar.f180546j * iHeight);
            }
            int i12 = aVar.f180542f;
            float[] fArr = aVar.f180537a;
            int[] iArr = aVar.f180538b;
            boolean z12 = true;
            if (i12 == 0) {
                int i13 = aVar.f180539c;
                if (i13 != 1 && i13 != 3) {
                    z12 = false;
                }
                if (z12) {
                    iRound = 0;
                }
                if (!z12) {
                    iB2 = 0;
                }
                linearGradient = new LinearGradient(0.0f, 0.0f, iRound, iB2, iArr, fArr, Shader.TileMode.CLAMP);
            } else if (i12 != 1) {
                int i14 = aVar.f180539c;
                if (i14 != 1 && i14 != 3) {
                    z12 = false;
                }
                if (z12) {
                    iRound = 0;
                }
                if (!z12) {
                    iB2 = 0;
                }
                linearGradient = new LinearGradient(0.0f, 0.0f, iRound, iB2, iArr, fArr, Shader.TileMode.CLAMP);
            } else {
                linearGradient = new RadialGradient(iRound / 2.0f, iB2 / 2.0f, (float) (Math.max(iRound, iB2) / Math.sqrt(2.0d)), iArr, fArr, Shader.TileMode.CLAMP);
            }
            this.f352b.setShader(linearGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        float fC2;
        float fC3;
        com.avito.android.lib.design.skeleton.shimmer.a aVar = this.f356f;
        if (aVar != null) {
            Paint paint = this.f352b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(aVar.f180549m));
            Rect rect = this.f353c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f355e;
            float f12 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i12 = aVar.f180539c;
            if (i12 != 0) {
                if (i12 == 1) {
                    float f13 = -fWidth;
                    fC3 = r.c(fWidth, f13, animatedFraction, f13);
                } else if (i12 == 2) {
                    fC2 = r.c(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i12 != 3) {
                    float f14 = -fHeight;
                    fC2 = r.c(fHeight, f14, animatedFraction, f14);
                } else {
                    fC3 = r.c(-fWidth, fWidth, animatedFraction, fWidth);
                }
                Matrix matrix = this.f354d;
                matrix.reset();
                matrix.setRotate(aVar.f180549m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f12, fC3);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
            float f15 = -fHeight;
            fC2 = r.c(fHeight, f15, animatedFraction, f15);
            f12 = fC2;
            fC3 = 0.0f;
            Matrix matrix2 = this.f354d;
            matrix2.reset();
            matrix2.setRotate(aVar.f180549m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix2.postTranslate(f12, fC3);
            paint.getShader().setLocalMatrix(matrix2);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        com.avito.android.lib.design.skeleton.shimmer.a aVar = this.f356f;
        return (aVar == null || !(aVar.f180550n || aVar.f180552p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        super.onBoundsChange(rect);
        this.f353c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
