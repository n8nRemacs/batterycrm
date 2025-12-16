package androidx.compose.material3;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/bl;", "Landroidx/compose/ui/window/T;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21482bl implements androidx.compose.ui.window.T {
    @Override // androidx.compose.ui.window.T
    public final long a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, @Y61.k LayoutDirection layoutDirection, long j13) {
        int i12;
        int iD2 = sVar.f42869c;
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        int i13 = (int) (j13 >> 32);
        if (iD2 + i13 > ((int) (j12 >> 32)) && (iD2 = (i12 = sVar.f42867a) - i13) < 0) {
            iD2 = ((sVar.d() - i13) / 2) + i12;
        }
        int i14 = sVar.f42868b - ((int) (4294967295L & j13));
        if (i14 < 0) {
            i14 = sVar.f42870d;
        }
        return androidx.compose.ui.unit.r.a(iD2, i14);
    }
}
