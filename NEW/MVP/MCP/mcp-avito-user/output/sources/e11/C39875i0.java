package e11;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: e11.i0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39875i0 extends C39922y0 {

    /* renamed from: h, reason: collision with root package name */
    public int f394611h;

    public C39875i0(Context context) {
        super(context, null, 0);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
        this.f394611h = -1;
        this.f394611h = C39924z.c(20, context);
    }

    @Override // e11.C39922y0, android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        if (this.f394611h >= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i12, i13);
        }
    }

    public void setFixedHeight(int i12) {
        this.f394611h = i12;
    }

    @Override // e11.C39922y0, android.widget.ImageView
    public void setImageBitmap(@j.P Bitmap bitmap) {
        int paddingTop;
        int width;
        int i12 = this.f394611h;
        int height = 0;
        if (i12 >= 0) {
            paddingTop = (i12 - getPaddingTop()) - getPaddingBottom();
            if (paddingTop < 0) {
                paddingTop = 0;
            }
        } else {
            paddingTop = -1;
        }
        if (paddingTop >= 0) {
            if (bitmap != null) {
                width = bitmap.getWidth();
                height = bitmap.getHeight();
            } else {
                width = 0;
            }
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + ((int) (paddingTop * (height > 0 ? width / height : 0.0f))), this.f394611h);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // e11.C39922y0, android.widget.ImageView
    public void setImageDrawable(@j.P Drawable drawable) {
        int paddingTop;
        int intrinsicWidth;
        int i12 = this.f394611h;
        int intrinsicHeight = 0;
        if (i12 >= 0) {
            paddingTop = (i12 - getPaddingTop()) - getPaddingBottom();
            if (paddingTop < 0) {
                paddingTop = 0;
            }
        } else {
            paddingTop = -1;
        }
        if (paddingTop >= 0) {
            if (drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
                intrinsicHeight = drawable.getIntrinsicHeight();
            } else {
                intrinsicWidth = 0;
            }
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + ((int) (paddingTop * (intrinsicHeight > 0 ? intrinsicWidth / intrinsicHeight : 0.0f))), this.f394611h);
        }
        super.setImageDrawable(drawable);
    }
}
