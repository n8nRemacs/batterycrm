package com.akita.compose.component.time_line;

import Y61.k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.S;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.C;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.time_line.internal.TimeLineItemState;
import com.akita.compose.component.time_line.internal.TimeLineItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLine.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"time-line_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final J3 f63104a = S.d(a.f63105l);

    /* compiled from: TimeLine.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/time_line/j;", "invoke", "()Lcom/akita/compose/component/time_line/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<j> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f63105l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            throw new IllegalStateException("Default style is not implemented");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.akita.compose.component.time_line.g r19, @Y61.l androidx.compose.ui.v r20, @Y61.l com.akita.compose.component.time_line.j r21, @Y61.k Y41.l r22, @Y61.l androidx.compose.runtime.A r23, int r24) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.time_line.b.a(com.akita.compose.component.time_line.g, androidx.compose.ui.v, com.akita.compose.component.time_line.j, Y41.l, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(int i12, j jVar, g gVar, A a12, int i13) {
        B bE2 = a12.E(-1932070068);
        v.a aVar = v.f42878y1;
        v vVarB = C.b(aVar, TimeLineItemType.f63143d);
        float f12 = 2;
        float f13 = jVar.f63156g / f12;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        float f14 = jVar.f63154e;
        v vVarF = C20588k2.f(C20588k2.d(R1.m(vVarB, 0.0f, f13 - (f14 / f12), 0.0f, 0.0f, 13), 1.0f), f14);
        C22061e3 c22061e3 = (C22061e3) gVar.f63123b;
        C20632w.a(androidx.compose.foundation.A.b(vVarF, ((i12 < c22061e3.e() ? TimeLineItemState.f63136b : i12 == c22061e3.e() ? TimeLineItemState.f63137c : TimeLineItemState.f63138d) != TimeLineItemState.f63138d ? jVar.f63150a : jVar.f63151b).c(bE2), Y0.f39346a), bE2, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(i12, jVar, gVar, aVar, i13);
        }
    }
}
