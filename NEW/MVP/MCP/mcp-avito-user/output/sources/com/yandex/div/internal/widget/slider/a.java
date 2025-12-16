package com.yandex.div.internal.widget.slider;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: SliderDrawDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/widget/slider/a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f370336a;

    /* renamed from: b, reason: collision with root package name */
    public int f370337b;

    public final void a(@k Canvas canvas, @l Drawable drawable, int i12) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i12 - intrinsicWidth, (this.f370337b / 2) - (drawable.getIntrinsicHeight() / 2), i12 + intrinsicWidth, (drawable.getIntrinsicHeight() / 2) + (this.f370337b / 2));
        drawable.draw(canvas);
    }

    public final void b(@k Canvas canvas, int i12, @l Drawable drawable, int i13, @l L21.b bVar) {
        a(canvas, drawable, i12);
        if (bVar == null) {
            return;
        }
        String strValueOf = String.valueOf(i13);
        L21.a aVar = bVar.f9766b;
        aVar.f9762d = strValueOf;
        Paint paint = aVar.f9761c;
        paint.getTextBounds(strValueOf, 0, strValueOf.length(), aVar.f9760b);
        aVar.f9763e = paint.measureText(aVar.f9762d) / 2.0f;
        aVar.f9764f = r3.height() / 2.0f;
        bVar.invalidateSelf();
        a(canvas, bVar, i12);
    }
}
