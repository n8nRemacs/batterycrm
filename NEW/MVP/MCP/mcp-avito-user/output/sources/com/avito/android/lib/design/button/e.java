package com.avito.android.lib.design.button;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.q;
import com.google.android.material.shape.r;
import kotlin.Metadata;

/* compiled from: ShadowPainter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/button/e;", "Lcom/avito/android/lib/design/button/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends d {

    /* renamed from: i, reason: collision with root package name */
    @k
    public q f178654i = new q.b().a();

    @Override // com.avito.android.lib.design.button.d
    public final void b(@k Canvas canvas, @k Paint paint, @k RectF rectF) {
        Path path = new Path();
        new r().a(this.f178654i, 1.0f, rectF, null, path);
        canvas.drawPath(path, paint);
    }
}
