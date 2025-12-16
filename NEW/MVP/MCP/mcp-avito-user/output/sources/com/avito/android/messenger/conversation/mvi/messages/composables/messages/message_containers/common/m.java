package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: NonOutgoingMessage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final float f192379a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final v f192380b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final v f192381c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final v f192382d;

    static {
        float f12 = 32;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 8;
        float f14 = 58;
        f192379a = f14;
        float f15 = 16;
        v.a aVar2 = v.f42878y1;
        f192380b = R1.m(aVar2, f12 + f13 + f15, 0.0f, f14 + f15, 4, 2);
        f192381c = C20588k2.o(androidx.compose.ui.draw.k.a(R1.m(aVar2, 0.0f, 0.0f, f13, 0.0f, 11), o.f30153a), f12);
        f192382d = C20588k2.v(f14, 0.0f, 2, aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01e5 A[PHI: r2 r10
  0x01e5: PHI (r2v43 Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0>) = 
  (r2v31 Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0>)
  (r2v44 Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0>)
 binds: [B:58:0x01e3, B:54:0x01db] A[DONT_GENERATE, DONT_INLINE]
  0x01e5: PHI (r10v10 Y41.a) = (r10v6 Y41.a), (r10v11 Y41.a) binds: [B:58:0x01e3, B:54:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fe  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l com.avito.android.remote.model.Image r38, @Y61.l java.lang.String r39, @Y61.l java.lang.String r40, @Y61.l com.avito.android.messenger.conversation.T1.c r41, @Y61.l androidx.compose.ui.v r42, @Y61.l java.lang.String r43, @Y61.l java.lang.String r44, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k r45, @Y61.l com.avito.android.messenger.conversation.T1.d.a r46, @Y61.l Y41.a r47, @Y61.k androidx.compose.runtime.internal.C22096n r48, @Y61.l androidx.compose.runtime.A r49, int r50) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.m.a(com.avito.android.remote.model.Image, java.lang.String, java.lang.String, com.avito.android.messenger.conversation.T1$c, androidx.compose.ui.v, java.lang.String, java.lang.String, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k, com.avito.android.messenger.conversation.T1$d$a, Y41.a, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.l String str, @Y61.l v vVar, @Y61.l A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(926017940);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarM = R1.m(vVar, 0.0f, 0.0f, 0.0f, 16, 7);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            bE2.C(-1391277826);
            if (str == null || C43066x.K(str)) {
                b12 = bE2;
            } else {
                v vVarA = C22501m2.a(R1.m(v.f42878y1, 4, 0.0f, 0.0f, 0.0f, 14), "MessageTime");
                com.akita.compose.theme.re23.b.f63983a.getClass();
                b12 = bE2;
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65246q, vVarA, false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2), null, 0, 0, false, null, bE2, (i14 & 14) | 3456, 992);
            }
            b12.X(false);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new l(i12, vVar, str);
        }
    }
}
