package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.C20961k1;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.C20928m;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.Metadata;

/* compiled from: TextFieldKeyEventHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/g1;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20928m f31086a = new C20928m();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.text.X0 f31087b = new androidx.compose.foundation.text.X0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20961k1.a f31088c = C20961k1.f31559a;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public androidx.collection.I0 f31089d;

    /* compiled from: TextFieldKeyEventHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[16] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KeyCommand keyCommand = KeyCommand.f30426c;
                iArr[17] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KeyCommand keyCommand2 = KeyCommand.f30426c;
                iArr[18] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KeyCommand keyCommand3 = KeyCommand.f30426c;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KeyCommand keyCommand4 = KeyCommand.f30426c;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KeyCommand keyCommand5 = KeyCommand.f30426c;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                KeyCommand keyCommand6 = KeyCommand.f30426c;
                iArr[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                KeyCommand keyCommand7 = KeyCommand.f30426c;
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                KeyCommand keyCommand8 = KeyCommand.f30426c;
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                KeyCommand keyCommand9 = KeyCommand.f30426c;
                iArr[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                KeyCommand keyCommand10 = KeyCommand.f30426c;
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                KeyCommand keyCommand11 = KeyCommand.f30426c;
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                KeyCommand keyCommand12 = KeyCommand.f30426c;
                iArr[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                KeyCommand keyCommand13 = KeyCommand.f30426c;
                iArr[6] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                KeyCommand keyCommand14 = KeyCommand.f30426c;
                iArr[7] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                KeyCommand keyCommand15 = KeyCommand.f30426c;
                iArr[8] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                KeyCommand keyCommand16 = KeyCommand.f30426c;
                iArr[9] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                KeyCommand keyCommand17 = KeyCommand.f30426c;
                iArr[14] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                KeyCommand keyCommand18 = KeyCommand.f30426c;
                iArr[15] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                KeyCommand keyCommand19 = KeyCommand.f30426c;
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                KeyCommand keyCommand20 = KeyCommand.f30426c;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                KeyCommand keyCommand21 = KeyCommand.f30426c;
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                KeyCommand keyCommand22 = KeyCommand.f30426c;
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                KeyCommand keyCommand23 = KeyCommand.f30426c;
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                KeyCommand keyCommand24 = KeyCommand.f30426c;
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                KeyCommand keyCommand25 = KeyCommand.f30426c;
                iArr[43] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                KeyCommand keyCommand26 = KeyCommand.f30426c;
                iArr[44] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                KeyCommand keyCommand27 = KeyCommand.f30426c;
                iArr[25] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                KeyCommand keyCommand28 = KeyCommand.f30426c;
                iArr[26] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                KeyCommand keyCommand29 = KeyCommand.f30426c;
                iArr[27] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                KeyCommand keyCommand30 = KeyCommand.f30426c;
                iArr[34] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                KeyCommand keyCommand31 = KeyCommand.f30426c;
                iArr[35] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                KeyCommand keyCommand32 = KeyCommand.f30426c;
                iArr[37] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                KeyCommand keyCommand33 = KeyCommand.f30426c;
                iArr[36] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                KeyCommand keyCommand34 = KeyCommand.f30426c;
                iArr[38] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                KeyCommand keyCommand35 = KeyCommand.f30426c;
                iArr[39] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                KeyCommand keyCommand36 = KeyCommand.f30426c;
                iArr[40] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                KeyCommand keyCommand37 = KeyCommand.f30426c;
                iArr[41] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                KeyCommand keyCommand38 = KeyCommand.f30426c;
                iArr[28] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                KeyCommand keyCommand39 = KeyCommand.f30426c;
                iArr[29] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                KeyCommand keyCommand40 = KeyCommand.f30426c;
                iArr[30] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                KeyCommand keyCommand41 = KeyCommand.f30426c;
                iArr[31] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                KeyCommand keyCommand42 = KeyCommand.f30426c;
                iArr[32] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                KeyCommand keyCommand43 = KeyCommand.f30426c;
                iArr[33] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                KeyCommand keyCommand44 = KeyCommand.f30426c;
                iArr[42] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                KeyCommand keyCommand45 = KeyCommand.f30426c;
                iArr[45] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                KeyCommand keyCommand46 = KeyCommand.f30426c;
                iArr[46] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                KeyCommand keyCommand47 = KeyCommand.f30426c;
                iArr[47] = 48;
            } catch (NoSuchFieldError unused48) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(@Y61.k android.view.KeyEvent r19, @Y61.k androidx.compose.foundation.text.input.internal.t1 r20, @Y61.k androidx.compose.foundation.text.input.internal.p1 r21, @Y61.k androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r22, @Y61.k Y41.l<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.G0> r23, boolean r24, boolean r25, @Y61.k Y41.a<kotlin.G0> r26) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.g1.a(android.view.KeyEvent, androidx.compose.foundation.text.input.internal.t1, androidx.compose.foundation.text.input.internal.p1, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, Y41.l, boolean, boolean, Y41.a):boolean");
    }

    public boolean b(@Y61.k KeyEvent keyEvent, @Y61.k t1 t1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k androidx.compose.ui.focus.r rVar, @Y61.k InterfaceC22489j2 interfaceC22489j2) {
        if (!androidx.compose.ui.text.v0.d(t1Var.d().f31512d) && keyEvent.getKeyCode() == 4) {
            int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
            androidx.compose.ui.input.key.d.f40069b.getClass();
            if (androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40070c)) {
                textFieldSelectionState.getClass();
                throw null;
            }
        }
        return false;
    }
}
