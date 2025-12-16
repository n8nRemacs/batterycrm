package com.yandex.div.core.util.text;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.widgets.C38012d;
import com.yandex.div2.AbstractC38582v7;
import com.yandex.div2.C38371h6;
import com.yandex.div2.C38600x7;
import com.yandex.div2.C38656z6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/text/a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DisplayMetrics f367825a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C38600x7 f367826b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AbstractC38582v7 f367827c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Canvas f367828d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.yandex.div.json.expressions.e f367829e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Paint f367830f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final float[] f367831g;

    public a(@k DisplayMetrics displayMetrics, @l C38600x7 c38600x7, @l AbstractC38582v7 abstractC38582v7, @k Canvas canvas, @k com.yandex.div.json.expressions.e eVar) {
        com.yandex.div.json.expressions.b<Integer> bVar;
        Integer numA;
        this.f367825a = displayMetrics;
        this.f367826b = c38600x7;
        this.f367827c = abstractC38582v7;
        this.f367828d = canvas;
        this.f367829e = eVar;
        Paint paint = new Paint();
        this.f367830f = paint;
        if (c38600x7 == null) {
            this.f367831g = null;
            return;
        }
        com.yandex.div.json.expressions.b<Long> bVar2 = c38600x7.f376974a;
        float fO2 = C37931a.o(bVar2 != null ? bVar2.a(eVar) : null, displayMetrics);
        this.f367831g = new float[]{fO2, fO2, fO2, fO2, fO2, fO2, fO2, fO2};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        C38656z6 c38656z6 = c38600x7.f376975b;
        paint.setStrokeWidth(C38012d.a(c38656z6, eVar, displayMetrics));
        if (c38656z6 == null || (bVar = c38656z6.f377433a) == null || (numA = bVar.a(eVar)) == null) {
            return;
        }
        paint.setColor(numA.intValue());
    }

    public final void a(float[] fArr, float f12, float f13, float f14, float f15) {
        C38371h6 c38371h6;
        RectF rectF = new RectF();
        rectF.set(f12, f13, f14, f15);
        AbstractC38582v7 abstractC38582v7 = this.f367827c;
        if (abstractC38582v7 == null) {
            c38371h6 = null;
        } else {
            if (!(abstractC38582v7 instanceof AbstractC38582v7.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c38371h6 = ((AbstractC38582v7.c) abstractC38582v7).f376778c;
        }
        Canvas canvas = this.f367828d;
        com.yandex.div.json.expressions.e eVar = this.f367829e;
        if (c38371h6 != null) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(c38371h6.f375275a.a(eVar).intValue());
            Path path = new Path();
            path.reset();
            if (fArr == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            path.close();
            canvas.drawPath(path, paint);
        }
        C38600x7 c38600x7 = this.f367826b;
        if ((c38600x7 == null ? null : c38600x7.f376975b) == null) {
            return;
        }
        RectF rectF2 = new RectF();
        float fA2 = C38012d.a(c38600x7.f376975b, eVar, this.f367825a) / 2;
        rectF2.set(Math.max(0.0f, f12 + fA2), Math.max(0.0f, f13 + fA2), Math.max(0.0f, f14 - fA2), Math.max(0.0f, f15 - fA2));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                fArr2[i12] = Math.max(0.0f, fArr[i12] - fA2);
            }
        }
        Path path2 = new Path();
        path2.reset();
        if (fArr2 == null) {
            path2.addRect(rectF2, Path.Direction.CW);
        } else {
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        }
        path2.close();
        canvas.drawPath(path2, this.f367830f);
    }
}
