package PK0;

import Ba1.C13127e;
import android.graphics.Paint;
import android.os.Build;
import android.text.style.LineHeightSpan;
import j.U;
import kotlin.Metadata;

/* compiled from: LineHeightSpanCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LPK0/d;", "", "<init>", "()V", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* compiled from: LineHeightSpanCompat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPK0/d$a;", "Landroid/text/style/LineHeightSpan;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LineHeightSpan {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LineHeightSpan f12979b;

        public a(@U final int i12) {
            this.f12979b = Build.VERSION.SDK_INT >= 29 ? C13127e.n(i12) : new LineHeightSpan() { // from class: PK0.c
                @Override // android.text.style.LineHeightSpan
                public final void chooseHeight(CharSequence charSequence, int i13, int i14, int i15, int i16, Paint.FontMetricsInt fontMetricsInt) {
                    int i17 = fontMetricsInt.descent;
                    int i18 = i17 - fontMetricsInt.ascent;
                    if (i18 <= 0) {
                        return;
                    }
                    int i19 = i12;
                    int iB2 = kotlin.math.b.b(i17 * ((i19 * 1.0f) / i18));
                    fontMetricsInt.descent = iB2;
                    fontMetricsInt.ascent = iB2 - i19;
                }
            };
        }

        @Override // android.text.style.LineHeightSpan
        public final void chooseHeight(CharSequence charSequence, int i12, int i13, int i14, int i15, Paint.FontMetricsInt fontMetricsInt) {
            this.f12979b.chooseHeight(charSequence, i12, i13, i14, i15, fontMetricsInt);
        }
    }

    static {
        new d();
    }
}
