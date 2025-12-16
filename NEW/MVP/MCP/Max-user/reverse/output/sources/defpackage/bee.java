package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.widget.ScrollView;
import androidx.media3.transformer.ExportException;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class bee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bee(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [cm6, u08] */
    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException, IOException {
        List listD0;
        DataInputStream dataInputStream;
        switch (this.a) {
            case 0:
                ((cee) this.b).a();
                return;
            case 1:
                dee deeVar = (dee) this.b;
                try {
                    if (deeVar.d.E0) {
                        return;
                    }
                    deeVar.d.f();
                    deeVar.c += deeVar.d.G0;
                    deeVar.d.w0.release();
                    eee eeeVar = deeVar.d;
                    eeeVar.u0 = false;
                    int i = eeeVar.v0 + 1;
                    eeeVar.v0 = i;
                    zjd zjdVar = eeeVar.a;
                    if (i == zjdVar.d) {
                        eeeVar.v0 = 0;
                        eeeVar.A0++;
                    }
                    g95 g95Var = (g95) zjdVar.get(eeeVar.v0);
                    eee eeeVar2 = deeVar.d;
                    xpb xpbVar = eeeVar2.b;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    eee eeeVar3 = deeVar.d;
                    eeeVar2.w0 = xpbVar.h(g95Var, looperMyLooper, eeeVar3, eeeVar3.c);
                    deeVar.d.w0.start();
                    return;
                } catch (RuntimeException e) {
                    deeVar.d.c(ExportException.a(1000, e));
                    return;
                }
            case 2:
                ((dy) this.b).release();
                return;
            case 3:
                gfe gfeVar = (gfe) this.b;
                if (gfeVar.F()) {
                    pqg pqgVar = gfeVar.A;
                    if ((pqgVar.r.B() != PeerConnection.IceConnectionState.CONNECTED ? 1 : 0) != 0) {
                        w0a.d(pqgVar.e, "SERVER_CONNECTION_TIMEOUT", "in");
                    }
                    if (pqgVar.r != null) {
                        pqgVar.r.J(pqgVar.n);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ove oveVar = (ove) this.b;
                oveVar.k.log("SlmsSource", "releaseInternal");
                if (oveVar.o != null) {
                    ie8 ie8Var = oveVar.o;
                    ie8Var.n.log("OKRTCLmsAdapter", "release");
                    k5i k5iVar = ie8Var.D;
                    if (k5iVar != null) {
                        k5iVar.b = null;
                        ((Handler) k5iVar.c).removeCallbacks((thg) k5iVar.d);
                        ((ie8) k5iVar.o).n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
                    }
                    ie8Var.c.clear();
                    ie8Var.q = null;
                    ie8Var.a();
                    if (ie8Var.r != null) {
                        d12 d12Var = ie8Var.r;
                        d12Var.e.log("CameraCapturerAdapter", "release");
                        d12Var.f.clear();
                        d12Var.b();
                        ((kob) d12Var.c.b).dispose();
                        ie8Var.r = null;
                    }
                    if (ie8Var.t != null) {
                        ie8Var.t.b();
                        ie8Var.t = null;
                    }
                    if (ie8Var.u != null) {
                        q2e q2eVar = ie8Var.u;
                        if (!q2eVar.c) {
                            if (q2eVar.X != null) {
                                q2eVar.X.d(null);
                            }
                            q2eVar.b.a(new p2e(q2eVar, i));
                            u44 u44Var = q2eVar.b;
                            u44Var.getClass();
                            try {
                                ((CountDownLatch) u44Var.d).await();
                            } catch (InterruptedException unused) {
                            }
                        }
                        ie8Var.u = null;
                    }
                    ie8Var.n.log("OKRTCLmsAdapter", "releaseScreenCastVideoTrack");
                    ie8Var.z.m();
                    ie8Var.g();
                    ie8Var.i.m();
                    ie8Var.h.dispose();
                    ie8Var.n.log("OKRTCLmsAdapter", ie8Var + ": " + w0a.c(ie8Var.h) + " was disposed");
                    y6d y6dVar = oveVar.k;
                    StringBuilder sb = new StringBuilder();
                    sb.append(w0a.c(oveVar.o));
                    sb.append(" was released");
                    y6dVar.log("SlmsSource", sb.toString());
                    oveVar.o = null;
                    return;
                }
                return;
            case 5:
                fs4 fs4Var = (fs4) this.b;
                synchronized (((ArrayDeque) fs4Var.d)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) fs4Var.a).edit();
                    String str = (String) fs4Var.b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) fs4Var.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) fs4Var.c);
                    }
                    editorEdit.putString(str, sb2.toString()).commit();
                }
                return;
            case 6:
                rs0 rs0Var = (rs0) this.b;
                rs0Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) rs0Var.e;
                lfh lfhVar = sideSheetBehavior.i;
                if (lfhVar != null && lfhVar.f()) {
                    rs0Var.f(rs0Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.y(rs0Var.b);
                        return;
                    }
                    return;
                }
            case 7:
                ((pze) this.b).g();
                return;
            case 8:
                q0f.a((q0f) this.b);
                return;
            case 9:
                a60 a60Var = (a60) ((r5j) this.b).b;
                a60Var.q = true;
                if (a60Var.g == 2) {
                    a60Var.a();
                    return;
                }
                return;
            case 10:
                ssb ssbVar = (ssb) this.b;
                try {
                    Map mapS = to8.s((Map) ((AtomicReference) ((bwf) ssbVar.c).getValue()).get());
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((File) ((u08) ssbVar.b).invoke())));
                    try {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeInt(mapS.size());
                        for (Map.Entry entry : mapS.entrySet()) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            Object value = entry.getValue();
                            if (value instanceof Boolean) {
                                dataOutputStream.writeInt(2);
                                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                            } else if (value instanceof Integer) {
                                dataOutputStream.writeInt(3);
                                dataOutputStream.writeInt(((Number) value).intValue());
                            } else if (value instanceof Long) {
                                dataOutputStream.writeInt(4);
                                dataOutputStream.writeLong(((Number) value).longValue());
                            } else if (value instanceof Float) {
                                dataOutputStream.writeInt(5);
                                dataOutputStream.writeFloat(((Number) value).floatValue());
                            } else if (value instanceof Double) {
                                dataOutputStream.writeInt(6);
                                dataOutputStream.writeDouble(((Number) value).doubleValue());
                            } else {
                                if (!(value instanceof String)) {
                                    throw new IllegalArgumentException("Write unknown type of value " + value);
                                }
                                dataOutputStream.writeInt(1);
                                dataOutputStream.writeUTF((String) value);
                            }
                        }
                        dataOutputStream.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r4j.a(dataOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused2) {
                    return;
                }
            case 11:
                v32 v32Var = (v32) this.b;
                ((s2f) v32Var.c).d.a(v32Var.b);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                y7f y7fVar = (y7f) this.b;
                Surface surface = y7fVar.u0;
                if (surface != null) {
                    Iterator it2 = y7fVar.a.iterator();
                    while (it2.hasNext()) {
                        ((xl5) it2.next()).a.X0(null);
                    }
                }
                SurfaceTexture surfaceTexture = y7fVar.t0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                y7fVar.t0 = null;
                y7fVar.u0 = null;
                return;
            case 13:
                ((amf) this.b).b();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((CountDownLatch) this.b).countDown();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                k65 k65Var = (k65) ((jdc) this.b).d;
                if (k65Var != null) {
                    Iterator it3 = k65Var.values().iterator();
                    while (it3.hasNext()) {
                        ((dsf) it3.next()).c();
                    }
                    return;
                }
                return;
            case 16:
                ((nl) this.b).k();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                uyf uyfVar = (uyf) this.b;
                uyfVar.a(2);
                try {
                    Context context = uyfVar.a;
                    String strB = d6j.b();
                    File file = new File(context.getCacheDir(), strB.equals(context.getPackageName()) ? "tracer" : "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false)));
                    nbj.b(file);
                    File fileG = jz5.g(file, "tags");
                    synchronized (uyfVar.e) {
                        listD0 = ue3.d0(uyfVar.e);
                    }
                    fn8.a(fileG, listD0);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 18:
                ((mbd) this.b).d();
                return;
            case 19:
                u0g u0gVar = (u0g) this.b;
                u0gVar.getClass();
                wqi.c(u0g.z0, "handleIntent: close and re-create session", new Object[0]);
                ((w0g) u0gVar.v0.getValue()).f();
                return;
            case 20:
                ((r1g) this.b).b(true);
                return;
            case 21:
                ((TextInputLayout) this.b).d.requestLayout();
                return;
            case 22:
                ncg ncgVar = (ncg) this.b;
                ncgVar.v0 = null;
                ncgVar.a();
                return;
            case 23:
                keg kegVar = (keg) this.b;
                int andSet = kegVar.h.getAndSet(8) - 8;
                w55 w55Var = (w55) kegVar.a.h.a.getValue();
                w55Var.getClass();
                w55Var.a(Collections.singletonList(new y55("non_fatal", "max_non_fatals_per_session_reached", andSet)));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                File file2 = (File) this.b;
                nme nmeVar = t6d.a;
                pje pjeVar = feg.e;
                if (pjeVar == null) {
                    pjeVar = null;
                }
                pjeVar.b();
                wxf wxfVar = pjeVar.h;
                if (wxfVar == null) {
                    return;
                }
                feg fegVar = feg.a;
                feg.c().get(nmeVar);
                List<kqb> list = hd5.a;
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file2)));
                } catch (IOException unused4) {
                    Objects.toString(file2);
                }
                try {
                    List listD = wha.d(dataInputStream);
                    dataInputStream.close();
                    list = listD;
                    file2.delete();
                    if (tha.t(nmeVar) || list.isEmpty()) {
                        return;
                    }
                    list.size();
                    feg fegVar2 = feg.a;
                    String strA = feg.a();
                    if (strA == null) {
                        return;
                    }
                    JSONObject jSONObjectH = jo7.h(wxfVar);
                    jSONObjectH.put("clientTimeUnixNano", (SystemClock.elapsedRealtimeNanos() + h7c.a) - h7c.b);
                    JSONArray jSONArray = new JSONArray();
                    for (kqb kqbVar : list) {
                        JSONObject jSONObject = new JSONObject();
                        long j = kqbVar.a;
                        Map map = kqbVar.e;
                        jSONObject.put("timeUnixNano", j);
                        jSONObject.put(SdkMetricStatEvent.NAME_KEY, kqbVar.b);
                        jSONObject.put(SdkMetricStatEvent.VALUE_KEY, kqbVar.c);
                        jSONObject.put("unit", kqbVar.d);
                        if (!map.isEmpty()) {
                            JSONObject jSONObject2 = new JSONObject();
                            for (Map.Entry entry2 : map.entrySet()) {
                                String str2 = (String) entry2.getKey();
                                Object value2 = entry2.getValue();
                                if (value2 instanceof String) {
                                    jSONObject2.put(str2, value2);
                                } else if (value2 instanceof Boolean) {
                                    jSONObject2.put(str2, ((Boolean) value2).booleanValue());
                                } else if (value2 instanceof Long) {
                                    jSONObject2.put(str2, ((Number) value2).longValue());
                                } else if (value2 instanceof Double) {
                                    jSONObject2.put(str2, ((Number) value2).doubleValue());
                                } else if (value2 instanceof Byte) {
                                    jSONObject2.put(str2, value2);
                                } else if (value2 instanceof Short) {
                                    jSONObject2.put(str2, value2);
                                } else if (value2 instanceof Integer) {
                                    jSONObject2.put(str2, ((Number) value2).intValue());
                                } else if (value2 instanceof Float) {
                                    jSONObject2.put(str2, value2);
                                } else {
                                    jSONObject2.put(str2, value2.toString());
                                }
                            }
                            jSONObject.put("attributes", jSONObject2);
                        }
                        jSONArray.put(jSONObject);
                    }
                    jSONObjectH.put("samples", jSONArray);
                    feg fegVar3 = feg.a;
                    Object obj = feg.c().get(nca.b);
                    if ((obj instanceof s74 ? (s74) obj : null) == null) {
                        new s7c(13).d();
                    }
                    try {
                        ba7 ba7VarB = ((ha7) feg.h.getValue()).b(new hc8(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/perf/upload").appendQueryParameter("crashToken", strA).toString(), tha.b("application/json; charset=utf-8", jSONObjectH.toString())));
                        try {
                            int i2 = ba7VarB.b;
                            byte[] bArr = (byte[]) ((rw5) ba7VarB.d).c;
                            String strM = bArr != null ? dnf.m(bArr) : null;
                            if (strM != null && dnf.r(strM, "{", false)) {
                                try {
                                    tha.v(new JSONObject(strM), "PERFORMANCE_METRICS", null);
                                } catch (JSONException unused5) {
                                }
                            }
                            if (i2 != 200) {
                                Log.e("Tracer", "HTTP " + i2 + ", " + strM);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                r4j.a(ba7VarB, th3);
                                throw th4;
                            }
                        }
                    } catch (Exception unused6) {
                        return;
                    }
                } finally {
                }
            case 25:
                kqb kqbVar2 = (kqb) this.b;
                weg wegVar = xeg.b;
                if (wegVar instanceof ueg) {
                    ((ueg) wegVar).a.add(kqbVar2);
                    return;
                } else if (wegVar instanceof veg) {
                    ((veg) wegVar).a.d(kqbVar2);
                    return;
                } else {
                    Objects.toString(wegVar);
                    return;
                }
            case 26:
                ((HandlerThread) this.b).quitSafely();
                return;
            case 27:
                TwoFACheckPassScreen twoFACheckPassScreen = (TwoFACheckPassScreen) this.b;
                yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
                ((ScrollView) twoFACheckPassScreen.Y.D(twoFACheckPassScreen, TwoFACheckPassScreen.t0[1])).fullScroll(130);
                return;
            case 28:
                TwoFACreationScreen twoFACreationScreen = (TwoFACreationScreen) this.b;
                yy7[] yy7VarArr2 = TwoFACreationScreen.w0;
                ((ScrollView) twoFACreationScreen.s0.D(twoFACreationScreen, TwoFACreationScreen.w0[1])).fullScroll(130);
                return;
            default:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$1((UrlSharingListenerManagerImpl) this.b);
                return;
        }
    }
}
