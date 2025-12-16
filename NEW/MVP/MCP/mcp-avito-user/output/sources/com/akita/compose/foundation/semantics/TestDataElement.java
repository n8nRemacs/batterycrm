package com.akita.compose.foundation.semantics;

import Y61.k;
import Y61.l;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TestData.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/foundation/semantics/TestDataElement;", "Landroidx/compose/ui/node/p0;", "Lcom/akita/compose/foundation/semantics/b;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class TestDataElement extends AbstractC22430p0<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f63655b;

    public TestDataElement(@k Object obj) {
        this.f63655b = obj;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        b bVar = new b();
        bVar.f63658p = this.f63655b;
        return bVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((b) dVar).f63658p = this.f63655b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (TestDataElement.class.equals(obj != null ? obj.getClass() : null)) {
            return L.f(this.f63655b, ((TestDataElement) obj).f63655b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63655b.hashCode();
    }
}
