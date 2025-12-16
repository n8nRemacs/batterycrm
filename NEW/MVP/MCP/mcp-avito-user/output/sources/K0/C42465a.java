package k0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ComposableMethod.jvm.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk0/a;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C42465a {
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42465a)) {
            return false;
        }
        ((C42465a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + r.e(0, r.e(0, Boolean.hashCode(false) * 31, 31), 31);
    }

    @k
    public final String toString() {
        return "ComposableInfo(isComposable=false, realParamsCount=0, changedParams=0, defaultParams=0)";
    }
}
