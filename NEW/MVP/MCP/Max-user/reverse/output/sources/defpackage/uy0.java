package defpackage;

import android.graphics.Insets;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayList;
import java.util.Objects;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;
import ru.ok.messages.media.crop.ActTamCropImage;

/* loaded from: classes.dex */
public final /* synthetic */ class uy0 implements b9e, lp5, zua, kw0, NativeDoubleArrayConsumer.Consumer, gu3, pu6, ox7, om6, ApplicationNameProvider, uz1, q8c, g5a, n7c {
    public final /* synthetic */ int a;
    public static final uy0 b = new uy0(0);
    public static final uy0 c = new uy0(1);
    public static final uy0 d = new uy0(2);
    public static final uy0 o = new uy0(3);
    public static final uy0 X = new uy0(4);
    public static final uy0 Y = new uy0(5);
    public static final uy0 Z = new uy0(6);

    public /* synthetic */ uy0(int i) {
        this.a = i;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        int i = ActTamCropImage.T0;
        Objects.requireNonNull(view);
        co7 co7VarF = g4iVar.a.f(7);
        if (Build.VERSION.SDK_INT < 29) {
            view.setPadding(co7VarF.a, co7VarF.b, co7VarF.c, co7VarF.d);
            return g4iVar;
        }
        Insets insetsD = co7VarF.d();
        view.setPadding(insetsD.left, insetsD.top, insetsD.right, insetsD.bottom);
        return g4iVar;
    }

    @Override // defpackage.uz1
    public boolean a(TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 22:
                return w30.g(totalCaptureResult, false);
            case 23:
                return w30.g(totalCaptureResult, false);
            default:
                return w30.g(totalCaptureResult, true);
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        ((x00) obj).i = p10.o;
    }

    @Override // defpackage.om6, defpackage.tm6
    public Object apply(Object obj) {
        gp5 gp5Var = (gp5) obj;
        gp5Var.getClass();
        return gp5Var.getClass().getSimpleName();
    }

    @Override // defpackage.q8c
    public void b(msf msfVar) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(msfVar.b.getWidth(), msfVar.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        msfVar.b(surface, ayi.a(), new l32(surface, 0, surfaceTexture));
    }

    @Override // defpackage.lp5
    public gp5[] c() {
        switch (this.a) {
            case 8:
                return new gp5[]{new q4()};
            case 9:
                return new gp5[]{new u4()};
            case 13:
                return new gp5[]{new dc(0)};
            default:
                return new gp5[]{new cd(0)};
        }
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
    }

    @Override // defpackage.pu6
    public void d(VideoFrameProcessingException videoFrameProcessingException) {
        a8i.h("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", videoFrameProcessingException);
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        s8[] s8VarArr;
        switch (this.a) {
            case 11:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList == null) {
                    s8VarArr = new s8[0];
                } else {
                    s8[] s8VarArr2 = new s8[parcelableArrayList.size()];
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        s8VarArr2[i] = (s8) s8.Z.e((Bundle) parcelableArrayList.get(i));
                    }
                    s8VarArr = s8VarArr2;
                }
                return new u8(s8VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i2 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j2 = bundle.getLong(Integer.toString(5, 36));
                boolean z = bundle.getBoolean(Integer.toString(6, 36));
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = new Uri[0];
                if (parcelableArrayList2 != null) {
                    uriArr = (Uri[]) parcelableArrayList2.toArray(uriArr);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new s8(j, i2, iArr, uriArr2, longArray, j2, z);
        }
    }

    @Override // defpackage.n7c
    public boolean f(Comparable comparable) {
        ku3 ku3VarN;
        pb2 pb2Var = (pb2) comparable;
        switch (this.a) {
            case 27:
                return (pb2Var.Q() && (ku3VarN = pb2Var.n()) != null && ku3VarN.u()) ? false : true;
            default:
                return pb2Var.Q();
        }
    }

    @Override // defpackage.b9e
    public int g(int i) {
        int i2 = AboutAppSettingsScreen.c;
        return 4;
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider
    public String getName() {
        return "";
    }

    public String h(ze4 ze4Var) {
        String str = ze4Var.h;
        return str != null ? str : ze4Var.a.toString();
    }

    public void j() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:167|36|(2:38|(2:40|(4:42|(3:165|48|49)|141|180)(4:65|(0)(3:155|68|69)|141|180))(4:82|(3:84|159|85)|141|180))(2:99|(4:114|163|115|183))|157|101|141|180) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0175, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0176, code lost:
    
        defpackage.wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", r0);
        r7 = defpackage.vfe.a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0185, code lost:
    
        ((defpackage.qwa) r7.next()).getClass();
        defpackage.qwa.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0192, code lost:
    
        r7 = defpackage.az1.v(defpackage.ctd.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0198, code lost:
    
        if (r7 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019a, code lost:
    
        if (r7 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a1, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01eb A[Catch: all -> 0x006a, LOOP:6: B:132:0x01e5->B:134:0x01eb, LOOP_END, TryCatch #4 {all -> 0x006a, blocks: (B:131:0x01dc, B:132:0x01e5, B:134:0x01eb, B:135:0x01f8, B:138:0x0202, B:139:0x0207, B:140:0x0208, B:22:0x004e, B:23:0x0057, B:25:0x005d, B:28:0x006d, B:31:0x0077, B:32:0x007c, B:33:0x007d, B:19:0x0048), top: B:162:0x01dc, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020b A[SYNTHETIC] */
    @Override // defpackage.g5a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(defpackage.tm9 r20) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.p(tm9):java.lang.Object");
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        switch (this.a) {
            case 18:
                return BatchInternalIdResponse.parse(xx7Var);
            default:
                return ClientSupportedCodecs.Request._get_okParser_$lambda$0(xx7Var);
        }
    }
}
