package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39922y0;
import e11.C39924z;
import e11.r;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class MediaAdView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final C39922y0 f365015b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final ProgressBar f365016c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final r f365017d;

    /* renamed from: e, reason: collision with root package name */
    public int f365018e;

    /* renamed from: f, reason: collision with root package name */
    public int f365019f;

    /* renamed from: g, reason: collision with root package name */
    public float f365020g;

    public MediaAdView(@N Context context) {
        super(context);
        this.f365015b = new C39922y0(context);
        this.f365017d = new r(context);
        this.f365016c = new ProgressBar(context, null, R.attr.progressBarStyle);
        a(context);
    }

    public final void a(@N Context context) {
        Bitmap bitmapCreateBitmap;
        View view = this.f365015b;
        C39924z.m(view, "media_image");
        ProgressBar progressBar = this.f365016c;
        C39924z.m(progressBar, "progress_bar");
        r rVar = this.f365017d;
        C39924z.m(rVar, "play_button");
        setBackgroundColor(-1118482);
        progressBar.setVisibility(8);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setColorFilter(-16733198, PorterDuff.Mode.SRC_ATOP);
        }
        int iA2 = new C39924z(context).a(80);
        Bitmap bitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(iA2, iA2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-1157627904);
            float f12 = iA2;
            canvas.drawOval(new RectF(0.0f, 0.0f, f12, f12), paint);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(8);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float f13 = 4;
            float f14 = iA2 - 4;
            canvas.drawOval(new RectF(f13, f13, f14, f14), paint2);
            Paint paint3 = new Paint();
            paint3.setColor(0);
            canvas.drawPaint(paint3);
            paint3.setStrokeWidth(4.0f);
            paint3.setColor(-1);
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            paint3.setAntiAlias(true);
            float f15 = f12 / 160.0f;
            int i12 = (int) (60.0f * f15);
            Point point = new Point(i12, (int) (50.0f * f15));
            Point point2 = new Point(i12, (int) (110.0f * f15));
            Point point3 = new Point((int) (112.0f * f15), (int) (f15 * 80.0f));
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(point.x, point.y);
            path.lineTo(point2.x, point2.y);
            path.lineTo(point3.x, point3.y);
            path.lineTo(point.x, point.y);
            path.close();
            canvas.drawPath(path, paint3);
            bitmap = bitmapCreateBitmap;
        }
        rVar.a(bitmap, false);
        rVar.setVisibility(8);
        addView(view);
        addView(rVar, new FrameLayout.LayoutParams(-2, -2));
        addView(progressBar, new FrameLayout.LayoutParams(-2, -2));
    }

    public final void b(int i12, int i13) {
        this.f365018e = i12;
        this.f365019f = i13;
        C39922y0 c39922y0 = this.f365015b;
        c39922y0.f394908e = i12;
        c39922y0.f394907d = i13;
        float f12 = i13;
        this.f365020g = f12 != 0.0f ? i12 / f12 : 0.0f;
    }

    @N
    public ImageView getImageView() {
        return this.f365015b;
    }

    public float getMediaAspectRatio() {
        return this.f365020g;
    }

    @N
    public View getPlayButtonView() {
        return this.f365017d;
    }

    @N
    public ProgressBar getProgressBarView() {
        return this.f365016c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i17 = ((i14 - i12) - measuredWidth) / 2;
                    int i18 = ((i15 - i13) - measuredHeight) / 2;
                    childAt.layout(i17, i18, measuredWidth + i17, measuredHeight + i18);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int i16 = this.f365018e;
        if (i16 == 0 || (i14 = this.f365019f) == 0) {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        float f12 = i16 / i14;
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i12, i13);
            return;
        }
        if (mode == 0) {
            size = (int) (size2 * f12);
        } else if (mode2 == 0 || mode2 != 1073741824) {
            size2 = (int) (size / f12);
        }
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i18 = BeduinInputModel.MIN_TEXT_VERSION;
                if (layoutParams != null) {
                    i15 = layoutParams.width == -1 ? 1073741824 : Integer.MIN_VALUE;
                    if (layoutParams.height == -1) {
                        i18 = 1073741824;
                    }
                } else {
                    i15 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i15), View.MeasureSpec.makeMeasureSpec(size2, i18));
                if (childAt.getMeasuredHeight() > 0) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@P View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f365017d.setOnClickListener(onClickListener);
    }

    public MediaAdView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f365015b = new C39922y0(context);
        this.f365017d = new r(context);
        this.f365016c = new ProgressBar(context, null, R.attr.progressBarStyle);
        a(context);
    }
}
