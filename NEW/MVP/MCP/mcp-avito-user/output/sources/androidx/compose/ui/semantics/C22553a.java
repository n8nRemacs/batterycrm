package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SemanticsProperties.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/a;", "Lkotlin/x;", "", "T", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.semantics.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22553a<T extends InterfaceC43072x<? extends Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f41727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final T f41728b;

    public C22553a(@Y61.l String str, @Y61.l T t12) {
        this.f41727a = str;
        this.f41728b = t12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22553a)) {
            return false;
        }
        C22553a c22553a = (C22553a) obj;
        return L.f(this.f41727a, c22553a.f41727a) && L.f(this.f41728b, c22553a.f41728b);
    }

    public final int hashCode() {
        String str = this.f41727a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t12 = this.f41728b;
        return iHashCode + (t12 != null ? t12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AccessibilityAction(label=" + this.f41727a + ", action=" + this.f41728b + ')';
    }
}
