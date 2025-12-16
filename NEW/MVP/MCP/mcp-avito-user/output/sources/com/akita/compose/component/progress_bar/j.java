package com.akita.compose.component.progress_bar;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProgressBar.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"progress-bar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.a aVar, @Y61.k k kVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(95393511);
        int i13 = (bE2.u(aVar) ? 4 : 2) | i12 | (bE2.B(kVar) ? 32 : 16);
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            d(aVar, kVar.f62403a.c(bE2), kVar.f62404b.c(bE2), C20588k2.f(vVar, kVar.f62405c), kVar.f62408f, kVar.f62407e, kVar.f62406d, bE2, i13 & 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, kVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k List list, @Y61.k k kVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1863566925);
        c(list, C20588k2.f(vVar, kVar.f62405c), kVar.f62408f, kVar.f62407e, bE2, 8);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(list, kVar, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.util.List r9, androidx.compose.ui.v r10, float r11, float r12, androidx.compose.runtime.A r13, int r14) {
        /*
            r0 = -679335864(0xffffffffd7822848, float:-2.8621904E14)
            androidx.compose.runtime.B r13 = r13.E(r0)
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.akita.compose.component.progress_bar.m r1 = (com.akita.compose.component.progress_bar.m) r1
            float r1 = r1.f62409a
            float r3 = r3 + r1
            goto L10
        L20:
            androidx.compose.runtime.J3 r0 = androidx.compose.ui.platform.Q0.f41199h
            java.lang.Object r0 = r13.o(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.ui.unit.d) r0
            float r7 = r0.M0(r11)
            r0 = 1204608972(0x47ccdfcc, float:104895.59)
            r13.C(r0)
            boolean r0 = r13.k(r11)
            r1 = 0
            java.lang.Object r2 = r13.t()
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            if (r0 != 0) goto L46
            r4.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r0) goto L4e
        L46:
            com.akita.compose.component.progress_bar.a r2 = new com.akita.compose.component.progress_bar.a
            r2.<init>(r7)
            r13.H(r2)
        L4e:
            r6 = r2
            com.akita.compose.component.progress_bar.a r6 = (com.akita.compose.component.progress_bar.a) r6
            r13.X(r1)
            r0 = 1204611280(0x47cce8d0, float:104913.625)
            r13.C(r0)
            boolean r0 = r13.k(r11)
            java.lang.Object r2 = r13.t()
            if (r0 != 0) goto L6b
            r4.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r0) goto L72
        L6b:
            androidx.compose.foundation.shape.n r2 = androidx.compose.foundation.shape.o.a(r11)
            r13.H(r2)
        L72:
            androidx.compose.foundation.shape.n r2 = (androidx.compose.foundation.shape.n) r2
            r13.X(r1)
            androidx.compose.ui.v r0 = androidx.compose.ui.draw.k.a(r10, r2)
            com.akita.compose.component.progress_bar.d r8 = new com.akita.compose.component.progress_bar.d
            r2 = r8
            r4 = r12
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            androidx.compose.foundation.C20835r0.a(r1, r8, r13, r0)
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto L99
            com.akita.compose.component.progress_bar.e r6 = new com.akita.compose.component.progress_bar.e
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r13.f38184d = r6
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.progress_bar.j.c(java.util.List, androidx.compose.ui.v, float, float, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(Y41.a r23, long r24, long r26, androidx.compose.ui.v r28, float r29, float r30, float r31, androidx.compose.runtime.A r32, int r33) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.progress_bar.j.d(Y41.a, long, long, androidx.compose.ui.v, float, float, float, androidx.compose.runtime.A, int):void");
    }
}
