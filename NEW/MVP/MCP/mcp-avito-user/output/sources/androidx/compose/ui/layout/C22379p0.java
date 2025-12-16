package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LayoutInfo.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/p0;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22379p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.v f40515a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A f40516b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Object f40517c;

    public C22379p0(androidx.compose.ui.v vVar, A a12, Object obj, int i12, C42822w c42822w) {
        obj = (i12 & 4) != 0 ? null : obj;
        this.f40515a = vVar;
        this.f40516b = a12;
        this.f40517c = obj;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModifierInfo(");
        sb2.append(this.f40515a);
        sb2.append(", ");
        sb2.append(this.f40516b);
        sb2.append(", ");
        return androidx.compose.foundation.H.n(sb2, this.f40517c, ')');
    }
}
