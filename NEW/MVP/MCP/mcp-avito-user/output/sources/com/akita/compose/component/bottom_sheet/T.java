package com.akita.compose.component.bottom_sheet;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DragHandle.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bottom-sheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class T {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.l O o12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1144091035);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (((i13 | 16) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                o12 = (O) bE2.o(P.f60549a);
            } else {
                bE2.f();
            }
            bE2.Y();
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.q(vVar, o12.f60544f, o12.f60545g), o12.f60543e.c(bE2), o12.f60546h), bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new S(vVar, o12, i12);
        }
    }
}
