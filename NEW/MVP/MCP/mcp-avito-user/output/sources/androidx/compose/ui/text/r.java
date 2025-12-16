package androidx.compose.ui.text;

import kotlin.Metadata;

/* compiled from: Html.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/r;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22666p f42621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42622b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42623c;

    public r(@Y61.k C22666p c22666p, int i12, int i13) {
        this.f42621a = c22666p;
        this.f42622b = i12;
        this.f42623c = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.L.f(this.f42621a, rVar.f42621a) && this.f42622b == rVar.f42622b && this.f42623c == rVar.f42623c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42623c) + androidx.appcompat.app.r.e(this.f42622b, this.f42621a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb2.append(this.f42621a);
        sb2.append(", indentationLevel=");
        sb2.append(this.f42622b);
        sb2.append(", start=");
        return androidx.appcompat.app.r.t(sb2, this.f42623c, ')');
    }
}
