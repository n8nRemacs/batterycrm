package androidx.compose.foundation.layout;

import androidx.compose.material3.Fa;
import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/t2;", "Landroidx/compose/foundation/layout/t1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20623t2 extends AbstractC20622t1 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Fa f28741c;

    public C20623t2(@Y61.k Fa fa2) {
        super(null);
        this.f28741c = fa2;
    }

    @Override // androidx.compose.foundation.layout.AbstractC20622t1
    @Y61.k
    public final InterfaceC20639x2 a(@Y61.k InterfaceC20639x2 interfaceC20639x2) {
        return new C20619s2(this.f28741c, interfaceC20639x2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20623t2) {
            return kotlin.jvm.internal.L.f(((C20623t2) obj).f28741c, this.f28741c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28741c.hashCode();
    }
}
