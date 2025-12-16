package androidx.compose.ui.text;

import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: MultiParagraph.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/M;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f41932a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41934c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41935d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41936e;

    /* renamed from: f, reason: collision with root package name */
    public final float f41937f;

    /* renamed from: g, reason: collision with root package name */
    public final float f41938g;

    public M(@Y61.k L l12, int i12, int i13, int i14, int i15, float f12, float f13) {
        this.f41932a = l12;
        this.f41933b = i12;
        this.f41934c = i13;
        this.f41935d = i14;
        this.f41936e = i15;
        this.f41937f = f12;
        this.f41938g = f13;
    }

    @Y61.k
    public final l0.j a(@Y61.k l0.j jVar) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f41937f) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jVar.n(jFloatToRawIntBits);
    }

    public final long b(long j12, boolean z12) {
        if (z12) {
            v0.f42734b.getClass();
            long j13 = v0.f42735c;
            if (v0.c(j12, j13)) {
                return j13;
            }
        }
        v0.a aVar = v0.f42734b;
        int i12 = (int) (j12 >> 32);
        int i13 = this.f41933b;
        return w0.a(i12 + i13, ((int) (j12 & 4294967295L)) + i13);
    }

    @Y61.k
    public final l0.j c(@Y61.k l0.j jVar) {
        float f12 = -this.f41937f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jVar.n(jFloatToRawIntBits);
    }

    public final int d(int i12) {
        int i13 = this.f41934c;
        int i14 = this.f41933b;
        return kotlin.ranges.s.g(i12, i14, i13) - i14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m12 = (M) obj;
        return kotlin.jvm.internal.L.f(this.f41932a, m12.f41932a) && this.f41933b == m12.f41933b && this.f41934c == m12.f41934c && this.f41935d == m12.f41935d && this.f41936e == m12.f41936e && Float.compare(this.f41937f, m12.f41937f) == 0 && Float.compare(this.f41938g, m12.f41938g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41938g) + androidx.appcompat.app.r.d(this.f41937f, androidx.appcompat.app.r.e(this.f41936e, androidx.appcompat.app.r.e(this.f41935d, androidx.appcompat.app.r.e(this.f41934c, androidx.appcompat.app.r.e(this.f41933b, this.f41932a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f41932a);
        sb2.append(", startIndex=");
        sb2.append(this.f41933b);
        sb2.append(", endIndex=");
        sb2.append(this.f41934c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f41935d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f41936e);
        sb2.append(", top=");
        sb2.append(this.f41937f);
        sb2.append(", bottom=");
        return androidx.appcompat.app.r.k(')', this.f41938g, sb2);
    }

    public /* synthetic */ M(L l12, int i12, int i13, int i14, int i15, float f12, float f13, int i16, C42822w c42822w) {
        this(l12, i12, i13, (i16 & 8) != 0 ? -1 : i14, (i16 & 16) != 0 ? -1 : i15, (i16 & 32) != 0 ? -1.0f : f12, (i16 & 64) != 0 ? -1.0f : f13);
    }
}
