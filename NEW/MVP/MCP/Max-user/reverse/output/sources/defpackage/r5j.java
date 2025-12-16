package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import one.me.calls.ui.ui.call.CallScreen;
import org.json.JSONException;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes.dex */
public final class r5j implements lg9, zua, jh1, tr1, gu3, lyb, g42, k04, tm6, rn6, h8, uu1, pkf, gq8, JavaAudioDeviceModule.AudioRecordSampleHook, dbd {
    public static r5j c;
    public static r5j d;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ r5j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static xa0 B(ia0 ia0Var) throws ImageCaptureException {
        xa0 xa0Var = ia0Var.a;
        jf7 jf7Var = (jf7) xa0Var.a;
        Rect rect = xa0Var.e;
        try {
            byte[] bArrE = pfi.e(jf7Var, rect, ia0Var.b, xa0Var.f);
            try {
                ck5 ck5Var = new ck5(new pk5(new ByteArrayInputStream(bArrE)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i = xa0Var.f;
                Matrix matrix = xa0Var.g;
                RectF rectF = bhg.a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new xa0(bArrE, ck5Var, 256, size, rect2, i, matrix2, xa0Var.h);
            } catch (IOException e) {
                throw new ImageCaptureException("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new ImageCaptureException("Failed to encode the image to JPEG.", e2);
        }
    }

    public static synchronized r5j J(Context context) {
        r5j r5jVar;
        String strD;
        Context applicationContext = context.getApplicationContext();
        synchronized (r5j.class) {
            r5jVar = c;
            if (r5jVar == null) {
                r5jVar = new r5j(0, false);
                rkf rkfVarA = rkf.a(applicationContext);
                r5jVar.b = rkfVarA;
                rkfVarA.b();
                String strD2 = rkfVarA.d("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strD2) && (strD = rkfVarA.d(rkf.f("googleSignInOptions", strD2))) != null) {
                    try {
                        GoogleSignInOptions.b(strD);
                    } catch (JSONException unused) {
                    }
                }
                c = r5jVar;
            }
        }
        return r5jVar;
        return r5jVar;
    }

    public static r5j y() {
        if (d == null) {
            d = new r5j(21, new d47("HmacSHA256", 0));
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r2 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r1 = java.util.Arrays.copyOfRange(r3, r2, r0.limit());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.xa0 A(defpackage.ia0 r12, int r13) {
        /*
            r11 = this;
            xa0 r12 = r12.a
            java.lang.Object r0 = r11.b
            h08 r0 = (defpackage.h08) r0
            java.lang.Object r1 = r12.a
            jf7 r1 = (defpackage.jf7) r1
            java.lang.Object r0 = r0.b
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r0
            r2 = 0
            if (r0 != 0) goto L29
            h08[] r0 = r1.s()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.I()
            int r1 = r0.capacity()
            byte[] r1 = new byte[r1]
            r0.rewind()
            r0.get(r1)
        L27:
            r3 = r1
            goto L84
        L29:
            h08[] r0 = r1.s()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.I()
            int r1 = r0.capacity()
            byte[] r3 = new byte[r1]
            r0.rewind()
            r0.get(r3)
            r4 = 2
            r5 = r4
        L41:
            int r6 = r5 + 4
            r7 = -1
            if (r6 > r1) goto L68
            r6 = r3[r5]
            if (r6 == r7) goto L4b
            goto L68
        L4b:
            if (r6 != r7) goto L56
            int r6 = r5 + 1
            r6 = r3[r6]
            r7 = -38
            if (r6 != r7) goto L56
            goto L7b
        L56:
            int r6 = r5 + 2
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r7 = r5 + 3
            r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L41
        L68:
            int r2 = r4 + 1
            if (r2 <= r1) goto L6e
            r2 = r7
            goto L79
        L6e:
            r5 = r3[r4]
            if (r5 != r7) goto L9a
            r5 = r3[r2]
            r6 = -40
            if (r5 != r6) goto L9a
            r2 = r4
        L79:
            if (r2 == r7) goto L84
        L7b:
            int r0 = r0.limit()
            byte[] r1 = java.util.Arrays.copyOfRange(r3, r2, r0)
            goto L27
        L84:
            ck5 r4 = r12.b
            java.util.Objects.requireNonNull(r4)
            android.util.Size r6 = r12.d
            android.graphics.Rect r7 = r12.e
            int r8 = r12.f
            android.graphics.Matrix r9 = r12.g
            r02 r10 = r12.h
            xa0 r2 = new xa0
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L9a:
            r5 = r13
            r4 = r2
            r13 = r5
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5j.A(ia0, int):xa0");
    }

    public void C(Object obj, String str) {
        HashMap map = (HashMap) this.b;
        if (obj == null) {
            map.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            map.put(str, obj);
            return;
        }
        int i = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            String str2 = yd4.b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i < zArr.length) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            map.put(str, boolArr);
            return;
        }
        if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            String str3 = yd4.b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i < bArr.length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            map.put(str, bArr2);
            return;
        }
        if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            String str4 = yd4.b;
            Integer[] numArr = new Integer[iArr.length];
            while (i < iArr.length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            map.put(str, numArr);
            return;
        }
        if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            String str5 = yd4.b;
            Long[] lArr = new Long[jArr.length];
            while (i < jArr.length) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            map.put(str, lArr);
            return;
        }
        if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            String str6 = yd4.b;
            Float[] fArr2 = new Float[fArr.length];
            while (i < fArr.length) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            map.put(str, fArr2);
            return;
        }
        if (cls != double[].class) {
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }
        double[] dArr = (double[]) obj;
        String str7 = yd4.b;
        Double[] dArr2 = new Double[dArr.length];
        while (i < dArr.length) {
            dArr2[i] = Double.valueOf(dArr[i]);
            i++;
        }
        map.put(str, dArr2);
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + yy7Var.getName() + " should be initialized before get.");
    }

    public void E(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            C(entry.getValue(), (String) entry.getKey());
        }
    }

    public void F(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void G(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public void H(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        in inVar = (in) this.b;
        WeakHashMap weakHashMap = hfh.a;
        g4i g4iVar2 = inVar.getFitsSystemWindows() ? g4iVar : null;
        if (!Objects.equals(inVar.t0, g4iVar2)) {
            inVar.t0 = g4iVar2;
            inVar.setWillNotDraw(!(inVar.I0 != null && inVar.getTopInset() > 0));
            inVar.requestLayout();
        }
        return g4iVar;
    }

    @Override // defpackage.dbd
    public void O(Object obj, yy7 yy7Var, Object obj2) {
        this.b = obj2;
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        em7 em7Var = (em7) obj;
        bf5 bf5Var = (bf5) this.b;
        bf5Var.q.getClass();
        long jB = xxf.b();
        if (em7Var.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        z5j.b(jB >= 0);
        em7Var.g = jB;
        if (em7Var.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        em7Var.h = true;
        em7Var.b();
        wsf.b(wsf.g(em7Var.d), new y6i(15, this), bf5Var.h);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        ttg ttgVar = (ttg) obj;
        z72 z72Var = (z72) this.b;
        if (ttgVar.a()) {
            String str = ttgVar.h.a;
            ige igeVar = z72Var.a;
            if (igeVar == null) {
                igeVar = null;
            }
            w63 w63Var = (w63) igeVar.H.getValue();
            long j = z72Var.d;
            pb2 pb2Var = (pb2) w63Var.j(j).a.getValue();
            if (pb2Var == null) {
                wqi.e(z72Var.Y, "updateChatAvatar: chat not found, chatId=" + j, null);
                z72Var.v();
                return;
            }
            ige igeVar2 = null;
            fh2 fh2Var = new fh2(pb2Var.b.a, 0, null, false, null, null, null, str, z72Var.o, null, false, 0L);
            zl3 zl3Var = z72Var.Z;
            if (zl3Var != null) {
                u2f u2fVarG = z72Var.a().G(fh2Var, ((n0g) z72Var.o()).a());
                ige igeVar3 = z72Var.a;
                if (igeVar3 != null) {
                    igeVar2 = igeVar3;
                }
                d1g d1gVar = (d1g) igeVar2.G.getValue();
                d1gVar.getClass();
                m76 m76VarJ = u2fVarG.j(new b1g(d1gVar, 3, 0));
                qu1 qu1Var = new qu1(new mc5(8, z72Var), 2, new iv6(9, z72Var));
                m76VarJ.k(qu1Var);
                zl3Var.a(qu1Var);
            }
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        u10 u10Var;
        m35 m35Var = (m35) obj;
        e35 e35Var = (e35) this.b;
        y25 y25Var = e35Var.a;
        z25 z25Var = new z25(y25Var.a, y25Var.b);
        String str = e35Var.b;
        long j = e35Var.c;
        wvg wvgVar = e35Var.d;
        p2h p2hVar = e35Var.e;
        if (p2hVar == null) {
            u10Var = null;
        } else {
            u10Var = new u10();
            u10Var.b = p2hVar.c;
            u10Var.a = p2hVar.b;
            u10Var.c = p2hVar.a;
            u10Var.d = p2hVar.d;
        }
        return new kk3(2, new ci(m35Var, 6, new g35(z25Var, str, j, wvgVar, u10Var)));
    }

    @Override // defpackage.jh1, defpackage.pp1
    public void b() {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        ((yx1) callScreen.a.getValue()).h(3, 2, callScreen.H0().v());
        String str = ap7.a;
        ap7.i(callScreen.getContext(), dqi.u(callScreen.H0().w().k), null);
    }

    @Override // defpackage.jh1, defpackage.pp1
    public void c() {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        ((yx1) callScreen.a.getValue()).h(1, 2, callScreen.H0().v());
        xb3.a(callScreen.getContext(), dqi.u(callScreen.H0().w().k));
        if (xb3.b()) {
            String string = callScreen.getContext().getString(d3d.call_link_share_dialog_share_link_copy);
            ccb ccbVar = new ccb(callScreen);
            ccbVar.h(string);
            ccbVar.d(new ns1(4, null));
            int i = 0;
            ccbVar.c(new kcb(i, i, i, 3));
            ccbVar.i();
        }
    }

    @Override // defpackage.jh1, defpackage.pp1
    public void d() {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        rha rhaVar = CallScreen.N0;
        callScreen.H0().u();
    }

    @Override // defpackage.h8
    public void e(Object obj) {
        Map map = (Map) obj;
        c cVar = (c) this.b;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        oi6 oi6Var = (oi6) cVar.F.pollFirst();
        if (oi6Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = oi6Var.a;
        int i2 = oi6Var.b;
        a aVarC = cVar.c.c(str);
        if (aVarC != null) {
            aVarC.Z(i2, strArr, iArr);
            return;
        }
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.lg9
    public void f(vf9 vf9Var, boolean z) {
        if (vf9Var instanceof qnf) {
            ((qnf) vf9Var).J0.k().c(false);
        }
        lg9 lg9Var = ((h7) this.b).o;
        if (lg9Var != null) {
            lg9Var.f(vf9Var, z);
        }
    }

    public yd4 g() throws Throwable {
        yd4 yd4Var = new yd4((HashMap) this.b);
        yd4.f(yd4Var);
        return yd4Var;
    }

    @Override // defpackage.jh1, defpackage.pp1
    public void h() {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        ((yx1) callScreen.a.getValue()).h(2, 2, callScreen.H0().v());
        wo1 wo1VarH0 = callScreen.H0();
        xfh.r(wo1VarH0.L0, new ym1(dqi.u(wo1VarH0.w().k)));
    }

    @Override // defpackage.ft1
    public void i(zi1 zi1Var) {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        rha rhaVar = CallScreen.N0;
        callScreen.H0().A(zi1Var);
    }

    @Override // defpackage.ft1
    public void j(zi1 zi1Var, Point point) {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        rha rhaVar = CallScreen.N0;
        callScreen.H0().C(zi1Var, point);
    }

    @Override // defpackage.ft1
    public void k(zi1 zi1Var) {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        rha rhaVar = CallScreen.N0;
        callScreen.H0().Z.f(zi1Var);
    }

    @Override // defpackage.lyb
    public x26 l(long j) {
        return gw0.x(new d53(((w63) ((k18) this.b).getValue()).j(j), 12), new d03(j, null));
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        sn6 sn6Var = (sn6) this.b;
        z5j.f("The result can only set once!", sn6Var.b == null);
        sn6Var.b = tu1Var;
        return "FutureChain[" + sn6Var + "]";
    }

    @Override // defpackage.pkf
    public Object n(int i) {
        switch (this.a) {
            case 23:
                if (i >= 0) {
                    return (CharSequence) ((vaf) this.b).invoke(Integer.valueOf(i));
                }
                return null;
            default:
                return z(i);
        }
    }

    @Override // defpackage.g42
    public void o(Typeface typeface) {
        ne3 ne3Var = (ne3) this.b;
        if (ne3Var.o(typeface)) {
            ne3Var.i(false);
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        ((bf5) this.b).b(0, "Unable to acquire InputBuffer.", th);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordSampleHook
    public void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        hlb flbVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 2) {
            flbVar = new flb(i5 >> 1, i4, 0, bArr);
        } else if (i == 3) {
            flbVar = new flb(i5, i4, 1, bArr);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(wy1.e(i, "Audio format ", " is not supported. Please, use PCM 8 bit / 16 bit / float"));
            }
            flbVar = new glb(bArr, i4, i5);
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            q8i q8iVar = (q8i) it.next();
            if (q8iVar.c < jElapsedRealtime) {
                q8iVar.c = q8iVar.b + jElapsedRealtime;
                q8iVar.a.onSample(i, i2, i3, flbVar);
            }
        }
    }

    @Override // defpackage.ft1
    public void p(zi1 zi1Var) {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        rha rhaVar = CallScreen.N0;
        if (callScreen.H0().t(callScreen.F0().g)) {
            CallScreen.z0(callScreen);
        }
    }

    @Override // defpackage.ft1
    public void q() {
        h91 h91Var;
        m91 m91Var = ((p91) this.b).I0;
        if (m91Var == null || (h91Var = ((i91) ((y6i) m91Var).b).N0) == null) {
            return;
        }
        CallScreen callScreen = ((sl1) h91Var).a;
        rha rhaVar = CallScreen.N0;
        callScreen.H0().Z.h();
    }

    @Override // defpackage.pkf
    public jkf r(ViewGroup viewGroup) {
        switch (this.a) {
            case 23:
                return new yq7(new AppCompatTextView(viewGroup.getContext(), null));
            default:
                return new z28(new AppCompatTextView(viewGroup.getContext(), null, 0));
        }
    }

    public xw5 s() {
        u5i u5iVar = (u5i) this.b;
        String strI = ((Long) u5iVar.a) == null ? " fileSizeLimit" : "";
        if (((Long) u5iVar.b) == null) {
            strI = strI.concat(" durationLimitMillis");
        }
        if (((File) u5iVar.c) == null) {
            strI = az1.i(strI, " file");
        }
        if (strI.isEmpty()) {
            return new xw5(new ea0(((Long) u5iVar.a).longValue(), ((Long) u5iVar.b).longValue(), (File) u5iVar.c));
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    @Override // defpackage.pkf
    public void t(jkf jkfVar, int i) {
        switch (this.a) {
            case 23:
                ((yq7) jkfVar).d.setText((CharSequence) n(i));
                break;
            default:
                Character chZ = z(i);
                AppCompatTextView appCompatTextView = ((z28) jkfVar).d;
                if (chZ == null) {
                    appCompatTextView.setText((CharSequence) null);
                    break;
                } else {
                    appCompatTextView.setText(new char[]{chZ.charValue()}, 0, 1);
                    break;
                }
        }
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 3:
                long j = ((AtomicLong) this.b).get();
                ozi.a(2);
                return vmf.J(Long.toString(j, 2), 64, '0');
            case 29:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.b != null) {
                    str = "value=" + this.b;
                } else {
                    str = "value not initialized yet";
                }
                return u45.l(sb, str, ')');
            default:
                return super.toString();
        }
    }

    public synchronized void u() {
        rkf rkfVar = (rkf) this.b;
        ReentrantLock reentrantLock = rkfVar.a;
        reentrantLock.lock();
        try {
            rkfVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public byte[] v(byte[] bArr, byte[] bArr2, int i) throws IllegalStateException, InvalidKeyException {
        d47 d47Var = (d47) this.b;
        SecretKeySpec secretKeySpec = (bArr == null || bArr.length <= 0) ? null : new SecretKeySpec(bArr, d47Var.a);
        if (i <= 0) {
            throw new IllegalArgumentException("out length bytes must be at least 1");
        }
        if (secretKeySpec == null) {
            throw new IllegalArgumentException("provided pseudoRandomKey must not be null");
        }
        try {
            Mac macB = d47Var.b();
            macB.init(secretKeySpec);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArrDoFinal = new byte[0];
            int iCeil = (int) Math.ceil(i / macB.getMacLength());
            if (iCeil > 255) {
                throw new IllegalArgumentException(wy1.e(i, "out length must be maximal 255 * hash-length; requested: ", " bytes"));
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            int i2 = 0;
            while (i2 < iCeil) {
                macB.update(bArrDoFinal);
                macB.update(bArr2);
                i2++;
                macB.update((byte) i2);
                bArrDoFinal = macB.doFinal();
                int iMin = Math.min(i, bArrDoFinal.length);
                byteBufferAllocate.put(bArrDoFinal, 0, iMin);
                i -= iMin;
            }
            return byteBufferAllocate.array();
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    public byte[] w(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        d47 d47Var = (d47) this.b;
        String str = d47Var.a;
        SecretKeySpec secretKeySpec = bArr.length <= 0 ? null : new SecretKeySpec(bArr, str);
        if (secretKeySpec == null) {
            int macLength = d47Var.b().getMacLength();
            secretKeySpec = macLength > 0 ? new SecretKeySpec(new byte[macLength], str) : null;
        }
        if (bArr2 == null || bArr2.length <= 0) {
            throw new IllegalArgumentException("provided inputKeyingMaterial must be at least of size 1 and not null");
        }
        try {
            Mac macB = d47Var.b();
            macB.init(secretKeySpec);
            return macB.doFinal(bArr2);
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    @Override // defpackage.lg9
    public boolean x(vf9 vf9Var) {
        h7 h7Var = (h7) this.b;
        if (vf9Var == h7Var.c) {
            return false;
        }
        ((qnf) vf9Var).K0.getClass();
        h7Var.getClass();
        lg9 lg9Var = h7Var.o;
        if (lg9Var != null) {
            return lg9Var.x(vf9Var);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Character z(int r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 >= 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r2.b
            em6 r1 = (defpackage.em6) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r1.invoke(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 != 0) goto L15
            return r0
        L15:
            java.lang.Character r3 = defpackage.vmf.x(r3)
            if (r3 == 0) goto L31
            char r1 = r3.charValue()
            boolean r1 = java.lang.Character.isLetter(r1)
            if (r1 == 0) goto L26
            r0 = r3
        L26:
            if (r0 == 0) goto L31
            char r3 = r0.charValue()
            char r3 = java.lang.Character.toUpperCase(r3)
            goto L33
        L31:
            r3 = 35
        L33:
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5j.z(int):java.lang.Character");
    }

    public /* synthetic */ r5j(int i, boolean z) {
        this.a = i;
    }

    public r5j(long j) {
        this.a = 3;
        this.b = new AtomicLong(j);
    }

    public r5j(i17 i17Var) {
        this.a = 22;
        this.b = new h08(i17Var);
    }

    public r5j(CameraDevice cameraDevice, Handler handler) {
        this.a = 8;
        if (Build.VERSION.SDK_INT >= 28) {
            cameraDevice.getClass();
            this.b = new z12(cameraDevice, null);
        } else {
            this.b = new y12(cameraDevice, new a22(handler));
        }
    }

    public r5j(File file) {
        this.a = 18;
        u5i u5iVar = new u5i();
        u5iVar.a = 0L;
        u5iVar.b = 0L;
        this.b = u5iVar;
        u5iVar.c = file;
    }

    public r5j(int i) {
        this.a = i;
        switch (i) {
            case 28:
                this.b = new CopyOnWriteArraySet();
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }
}
