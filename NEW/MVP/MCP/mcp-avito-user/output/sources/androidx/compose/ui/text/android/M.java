package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: TextLayout.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/M;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextPaint f41983a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final TextUtils.TruncateAt f41984b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41985c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41986d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41987e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public w0.i f41988f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Layout f41989g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41990h;

    /* renamed from: i, reason: collision with root package name */
    public final int f41991i;

    /* renamed from: j, reason: collision with root package name */
    public final int f41992j;

    /* renamed from: k, reason: collision with root package name */
    public final float f41993k;

    /* renamed from: l, reason: collision with root package name */
    public final float f41994l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f41995m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Paint.FontMetricsInt f41996n;

    /* renamed from: o, reason: collision with root package name */
    public final int f41997o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final x0.h[] f41998p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Rect f41999q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public r f42000r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M(java.lang.CharSequence r30, float r31, android.text.TextPaint r32, int r33, android.text.TextUtils.TruncateAt r34, int r35, float r36, float r37, boolean r38, boolean r39, int r40, int r41, int r42, int r43, int r44, int r45, int[] r46, int[] r47, androidx.compose.ui.text.android.t r48, int r49, kotlin.jvm.internal.C42822w r50) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.M.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.t, int, kotlin.jvm.internal.w):void");
    }

    public final void a(int i12, int i13, int i14, @Y61.k float[] fArr) {
        boolean z12;
        float fA2;
        float fA3;
        M m12 = this;
        Layout layout = m12.f41989g;
        int length = layout.getText().length();
        if (i12 < 0) {
            C50028a.a("startOffset must be > 0");
        }
        if (i12 >= length) {
            C50028a.a("startOffset must be less than text length");
        }
        if (i13 <= i12) {
            C50028a.a("endOffset must be greater than startOffset");
        }
        if (i13 > length) {
            C50028a.a("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i14 < (i13 - i12) * 4) {
            C50028a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = layout.getLineForOffset(i12);
        int lineForOffset2 = layout.getLineForOffset(i13 - 1);
        C22574m c22574m = new C22574m(m12);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i15 = lineForOffset;
        int i16 = i14;
        while (true) {
            int lineStart = layout.getLineStart(i15);
            int iG2 = m12.g(i15);
            int iMax = Math.max(i12, lineStart);
            int iMin = Math.min(i13, iG2);
            float fH2 = m12.h(i15);
            float f12 = m12.f(i15);
            boolean z13 = false;
            boolean z14 = layout.getParagraphDirection(i15) == 1;
            while (iMax < iMin) {
                boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                if (!z14 || zIsRtlCharAt) {
                    if (z14 && zIsRtlCharAt) {
                        float fA4 = c22574m.a(iMax, false, false, false);
                        fA2 = c22574m.a(iMax + 1, true, true, false);
                        z12 = false;
                        fA3 = fA4;
                    } else if (z14 || !zIsRtlCharAt) {
                        z12 = false;
                        fA2 = c22574m.a(iMax, false, false, false);
                        fA3 = c22574m.a(iMax + 1, true, true, false);
                    } else {
                        float fA5 = c22574m.a(iMax, false, false, true);
                        fA2 = c22574m.a(iMax + 1, true, true, true);
                        fA3 = fA5;
                    }
                    fArr[i16] = fA2;
                    fArr[i16 + 1] = fH2;
                    fArr[i16 + 2] = fA3;
                    fArr[i16 + 3] = f12;
                    i16 += 4;
                    iMax++;
                    z13 = z12;
                } else {
                    fA2 = c22574m.a(iMax, z13, z13, true);
                    fA3 = c22574m.a(iMax + 1, true, true, true);
                }
                z12 = false;
                fArr[i16] = fA2;
                fArr[i16 + 1] = fH2;
                fArr[i16 + 2] = fA3;
                fArr[i16 + 3] = f12;
                i16 += 4;
                iMax++;
                z13 = z12;
            }
            if (i15 == lineForOffset2) {
                return;
            }
            i15++;
            m12 = this;
        }
    }

    public final int b() {
        boolean z12 = this.f41987e;
        Layout layout = this.f41989g;
        return (z12 ? layout.getLineBottom(this.f41990h - 1) : layout.getHeight()) + this.f41991i + this.f41992j + this.f41997o;
    }

    public final float c(int i12) {
        if (i12 == this.f41990h - 1) {
            return this.f41993k + this.f41994l;
        }
        return 0.0f;
    }

    public final r d() {
        r rVar = this.f42000r;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this.f41989g);
        this.f42000r = rVar2;
        return rVar2;
    }

    public final float e(int i12) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f41991i + ((i12 != this.f41990h + (-1) || (fontMetricsInt = this.f41996n) == null) ? this.f41989g.getLineBaseline(i12) : h(i12) - fontMetricsInt.ascent);
    }

    public final float f(int i12) {
        Paint.FontMetricsInt fontMetricsInt;
        int i13 = this.f41990h;
        int i14 = i13 - 1;
        Layout layout = this.f41989g;
        if (i12 != i14 || (fontMetricsInt = this.f41996n) == null) {
            return this.f41991i + layout.getLineBottom(i12) + (i12 == i13 + (-1) ? this.f41992j : 0);
        }
        return layout.getLineBottom(i12 - 1) + fontMetricsInt.bottom;
    }

    public final int g(int i12) {
        L l12 = O.f42001a;
        Layout layout = this.f41989g;
        return (layout.getEllipsisCount(i12) <= 0 || this.f41984b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i12) : layout.getText().length();
    }

    public final float h(int i12) {
        return this.f41989g.getLineTop(i12) + (i12 == 0 ? 0 : this.f41991i);
    }

    public final float i(int i12, boolean z12) {
        return c(this.f41989g.getLineForOffset(i12)) + d().c(i12, true, z12);
    }

    public final float j(int i12, boolean z12) {
        return c(this.f41989g.getLineForOffset(i12)) + d().c(i12, false, z12);
    }

    @Y61.k
    public final w0.i k() {
        w0.i iVar = this.f41988f;
        if (iVar != null) {
            return iVar;
        }
        Layout layout = this.f41989g;
        w0.i iVar2 = new w0.i(layout.getText(), layout.getText().length(), this.f41983a.getTextLocale());
        this.f41988f = iVar2;
        return iVar2;
    }
}
