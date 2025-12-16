package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.rj1;

/* loaded from: classes8.dex */
final class f extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private Rect f392871a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f392872b;

    /* renamed from: c, reason: collision with root package name */
    private int f392873c;

    /* renamed from: d, reason: collision with root package name */
    private int f392874d;

    public f(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.f392871a = new Rect();
        this.f392872b = new Paint();
        this.f392873c = rj1.a(getContext(), 1.0f);
        this.f392874d = rj1.a(getContext(), 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iA2 = rj1.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f392872b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f392873c);
        paint.setColor(iA2);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i12 = 0; i12 < lineCount; i12++) {
            int lineBounds = getLineBounds(i12, this.f392871a);
            int lineStart = layout.getLineStart(i12);
            int lineEnd = layout.getLineEnd(i12);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f12 = lineBounds + this.f392874d;
            canvas.drawLine(primaryHorizontal, f12, primaryHorizontal2, f12, paint);
        }
        super.onDraw(canvas);
    }
}
