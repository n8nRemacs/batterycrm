package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@InterfaceC21537e7
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/N9;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N9 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SecureFlagPolicy f35178a;

    public N9(@Y61.k SecureFlagPolicy secureFlagPolicy) {
        this.f35178a = secureFlagPolicy;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N9) {
            return this.f35178a == ((N9) obj).f35178a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + androidx.appcompat.app.r.i(this.f35178a.hashCode() * 31, 31, true);
    }
}
