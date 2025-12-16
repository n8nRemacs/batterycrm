package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.format.Formatter;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.akita.compose.foundation.ui.g;
import com.akita.compose.theme.re23.e;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message.FileMessageData;
import com.avito.android.messenger.conversation.mvi.messages.utils.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FileMessageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final v f192482a;

    /* compiled from: FileMessageContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FileMessageData.IconState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FileMessageData.IconState iconState = FileMessageData.IconState.f192472b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FileMessageData.IconState iconState2 = FileMessageData.IconState.f192472b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        h.a aVar = h.f42849c;
        f192482a = C20588k2.o(v.f42878y1, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k FileMessageData fileMessageData, @l v vVar, boolean z12, @k Y41.a aVar, @l A a12, int i12) {
        int i13;
        Q q12;
        v vVarB;
        ?? r42;
        B bE2 = a12.E(-1141168176);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(fileMessageData) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.j(z12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            float f12 = 16;
            h.a aVar2 = h.f42849c;
            v vVarA = C22501m2.a(R1.l(vVar, f12, z12 ? f12 : 0, f12, f12), "FileMessageContent");
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            FileMessageData.IconState iconState = fileMessageData.f192471c;
            int iOrdinal = iconState.ordinal();
            if (iOrdinal == 0) {
                q12 = new Q(Integer.valueOf(R.drawable.ic_close_10_gray_28), h.a(10));
            } else if (iOrdinal == 1) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                q12 = new Q(Integer.valueOf(e.f64721q5), h.a(32));
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                q12 = new Q(Integer.valueOf(e.f64688o6), h.a(32));
            }
            int iIntValue = ((Number) q12.f406619b).intValue();
            float f13 = ((h) q12.f406620c).f42852b;
            bE2.C(-434280710);
            FileMessageData.IconState iconState2 = FileMessageData.IconState.f192472b;
            A.a aVar4 = A.f37866a;
            if (iconState == iconState2) {
                androidx.compose.ui.semantics.i.f41744b.getClass();
                bE2.C(-434272314);
                Object objT = bE2.t();
                aVar4.getClass();
                if (objT == A.a.f37868b) {
                    objT = androidx.compose.foundation.interaction.l.a();
                    bE2.H(objT);
                }
                bE2.X(false);
                vVarB = C21086w0.b(f192482a, (m) objT, null, false, androidx.compose.ui.semantics.i.a(0), aVar, 12);
            } else {
                vVarB = f192482a;
            }
            bE2.X(false);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = n.c(bE2, vVarB);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, interfaceC22365i0D);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            bE2.C(-771710257);
            if (iconState == iconState2) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                r42 = 0;
                com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66693b(), C22501m2.a(C20588k2.o(v.f42878y1, 24), "FileMessageCircularProgress"), bE2, 48, 0);
            } else {
                r42 = 0;
            }
            bE2.X(r42);
            com.avito.android.messenger.conversation.mvi.messages.utils.b bVar2 = new com.avito.android.messenger.conversation.mvi.messages.utils.b(new b.a.C5718b(iIntValue), null, 2, null);
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(iIntValue, r42, bE2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar5 = com.akita.compose.theme.re23.b.f63984b;
            com.akita.compose.foundation.p pVar5 = aVar5.f63938l;
            v.a aVar6 = v.f42878y1;
            com.akita.compose.foundation.ui.e.a(eVarA, null, com.akita.compose.foundation.semantics.a.a(C22501m2.a(C20588k2.o(aVar6, f13), "FileMessageIcon"), bVar2), pVar5, bE2, 56, 0);
            bE2.X(true);
            v vVarM = R1.m(aVar6, 8, 0.0f, 0.0f, 0.0f, 14);
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 54);
            int i16 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            v vVarC3 = n.c(bE2, vVarM);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            K k12 = K.f28344a;
            Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
            bE2.C(-771674139);
            Object objT2 = bE2.t();
            aVar4.getClass();
            if (objT2 == A.a.f37868b) {
                objT2 = Formatter.formatShortFileSize(context.getApplicationContext(), fileMessageData.f192470b);
                bE2.H(objT2);
            }
            String str = (String) objT2;
            bE2.X(false);
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            r rVar = iVar.f65245p;
            s.f42720b.getClass();
            int i17 = s.f42722d;
            com.akita.compose.foundation.ui.p.b(fileMessageData.f192469a, rVar, C22501m2.a(aVar6, "FileMessageName"), false, 0L, null, 1, i17, false, null, bE2, 14159232, 816);
            g.a(2, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(str, iVar.f65245p, C22501m2.a(aVar6, "FileMessageSize"), false, aVar5.f63918e0.c(bE2), null, 1, i17, false, null, bE2, 14159232, 800);
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message.a(fileMessageData, vVar, z12, aVar, i12);
        }
    }
}
