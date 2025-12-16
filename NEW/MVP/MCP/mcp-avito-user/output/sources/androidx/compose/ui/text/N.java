package androidx.compose.ui.text;

import kotlin.Metadata;

/* compiled from: MultiParagraphIntrinsics.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/N;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class N {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.platform.g f41939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41940b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41941c;

    public N(@Y61.k androidx.compose.ui.text.platform.g gVar, int i12, int i13) {
        this.f41939a = gVar;
        this.f41940b = i12;
        this.f41941c = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n12 = (N) obj;
        return this.f41939a.equals(n12.f41939a) && this.f41940b == n12.f41940b && this.f41941c == n12.f41941c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41941c) + androidx.appcompat.app.r.e(this.f41940b, this.f41939a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f41939a);
        sb2.append(", startIndex=");
        sb2.append(this.f41940b);
        sb2.append(", endIndex=");
        return androidx.appcompat.app.r.t(sb2, this.f41941c, ')');
    }
}
