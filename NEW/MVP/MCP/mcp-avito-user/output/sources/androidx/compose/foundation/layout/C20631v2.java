package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/v2;", "Landroidx/compose/foundation/layout/x2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20631v2 implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f28761b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f28762c;

    public C20631v2(@Y61.k C20638x1 c20638x1, @Y61.k String str) {
        this.f28761b = str;
        this.f28762c = C22126m3.g(c20638x1);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return e().f28798c;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        return e().f28797b;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        return e().f28799d;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return e().f28796a;
    }

    @Y61.k
    public final C20638x1 e() {
        return (C20638x1) ((C22082i3) this.f28762c).getF42167b();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20631v2) {
            return kotlin.jvm.internal.L.f(e(), ((C20631v2) obj).e());
        }
        return false;
    }

    public final void f(@Y61.k C20638x1 c20638x1) {
        ((C22082i3) this.f28762c).setValue(c20638x1);
    }

    public final int hashCode() {
        return this.f28761b.hashCode();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28761b);
        sb2.append("(left=");
        sb2.append(e().f28796a);
        sb2.append(", top=");
        sb2.append(e().f28797b);
        sb2.append(", right=");
        sb2.append(e().f28798c);
        sb2.append(", bottom=");
        return androidx.appcompat.app.r.t(sb2, e().f28799d, ')');
    }
}
