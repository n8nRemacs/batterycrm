package defpackage;

import android.app.Notification;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.GestureDetector;
import android.view.Window;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.media3.common.ParserException;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import javax.inject.Provider;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ao6 implements lg9, j31, gu3, sq8, e34, qp5, dk9, uw8, shc, tm6 {
    public static final float[] c = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] d = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ao6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e34
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        ttg ttgVar = (ttg) obj;
        l92 l92Var = (l92) this.b;
        if (ttgVar.a()) {
            String str = l92Var.Y;
            String str2 = ttgVar.h.a;
            long j = l92Var.d;
            if (j != 0) {
                wqi.c(str, "updateChatAvatar", new Object[0]);
                pb2 pb2VarM = l92Var.b().M(j);
                if (pb2VarM != null) {
                    l92Var.a().i(l92Var.d, pb2VarM.b.a, null, str2, l92Var.o);
                } else {
                    wqi.e(str, "updateChatAvatar: chat not found, chatId=" + j, null);
                }
            } else {
                wqi.c(str, "updateProfileAvatar", new Object[0]);
                l92Var.a().C(null, null, str2, l92Var.o, null, null, 0L, 2);
            }
            l92Var.q().d(l92Var.b);
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        List<scd> list = (List) obj;
        kdd kddVar = (kdd) this.b;
        ArrayList arrayList = new ArrayList();
        for (scd scdVar : list) {
            pff pffVar = scdVar instanceof pff ? (pff) scdVar : null;
            Long lValueOf = pffVar != null ? Long.valueOf(pffVar.c) : null;
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        if (arrayList.isEmpty()) {
            return nk3.a;
        }
        return new ik3(kddVar.b().c(list), 0, new kk3(1, new v64(kddVar, 7, arrayList)));
    }

    @Override // defpackage.e34
    public Uri b() {
        return ((ContentInfo) this.b).getLinkUri();
    }

    @Override // defpackage.shc
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.uw8
    public List d(String str, boolean z, boolean z2) {
        return new ArrayList(ue3.X(dx8.d(str, z, z2), new vi5(7, ((sgb) this.b).b.D)));
    }

    @Override // defpackage.shc
    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override // defpackage.lg9
    public void f(vf9 vf9Var, boolean z) {
        go goVar;
        ho hoVar = (ho) this.b;
        vf9 vf9VarK = vf9Var.k();
        int i = 0;
        boolean z2 = vf9VarK != vf9Var;
        if (z2) {
            vf9Var = vf9VarK;
        }
        go[] goVarArr = hoVar.V0;
        int length = goVarArr != null ? goVarArr.length : 0;
        while (true) {
            if (i < length) {
                goVar = goVarArr[i];
                if (goVar != null && goVar.h == vf9Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                goVar = null;
                break;
            }
        }
        if (goVar != null) {
            if (!z2) {
                hoVar.s(goVar, z);
            } else {
                hoVar.q(goVar.a, goVar, vf9VarK);
                hoVar.s(goVar, true);
            }
        }
    }

    @Override // defpackage.e34
    public ContentInfo g() {
        return (ContentInfo) this.b;
    }

    @Override // javax.inject.Provider
    public Object get() {
        String packageName = ((Context) ((Provider) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.e34
    public Bundle getExtras() {
        return ((ContentInfo) this.b).getExtras();
    }

    @Override // defpackage.e34
    public int getFlags() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.e34
    public int h() {
        return ((ContentInfo) this.b).getSource();
    }

    public void i(int i, long j, long j2) {
        int i2;
        long j3;
        long j4;
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ah0 ah0Var = (ah0) it.next();
            if (ah0Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                ah0Var.a.post(new v50(i2, 1, j3, j4, ah0Var));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(int i, int i2, ip5 ip5Var) throws ParserException {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        jr8 jr8Var = (jr8) this.b;
        qyg qygVar = jr8Var.b;
        SparseArray sparseArray = jr8Var.c;
        umb umbVar = jr8Var.u0;
        umb umbVar2 = jr8Var.s0;
        int i10 = 1;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (jr8Var.T0 != 2) {
                    return;
                }
                hr8 hr8Var = (hr8) sparseArray.get(jr8Var.Z0);
                int i12 = jr8Var.c1;
                umb umbVar3 = jr8Var.z0;
                if (i12 != 4 || !"V_VP9".equals(hr8Var.c)) {
                    ip5Var.z(i2);
                    return;
                } else {
                    umbVar3.G(i2);
                    ip5Var.readFully(umbVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                jr8Var.b(i);
                hr8 hr8Var2 = jr8Var.H0;
                int i13 = hr8Var2.h;
                if (i13 != 1685485123 && i13 != 1685480259) {
                    ip5Var.z(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                hr8Var2.P = bArr;
                ip5Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                jr8Var.b(i);
                byte[] bArr2 = new byte[i2];
                jr8Var.H0.j = bArr2;
                ip5Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                ip5Var.readFully(bArr3, 0, i2);
                jr8Var.b(i);
                jr8Var.H0.k = new qfg(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(umbVar.a, (byte) 0);
                ip5Var.readFully(umbVar.a, 4 - i2, i2);
                umbVar.J(0);
                jr8Var.J0 = (int) umbVar.z();
                return;
            }
            if (i == 25506) {
                jr8Var.b(i);
                byte[] bArr4 = new byte[i2];
                jr8Var.H0.l = bArr4;
                ip5Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i);
            }
            jr8Var.b(i);
            byte[] bArr5 = new byte[i2];
            jr8Var.H0.x = bArr5;
            ip5Var.readFully(bArr5, 0, i2);
            return;
        }
        if (jr8Var.T0 == 0) {
            jr8Var.Z0 = (int) qygVar.z(ip5Var, false, true, 8);
            jr8Var.a1 = qygVar.c;
            jr8Var.V0 = -9223372036854775807L;
            jr8Var.T0 = 1;
            umbVar2.G(0);
        }
        hr8 hr8Var3 = (hr8) sparseArray.get(jr8Var.Z0);
        if (hr8Var3 == null) {
            ip5Var.z(i2 - jr8Var.a1);
            jr8Var.T0 = 0;
            return;
        }
        hr8Var3.Z.getClass();
        if (jr8Var.T0 == 1) {
            jr8Var.f(ip5Var, 3);
            int i14 = (umbVar2.a[2] & 6) >> 1;
            int i15 = 255;
            if (i14 == 0) {
                jr8Var.X0 = 1;
                int[] iArr = jr8Var.Y0;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                jr8Var.Y0 = iArr;
                iArr[0] = (i2 - jr8Var.a1) - 3;
            } else {
                jr8Var.f(ip5Var, 4);
                int i16 = (umbVar2.a[3] & 255) + 1;
                jr8Var.X0 = i16;
                int[] iArr2 = jr8Var.Y0;
                if (iArr2 == null) {
                    iArr2 = new int[i16];
                } else if (iArr2.length < i16) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i16)];
                }
                jr8Var.Y0 = iArr2;
                if (i14 == 2) {
                    int i17 = (i2 - jr8Var.a1) - 4;
                    int i18 = jr8Var.X0;
                    Arrays.fill(iArr2, 0, i18, i17 / i18);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i14);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 4;
                        while (true) {
                            int i22 = jr8Var.X0 - i10;
                            if (i19 >= i22) {
                                i3 = i10;
                                i4 = i11;
                                jr8Var.Y0[i22] = ((i2 - jr8Var.a1) - i21) - i20;
                                break;
                            }
                            jr8Var.Y0[i19] = i11;
                            int i23 = i21 + 1;
                            jr8Var.f(ip5Var, i23);
                            if (umbVar2.a[i21] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i24 = i10;
                            int i25 = i11;
                            while (true) {
                                if (i25 >= 8) {
                                    i5 = i11;
                                    j = 0;
                                    i6 = i23;
                                    break;
                                }
                                int i26 = i24 << (7 - i25);
                                i5 = i11;
                                if ((umbVar2.a[i21] & i26) != 0) {
                                    i6 = i23 + i25;
                                    jr8Var.f(ip5Var, i6);
                                    j = umbVar2.a[i21] & i15 & (~i26);
                                    while (i23 < i6) {
                                        j = (j << 8) | (umbVar2.a[i23] & i15);
                                        i23++;
                                        i15 = 255;
                                    }
                                    if (i19 > 0) {
                                        j -= (1 << ((i25 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i25++;
                                    i11 = i5;
                                    i15 = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i27 = (int) j;
                            int[] iArr3 = jr8Var.Y0;
                            if (i19 != 0) {
                                i27 += iArr3[i19 - 1];
                            }
                            iArr3[i19] = i27;
                            i20 += i27;
                            i19++;
                            i21 = i6;
                            i10 = i24;
                            i11 = i5;
                            i15 = 255;
                        }
                        throw ParserException.a(null, "EBML lacing sample size out of range.");
                    }
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        i7 = jr8Var.X0 - 1;
                        if (i28 >= i7) {
                            break;
                        }
                        jr8Var.Y0[i28] = 0;
                        while (true) {
                            i8 = i30 + 1;
                            jr8Var.f(ip5Var, i8);
                            int i31 = umbVar2.a[i30] & 255;
                            int[] iArr4 = jr8Var.Y0;
                            i9 = iArr4[i28] + i31;
                            iArr4[i28] = i9;
                            if (i31 != 255) {
                                break;
                            } else {
                                i30 = i8;
                            }
                        }
                        i29 += i9;
                        i28++;
                        i30 = i8;
                    }
                    jr8Var.Y0[i7] = ((i2 - jr8Var.a1) - i30) - i29;
                }
            }
            i3 = 1;
            i4 = 0;
            byte[] bArr6 = umbVar2.a;
            jr8Var.U0 = jr8Var.h((bArr6[i3] & 255) | (bArr6[i4] << 8)) + jr8Var.O0;
            jr8Var.b1 = (hr8Var3.e == 2 || (i == 163 && (umbVar2.a[2] & 128) == 128)) ? i3 : i4;
            jr8Var.T0 = 2;
            jr8Var.W0 = i4;
        } else {
            i3 = 1;
        }
        if (i == 163) {
            while (true) {
                int i32 = jr8Var.W0;
                if (i32 >= jr8Var.X0) {
                    jr8Var.T0 = 0;
                    return;
                } else {
                    jr8Var.c(hr8Var3, ((jr8Var.W0 * hr8Var3.f) / 1000) + jr8Var.U0, jr8Var.b1, jr8Var.j(ip5Var, hr8Var3, jr8Var.Y0[i32], false), 0);
                    jr8Var.W0++;
                }
            }
        } else {
            while (true) {
                int i33 = jr8Var.W0;
                if (i33 >= jr8Var.X0) {
                    return;
                }
                int[] iArr5 = jr8Var.Y0;
                boolean z = i3;
                iArr5[i33] = jr8Var.j(ip5Var, hr8Var3, iArr5[i33], z);
                jr8Var.W0 += z ? 1 : 0;
            }
        }
    }

    public Pattern k(String str) {
        Object obj;
        bj bjVar = (bj) this.b;
        synchronized (bjVar) {
            obj = ((ajd) bjVar.c).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        bj bjVar2 = (bj) this.b;
        synchronized (bjVar2) {
            ((ajd) bjVar2.c).put(str, patternCompile);
        }
        return patternCompile;
    }

    public void l(int i, long j) throws ParserException {
        jr8 jr8Var = (jr8) this.b;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                jr8Var.b(i);
                jr8Var.H0.e = (int) j;
                return;
            case 136:
                jr8Var.b(i);
                jr8Var.H0.X = j == 1;
                return;
            case 155:
                jr8Var.V0 = jr8Var.h(j);
                return;
            case 159:
                jr8Var.b(i);
                jr8Var.H0.Q = (int) j;
                return;
            case 176:
                jr8Var.b(i);
                jr8Var.H0.n = (int) j;
                return;
            case 179:
                jr8Var.a(i);
                jr8Var.P0.a(jr8Var.h(j));
                return;
            case 186:
                jr8Var.b(i);
                jr8Var.H0.o = (int) j;
                return;
            case 215:
                jr8Var.b(i);
                jr8Var.H0.d = (int) j;
                return;
            case 231:
                jr8Var.O0 = jr8Var.h(j);
                return;
            case 238:
                jr8Var.c1 = (int) j;
                return;
            case 241:
                if (jr8Var.R0) {
                    return;
                }
                jr8Var.a(i);
                jr8Var.Q0.a(j);
                jr8Var.R0 = true;
                return;
            case 251:
                jr8Var.d1 = true;
                return;
            case 16871:
                jr8Var.b(i);
                jr8Var.H0.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                jr8Var.K0 = j + jr8Var.C0;
                return;
            case 21432:
                int i2 = (int) j;
                jr8Var.b(i);
                if (i2 == 0) {
                    jr8Var.H0.y = 0;
                    return;
                }
                if (i2 == 1) {
                    jr8Var.H0.y = 2;
                    return;
                } else if (i2 == 3) {
                    jr8Var.H0.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    jr8Var.H0.y = 3;
                    return;
                }
            case 21680:
                jr8Var.b(i);
                jr8Var.H0.q = (int) j;
                return;
            case 21682:
                jr8Var.b(i);
                jr8Var.H0.s = (int) j;
                return;
            case 21690:
                jr8Var.b(i);
                jr8Var.H0.r = (int) j;
                return;
            case 21930:
                jr8Var.b(i);
                jr8Var.H0.W = j == 1;
                return;
            case 21938:
                jr8Var.b(i);
                hr8 hr8Var = jr8Var.H0;
                hr8Var.z = true;
                hr8Var.p = (int) j;
                return;
            case 21998:
                jr8Var.b(i);
                jr8Var.H0.g = (int) j;
                return;
            case 22186:
                jr8Var.b(i);
                jr8Var.H0.T = j;
                return;
            case 22203:
                jr8Var.b(i);
                jr8Var.H0.U = j;
                return;
            case 25188:
                jr8Var.b(i);
                jr8Var.H0.R = (int) j;
                return;
            case 30114:
                jr8Var.e1 = j;
                return;
            case 30321:
                jr8Var.b(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    jr8Var.H0.t = 0;
                    return;
                }
                if (i3 == 1) {
                    jr8Var.H0.t = 1;
                    return;
                } else if (i3 == 2) {
                    jr8Var.H0.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    jr8Var.H0.t = 3;
                    return;
                }
            case 2352003:
                jr8Var.b(i);
                jr8Var.H0.f = (int) j;
                return;
            case 2807729:
                jr8Var.D0 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        jr8Var.b(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            jr8Var.H0.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            jr8Var.H0.C = 1;
                            return;
                        }
                    case 21946:
                        jr8Var.b(i);
                        int iJ = gf3.j((int) j);
                        if (iJ != -1) {
                            jr8Var.H0.B = iJ;
                            return;
                        }
                        return;
                    case 21947:
                        jr8Var.b(i);
                        jr8Var.H0.z = true;
                        int i5 = gf3.i((int) j);
                        if (i5 != -1) {
                            jr8Var.H0.A = i5;
                            return;
                        }
                        return;
                    case 21948:
                        jr8Var.b(i);
                        jr8Var.H0.D = (int) j;
                        return;
                    case 21949:
                        jr8Var.b(i);
                        jr8Var.H0.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void m(long j) {
        boolean zEquals;
        ConversationParticipant me2;
        ParticipantId externalId;
        CallMoreBottomSheet callMoreBottomSheet = (CallMoreBottomSheet) this.b;
        yy7[] yy7VarArr = CallMoreBottomSheet.C0;
        tg1 tg1Var = (tg1) callMoreBottomSheet.x0.getValue();
        wo1 wo1Var = tg1Var.c;
        if (j == j0b.v) {
            xfh.r(wo1Var.L0, new zm1(true));
        } else if (j == j0b.w) {
            xfh.r(wo1Var.L0, new zm1(false));
        } else if (j == j0b.s) {
            xfh.r(wo1Var.L0, vm1.D);
        } else if (j == j0b.t) {
            d2e d2eVar = (d2e) ((u1e) tg1Var.Z.getValue());
            d2eVar.getClass();
            t1e t1eVar = ((e2e) d2eVar.t0.getValue()).b;
            if (t1eVar != null) {
                zi1 zi1Var = t1eVar.c;
                Conversation conversationA = ((n64) d2eVar.b.getValue()).a();
                zEquals = zi1Var.equals((conversationA == null || (me2 = conversationA.getMe()) == null || (externalId = me2.getExternalId()) == null) ? Boolean.FALSE : knb.a(externalId));
            } else {
                zEquals = false;
            }
            if (zEquals) {
                ((qv1) tg1Var.s0.getValue()).k(false);
            } else {
                xfh.r(wo1Var.L0, xm1.D);
            }
        } else if (j == j0b.r) {
            xfh.r(wo1Var.L0, qm1.D);
        } else if (j == j0b.C) {
            xfh.r(wo1Var.L0, pm1.D);
        } else if (j == j0b.e1) {
            xfh.r(wo1Var.L0, new im1(vfh.c));
        } else if (j == j0b.f1) {
            xfh.r(wo1Var.L0, new im1(vfh.a));
        } else if (j == j0b.u) {
            ci5 ci5Var = wo1Var.L0;
            ug1.c.getClass();
            xfh.r(ci5Var, new ei4(":call-admin-settings"));
        } else if (j == j0b.q) {
            ci5 ci5Var2 = wo1Var.L0;
            ug1.c.getClass();
            xfh.r(ci5Var2, new ei4(":call-debug-menu"));
        } else if (j == j0b.D) {
            yx1 yx1Var = (yx1) tg1Var.t0.getValue();
            yx1Var.getClass();
            yx1.d(yx1Var, "TAP_SHARE_LINK_P2P", null, null, null, null, null, false, 126);
            xfh.r(wo1Var.L0, nm1.D);
        } else if (j == j0b.p) {
            xfh.r(wo1Var.L0, pm1.D);
        }
        callMoreBottomSheet.E0(true);
    }

    public void n() {
        wqi.e(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontFailed", null);
        ((LoadEmojiFontWorker) this.b).state = new nb8();
    }

    public void o() {
        long j;
        sd4 sd4Var = (sd4) this.b;
        synchronized (vmi.b) {
            try {
                j = vmi.c ? vmi.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        sd4Var.L = j;
        sd4Var.y(true);
    }

    public void p(nj4 nj4Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ah0 ah0Var = (ah0) it.next();
            if (ah0Var.b == nj4Var) {
                ah0Var.c = true;
                copyOnWriteArrayList.remove(ah0Var);
            }
        }
    }

    public void q() {
        ee7 ee7Var = (ee7) this.b;
        synchronized (ee7Var.q) {
            try {
                Integer num = (Integer) ee7Var.q.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != ee7Var.H()) {
                    ee7Var.K();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lg9
    public boolean x(vf9 vf9Var) {
        Window.Callback callback;
        ho hoVar = (ho) this.b;
        if (vf9Var != vf9Var.k() || !hoVar.P0 || (callback = hoVar.v0.getCallback()) == null || hoVar.a1) {
            return true;
        }
        callback.onMenuOpened(108, vf9Var);
        return true;
    }

    public ao6(float[] fArr, float[] fArr2) {
        this.a = 0;
        i5i i5iVar = new i5i();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        i5iVar.a = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        i5iVar.b = floatBufferAsFloatBuffer2;
        this.b = i5iVar;
    }

    public ao6(int i) {
        this.a = 29;
        bj bjVar = new bj(14, false);
        bjVar.b = i;
        bjVar.c = new ajd(bjVar, ((i * 4) / 3) + 1);
        this.b = bjVar;
    }

    public ao6(i17 i17Var) {
        this.a = 1;
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) i17Var.e(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.b = null;
        } else {
            this.b = aeFpsRangeLegacyQuirk.a;
        }
    }

    public ao6(g95[] g95VarArr) {
        this.a = 15;
        tg7 tg7Var = new tg7(4);
        tg7Var.b(g95VarArr);
        this.b = tg7Var;
    }

    public ao6(ArrayList arrayList) {
        this.a = 15;
        tg7 tg7Var = new tg7(4);
        tg7Var.d(arrayList);
        this.b = tg7Var;
    }

    public ao6(int i, byte b) {
        this.a = i;
        switch (i) {
            case 8:
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.b = new ConcurrentHashMap(16);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                this.b = null;
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }

    public ao6(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 18;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public ao6(Notification notification) {
        this.a = 22;
        notification.getClass();
        this.b = notification;
    }

    public ao6(ContentInfo contentInfo) {
        this.a = 11;
        contentInfo.getClass();
        this.b = q20.k(contentInfo);
    }
}
