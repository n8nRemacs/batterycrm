package androidx.compose.ui.window;

import androidx.compose.runtime.H0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidDialog.android.kt */
@H0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/H;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "<init>", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f43023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f43024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SecureFlagPolicy f43025c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43026d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43027e;

    public H() {
        this(false, false, null, false, false, 31, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h12 = (H) obj;
        return this.f43023a == h12.f43023a && this.f43024b == h12.f43024b && this.f43025c == h12.f43025c && this.f43026d == h12.f43026d && this.f43027e == h12.f43027e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43027e) + androidx.appcompat.app.r.i((this.f43025c.hashCode() + androidx.appcompat.app.r.i(Boolean.hashCode(this.f43023a) * 31, 31, this.f43024b)) * 31, 31, this.f43026d);
    }

    public H(boolean z12, boolean z13, @Y61.k SecureFlagPolicy secureFlagPolicy, boolean z14, boolean z15) {
        this.f43023a = z12;
        this.f43024b = z13;
        this.f43025c = secureFlagPolicy;
        this.f43026d = z14;
        this.f43027e = z15;
    }

    public /* synthetic */ H(boolean z12, boolean z13, SecureFlagPolicy secureFlagPolicy, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) != 0 ? SecureFlagPolicy.f43062b : secureFlagPolicy, (i12 & 8) != 0 ? true : z14, (i12 & 16) != 0 ? true : z15);
    }

    public /* synthetic */ H(boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) != 0 ? true : z14);
    }

    public H(boolean z12, boolean z13, boolean z14) {
        this(z12, z13, SecureFlagPolicy.f43062b, z14, true);
    }

    public /* synthetic */ H(boolean z12, boolean z13, SecureFlagPolicy secureFlagPolicy, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) != 0 ? SecureFlagPolicy.f43062b : secureFlagPolicy);
    }

    @InterfaceC42830m
    public /* synthetic */ H(boolean z12, boolean z13, SecureFlagPolicy secureFlagPolicy) {
        this(z12, z13, secureFlagPolicy, true, true);
    }
}
