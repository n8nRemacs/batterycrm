package Ch0;

import Y61.k;
import Y61.l;
import android.text.TextPaint;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LineDataHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCh0/b;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final TextPaint f2624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2626c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2627d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2628e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2629f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2630g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<Float> f2631h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C13305a f2632i;

    public b(@l TextPaint textPaint, int i12, int i13, float f12, float f13, float f14, float f15, @k List<Float> list, @k C13305a c13305a) {
        this.f2624a = textPaint;
        this.f2625b = i12;
        this.f2626c = i13;
        this.f2627d = f12;
        this.f2628e = f13;
        this.f2629f = f14;
        this.f2630g = f15;
        this.f2631h = list;
        this.f2632i = c13305a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f2624a, bVar.f2624a) && this.f2625b == bVar.f2625b && this.f2626c == bVar.f2626c && Float.compare(this.f2627d, bVar.f2627d) == 0 && Float.compare(this.f2628e, bVar.f2628e) == 0 && Float.compare(this.f2629f, bVar.f2629f) == 0 && Float.compare(this.f2630g, bVar.f2630g) == 0 && L.f(this.f2631h, bVar.f2631h) && L.f(this.f2632i, bVar.f2632i);
    }

    public final int hashCode() {
        TextPaint textPaint = this.f2624a;
        return this.f2632i.hashCode() + H.e(r.d(this.f2630g, r.d(this.f2629f, r.d(this.f2628e, r.d(this.f2627d, r.e(this.f2626c, r.e(this.f2625b, (textPaint == null ? 0 : textPaint.hashCode()) * 31, 31), 31), 31), 31), 31), 31), 31, this.f2631h);
    }

    @k
    public final String toString() {
        return "LineDataHolder(textPaint=" + this.f2624a + ", startIntText=" + this.f2625b + ", endIntText=" + this.f2626c + ", left=" + this.f2627d + ", right=" + this.f2628e + ", top=" + this.f2629f + ", bottom=" + this.f2630g + ", cornerRadii=" + this.f2631h + ", backgroundHolder=" + this.f2632i + ')';
    }

    public /* synthetic */ b(TextPaint textPaint, int i12, int i13, float f12, float f13, float f14, float f15, List list, C13305a c13305a, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? null : textPaint, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? 0.0f : f12, (i14 & 16) != 0 ? 0.0f : f13, (i14 & 32) != 0 ? 0.0f : f14, (i14 & 64) != 0 ? 0.0f : f15, list, c13305a);
    }
}
