package com.avito.android.krop;

import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OverlayView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/krop/e;", "Landroid/view/View;", "Lcom/avito/android/krop/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "Lkotlin/G0;", "setOverlayColor", "(I)V", "Lcom/avito/android/krop/e$a;", "listener", "setMeasureListener", "(Lcom/avito/android/krop/e$a;)V", "a", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public abstract class e extends View implements i {

    /* renamed from: b, reason: collision with root package name */
    public int f174833b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f174834c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f174835d;

    /* renamed from: e, reason: collision with root package name */
    public a f174836e;

    /* compiled from: OverlayView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/e$a;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
    public interface a {
        void a();
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    public abstract void a(@Y61.k Canvas canvas, @Y61.k Paint paint, @Y61.k RectF rectF);

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.f174833b);
        a(canvas, this.f174834c, this.f174835d);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        a aVar = this.f174836e;
        if (aVar == null) {
            throw new IllegalStateException("Overlay not inited correctly: check, if it is referenced by any MeasureListener implementation");
        }
        aVar.a();
    }

    public final void setMeasureListener(@Y61.k a listener) {
        this.f174836e = listener;
    }

    public final void setOverlayColor(int color) {
        this.f174833b = color;
        invalidate();
    }

    public e(@Y61.k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f174834c = paint;
        setLayerType(1, null);
    }
}
