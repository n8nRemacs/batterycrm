package com.avito.android.lib.design.button;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: ShadowPainter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/button/c;", "Lcom/avito/android/lib/design/button/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends d {

    /* renamed from: i, reason: collision with root package name */
    public float f178645i;

    public static VU.d g(int i12, Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f179007z0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        int color = typedArrayObtainStyledAttributes.getColor(1, C35835l0.d(R.attr.clear, context));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return new VU.d(dimensionPixelOffset, dimensionPixelOffset2, color, dimensionPixelSize);
    }

    @Override // com.avito.android.lib.design.button.d
    public final void b(@k Canvas canvas, @k Paint paint, @k RectF rectF) {
        float f12 = this.f178645i;
        canvas.drawRoundRect(rectF, f12, f12, paint);
    }

    public final void f(@k Context context, @k TypedArray typedArray, @l Integer num, int i12, int i13) {
        int resourceId = typedArray.getResourceId(i12, 0);
        int resourceId2 = typedArray.getResourceId(i13, 0);
        this.f178646a = typedArray.getBoolean(num.intValue(), false);
        e(g(resourceId, context), g(resourceId2, context));
        this.f178645i = typedArray.getDimension(1, 0.0f);
    }

    public final void h(float f12, @l VU.d dVar, @l VU.d dVar2, boolean z12) {
        this.f178646a = z12;
        this.f178645i = f12;
        if (dVar == null) {
            dVar = new VU.d(0, 0, 0, 0, 15, null);
        }
        if (dVar2 == null) {
            dVar2 = new VU.d(0, 0, 0, 0, 15, null);
        }
        e(dVar, dVar2);
    }
}
