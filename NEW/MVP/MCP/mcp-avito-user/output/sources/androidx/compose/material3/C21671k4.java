package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/k4;", "Landroidx/compose/material3/j4;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21671k4 implements InterfaceC21648j4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f36713a = new LinkedHashMap();

    @Override // androidx.compose.material3.InterfaceC21648j4
    @Y61.l
    public final String a(@Y61.l Long l12, @Y61.k Locale locale) {
        return C21761o2.a(l12.longValue(), "yMMMM", locale, this.f36713a);
    }

    @Override // androidx.compose.material3.InterfaceC21648j4
    @Y61.l
    public final String b(@Y61.l Long l12, @Y61.k Locale locale, boolean z12) {
        if (l12 == null) {
            return null;
        }
        return C21761o2.a(l12.longValue(), z12 ? "yMMMMEEEEd" : "yMMMd", locale, this.f36713a);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof C21671k4)) {
            return false;
        }
        ((C21671k4) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 436998964;
    }
}
