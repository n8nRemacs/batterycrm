package androidx.compose.material3;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/al;", "Landroidx/compose/ui/window/T;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.al, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21459al implements androidx.compose.ui.window.T {
    @Override // androidx.compose.ui.window.T
    public final long a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, @Y61.k LayoutDirection layoutDirection, long j13) {
        int i12 = sVar.f42867a;
        int iD2 = sVar.d();
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        int iF2 = androidx.appcompat.app.r.f(iD2, (int) (j13 >> 32), 2, i12);
        int i13 = (sVar.f42868b - ((int) (4294967295L & j13))) + 0;
        if (i13 < 0) {
            i13 = sVar.f42870d + 0;
        }
        return androidx.compose.ui.unit.r.a(iF2, i13);
    }
}
