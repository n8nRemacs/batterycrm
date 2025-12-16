package androidx.compose.material3;

import androidx.compose.animation.InterfaceC20343e0;
import kotlin.Metadata;

/* compiled from: SearchBar.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Dd extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20343e0, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public Dd() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.animation.InterfaceC20343e0 r7, androidx.compose.runtime.A r8, java.lang.Integer r9) {
        /*
            r6 = this;
            androidx.compose.animation.e0 r7 = (androidx.compose.animation.InterfaceC20343e0) r7
            androidx.compose.runtime.A r8 = (androidx.compose.runtime.A) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            androidx.compose.runtime.q0 r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41068a
            java.lang.Object r7 = r8.o(r7)
            android.content.res.Configuration r7 = (android.content.res.Configuration) r7
            int r7 = r7.screenHeightDp
            float r7 = (float) r7
            androidx.compose.ui.unit.h$a r9 = androidx.compose.ui.unit.h.f42849c
            r9 = 747855826(0x2c935fd2, float:4.1886295E-12)
            r8.I(r9)
            boolean r9 = r8.k(r7)
            java.lang.Object r0 = r8.t()
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            if (r9 != 0) goto L2f
            r1.getClass()
            androidx.compose.runtime.A$a$a r9 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r9) goto L3a
        L2f:
            r9 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r7 = r7 * r9
            androidx.compose.ui.unit.h r0 = androidx.compose.ui.unit.h.a(r7)
            r8.H(r0)
        L3a:
            androidx.compose.ui.unit.h r0 = (androidx.compose.ui.unit.h) r0
            float r7 = r0.f42852b
            r8.O()
            r9 = 747855974(0x2c936066, float:4.1886937E-12)
            r8.I(r9)
            boolean r9 = r8.k(r7)
            java.lang.Object r0 = r8.t()
            if (r9 != 0) goto L58
            r1.getClass()
            androidx.compose.runtime.A$a$a r9 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r9) goto L72
        L58:
            float r9 = androidx.compose.material3.C21498ce.f36162b
            androidx.compose.ui.unit.h r9 = androidx.compose.ui.unit.h.a(r9)
            androidx.compose.ui.unit.h r0 = androidx.compose.ui.unit.h.a(r7)
            int r1 = r9.compareTo(r0)
            if (r1 <= 0) goto L69
            r9 = r0
        L69:
            float r9 = r9.f42852b
            androidx.compose.ui.unit.h r0 = androidx.compose.ui.unit.h.a(r9)
            r8.H(r0)
        L72:
            androidx.compose.ui.unit.h r0 = (androidx.compose.ui.unit.h) r0
            float r9 = r0.f42852b
            r8.O()
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            androidx.compose.ui.v r7 = androidx.compose.foundation.layout.C20588k2.g(r0, r9, r7)
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r8.I(r9)
            androidx.compose.foundation.layout.k r9 = androidx.compose.foundation.layout.C20585k.f28659a
            r9.getClass()
            androidx.compose.foundation.layout.k$l r9 = androidx.compose.foundation.layout.C20585k.f28662d
            androidx.compose.ui.f$a r0 = androidx.compose.ui.InterfaceC22215f.f39074a
            r0.getClass()
            androidx.compose.ui.i$a r0 = androidx.compose.ui.InterfaceC22215f.a.f39088n
            r1 = 0
            androidx.compose.foundation.layout.I r9 = androidx.compose.foundation.layout.H.a(r9, r0, r8, r1)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r8.I(r0)
            int r0 = r8.getF37888Q()
            androidx.compose.runtime.O1 r2 = r8.y()
            androidx.compose.ui.node.h$a r3 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r3.getClass()
            Y41.a<androidx.compose.ui.node.h> r3 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.internal.n r7 = androidx.compose.ui.layout.M.c(r7)
            androidx.compose.runtime.i r4 = r8.F()
            r5 = 0
            if (r4 == 0) goto Lf8
            r8.A()
            boolean r4 = r8.getF37887P()
            if (r4 == 0) goto Lc5
            r8.b(r3)
            goto Lc8
        Lc5:
            r8.d()
        Lc8:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r3 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r3, r8, r9)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r9 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r9, r8, r2)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r9 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r2 = r8.getF37887P()
            if (r2 != 0) goto Le8
            java.lang.Object r2 = r8.t()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto Leb
        Le8:
            androidx.appcompat.app.r.B(r0, r8, r0, r9)
        Leb:
            androidx.compose.runtime.J2 r9 = androidx.compose.runtime.J2.a(r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            androidx.compose.foundation.H.x(r1, r7, r9, r8, r0)
            androidx.compose.foundation.layout.K r7 = androidx.compose.foundation.layout.K.f28344a
            throw r5
        Lf8:
            androidx.compose.runtime.C22190v.b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Dd.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
