package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BasicTooltip.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21439a1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f36009l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f36010m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21439a1(String str, C22096n c22096n) {
        super(2);
        this.f36009l = str;
        this.f36010m = c22096n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r7, java.lang.Integer r8) {
        /*
            r6 = this;
            androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r8 = r8 & 3
            r0 = 2
            if (r8 != r0) goto L19
            boolean r8 = r7.c()
            if (r8 != 0) goto L14
            goto L19
        L14:
            r7.f()
            goto Lcc
        L19:
            androidx.compose.ui.v$a r8 = androidx.compose.ui.v.f42878y1
            r0 = 1706937961(0x65bdce69, float:1.1204186E23)
            r7.I(r0)
            java.lang.String r0 = r6.f36009l
            boolean r1 = r7.B(r0)
            java.lang.Object r2 = r7.t()
            if (r1 != 0) goto L36
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L3e
        L36:
            androidx.compose.material3.Z0 r2 = new androidx.compose.material3.Z0
            r2.<init>(r0)
            r7.H(r2)
        L3e:
            Y41.l r2 = (Y41.l) r2
            r7.O()
            r0 = 0
            androidx.compose.ui.v r8 = androidx.compose.ui.semantics.r.b(r8, r0, r2)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r7.I(r1)
            androidx.compose.ui.f$a r1 = androidx.compose.ui.InterfaceC22215f.f39074a
            r1.getClass()
            androidx.compose.ui.i r1 = androidx.compose.ui.InterfaceC22215f.a.f39076b
            androidx.compose.ui.layout.i0 r1 = androidx.compose.foundation.layout.C20632w.e(r1, r0, r7, r0)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.I(r2)
            int r2 = r7.getF37888Q()
            androidx.compose.runtime.O1 r3 = r7.y()
            androidx.compose.ui.node.h$a r4 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r4.getClass()
            Y41.a<androidx.compose.ui.node.h> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.internal.n r8 = androidx.compose.ui.layout.M.c(r8)
            androidx.compose.runtime.i r5 = r7.F()
            if (r5 == 0) goto Lcf
            r7.A()
            boolean r5 = r7.getF37887P()
            if (r5 == 0) goto L85
            r7.b(r4)
            goto L88
        L85:
            r7.d()
        L88:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r4, r7, r1)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r1, r7, r3)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r3 = r7.getF37887P()
            if (r3 != 0) goto La8
            java.lang.Object r3 = r7.t()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 != 0) goto Lab
        La8:
            androidx.appcompat.app.r.B(r2, r7, r2, r1)
        Lab:
            androidx.compose.runtime.J2 r1 = androidx.compose.runtime.J2.a(r7)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            androidx.compose.foundation.H.x(r0, r8, r1, r7, r2)
            androidx.compose.foundation.layout.z r8 = androidx.compose.foundation.layout.C20644z.f28804a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            androidx.compose.runtime.internal.n r0 = r6.f36010m
            r0.invoke(r7, r8)
            r7.O()
            r7.z()
            r7.O()
            r7.O()
        Lcc:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        Lcf:
            androidx.compose.runtime.C22190v.b()
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21439a1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
