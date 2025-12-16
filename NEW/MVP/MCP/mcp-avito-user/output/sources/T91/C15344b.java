package T91;

import kotlin.jvm.internal.L;

/* renamed from: T91.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15344b {

    /* renamed from: a, reason: collision with root package name */
    public final String f15440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15441b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15442c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15443d;

    public /* synthetic */ C15344b() {
        this(null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15344b)) {
            return false;
        }
        C15344b c15344b = (C15344b) obj;
        return L.f(this.f15440a, c15344b.f15440a) && L.f(this.f15441b, c15344b.f15441b) && this.f15442c == c15344b.f15442c && this.f15443d == c15344b.f15443d;
    }

    public final int hashCode() {
        int iHashCode = this.f15440a.hashCode() * 31;
        String str = this.f15441b;
        return Boolean.hashCode(this.f15443d) + androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15442c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextFieldData(key=");
        sb2.append(this.f15440a);
        sb2.append(", value=");
        sb2.append(this.f15441b);
        sb2.append(", enabled=");
        sb2.append(this.f15442c);
        sb2.append(", error=");
        return androidx.appcompat.app.r.x(sb2, this.f15443d, ')');
    }

    public C15344b(String str, boolean z12, boolean z13) {
        this.f15440a = "INN";
        this.f15441b = str;
        this.f15442c = z12;
        this.f15443d = z13;
    }
}
