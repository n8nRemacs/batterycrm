package com.avito.android.publish.slots.item_info;

import Y61.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfettiDotView.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/slots/item_info/b;", "Landroid/view/View;", "", "d", "Lkotlin/C;", "getParticleColor", "()I", "particleColor", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends View {

    /* renamed from: b, reason: collision with root package name */
    public final float f244346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f244347c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C particleColor;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Paint f244349e;

    public b(Context context, AttributeSet attributeSet, int i12, float f12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f244346b = f12;
        this.f244347c = y6.a(f12) * 2;
        this.particleColor = C42727D.c(new a(context));
        Paint paint = new Paint();
        paint.setColor(getParticleColor());
        paint.setAntiAlias(true);
        this.f244349e = paint;
    }

    private final int getParticleColor() {
        return ((Number) this.particleColor.getValue()).intValue();
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, y6.a(this.f244346b), this.f244349e);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14 = this.f244347c;
        setMeasuredDimension(i14, i14);
    }
}
