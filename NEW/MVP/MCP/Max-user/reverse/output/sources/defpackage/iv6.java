package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.transformer.ExportException;
import com.google.android.exoplayer2.ParserException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes.dex */
public final class iv6 implements da8, lg9, gu3, pkf, c34, wmb, qn6, uu1, tm6 {
    public static volatile iv6 c;
    public static final s55 d = new s55(22);
    public static final vi5 o = new vi5(4, new vi5(3, new dj3(0, new s55(24))));
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ iv6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String k(long j) {
        return j == BuildConfig.MAX_TIME_TO_UPLOAD ? "Long.MAX_VALUE" : j == Long.MIN_VALUE ? "Long.MIN_VALUE" : String.valueOf(j);
    }

    public static iv6 o(i12 i12Var) {
        DynamicRangeProfiles dynamicRangeProfilesF;
        int i = Build.VERSION.SDK_INT;
        iv6 iv6Var = null;
        if (i >= 33 && (dynamicRangeProfilesF = e5.f(i12Var.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            z5j.f("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            iv6Var = new iv6(16, new z75(dynamicRangeProfilesF));
        }
        return iv6Var == null ? a85.a : iv6Var;
    }

    public static g94 w(File file) throws Exception {
        try {
            String name = file.getName();
            int iG = vmf.G(name, '_', 0, 6);
            if (iG < 0) {
                throw new IllegalStateException("Malformed directory name ".concat(name).toString());
            }
            int iV = utb.v(name.substring(0, iG));
            long j = Long.parseLong(name.substring(iG + 1));
            File fileG = jz5.g(file, "system_info");
            if (!fileG.exists()) {
                throw new IllegalStateException("No system info file");
            }
            File fileG2 = jz5.g(file, "stacktrace");
            if (!fileG2.exists()) {
                throw new IllegalStateException("No stacktrace file");
            }
            return new g94(j, iV, file.getPath(), fileG.getPath(), jz5.g(file, "tags").getPath(), fileG2.getPath(), jz5.g(file, "all_stacktraces").getPath(), jz5.g(file, "all_logs").getPath());
        } catch (Exception e) {
            jz5.b(file);
            throw e;
        }
    }

    @Override // defpackage.qn6
    public void a(Object obj) {
        hf6 hf6Var;
        Bitmap bitmap = (Bitmap) obj;
        ((nd7) this.b).s0 = 50;
        ff6 ff6Var = new ff6();
        ff6Var.u = bitmap.getHeight();
        ff6Var.t = bitmap.getWidth();
        ff6Var.m = xz9.n("image/raw");
        ff6Var.C = gf3.i;
        hf6 hf6Var2 = new hf6(ff6Var);
        if (((nd7) this.b).o && Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
            ff6 ff6VarA = hf6Var2.a();
            ff6VarA.m = xz9.n("image/jpeg_r");
            hf6Var = new hf6(ff6VarA);
        } else {
            hf6Var = hf6Var2;
        }
        try {
            ((nd7) this.b).d.e(2, hf6Var2);
            ((nd7) this.b).X.submit(new se5(this, bitmap, hf6Var, 13));
        } catch (RuntimeException e) {
            ((nd7) this.b).d.c(ExportException.a(1000, e));
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        z72 z72Var = (z72) this.b;
        wqi.e(z72Var.Y, "onUploadFailed: failed", th);
        a3g a3gVarQ = z72Var.q();
        long j = z72Var.b;
        a3gVarQ.d(j);
        z72Var.w();
        z72Var.v();
        z72Var.r().c(new rj0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pzf("internal-error", th.toString(), null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    @Override // defpackage.tm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv6.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.da8
    public void b(int i, int i2) {
        ((phd) this.b).n(i, i2);
    }

    @Override // defpackage.c34
    public f34 build() {
        return new f34(new ao6(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.da8
    public void c(int i, int i2) {
        ((phd) this.b).p(i, i2);
    }

    @Override // defpackage.c34
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.c34
    public void e(ClipData clipData) {
        ((ContentInfo.Builder) this.b).setClip(clipData);
    }

    @Override // defpackage.lg9
    public void f(vf9 vf9Var, boolean z) {
        ((ho) this.b).r(vf9Var);
    }

    @Override // defpackage.da8
    public void g(int i, int i2) {
        ((phd) this.b).a.f(i, i2);
    }

    @Override // defpackage.da8
    public void h(int i, int i2, Object obj) {
        ((phd) this.b).o(i, i2, obj);
    }

    public void i(int i, int i2, hp5 hp5Var) throws ParserException {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        ir8 ir8Var = (ir8) this.b;
        qyg qygVar = ir8Var.b;
        SparseArray sparseArray = ir8Var.c;
        qyg qygVar2 = ir8Var.i;
        qyg qygVar3 = ir8Var.g;
        int i10 = 1;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (ir8Var.G != 2) {
                    return;
                }
                gr8 gr8Var = (gr8) sparseArray.get(ir8Var.M);
                int i12 = ir8Var.P;
                qyg qygVar4 = ir8Var.n;
                if (i12 != 4 || !"V_VP9".equals(gr8Var.b)) {
                    hp5Var.z(i2);
                    return;
                } else {
                    qygVar4.B(i2);
                    hp5Var.readFully(qygVar4.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                ir8Var.b(i);
                gr8 gr8Var2 = ir8Var.u;
                int i13 = gr8Var2.g;
                if (i13 != 1685485123 && i13 != 1685480259) {
                    hp5Var.z(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                gr8Var2.N = bArr;
                hp5Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                ir8Var.b(i);
                byte[] bArr2 = new byte[i2];
                ir8Var.u.i = bArr2;
                hp5Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                hp5Var.readFully(bArr3, 0, i2);
                ir8Var.b(i);
                ir8Var.u.j = new pfg(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(qygVar2.a, (byte) 0);
                hp5Var.readFully(qygVar2.a, 4 - i2, i2);
                qygVar2.E(0);
                ir8Var.w = (int) qygVar2.t();
                return;
            }
            if (i == 25506) {
                ir8Var.b(i);
                byte[] bArr4 = new byte[i2];
                ir8Var.u.k = bArr4;
                hp5Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i);
                throw ParserException.a(null, sb.toString());
            }
            ir8Var.b(i);
            byte[] bArr5 = new byte[i2];
            ir8Var.u.v = bArr5;
            hp5Var.readFully(bArr5, 0, i2);
            return;
        }
        if (ir8Var.G == 0) {
            ir8Var.M = (int) qygVar.y(hp5Var, false, true, 8);
            ir8Var.N = qygVar.c;
            ir8Var.I = -9223372036854775807L;
            ir8Var.G = 1;
            qygVar3.B(0);
        }
        gr8 gr8Var3 = (gr8) sparseArray.get(ir8Var.M);
        if (gr8Var3 == null) {
            hp5Var.z(i2 - ir8Var.N);
            ir8Var.G = 0;
            return;
        }
        gr8Var3.X.getClass();
        if (ir8Var.G == 1) {
            ir8Var.f(hp5Var, 3);
            int i14 = (qygVar3.a[2] & 6) >> 1;
            byte b = 255;
            if (i14 == 0) {
                ir8Var.K = 1;
                int[] iArr = ir8Var.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                ir8Var.L = iArr;
                iArr[0] = (i2 - ir8Var.N) - 3;
            } else {
                ir8Var.f(hp5Var, 4);
                int i15 = (qygVar3.a[3] & 255) + 1;
                ir8Var.K = i15;
                int[] iArr2 = ir8Var.L;
                if (iArr2 == null) {
                    iArr2 = new int[i15];
                } else if (iArr2.length < i15) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i15)];
                }
                ir8Var.L = iArr2;
                if (i14 == 2) {
                    int i16 = (i2 - ir8Var.N) - 4;
                    int i17 = ir8Var.K;
                    Arrays.fill(iArr2, 0, i17, i16 / i17);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unexpected lacing value: ");
                            sb2.append(i14);
                            throw ParserException.a(null, sb2.toString());
                        }
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 4;
                        while (true) {
                            int i21 = ir8Var.K - i10;
                            if (i18 >= i21) {
                                i3 = i10;
                                i4 = i11;
                                ir8Var.L[i21] = ((i2 - ir8Var.N) - i20) - i19;
                                break;
                            }
                            ir8Var.L[i18] = i11;
                            int i22 = i20 + 1;
                            ir8Var.f(hp5Var, i22);
                            if (qygVar3.a[i20] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i23 = i10;
                            int i24 = i11;
                            while (true) {
                                if (i24 >= 8) {
                                    i5 = i11;
                                    j = 0;
                                    i6 = i22;
                                    break;
                                }
                                int i25 = i23 << (7 - i24);
                                i5 = i11;
                                if ((qygVar3.a[i20] & i25) != 0) {
                                    i6 = i22 + i24;
                                    ir8Var.f(hp5Var, i6);
                                    j = qygVar3.a[i20] & b & (~i25);
                                    while (i22 < i6) {
                                        j = (j << 8) | (qygVar3.a[i22] & b);
                                        i22++;
                                        b = 255;
                                    }
                                    if (i18 > 0) {
                                        j -= (1 << ((i24 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i24++;
                                    i11 = i5;
                                    b = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i26 = (int) j;
                            int[] iArr3 = ir8Var.L;
                            if (i18 != 0) {
                                i26 += iArr3[i18 - 1];
                            }
                            iArr3[i18] = i26;
                            i19 += i26;
                            i18++;
                            i20 = i6;
                            i10 = i23;
                            i11 = i5;
                            b = 255;
                        }
                        throw ParserException.a(null, "EBML lacing sample size out of range.");
                    }
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 4;
                    while (true) {
                        i7 = ir8Var.K - 1;
                        if (i27 >= i7) {
                            break;
                        }
                        ir8Var.L[i27] = 0;
                        while (true) {
                            i8 = i29 + 1;
                            ir8Var.f(hp5Var, i8);
                            int i30 = qygVar3.a[i29] & 255;
                            int[] iArr4 = ir8Var.L;
                            i9 = iArr4[i27] + i30;
                            iArr4[i27] = i9;
                            if (i30 != 255) {
                                break;
                            } else {
                                i29 = i8;
                            }
                        }
                        i28 += i9;
                        i27++;
                        i29 = i8;
                    }
                    ir8Var.L[i7] = ((i2 - ir8Var.N) - i29) - i28;
                }
            }
            i3 = 1;
            i4 = 0;
            byte[] bArr6 = qygVar3.a;
            ir8Var.H = ir8Var.k((bArr6[i3] & 255) | (bArr6[i4] << 8)) + ir8Var.B;
            ir8Var.O = (gr8Var3.d == 2 || (i == 163 && (qygVar3.a[2] & 128) == 128)) ? i3 : i4;
            ir8Var.G = 2;
            ir8Var.J = i4;
        }
        if (i == 163) {
            while (true) {
                int i31 = ir8Var.J;
                if (i31 >= ir8Var.K) {
                    ir8Var.G = 0;
                    return;
                } else {
                    ir8Var.c(gr8Var3, ((ir8Var.J * gr8Var3.e) / 1000) + ir8Var.H, ir8Var.O, ir8Var.l(hp5Var, gr8Var3, ir8Var.L[i31]), 0);
                    ir8Var.J++;
                }
            }
        } else {
            while (true) {
                int i32 = ir8Var.J;
                if (i32 >= ir8Var.K) {
                    return;
                }
                int[] iArr5 = ir8Var.L;
                iArr5[i32] = ir8Var.l(hp5Var, gr8Var3, iArr5[i32]);
                ir8Var.J++;
            }
        }
    }

    public void j() {
        ((ybj) ((zkb) this.b).b).q(null);
    }

    @Override // defpackage.wmb
    public Object l(Uri uri, ve4 ve4Var) {
        lz5 lz5Var = (lz5) ((wmb) this.b).l(uri, ve4Var);
        List list = Collections.EMPTY_LIST;
        return (list == null || list.isEmpty()) ? lz5Var : (lz5) lz5Var.a(list);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        s98 s98Var = (s98) this.b;
        z5j.f("The result can only set once!", s98Var.X == null);
        s98Var.X = tu1Var;
        return "ListFuture[" + this + "]";
    }

    @Override // defpackage.pkf
    public Object n(int i) {
        switch (this.a) {
            case 10:
                if (i >= 0) {
                    break;
                }
                break;
            default:
                if (i >= 0) {
                    break;
                }
                break;
        }
        return (CharSequence) ((ia) this.b).invoke(Integer.valueOf(i));
    }

    @Override // defpackage.qn6
    public void onFailure(Throwable th) {
        ((nd7) this.b).d.c(ExportException.a(2000, th));
    }

    public void p(String str, String str2) {
        boolean z;
        if (str2 == null || vmf.F(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            vd vdVar = (vd) this.b;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("commands");
            if (jSONObjectOptJSONObject == null || vdVar == null) {
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("globalShutdownMs");
            Long lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("featureShutdownMs"));
            jSONObjectOptJSONObject.optLong("tagShutdownMs");
            SharedPreferences.Editor editorEdit = vdVar.l().edit();
            boolean z2 = true;
            if (jOptLong > 0) {
                editorEdit.putLong("system.shutdown.until.ts", System.currentTimeMillis() + jOptLong);
                z = true;
            } else {
                z = false;
            }
            if (lValueOf.longValue() > 0) {
                editorEdit.putLong("system.CRASH_REPORT.shutdown.until.ts", lValueOf.longValue() + System.currentTimeMillis());
            } else {
                z2 = z;
            }
            if (z2) {
                editorEdit.apply();
            }
        } catch (Exception unused) {
            Log.w("Tracer", "Cannot parse content with Content-Type: " + str);
        }
    }

    public void q(int i, long j) throws ParserException {
        ir8 ir8Var = (ir8) this.b;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw ParserException.a(null, sb.toString());
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw ParserException.a(null, sb2.toString());
        }
        int i2 = 3;
        switch (i) {
            case 131:
                ir8Var.b(i);
                ir8Var.u.d = (int) j;
                return;
            case 136:
                ir8Var.b(i);
                ir8Var.u.V = j == 1;
                return;
            case 155:
                ir8Var.I = ir8Var.k(j);
                return;
            case 159:
                ir8Var.b(i);
                ir8Var.u.O = (int) j;
                return;
            case 176:
                ir8Var.b(i);
                ir8Var.u.m = (int) j;
                return;
            case 179:
                ir8Var.a(i);
                ir8Var.C.a(ir8Var.k(j));
                return;
            case 186:
                ir8Var.b(i);
                ir8Var.u.n = (int) j;
                return;
            case 215:
                ir8Var.b(i);
                ir8Var.u.c = (int) j;
                return;
            case 231:
                ir8Var.B = ir8Var.k(j);
                return;
            case 238:
                ir8Var.P = (int) j;
                return;
            case 241:
                if (ir8Var.E) {
                    return;
                }
                ir8Var.a(i);
                ir8Var.D.a(j);
                ir8Var.E = true;
                return;
            case 251:
                ir8Var.Q = true;
                return;
            case 16871:
                ir8Var.b(i);
                ir8Var.u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw ParserException.a(null, sb3.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw ParserException.a(null, sb4.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw ParserException.a(null, sb5.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw ParserException.a(null, sb6.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw ParserException.a(null, sb7.toString());
            case 21420:
                ir8Var.x = j + ir8Var.q;
                return;
            case 21432:
                int i3 = (int) j;
                ir8Var.b(i);
                if (i3 == 0) {
                    ir8Var.u.w = 0;
                    return;
                }
                if (i3 == 1) {
                    ir8Var.u.w = 2;
                    return;
                } else if (i3 == 3) {
                    ir8Var.u.w = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    ir8Var.u.w = 3;
                    return;
                }
            case 21680:
                ir8Var.b(i);
                ir8Var.u.o = (int) j;
                return;
            case 21682:
                ir8Var.b(i);
                ir8Var.u.q = (int) j;
                return;
            case 21690:
                ir8Var.b(i);
                ir8Var.u.p = (int) j;
                return;
            case 21930:
                ir8Var.b(i);
                ir8Var.u.U = j == 1;
                return;
            case 21998:
                ir8Var.b(i);
                ir8Var.u.f = (int) j;
                return;
            case 22186:
                ir8Var.b(i);
                ir8Var.u.R = j;
                return;
            case 22203:
                ir8Var.b(i);
                ir8Var.u.S = j;
                return;
            case 25188:
                ir8Var.b(i);
                ir8Var.u.P = (int) j;
                return;
            case 30321:
                ir8Var.b(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    ir8Var.u.r = 0;
                    return;
                }
                if (i4 == 1) {
                    ir8Var.u.r = 1;
                    return;
                } else if (i4 == 2) {
                    ir8Var.u.r = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    ir8Var.u.r = 3;
                    return;
                }
            case 2352003:
                ir8Var.b(i);
                ir8Var.u.e = (int) j;
                return;
            case 2807729:
                ir8Var.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        ir8Var.b(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            ir8Var.u.A = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            ir8Var.u.A = 1;
                            return;
                        }
                    case 21946:
                        ir8Var.b(i);
                        int i6 = (int) j;
                        if (i6 != 1) {
                            if (i6 == 16) {
                                i2 = 6;
                            } else if (i6 == 18) {
                                i2 = 7;
                            } else if (i6 != 6 && i6 != 7) {
                                i2 = -1;
                            }
                        }
                        if (i2 != -1) {
                            ir8Var.u.z = i2;
                            return;
                        }
                        return;
                    case 21947:
                        ir8Var.b(i);
                        ir8Var.u.x = true;
                        int iA = ff3.a((int) j);
                        if (iA != -1) {
                            ir8Var.u.y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        ir8Var.b(i);
                        ir8Var.u.B = (int) j;
                        return;
                    case 21949:
                        ir8Var.b(i);
                        ir8Var.u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // defpackage.pkf
    public jkf r(ViewGroup viewGroup) {
        switch (this.a) {
            case 10:
                return new a73(new TextView(viewGroup.getContext()));
            default:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.addView(new AppCompatTextView(viewGroup.getContext(), null));
                return new cbd(frameLayout);
        }
    }

    public void s(cm6 cm6Var) {
        String str = (String) this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, (String) cm6Var.invoke(), null);
        }
    }

    @Override // defpackage.c34
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    @Override // defpackage.c34
    public void setFlags(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.pkf
    public void t(jkf jkfVar, int i) {
        switch (this.a) {
            case 10:
                ((a73) jkfVar).d.setText((CharSequence) n(i));
                break;
            default:
                CharSequence charSequence = (CharSequence) n(i);
                TextView textView = ((cbd) jkfVar).d;
                textView.setText(charSequence);
                textView.setTextSize(1, 14.0f);
                break;
        }
    }

    public void u(String str) {
        wqi.c((String) this.b, str, new Object[0]);
    }

    public void v() {
        long j;
        rd4 rd4Var = (rd4) this.b;
        synchronized (tmi.b) {
            try {
                j = tmi.c ? tmi.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        rd4Var.L = j;
        rd4Var.s(true);
    }

    @Override // defpackage.lg9
    public boolean x(vf9 vf9Var) {
        Window.Callback callback = ((ho) this.b).v0.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, vf9Var);
        return true;
    }

    public g94 y(int i, Throwable th, wxf wxfVar, List list, Map map, List list2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, lb2.a), 8192);
        try {
            pei.b(th, bufferedWriter);
            bufferedWriter.close();
            return z(i, byteArrayOutputStream.toByteArray(), wxfVar, list, map, list2);
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    public g94 z(int i, byte[] bArr, wxf wxfVar, List list, Map map, List list2) throws IOException {
        String str;
        g94 g94Var;
        File fileG;
        FileOutputStream fileOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.b;
        String strB = d6j.b();
        int i2 = 0;
        File fileG2 = jz5.g(new File(context.getCacheDir(), strB.equals(context.getPackageName()) ? "tracer" : "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false))), "crashes");
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 1:
                str = "CRASH";
                break;
            case 2:
                str = "NON_FATAL";
                break;
            case 3:
                str = "FATAL";
                break;
            case 4:
                str = "ERROR";
                break;
            case 5:
                str = "WARNING";
                break;
            case 6:
                str = "NOTICE";
                break;
            case 7:
                str = "INFO";
                break;
            case 8:
                str = "DEBUG";
                break;
            case 9:
                str = "MINIDUMP";
                break;
            case 10:
                str = "ANR";
                break;
            default:
                throw null;
        }
        sb.append(str);
        sb.append('_');
        sb.append(jCurrentTimeMillis);
        File fileG3 = jz5.g(fileG2, sb.toString());
        g94 g94Var2 = null;
        if (fileG3.exists()) {
            fileG3.getName();
            return null;
        }
        try {
            nbj.b(fileG3);
            fileG = jz5.g(fileG3, "stacktrace");
            fileOutputStream = new FileOutputStream(fileG);
        } catch (IOException unused) {
            g94Var = null;
        }
        try {
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                File fileG4 = jz5.g(fileG3, "system_info");
                jz5.h(fileG4, jo7.h(wxfVar).toString());
                File fileG5 = jz5.g(fileG3, "tags");
                if (!list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jz5.h(fileG5, jSONArray.toString());
                }
                File fileG6 = jz5.g(fileG3, "all_stacktraces");
                if (map.isEmpty()) {
                    g94Var = null;
                } else {
                    TreeMap treeMap = new TreeMap(d);
                    treeMap.putAll(map);
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileG6), lb2.a), 8192));
                    try {
                        for (Map.Entry entry : treeMap.entrySet()) {
                            Thread thread = (Thread) entry.getKey();
                            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                            g94Var = g94Var2;
                            try {
                                printWriter.append((CharSequence) "Thread: ").append((CharSequence) thread.getName()).append((CharSequence) " (").append((CharSequence) thread.getState().toString()).append((CharSequence) ")");
                                printWriter.append('\n');
                                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                                    pei.d(stackTraceElement, printWriter, 0, 6);
                                }
                                g94Var2 = g94Var;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    r4j.a(printWriter, th2);
                                    throw th3;
                                }
                            }
                        }
                        g94Var = g94Var2;
                        printWriter.close();
                    } catch (Throwable th4) {
                        th = th4;
                        g94Var = g94Var2;
                    }
                }
                File fileG7 = jz5.g(fileG3, "all_logs");
                if (!list2.isEmpty()) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileG7), 8192);
                    try {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int i3 = i2 + 1;
                            ((gg8) it2.next()).a(bufferedOutputStream, i2);
                            i2 = i3;
                        }
                        bufferedOutputStream.close();
                    } finally {
                    }
                }
                return new g94(jCurrentTimeMillis, i, fileG3.getPath(), fileG4.getPath(), fileG5.getPath(), fileG.getPath(), fileG6.getPath(), fileG7.getPath());
            } catch (Throwable th5) {
                g94Var = null;
                try {
                    throw th5;
                } catch (Throwable th6) {
                    r4j.a(fileOutputStream, th5);
                    throw th6;
                }
            }
        } catch (IOException unused2) {
            jz5.b(fileG3);
            return g94Var;
        }
    }

    public iv6(mc5 mc5Var) {
        this.a = 11;
        this.b = (vd) mc5Var.b;
    }

    public iv6(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = new zkb(16);
                break;
            case 18:
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                this.b = new CopyOnWriteArraySet();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public iv6(wmb wmbVar) {
        this.a = 17;
        List list = Collections.EMPTY_LIST;
        this.b = wmbVar;
    }

    public iv6(k20 k20Var) {
        this.a = 4;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(k20Var.a).setFlags(k20Var.b).setUsage(k20Var.c);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(k20Var.d);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(k20Var.e);
            usage.setIsContentSpatialized(k20Var.f);
        }
        this.b = usage.build();
    }

    public iv6(ClipData clipData, int i) {
        this.a = 12;
        this.b = q20.i(clipData, i);
    }

    public iv6(f34 f34Var) {
        this.a = 12;
        b34.p();
        ContentInfo contentInfoG = f34Var.a.g();
        Objects.requireNonNull(contentInfoG);
        this.b = b34.m(q20.k(contentInfoG));
    }
}
