package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import one.video.upload.UploadUrlExpiredException;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class u02 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ u02(View view, boolean z, ts4 ts4Var, ViewGroup viewGroup, View view2, f54 f54Var) {
        this.a = 5;
        this.b = view;
        this.c = viewGroup;
        this.d = view2;
        this.o = f54Var;
    }

    private final void a() {
        f3g f3gVar = (f3g) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        unc uncVar = (unc) this.d;
        AtomicInteger atomicInteger2 = (AtomicInteger) this.o;
        try {
            f3gVar.run();
            atomicInteger.incrementAndGet();
            synchronized (uncVar.f) {
                uncVar.f.notifyAll();
            }
            String str = (String) uncVar.g;
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return;
            }
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, wy1.g("processThreads, thread ", atomicInteger.get(), "/", atomicInteger2.get(), " finished"), null);
            }
        } catch (Throwable th) {
            atomicInteger.incrementAndGet();
            synchronized (uncVar.f) {
                uncVar.f.notifyAll();
                String str2 = (String) uncVar.g;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.d;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, str2, wy1.g("processThreads, thread ", atomicInteger.get(), "/", atomicInteger2.get(), " finished"), null);
                    }
                }
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bitmap bitmap;
        ya7 ya7Var;
        Bundle bundleB;
        int i = 0;
        switch (this.a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((py1) this.b).b).onCaptureCompleted((CameraCaptureSession) this.c, (CaptureRequest) this.d, (TotalCaptureResult) this.o);
                return;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((py1) this.b).b).onCaptureProgressed((CameraCaptureSession) this.c, (CaptureRequest) this.d, (CaptureResult) this.o);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((py1) this.b).b).onCaptureFailed((CameraCaptureSession) this.c, (CaptureRequest) this.d, (CaptureFailure) this.o);
                return;
            case 3:
                fde fdeVar = (fde) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                dr3 dr3Var = (dr3) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.o;
                synchronized (fdeVar.a) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            fdeVar.f(dr3Var);
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                AudioTrack audioTrack = (AudioTrack) this.b;
                y6i y6iVar = (y6i) this.c;
                Handler handler = (Handler) this.d;
                x50 x50Var = (x50) this.o;
                int i2 = 23;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (y6iVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new my1(y6iVar, i2, x50Var));
                    }
                    synchronized (ak4.l0) {
                        try {
                            int i3 = ak4.n0 - 1;
                            ak4.n0 = i3;
                            if (i3 == 0) {
                                ak4.m0.shutdown();
                                ak4.m0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (y6iVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new my1(y6iVar, i2, x50Var));
                    }
                    synchronized (ak4.l0) {
                        try {
                            int i4 = ak4.n0 - 1;
                            ak4.n0 = i4;
                            if (i4 == 0) {
                                ak4.m0.shutdown();
                                ak4.m0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 5:
                View view = (View) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                View view2 = (View) this.d;
                f54 f54Var = (f54) this.o;
                int i5 = ts4.Y;
                if (view != null) {
                    viewGroup.removeView(view);
                }
                if (view2 != null && view2.getParent() == null) {
                    viewGroup.addView(view2);
                }
                if (viewGroup.getWindowToken() != null) {
                    f54Var.d();
                    return;
                }
                return;
            case 6:
                Iterable iterable = (Iterable) this.b;
                cm6 cm6Var = (cm6) this.c;
                df6 df6Var = (df6) this.d;
                String str = (String) this.o;
                long jNanoTime = System.nanoTime();
                ArrayList arrayList = new ArrayList(we3.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((af6) it.next()).b);
                }
                ForkJoinTask.invokeAll(arrayList);
                long jNanoTime2 = System.nanoTime();
                cm6Var.invoke();
                ConcurrentSkipListSet concurrentSkipListSet = df6Var.a;
                long jNanoTime3 = System.nanoTime() - jNanoTime2;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                concurrentSkipListSet.add(new ls8(str, jNanoTime2 - jNanoTime, jNanoTime3, Thread.currentThread().getName(), jNanoTime));
                return;
            case 7:
                f29 f29Var = (f29) this.b;
                yx8 yx8Var = (yx8) this.c;
                e29 e29Var = (e29) this.d;
                w69 w69Var = (w69) this.o;
                try {
                    px8 px8Var = (px8) yx8Var.get(0L, TimeUnit.MILLISECONDS);
                    if (f29Var.c(w69Var)) {
                        e29Var.a.k(e29Var.b, false);
                    }
                    px8Var.b(e29Var);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    f29Var.a.l(w69Var);
                    return;
                }
            case 8:
                f29 f29Var2 = (f29) this.b;
                f29Var2.o.execute(new se5(f29Var2, (px8) this.o, (String) this.c, (Bundle) this.d));
                return;
            case 9:
                x79 x79Var = (x79) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.o;
                if (atomicInteger.incrementAndGet() == arrayList2.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i < arrayList3.size()) {
                        ha8 ha8Var = (ha8) arrayList3.get(i);
                        if (ha8Var != null) {
                            try {
                                bitmap = (Bitmap) a6a.a(ha8Var);
                            } catch (CancellationException | ExecutionException e) {
                                a8i.f("MediaSessionLegacyStub", "Failed to get bitmap", e);
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList4.add(new e79(null, i28.g((k09) arrayList2.get(i), bitmap), i == -1 ? -1L : i));
                        i++;
                    }
                    z79.C(((z79) x79Var.o).k, arrayList4);
                    return;
                }
                return;
            case 10:
                k89 k89Var = (k89) this.b;
                AtomicReference atomicReference = (AtomicReference) this.c;
                u69 u69Var = (u69) this.d;
                yn3 yn3Var = (yn3) this.o;
                atomicReference.set(k89Var.t0.m(u69Var));
                yn3Var.f();
                return;
            case 11:
                z89 z89Var = (z89) this.b;
                u69 u69Var2 = (u69) this.c;
                o79 o79Var = (o79) this.d;
                ya7 ya7Var2 = (ya7) this.o;
                fde fdeVar2 = z89Var.d;
                try {
                    z89Var.e.remove(u69Var2);
                    if (!o79Var.j()) {
                        v89 v89Var = (v89) u69Var2.d;
                        hsi.h(v89Var);
                        IBinder iBinderAsBinder = v89Var.a.asBinder();
                        s69 s69VarM = o79Var.m(u69Var2);
                        if (fdeVar2.y(u69Var2)) {
                            a8i.l("MediaSessionStub", "Controller " + u69Var2 + " has sent connection request multiple times");
                        }
                        fdeVar2.a(iBinderAsBinder, u69Var2, s69VarM.a, s69VarM.b);
                        dy dyVarV = fdeVar2.v(u69Var2);
                        if (dyVarV == null) {
                            a8i.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            a5c a5cVar = o79Var.t;
                            q4c q4cVar = o79Var.s;
                            o3c o3cVar = s69VarM.b;
                            q4c q4cVarS = z89Var.S(q4cVar);
                            MediaSession.Token token = ((b79) o79Var.h.k.b).c.b;
                            PendingIntent pendingIntent = o79Var.u;
                            wg7 wg7Var = s69VarM.c;
                            if (wg7Var == null) {
                                wg7Var = o79Var.B;
                            }
                            wg7 wg7Var2 = s69VarM.d;
                            if (wg7Var2 == null) {
                                wg7Var2 = o79Var.C;
                            }
                            try {
                                js3 js3Var = new js3(1008000300, 5, z89Var, pendingIntent, wg7Var, wg7Var2, o79Var.r, s69VarM.a, o3cVar, a5cVar.z(), o79Var.j.a.getExtras(), o79Var.D, q4cVarS, token);
                                if (o79Var.j()) {
                                    v9j.b(ya7Var2);
                                    return;
                                }
                                try {
                                    int iV = dyVarV.v();
                                    ya7Var = ya7Var2;
                                    try {
                                        try {
                                            if (ya7Var instanceof vy8) {
                                                bundleB = new Bundle();
                                                bundleB.putBinder(js3.B, new is3(js3Var));
                                            } else {
                                                bundleB = js3Var.b(u69Var2.c);
                                            }
                                            ya7Var.n(iV, bundleB);
                                            i = 1;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (i == 0) {
                                                v9j.b(ya7Var);
                                            }
                                            throw th;
                                        }
                                    } catch (RemoteException unused2) {
                                    }
                                } catch (RemoteException unused3) {
                                    ya7Var = ya7Var2;
                                }
                                if (i != 0 && (!o79Var.A || !o79.k(u69Var2))) {
                                    o79Var.e.getClass();
                                }
                                if (i == 0) {
                                    v9j.b(ya7Var);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                ya7Var = ya7Var2;
                            }
                        }
                    }
                    v9j.b(ya7Var2);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    ya7Var = ya7Var2;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                o79 o79Var2 = (o79) this.b;
                hke hkeVar = (hke) this.c;
                fu3 fu3Var = (fu3) this.d;
                ha8 ha8Var2 = (ha8) this.o;
                if (o79Var2.j()) {
                    hkeVar.k(null);
                    return;
                }
                try {
                    fu3Var.accept(ha8Var2);
                    hkeVar.k(null);
                    return;
                } catch (Throwable th5) {
                    hkeVar.l(th5);
                    return;
                }
            case 13:
                o79 o79Var3 = (o79) this.b;
                x89 x89Var = (x89) this.c;
                u69 u69Var3 = (u69) this.d;
                List list = (List) this.o;
                if (o79Var3.j()) {
                    return;
                }
                x89Var.b(o79Var3.t, u69Var3, list);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((m99) this.c).C(((qr4) this.b).a, (c99) this.d, (g19) this.o);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                n1a n1aVar = (n1a) this.b;
                HashMap map = (HashMap) this.c;
                jke jkeVar = (jke) this.d;
                HashMap map2 = (HashMap) this.o;
                s32 s32Var = n1aVar.c;
                jkeVar.o.getTimestamp();
                s32Var.accept(new m1a(map, map2));
                return;
            case 16:
                hc8 hc8Var = (hc8) this.b;
                List list2 = (List) this.c;
                ConditionVariable conditionVariable = (ConditionVariable) this.d;
                pje pjeVar = (pje) this.o;
                try {
                    try {
                        feg fegVar = feg.a;
                        ba7 ba7VarB = ((ha7) feg.h.getValue()).b(hc8Var);
                        try {
                            int i6 = ba7VarB.b;
                            byte[] bArr = (byte[]) ((rw5) ba7VarB.d).c;
                            String strM = bArr != null ? dnf.m(bArr) : null;
                            if (strM != null && dnf.r(strM, "{", false)) {
                                try {
                                    tha.v(new JSONObject(strM), "CRASH_FREE", null);
                                } catch (JSONException unused4) {
                                }
                            }
                            if (i6 != 200) {
                                Log.e("Tracer", "HTTP " + i6 + ", " + strM);
                            } else {
                                pjeVar.a();
                            }
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                r4j.a(ba7VarB, th6);
                                throw th7;
                            }
                        }
                    } catch (Exception unused5) {
                        feg fegVar2 = feg.a;
                        feg.b().a(list2);
                    }
                    return;
                } finally {
                    conditionVariable.open();
                }
            case LangUtils.HASH_SEED /* 17 */:
                rve rveVar = (rve) this.b;
                EglBase eglBase = (EglBase) this.c;
                y6d y6dVar = (y6d) this.d;
                si1 si1Var = (si1) this.o;
                oi1 oi1Var = si1Var.A;
                ni1 ni1Var = si1Var.B;
                String str2 = si1Var.z.r;
                rveVar.h = eglBase;
                y6dVar.log("SharedPeerConnectionFac", "create");
                rveVar.c = "H264";
                y6dVar.log("SharedPeerConnectionFac", "Preferred video codec: " + rveVar.c);
                y6dVar.log("SharedPeerConnectionFac", "Create internal peer connection factory ...");
                n50 n50Var = new n50(y6dVar);
                jdc jdcVar = new jdc((Object) rveVar, (Object) n50Var, false, (Object) y6dVar, 15);
                JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext());
                r5j r5jVar = new r5j(28);
                rveVar.f = r5jVar;
                rveVar.g = builder.setAudioRecordSampleHook(r5jVar).setAudioRecordStateCallback(n50Var).setAudioRecordErrorCallback(jdcVar).setAudioTrackStateCallback(n50Var).setAudioTrackErrorCallback(n50Var).setUseSilenceProviderIfMutedOnInit(wpb.D()).createAudioDeviceModule();
                if (wpb.D()) {
                    rveVar.g.setMicrophoneMute(true);
                }
                ypb ypbVar = wpb.s0 == null ? new ypb(true, true, null, null, null, false, false, true, false, false, false, null) : (ypb) wpb.s0.b;
                String str3 = ypbVar.l;
                String str4 = ypbVar.d;
                String str5 = ypbVar.c;
                String str6 = ((Object) "WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/".concat((ypbVar.a || ypbVar.b) ? "WebRTC-Audio-Red-For-Opus/Enabled-2/" : "WebRTC-Audio-Red-For-Opus/Disabled/")) + "WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/";
                if (!TextUtils.isEmpty(str5)) {
                    str6 = ((Object) str6) + "WebRTC-OK-StunCustomAttr/Enabled-" + str5 + "/";
                }
                if (!TextUtils.isEmpty(str4)) {
                    str6 = ((Object) str6) + "WebRTC-OK-TurnChannelDataMark/" + str4 + "/";
                }
                Integer num = ypbVar.e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue < 0) {
                        iIntValue = 1000;
                    }
                    str6 = ((Object) str6) + "WebRTC-RttMult/Enabled-1.0," + iIntValue + "/";
                }
                String strF = ((Object) str6) + "WebRTC-Bwe-LossBasedBweV2/Enabled:true,CandidateFactors:1.02|1.0|0.95,DelayBasedCandidate:true,HigherBwBiasFactor:0.0002,HigherLogBwBiasFactor:0.02,ObservationDurationLowerBound:250ms,InstantUpperBoundBwBalance:75kbps,BwRampupUpperBoundFactor:1000000.0,InstantUpperBoundTemporalWeightFactor:0.9,TemporalWeightFactor:0.9,MaxIncreaseFactor:1.3,NewtonStepSize:0.75,InherentLossUpperBoundBwBalance:75kbps,LossThresholdOfHighBandwidthPreference:0.15,NotIncreaseIfInherentLossLessThanAverageLoss:true,_20230522/";
                if (ypbVar.f) {
                    strF = ((Object) strF) + "CallsSDK-Audio-EarlyStartPlayout/Enabled/";
                }
                if (ypbVar.g) {
                    strF = ((Object) strF) + "CallsSDK-Audio-EarlyStartRecording/Enabled/";
                }
                if (ypbVar.j) {
                    strF = ((Object) strF) + "CallsSDK-Audio-AudioProcessingOffOnMute/Enabled/";
                }
                if (oi1Var != null) {
                    Boolean bool = oi1Var.b;
                    Boolean bool2 = Boolean.TRUE;
                    if (fni.a(bool, bool2)) {
                        strF = ((Object) strF) + "CallsSDK-Audio-OpusFECWithDRED/Enabled/";
                    }
                    if (fni.a(oi1Var.a, bool2)) {
                        strF = ((Object) strF) + "CallsSDK-Audio-OpusNOLACE/Enabled/";
                    }
                    Integer num2 = oi1Var.e;
                    if (num2 != null) {
                        strF = ((Object) strF) + "CallsSDK-Audio-OpusDREDByBitrate/Enabled:" + num2 + "/";
                    }
                    Integer num3 = oi1Var.d;
                    if (num3 != null) {
                        strF = ((Object) strF) + "CallsSDK-Audio-OpusAdapterMinBitrate/Enabled:" + num3 + "/";
                    }
                    if (fni.a(oi1Var.c, bool2)) {
                        strF = ((Object) (((Object) (((Object) strF) + "WebRTC-AdjustOpusBandwidth/Enabled/")) + "CallsSDK-DREDLowBitrate/Enabled/")) + "WebRTC-Audio-StableTargetAdaptation/Enabled/";
                    }
                }
                if (ni1Var != null) {
                    Integer num4 = ni1Var.b;
                    int iIntValue2 = num4 != null ? num4.intValue() : 6;
                    Integer num5 = ni1Var.a;
                    int iIntValue3 = num5 != null ? num5.intValue() : 6;
                    Boolean bool3 = ni1Var.c;
                    boolean zBooleanValue = bool3 != null ? bool3.booleanValue() : true;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) strF);
                    sb.append("WebRTC-Audio-AdaptivePtime/enabled:true,min_payload_bitrate:");
                    sb.append(iIntValue2);
                    sb.append("kbps,min_encoder_bitrate:");
                    sb.append(iIntValue3);
                    strF = vb9.f(sb, "kbps,use_slow_adaptation:", zBooleanValue, "/");
                }
                if (ypbVar.k) {
                    strF = ((Object) strF) + "CallsSDK-DisableSharedSocket/Enabled/";
                }
                if (str3 != null && str3.length() != 0) {
                    strF = ((Object) strF) + str3;
                }
                if (str2 != null && str2.length() != 0) {
                    strF = ((Object) strF) + str2;
                }
                y6dVar.log("SharedPeerConnectionFac", "Field trials: " + strF);
                PeerConnectionFactory.initializeFieldTrials(strF);
                rveVar.d = PeerConnectionFactory.builder().setVideoDecoderFactory(rveVar.e).setVideoEncoderFactory(rveVar.j).setAudioDeviceModule(rveVar.g).createPeerConnectionFactory();
                if (rveVar.d == null) {
                    throw new IllegalStateException();
                }
                y6dVar.log("SharedPeerConnectionFac", w0a.c(rveVar.d) + " was created");
                boolean z = w0a.a;
                y6dVar.log("SharedPeerConnectionFac", "Is VIDEO HW acceleration enabled? ".concat(!z ? "yes" : "no"));
                if (z) {
                    return;
                }
                y6dVar.log("SharedPeerConnectionFac", "Enable video hardware acceleration options for " + w0a.c(rveVar.d));
                return;
            case 18:
                StereoRoomManagerImpl.resolveIdsAndThen$lambda$10((StereoRoomManagerImpl) this.b, (ArrayList) this.c, (List) this.d, (cm6) this.o);
                return;
            case 19:
                a();
                return;
            case 20:
                r6g r6gVar = (r6g) this.b;
                Surface surface = (Surface) this.c;
                wu1 wu1Var = (wu1) this.d;
                msf msfVar = (msf) this.o;
                gri.a("TextureViewImpl", "Safe to release surface.");
                nl nlVar = r6gVar.l;
                if (nlVar != null) {
                    nlVar.k();
                    r6gVar.l = null;
                }
                surface.release();
                if (r6gVar.g == wu1Var) {
                    r6gVar.g = null;
                }
                if (r6gVar.h == msfVar) {
                    r6gVar.h = null;
                    return;
                }
                return;
            case 21:
                File file = (File) this.b;
                h79 h79Var = (h79) this.c;
                Uri uri = (Uri) this.d;
                String str7 = (String) this.o;
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file.getPath(), "r");
                    try {
                        zvg.a.b(uri, randomAccessFile, str7, h79Var);
                        randomAccessFile.close();
                        h79Var.B();
                        return;
                    } finally {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    String str8 = ((phb) h79Var.b).d;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.Y;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str8, "error " + th, null);
                        }
                    }
                    if (th instanceof UploadUrlExpiredException) {
                        th = new HttpUrlExpiredException(null, null, null, 7);
                    }
                    ((phb) h79Var.b).c.c(th);
                    ((pac) ((sac) h79Var.c)).g(new kpd(new ipd(th)));
                    ((pac) ((sac) h79Var.c)).D(null);
                    return;
                }
            default:
                Handler handler2 = (Handler) this.b;
                View view3 = (View) this.c;
                nu8 nu8Var = (nu8) this.d;
                em6 em6Var = (em6) this.o;
                handler2.removeCallbacksAndMessages(null);
                view3.removeOnLayoutChangeListener(nu8Var);
                em6Var.invoke(view3);
                return;
        }
    }

    public /* synthetic */ u02(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.o = obj4;
    }

    public /* synthetic */ u02(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj3;
        this.d = obj4;
        this.o = obj5;
    }
}
