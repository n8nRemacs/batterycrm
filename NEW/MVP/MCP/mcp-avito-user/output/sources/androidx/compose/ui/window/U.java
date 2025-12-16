package androidx.compose.ui.window;

import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidPopup.android.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/U;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final int f43066a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f43067b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f43068c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43069d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43070e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f43071f;

    public U(int i12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f43066a = i12;
        this.f43067b = z12;
        this.f43068c = z13;
        this.f43069d = z14;
        this.f43070e = z15;
        this.f43071f = z16;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u12 = (U) obj;
        return this.f43066a == u12.f43066a && this.f43067b == u12.f43067b && this.f43068c == u12.f43068c && this.f43069d == u12.f43069d && this.f43070e == u12.f43070e && this.f43071f == u12.f43071f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43071f) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f43066a * 31, 31, this.f43067b), 31, this.f43068c), 31, this.f43069d), 31, this.f43070e);
    }

    public /* synthetic */ U(int i12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? true : z12, (i13 & 4) != 0 ? true : z13, (i13 & 8) != 0 ? true : z14, (i13 & 16) == 0 ? z15 : true, (i13 & 32) != 0 ? false : z16);
    }

    public U(boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) != 0 ? true : z14, SecureFlagPolicy.f43062b, true, (i12 & 8) != 0 ? true : z15, false);
    }

    public U(boolean z12, boolean z13, boolean z14, SecureFlagPolicy secureFlagPolicy, boolean z15, boolean z16, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) != 0 ? true : z14, (i12 & 8) != 0 ? SecureFlagPolicy.f43062b : secureFlagPolicy, (i12 & 16) != 0 ? true : z15, (i12 & 32) == 0 ? z16 : true, false);
    }

    public /* synthetic */ U(boolean z12, boolean z13, boolean z14, SecureFlagPolicy secureFlagPolicy, boolean z15, boolean z16, boolean z17, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) != 0 ? true : z14, (i12 & 8) != 0 ? SecureFlagPolicy.f43062b : secureFlagPolicy, (i12 & 16) != 0 ? true : z15, (i12 & 32) == 0 ? z16 : true, (i12 & 64) != 0 ? false : z17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public U(boolean z12, boolean z13, boolean z14, @Y61.k SecureFlagPolicy secureFlagPolicy, boolean z15, boolean z16, boolean z17) {
        C22143q0 c22143q0 = C22725l.f43092a;
        int i12 = !z12 ? 262152 : 262144;
        i12 = secureFlagPolicy == SecureFlagPolicy.f43063c ? i12 | 8192 : i12;
        this(z16 ? i12 : i12 | 512, secureFlagPolicy == SecureFlagPolicy.f43062b, z13, z14, z15, z17);
    }
}
