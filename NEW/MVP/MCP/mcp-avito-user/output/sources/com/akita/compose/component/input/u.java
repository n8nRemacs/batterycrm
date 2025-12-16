package com.akita.compose.component.input;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Input.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isFieldFocused", "input_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0133  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k java.lang.String r44, @Y61.k com.akita.compose.component.input.v r45, @Y61.k Y41.l r46, @Y61.l androidx.compose.ui.v r47, @Y61.l java.lang.String r48, boolean r49, @Y61.l com.akita.compose.component.input.InputState r50, @Y61.l androidx.compose.foundation.text.C20981p1 r51, @Y61.l androidx.compose.foundation.text.C20973n1 r52, @Y61.l com.akita.compose.component.input.transformation.k r53, int r54, boolean r55, int r56, @Y61.l androidx.compose.ui.i.b r57, boolean r58, boolean r59, boolean r60, @Y61.l java.lang.Integer r61, @Y61.l java.lang.Integer r62, @Y61.l Y41.a r63, @Y61.l Y41.a r64, @Y61.l androidx.compose.runtime.A r65, int r66, int r67, int r68, int r69) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.input.u.a(java.lang.String, com.akita.compose.component.input.v, Y41.l, androidx.compose.ui.v, java.lang.String, boolean, com.akita.compose.component.input.InputState, androidx.compose.foundation.text.p1, androidx.compose.foundation.text.n1, com.akita.compose.component.input.transformation.k, int, boolean, int, androidx.compose.ui.i$b, boolean, boolean, boolean, java.lang.Integer, java.lang.Integer, Y41.a, Y41.a, androidx.compose.runtime.A, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k java.lang.String r50, @Y61.k com.akita.compose.component.input.v r51, @Y61.k Y41.l r52, @Y61.l androidx.compose.ui.v r53, @Y61.l java.lang.String r54, boolean r55, @Y61.l com.akita.compose.component.input.InputState r56, boolean r57, @Y61.l androidx.compose.foundation.text.C20981p1 r58, @Y61.l androidx.compose.foundation.text.C20973n1 r59, @Y61.l com.akita.compose.component.input.transformation.k r60, int r61, boolean r62, int r63, @Y61.l androidx.compose.ui.i.b r64, @Y61.l androidx.compose.runtime.internal.C22096n r65, @Y61.l androidx.compose.runtime.internal.C22096n r66, @Y61.l Y41.a r67, @Y61.l androidx.compose.runtime.A r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.input.u.b(java.lang.String, com.akita.compose.component.input.v, Y41.l, androidx.compose.ui.v, java.lang.String, boolean, com.akita.compose.component.input.InputState, boolean, androidx.compose.foundation.text.p1, androidx.compose.foundation.text.n1, com.akita.compose.component.input.transformation.k, int, boolean, int, androidx.compose.ui.i$b, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, Y41.a, androidx.compose.runtime.A, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k androidx.compose.foundation.layout.InterfaceC20640y r23, long r24, long r26, @Y61.l Y41.a r28, @Y61.l androidx.compose.ui.v.a r29, @Y61.k androidx.compose.runtime.internal.C22096n r30, @Y61.l androidx.compose.runtime.A r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.input.u.c(androidx.compose.foundation.layout.y, long, long, Y41.a, androidx.compose.ui.v$a, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    public static final void d(long j12, C22096n c22096n, A a12, int i12) {
        int i13;
        B bE2 = a12.E(1374371040);
        if ((i12 & 14) == 0) {
            i13 = (bE2.n(j12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(c22096n) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarA = C20588k2.a(androidx.compose.ui.v.f42878y1, androidx.compose.ui.unit.l.d(j12), androidx.compose.ui.unit.l.c(j12));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            c22096n.invoke(C20644z.f28804a, bE2, Integer.valueOf((i13 & 112) | 6));
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(j12, c22096n, i12);
        }
    }
}
