package androidx.compose.ui.window;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class z extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L f43129l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f43130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(L l12, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f43129l = l12;
        this.f43130m = interfaceC22204y1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
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
            r0 = r9 & 3
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = r1
        L12:
            r9 = r9 & r3
            boolean r9 = r8.p(r9, r0)
            if (r9 == 0) goto Lbf
            androidx.compose.ui.v$a r9 = androidx.compose.ui.v.f42878y1
            androidx.compose.ui.window.x r0 = androidx.compose.ui.window.x.f43127l
            androidx.compose.ui.v r9 = androidx.compose.ui.semantics.r.b(r9, r1, r0)
            androidx.compose.ui.window.L r0 = r7.f43129l
            boolean r2 = r8.u(r0)
            java.lang.Object r3 = r8.t()
            if (r2 != 0) goto L36
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r2) goto L3e
        L36:
            androidx.compose.ui.window.y r3 = new androidx.compose.ui.window.y
            r3.<init>(r0)
            r8.H(r3)
        L3e:
            Y41.l r3 = (Y41.l) r3
            androidx.compose.ui.v r9 = androidx.compose.ui.layout.E0.a(r9, r3)
            boolean r0 = r0.getCanCalculatePosition()
            if (r0 == 0) goto L4d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L4e
        L4d:
            r0 = 0
        L4e:
            androidx.compose.ui.v r9 = androidx.compose.ui.draw.a.a(r9, r0)
            androidx.compose.runtime.q0 r0 = androidx.compose.ui.window.C22725l.f43092a
            androidx.compose.runtime.y1 r0 = r7.f43130m
            java.lang.Object r0 = r0.getF42167b()
            Y41.p r0 = (Y41.p) r0
            androidx.compose.ui.window.B r2 = androidx.compose.ui.window.B.f43004a
            int r3 = r8.getF37888Q()
            androidx.compose.runtime.O1 r4 = r8.y()
            androidx.compose.ui.v r9 = androidx.compose.ui.n.c(r8, r9)
            androidx.compose.ui.node.h$a r5 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r5.getClass()
            Y41.a<androidx.compose.ui.node.h> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.i r6 = r8.F()
            if (r6 == 0) goto Lba
            r8.A()
            boolean r6 = r8.getF37887P()
            if (r6 == 0) goto L84
            r8.b(r5)
            goto L87
        L84:
            r8.d()
        L87:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r5, r8, r2)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r2, r8, r4)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r4 = r8.getF37887P()
            if (r4 != 0) goto La7
            java.lang.Object r4 = r8.t()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 != 0) goto Laa
        La7:
            androidx.appcompat.app.r.B(r3, r8, r3, r2)
        Laa:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.v, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40793d
            androidx.compose.runtime.R3.b(r2, r8, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r0.invoke(r8, r9)
            r8.z()
            goto Lc2
        Lba:
            androidx.compose.runtime.C22190v.b()
            r8 = 0
            throw r8
        Lbf:
            r8.f()
        Lc2:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.z.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
