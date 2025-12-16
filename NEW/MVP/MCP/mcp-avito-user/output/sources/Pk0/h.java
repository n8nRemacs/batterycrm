package PK0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import j.U;
import kotlin.Metadata;

/* compiled from: SpacingSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPK0/h;", "Landroid/text/style/ReplacementSpan;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f12984b;

    public h(@U int i12) {
        this.f12984b = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@Y61.k Paint paint, @Y61.l CharSequence charSequence, int i12, int i13, @Y61.l Paint.FontMetricsInt fontMetricsInt) {
        return this.f12984b;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@Y61.k Canvas canvas, @Y61.l CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @Y61.k Paint paint) {
    }
}
