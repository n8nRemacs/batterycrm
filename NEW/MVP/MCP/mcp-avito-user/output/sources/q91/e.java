package Q91;

import androidx.appcompat.app.r;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13580a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13581b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13582c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13583d;

    public /* synthetic */ e() {
        this(-1, -1, -1, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13580a == eVar.f13580a && this.f13581b == eVar.f13581b && this.f13582c == eVar.f13582c && this.f13583d == eVar.f13583d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13583d) + r.e(this.f13582c, r.e(this.f13581b, Boolean.hashCode(this.f13580a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiState(isFrameVertical=");
        sb2.append(this.f13580a);
        sb2.append(", title=");
        sb2.append(this.f13581b);
        sb2.append(", recommendations=");
        sb2.append(this.f13582c);
        sb2.append(", fullRecommendations=");
        return r.t(sb2, this.f13583d, ')');
    }

    public e(int i12, int i13, int i14, boolean z12) {
        this.f13580a = z12;
        this.f13581b = i12;
        this.f13582c = i13;
        this.f13583d = i14;
    }
}
