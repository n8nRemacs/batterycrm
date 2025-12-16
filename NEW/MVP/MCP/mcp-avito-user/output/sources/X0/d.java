package x0;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.L;
import androidx.compose.ui.text.android.O;
import kotlin.Metadata;

/* compiled from: IndentationFixSpan.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* compiled from: IndentationFixSpan.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f441901a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f441901a = iArr;
        }
    }

    public static final float a(@Y61.k Layout layout, int i12, @Y61.k Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i12);
        L l12 = O.f42001a;
        if (layout.getEllipsisCount(i12) <= 0 || layout.getParagraphDirection(i12) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i12) + layout.getLineStart(i12)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i12);
        if ((paragraphAlignment == null ? -1 : a.f441901a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float b(@Y61.k Layout layout, int i12, @Y61.k Paint paint) {
        float width;
        float width2;
        L l12 = O.f42001a;
        if (layout.getEllipsisCount(i12) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i12) != -1 || layout.getWidth() >= layout.getLineRight(i12)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i12) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i12) + layout.getLineStart(i12)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i12);
        if ((paragraphAlignment != null ? a.f441901a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i12);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i12);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }
}
