package androidx.view.viewmodel.compose;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.saveable.x;
import androidx.view.C23060r0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: SavedStateHandleSaver.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class g implements x, D {
    @Override // androidx.compose.runtime.saveable.x
    public final boolean a(@l Object obj) {
        throw null;
    }

    public final boolean equals(@l Object obj) {
        if ((obj instanceof x) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new H(1, null, C23060r0.a.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
