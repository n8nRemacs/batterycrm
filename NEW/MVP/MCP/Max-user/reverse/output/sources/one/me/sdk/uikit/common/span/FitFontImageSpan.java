package one.me.sdk.uikit.common.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.style.ImageSpan;
import android.view.View;
import defpackage.a16;
import defpackage.e16;
import defpackage.f16;
import defpackage.fni;
import defpackage.hgh;
import defpackage.igh;
import defpackage.qqg;
import defpackage.tk4;
import defpackage.u6g;
import defpackage.yeb;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002J\u0006B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010'\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(JW\u00100\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u00122\b\b\u0001\u00102\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00103\u001a\u00020\b¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\"H\u0016¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u001a\u0010@\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u0014\u0010E\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0018\u00010JR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010<R\"\u0010P\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lone/me/sdk/uikit/common/span/FitFontImageSpan;", "Landroid/text/style/ImageSpan;", "Ligh;", "Lu6g;", "Landroid/graphics/drawable/Drawable;", "drawable", "La16;", "scaleType", "", "shouldInvalidateSpan", "usePaintAlpha", "<init>", "(Landroid/graphics/drawable/Drawable;La16;ZZ)V", "Landroid/graphics/RectF;", "src", "dst", "Landroid/graphics/Rect;", "out", "Lqqg;", "scaleRect", "(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Rect;La16;)V", "Landroid/view/View;", "view", "attach", "(Landroid/view/View;)V", "detach", "Lyeb;", "newAttrs", "onThemeChanged", "(Lyeb;)V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "newSize", "needScale", "updateDrawableSize", "(ILa16;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "La16;", "getScaleType", "()La16;", "Z", "fontRect", "Landroid/graphics/RectF;", "getFontRect", "()Landroid/graphics/RectF;", "tempRect", "drawableRect", "Landroid/graphics/Rect;", "Ljava/util/WeakHashMap;", "lastAttachedViews", "Ljava/util/WeakHashMap;", "Le16;", "spanCallback", "Le16;", "customHeight", "I", "customScaleType", "needCustomScale", "getNeedCustomScale", "()Z", "setNeedCustomScale", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class FitFontImageSpan extends ImageSpan implements igh, u6g {
    private int customHeight;
    private a16 customScaleType;
    private final Rect drawableRect;
    private final RectF fontRect;
    private WeakHashMap<View, qqg> lastAttachedViews;
    private boolean needCustomScale;
    private final a16 scaleType;
    private final boolean shouldInvalidateSpan;
    private e16 spanCallback;
    private final RectF tempRect;
    private final boolean usePaintAlpha;

    public /* synthetic */ FitFontImageSpan(Drawable drawable, a16 a16Var, boolean z, boolean z2, int i, tk4 tk4Var) {
        this(drawable, (i & 2) != 0 ? a16.b : a16Var, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }

    private final void scaleRect(RectF src, RectF dst, Rect out, a16 scaleType) {
        float fWidth;
        float fWidth2;
        float fHeight;
        float fHeight2;
        float fWidth3 = src.width() == -1.0f ? dst.width() : src.width();
        float fHeight3 = src.height() == -1.0f ? dst.height() : src.height();
        int i = f16.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i == 1) {
            out.set((int) Math.floor(dst.left), (int) Math.floor(dst.top), (int) Math.ceil(dst.right), (int) Math.ceil(dst.bottom));
            return;
        }
        if (i == 2) {
            float f = fWidth3 / fHeight3;
            if (f > 1.0f) {
                fWidth = dst.height() * f;
                fWidth2 = dst.height();
            } else {
                fWidth = dst.width();
                fWidth2 = dst.width() / f;
            }
            float f2 = 2;
            float fWidth4 = ((dst.width() - fWidth) / f2) + dst.left;
            float fHeight4 = ((dst.height() - fWidth2) / f2) + dst.top;
            out.set((int) Math.floor(fWidth4), (int) Math.floor(fHeight4), (int) Math.ceil(fWidth4 + fWidth), (int) Math.ceil(fHeight4 + fWidth2));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            float f3 = 2;
            float fWidth5 = ((dst.width() - fWidth3) / f3) + dst.left;
            float fHeight5 = ((dst.height() - fHeight3) / f3) + dst.top;
            out.set((int) Math.floor(fWidth5), (int) Math.floor(fHeight5), (int) Math.ceil(fWidth5 + fWidth3), (int) Math.ceil(fHeight5 + fHeight3));
            return;
        }
        float f4 = fWidth3 / fHeight3;
        if (f4 > dst.width() / dst.height()) {
            fHeight2 = dst.width();
            fHeight = dst.width() / f4;
        } else {
            fHeight = dst.height();
            fHeight2 = dst.height() * f4;
        }
        float f5 = 2;
        float fWidth6 = ((dst.width() - fHeight2) / f5) + dst.left;
        float fHeight6 = ((dst.height() - fHeight) / f5) + dst.top;
        out.set((int) Math.floor(fWidth6), (int) Math.floor(fHeight6), (int) Math.ceil(fWidth6 + fHeight2), (int) Math.ceil(fHeight6 + fHeight));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.igh
    public void attach(View view) {
        Drawable drawable = getDrawable();
        if (this.lastAttachedViews.put(view, qqg.a) == null || drawable.getCallback() == null) {
            e16 e16Var = new e16(this, this.lastAttachedViews);
            this.spanCallback = e16Var;
            drawable.setCallback(e16Var);
            drawable.invalidateSelf();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
            hgh hghVar = drawable instanceof hgh ? (hgh) drawable : null;
            if (hghVar != null) {
                hghVar.b();
            }
            LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
            if (layerDrawable == null) {
                return;
            }
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Object drawable2 = layerDrawable.getDrawable(i);
                hgh hghVar2 = drawable2 instanceof hgh ? (hgh) drawable2 : null;
                if (hghVar2 != null) {
                    hghVar2.b();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.igh
    public void detach(View view) {
        this.lastAttachedViews.remove(view);
        if (this.lastAttachedViews.isEmpty()) {
            Drawable drawable = getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.stop();
            }
            hgh hghVar = drawable instanceof hgh ? (hgh) drawable : null;
            if (hghVar != null) {
                hghVar.a();
            }
            LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
            int numberOfLayers = layerDrawable != null ? layerDrawable.getNumberOfLayers() : 0;
            for (int i = 0; i < numberOfLayers; i++) {
                Object drawable2 = layerDrawable != null ? layerDrawable.getDrawable(i) : null;
                hgh hghVar2 = drawable2 instanceof hgh ? (hgh) drawable2 : null;
                if (hghVar2 != null) {
                    hghVar2.a();
                }
            }
            drawable.setCallback(null);
            this.spanCallback = null;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        int iSave = canvas.save();
        try {
            canvas.translate(x, top);
            canvas.clipRect(this.fontRect);
            int alpha = getDrawable().getAlpha();
            try {
                if (this.usePaintAlpha) {
                    getDrawable().setAlpha(paint.getAlpha());
                }
                getDrawable().draw(canvas);
                if (this.usePaintAlpha) {
                    getDrawable().setAlpha(alpha);
                }
            } catch (Throwable th) {
                if (this.usePaintAlpha) {
                    getDrawable().setAlpha(alpha);
                }
                throw th;
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitFontImageSpan)) {
            return false;
        }
        FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) other;
        return this.scaleType == fitFontImageSpan.scaleType && fni.a(getDrawable(), fitFontImageSpan.getDrawable());
    }

    public final RectF getFontRect() {
        return this.fontRect;
    }

    public final boolean getNeedCustomScale() {
        return this.needCustomScale;
    }

    public final a16 getScaleType() {
        return this.scaleType;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int iAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
        int intrinsicWidth = this.customHeight;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        int intrinsicHeight = this.customHeight;
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        float f = iAbs;
        this.fontRect.set(0.0f, 0.0f, f, f);
        this.tempRect.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        scaleRect(this.tempRect, this.fontRect, this.drawableRect, this.customScaleType);
        drawable.setBounds(this.drawableRect);
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.leading = fontMetricsInt2.leading;
        }
        return (int) this.fontRect.right;
    }

    public int hashCode() {
        return (this.scaleType.hashCode() * 31) + getDrawable().hashCode();
    }

    @Override // defpackage.u6g
    public void onThemeChanged(yeb newAttrs) {
        Object drawable = getDrawable();
        u6g u6gVar = drawable instanceof u6g ? (u6g) drawable : null;
        if (u6gVar != null) {
            u6gVar.onThemeChanged(newAttrs);
        }
    }

    public final void setNeedCustomScale(boolean z) {
        this.needCustomScale = z;
    }

    public final void updateDrawableSize(int newSize, a16 scaleType, boolean needScale) {
        this.customHeight = newSize;
        this.customScaleType = scaleType;
        this.needCustomScale = needScale;
        if (newSize > 0) {
            getDrawable().invalidateSelf();
        }
    }

    public FitFontImageSpan(Drawable drawable, a16 a16Var, boolean z, boolean z2) {
        super(drawable);
        this.scaleType = a16Var;
        this.shouldInvalidateSpan = z;
        this.usePaintAlpha = z2;
        this.fontRect = new RectF();
        this.tempRect = new RectF();
        this.drawableRect = new Rect();
        this.lastAttachedViews = new WeakHashMap<>();
        this.customHeight = -1;
        this.customScaleType = a16Var;
        this.needCustomScale = true;
    }
}
