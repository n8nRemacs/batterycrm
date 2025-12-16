package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ProcessingException;
import androidx.work.WorkRequest;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class jdc implements bd3, lua, uu1, JavaAudioDeviceModule.AudioRecordErrorCallback {
    public static jdc X;
    public static final sgg[] o = {sgg.a, sgg.b, sgg.c, sgg.d, sgg.o, sgg.X, sgg.Y, sgg.Z, sgg.s0, sgg.t0};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ jdc() {
        this.a = 19;
    }

    public static sgg i(lbg lbgVar) {
        Object[] objArr = {lbg.certificate, lbg.certificate_verify, lbg.finished};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        if (!Collections.unmodifiableList(arrayList).contains(lbgVar)) {
            return sgg.values()[lbgVar.ordinal()];
        }
        throw new IllegalArgumentException("cannot convert ambiguous type " + lbgVar);
    }

    public static sgg j(lbg lbgVar, boolean z) {
        return lbgVar == lbg.finished ? z ? sgg.t0 : sgg.Y : lbgVar == lbg.certificate ? z ? sgg.Z : sgg.o : lbgVar == lbg.certificate_verify ? z ? sgg.s0 : sgg.X : sgg.values()[lbgVar.ordinal()];
    }

    public static jdc x(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new jdc(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void A(h07 h07Var) {
        ((ConcurrentHashMap) this.c).put(j(h07Var.b(), false), h07Var.a());
    }

    public void B() {
        ((TypedArray) this.c).recycle();
    }

    public void C() {
        ((gsf) this.b).release();
        jei.d(new bee(15, this));
    }

    public x10 D() {
        x10 x10Var = new x10();
        x10Var.a = new ArrayList((List) this.b);
        x10Var.b = (yl7) this.c;
        return x10Var;
    }

    public k65 E(tb0 tb0Var) {
        Rect rectG;
        jei.b();
        this.d = new k65();
        dsf dsfVar = tb0Var.a;
        for (ua0 ua0Var : tb0Var.b) {
            k65 k65Var = (k65) this.d;
            Rect rect = ua0Var.d;
            int i = ua0Var.f;
            boolean z = ua0Var.g;
            Matrix matrix = dsfVar.b;
            Rect rect2 = dsfVar.d;
            Matrix matrix2 = new Matrix(matrix);
            RectF rectF = new RectF(rect);
            Size size = ua0Var.e;
            RectF rectF2 = bhg.a;
            float f = 0;
            Matrix matrixA = bhg.a(rectF, new RectF(f, f, size.getWidth(), size.getHeight()), i, z);
            matrix2.postConcat(matrixA);
            z5j.b(bhg.c(bhg.f(bhg.d(rect), i), false, size));
            if (ua0Var.h) {
                z5j.a("Output crop rect " + rect + " must contain input crop rect " + rect2, rect.contains(rect2));
                rectG = new Rect();
                RectF rectF3 = new RectF(rect2);
                matrixA.mapRect(rectF3);
                rectF3.round(rectG);
            } else {
                rectG = bhg.g(size);
            }
            Rect rect3 = rectG;
            xa6 xa6VarA = dsfVar.g.a();
            xa6VarA.a = size;
            k65Var.put(ua0Var, new dsf(ua0Var.b, ua0Var.c, xa6VarA.b(), matrix2, false, rect3, dsfVar.i - i, -1, dsfVar.e != z));
        }
        try {
            ((gsf) this.b).f(dsfVar.d((n22) this.c, true));
        } catch (ProcessingException e) {
            gri.c("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (Map.Entry entry : ((k65) this.d).entrySet()) {
            k(dsfVar, entry);
            ((dsf) entry.getValue()).a(new zcd(this, dsfVar, entry, 10));
        }
        s32 s32Var = new s32(4, (k65) this.d);
        dsfVar.getClass();
        dsfVar.o.add(s32Var);
        return (k65) this.d;
    }

    @Override // defpackage.bd3
    public sk4 a(hf6 hf6Var, Surface surface, boolean z, LogSessionId logSessionId) {
        sk4 sk4VarA = ((bd3) this.b).a(hf6Var, surface, z, logSessionId);
        this.d = sk4VarA.c();
        return sk4VarA;
    }

    @Override // defpackage.lua
    public void b(jm jmVar) {
        ((kob) this.d).X = jmVar;
    }

    @Override // defpackage.lua
    public void c() {
        rl rlVar = (rl) this.b;
        ((wo3) rlVar.b).setSessionInfo(null);
        rlVar.c = null;
        ((bu4) this.c).e = true;
    }

    @Override // defpackage.bd3
    public sk4 d(hf6 hf6Var, LogSessionId logSessionId) {
        sk4 sk4VarD = ((bd3) this.b).d(hf6Var, logSessionId);
        this.c = sk4VarD.c();
        return sk4VarD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(int r11) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdc.e(int):int");
    }

    public int f() {
        ow6 ow6Var = (ow6) this.d;
        if (ow6Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = ow6Var.a;
        FingerprintManager fingerprintManagerC = a06.c(context);
        if (fingerprintManagerC == null || !a06.e(fingerprintManagerC)) {
            return 12;
        }
        FingerprintManager fingerprintManagerC2 = a06.c(context);
        return (fingerprintManagerC2 == null || !a06.d(fingerprintManagerC2)) ? 11 : 0;
    }

    public void g() {
        v2h v2hVar = (v2h) this.c;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = (MediaCodec) this.b;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (iDequeueOutputBuffer != -3) {
            if (iDequeueOutputBuffer == -2) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                r9a r9aVar = v2hVar.c;
                r9aVar.a = ((MediaMuxer) r9aVar.f).addTrack(outputFormat);
                return;
            }
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer < 0) {
                    Log.e("Encoder", "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                    return;
                }
                if (bufferInfo.size > 0) {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                    if ((bufferInfo.flags & 2) == 0) {
                        v2hVar.w.b((float) (((int) (((bufferInfo.presentationTimeUs / (v2hVar.y - v2hVar.x)) * 100.0d) * 100.0d)) / 100.0d));
                    }
                    r9a r9aVar2 = v2hVar.c;
                    MediaMuxer mediaMuxer = (MediaMuxer) r9aVar2.f;
                    if (r9aVar2.b()) {
                        if (!r9aVar2.c) {
                            mediaMuxer.start();
                            r9aVar2.c = true;
                        }
                        r9aVar2.a();
                        mediaMuxer.writeSampleData(r9aVar2.a, outputBuffer, bufferInfo);
                    } else {
                        ((ArrayList) r9aVar2.g).add(new q9a(r9aVar2.a, outputBuffer, bufferInfo));
                    }
                }
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    MediaCodec mediaCodec2 = (MediaCodec) v2hVar.h.b;
                    if (mediaCodec2 != null) {
                        mediaCodec2.stop();
                    }
                    MediaCodec mediaCodec3 = (MediaCodec) v2hVar.h.b;
                    if (mediaCodec3 != null) {
                        mediaCodec3.release();
                    }
                    v2hVar.g.a();
                    ((MediaMuxer) v2hVar.c.f).stop();
                    ((MediaMuxer) v2hVar.c.f).release();
                    v2hVar.l = true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, k18] */
    public void h(Collection collection) {
        zy0 zy0Var;
        HashMap map;
        HashMap map2 = new HashMap(collection.size());
        Iterator it = collection.iterator();
        long j = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            zy0Var = zy0.a;
            if (!zHasNext) {
                break;
            }
            zy0 zy0Var2 = (zy0) it.next();
            Iterator it2 = ((ArrayList) this.b).iterator();
            long j2 = 0;
            long j3 = 0;
            while (it2.hasNext()) {
                my0 my0Var = (my0) it2.next();
                if (zy0Var2 != zy0Var) {
                    if (my0Var.d == zy0Var2) {
                    }
                }
                it2.remove();
                if (my0Var.a.delete()) {
                    j2++;
                    j3 += my0Var.b;
                    wqi.c("jdc", "deleteEntries: delete=%s", my0Var);
                } else {
                    wqi.f("jdc", "deleteEntries: failed to delete=%s", my0Var);
                }
            }
            wqi.c("jdc", "deleteEntries: cacheType=%s removed: files=%d, bytes=%d", zy0Var2, Long.valueOf(j2), Long.valueOf(j3));
            j += j3;
            map2.put(zy0Var2, Long.valueOf(j3));
        }
        rv5 rv5Var = (rv5) this.c;
        sv5 sv5Var = (sv5) this.d;
        k18 k18Var = rv5Var.a;
        ((dd) k18Var.getValue()).e("ACTION_CACHE_CLEARED");
        Set<Map.Entry> setEntrySet = map2.entrySet();
        long j4 = 0;
        for (Map.Entry entry : setEntrySet) {
            zy0 zy0Var3 = (zy0) entry.getKey();
            if (zy0Var3 == zy0.b || zy0Var3 == zy0Var) {
                df7 df7VarE = zk6.e();
                map = map2;
                os5 os5Var = new os5(22);
                df7VarE.f.d(os5Var);
                df7VarE.g.d(os5Var);
                tx4 tx4Var = (tx4) df7VarE.c.get();
                tx4Var.a().a();
                ((uv0) tx4Var.d.getValue()).a();
                Iterator it3 = ((bh7) tx4Var.f.getValue()).entrySet().iterator();
                while (it3.hasNext()) {
                    ((uv0) ((Map.Entry) it3.next()).getValue()).a();
                }
            } else {
                map = map2;
            }
            long jLongValue = ((Long) entry.getValue()).longValue();
            j4 += jLongValue;
            File fileA = sv5Var.a(zy0Var3);
            ((dd) k18Var.getValue()).d(jLongValue, "ACTION_CACHE_CLEARED_SIZE", fileA != null ? fileA.getName() : zy0Var3.name());
            map2 = map;
        }
        if (vy0.a.equals(map2.keySet()) || (setEntrySet.size() == 1 && ((Map.Entry) setEntrySet.iterator().next()).getKey() == zy0Var)) {
            ((dd) k18Var.getValue()).d(j4, "ACTION_CACHE_CLEARED_SIZE", "ALL");
        }
        wqi.c("jdc", "clearCacheTypes: removed %d bytes", Long.valueOf(j));
    }

    public void k(dsf dsfVar, Map.Entry entry) {
        dsf dsfVar2 = (dsf) entry.getValue();
        rb0 rb0Var = null;
        rb0 rb0Var2 = new rb0(dsfVar.g.a, ((ua0) entry.getKey()).d, dsfVar.c ? (n22) this.c : null, ((ua0) entry.getKey()).f, ((ua0) entry.getKey()).g);
        int i = ((ua0) entry.getKey()).c;
        dsfVar2.getClass();
        jei.b();
        dsfVar2.b();
        z5j.f("Consumer can only be linked once.", !dsfVar2.j);
        dsfVar2.j = true;
        csf csfVar = dsfVar2.l;
        wsf.b(wsf.l(csfVar.c(), new bsf(dsfVar2, csfVar, i, rb0Var2, rb0Var), ayi.d()), new aqc(this, 8, dsfVar2), ayi.d());
    }

    public oud l(int i, byte[] bArr) throws RtcNotificationSerializeException {
        y6i y6iVar = (y6i) this.b;
        if (i == 0) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (i != 2) {
            throw new RtcNotificationSerializeException(new UnsupportedOperationException("Only binary format is supported"));
        }
        try {
            tm9 tm9VarA = kl9.a(bArr);
            try {
                int i2 = 0;
                switch (tm9VarA.s0()) {
                    case 1:
                        int iU0 = tm9VarA.u0();
                        HashMap map = new HashMap();
                        while (i2 < iU0) {
                            nt1 nt1VarJ = paj.J(tm9VarA.w0());
                            int iS0 = tm9VarA.s0();
                            if (nt1VarJ != null) {
                                map.put(Integer.valueOf(iS0), nt1VarJ);
                            }
                            i2++;
                        }
                        ((ConcurrentHashMap) y6iVar.b).putAll(map);
                        rc7 rc7Var = new rc7(map);
                        tm9VarA.close();
                        return rc7Var;
                    case 2:
                        int iN0 = tm9VarA.n0();
                        ArrayList arrayList = new ArrayList();
                        while (i2 < iN0) {
                            ti1 ti1VarB = y6iVar.B(tm9VarA.s0());
                            if (ti1VarB != null) {
                                arrayList.add(ti1VarB);
                            }
                            i2++;
                        }
                        e20 e20Var = new e20();
                        e20Var.a = arrayList;
                        tm9VarA.close();
                        return e20Var;
                    case 3:
                        ti1 ti1VarB2 = y6iVar.B(tm9VarA.s0());
                        s7f s7fVar = new s7f();
                        if (ti1VarB2 == null) {
                            throw new IllegalArgumentException("Illegal 'speaker' value: null");
                        }
                        s7fVar.a = ti1VarB2;
                        tm9VarA.close();
                        return s7fVar;
                    case 4:
                        int iN02 = tm9VarA.n0();
                        ArrayList arrayList2 = new ArrayList();
                        while (i2 < iN02) {
                            ti1 ti1VarB3 = y6iVar.B(tm9VarA.s0());
                            if (ti1VarB3 != null) {
                                arrayList2.add(ti1VarB3);
                            }
                            i2++;
                        }
                        u9f u9fVar = new u9f();
                        u9fVar.a = arrayList2;
                        tm9VarA.close();
                        return u9fVar;
                    case 5:
                        tbh tbhVarA = ((n50) this.d).a(tm9VarA);
                        tm9VarA.close();
                        return tbhVarA;
                    case 6:
                        int iU02 = tm9VarA.u0();
                        HashMap map2 = new HashMap();
                        while (i2 < iU02) {
                            map2.put(y6iVar.B(tm9VarA.s0()), Float.valueOf(tm9VarA.s0() / 100.0f));
                            i2++;
                        }
                        lea leaVar = new lea(map2);
                        tm9VarA.close();
                        return leaVar;
                    case 7:
                    default:
                        tm9VarA.close();
                        return null;
                    case 8:
                        bkh bkhVarS = ((ssb) this.c).s(tm9VarA);
                        tm9VarA.close();
                        return bkhVarS;
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification body: ".concat(h27.a(bArr)), th));
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        tu1Var.a(new ue(25, this), ayi.a());
        ((zz6) this.d).a.set(tu1Var);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    public void n(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.b;
        cpc cpcVar = new cpc(byteArrayOutputStream, map, (HashMap) this.c, (pqa) this.d);
        if (obj == null) {
            return;
        }
        pqa pqaVar = (pqa) map.get(obj.getClass());
        if (pqaVar != null) {
            pqaVar.a(obj, cpcVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public w10 o(int i) {
        List list = (List) this.b;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (w10) list.get(i);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordError(String str) {
        ((n50) this.b).onWebRtcAudioRecordError(str);
        y6d y6dVar = (y6d) this.c;
        y6dVar.log("SharedPeerConnectionFac", "onWebRtcAudioRecordError: " + str);
        y6dVar.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordError", new Exception(wy1.h("onWebRtcAudioRecordError ", str)));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordInitError(String str) {
        ((n50) this.b).onWebRtcAudioRecordInitError(str);
        y6d y6dVar = (y6d) this.c;
        y6dVar.log("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError: " + str);
        y6dVar.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError", new Exception(wy1.h("onWebRtcAudioRecordInitError ", str)));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((n50) this.b).onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        a9h.o("onWebRtcAudioRecordStartError: . ", str, (y6d) this.c, "SharedPeerConnectionFac");
        ((rve) this.d).a.execute(new aee(this, 12, str));
    }

    public int p() {
        List list = (List) this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public w10 q(String str) {
        for (w10 w10Var : (List) this.b) {
            if (l8g.a(str, w10Var.r)) {
                return w10Var;
            }
        }
        return null;
    }

    public w10 r(s10 s10Var) {
        for (w10 w10Var : (List) this.b) {
            if (w10Var.a == s10Var) {
                return w10Var;
            }
        }
        return null;
    }

    public ColorStateList s(int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = z7.c((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public Drawable t(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : eri.a((Context) this.b, resourceId);
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                i5i i5iVar = (i5i) ((i5i) this.c).b;
                String str = "";
                while (i5iVar != null) {
                    Object obj = i5iVar.a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    i5iVar = (i5i) i5iVar.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Drawable u(int i) {
        int resourceId;
        Drawable drawableC;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        ko koVarA = ko.a();
        Context context = (Context) this.b;
        synchronized (koVarA) {
            drawableC = koVarA.a.c(resourceId, context, true);
        }
        return drawableC;
    }

    public Typeface v(int i, int i2, gp gpVar) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        Context context = (Context) this.b;
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = lod.a;
        if (context.isRestricted()) {
            return null;
        }
        return lod.b(context, resourceId, typedValue, i2, gpVar, true, false);
    }

    public byte[] w(sgg sggVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
        if (!concurrentHashMap.containsKey(sggVar)) {
            MessageDigest messageDigest = (MessageDigest) this.b;
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.c;
            for (int i = 0; i < 10; i++) {
                sgg sggVar2 = o[i];
                if (concurrentHashMap2.containsKey(sggVar2)) {
                    messageDigest.update((byte[]) concurrentHashMap2.get(sggVar2));
                }
                if (sggVar2 == sggVar) {
                    break;
                }
            }
            concurrentHashMap.put(sggVar, messageDigest.digest());
        }
        return (byte[]) concurrentHashMap.get(sggVar);
    }

    public void y(h07 h07Var) {
        Object[] objArr = {lbg.certificate, lbg.certificate_verify, lbg.finished};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        if (Collections.unmodifiableList(arrayList).contains(h07Var.b())) {
            throw new IllegalArgumentException();
        }
        ((ConcurrentHashMap) this.c).put(i(h07Var.b()), h07Var.a());
    }

    public void z(h07 h07Var) {
        ((ConcurrentHashMap) this.c).put(j(h07Var.b(), true), h07Var.a());
    }

    public /* synthetic */ jdc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ jdc(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public jdc(y6i y6iVar, y6d y6dVar) {
        this.a = 14;
        this.b = y6iVar;
        this.c = new ssb(y6iVar, 17, y6dVar);
        this.d = new n50(y6dVar);
    }

    public jdc(ArrayList arrayList, rv5 rv5Var, sv5 sv5Var) {
        this.a = 4;
        this.b = arrayList;
        this.c = rv5Var;
        this.d = sv5Var;
        System.currentTimeMillis();
    }

    public jdc(int i, int i2, int i3, int i4, v2h v2hVar) throws IOException {
        this.a = 9;
        this.c = v2hVar;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i3);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i4);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.b = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.d = mediaCodecCreateEncoderByType.createInputSurface();
        mediaCodecCreateEncoderByType.start();
    }

    public jdc(x10 x10Var) {
        this.a = 2;
        this.b = x10Var.a;
        this.c = x10Var.b;
        this.d = x10Var.c;
    }

    public jdc(bd3 bd3Var) {
        this.a = 5;
        this.b = bd3Var;
    }

    public jdc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = 0;
        this.b = oneMeRoomDatabase;
        this.c = new ai(oneMeRoomDatabase, 18);
        this.d = new hq9(oneMeRoomDatabase, 25);
    }

    public jdc(bq8 bq8Var, View view) {
        Object cq8Var;
        this.a = 11;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            cq8Var = new eq8();
        } else {
            cq8Var = i >= 33 ? new cq8() : null;
        }
        this.b = cq8Var;
        this.c = bq8Var;
        this.d = view;
    }

    public jdc(Context context, TypedArray typedArray) {
        this.a = 17;
        this.b = context;
        this.c = typedArray;
    }

    public jdc(Context context, LocationManager locationManager) {
        this.a = 18;
        this.d = new sof();
        this.b = context;
        this.c = locationManager;
    }

    public jdc(int i) {
        this.a = 1;
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        String strF = ho7.f(i * 8, "SHA-");
        try {
            this.b = MessageDigest.getInstance(strF);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException(ho7.i("Missing ", strF, " support"));
        }
    }

    public jdc(n22 n22Var, gsf gsfVar) {
        this.a = 16;
        this.c = n22Var;
        this.b = gsfVar;
    }

    public jdc(String str) {
        this.a = 12;
        i5i i5iVar = new i5i();
        this.c = i5iVar;
        this.d = i5iVar;
        this.b = str;
    }

    public jdc(ukd ukdVar) {
        this.a = 3;
        Context context = (Context) ukdVar.b;
        this.b = ukdVar;
        int i = Build.VERSION.SDK_INT;
        this.c = i >= 29 ? do0.b(context) : null;
        this.d = i <= 29 ? new ow6(context, 1) : null;
    }

    public jdc(final ViewGroup viewGroup) {
        this.a = 6;
        final int i = 0;
        this.b = ipi.b(3, new cm6() { // from class: kd3
            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                ViewGroup viewGroup2 = viewGroup;
                switch (i2) {
                    case 0:
                        w2c w2cVar = new w2c(viewGroup2.getContext());
                        int i3 = yud.a;
                        w2cVar.a();
                        return w2cVar;
                    case 1:
                        Drawable drawableB = r34.b(viewGroup2.getContext(), yud.p0);
                        if (drawableB != null) {
                            float f = 20;
                            drawableB.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        } else {
                            drawableB = null;
                        }
                        r00 r00Var = new r00();
                        if (drawableB != null) {
                            r00Var.a = drawableB;
                            r00Var.invalidateSelf();
                        }
                        r00Var.c = kti.d(60 * vw4.d().getDisplayMetrics().density);
                        r00Var.b = true;
                        r00Var.invalidateSelf();
                        r00Var.e = true;
                        r00Var.invalidateSelf();
                        v1a v1aVar = a93.s0;
                        v1aVar.y(viewGroup2).a();
                        r00Var.setTint(-1);
                        v1aVar.y(viewGroup2).a();
                        r00Var.b(-1);
                        v1aVar.y(viewGroup2).a();
                        r00Var.q = 1543503872;
                        r00Var.invalidateSelf();
                        r00Var.setLevel(0);
                        return r00Var;
                    default:
                        return new w2c(viewGroup2.getContext());
                }
            }
        });
        final int i2 = 1;
        this.c = ipi.b(3, new cm6() { // from class: kd3
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                ViewGroup viewGroup2 = viewGroup;
                switch (i22) {
                    case 0:
                        w2c w2cVar = new w2c(viewGroup2.getContext());
                        int i3 = yud.a;
                        w2cVar.a();
                        return w2cVar;
                    case 1:
                        Drawable drawableB = r34.b(viewGroup2.getContext(), yud.p0);
                        if (drawableB != null) {
                            float f = 20;
                            drawableB.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        } else {
                            drawableB = null;
                        }
                        r00 r00Var = new r00();
                        if (drawableB != null) {
                            r00Var.a = drawableB;
                            r00Var.invalidateSelf();
                        }
                        r00Var.c = kti.d(60 * vw4.d().getDisplayMetrics().density);
                        r00Var.b = true;
                        r00Var.invalidateSelf();
                        r00Var.e = true;
                        r00Var.invalidateSelf();
                        v1a v1aVar = a93.s0;
                        v1aVar.y(viewGroup2).a();
                        r00Var.setTint(-1);
                        v1aVar.y(viewGroup2).a();
                        r00Var.b(-1);
                        v1aVar.y(viewGroup2).a();
                        r00Var.q = 1543503872;
                        r00Var.invalidateSelf();
                        r00Var.setLevel(0);
                        return r00Var;
                    default:
                        return new w2c(viewGroup2.getContext());
                }
            }
        });
        final int i3 = 2;
        this.d = ipi.b(3, new cm6() { // from class: kd3
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                ViewGroup viewGroup2 = viewGroup;
                switch (i22) {
                    case 0:
                        w2c w2cVar = new w2c(viewGroup2.getContext());
                        int i32 = yud.a;
                        w2cVar.a();
                        return w2cVar;
                    case 1:
                        Drawable drawableB = r34.b(viewGroup2.getContext(), yud.p0);
                        if (drawableB != null) {
                            float f = 20;
                            drawableB.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        } else {
                            drawableB = null;
                        }
                        r00 r00Var = new r00();
                        if (drawableB != null) {
                            r00Var.a = drawableB;
                            r00Var.invalidateSelf();
                        }
                        r00Var.c = kti.d(60 * vw4.d().getDisplayMetrics().density);
                        r00Var.b = true;
                        r00Var.invalidateSelf();
                        r00Var.e = true;
                        r00Var.invalidateSelf();
                        v1a v1aVar = a93.s0;
                        v1aVar.y(viewGroup2).a();
                        r00Var.setTint(-1);
                        v1aVar.y(viewGroup2).a();
                        r00Var.b(-1);
                        v1aVar.y(viewGroup2).a();
                        r00Var.q = 1543503872;
                        r00Var.invalidateSelf();
                        r00Var.setLevel(0);
                        return r00Var;
                    default:
                        return new w2c(viewGroup2.getContext());
                }
            }
        });
    }

    public jdc(AudioTrack audioTrack, x20 x20Var) {
        this.a = 7;
        this.b = audioTrack;
        this.c = x20Var;
        this.d = new AudioRouting.OnRoutingChangedListener() { // from class: xj4
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                jdc jdcVar = this.a;
                if (((xj4) jdcVar.d) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                ((x20) jdcVar.c).c(routedDevice);
            }
        };
        audioTrack.addOnRoutingChangedListener((xj4) this.d, new Handler(Looper.myLooper()));
    }
}
