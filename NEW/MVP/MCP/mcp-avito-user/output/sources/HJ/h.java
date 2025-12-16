package hJ;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HtmlRenderOptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/h;", "", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f397157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397159c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f397160d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f397161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f397162f;

    public h(int i12, int i13, int i14, int i15, @Y61.k String str, boolean z12) {
        this.f397157a = i12;
        this.f397158b = i13;
        this.f397159c = i14;
        this.f397160d = str;
        this.f397161e = z12;
        this.f397162f = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f397157a == hVar.f397157a && this.f397158b == hVar.f397158b && this.f397159c == hVar.f397159c && L.f(this.f397160d, hVar.f397160d) && this.f397161e == hVar.f397161e && this.f397162f == hVar.f397162f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f397162f) + androidx.appcompat.app.r.i(H.d(androidx.appcompat.app.r.e(this.f397159c, androidx.appcompat.app.r.e(this.f397158b, Integer.hashCode(this.f397157a) * 31, 31), 31), 31, this.f397160d), 31, this.f397161e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HtmlRenderOptions(listBulletLeftMargin=");
        sb2.append(this.f397157a);
        sb2.append(", listBulletRightMargin=");
        sb2.append(this.f397158b);
        sb2.append(", listBulletWidth=");
        sb2.append(this.f397159c);
        sb2.append(", listBullet=");
        sb2.append(this.f397160d);
        sb2.append(", markupForEdit=");
        sb2.append(this.f397161e);
        sb2.append(", lineSpaceMargin=");
        return androidx.appcompat.app.r.t(sb2, this.f397162f, ')');
    }

    public /* synthetic */ h(int i12, int i13, int i14, String str, boolean z12, int i15, int i16, C42822w c42822w) {
        this(i12, i13, i14, i15, str, (i16 & 16) != 0 ? false : z12);
    }
}
