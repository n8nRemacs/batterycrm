package ru.cyberity.cbr.core.widget;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.ranges.s;
import ru.cyberity.cbr.core.R;

/* compiled from: CBRFrameDrawable.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b&\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRFrameDrawable;", "Landroid/graphics/drawable/Drawable;", "frame", "", "fillColor", "", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "<init>", "(Landroid/graphics/drawable/Drawable;IFFFF)V", "Lkotlin/G0;", "redrawBuffer", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "left", "top", "right", "bottom", "setBounds", "(IIII)V", "width", "color", "setStroke", "(II)V", "setFillColor", "I", "F", "Landroid/graphics/Bitmap;", "buffer", "Landroid/graphics/Bitmap;", "border", "Landroid/graphics/drawable/Drawable;", "mask", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRFrameDrawable extends Drawable {

    @l
    private final Drawable border;

    @l
    private Bitmap buffer;
    private int fillColor;

    @l
    private final Drawable mask;
    private final float paddingBottom;
    private final float paddingLeft;
    private final float paddingRight;
    private final float paddingTop;

    public /* synthetic */ CBRFrameDrawable(Drawable drawable, int i12, float f12, float f13, float f14, float f15, int i13, C42822w c42822w) {
        this(drawable, i12, (i13 & 4) != 0 ? 0.0f : f12, (i13 & 8) != 0 ? 0.0f : f13, (i13 & 16) != 0 ? 0.0f : f14, (i13 & 32) != 0 ? 0.0f : f15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void redrawBuffer() {
        int i12;
        Bitmap bitmap;
        Q q12;
        int i13 = getBounds().left;
        int i14 = getBounds().right;
        int i15 = getBounds().top;
        int i16 = getBounds().bottom;
        Drawable drawable = this.mask;
        if (drawable != null) {
            float fA2 = s.a(((i14 - i13) - this.paddingLeft) - this.paddingRight, 0.0f);
            float fA3 = s.a(((i16 - i15) - this.paddingTop) - this.paddingBottom, 0.0f);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth < 1) {
                intrinsicWidth = 1;
            }
            float f12 = fA2 / intrinsicWidth;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight < 1) {
                intrinsicHeight = 1;
            }
            if (fA3 / intrinsicHeight > f12) {
                q12 = new Q(Float.valueOf(fA2), Float.valueOf((drawable.getIntrinsicHeight() * fA2) / (drawable.getIntrinsicWidth() >= 1 ? r10 : 1)));
            } else {
                q12 = new Q(Float.valueOf((drawable.getIntrinsicWidth() * fA3) / (drawable.getIntrinsicHeight() >= 1 ? r9 : 1)), Float.valueOf(fA3));
            }
            float fFloatValue = ((Number) q12.f406619b).floatValue();
            float fFloatValue2 = ((Number) q12.f406620c).floatValue();
            float f13 = 2;
            float f14 = ((fA2 - fFloatValue) / f13) + i13 + this.paddingLeft;
            float f15 = ((fA3 - fFloatValue2) / f13) + i15 + this.paddingTop;
            drawable.setBounds((int) f14, (int) f15, (int) (f14 + fFloatValue), (int) (f15 + fFloatValue2));
            Drawable drawable2 = this.border;
            if (drawable2 != null) {
                drawable2.setBounds(drawable.getBounds());
            }
        }
        int i17 = i14 - i13;
        if (i17 <= 0 || (i12 = i16 - i15) <= 0) {
            return;
        }
        Bitmap bitmap2 = this.buffer;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.buffer) != null) {
            bitmap.recycle();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i17, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawable3 = this.mask;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        canvas.drawColor(this.fillColor, PorterDuff.Mode.SRC_OUT);
        Drawable drawable4 = this.border;
        if (drawable4 != null) {
            drawable4.draw(canvas);
        }
        this.buffer = bitmapCreateBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@k Canvas canvas) {
        Bitmap bitmap = this.buffer;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().left, getBounds().top, (Paint) null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        redrawBuffer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@l ColorFilter colorFilter) {
        invalidateSelf();
    }

    public final void setFillColor(int color) {
        this.fillColor = color;
        redrawBuffer();
        invalidateSelf();
    }

    public final void setStroke(int width, int color) {
        Drawable drawable = this.border;
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(width, color);
        }
        redrawBuffer();
        invalidateSelf();
    }

    public CBRFrameDrawable(@l Drawable drawable, int i12, float f12, float f13, float f14, float f15) {
        Drawable drawableFindDrawableByLayerId;
        this.fillColor = i12;
        this.paddingLeft = f12;
        this.paddingRight = f13;
        this.paddingTop = f14;
        this.paddingBottom = f15;
        boolean z12 = drawable instanceof LayerDrawable;
        LayerDrawable layerDrawable = z12 ? (LayerDrawable) drawable : null;
        this.border = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.cbr_frame_border) : null;
        LayerDrawable layerDrawable2 = z12 ? (LayerDrawable) drawable : null;
        if (layerDrawable2 != null && (drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.cbr_frame_mask)) != null) {
            drawable = drawableFindDrawableByLayerId;
        }
        this.mask = drawable;
    }
}
