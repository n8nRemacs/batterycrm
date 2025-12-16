package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message;

import Y41.p;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.r0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m;
import com.avito.android.messenger.conversation.mvi.messages.utils.b;
import com.avito.android.messenger.conversation.mvi.messages.utils.o;
import com.avito.android.messenger.conversation.mvi.messages.utils.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: VoiceMessageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\b²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/voice_message/m$a;", "iconState", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/voice_message/m;", "messageState", "", "sliderValue", "", "durationText", "_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final float f192690a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f192691b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f192692c;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f192690a = 26;
        f192691b = 6;
        f192692c = 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(m mVar, Y41.a aVar, v vVar, A a12, int i12) {
        int i13;
        Q q12;
        v vVarB;
        B bE2 = a12.E(-471943952);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(mVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            m.a aVar2 = (m.a) ((o) bE2.o(u.f193642a)).b(mVar, bE2).getF42167b();
            if (L.f(aVar2, m.a.C5691a.f192699a)) {
                q12 = new Q(Integer.valueOf(R.drawable.ic_messenger_voice_pause_16_white), Boolean.FALSE);
            } else if (L.f(aVar2, m.a.b.f192700a)) {
                q12 = new Q(Integer.valueOf(R.drawable.ic_messenger_voice_play_16_white), Boolean.FALSE);
            } else {
                if (!L.f(aVar2, m.a.c.f192701a)) {
                    throw new NoWhenBranchMatchedException();
                }
                q12 = new Q(Integer.valueOf(R.drawable.ic_close_10_white), Boolean.TRUE);
            }
            int iIntValue = ((Number) q12.f406619b).intValue();
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(iIntValue, 0, bE2);
            com.avito.android.messenger.conversation.mvi.messages.utils.b bVar = new com.avito.android.messenger.conversation.mvi.messages.utils.b(new b.a.C5718b(iIntValue), null, 2, null);
            bE2.C(-231822629);
            if (zBooleanValue) {
                v.a aVar3 = v.f42878y1;
                bE2.C(-231820362);
                Object objT = bE2.t();
                A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                if (objT == c1651a) {
                    objT = androidx.compose.foundation.interaction.l.a();
                    bE2.H(objT);
                }
                androidx.compose.foundation.interaction.m mVar2 = (androidx.compose.foundation.interaction.m) objT;
                bE2.X(false);
                androidx.compose.ui.semantics.i.f41744b.getClass();
                androidx.compose.ui.semantics.i iVarA = androidx.compose.ui.semantics.i.a(androidx.compose.ui.semantics.i.f41749g);
                bE2.C(-231817374);
                boolean z12 = (i13 & 112) == 32;
                Object objT2 = bE2.t();
                if (z12 || objT2 == c1651a) {
                    objT2 = new b(aVar);
                    bE2.H(objT2);
                }
                bE2.X(false);
                vVarB = C21086w0.b(aVar3, mVar2, null, false, iVarA, (Y41.a) objT2, 12);
            } else {
                vVarB = v.f42878y1;
            }
            bE2.X(false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
            v vVarD0 = androidx.compose.foundation.A.b(vVar, aVar4.f63942m0.c(bE2), androidx.compose.foundation.shape.o.f30153a).d0(vVarB);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarD0);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar6 = v.f42878y1;
            C20806p1.a(eVarA, "", com.akita.compose.foundation.semantics.a.a(C22501m2.a(aVar6, "VoiceMessageIcon"), bVar), null, null, 0.0f, null, bE2, 56, 120);
            bE2.C(-1267979117);
            if (zBooleanValue) {
                h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.spinner.b.b(C22501m2.a(c20644z.d(C20588k2.o(aVar6, 24), iVar), "VoiceMessageCircularProgress"), aVar4.f63851H1, 2, 0, null, bE2, 384, 24);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(mVar, aVar, vVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m r22, long r23, Y41.l r25, androidx.compose.ui.v r26, androidx.compose.runtime.A r27, int r28) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.l.b(com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m, long, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(m mVar, v vVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-429877638);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(mVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            String str = (String) ((o) bE2.o(u.f193642a)).a(mVar, bE2).getF42167b();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65246q, C22501m2.a(vVar, "VoiceMessageDurationText"), false, com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2), null, 0, 0, false, null, bE2, 3072, 992);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(mVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(@Y61.k m mVar, long j12, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1772835485);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(mVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            q0 q0VarA = r0.a(1, 6, 0, bE2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            float fJ2 = ((androidx.compose.ui.unit.d) bE2.o(Q0.f41199h)).J((int) (q0.a(q0VarA, "0:00", com.akita.compose.theme.re23.b.f63988f.f65246q.d(new Object[0], bE2), 0L, 1020).f42528c >> 32));
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarA = C22501m2.a(R1.j(vVar, f192692c, 10), "VoiceMessageContent");
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v.a aVar4 = v.f42878y1;
            int i15 = i13 & 14;
            int i16 = i13 >> 3;
            a(mVar, aVar, C20588k2.o(aVar4, f192690a), bE2, i15 | 384 | (i16 & 112));
            float f12 = f192691b;
            com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
            b(mVar, j12, lVar, c20576h2.a(aVar4, 1.0f, true), bE2, (i13 & WebSocketProtocol.PAYLOAD_SHORT) | (i16 & 896));
            com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
            c(mVar, C20588k2.t(aVar4, fJ2), bE2, i15);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(mVar, j12, aVar, lVar, vVar, i12);
        }
    }
}
