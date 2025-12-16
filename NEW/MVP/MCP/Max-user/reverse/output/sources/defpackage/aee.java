package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class aee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aee(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, k18] */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        pm3 pm3Var;
        switch (this.a) {
            case 0:
                ((eee) this.b).h((Bitmap) this.c);
                return;
            case 1:
                rie rieVar = (rie) this.b;
                sa9 sa9Var = (sa9) this.c;
                boolean z = false;
                while (!z) {
                    try {
                        z42 z42VarD = sa9Var.D();
                        if (z42VarD.getType() == 10307) {
                            rieVar.c(r4.a, ((pc3) z42VarD).b);
                            z = true;
                        }
                    } catch (IOException unused) {
                        rieVar.c(0L, "");
                        return;
                    }
                }
                return;
            case 2:
                SessionRoomListenerManagerImpl.sendActualState$lambda$12((SessionRoomListenerManagerImpl) this.b, (SessionRoomsManager.OwnRoomsListener) this.c);
                return;
            case 3:
                SessionRoomListenerManagerImpl.onRoomUpdated$lambda$5((SessionRoomListenerManagerImpl) this.b, (ip1) this.c);
                return;
            case 4:
                SessionRoomListenerManagerImpl.onCurrentParticipantActiveRoomChanged$lambda$9((SessionRoomListenerManagerImpl) this.b, (fp1) this.c);
                return;
            case 5:
                SessionRoomListenerManagerImpl.onRoomRemoved$lambda$3((SessionRoomListenerManagerImpl) this.b, (hp1) this.c);
                return;
            case 6:
                SessionRoomListenerManagerImpl.onCurrentParticipantInvitedToRoom$lambda$7((SessionRoomListenerManagerImpl) this.b, (gp1) this.c);
                return;
            case 7:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$1((em6) this.b, (ParticipantId) this.c);
                return;
            case 8:
                ove oveVar = (ove) this.b;
                r8a r8aVar = (r8a) this.c;
                os0 os0VarA = oveVar.a();
                if (os0VarA.a) {
                    return;
                }
                ((ie8) os0VarA.b).d(r8aVar);
                return;
            case 9:
                ove oveVar2 = (ove) this.b;
                b32 b32Var = (b32) this.c;
                if (oveVar2.o != null) {
                    oveVar2.o.k(b32Var);
                    return;
                } else {
                    oveVar2.v = b32Var;
                    return;
                }
            case 10:
                rve rveVar = (rve) this.b;
                ove oveVar3 = (ove) this.c;
                rveVar.getClass();
                oveVar3.d(false);
                rveVar.g.stopDeviceAudioShare();
                return;
            case 11:
                rve rveVar2 = (rve) this.b;
                nz9 nz9Var = (nz9) this.c;
                r5j r5jVar = rveVar2.f;
                if (r5jVar != null) {
                    ((CopyOnWriteArraySet) r5jVar.b).remove(new q8i(0L, nz9Var));
                    return;
                }
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                jdc jdcVar = (jdc) this.b;
                String str = (String) this.c;
                rve rveVar3 = (rve) jdcVar.d;
                if (rveVar3.d == null) {
                    rveVar3.b.log("SharedPeerConnectionFac", "Already released. Ignore audio restart request");
                    return;
                }
                int i = rveVar3.k;
                if (i >= 3) {
                    rveVar3.b.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError", new Exception("onWebRtcAudioRecordStartError(" + rveVar3.k + " attempts done) " + str));
                    return;
                }
                rveVar3.k = i + 1;
                v08 v08Var = rveVar3.l;
                if (v08Var != null) {
                    ty4.a(v08Var);
                }
                ssa ssaVarL = vqa.r(1000L, TimeUnit.MILLISECONDS, u0e.a()).l(new rj5(rveVar3.a, false));
                v08 v08Var2 = new v08(new z9a(rveVar3, 24, str), new u4e(11, rveVar3), pdf.d);
                ssaVarL.a(v08Var2);
                rveVar3.l = v08Var2;
                return;
            case 13:
                pze pzeVar = (pze) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                y6d y6dVar = pzeVar.b;
                if (!pzeVar.q) {
                    y6dVar.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                    return;
                } else {
                    try {
                        Iterator it = pzeVar.k.iterator();
                        while (it.hasNext()) {
                            ((mze) it.next()).onResponse(jSONObject);
                        }
                        return;
                    } catch (JSONException e) {
                        y6dVar.reportException("OKSignaling", "signaling.listener.response.notification", e);
                        return;
                    }
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((s2f) ((v32) this.b).c).d.d((VideoFrameProcessingException) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((ViewPropertyAnimator) this.b).translationY(0.0f).setDuration(200L).setInterpolator((AccelerateDecelerateInterpolator) ((v5f) this.c).b.getValue()).start();
                return;
            case 16:
                y7f y7fVar = (y7f) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                SurfaceTexture surfaceTexture2 = y7fVar.t0;
                Surface surface = y7fVar.u0;
                Surface surface2 = new Surface(surfaceTexture);
                y7fVar.t0 = surfaceTexture;
                y7fVar.u0 = surface2;
                Iterator it2 = y7fVar.a.iterator();
                while (it2.hasNext()) {
                    ((xl5) it2.next()).a.X0(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((llf) this.b).i.accept((ctc) this.c);
                return;
            case 18:
                ((ju3) ((AtomicReference) this.c).get()).accept(new sb0((fsf) this.b));
                return;
            case 19:
                jkc jkcVar = (jkc) this.b;
                try {
                    ((a8h) jkcVar.a).f((msf) this.c);
                    return;
                } catch (ProcessingException e2) {
                    gri.c("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e2);
                    ((bba) jkcVar.c).accept(e2);
                    return;
                }
            case 20:
                jkc jkcVar2 = (jkc) this.b;
                try {
                    ((a8h) jkcVar2.a).j((fsf) this.c);
                    return;
                } catch (ProcessingException e3) {
                    gri.c("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e3);
                    ((bba) jkcVar2.c).accept(e3);
                    return;
                }
            case 21:
                ((zyf) this.b).o.remove((knd) this.c);
                return;
            case 22:
                yb0 yb0Var = (yb0) this.b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.c;
                v32 v32Var = yb0Var.c;
                if (v32Var == null) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                v32Var.b0(imageCaptureException);
                return;
            case 23:
                yb0 yb0Var2 = (yb0) this.b;
                jf7 jf7Var = (jf7) this.c;
                v32 v32Var2 = yb0Var2.c;
                Objects.requireNonNull(v32Var2);
                Objects.requireNonNull(jf7Var);
                wqi.c(v32.class.getName(), "capture image with success", new Object[0]);
                CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) v32Var2.c;
                cameraxCameraApiView.getFreezeCameraDetector().a();
                try {
                    ByteBuffer byteBufferI = jf7Var.s()[0].I();
                    byte[] bArr = new byte[byteBufferI.capacity()];
                    byteBufferI.rewind();
                    byteBufferI.get(bArr);
                    q22 q22Var = cameraxCameraApiView.s0;
                    if (q22Var != null) {
                        buc bucVar = ((ytc) ((s6b) q22Var).a).d;
                        if (bucVar == null) {
                            bucVar = null;
                        }
                        xfh.o(bucVar, ((q2b) bucVar.Z).b(), new ztc(bucVar, bArr, null), 2);
                    }
                    bui.a(jf7Var, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bui.a(jf7Var, th);
                        throw th2;
                    }
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((j1g) this.b).d((l0g) this.c);
                return;
            case 25:
                r6g r6gVar = (r6g) this.b;
                msf msfVar = (msf) this.c;
                msf msfVar2 = r6gVar.h;
                if (msfVar2 != null && msfVar2 == msfVar) {
                    r6gVar.h = null;
                    r6gVar.g = null;
                }
                nl nlVar = r6gVar.l;
                if (nlVar != null) {
                    nlVar.k();
                    r6gVar.l = null;
                    return;
                }
                return;
            case 26:
                Runnable runnable = (Runnable) this.b;
                uee ueeVar = (uee) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    ueeVar.a();
                }
            case 27:
                lhg lhgVar = (lhg) this.b;
                tg7 tg7Var = (tg7) this.c;
                w7c w7cVar = lhgVar.e;
                zjd zjdVarI = tg7Var.i();
                jkc jkcVar3 = lhgVar.d;
                String str2 = (String) jkcVar3.b;
                String str3 = (String) jkcVar3.c;
                hhg hhgVar = (hhg) w7cVar.a;
                f65 f65Var = hhgVar.q;
                ((tg7) f65Var.n).d(zjdVarI);
                if (str2 != null) {
                    f65Var.f = str2;
                }
                if (str3 != null) {
                    f65Var.l = str3;
                }
                Throwable th3 = null;
                hhgVar.s = null;
                int i2 = hhgVar.w;
                if (i2 != 1) {
                    if (i2 == 2) {
                        hhgVar.t = null;
                        hhgVar.w = 3;
                        throw null;
                    }
                    if (i2 == 3) {
                        hhgVar.w = 4;
                        throw null;
                    }
                    if (i2 == 5) {
                        hhgVar.w = 6;
                        pm3 pm3Var2 = hhgVar.u;
                        pm3Var2.getClass();
                        throw null;
                    }
                    if (i2 != 6) {
                        hhg.a(hhgVar);
                        return;
                    } else {
                        f65Var.m = 1;
                        hhg.a(hhgVar);
                        return;
                    }
                }
                hhgVar.w = 2;
                pm3 pm3Var3 = hhgVar.u;
                pm3Var3.getClass();
                pm3 pm3VarB = pm3Var3.b();
                wg7 wg7Var = pm3Var3.a;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (true) {
                    boolean z2 = true;
                    if (i3 >= wg7Var.size()) {
                        Throwable th4 = th3;
                        pm3 pm3Var4 = pm3VarB;
                        hsi.a("The composition must contain at least one EditedMediaItemSequence.", !arrayList.isEmpty());
                        pm3Var4.a = wg7.j(arrayList);
                        pm3Var4.a();
                        hhgVar.t.getClass();
                        u9a u9aVar = hhgVar.t;
                        hsi.g(u9aVar.n == 1);
                        u9aVar.n = 2;
                        throw th4;
                    }
                    zjd zjdVar = ((h95) wg7Var.get(i3)).a;
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (i4 < zjdVar.d) {
                        g95 g95Var = (g95) zjdVar.get(i4);
                        f95 f95VarA = g95Var.a();
                        k09 k09Var = g95Var.a;
                        Throwable th5 = th3;
                        if (i4 == 0) {
                            oz8 oz8VarA = k09Var.e.a();
                            pm3Var = pm3VarB;
                            oz8VarA.b(zxg.U(zxg.m0(0L) + k09Var.e.a));
                            qz8 qz8Var = new qz8(oz8VarA);
                            mz8 mz8VarA = k09Var.a();
                            mz8VarA.d = qz8Var.a();
                            f95VarA.a = mz8VarA.a();
                        } else {
                            pm3Var = pm3VarB;
                        }
                        f95VarA.b = z2;
                        arrayList2.add(new g95(f95VarA.a, f95VarA.b, f95VarA.c, f95VarA.d, f95VarA.e, f95VarA.f));
                        i4++;
                        th3 = th5;
                        pm3VarB = pm3Var;
                        z2 = z2;
                    }
                    arrayList.add(new h95(new ao6(arrayList2)));
                    i3++;
                    th3 = th3;
                }
            case 28:
                hke hkeVar = (hke) this.b;
                ha8 ha8Var = (ha8) this.c;
                if (hkeVar.a instanceof b1) {
                    ha8Var.cancel(false);
                    return;
                }
                return;
            default:
                s1h s1hVar = (s1h) this.b;
                if (((zr4) this.c) == s1hVar.p) {
                    s1hVar.I();
                    return;
                }
                return;
        }
    }
}
