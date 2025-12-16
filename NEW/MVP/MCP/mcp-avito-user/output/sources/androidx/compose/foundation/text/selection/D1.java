package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextSelectionColors.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/D1;", "", "Landroidx/compose/ui/graphics/T;", "handleColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f31834a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31835b;

    public D1(long j12, long j13, C42822w c42822w) {
        this.f31834a = j12;
        this.f31835b = j13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d12 = (D1) obj;
        return androidx.compose.ui.graphics.T.d(this.f31834a, d12.f31834a) && androidx.compose.ui.graphics.T.d(this.f31835b, d12.f31835b);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f31835b) + (Long.hashCode(this.f31834a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        androidx.compose.foundation.H.z(this.f31834a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) androidx.compose.ui.graphics.T.j(this.f31835b));
        sb2.append(')');
        return sb2.toString();
    }
}
