package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: TextMessageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(C22602e c22602e, Y41.l lVar, Y41.l lVar2, v.a aVar, A a12, int i12) {
        int i13;
        B b12;
        v.a aVar2;
        B bE2 = a12.E(-1006735601);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c22602e) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar2) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            b12 = bE2;
        } else {
            v.a aVar3 = v.f42878y1;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            v vVarM = R1.m(aVar3, 0.0f, 0.0f, 0.0f, 2, 7);
            bE2.C(708374969);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63944n.c(bE2);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            float f12 = 4;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(dVar.M0(f12)) << 32) | (Float.floatToRawIntBits(dVar.M0(f12)) & 4294967295L);
            C43522a.C11768a c11768a = C43522a.f413378b;
            b bVar = new b(jC2, jFloatToRawIntBits, null);
            bE2.C(708389332);
            int i15 = i14 & 14;
            boolean z12 = ((i14 & 896) == 256) | (i15 == 4);
            Object objT2 = bE2.t();
            if (z12 || objT2 == c1651a) {
                objT2 = new f(lVar2, c22602e);
                bE2.H(objT2);
            }
            Y41.a aVar5 = (Y41.a) objT2;
            bE2.X(false);
            bE2.C(708386320);
            boolean z13 = ((i14 & 112) == 32) | (i15 == 4);
            Object objT3 = bE2.t();
            if (z13 || objT3 == c1651a) {
                objT3 = new g(lVar, c22602e);
                bE2.H(objT3);
            }
            bE2.X(false);
            b12 = bE2;
            com.akita.compose.foundation.ui.p.a(c22602e, com.akita.compose.theme.re23.b.f63988f.f65240k, C21086w0.e(vVarM, mVar, bVar, aVar5, (Y41.a) objT3, 444), false, 0L, null, 0, 0, false, null, bE2, i15 | 3072, 1008);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(c22602e, lVar, lVar2, aVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.text.C22602e r18, androidx.compose.ui.v.a r19, Y41.a r20, androidx.compose.runtime.A r21, int r22) {
        /*
            r12 = r18
            r13 = r20
            r14 = r22
            r0 = -1664493400(0xffffffff9cc9d8a8, float:-1.3357069E-21)
            r1 = r21
            androidx.compose.runtime.B r15 = r1.E(r0)
            r0 = r14 & 14
            if (r0 != 0) goto L1e
            boolean r0 = r15.B(r12)
            if (r0 == 0) goto L1b
            r0 = 4
            goto L1c
        L1b:
            r0 = 2
        L1c:
            r0 = r0 | r14
            goto L1f
        L1e:
            r0 = r14
        L1f:
            r0 = r0 | 48
            r1 = r14 & 896(0x380, float:1.256E-42)
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L32
            boolean r1 = r15.u(r13)
            if (r1 == 0) goto L2f
            r1 = r2
            goto L31
        L2f:
            r1 = 128(0x80, float:1.8E-43)
        L31:
            r0 = r0 | r1
        L32:
            r1 = r0 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r1 != r3) goto L46
            boolean r1 = r15.c()
            if (r1 != 0) goto L3f
            goto L46
        L3f:
            r15.f()
            r0 = r19
            goto Lb2
        L46:
            androidx.compose.ui.v$a r11 = androidx.compose.ui.v.f42878y1
            androidx.compose.runtime.J3 r1 = androidx.compose.ui.platform.Q0.f41209r
            java.lang.Object r1 = r15.o(r1)
            androidx.compose.ui.platform.r2 r1 = (androidx.compose.ui.platform.InterfaceC22520r2) r1
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.j r3 = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.j
            r3.<init>(r12, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r4 = androidx.compose.foundation.layout.C20588k2.d(r11, r1)
            com.akita.compose.theme.re23.b r1 = com.akita.compose.theme.re23.b.f63983a
            r1.getClass()
            com.akita.compose.theme.re23.i r1 = com.akita.compose.theme.re23.b.f63988f
            com.akita.compose.foundation.r r1 = r1.f65240k
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            androidx.compose.ui.text.x0 r6 = r1.d(r6, r15)
            r1 = 1909423038(0x71cf7bbe, float:2.0548157E30)
            r15.C(r1)
            r1 = r0 & 896(0x380, float:1.256E-42)
            if (r1 != r2) goto L77
            r1 = 1
            goto L78
        L77:
            r1 = r5
        L78:
            java.lang.Object r2 = r15.t()
            if (r1 != 0) goto L87
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L8f
        L87:
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.k r2 = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.k
            r2.<init>(r13)
            r15.H(r2)
        L8f:
            r8 = r2
            Y41.l r8 = (Y41.l) r8
            r15.X(r5)
            r10 = r0 & 14
            r7 = 0
            r9 = 0
            r5 = 0
            r16 = 0
            r17 = 240(0xf0, float:3.36E-43)
            r0 = r18
            r1 = r3
            r2 = r4
            r3 = r6
            r4 = r5
            r5 = r16
            r6 = r7
            r7 = r9
            r9 = r15
            r16 = r11
            r11 = r17
            com.akita.compose.foundation.ui.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
        Lb2:
            androidx.compose.runtime.c2 r1 = r15.Z()
            if (r1 == 0) goto Lbf
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.l r2 = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.l
            r2.<init>(r12, r0, r13, r14)
            r1.f38184d = r2
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.p.b(androidx.compose.ui.text.e, androidx.compose.ui.v$a, Y41.a, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k java.lang.String r16, @Y61.k java.util.List r17, @Y61.k Y41.l r18, @Y61.k Y41.l r19, @Y61.l Y41.a r20, boolean r21, @Y61.l androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.p.c(java.lang.String, java.util.List, Y41.l, Y41.l, Y41.a, boolean, androidx.compose.runtime.A, int):void");
    }
}
