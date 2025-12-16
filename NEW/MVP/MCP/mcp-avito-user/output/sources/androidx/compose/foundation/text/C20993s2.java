package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.i3;
import androidx.compose.foundation.text.selection.C21008e1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22636b;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.InterfaceC22645k;
import androidx.compose.ui.text.v0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldKeyInput.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/e1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/selection/e1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20993s2 extends kotlin.jvm.internal.N implements Y41.l<C21008e1, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ KeyCommand f31817l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20958j2 f31818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.a f31819n;

    /* compiled from: TextFieldKeyInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.s2$a */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20993s2(KeyCommand keyCommand, C20958j2 c20958j2, l0.a aVar) {
        super(1);
        this.f31817l = keyCommand;
        this.f31818m = c20958j2;
        this.f31819n = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C21008e1 c21008e1) {
        Integer numD;
        Integer numC;
        Integer numC2;
        Integer numD2;
        androidx.compose.ui.text.o0 o0Var;
        androidx.compose.ui.text.o0 o0Var2;
        Q2 q22;
        Q2 q23;
        androidx.compose.ui.text.o0 o0Var3;
        androidx.compose.ui.text.o0 o0Var4;
        Q2 q24;
        Q2 q25;
        Integer numC3;
        Integer numD3;
        Integer numD4;
        Integer numC4;
        i3.a aVar;
        C21008e1 c21008e12 = c21008e1;
        int iOrdinal = this.f31817l.ordinal();
        androidx.compose.ui.text.input.W w12 = null;
        C20958j2 c20958j2 = this.f31818m;
        switch (iOrdinal) {
            case 0:
                C20962k2 c20962k2 = C20962k2.f31560l;
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (!androidx.compose.ui.text.v0.d(c21008e12.f32038f)) {
                        if (!c21008e12.e()) {
                            int iF2 = androidx.compose.ui.text.v0.f(c21008e12.f32038f);
                            c21008e12.l(iF2, iF2);
                            break;
                        } else {
                            int iG2 = androidx.compose.ui.text.v0.g(c21008e12.f32038f);
                            c21008e12.l(iG2, iG2);
                            break;
                        }
                    } else {
                        c20962k2.invoke(c21008e12);
                        break;
                    }
                }
                break;
            case 1:
                C20966l2 c20966l2 = C20966l2.f31568l;
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (!androidx.compose.ui.text.v0.d(c21008e12.f32038f)) {
                        if (!c21008e12.e()) {
                            int iG3 = androidx.compose.ui.text.v0.g(c21008e12.f32038f);
                            c21008e12.l(iG3, iG3);
                            break;
                        } else {
                            int iF3 = androidx.compose.ui.text.v0.f(c21008e12.f32038f);
                            c21008e12.l(iF3, iF3);
                            break;
                        }
                    } else {
                        c20966l2.invoke(c21008e12);
                        break;
                    }
                }
                break;
            case 2:
                androidx.compose.foundation.text.selection.C1 c12 = c21008e12.f32037e;
                c12.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (!c21008e12.e()) {
                        c12.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numD = c21008e12.d()) != null) {
                            int iIntValue = numD.intValue();
                            c21008e12.l(iIntValue, iIntValue);
                            break;
                        }
                    } else {
                        c12.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numC = c21008e12.c()) != null) {
                            int iIntValue2 = numC.intValue();
                            c21008e12.l(iIntValue2, iIntValue2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                androidx.compose.foundation.text.selection.C1 c13 = c21008e12.f32037e;
                c13.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (!c21008e12.e()) {
                        c13.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numC2 = c21008e12.c()) != null) {
                            int iIntValue3 = numC2.intValue();
                            c21008e12.l(iIntValue3, iIntValue3);
                            break;
                        }
                    } else {
                        c13.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numD2 = c21008e12.d()) != null) {
                            int iIntValue4 = numD2.intValue();
                            c21008e12.l(iIntValue4, iIntValue4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                c21008e12.g();
                break;
            case 5:
                c21008e12.h();
                break;
            case 6:
                c21008e12.j();
                break;
            case 7:
                c21008e12.i();
                break;
            case 8:
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (!c21008e12.e()) {
                        c21008e12.i();
                        break;
                    } else {
                        c21008e12.j();
                        break;
                    }
                }
                break;
            case 9:
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (!c21008e12.e()) {
                        c21008e12.j();
                        break;
                    } else {
                        c21008e12.i();
                        break;
                    }
                }
                break;
            case 10:
                if (c21008e12.f32039g.f42127c.length() > 0 && (o0Var = c21008e12.f32035c) != null) {
                    int iF4 = c21008e12.f(o0Var, -1);
                    c21008e12.l(iF4, iF4);
                    break;
                }
                break;
            case 11:
                if (c21008e12.f32039g.f42127c.length() > 0 && (o0Var2 = c21008e12.f32035c) != null) {
                    int iF5 = c21008e12.f(o0Var2, 1);
                    c21008e12.l(iF5, iF5);
                    break;
                }
                break;
            case 12:
                if (c21008e12.f32039g.f42127c.length() > 0 && (q22 = c21008e12.f31977i) != null) {
                    int iO2 = c21008e12.o(q22, -1);
                    c21008e12.l(iO2, iO2);
                    break;
                }
                break;
            case 13:
                if (c21008e12.f32039g.f42127c.length() > 0 && (q23 = c21008e12.f31977i) != null) {
                    int iO3 = c21008e12.o(q23, 1);
                    c21008e12.l(iO3, iO3);
                    break;
                }
                break;
            case 14:
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    c21008e12.l(0, 0);
                    break;
                }
                break;
            case 15:
                c21008e12.f32037e.f31828a = null;
                C22602e c22602e = c21008e12.f32039g;
                if (c22602e.f42127c.length() > 0) {
                    int length = c22602e.f42127c.length();
                    c21008e12.l(length, length);
                    break;
                }
                break;
            case 16:
                c20958j2.f31544b.d(false);
                break;
            case 17:
                c20958j2.f31544b.o();
                break;
            case 18:
                c20958j2.f31544b.f();
                break;
            case 19:
                List<InterfaceC22645k> listN = c21008e12.n(C20970m2.f31575l);
                if (listN != null) {
                    c20958j2.a(listN);
                    break;
                }
                break;
            case 20:
                List<InterfaceC22645k> listN2 = c21008e12.n(C20974n2.f31750l);
                if (listN2 != null) {
                    c20958j2.a(listN2);
                    break;
                }
                break;
            case 21:
                List<InterfaceC22645k> listN3 = c21008e12.n(C20978o2.f31760l);
                if (listN3 != null) {
                    c20958j2.a(listN3);
                    break;
                }
                break;
            case 22:
                List<InterfaceC22645k> listN4 = c21008e12.n(C20982p2.f31772l);
                if (listN4 != null) {
                    c20958j2.a(listN4);
                    break;
                }
                break;
            case 23:
                List<InterfaceC22645k> listN5 = c21008e12.n(C20986q2.f31807l);
                if (listN5 != null) {
                    c20958j2.a(listN5);
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                List<InterfaceC22645k> listN6 = c21008e12.n(C20989r2.f31813l);
                if (listN6 != null) {
                    c20958j2.a(listN6);
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                c21008e12.f32037e.f31828a = null;
                C22602e c22602e2 = c21008e12.f32039g;
                if (c22602e2.f42127c.length() > 0) {
                    c21008e12.l(0, c22602e2.f42127c.length());
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                androidx.compose.foundation.text.selection.C1 c14 = c21008e12.f32037e;
                c14.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (c21008e12.e()) {
                        c14.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0) {
                            String str = c21008e12.f32039g.f42127c;
                            long j12 = c21008e12.f32038f;
                            v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
                            int iB2 = O1.b((int) (4294967295L & j12), str);
                            if (iB2 != -1) {
                                c21008e12.l(iB2, iB2);
                            }
                        }
                    } else {
                        c14.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0) {
                            String str2 = c21008e12.f32039g.f42127c;
                            long j13 = c21008e12.f32038f;
                            v0.a aVar3 = androidx.compose.ui.text.v0.f42734b;
                            int iA2 = O1.a((int) (4294967295L & j13), str2);
                            if (iA2 != -1) {
                                c21008e12.l(iA2, iA2);
                            }
                        }
                    }
                }
                c21008e12.k();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                androidx.compose.foundation.text.selection.C1 c15 = c21008e12.f32037e;
                c15.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (c21008e12.e()) {
                        c15.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0) {
                            String str3 = c21008e12.f32039g.f42127c;
                            long j14 = c21008e12.f32038f;
                            v0.a aVar4 = androidx.compose.ui.text.v0.f42734b;
                            int iA3 = O1.a((int) (4294967295L & j14), str3);
                            if (iA3 != -1) {
                                c21008e12.l(iA3, iA3);
                            }
                        }
                    } else {
                        c15.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0) {
                            String str4 = c21008e12.f32039g.f42127c;
                            long j15 = c21008e12.f32038f;
                            v0.a aVar5 = androidx.compose.ui.text.v0.f42734b;
                            int iB3 = O1.b((int) (4294967295L & j15), str4);
                            if (iB3 != -1) {
                                c21008e12.l(iB3, iB3);
                            }
                        }
                    }
                }
                c21008e12.k();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (c21008e12.f32039g.f42127c.length() > 0 && (o0Var3 = c21008e12.f32035c) != null) {
                    int iF6 = c21008e12.f(o0Var3, -1);
                    c21008e12.l(iF6, iF6);
                }
                c21008e12.k();
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                if (c21008e12.f32039g.f42127c.length() > 0 && (o0Var4 = c21008e12.f32035c) != null) {
                    int iF7 = c21008e12.f(o0Var4, 1);
                    c21008e12.l(iF7, iF7);
                }
                c21008e12.k();
                break;
            case 30:
                if (c21008e12.f32039g.f42127c.length() > 0 && (q24 = c21008e12.f31977i) != null) {
                    int iO4 = c21008e12.o(q24, -1);
                    c21008e12.l(iO4, iO4);
                }
                c21008e12.k();
                break;
            case 31:
                if (c21008e12.f32039g.f42127c.length() > 0 && (q25 = c21008e12.f31977i) != null) {
                    int iO5 = c21008e12.o(q25, 1);
                    c21008e12.l(iO5, iO5);
                }
                c21008e12.k();
                break;
            case 32:
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    c21008e12.l(0, 0);
                }
                c21008e12.k();
                break;
            case 33:
                c21008e12.f32037e.f31828a = null;
                C22602e c22602e3 = c21008e12.f32039g;
                if (c22602e3.f42127c.length() > 0) {
                    int length2 = c22602e3.f42127c.length();
                    c21008e12.l(length2, length2);
                }
                c21008e12.k();
                break;
            case 34:
                androidx.compose.foundation.text.selection.C1 c16 = c21008e12.f32037e;
                c16.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (c21008e12.e()) {
                        c16.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numD3 = c21008e12.d()) != null) {
                            int iIntValue5 = numD3.intValue();
                            c21008e12.l(iIntValue5, iIntValue5);
                        }
                    } else {
                        c16.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numC3 = c21008e12.c()) != null) {
                            int iIntValue6 = numC3.intValue();
                            c21008e12.l(iIntValue6, iIntValue6);
                        }
                    }
                }
                c21008e12.k();
                break;
            case 35:
                androidx.compose.foundation.text.selection.C1 c17 = c21008e12.f32037e;
                c17.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (c21008e12.e()) {
                        c17.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numC4 = c21008e12.c()) != null) {
                            int iIntValue7 = numC4.intValue();
                            c21008e12.l(iIntValue7, iIntValue7);
                        }
                    } else {
                        c17.f31828a = null;
                        if (c21008e12.f32039g.f42127c.length() > 0 && (numD4 = c21008e12.d()) != null) {
                            int iIntValue8 = numD4.intValue();
                            c21008e12.l(iIntValue8, iIntValue8);
                        }
                    }
                }
                c21008e12.k();
                break;
            case 36:
                c21008e12.g();
                c21008e12.k();
                break;
            case 37:
                c21008e12.h();
                c21008e12.k();
                break;
            case 38:
                c21008e12.j();
                c21008e12.k();
                break;
            case 39:
                c21008e12.i();
                c21008e12.k();
                break;
            case 40:
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (c21008e12.e()) {
                        c21008e12.j();
                    } else {
                        c21008e12.i();
                    }
                }
                c21008e12.k();
                break;
            case 41:
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    if (c21008e12.e()) {
                        c21008e12.i();
                    } else {
                        c21008e12.j();
                    }
                }
                c21008e12.k();
                break;
            case 42:
                c21008e12.f32037e.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    long j16 = c21008e12.f32038f;
                    v0.a aVar6 = androidx.compose.ui.text.v0.f42734b;
                    int i12 = (int) (j16 & 4294967295L);
                    c21008e12.l(i12, i12);
                    break;
                }
                break;
            case 43:
                if (!c20958j2.f31547e) {
                    c20958j2.a(Collections.singletonList(new C22636b("\n", 1)));
                    break;
                } else {
                    ((C20985q1.a) c20958j2.f31543a.f31800w).invoke(C22654u.a(c20958j2.f31554l));
                    break;
                }
            case 44:
                if (!c20958j2.f31547e) {
                    c20958j2.a(Collections.singletonList(new C22636b("\t", 1)));
                    break;
                } else {
                    this.f31819n.f406838b = false;
                    break;
                }
            case 45:
                i3 i3Var = c20958j2.f31550h;
                if (i3Var != null) {
                    i3Var.a(androidx.compose.ui.text.input.W.a(c21008e12.f31976h, c21008e12.f32039g, c21008e12.f32038f, 4));
                }
                i3 i3Var2 = c20958j2.f31550h;
                if (i3Var2 != null) {
                    i3.a aVar7 = i3Var2.f30747b;
                    if (aVar7 != null && (aVar = aVar7.f30752a) != null) {
                        i3Var2.f30747b = aVar;
                        i3Var2.f30749d -= aVar7.f30753b.f42383a.f42127c.length();
                        i3Var2.f30748c = new i3.a(i3Var2.f30748c, aVar7.f30753b);
                        w12 = aVar.f30753b;
                    }
                    if (w12 != null) {
                        c20958j2.f31553k.invoke(w12);
                        break;
                    }
                }
                break;
            case 46:
                i3 i3Var3 = c20958j2.f31550h;
                if (i3Var3 != null) {
                    i3.a aVar8 = i3Var3.f30748c;
                    if (aVar8 != null) {
                        i3Var3.f30748c = aVar8.f30752a;
                        androidx.compose.ui.text.input.W w13 = aVar8.f30753b;
                        i3Var3.f30747b = new i3.a(i3Var3.f30747b, w13);
                        i3Var3.f30749d = w13.f42383a.f42127c.length() + i3Var3.f30749d;
                        w12 = aVar8.f30753b;
                    }
                    if (w12 != null) {
                        c20958j2.f31553k.invoke(w12);
                        break;
                    }
                }
                break;
        }
        return kotlin.G0.f406611a;
    }
}
