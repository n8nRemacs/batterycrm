package com.avito.beduin.v2.component.lazy_row.compose;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import com.avito.beduin.v2.component.lazy_row.state.a;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LazyRowComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "params", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<m, n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20793y f336048l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a.C10413a.C10414a f336049m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f336050n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f336051o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC20793y interfaceC20793y, a.C10413a.C10414a c10414a, boolean z12, boolean z13) {
        super(1);
        this.f336048l = interfaceC20793y;
        this.f336049m = c10414a;
        this.f336050n = z12;
        this.f336051o = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[PHI: r0
  0x005e: PHI (r0v17 androidx.compose.ui.v) = (r0v11 androidx.compose.ui.v), (r0v13 androidx.compose.ui.v), (r0v15 androidx.compose.ui.v) binds: [B:20:0x005c, B:29:0x0077, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.render.compose.n invoke(com.avito.beduin.v2.render.compose.m r11) {
        /*
            r10 = this;
            com.avito.beduin.v2.render.compose.m r11 = (com.avito.beduin.v2.render.compose.m) r11
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            com.avito.beduin.v2.component.lazy_row.state.a$a$a r1 = r10.f336049m
            ET0.b r2 = r1.f336083c
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
            boolean r2 = r11.f338088a
            r3 = -1
            r4 = -2
            r5 = 3
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L2e
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
        L2c:
            r2 = r8
            goto L5a
        L2e:
            int r2 = r1.f336081a
            if (r2 == r4) goto L53
            if (r2 == r3) goto L3e
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            float r2 = (float) r2
            androidx.compose.ui.unit.h$a r9 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.t(r0, r2)
            goto L2c
        L3e:
            boolean r2 = r10.f336050n
            if (r2 == 0) goto L4a
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.y(r0, r7, r5)
        L48:
            r2 = r6
            goto L5a
        L4a:
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            androidx.compose.foundation.lazy.y r2 = r10.f336048l
            androidx.compose.ui.v r0 = r2.c(r0)
            goto L2c
        L53:
            androidx.compose.ui.v r0 = (androidx.compose.ui.v) r0
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.y(r0, r7, r5)
            goto L48
        L5a:
            boolean r11 = r11.f338089b
            if (r11 == 0) goto L60
        L5e:
            r6 = r8
            goto L82
        L60:
            int r11 = r1.f336082b
            if (r11 == r4) goto L7e
            if (r11 == r3) goto L6e
            float r11 = (float) r11
            androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.f(r0, r11)
            goto L5e
        L6e:
            boolean r11 = r10.f336051o
            if (r11 == 0) goto L77
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.w(r0, r7, r5)
            goto L82
        L77:
            androidx.compose.foundation.layout.FillElement r11 = androidx.compose.foundation.layout.C20588k2.f28681b
            androidx.compose.ui.v r0 = r0.d0(r11)
            goto L5e
        L7e:
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.w(r0, r7, r5)
        L82:
            com.avito.beduin.v2.render.compose.n r11 = new com.avito.beduin.v2.render.compose.n
            r11.<init>(r0, r6, r2, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.lazy_row.compose.f.invoke(java.lang.Object):java.lang.Object");
    }
}
