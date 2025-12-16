package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/x1;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20638x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28799d;

    public C20638x1(int i12, int i13, int i14, int i15) {
        this.f28796a = i12;
        this.f28797b = i13;
        this.f28798c = i14;
        this.f28799d = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20638x1)) {
            return false;
        }
        C20638x1 c20638x1 = (C20638x1) obj;
        return this.f28796a == c20638x1.f28796a && this.f28797b == c20638x1.f28797b && this.f28798c == c20638x1.f28798c && this.f28799d == c20638x1.f28799d;
    }

    public final int hashCode() {
        return (((((this.f28796a * 31) + this.f28797b) * 31) + this.f28798c) * 31) + this.f28799d;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f28796a);
        sb2.append(", top=");
        sb2.append(this.f28797b);
        sb2.append(", right=");
        sb2.append(this.f28798c);
        sb2.append(", bottom=");
        return androidx.appcompat.app.r.t(sb2, this.f28799d, ')');
    }
}
