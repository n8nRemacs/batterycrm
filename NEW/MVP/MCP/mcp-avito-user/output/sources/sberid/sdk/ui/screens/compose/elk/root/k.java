package sberid.sdk.ui.screens.compose.elk.root;

import androidx.fragment.app.ActivityC22955m;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class k implements q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC40658b f437823a;

    /* renamed from: b, reason: collision with root package name */
    public final C40657a f437824b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityC22955m f437825c;

    public k(InterfaceC40658b interfaceC40658b, C40657a c40657a, ActivityC22955m activityC22955m) {
        this.f437823a = interfaceC40658b;
        this.f437824b = c40657a;
        this.f437825c = activityC22955m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f437823a, kVar.f437823a) && L.f(this.f437824b, kVar.f437824b) && L.f(this.f437825c, kVar.f437825c);
    }

    public final int hashCode() {
        int iHashCode = this.f437823a.hashCode() * 31;
        C40657a c40657a = this.f437824b;
        return this.f437825c.hashCode() + ((iHashCode + (c40657a == null ? 0 : c40657a.hashCode())) * 31);
    }

    public final String toString() {
        return "AnyClick(elkData=" + this.f437823a + ", click=" + this.f437824b + ", activity=" + this.f437825c + ")";
    }
}
