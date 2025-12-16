package com.avito.android.glow_animation_text_view;

import X41.j;
import Y61.k;
import Y61.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: GradientMaskTextView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/glow_animation_text_view/GradientMaskTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "isVisible", "Lkotlin/G0;", "setMaskVisible", "(Z)V", "", "getMaskRadius", "()F", "", "radiusPx", "setMaskRadius", "(I)V", "centerVertical", "setMaskCenterVertical", "_avito_glow-animation-text-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GradientMaskTextView extends AppCompatTextView {

    /* renamed from: b, reason: collision with root package name */
    public float f161201b;

    /* renamed from: c, reason: collision with root package name */
    public float f161202c;

    /* renamed from: d, reason: collision with root package name */
    public float f161203d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Path f161204e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f161205f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f161206g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f161207h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public ArrayList f161208i;

    @j
    public GradientMaskTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: getMaskRadius, reason: from getter */
    public final float getF161203d() {
        return this.f161203d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@k Canvas canvas) {
        if (this.f161205f) {
            Path path = this.f161204e;
            path.reset();
            path.addCircle(this.f161201b, this.f161202c, this.f161203d, Path.Direction.CW);
            canvas.clipPath(path);
            super.onDraw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        ArrayList arrayList;
        Shader bitmapShader;
        super.onLayout(z12, i12, i13, i14, i15);
        this.f161202c = (i15 - i13) / 2;
        if (!this.f161207h || (arrayList = this.f161208i) == null) {
            return;
        }
        int[] iArrL0 = C42745f0.L0(arrayList);
        TextPaint paint = getPaint();
        if (this.f161206g) {
            bitmapShader = new LinearGradient(0.0f, 0.0f, i14, 0.0f, iArrL0, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            int width = getWidth();
            int height = getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint2 = new Paint();
            float length = width / iArrL0.length;
            int length2 = iArrL0.length;
            float f12 = length;
            float f13 = 0.0f;
            int i16 = 0;
            while (i16 < length2) {
                paint2.setColor(iArrL0[i16]);
                canvas.drawRect(f13, 0.0f, f12, height, paint2);
                i16++;
                f13 = f12;
                f12 += length;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        }
        paint.setShader(bitmapShader);
        this.f161207h = false;
    }

    public final void setMaskCenterVertical(int centerVertical) {
        if (centerVertical > getHeight()) {
            return;
        }
        this.f161202c = centerVertical;
    }

    public final void setMaskRadius(int radiusPx) {
        this.f161203d = radiusPx;
    }

    public final void setMaskVisible(boolean isVisible) {
        this.f161205f = isVisible;
    }

    public GradientMaskTextView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.textViewStyle : i12);
        this.f161203d = y6.b(27);
        this.f161204e = new Path();
        this.f161206g = true;
        this.f161207h = true;
    }
}
