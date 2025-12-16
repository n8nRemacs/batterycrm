package Fc1;

/* renamed from: Fc1.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13623h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f5536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5537b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f5538c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5539d;

    public C13623h(int i12, @Y61.k String str, @Y61.k String str2, boolean z12) {
        this.f5536a = str;
        this.f5537b = i12;
        this.f5538c = str2;
        this.f5539d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13623h)) {
            return false;
        }
        C13623h c13623h = (C13623h) obj;
        return kotlin.jvm.internal.L.f(this.f5536a, c13623h.f5536a) && this.f5537b == c13623h.f5537b && kotlin.jvm.internal.L.f(this.f5538c, c13623h.f5538c) && this.f5539d == c13623h.f5539d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.appcompat.app.r.e(this.f5537b, this.f5536a.hashCode() * 31, 31), 31, this.f5538c);
        boolean z12 = this.f5539d;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iD2 + i12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedbackFieldOption(id=");
        sb2.append(this.f5536a);
        sb2.append(", position=");
        sb2.append(this.f5537b);
        sb2.append(", value=");
        sb2.append(this.f5538c);
        sb2.append(", exceptional=");
        return androidx.appcompat.app.r.x(sb2, this.f5539d, ')');
    }
}
