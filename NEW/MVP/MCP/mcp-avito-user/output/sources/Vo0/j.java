package Vo0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SbcFastChipsGroupView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVo0/j;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f17403a;

    public j(int i12) {
        this.f17403a = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f17403a == ((j) obj).f17403a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17403a);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("SbcFastChipsGroupViewConfig(delimiterPaddingDp="), this.f17403a, ')');
    }
}
