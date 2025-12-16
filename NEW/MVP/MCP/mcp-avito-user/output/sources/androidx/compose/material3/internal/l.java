package androidx.compose.material3.internal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f36584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f36585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f36584l = pVar;
        this.f36585m = interfaceC22204y1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r8, java.lang.Integer r9) {
        /*
            r7 = this;
            androidx.compose.runtime.A r8 = (androidx.compose.runtime.A) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r9 = r9 & 3
            r0 = 2
            if (r9 != r0) goto L19
            boolean r9 = r8.c()
            if (r9 != 0) goto L14
            goto L19
        L14:
            r8.f()
            goto Lea
        L19:
            androidx.compose.ui.v$a r9 = androidx.compose.ui.v.f42878y1
            androidx.compose.material3.internal.i r0 = androidx.compose.material3.internal.i.f36581l
            r1 = 0
            androidx.compose.ui.v r9 = androidx.compose.ui.semantics.r.b(r9, r1, r0)
            r0 = -2041182138(0xffffffff86560846, float:-4.0255005E-35)
            r8.I(r0)
            androidx.compose.material3.internal.p r0 = r7.f36584l
            boolean r2 = r8.u(r0)
            java.lang.Object r3 = r8.t()
            if (r2 != 0) goto L3d
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r2) goto L45
        L3d:
            androidx.compose.material3.internal.j r3 = new androidx.compose.material3.internal.j
            r3.<init>(r0)
            r8.H(r3)
        L45:
            Y41.l r3 = (Y41.l) r3
            r8.O()
            androidx.compose.ui.v r9 = androidx.compose.ui.layout.E0.a(r9, r3)
            androidx.compose.runtime.I3 r0 = r0.f36597q
            java.lang.Object r0 = r0.getF42167b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5f
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L60
        L5f:
            r0 = 0
        L60:
            androidx.compose.ui.v r9 = androidx.compose.ui.draw.a.a(r9, r0)
            androidx.compose.material3.internal.k r0 = new androidx.compose.material3.internal.k
            androidx.compose.runtime.y1 r2 = r7.f36585m
            r0.<init>(r2)
            r2 = 1824588059(0x6cc1011b, float:1.8666232E27)
            androidx.compose.runtime.internal.n r0 = androidx.compose.runtime.internal.r.b(r8, r2, r0)
            r2 = 437877758(0x1a197bfe, float:3.173982E-23)
            r8.I(r2)
            androidx.compose.material3.internal.m r2 = androidx.compose.material3.internal.m.f36586a
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r8.I(r3)
            int r3 = r8.getF37888Q()
            androidx.compose.runtime.O1 r4 = r8.y()
            androidx.compose.ui.node.h$a r5 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r5.getClass()
            Y41.a<androidx.compose.ui.node.h> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.internal.n r9 = androidx.compose.ui.layout.M.c(r9)
            androidx.compose.runtime.i r6 = r8.F()
            if (r6 == 0) goto Led
            r8.A()
            boolean r6 = r8.getF37887P()
            if (r6 == 0) goto La6
            r8.b(r5)
            goto La9
        La6:
            r8.d()
        La9:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r5, r8, r2)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r2, r8, r4)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r4 = r8.getF37887P()
            if (r4 != 0) goto Lc9
            java.lang.Object r4 = r8.t()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 != 0) goto Lcc
        Lc9:
            androidx.appcompat.app.r.B(r3, r8, r3, r2)
        Lcc:
            androidx.compose.runtime.J2 r2 = androidx.compose.runtime.J2.a(r8)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            androidx.compose.foundation.H.x(r1, r9, r2, r8, r3)
            r9 = 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.invoke(r8, r9)
            r8.O()
            r8.z()
            r8.O()
            r8.O()
        Lea:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Led:
            androidx.compose.runtime.C22190v.b()
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.l.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
