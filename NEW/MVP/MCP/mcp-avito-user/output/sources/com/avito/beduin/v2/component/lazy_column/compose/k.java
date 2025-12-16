package com.avito.beduin.v2.component.lazy_column.compose;

import androidx.compose.foundation.layout.InterfaceC20611q1;
import com.avito.beduin.v2.component.flexlayout.state.b;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FlexRowComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "params", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20611q1 f335932l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b.a.C10393a f335933m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f335934n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f335935o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f335936p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC20611q1 interfaceC20611q1, b.a.C10393a c10393a, boolean z12, boolean z13, boolean z14) {
        super(1);
        this.f335932l = interfaceC20611q1;
        this.f335933m = c10393a;
        this.f335934n = z12;
        this.f335935o = z13;
        this.f335936p = z14;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[PHI: r0
  0x0077: PHI (r0v21 androidx.compose.ui.v) = 
  (r0v15 androidx.compose.ui.v)
  (r0v17 androidx.compose.ui.v)
  (r0v18 androidx.compose.ui.v)
  (r0v19 androidx.compose.ui.v)
 binds: [B:24:0x0075, B:33:0x0090, B:32:0x008b, B:29:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.render.compose.n invoke(com.avito.beduin.v2.render.compose.m r13) {
        /*
            r12 = this;
            com.avito.beduin.v2.render.compose.m r13 = (com.avito.beduin.v2.render.compose.m) r13
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            com.avito.beduin.v2.component.flexlayout.state.b$a$a r1 = r12.f335933m
            ET0.b r2 = r1.f335748c
            if (r2 == 0) goto L20
            int r3 = r2.f4016a
            float r3 = (float) r3
            androidx.compose.ui.unit.h$a r4 = androidx.compose.ui.unit.h.f42849c
            int r4 = r2.f4017b
            float r4 = (float) r4
            int r5 = r2.f4019d
            float r5 = (float) r5
            int r2 = r2.f4018c
            float r2 = (float) r2
            androidx.compose.foundation.layout.V1 r2 = androidx.compose.foundation.layout.R1.d(r3, r5, r4, r2)
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.R1.h(r0, r2)
        L20:
            boolean r2 = r13.f338088a
            r3 = 1
            androidx.compose.foundation.layout.q1 r4 = r12.f335932l
            r5 = -1
            r6 = -2
            r7 = 3
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L30
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
        L2e:
            r2 = r9
            goto L73
        L30:
            float r2 = r1.f335749d
            r10 = 0
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            boolean r11 = r12.f335935o
            if (r10 <= 0) goto L4a
            if (r11 == 0) goto L43
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.y(r0, r8, r7)
        L41:
            r2 = r3
            goto L73
        L43:
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            androidx.compose.ui.v r0 = r4.a(r0, r2, r3)
            goto L2e
        L4a:
            int r2 = r1.f335746a
            if (r2 == r6) goto L6c
            if (r2 == r5) goto L5a
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            float r2 = (float) r2
            androidx.compose.ui.unit.h$a r10 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.t(r0, r2)
            goto L2e
        L5a:
            if (r11 == 0) goto L63
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.y(r0, r8, r7)
            goto L41
        L63:
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.d(r0, r2)
            goto L2e
        L6c:
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.y(r0, r8, r7)
            goto L41
        L73:
            boolean r13 = r13.f338089b
            if (r13 == 0) goto L79
        L77:
            r3 = r9
            goto L9b
        L79:
            int r13 = r1.f335747b
            if (r13 == r6) goto L97
            if (r13 == r5) goto L87
            float r13 = (float) r13
            androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.f(r0, r13)
            goto L77
        L87:
            boolean r13 = r12.f335934n
            if (r13 == 0) goto L90
            androidx.compose.ui.v r0 = r4.b(r0)
            goto L77
        L90:
            androidx.compose.foundation.layout.FillElement r13 = androidx.compose.foundation.layout.C20588k2.f28681b
            androidx.compose.ui.v r0 = r0.d0(r13)
            goto L77
        L97:
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.w(r0, r8, r7)
        L9b:
            com.avito.beduin.v2.render.compose.n r13 = new com.avito.beduin.v2.render.compose.n
            boolean r1 = r12.f335936p
            r13.<init>(r0, r3, r2, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.lazy_column.compose.k.invoke(java.lang.Object):java.lang.Object");
    }
}
