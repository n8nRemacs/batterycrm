package com.avito.android.comparison.text_measurer;

import Y61.k;
import Y61.l;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: TextMeasurer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/text_measurer/a;", "", "a", "_avito_comparison_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: TextMeasurer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/text_measurer/a$a;", "", "_avito_comparison_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comparison.text_measurer.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3707a {

        /* renamed from: a, reason: collision with root package name */
        public final int f124212a;

        /* renamed from: b, reason: collision with root package name */
        public final int f124213b;

        /* renamed from: c, reason: collision with root package name */
        public final int f124214c;

        /* renamed from: d, reason: collision with root package name */
        public final int f124215d;

        /* renamed from: e, reason: collision with root package name */
        public final int f124216e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final TextPaint f124217f;

        /* renamed from: g, reason: collision with root package name */
        public final float f124218g;

        /* renamed from: h, reason: collision with root package name */
        public final float f124219h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f124220i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final Layout.Alignment f124221j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final TextDirectionHeuristic f124222k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f124223l;

        /* renamed from: m, reason: collision with root package name */
        public final int f124224m;

        /* renamed from: n, reason: collision with root package name */
        public final int f124225n;

        /* renamed from: o, reason: collision with root package name */
        public final int f124226o;

        /* renamed from: p, reason: collision with root package name */
        public final int f124227p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final TextUtils.TruncateAt f124228q;

        /* renamed from: r, reason: collision with root package name */
        public final int f124229r;

        public C3707a(int i12, int i13, int i14, int i15, int i16, TextPaint textPaint, float f12, float f13, boolean z12, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, boolean z13, int i17, int i18, int i19, int i22, TextUtils.TruncateAt truncateAt, int i23, int i24, C42822w c42822w) {
            Layout.Alignment alignment2 = (i24 & 512) != 0 ? Layout.Alignment.ALIGN_NORMAL : alignment;
            TextDirectionHeuristic textDirectionHeuristic2 = (i24 & 1024) != 0 ? TextDirectionHeuristics.LTR : textDirectionHeuristic;
            boolean z14 = (i24 & 2048) != 0 ? false : z13;
            int i25 = (i24 & 4096) != 0 ? 0 : i17;
            int i26 = (i24 & 8192) != 0 ? 0 : i18;
            int i27 = (i24 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i19;
            int i28 = (32768 & i24) != 0 ? Integer.MAX_VALUE : i22;
            TextUtils.TruncateAt truncateAt2 = (65536 & i24) != 0 ? null : truncateAt;
            int i29 = (i24 & 131072) == 0 ? i23 : 0;
            this.f124212a = i12;
            this.f124213b = i13;
            this.f124214c = i14;
            this.f124215d = i15;
            this.f124216e = i16;
            this.f124217f = textPaint;
            this.f124218g = f12;
            this.f124219h = f13;
            this.f124220i = z12;
            this.f124221j = alignment2;
            this.f124222k = textDirectionHeuristic2;
            this.f124223l = z14;
            this.f124224m = i25;
            this.f124225n = i26;
            this.f124226o = i27;
            this.f124227p = i28;
            this.f124228q = truncateAt2;
            this.f124229r = i29;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3707a)) {
                return false;
            }
            C3707a c3707a = (C3707a) obj;
            return this.f124212a == c3707a.f124212a && this.f124213b == c3707a.f124213b && this.f124214c == c3707a.f124214c && this.f124215d == c3707a.f124215d && this.f124216e == c3707a.f124216e && L.f(this.f124217f, c3707a.f124217f) && Float.compare(this.f124218g, c3707a.f124218g) == 0 && Float.compare(this.f124219h, c3707a.f124219h) == 0 && this.f124220i == c3707a.f124220i && this.f124221j == c3707a.f124221j && L.f(this.f124222k, c3707a.f124222k) && this.f124223l == c3707a.f124223l && this.f124224m == c3707a.f124224m && this.f124225n == c3707a.f124225n && this.f124226o == c3707a.f124226o && this.f124227p == c3707a.f124227p && this.f124228q == c3707a.f124228q && this.f124229r == c3707a.f124229r;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f124227p, r.e(this.f124226o, r.e(this.f124225n, r.e(this.f124224m, r.i((this.f124222k.hashCode() + ((this.f124221j.hashCode() + r.i(r.d(this.f124219h, r.d(this.f124218g, (this.f124217f.hashCode() + r.e(this.f124216e, r.e(this.f124215d, r.e(this.f124214c, r.e(this.f124213b, Integer.hashCode(this.f124212a) * 31, 31), 31), 31), 31)) * 31, 31), 31), 31, this.f124220i)) * 31)) * 31, 31, this.f124223l), 31), 31), 31), 31);
            TextUtils.TruncateAt truncateAt = this.f124228q;
            return Integer.hashCode(this.f124229r) + ((iE2 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextParams(maxTextWidth=");
            sb2.append(this.f124212a);
            sb2.append(", verticalPadding=");
            sb2.append(this.f124213b);
            sb2.append(", horizontalPadding=");
            sb2.append(this.f124214c);
            sb2.append(", verticalMargin=");
            sb2.append(this.f124215d);
            sb2.append(", horizontalMargin=");
            sb2.append(this.f124216e);
            sb2.append(", textPaint=");
            sb2.append(this.f124217f);
            sb2.append(", spacingAdd=");
            sb2.append(this.f124218g);
            sb2.append(", spacingMult=");
            sb2.append(this.f124219h);
            sb2.append(", includePad=");
            sb2.append(this.f124220i);
            sb2.append(", textAlignment=");
            sb2.append(this.f124221j);
            sb2.append(", textDirection=");
            sb2.append(this.f124222k);
            sb2.append(", isFallbackLineSpacing=");
            sb2.append(this.f124223l);
            sb2.append(", breakStrategy=");
            sb2.append(this.f124224m);
            sb2.append(", hyphenationFrequency=");
            sb2.append(this.f124225n);
            sb2.append(", justificationMode=");
            sb2.append(this.f124226o);
            sb2.append(", maxLines=");
            sb2.append(this.f124227p);
            sb2.append(", ellipsis=");
            sb2.append(this.f124228q);
            sb2.append(", ellipsisWidth=");
            return r.t(sb2, this.f124229r, ')');
        }
    }

    @k
    C3707a a(@k TextView textView, int i12);

    @k
    Size b(@l String str, @k C3707a c3707a);
}
