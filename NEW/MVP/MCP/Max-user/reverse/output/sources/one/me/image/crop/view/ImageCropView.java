package one.me.image.crop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ca4;
import defpackage.da4;
import defpackage.rr6;
import defpackage.tkb;
import defpackage.ukb;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lone/me/image/crop/view/ImageCropView;", "Landroid/widget/FrameLayout;", "Lca4;", "Lukb;", "", "freestyleCropModeEnable", "Lqqg;", "setFreestyleCropMode", "(I)V", "", "enabled", "setRotateEnabled", "(Z)V", "", "factor", "setMaxScaleMultiplier", "(F)V", "size", "setMinImageSize", "Lda4;", "getCropState", "()Lda4;", "getMinOverlaySize", "()F", "getMaxBitmapSize", "()I", "photo-crop_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageCropView extends FrameLayout implements ca4, ukb {
    public final rr6 a;
    public final tkb b;

    public ImageCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        rr6 rr6Var = new rr6(context);
        rr6Var.T0 = true;
        rr6Var.U0 = true;
        rr6Var.V0 = 5;
        this.a = rr6Var;
        addView(rr6Var, new FrameLayout.LayoutParams(-1, -1));
        tkb tkbVar = new tkb(context);
        this.b = tkbVar;
        addView(tkbVar, new FrameLayout.LayoutParams(-1, -1));
        rr6Var.setCropBoundsChangeListener(this);
        tkbVar.setOverlayViewChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[PHI: r3 r5
  0x0081: PHI (r3v10 float) = (r3v6 float), (r3v7 float) binds: [B:16:0x007f, B:19:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r5v10 float) = (r5v6 float), (r5v7 float) binds: [B:16:0x007f, B:19:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            rr6 r0 = r9.a
            android.graphics.RectF r1 = r0.B0
            float r2 = r0.getCurrentScale()
            float r3 = r0.getMinScale()
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L22
            android.graphics.Matrix r4 = new android.graphics.Matrix
            android.graphics.Matrix r5 = r0.getCurrentImageMatrix()
            r4.<init>(r5)
            float r3 = r3 / r2
            float r5 = r0.R0
            float r6 = r0.S0
            r4.postScale(r3, r3, r5, r6)
            goto L23
        L22:
            r4 = 0
        L23:
            float r3 = r0.getMaxScale()
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L44
            android.graphics.Matrix r4 = new android.graphics.Matrix
            android.graphics.Matrix r5 = r0.getCurrentImageMatrix()
            r4.<init>(r5)
            float r3 = r3 / r2
            float r2 = r1.width()
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            float r6 = r1.height()
            float r6 = r6 / r5
            r4.postScale(r3, r3, r2, r6)
        L44:
            android.graphics.RectF r2 = new android.graphics.RectF
            android.graphics.drawable.Drawable r3 = r0.getDrawable()
            int r3 = r3.getIntrinsicWidth()
            float r3 = (float) r3
            android.graphics.drawable.Drawable r5 = r0.getDrawable()
            int r5 = r5.getIntrinsicHeight()
            float r5 = (float) r5
            r6 = 0
            r2.<init>(r6, r6, r3, r5)
            float[] r2 = defpackage.w7j.b(r2)
            if (r4 == 0) goto L65
            r4.mapPoints(r2)
        L65:
            if (r4 == 0) goto L69
            r2 = r4
            goto L6d
        L69:
            android.graphics.Matrix r2 = r0.getCurrentImageMatrix()
        L6d:
            float[] r3 = r0.u0
            int r5 = r3.length
            float[] r5 = new float[r5]
            r2.mapPoints(r5, r3)
            android.graphics.RectF r2 = defpackage.w7j.c(r5)
            float r3 = r2.right
            float r5 = r1.right
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L83
        L81:
            float r5 = r5 - r3
            goto L8d
        L83:
            float r3 = r2.left
            float r5 = r1.left
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L8c
            goto L81
        L8c:
            r5 = r6
        L8d:
            float r3 = r2.bottom
            float r7 = r1.bottom
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 >= 0) goto L97
            float r7 = r7 - r3
            goto La3
        L97:
            float r2 = r2.top
            float r1 = r1.top
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto La2
            float r7 = r1 - r2
            goto La3
        La2:
            r7 = r6
        La3:
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 != 0) goto Lab
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 == 0) goto Lb9
        Lab:
            if (r4 != 0) goto Lb6
            android.graphics.Matrix r4 = new android.graphics.Matrix
            android.graphics.Matrix r1 = r0.getCurrentImageMatrix()
            r4.<init>(r1)
        Lb6:
            r4.postTranslate(r5, r7)
        Lb9:
            if (r4 == 0) goto Lbe
            r0.setImageMatrix(r4)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.image.crop.view.ImageCropView.a():void");
    }

    public final da4 getCropState() {
        return this.a.getCropState();
    }

    public final int getMaxBitmapSize() {
        return this.a.getMaxBitmapSize();
    }

    @Override // defpackage.ukb
    public float getMinOverlaySize() {
        return this.a.getMinOverlaySize();
    }

    public final void setFreestyleCropMode(int freestyleCropModeEnable) {
        this.b.setFreestyleCropMode(freestyleCropModeEnable);
    }

    public final void setMaxScaleMultiplier(float factor) {
        this.a.setMaxScaleMultiplier(factor);
    }

    public final void setMinImageSize(float size) {
        this.a.setMinImageSize(size);
    }

    public final void setRotateEnabled(boolean enabled) {
        this.a.T0 = enabled;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
