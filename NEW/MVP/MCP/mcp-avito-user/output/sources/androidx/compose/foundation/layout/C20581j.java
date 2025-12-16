package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.C22771k;
import kotlin.Metadata;

/* compiled from: WindowInsets.android.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/j;", "Landroidx/compose/foundation/layout/x2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20581j implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    public final int f28648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f28649c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f28650d = C22126m3.g(C22771k.f44774e);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f28651e = C22126m3.g(Boolean.TRUE);

    public C20581j(int i12, @Y61.k String str) {
        this.f28648b = i12;
        this.f28649c = str;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return e().f44777c;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        return e().f44776b;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        return e().f44778d;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return e().f44775a;
    }

    @Y61.k
    public final C22771k e() {
        return (C22771k) ((C22082i3) this.f28650d).getF42167b();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20581j) {
            return this.f28648b == ((C20581j) obj).f28648b;
        }
        return false;
    }

    public final void f(@Y61.k androidx.core.view.J0 j02, int i12) {
        int i13 = this.f28648b;
        if (i12 == 0 || (i12 & i13) != 0) {
            ((C22082i3) this.f28650d).setValue(j02.e(i13));
            boolean zP2 = j02.p(i13);
            ((C22082i3) this.f28651e).setValue(Boolean.valueOf(zP2));
        }
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF28648b() {
        return this.f28648b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28649c);
        sb2.append('(');
        sb2.append(e().f44775a);
        sb2.append(", ");
        sb2.append(e().f44776b);
        sb2.append(", ");
        sb2.append(e().f44777c);
        sb2.append(", ");
        return androidx.appcompat.app.r.t(sb2, e().f44778d, ')');
    }
}
