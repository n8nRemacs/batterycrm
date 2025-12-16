package X51;

import androidx.appcompat.app.r;
import kotlinx.serialization.w;

@w
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18632a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18633b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18634c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18635d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18636e;

    static {
        new l();
    }

    public /* synthetic */ m(int i12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if ((i12 & 1) == 0) {
            this.f18632a = false;
        } else {
            this.f18632a = z12;
        }
        if ((i12 & 2) == 0) {
            this.f18633b = true;
        } else {
            this.f18633b = z13;
        }
        if ((i12 & 4) == 0) {
            this.f18634c = false;
        } else {
            this.f18634c = z14;
        }
        if ((i12 & 8) == 0) {
            this.f18635d = true;
        } else {
            this.f18635d = z15;
        }
        if ((i12 & 16) == 0) {
            this.f18636e = false;
        } else {
            this.f18636e = z16;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f18632a == mVar.f18632a && this.f18633b == mVar.f18633b && this.f18634c == mVar.f18634c && this.f18635d == mVar.f18635d && this.f18636e == mVar.f18636e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z12 = this.f18632a;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = i12 * 31;
        boolean z13 = this.f18633b;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z14 = this.f18634c;
        int i16 = z14;
        if (z14 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z15 = this.f18635d;
        int i18 = z15;
        if (z15 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z16 = this.f18636e;
        return i19 + (z16 ? 1 : z16 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Toggles(sberIDWebViewEnabled=");
        sb2.append(this.f18632a);
        sb2.append(", sberIDOIDC2AppEnabled=");
        sb2.append(this.f18633b);
        sb2.append(", sberIDSessionIdEnabled=");
        sb2.append(this.f18634c);
        sb2.append(", sberIDAppTokenEnabled=");
        sb2.append(this.f18635d);
        sb2.append(", app2appDialogEnabled=");
        return r.s(")", sb2, this.f18636e);
    }

    public m(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f18632a = z12;
        this.f18633b = z13;
        this.f18634c = z14;
        this.f18635d = z15;
        this.f18636e = z16;
    }

    public /* synthetic */ m(boolean z12, int i12) {
        this(false, (i12 & 2) != 0, false, (i12 & 8) != 0, (i12 & 16) != 0 ? false : z12);
    }
}
