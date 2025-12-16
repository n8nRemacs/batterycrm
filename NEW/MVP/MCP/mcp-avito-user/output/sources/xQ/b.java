package XQ;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnSaveState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXQ/b;", "", "_avito_bx-content_konveyor-item_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Bundle f18882a;

    public b(@k Bundle bundle) {
        this.f18882a = bundle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return L.f(this.f18882a, bVar.f18882a);
    }

    public final int hashCode() {
        return this.f18882a.hashCode() + 1974825889;
    }

    @k
    public final String toString() {
        return H.m(new StringBuilder("OnSaveState(key=category_widget_item_state, bundle="), this.f18882a, ')');
    }
}
