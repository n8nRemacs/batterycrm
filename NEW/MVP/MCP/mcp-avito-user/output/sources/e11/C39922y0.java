package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: e11.y0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39922y0 extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public Bitmap f394905b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public Drawable f394906c;

    /* renamed from: d, reason: collision with root package name */
    public int f394907d;

    /* renamed from: e, reason: collision with root package name */
    public int f394908e;

    /* renamed from: f, reason: collision with root package name */
    public int f394909f;

    /* renamed from: g, reason: collision with root package name */
    public int f394910g;

    public C39922y0(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i12, int i13) {
        int intrinsicWidth;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int intrinsicHeight = this.f394907d;
        if (intrinsicHeight == 0 || (intrinsicWidth = this.f394908e) == 0) {
            Bitmap bitmap = this.f394905b;
            if (bitmap != null) {
                intrinsicWidth = bitmap.getWidth();
                intrinsicHeight = this.f394905b.getHeight();
            } else {
                Drawable drawable = this.f394906c;
                if (drawable == null) {
                    setMeasuredDimension(0, 0);
                    return;
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    intrinsicHeight = this.f394906c.getIntrinsicHeight();
                }
            }
        }
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            super.onMeasure(i12, i13);
            return;
        }
        float f12 = intrinsicWidth;
        float f13 = intrinsicHeight;
        float f14 = f12 / f13;
        int i14 = this.f394910g;
        if (i14 > 0) {
            size2 = Math.min(i14, size2);
        }
        int i15 = this.f394909f;
        if (i15 > 0) {
            size = Math.min(i15, size);
        }
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode != 0 || mode2 != 0) {
            if (mode == 0) {
                intrinsicWidth = (int) (size2 * f14);
            } else {
                if (mode2 == 0) {
                    intrinsicHeight = (int) (size / f14);
                } else {
                    float f15 = size;
                    float f16 = f15 / f12;
                    float f17 = size2;
                    if (Math.min(f16, f17 / f13) != f16 || f14 <= 0.0f) {
                        intrinsicWidth = (int) (f17 * f14);
                    } else {
                        intrinsicHeight = (int) (f15 / f14);
                    }
                }
                intrinsicWidth = size;
            }
            intrinsicHeight = size2;
        }
        setMeasuredDimension(intrinsicWidth, intrinsicHeight);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@j.P Bitmap bitmap) {
        this.f394905b = bitmap;
        super.setImageBitmap(bitmap);
    }

    public void setImageData(@j.P com.my.target.common.models.b bVar) {
        if (bVar == null) {
            this.f394907d = 0;
            this.f394908e = 0;
            setImageBitmap(null);
        } else {
            this.f394907d = bVar.f394306c;
            this.f394908e = bVar.f394305b;
            setImageBitmap(bVar.a());
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@j.P Drawable drawable) {
        this.f394906c = drawable;
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i12) {
        this.f394910g = i12;
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i12) {
        this.f394909f = i12;
    }
}
