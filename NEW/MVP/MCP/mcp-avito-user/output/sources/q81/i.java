package Q81;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.LineBackgroundSpan;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: PaddingBackgroundColorSpan.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ81/i;", "Landroid/text/style/LineBackgroundSpan;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class i implements LineBackgroundSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f13564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13565c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Rect f13566d = new Rect();

    public i(int i12, int i13) {
        this.f13564b = i12;
        this.f13565c = i13;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(@k Canvas canvas, @k Paint paint, int i12, int i13, int i14, int i15, int i16, @k CharSequence charSequence, int i17, int i18, int i19) {
        int iB2 = kotlin.math.b.b(paint.measureText(charSequence, i17, i18));
        int color = paint.getColor();
        int i22 = this.f13565c;
        int i23 = i12 - i22;
        int i24 = i22 / 2;
        if (i19 != 0) {
            i24 = -i24;
        }
        Rect rect = this.f13566d;
        rect.set(i23, i14 - i24, i12 + iB2 + i22, (i22 / 2) + i16);
        paint.setColor(this.f13564b);
        canvas.drawRect(rect, paint);
        paint.setColor(color);
    }
}
