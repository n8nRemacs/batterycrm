package BT;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.shape.q;
import com.google.android.material.shape.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ShapedFrameLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LBT/a;", "Landroid/widget/FrameLayout;", "Lcom/google/android/material/shape/q;", "shapeAppearanceModel", "Lkotlin/G0;", "setShapeModelClipPath", "(Lcom/google/android/material/shape/q;)V", "_design-modules_beduin-v2_renderer_component_gallery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Path f1393b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public q f1394c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r f1395d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Rect f1396e;

    public a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f1393b = new Path();
        this.f1395d = new r();
        this.f1396e = new Rect();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f1393b);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        Rect rect = this.f1396e;
        rect.top = 0;
        rect.left = 0;
        rect.right = getMeasuredWidth();
        rect.bottom = getMeasuredHeight();
        this.f1395d.a(this.f1394c, 1.0f, new RectF(rect), null, this.f1393b);
    }

    public final void setShapeModelClipPath(@k q shapeAppearanceModel) {
        this.f1394c = shapeAppearanceModel;
        requestLayout();
    }
}
