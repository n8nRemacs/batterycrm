package com.akita.compose.foundation.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Divider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l v vVar, @Y61.l com.akita.compose.foundation.p pVar, float f12, float f13, @Y61.l A a12, int i12) {
        float f14;
        float f15;
        B bE2 = a12.E(-1031653777);
        if (((i12 | (bE2.B(pVar) ? 32 : 16) | 3456) & 5851) == 1170 && bE2.c()) {
            bE2.f();
            f14 = f12;
            f15 = f13;
        } else {
            float f16 = 1;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f17 = 0;
            v vVarM = f17 == 0.0f ? v.f42878y1 : R1.m(v.f42878y1, f17, 0.0f, 0.0f, 0.0f, 14);
            bE2.C(1088601634);
            androidx.compose.ui.unit.h.f42849c.getClass();
            float f40389c = androidx.compose.ui.unit.h.b(f16, 0.0f) ? 1.0f / ((androidx.compose.ui.unit.d) bE2.o(Q0.f41199h)).getF40389c() : f16;
            bE2.X(false);
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.f(C20588k2.d(vVar.d0(vVarM), 1.0f), f40389c), pVar.c(bE2), Y0.f39346a), bE2, 0);
            f14 = f16;
            f15 = f17;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(vVar, pVar, f14, f15, i12);
        }
    }
}
