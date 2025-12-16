package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import j.X;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: TextAndroidCanvas.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/L;", "Landroid/graphics/Canvas;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f41982a;

    @Override // android.graphics.Canvas
    @X
    public final boolean clipOutPath(@Y61.k Path path) {
        C22568g c22568g = C22568g.f42010a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22568g.getClass();
        return canvas.clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    @X
    public final boolean clipOutRect(@Y61.k RectF rectF) {
        C22568g c22568g = C22568g.f42010a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22568g.getClass();
        return canvas.clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final boolean clipPath(@Y61.k Path path, @Y61.k Region.Op op2) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipPath(path, op2);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final boolean clipRect(@Y61.k RectF rectF, @Y61.k Region.Op op2) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipRect(rectF, op2);
    }

    @Override // android.graphics.Canvas
    public final void concat(@Y61.l Matrix matrix) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @X
    public final void disableZ() {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i12, int i13, int i14, int i15) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawARGB(i12, i13, i14, i15);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(@Y61.k RectF rectF, float f12, float f13, boolean z12, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawArc(rectF, f12, f13, z12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@Y61.k Bitmap bitmap, float f12, float f13, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(@Y61.k Bitmap bitmap, int i12, int i13, @Y61.k float[] fArr, int i14, @Y61.l int[] iArr, int i15, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i12, i13, fArr, i14, iArr, i15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f12, float f13, float f14, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawCircle(f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawColor(i12);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawDoubleRoundRect(@Y61.k RectF rectF, float f12, float f13, @Y61.k RectF rectF2, float f14, float f15, @Y61.k Paint paint) {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.drawDoubleRoundRect(rectF, f12, f13, rectF2, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawGlyphs(@Y61.k int[] iArr, int i12, @Y61.k float[] fArr, int i13, int i14, @Y61.k Font font, @Y61.k Paint paint) {
        C22572k c22572k = C22572k.f42013a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22572k.getClass();
        canvas.drawGlyphs(iArr, i12, fArr, i13, i14, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f12, float f13, float f14, float f15, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawLine(f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@Y61.k float[] fArr, int i12, int i13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawLines(fArr, i12, i13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(@Y61.k RectF rectF, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(@Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawPatch(@Y61.k NinePatch ninePatch, @Y61.k Rect rect, @Y61.l Paint paint) {
        C22572k c22572k = C22572k.f42013a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22572k.getClass();
        canvas.drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(@Y61.k Path path, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@Y61.k Picture picture) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPoint(f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(@Y61.l float[] fArr, int i12, int i13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPoints(fArr, i12, i13, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final void drawPosText(@Y61.k char[] cArr, int i12, int i13, @Y61.k float[] fArr, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPosText(cArr, i12, i13, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i12, int i13, int i14) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawRGB(i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@Y61.k RectF rectF, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawRenderNode(@Y61.k RenderNode renderNode) {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(@Y61.k RectF rectF, float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@Y61.k char[] cArr, int i12, int i13, float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawText(cArr, i12, i13, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@Y61.k char[] cArr, int i12, int i13, @Y61.k Path path, float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i12, i13, path, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawTextRun(@Y61.k char[] cArr, int i12, int i13, int i14, int i15, float f12, float f13, boolean z12, @Y61.k Paint paint) {
        C22567f c22567f = C22567f.f42009a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22567f.getClass();
        canvas.drawTextRun(cArr, i12, i13, i14, i15, f12, f13, z12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(@Y61.k Canvas.VertexMode vertexMode, int i12, @Y61.k float[] fArr, int i13, @Y61.l float[] fArr2, int i14, @Y61.l int[] iArr, int i15, @Y61.l short[] sArr, int i16, int i17, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i12, fArr, i13, fArr2, i14, iArr, i15, sArr, i16, i17, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void enableZ() {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(@Y61.k Rect rect) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @Y61.l
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final void getMatrix(@Y61.k Matrix matrix) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final boolean quickReject(@Y61.k RectF rectF, @Y61.k Canvas.EdgeType edgeType) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.restoreToCount(i12);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.rotate(f12);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final int saveLayer(@Y61.l RectF rectF, @Y61.l Paint paint, int i12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i12);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final int saveLayerAlpha(@Y61.l RectF rectF, int i12, int i13) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f12, float f13) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.scale(f12, f13);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(@Y61.l Bitmap bitmap) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.setDensity(i12);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(@Y61.l DrawFilter drawFilter) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(@Y61.l Matrix matrix) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f12, float f13) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.skew(f12, f13);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f12, float f13) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.translate(f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(@Y61.k Path path) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final boolean clipRect(@Y61.k Rect rect, @Y61.k Region.Op op2) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f12, float f13, float f14, float f15, float f16, float f17, boolean z12, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawArc(f12, f13, f14, f15, f16, f17, z12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@Y61.k Bitmap bitmap, @Y61.l Rect rect, @Y61.k RectF rectF, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawColor(long j12) {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.drawColor(j12);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@Y61.k float[] fArr, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f12, float f13, float f14, float f15, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawOval(f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@Y61.k Picture picture, @Y61.k RectF rectF) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(@Y61.k float[] fArr, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final void drawPosText(@Y61.k String str, @Y61.k float[] fArr, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@Y61.k Rect rect, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f12, float f13, float f14, float f15, float f16, float f17, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawRoundRect(f12, f13, f14, f15, f16, f17, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@Y61.k String str, float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawText(str, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@Y61.k String str, @Y61.k Path path, float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final boolean quickReject(@Y61.k RectF rectF) {
        C22571j c22571j = C22571j.f42012a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22571j.getClass();
        return canvas.quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(@Y61.l RectF rectF, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(@Y61.l RectF rectF, int i12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i12);
    }

    @Override // android.graphics.Canvas
    @X
    public final boolean clipOutRect(@Y61.k Rect rect) {
        C22568g c22568g = C22568g.f42010a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22568g.getClass();
        return canvas.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@Y61.k RectF rectF) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@Y61.k Bitmap bitmap, @Y61.l Rect rect, @Y61.k Rect rect2, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawPatch(@Y61.k NinePatch ninePatch, @Y61.k RectF rectF, @Y61.l Paint paint) {
        C22572k c22572k = C22572k.f42013a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22572k.getClass();
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@Y61.k Picture picture, @Y61.k Rect rect) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f12, float f13, float f14, float f15, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawRect(f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@Y61.k String str, int i12, int i13, float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawText(str, i12, i13, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final int saveLayer(float f12, float f13, float f14, float f15, @Y61.l Paint paint, int i12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayer(f12, f13, f14, f15, paint, i12);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final int saveLayerAlpha(float f12, float f13, float f14, float f15, int i12, int i13) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayerAlpha(f12, f13, f14, f15, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@Y61.k Rect rect) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final void drawBitmap(@Y61.k int[] iArr, int i12, int i13, float f12, float f13, int i14, int i15, boolean z12, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawBitmap(iArr, i12, i13, f12, f13, i14, i15, z12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i12, @Y61.k PorterDuff.Mode mode) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawColor(i12, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@Y61.k CharSequence charSequence, int i12, int i13, float f12, float f13, @Y61.k Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawText(charSequence, i12, i13, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final boolean quickReject(@Y61.k Path path, @Y61.k Canvas.EdgeType edgeType) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f12, float f13, float f14, float f15, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayer(f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f12, float f13, float f14, float f15, int i12) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.saveLayerAlpha(f12, f13, f14, f15, i12);
    }

    @Override // android.graphics.Canvas
    @X
    public final boolean clipOutRect(float f12, float f13, float f14, float f15) {
        C22568g c22568g = C22568g.f42010a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22568g.getClass();
        return canvas.clipOutRect(f12, f13, f14, f15);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final boolean clipRect(float f12, float f13, float f14, float f15, @Y61.k Region.Op op2) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipRect(f12, f13, f14, f15, op2);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final void drawBitmap(@Y61.k int[] iArr, int i12, int i13, int i14, int i15, int i16, int i17, boolean z12, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawBitmap(iArr, i12, i13, i14, i15, i16, i17, z12, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawColor(int i12, @Y61.k BlendMode blendMode) {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.drawColor(i12, blendMode);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawDoubleRoundRect(@Y61.k RectF rectF, @Y61.k float[] fArr, @Y61.k RectF rectF2, @Y61.k float[] fArr2, @Y61.k Paint paint) {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawTextRun(@Y61.k CharSequence charSequence, int i12, int i13, int i14, int i15, float f12, float f13, boolean z12, @Y61.k Paint paint) {
        C22567f c22567f = C22567f.f42009a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22567f.getClass();
        canvas.drawTextRun(charSequence, i12, i13, i14, i15, f12, f13, z12, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final boolean quickReject(@Y61.k Path path) {
        C22571j c22571j = C22571j.f42012a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22571j.getClass();
        return canvas.quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f12, float f13, float f14, float f15) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipRect(f12, f13, f14, f15);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@Y61.k Bitmap bitmap, @Y61.k Matrix matrix, @Y61.l Paint paint) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @X
    public final boolean clipOutRect(int i12, int i13, int i14, int i15) {
        C22568g c22568g = C22568g.f42010a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22568g.getClass();
        return canvas.clipOutRect(i12, i13, i14, i15);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i12, int i13, int i14, int i15) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.clipRect(i12, i13, i14, i15);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawColor(long j12, @Y61.k BlendMode blendMode) {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.drawColor(j12, blendMode);
    }

    @Override // android.graphics.Canvas
    @InterfaceC42830m
    public final boolean quickReject(float f12, float f13, float f14, float f15, @Y61.k Canvas.EdgeType edgeType) {
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        return canvas.quickReject(f12, f13, f14, f15, edgeType);
    }

    @Override // android.graphics.Canvas
    @X
    public final boolean quickReject(float f12, float f13, float f14, float f15) {
        C22571j c22571j = C22571j.f42012a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22571j.getClass();
        return canvas.quickReject(f12, f13, f14, f15);
    }

    @Override // android.graphics.Canvas
    @X
    public final void drawTextRun(@Y61.k MeasuredText measuredText, int i12, int i13, int i14, int i15, float f12, float f13, boolean z12, @Y61.k Paint paint) {
        C22570i c22570i = C22570i.f42011a;
        Canvas canvas = this.f41982a;
        if (canvas == null) {
            canvas = null;
        }
        c22570i.getClass();
        canvas.drawTextRun(measuredText, i12, i13, i14, i15, f12, f13, z12, paint);
    }
}
