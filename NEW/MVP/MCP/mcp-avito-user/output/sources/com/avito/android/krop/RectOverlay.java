package com.avito.android.krop;

import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OverlayView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/krop/RectOverlay;", "Lcom/avito/android/krop/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class RectOverlay extends e {
    public RectOverlay(@Y61.k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.avito.android.krop.e
    public final void a(@Y61.k Canvas canvas, @Y61.k Paint paint, @Y61.k RectF rectF) {
        canvas.drawRect(rectF, paint);
    }

    public /* synthetic */ RectOverlay(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}
