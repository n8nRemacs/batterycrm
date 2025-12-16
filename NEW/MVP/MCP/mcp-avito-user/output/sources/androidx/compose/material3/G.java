package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: AndroidAlertDialog.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class G extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f34764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f34765m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(androidx.compose.ui.v vVar, C22096n c22096n) {
        super(2);
        this.f34764l = vVar;
        this.f34765m = c22096n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
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
            goto Le8
        L19:
            int r8 = androidx.compose.material3.Ng.f35206b
            r8 = 2131954790(0x7f130c66, float:1.954609E38)
            java.lang.String r8 = androidx.compose.material3.Og.a(r7, r8)
            float r1 = androidx.compose.material3.C21666k.f36690a
            float r3 = androidx.compose.material3.C21666k.f36691b
            androidx.compose.ui.v r0 = r6.f34764l
            r5 = 10
            r2 = 0
            r4 = 0
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.s(r0, r1, r2, r3, r4, r5)
            androidx.compose.ui.v$a r1 = androidx.compose.ui.v.f42878y1
            r2 = -874813489(0xffffffffcbdb67cf, float:-2.8757918E7)
            r7.I(r2)
            boolean r2 = r7.B(r8)
            java.lang.Object r3 = r7.t()
            if (r2 != 0) goto L4b
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r2) goto L53
        L4b:
            androidx.compose.material3.F r3 = new androidx.compose.material3.F
            r3.<init>(r8)
            r7.H(r3)
        L53:
            Y41.l r3 = (Y41.l) r3
            r7.O()
            r8 = 0
            androidx.compose.ui.v r1 = androidx.compose.ui.semantics.r.b(r1, r8, r3)
            androidx.compose.ui.v r0 = r0.d0(r1)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r7.I(r1)
            androidx.compose.ui.f$a r1 = androidx.compose.ui.InterfaceC22215f.f39074a
            r1.getClass()
            androidx.compose.ui.i r1 = androidx.compose.ui.InterfaceC22215f.a.f39076b
            r2 = 48
            r3 = 1
            androidx.compose.ui.layout.i0 r1 = androidx.compose.foundation.layout.C20632w.e(r1, r3, r7, r2)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.I(r2)
            int r2 = r7.getF37888Q()
            androidx.compose.runtime.O1 r3 = r7.y()
            androidx.compose.ui.node.h$a r4 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r4.getClass()
            Y41.a<androidx.compose.ui.node.h> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.internal.n r0 = androidx.compose.ui.layout.M.c(r0)
            androidx.compose.runtime.i r5 = r7.F()
            if (r5 == 0) goto Leb
            r7.A()
            boolean r5 = r7.getF37887P()
            if (r5 == 0) goto La1
            r7.b(r4)
            goto La4
        La1:
            r7.d()
        La4:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r4, r7, r1)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r1, r7, r3)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r3 = r7.getF37887P()
            if (r3 != 0) goto Lc4
            java.lang.Object r3 = r7.t()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 != 0) goto Lc7
        Lc4:
            androidx.appcompat.app.r.B(r2, r7, r2, r1)
        Lc7:
            androidx.compose.runtime.J2 r1 = androidx.compose.runtime.J2.a(r7)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            androidx.compose.foundation.H.x(r8, r0, r1, r7, r2)
            androidx.compose.foundation.layout.z r0 = androidx.compose.foundation.layout.C20644z.f28804a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            androidx.compose.runtime.internal.n r0 = r6.f34765m
            r0.invoke(r7, r8)
            r7.O()
            r7.z()
            r7.O()
            r7.O()
        Le8:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        Leb:
            androidx.compose.runtime.C22190v.b()
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.G.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
