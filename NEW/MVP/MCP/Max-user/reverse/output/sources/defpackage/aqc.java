package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.viewpager.widget.ViewPager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;

/* loaded from: classes.dex */
public final class aqc implements on0, rn6, v2f, qp5, rrf, CapturerObserver, zua, x60 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ aqc(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public static float d(int i, float[] fArr) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i > 0) {
            return f / i;
        }
        return 0.0f;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        ViewPager viewPager = (ViewPager) this.c;
        g4i g4iVarI = hfh.i(view, g4iVar);
        if (g4iVarI.a.m()) {
            return g4iVarI;
        }
        Rect rect = (Rect) this.b;
        rect.left = g4iVarI.b();
        rect.top = g4iVarI.d();
        rect.right = g4iVarI.c();
        rect.bottom = g4iVarI.a();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            g4i g4iVarB = hfh.b(viewPager.getChildAt(i), g4iVarI);
            rect.left = Math.min(g4iVarB.b(), rect.left);
            rect.top = Math.min(g4iVarB.d(), rect.top);
            rect.right = Math.min(g4iVarB.c(), rect.right);
            rect.bottom = Math.min(g4iVarB.a(), rect.bottom);
        }
        return g4iVarI.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        bf5 bf5Var;
        switch (this.a) {
            case 1:
                je5 je5Var = (je5) obj;
                bhd bhdVar = (bhd) this.c;
                gri.a("Recorder", "VideoEncoder can be released: " + je5Var);
                if (je5Var != null) {
                    ScheduledFuture scheduledFuture = bhdVar.X;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (bf5Var = bhdVar.E) != null && bf5Var == je5Var) {
                        bhd.r(bf5Var);
                    }
                    bhdVar.a0 = (tz4) this.b;
                    bhdVar.C(null);
                    bhdVar.v(bhdVar.o());
                    break;
                }
                break;
            case 2:
                ((v2f) this.c).a(obj);
                break;
            case 6:
                try {
                    Object objApply = ((tm6) this.c).apply(obj);
                    Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                    ((v2f) this.b).a(objApply);
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    onError(th);
                    return;
                }
            case 8:
                fsf fsfVar = (fsf) obj;
                fsfVar.getClass();
                try {
                    ((gsf) ((jdc) this.c).b).j(fsfVar);
                    break;
                } catch (ProcessingException e) {
                    gri.c("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                    return;
                }
            default:
                ((zyf) this.c).b.q();
                break;
        }
    }

    public boolean b(String str, String str2, b7d b7dVar, y6d y6dVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        boolean zContainsKey = linkedHashMap.containsKey(str);
        String str3 = (String) linkedHashMap.put(str, str2);
        if (!zContainsKey || !Objects.equals(str3, str2)) {
            return true;
        }
        y6dVar.log("CodecPrefUtil", "parameter " + str + " value did not change");
        return false;
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        switch (this.a) {
            case 2:
                ty4.d((AtomicReference) this.b, py4Var);
                break;
            default:
                ((v2f) this.b).c(py4Var);
                break;
        }
    }

    @Override // defpackage.on0
    public void e() {
        qyg qygVar = (qyg) this.c;
        byte[] bArr = xxg.f;
        qygVar.getClass();
        qygVar.C(bArr.length, bArr);
    }

    public void f(long j, qyg qygVar) {
        if (qygVar.c() < 9) {
            return;
        }
        int iF = qygVar.f();
        int iF2 = qygVar.f();
        int iS = qygVar.s();
        if (iF == 434 && iF2 == 1195456820 && iS == 3) {
            syi.b(j, qygVar, (rfg[]) this.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[EDGE_INSN: B:68:0x011c->B:52:0x011c BREAK  A[LOOP:1: B:38:0x00e3->B:51:0x010b], SYNTHETIC] */
    @Override // defpackage.on0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.nn0 g(defpackage.hp5 r17, long r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.g(hp5, long):nn0");
    }

    @Override // javax.inject.Provider
    public Object get() {
        iwf iwfVar = new iwf();
        nwf nwfVar = new nwf();
        Object obj = ((Provider) this.b).get();
        Provider provider = (Provider) this.c;
        return new gwd(iwfVar, nwfVar, ca0.f, (x0e) obj, provider);
    }

    public void h(jp5 jp5Var, mjg mjgVar) {
        rfg[] rfgVarArr = (rfg[]) this.c;
        for (int i = 0; i < rfgVarArr.length; i++) {
            mjgVar.a();
            mjgVar.b();
            rfg rfgVarB = jp5Var.B(mjgVar.e, 3);
            gf6 gf6Var = (gf6) ((List) this.b).get(i);
            String str = gf6Var.v0;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            fsi.a(strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "), z);
            ef6 ef6Var = new ef6();
            mjgVar.b();
            ef6Var.a = mjgVar.f;
            ef6Var.k = str;
            ef6Var.d = gf6Var.d;
            ef6Var.c = gf6Var.c;
            ef6Var.C = gf6Var.N0;
            ef6Var.m = gf6Var.x0;
            rfgVarB.d(new gf6(ef6Var));
            rfgVarArr[i] = rfgVarB;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hd5] */
    public j0f i(JSONObject jSONObject) {
        try {
            ?? arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rooms");
            if (jSONArrayOptJSONArray == null) {
                arrayList = hd5.a;
            } else {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    i0f i0fVarH = jSONObjectOptJSONObject != null ? ((hk4) this.c).h(jSONObjectOptJSONObject) : null;
                    if (i0fVarH != null) {
                        arrayList.add(i0fVarH);
                    }
                }
            }
            return new j0f(kk4.y(jSONObject), arrayList);
        } catch (JSONException e) {
            ((y6d) this.b).logException("SessionRoomsParser", "Can't parse rooms state", e);
            return null;
        }
    }

    public void j() {
        b6 b6Var = (b6) this.b;
        if (b6Var.b) {
            b6Var.j();
            for (int i = 0; i < 2; i++) {
                ((float[]) b6Var.d)[i] = ((float[]) b6Var.f)[i];
                ((float[]) b6Var.e)[i] = ((float[]) b6Var.g)[i];
            }
            if (b6Var.b) {
                return;
            }
            b6Var.b = true;
        }
    }

    @Override // defpackage.rrf
    public String l() {
        return (String) this.b;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        ubh ubhVar = (ubh) this.c;
        ((y6d) ubhVar.c).log("VideoRecord", "Capture started (success=" + z + "), notify listener");
        zkb zkbVar = ubhVar.g;
        ((ie8) zkbVar.b).g.execute(new i23(zkbVar, z, z ^ true));
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        ubh ubhVar = (ubh) this.c;
        ((y6d) ubhVar.c).log("VideoRecord", "Capture stopped, notify listener");
        zkb zkbVar = ubhVar.g;
        boolean z = false;
        ((ie8) zkbVar.b).g.execute(new i23(zkbVar, z, z));
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        switch (this.a) {
            case 2:
                ((v2f) this.c).onError(th);
                break;
            default:
                ((v2f) this.b).onError(th);
                break;
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 1:
                gri.a("Recorder", "Error in ReadyToReleaseFuture: " + th);
                break;
            case 8:
                int i = ((dsf) this.b).f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    gri.j("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + rmb.c(i), th);
                    break;
                } else {
                    gri.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    break;
                }
            default:
                zyf zyfVar = (zyf) this.c;
                h79 h79Var = (h79) this.b;
                if (!((knd) h79Var.c).g) {
                    int iA = ((h52) ((ArrayList) h79Var.b).get(0)).a();
                    if (th instanceof ImageCaptureException) {
                        b4 b4Var = zyfVar.c;
                        xb0 xb0Var = new xb0(iA, (ImageCaptureException) th);
                        b4Var.getClass();
                        jei.b();
                        ((q90) b4Var.o).i.accept(xb0Var);
                    } else {
                        b4 b4Var2 = zyfVar.c;
                        xb0 xb0Var2 = new xb0(iA, new ImageCaptureException("Failed to submit capture request", th));
                        b4Var2.getClass();
                        jei.b();
                        ((q90) b4Var2.o).i.accept(xb0Var2);
                    }
                    zyfVar.b.q();
                    break;
                }
                break;
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
    }

    public String toString() {
        switch (this.a) {
            case 16:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                if (linkedHashMap.isEmpty()) {
                    return sb.toString();
                }
                sb.append(' ');
                boolean z = true;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(';');
                    }
                    sb.append((String) entry.getKey());
                    String str = (String) entry.getValue();
                    if (str != null) {
                        sb.append('=');
                        sb.append(str);
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.rrf
    public void w(qrf qrfVar) {
        taj.a(qrfVar, (Object[]) this.c);
    }

    public /* synthetic */ aqc(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public aqc(y6d y6dVar, kk4 kk4Var, hk4 hk4Var) {
        this.a = 4;
        this.b = y6dVar;
        this.c = hk4Var;
    }

    public aqc(String str, LinkedHashMap linkedHashMap) {
        this.a = 16;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = linkedHashMap2;
        this.b = str;
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
    }

    public aqc(Executor executor) {
        this.a = 10;
        this.b = executor;
        this.c = new ArrayDeque();
    }

    public aqc(List list) {
        this.a = 12;
        this.b = list;
        this.c = new rfg[list.size()];
    }

    public aqc(int i) throws IOException, NumberFormatException {
        boolean z;
        this.a = i;
        switch (i) {
            case 18:
                return;
            default:
                this.b = new String[100];
                this.c = new String[100];
                Pattern patternCompile = Pattern.compile("\\|\\s+\\|\\s+\\|\\s+\\|");
                Pattern patternCompile2 = Pattern.compile("\\|\\s*(\\d+)\\s*\\|\\s*([^\\|]+)\\s*\\|\\s+\\|");
                Pattern patternCompile3 = Pattern.compile("\\|\\s*(\\d+)\\s*\\|\\s*([^\\|]+)\\s*\\|\\s*([^\\|]+)\\s*\\|");
                Pattern patternCompile4 = Pattern.compile("\\|\\s+\\|\\s*([^\\|]*)\\s*\\|\\s*([^\\|]*)\\s*\\|");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new StringReader("   | 0    | :authority                  |                              |\n   |      |                             |                              |\n   | 1    | :path                       | /                            |\n   |      |                             |                              |\n   | 2    | age                         | 0                            |\n   |      |                             |                              |\n   | 3    | content-disposition         |                              |\n   |      |                             |                              |\n   | 4    | content-length              | 0                            |\n   |      |                             |                              |\n   | 5    | cookie                      |                              |\n   |      |                             |                              |\n   | 6    | date                        |                              |\n   |      |                             |                              |\n   | 7    | etag                        |                              |\n   |      |                             |                              |\n   | 8    | if-modified-since           |                              |\n   |      |                             |                              |\n   | 9    | if-none-match               |                              |\n   |      |                             |                              |\n   | 10   | last-modified               |                              |\n   |      |                             |                              |\n   | 11   | link                        |                              |\n   |      |                             |                              |\n   | 12   | location                    |                              |\n   |      |                             |                              |\n   | 13   | referer                     |                              |\n   |      |                             |                              |\n   | 14   | set-cookie                  |                              |\n   |      |                             |                              |\n   | 15   | :method                     | CONNECT                      |\n   |      |                             |                              |\n   | 16   | :method                     | DELETE                       |\n   |      |                             |                              |\n   | 17   | :method                     | GET                          |\n   |      |                             |                              |\n   | 18   | :method                     | HEAD                         |\n   |      |                             |                              |\n   | 19   | :method                     | OPTIONS                      |\n   |      |                             |                              |\n   | 20   | :method                     | POST                         |\n   |      |                             |                              |\n   | 21   | :method                     | PUT                          |\n   |      |                             |                              |\n   | 22   | :scheme                     | http                         |\n   |      |                             |                              |\n   | 23   | :scheme                     | https                        |\n   |      |                             |                              |\n   | 24   | :status                     | 103                          |\n   |      |                             |                              |\n   | 25   | :status                     | 200                          |\n   |      |                             |                              |\n   | 26   | :status                     | 304                          |\n   |      |                             |                              |\n   | 27   | :status                     | 404                          |\n   |      |                             |                              |\n   | 28   | :status                     | 503                          |\n   |      |                             |                              |\n   | 29   | accept                      | */*                          |\n   |      |                             |                              |\n   | 30   | accept                      | application/dns-message      |\n   |      |                             |                              |\n   | 31   | accept-encoding             | gzip, deflate, br            |\n   |      |                             |                              |\n   | 32   | accept-ranges               | bytes                        |\n   |      |                             |                              |\n   | 33   | access-control-allow-       | cache-control                |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 34   | access-control-allow-       | content-type                 |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 35   | access-control-allow-origin | *                            |\n   |      |                             |                              |\n   | 36   | cache-control               | max-age=0                    |\n   |      |                             |                              |\n   | 37   | cache-control               | max-age=2592000              |\n   |      |                             |                              |\n   | 38   | cache-control               | max-age=604800               |\n   |      |                             |                              |\n   | 39   | cache-control               | no-cache                     |\n   |      |                             |                              |\n   | 40   | cache-control               | no-store                     |\n   |      |                             |                              |\n   | 41   | cache-control               | public, max-age=31536000     |\n   |      |                             |                              |\n   | 42   | content-encoding            | br                           |\n   |      |                             |                              |\n   | 43   | content-encoding            | gzip                         |\n   |      |                             |                              |\n   | 44   | content-type                | application/dns-message      |\n   |      |                             |                              |\n   | 45   | content-type                | application/javascript       |\n   |      |                             |                              |\n   | 46   | content-type                | application/json             |\n   |      |                             |                              |\n   | 47   | content-type                | application/x-www-form-      |\n   |      |                             | urlencoded                   |\n   |      |                             |                              |\n   | 48   | content-type                | image/gif                    |\n   |      |                             |                              |\n   | 49   | content-type                | image/jpeg                   |\n   |      |                             |                              |\n   | 50   | content-type                | image/png                    |\n   |      |                             |                              |\n   | 51   | content-type                | text/css                     |\n   |      |                             |                              |\n   | 52   | content-type                | text/html; charset=utf-8     |\n   |      |                             |                              |\n   | 53   | content-type                | text/plain                   |\n   |      |                             |                              |\n   | 54   | content-type                | text/plain;charset=utf-8     |\n   |      |                             |                              |\n   | 55   | range                       | bytes=0-                     |\n   |      |                             |                              |\n   | 56   | strict-transport-security   | max-age=31536000             |\n   |      |                             |                              |\n   | 57   | strict-transport-security   | max-age=31536000;            |\n   |      |                             | includesubdomains            |\n   |      |                             |                              |\n   | 58   | strict-transport-security   | max-age=31536000;            |\n   |      |                             | includesubdomains; preload   |\n   |      |                             |                              |\n   | 59   | vary                        | accept-encoding              |\n   |      |                             |                              |\n   | 60   | vary                        | origin                       |\n   |      |                             |                              |\n   | 61   | x-content-type-options      | nosniff                      |\n   |      |                             |                              |\n   | 62   | x-xss-protection            | 1; mode=block                |\n   |      |                             |                              |\n   | 63   | :status                     | 100                          |\n   |      |                             |                              |\n   | 64   | :status                     | 204                          |\n   |      |                             |                              |\n   | 65   | :status                     | 206                          |\n   |      |                             |                              |\n   | 66   | :status                     | 302                          |\n   |      |                             |                              |\n   | 67   | :status                     | 400                          |\n   |      |                             |                              |\n   | 68   | :status                     | 403                          |\n   |      |                             |                              |\n   | 69   | :status                     | 421                          |\n   |      |                             |                              |\n   | 70   | :status                     | 425                          |\n   |      |                             |                              |\n   | 71   | :status                     | 500                          |\n   |      |                             |                              |\n   | 72   | accept-language             |                              |\n   |      |                             |                              |\n   | 73   | access-control-allow-       | FALSE                        |\n   |      | credentials                 |                              |\n   |      |                             |                              |\n   | 74   | access-control-allow-       | TRUE                         |\n   |      | credentials                 |                              |\n   |      |                             |                              |\n   | 75   | access-control-allow-       | *                            |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 76   | access-control-allow-       | get                          |\n   |      | methods                     |                              |\n   |      |                             |                              |\n   | 77   | access-control-allow-       | get, post, options           |\n   |      | methods                     |                              |\n   |      |                             |                              |\n   | 78   | access-control-allow-       | options                      |\n   |      | methods                     |                              |\n   |      |                             |                              |\n   | 79   | access-control-expose-      | content-length               |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 80   | access-control-request-     | content-type                 |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 81   | access-control-request-     | get                          |\n   |      | method                      |                              |\n   |      |                             |                              |\n   | 82   | access-control-request-     | post                         |\n   |      | method                      |                              |\n   |      |                             |                              |\n   | 83   | alt-svc                     | clear                        |\n   |      |                             |                              |\n   | 84   | authorization               |                              |\n   |      |                             |                              |\n   | 85   | content-security-policy     | script-src 'none'; object-   |\n   |      |                             | src 'none'; base-uri 'none'  |\n   |      |                             |                              |\n   | 86   | early-data                  | 1                            |\n   |      |                             |                              |\n   | 87   | expect-ct                   |                              |\n   |      |                             |                              |\n   | 88   | forwarded                   |                              |\n   |      |                             |                              |\n   | 89   | if-range                    |                              |\n   |      |                             |                              |\n   | 90   | origin                      |                              |\n   |      |                             |                              |\n   | 91   | purpose                     | prefetch                     |\n   |      |                             |                              |\n   | 92   | server                      |                              |\n   |      |                             |                              |\n   | 93   | timing-allow-origin         | *                            |\n   |      |                             |                              |\n   | 94   | upgrade-insecure-requests   | 1                            |\n   |      |                             |                              |\n   | 95   | user-agent                  |                              |\n   |      |                             |                              |\n   | 96   | x-forwarded-for             |                              |\n   |      |                             |                              |\n   | 97   | x-frame-options             | deny                         |\n   |      |                             |                              |\n   | 98   | x-frame-options             | sameorigin                   |"));
                    int i2 = 0;
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        String strTrim = line.trim();
                        if (!patternCompile.matcher(strTrim).matches()) {
                            boolean z2 = true;
                            if (patternCompile2.matcher(strTrim).matches()) {
                                Matcher matcher = patternCompile2.matcher(strTrim);
                                matcher.matches();
                                ((String[]) this.b)[Integer.parseInt(matcher.group(1).trim())] = matcher.group(2).trim();
                                ((String[]) this.c)[Integer.parseInt(matcher.group(1).trim())] = "";
                                i2 = Integer.parseInt(matcher.group(1).trim());
                            } else if (patternCompile3.matcher(strTrim).matches()) {
                                Matcher matcher2 = patternCompile3.matcher(strTrim);
                                matcher2.matches();
                                ((String[]) this.b)[Integer.parseInt(matcher2.group(1).trim())] = matcher2.group(2).trim();
                                ((String[]) this.c)[Integer.parseInt(matcher2.group(1).trim())] = matcher2.group(3).trim();
                                i2 = Integer.parseInt(matcher2.group(1).trim());
                            } else if (patternCompile4.matcher(strTrim).matches()) {
                                Matcher matcher3 = patternCompile4.matcher(strTrim);
                                matcher3.matches();
                                String strTrim2 = matcher3.group(1).trim();
                                String strTrim3 = matcher3.group(2).trim();
                                int length = strTrim2.length();
                                int iCharCount = 0;
                                while (true) {
                                    if (iCharCount < length) {
                                        int iCodePointAt = strTrim2.codePointAt(iCharCount);
                                        if (Character.isWhitespace(iCodePointAt)) {
                                            iCharCount += Character.charCount(iCodePointAt);
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    String[] strArr = (String[]) this.b;
                                    strArr[i2] = strArr[i2] + strTrim2;
                                }
                                int length2 = strTrim3.length();
                                int iCharCount2 = 0;
                                while (true) {
                                    if (iCharCount2 < length2) {
                                        int iCodePointAt2 = strTrim3.codePointAt(iCharCount2);
                                        if (Character.isWhitespace(iCodePointAt2)) {
                                            iCharCount2 += Character.charCount(iCodePointAt2);
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                }
                                if (!z2) {
                                    String[] strArr2 = (String[]) this.c;
                                    strArr2[i2] = strArr2[i2] + strTrim3;
                                }
                            } else {
                                throw new RuntimeException("Internal error: parsing static table definition failed.");
                            }
                        }
                    }
                    return;
                } catch (IOException unused) {
                    throw new RuntimeException("Corrupt library, missing internal resource.");
                }
        }
    }

    public aqc(b6 b6Var) {
        this.a = 11;
        this.c = null;
        this.b = b6Var;
        b6Var.h = this;
    }

    public aqc(y9g y9gVar) {
        this.a = 0;
        this.b = y9gVar;
        this.c = new qyg(2, false);
    }

    public aqc(ViewPager viewPager) {
        this.a = 14;
        this.c = viewPager;
        this.b = new Rect();
    }
}
