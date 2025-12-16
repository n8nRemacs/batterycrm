package com.akita.compose.component.accordion;

import androidx.compose.animation.core.C20283h;
import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.S;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AccordionArrowIcon.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"accordion_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22293d f60180a;

    static {
        float f12 = 18;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        C22293d.a aVar2 = new C22293d.a(null, f12, f12, 18.0f, 18.0f, 0L, 0, false, JfifUtil.MARKER_APP1, null);
        C22295f c22295f = new C22295f();
        c22295f.j(1.8f, 5.85f);
        c22295f.h(9.0f, 12.15f);
        c22295f.h(16.2f, 5.85f);
        C22293d.a.c(aVar2, c22295f.f39885a, 0, null, 0.0f, new k1(V.d(4278190080L), null), 0.0f, 3.24f, 0, 0, 0.0f, 16222);
        f60180a = aVar2.d();
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(boolean z12, @Y61.k t tVar, @Y61.l v.a aVar, boolean z13, @Y61.l A a12, int i12) {
        B bE2 = a12.E(605872196);
        if ((((bE2.j(z12) ? 4 : 2) | i12 | (bE2.B(tVar) ? 32 : 16) | 384 | (bE2.j(z13) ? 2048 : 1024)) & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            S.a(com.akita.compose.foundation.d.f63579a.b(tVar.f60265a.f63644a), androidx.compose.runtime.internal.r.c(902550404, new c(aVar, C20283h.b(z13 ? 0.0f : 1.0f, C20310q.e(tVar.f60272h, 0, tVar.f60273i, 2), "ArrowAlpha", bE2, 3072, 20), tVar, z12), bE2), bE2, 56);
        }
        v.a aVar2 = aVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(z12, tVar, aVar2, z13, i12);
        }
    }
}
