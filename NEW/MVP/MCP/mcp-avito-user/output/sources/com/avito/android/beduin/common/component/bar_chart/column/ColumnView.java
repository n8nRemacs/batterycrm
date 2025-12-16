package com.avito.android.beduin.common.component.bar_chart.column;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.beduin.common.container.Corners;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ColumnView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/column/ColumnView;", "Landroid/view/View;", "", "color", "Lkotlin/G0;", "setBackgroundColor", "(I)V", "Lcom/avito/android/beduin/common/container/Corners;", "corners", "setCorners", "(Lcom/avito/android/beduin/common/container/Corners;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ColumnView extends View {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final float[] f100712b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public float[] f100713c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Path f100714d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Paint f100715e;

    @j
    public ColumnView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f100714d, this.f100715e);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        Path path = this.f100714d;
        path.reset();
        path.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.f100713c, Path.Direction.CW);
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.f100715e.setColor(color);
        invalidate();
    }

    public final void setCorners(@l Corners corners) {
        this.f100713c = corners != null ? Wh.d.a(corners) : this.f100712b;
        Path path = this.f100714d;
        path.reset();
        path.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.f100713c, Path.Direction.CW);
        invalidate();
    }

    public ColumnView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        float[] fArr = new float[8];
        this.f100712b = fArr;
        this.f100713c = fArr;
        this.f100714d = new Path();
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setAntiAlias(true);
        this.f100715e = paint;
    }
}
