package defpackage;

import android.content.Intent;
import android.media.MediaDrmException;
import android.net.Uri;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import one.me.android.MainActivity;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandExecutionException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;

/* loaded from: classes.dex */
public final class b6a implements ox7, zc3, sy2, tm6, gu3, c47, weg, nva, w57, el5, qu6, gr3, rof, mud {
    public final /* synthetic */ int a;
    public static final b6a b = new b6a(1);
    public static final b6a c = new b6a(2);
    public static final b6a d = new b6a(3);
    public static final yt0 o = new yt0(new rt0(new qt0(-1559456768, -1559456768, 1712100352), new st0(new tt0(520918016, 824320), new ut0(1024234496, 824320), new vt0(1024234496, 824320)), new wt0(-1810393, 350511143, -1, -2062773248), new xt0(1306812455, 182738983, 14966823, new int[]{1306812455, -2132516825}), -1810393, 1038376999, 350511143, -1, 350511143, -4112, 350511143, -1, 350511143, 2061787175, new int[]{-1, -1, -1}, new int[]{-1, -1}), new zt0(-1, -1810393, -1685946, -53188, -1810393, -1293656025, -2062807794, -1, -6716293, -6716293, -1810393, -1559491314, -1895035634, 1879837966, -1895035634), new au0(-1, 350511143, -1810393, -1), new bu0(new cu0(-1, -1810393, -1810393, -1), -1810393, -1810393, -1810393, -15987442, -2062807794, -2062807794, -1207169778, -1810393, 16777215, -2062807794, -1207169778, -2062807794));
    public static final yt0 X = new yt0(new rt0(new qt0(-1728006644, -1728006644, 1711322636), new st0(new tt0(535060519, 14966823), new ut0(1038376999, 14966823), new vt0(1038376999, 14966823)), new wt0(-1810393, 535060519, -1, -2062773248), new xt0(1306812455, 182738983, 14966823, new int[]{1306812455, -2132516825}), -1810393, 1558470695, 350511143, -463174, 350511143, 350511143, 535060519, -656897, 350511143, 2061787175, new int[]{-463174, -463174, -463174}, new int[]{-1442305, -1442305}), new zt0(-528967, -1810393, -1685946, -16711919, -1810393, -1810393, -1810393, -1, -2060246011, -2060246011, -16711919, -1556929531, -1892473851, 1882399749, -1892473851), new au0(-1442305, 350511143, -1810393, -1), new bu0(new cu0(-1, -1810393, -1810393, -1), -1810393, -1810393, -16711919, -13425659, -2060246011, -2060246011, -1204607995, -1810393, 16777215, -2060246011, -1204607995, -1810393));
    public static final th3 Y = new th3(new hg3(new gg3(-53188, -15921907, -15952896, -2490410), new ig3(-15987442, -4933959, -15952896)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -10308967, -4204210, 1073837832, -12544396, -6044365, 0, 0, 0, 0, 0, 0), new lg3(1033643952, 698099632, -6543440, -1543503873, 1024489791, 688945471, -15697601, -371456, 1039815936, 704271616, -371456, -16544549, 1023642843, 688098523, -16544549, -2409396, 1037777996, 702233676, -2409396, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -1810393, 1038376999, 702832679, -1810393, -9158436, 1031028956, 695484636, -9158436), new og3(new mg3(1308622847, new int[]{16777215, 1090519039, -2130706433}), new ng3(-986638, new int[]{16777215, 1090519039, -2130706433}), new qg3(new pg3(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new sg3(new rg3(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new tg3(new int[]{-1543503873, -520093697, -520093697}, -12084155, -16729857, 47359, -6110671, 10666545, 872415231, 452984831, -1, -2130706433), -15952896, 1543503872, -2062392824, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521486, -871625458, -1727263474, 1306812455, -1810393, -1184014, -7420555, new int[]{-2062392824, -2062392824}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-10308967, -4204210}), new vh3(-15952896, -15952896, -53188, -2062807794, -15952896, -855638017), new bi3(new ci3(251658240, 167772160), new di3(251658240), new ei3(251658240)), new ji3(new hi3(new gi3(new fi3(-16023552), 520093696), new ii3(-1727228928, 168627469, 2047675661)), new ki3(new li3(-1545253546, -1727228928)), new mi3(new ni3(-1543503873, -1191182337, -1545253546, -1552910737, -1727228928))), new oi3(new pi3(688655630, 252448014), -1, 1308622847), new qi3(-1, -15987442, -1, -53188, -15987698, -2062808050, 1712065550, -15952896));
    public static final wcg Z = new wcg(new tcg(new ucg(-15921907, 336136457, -1810393, -1), new vcg(2047675661, 168364297, -1713086425)), new xcg(new ycg(-1, 336136457, -15921907, -4407874, -11447211, -7762804, -1810393), new zcg(-1191182337, -1191182337, -1545253546, 168364297, -1552977290, -1552977290, -1552977290, -1552977290, -1713086425)), new adg(new bdg(new cdg(688655630, 252448014))), new ddg(new edg(-1, -15921907, -2062742259, -1810393), new fdg(-1543503873, -1191182337, -1552977290, -1552977290, -1713086425)));
    public static final r6i s0 = new r6i(new q6i(-592138, -1, 336136457, -1), new s6i(-15987442, -7762804, -7762804, -1810393, 1879837966), new t6i(252448014, 252448014, -1810393), new u6i(-15987442, -1810393, 1712065806, -15987442, -1207169778, -2062807794, -2062807794, -1810393));
    public static final b6a t0 = new b6a(4);
    public static final b6a u0 = new b6a(5);
    public static final b6a v0 = new b6a(6);
    public static final b6a w0 = new b6a(7);
    public static final b6a x0 = new b6a(8);
    public static final b6a y0 = new b6a(9);
    public static final b6a z0 = new b6a(10);
    public static final b6a A0 = new b6a(11);
    public static final /* synthetic */ b6a B0 = new b6a(12);

    public /* synthetic */ b6a(int i) {
        this.a = i;
    }

    public static rud L(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("response");
        string.getClass();
        if (string.equals("report-perf-stat")) {
            return new rmd(jSONObject.has("estimatedPerformanceIndex") ? Integer.valueOf(jSONObject.getInt("estimatedPerformanceIndex")) : null);
        }
        if (!string.equals("update-display-layout")) {
            return null;
        }
        if (!jSONObject.has("errorCodeByParticipantId")) {
            return new ctg(Collections.EMPTY_MAP);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("errorCodeByParticipantId");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(paj.J(next), jSONObject2.getInt(next) == -1 ? btg.b : btg.a);
        }
        return new ctg(map);
    }

    public static JSONObject M(long j, gud gudVar) throws JSONException {
        String str;
        if (gudVar instanceof qmd) {
            qmd qmdVar = (qmd) gudVar;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("framesReceived", qmdVar.a);
            jSONObject.put("framesDecoded", qmdVar.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sequence", j);
            jSONObject2.put("command", "report-perf-stat");
            jSONObject2.put("report", jSONObject);
            return jSONObject2;
        }
        if (!(gudVar instanceof atg)) {
            if (gudVar instanceof and) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sequence", j);
                jSONObject3.put("command", "request-asr");
                jSONObject3.put("start", ((and) gudVar).a);
                return jSONObject3;
            }
            if (!(gudVar instanceof omd)) {
                return null;
            }
            omd omdVar = (omd) gudVar;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sequence", j);
            jSONObject4.put("command", "report-network-stat");
            jSONObject4.put("timestamp", omdVar.a);
            jSONObject4.put("bitrate", omdVar.b);
            return jSONObject4;
        }
        atg atgVar = (atg) gudVar;
        JSONObject jSONObject5 = new JSONObject();
        Iterator it = atgVar.a.iterator();
        while (it.hasNext()) {
            jfe jfeVar = (jfe) it.next();
            ife ifeVar = jfeVar.b;
            if (ifeVar.a) {
                str = "ss";
            } else {
                str = "sz=" + ifeVar.b + "x" + ifeVar.c + ":fit=" + ctd.b(ifeVar.d);
            }
            jSONObject5.put(paj.H(jfeVar), str);
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("sequence", j);
        jSONObject6.put("command", "update-display-layout");
        jSONObject6.put("layouts", jSONObject5);
        if (atgVar.b) {
            jSONObject6.put("snapshot", true);
        }
        return jSONObject6;
    }

    public static final qy6 N() {
        int i = ry6.d;
        qy6 qy6Var = new qy6();
        qy6Var.a = 0;
        qy6Var.b = 0;
        qy6Var.c = 0.0f;
        qy6Var.d = 0;
        qy6Var.e = false;
        qy6Var.f = 1;
        return qy6Var;
    }

    public static final q93 O(b6a b6aVar, String str) {
        q93 q93Var = new q93(str);
        q93.c.put(str, q93Var);
        return q93Var;
    }

    public static boolean P(File file) {
        Object ipdVar;
        try {
            ipdVar = Boolean.valueOf(file.exists() && file.canRead());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Object obj = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = obj;
        }
        return ((Boolean) ipdVar).booleanValue();
    }

    public static boolean Q(String str) {
        Object ipdVar;
        try {
            ipdVar = Boolean.valueOf(P(new File(str)));
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Object obj = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = obj;
        }
        return ((Boolean) ipdVar).booleanValue();
    }

    public static File S(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (file2.exists()) {
            int iG = vmf.G(str, '.', 0, 6);
            int i = 0;
            while (i < 100) {
                if (iG != -1) {
                    str2 = str.substring(0, iG) + "(" + (i + 1) + ")" + str.substring(iG);
                } else {
                    str2 = str + "(" + (i + 1) + ")";
                }
                File file3 = new File(file, str2);
                if (!file3.exists()) {
                    return file3;
                }
                i++;
                file2 = file3;
            }
        }
        return file2;
    }

    public static long U(String str) {
        Object ipdVar;
        try {
            ipdVar = Long.valueOf(new File(str).length());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = 0L;
        }
        return ((Number) ipdVar).longValue();
    }

    public static void V(String str) {
        Object ipdVar;
        Object ipdVar2;
        try {
            File file = new File(str);
            try {
                ipdVar2 = Boolean.valueOf(file.exists() ? file.delete() : false);
            } catch (Throwable th) {
                ipdVar2 = new ipd(th);
            }
            Object obj = Boolean.FALSE;
            if (ipdVar2 instanceof ipd) {
                ipdVar2 = obj;
            }
            ipdVar = (Boolean) ipdVar2;
        } catch (Throwable th2) {
            ipdVar = new ipd(th2);
        }
        Object obj2 = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = obj2;
        }
    }

    public static void W(ln lnVar, Uri uri, cdb cdbVar, ia iaVar, int i) {
        int i2 = MainActivity.a1;
        if ((i & 2) != 0) {
            uri = null;
        }
        if ((i & 4) != 0) {
            cdbVar = null;
        }
        em6 wm7Var = iaVar;
        if ((i & 8) != 0) {
            wm7Var = new wm7(11);
        }
        Intent intent = new Intent(lnVar, (Class<?>) MainActivity.class);
        intent.putExtra("deep_link", uri != null ? uri : null);
        intent.putExtra("snackbar", cdbVar);
        wm7Var.invoke(intent);
        lnVar.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x0376 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.zc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l0g A(defpackage.tm9 r18) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6a.A(tm9):l0g");
    }

    @Override // defpackage.el5
    public byte[] B(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.c47
    public boolean C(long j) {
        return System.currentTimeMillis() < j;
    }

    @Override // defpackage.el5
    public void D(ukd ukdVar) {
    }

    @Override // defpackage.el5
    public void E(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.el5
    public cl5 F(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Y;
    }

    @Override // defpackage.el5
    public int H() {
        return 1;
    }

    @Override // defpackage.rof
    public int J(hf6 hf6Var) {
        String str = hf6Var.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(wy1.h("Unsupported MIME type: ", str));
    }

    @Override // defpackage.el5
    public boolean K(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public synchronized q93 R(String str) {
        q93 q93Var;
        try {
            LinkedHashMap linkedHashMap = q93.c;
            q93Var = (q93) linkedHashMap.get(str);
            if (q93Var == null) {
                q93Var = (q93) linkedHashMap.get(dnf.r(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : dnf.r(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (q93Var == null) {
                    q93Var = new q93(str);
                }
                linkedHashMap.put(str, q93Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q93Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:25:0x007a, B:21:0x005b, B:28:0x0084, B:19:0x004b), top: B:44:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:25:0x007a, B:21:0x005b, B:28:0x0084, B:19:0x004b), top: B:44:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0077 -> B:25:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T(java.io.File r13, java.io.InputStream r14, defpackage.q44 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.gz5
            if (r0 == 0) goto L13
            r0 = r15
            gz5 r0 = (defpackage.gz5) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v0 = r1
            goto L18
        L13:
            gz5 r0 = new gz5
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.t0
            int r1 = r0.v0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 != r3) goto L39
            long r13 = r0.s0
            byte[] r1 = r0.Z
            java.io.OutputStream r4 = r0.Y
            java.io.Closeable r5 = r0.X
            java.io.InputStream r6 = r0.o
            java.io.Closeable r7 = r0.d
            defpackage.g8j.b(r15)     // Catch: java.lang.Throwable -> L36
            r10 = r13
            r13 = r6
            r14 = r7
            r6 = r10
            goto L7a
        L36:
            r13 = move-exception
            r14 = r7
            goto L93
        L39:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L41:
            defpackage.g8j.b(r15)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r13, r2)
            r13 = 8192(0x2000, float:1.148E-41)
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> L82
            java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L82
            int r15 = r14.read(r13)     // Catch: java.lang.Throwable -> L82
            r6 = 0
            r1 = r13
            r13 = r14
            r4 = r5
        L59:
            if (r15 < 0) goto L84
            java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L82
            r4.write(r1, r2, r15)     // Catch: java.lang.Throwable -> L82
            long r8 = (long) r15     // Catch: java.lang.Throwable -> L82
            long r6 = r6 + r8
            r0.d = r14     // Catch: java.lang.Throwable -> L82
            r0.o = r13     // Catch: java.lang.Throwable -> L82
            r0.X = r5     // Catch: java.lang.Throwable -> L82
            r0.Y = r4     // Catch: java.lang.Throwable -> L82
            r0.Z = r1     // Catch: java.lang.Throwable -> L82
            r0.s0 = r6     // Catch: java.lang.Throwable -> L82
            r0.v0 = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r15 = defpackage.sti.c(r0)     // Catch: java.lang.Throwable -> L82
            g84 r8 = defpackage.g84.a
            if (r15 != r8) goto L7a
            return r8
        L7a:
            java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L82
            int r15 = r13.read(r1)     // Catch: java.lang.Throwable -> L82
            goto L59
        L82:
            r13 = move-exception
            goto L93
        L84:
            r4.flush()     // Catch: java.lang.Throwable -> L82
            r13 = 0
            defpackage.r4j.a(r5, r13)     // Catch: java.lang.Throwable -> L91
            defpackage.r4j.a(r14, r13)
            qqg r13 = defpackage.qqg.a
            return r13
        L91:
            r13 = move-exception
            goto L99
        L93:
            throw r13     // Catch: java.lang.Throwable -> L94
        L94:
            r15 = move-exception
            defpackage.r4j.a(r5, r13)     // Catch: java.lang.Throwable -> L91
            throw r15     // Catch: java.lang.Throwable -> L91
        L99:
            throw r13     // Catch: java.lang.Throwable -> L9a
        L9a:
            r15 = move-exception
            defpackage.r4j.a(r14, r13)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6a.T(java.io.File, java.io.InputStream, q44):java.lang.Object");
    }

    @Override // defpackage.gr3
    public void a(byte[] bArr) {
        throw new IllegalStateException("No connection");
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                wqi.e(f35.g, "restoreUploadsFromStorage: failed", (Throwable) obj);
                break;
            default:
                wqi.e(vm9.class.getName(), "fail restore uploads", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        return (j0e) ((n0g) ((m0g) qn3.h.getValue())).c.getValue();
    }

    @Override // defpackage.mud
    public v32 b(int i, byte[] bArr) throws RtcCommandSerializeException, RtcCommandExecutionException {
        if (i == 0) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (i != 1) {
            throw new RtcCommandSerializeException(null, false, new UnsupportedOperationException("Only text format is supported"));
        }
        try {
            String str = new String(bArr);
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    Long lValueOf = jSONObject.has("sequence") ? Long.valueOf(jSONObject.getLong("sequence")) : null;
                    String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                    if ("response".equals(string)) {
                        if (lValueOf == null) {
                            throw new RtcCommandSerializeException(lValueOf, false, new IllegalArgumentException("Unable to decode response id: ".concat(str)));
                        }
                        try {
                            rud rudVarL = L(jSONObject);
                            if (rudVarL != null) {
                                return new v32(lValueOf.longValue(), rudVarL, 11);
                            }
                        } catch (Throwable th) {
                            throw new RtcCommandSerializeException(lValueOf, false, new IllegalArgumentException("Unable to decode response body: ".concat(str), th));
                        }
                    } else if (NegotiationErrorStat.KEY_ERROR.equals(string)) {
                        jSONObject.optString(NegotiationErrorStat.KEY_ERROR, "");
                        boolean zOptBoolean = jSONObject.optBoolean("recoverable", false);
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String strOptString = jSONObject.optString(next);
                            if (strOptString != null) {
                                map.put(next, strOptString);
                            }
                        }
                        throw new RtcCommandExecutionException(lValueOf, zOptBoolean, null);
                    }
                    return null;
                } catch (Throwable th2) {
                    throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response id/type: ".concat(str), th2));
                }
            } catch (Throwable th3) {
                throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as json: ".concat(str), th3));
            }
        } catch (Throwable th4) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as string", th4));
        }
    }

    @Override // defpackage.el5
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gr3
    public boolean close() {
        return false;
    }

    @Override // defpackage.w57
    public xmb d() {
        return new u57();
    }

    @Override // defpackage.c47
    public boolean e() {
        return true;
    }

    @Override // defpackage.rof
    public boolean f(hf6 hf6Var) {
        String str = hf6Var.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.sy2
    public int g(int i) {
        r6i r6iVar = s0;
        t6i t6iVar = r6iVar.c;
        q6i q6iVar = r6iVar.a;
        s6i s6iVar = r6iVar.b;
        u6i u6iVar = r6iVar.d;
        wcg wcgVar = Z;
        adg adgVar = wcgVar.c;
        tcg tcgVar = wcgVar.a;
        ddg ddgVar = wcgVar.d;
        xcg xcgVar = wcgVar.b;
        th3 th3Var = Y;
        oi3 oi3Var = th3Var.f;
        bi3 bi3Var = th3Var.d;
        vh3 vh3Var = th3Var.c;
        hg3 hg3Var = th3Var.a;
        qi3 qi3Var = th3Var.g;
        ji3 ji3Var = th3Var.e;
        kg3 kg3Var = th3Var.b;
        if (i == vuc.chat_common_action_background_error) {
            return hg3Var.a.a;
        }
        if (i == vuc.chat_common_action_background_neutral) {
            return hg3Var.a.b;
        }
        if (i == vuc.chat_common_action_background_themed) {
            return hg3Var.a.c;
        }
        if (i == vuc.chat_common_action_background_themedFade) {
            return hg3Var.a.d;
        }
        if (i == vuc.chat_common_action_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_action_icon_neutral) {
            return hg3Var.b.a;
        }
        if (i == vuc.chat_common_action_icon_neutralSecondary) {
            return hg3Var.b.b;
        }
        if (i == vuc.chat_common_action_icon_themedFade) {
            return hg3Var.b.c;
        }
        if (i == vuc.chat_common_background_accent) {
            return kg3Var.e;
        }
        if (i == vuc.chat_common_background_capsule) {
            return kg3Var.f;
        }
        if (i == vuc.chat_common_background_capsuleOutside) {
            return kg3Var.g;
        }
        if (i == vuc.chat_common_background_capsuleSecondary) {
            return kg3Var.h;
        }
        if (i == vuc.chat_common_background_chatFAB) {
            return kg3Var.i;
        }
        if (i == vuc.chat_common_background_contrastFloatingSecondary) {
            return kg3Var.j;
        }
        if (i == vuc.chat_common_background_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_background_neutral) {
            return kg3Var.k;
        }
        if (i == vuc.chat_common_background_neutralFade) {
            return 1543503872;
        }
        if (i == vuc.chat_common_background_neutralFadeSecondary) {
            return kg3Var.l;
        }
        if (i == vuc.chat_common_background_neutralFadeTertiary) {
            return kg3Var.m;
        }
        if (i == vuc.chat_common_background_neutralThemed) {
            return kg3Var.n;
        }
        if (i == vuc.chat_common_background_overlay) {
            return kg3Var.o;
        }
        if (i == vuc.chat_common_background_overlayHard) {
            return kg3Var.p;
        }
        if (i == vuc.chat_common_background_overlaySecondary) {
            return kg3Var.q;
        }
        if (i == vuc.chat_common_background_pattern) {
            return kg3Var.r;
        }
        if (i == vuc.chat_common_background_searchHighlight) {
            return kg3Var.s;
        }
        if (i == vuc.chat_common_background_stickerBlank) {
            return kg3Var.t;
        }
        if (i == vuc.chat_common_background_surfaceGround) {
            return kg3Var.u;
        }
        if (i == vuc.chat_common_background_timelineActive) {
            return -1191182337;
        }
        if (i == vuc.chat_common_background_timelinePassive) {
            return 1392508927;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep1) {
            return kg3Var.a.a;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep2) {
            return kg3Var.a.b;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep3) {
            return kg3Var.a.c;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep4) {
            return kg3Var.a.d;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep5) {
            return kg3Var.a.e;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep6) {
            return kg3Var.a.f;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep1) {
            return kg3Var.a.g;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep2) {
            return kg3Var.a.h;
        }
        if (i == vuc.chat_common_background_chatBackground_patternColor) {
            return kg3Var.a.i;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep1) {
            return kg3Var.a.j;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep2) {
            return kg3Var.a.k;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep1) {
            return kg3Var.a.l;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep2) {
            return kg3Var.a.m;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep3) {
            return kg3Var.a.n;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep4) {
            return kg3Var.a.o;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep5) {
            return kg3Var.a.p;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep6) {
            return kg3Var.a.q;
        }
        if (i == vuc.chat_common_background_fileType_archiveBadge) {
            return -6543440;
        }
        if (i == vuc.chat_common_background_fileType_archiveBkg) {
            return kg3Var.b.a;
        }
        if (i == vuc.chat_common_background_fileType_archiveElement) {
            return kg3Var.b.b;
        }
        if (i == vuc.chat_common_background_fileType_archiveIcon) {
            return kg3Var.b.c;
        }
        if (i == vuc.chat_common_background_fileType_background) {
            return kg3Var.b.d;
        }
        if (i == vuc.chat_common_background_fileType_dataBadge) {
            return -15697601;
        }
        if (i == vuc.chat_common_background_fileType_dataBkg) {
            return kg3Var.b.e;
        }
        if (i == vuc.chat_common_background_fileType_dataElement) {
            return kg3Var.b.f;
        }
        if (i == vuc.chat_common_background_fileType_dataIcon) {
            return kg3Var.b.g;
        }
        if (i == vuc.chat_common_background_fileType_imageBadge) {
            return kg3Var.b.h;
        }
        if (i == vuc.chat_common_background_fileType_imageBkg) {
            return kg3Var.b.i;
        }
        if (i == vuc.chat_common_background_fileType_imageElement) {
            return kg3Var.b.j;
        }
        if (i == vuc.chat_common_background_fileType_imageIcon) {
            return kg3Var.b.k;
        }
        if (i == vuc.chat_common_background_fileType_musicBadge) {
            return kg3Var.b.l;
        }
        if (i == vuc.chat_common_background_fileType_musicBkg) {
            return kg3Var.b.m;
        }
        if (i == vuc.chat_common_background_fileType_musicElement) {
            return kg3Var.b.n;
        }
        if (i == vuc.chat_common_background_fileType_musicIcon) {
            return kg3Var.b.o;
        }
        if (i == vuc.chat_common_background_fileType_presentationBadge) {
            return kg3Var.b.p;
        }
        if (i == vuc.chat_common_background_fileType_presentationBkg) {
            return kg3Var.b.q;
        }
        if (i == vuc.chat_common_background_fileType_presentationElement) {
            return kg3Var.b.r;
        }
        if (i == vuc.chat_common_background_fileType_presentationIcon) {
            return kg3Var.b.s;
        }
        if (i == vuc.chat_common_background_fileType_programBadge) {
            return kg3Var.b.t;
        }
        if (i == vuc.chat_common_background_fileType_programBkg) {
            return kg3Var.b.u;
        }
        if (i == vuc.chat_common_background_fileType_programElement) {
            return kg3Var.b.v;
        }
        if (i == vuc.chat_common_background_fileType_programIcon) {
            return kg3Var.b.w;
        }
        if (i == vuc.chat_common_background_fileType_textBadge) {
            return -14983490;
        }
        if (i == vuc.chat_common_background_fileType_textBkg) {
            return kg3Var.b.x;
        }
        if (i == vuc.chat_common_background_fileType_textElement) {
            return kg3Var.b.y;
        }
        if (i == vuc.chat_common_background_fileType_textIcon) {
            return kg3Var.b.z;
        }
        if (i == vuc.chat_common_background_fileType_unknownBadge) {
            return kg3Var.b.A;
        }
        if (i == vuc.chat_common_background_fileType_unknownBkg) {
            return kg3Var.b.B;
        }
        if (i == vuc.chat_common_background_fileType_unknownElement) {
            return kg3Var.b.C;
        }
        if (i == vuc.chat_common_background_fileType_unknownIcon) {
            return kg3Var.b.D;
        }
        if (i == vuc.chat_common_background_fileType_videoBadge) {
            return kg3Var.b.E;
        }
        if (i == vuc.chat_common_background_fileType_videoBkg) {
            return kg3Var.b.F;
        }
        if (i == vuc.chat_common_background_fileType_videoElement) {
            return kg3Var.b.G;
        }
        if (i == vuc.chat_common_background_fileType_videoIcon) {
            return kg3Var.b.H;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientPrimary_staticBackground) {
            return kg3Var.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientSecondary_staticBackground) {
            return kg3Var.c.b.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerPrimary_baseGradient_staticBackground) {
            return kg3Var.c.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerSecondary_baseGradient_staticBackground) {
            return kg3Var.c.d.a.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRBackground) {
            return kg3Var.d.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep1) {
            return kg3Var.d.c;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep2) {
            return kg3Var.d.d;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep3) {
            return kg3Var.d.e;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep4) {
            return kg3Var.d.f;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep1) {
            return kg3Var.d.g;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep2) {
            return kg3Var.d.h;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep1) {
            return kg3Var.d.i;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep2) {
            return kg3Var.d.j;
        }
        if (i == vuc.chat_common_icon_accent) {
            return vh3Var.a;
        }
        if (i == vuc.chat_common_icon_accentContrast) {
            return vh3Var.b;
        }
        if (i == vuc.chat_common_icon_capsule || i == vuc.chat_common_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_icon_negative) {
            return vh3Var.c;
        }
        if (i == vuc.chat_common_icon_secondary) {
            return vh3Var.d;
        }
        if (i == vuc.chat_common_icon_themed) {
            return vh3Var.e;
        }
        if (i == vuc.chat_common_icon_verificationCapsule) {
            return vh3Var.f;
        }
        if (i == vuc.chat_common_shadows_elevation2_primary) {
            return bi3Var.a.a;
        }
        if (i == vuc.chat_common_shadows_elevation2_secondary) {
            return bi3Var.a.b;
        }
        if (i == vuc.chat_common_shadows_topBar_color) {
            return bi3Var.b.a;
        }
        if (i == vuc.chat_common_shadows_writeBar_color) {
            return bi3Var.c.a;
        }
        if (i == vuc.chat_common_states_background_active_neutralFadeTertiary) {
            return ji3Var.a.a.b;
        }
        if (i == vuc.chat_common_states_background_active_action_themed) {
            return ji3Var.a.a.a.a;
        }
        if (i == vuc.chat_common_states_background_disabled_accent) {
            return ji3Var.a.b.a;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralFadeSecondary) {
            return ji3Var.a.b.b;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralThemed) {
            return ji3Var.a.b.c;
        }
        if (i == vuc.chat_common_states_icon_disabled_negative) {
            return ji3Var.b.a.a;
        }
        if (i == vuc.chat_common_states_icon_disabled_themed) {
            return ji3Var.b.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_contrast) {
            return ji3Var.c.a.a;
        }
        if (i == vuc.chat_common_states_text_disabled_contrastStatic) {
            return ji3Var.c.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_negative) {
            return ji3Var.c.a.c;
        }
        if (i == vuc.chat_common_states_text_disabled_primary) {
            return ji3Var.c.a.d;
        }
        if (i == vuc.chat_common_states_text_disabled_themed) {
            return ji3Var.c.a.e;
        }
        if (i == vuc.chat_common_stroke_contrast) {
            return oi3Var.b;
        }
        if (i == vuc.chat_common_stroke_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_stroke_glass) {
            return oi3Var.c;
        }
        if (i == vuc.chat_common_stroke_separator_primary) {
            return oi3Var.a.a;
        }
        if (i == vuc.chat_common_stroke_separator_secondary) {
            return oi3Var.a.b;
        }
        if (i == vuc.chat_common_text_capsule) {
            return qi3Var.a;
        }
        if (i == vuc.chat_common_text_capsuleSecondary) {
            return qi3Var.b;
        }
        if (i == vuc.chat_common_text_contrast) {
            return qi3Var.c;
        }
        if (i == vuc.chat_common_text_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_text_fileType) {
            return -520093697;
        }
        if (i == vuc.chat_common_text_negative) {
            return qi3Var.d;
        }
        if (i == vuc.chat_common_text_primary) {
            return qi3Var.e;
        }
        if (i == vuc.chat_common_text_secondary) {
            return qi3Var.f;
        }
        if (i == vuc.chat_common_text_tertiary) {
            return qi3Var.g;
        }
        if (i == vuc.chat_common_text_themed) {
            return qi3Var.h;
        }
        if (i == vuc.chat_topbar_background_default_neutral) {
            return tcgVar.a.a;
        }
        if (i == vuc.chat_topbar_background_default_neutralFade) {
            return tcgVar.a.b;
        }
        if (i == vuc.chat_topbar_background_default_primary) {
            return -855638017;
        }
        if (i == vuc.chat_topbar_background_default_themed) {
            return tcgVar.a.c;
        }
        if (i == vuc.chat_topbar_background_default_topbar) {
            return tcgVar.a.d;
        }
        if (i == vuc.chat_topbar_background_disabled_neutral) {
            return tcgVar.b.a;
        }
        if (i == vuc.chat_topbar_background_disabled_neutralFade) {
            return tcgVar.b.b;
        }
        if (i == vuc.chat_topbar_background_disabled_themed) {
            return tcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_default_contrast) {
            return xcgVar.a.a;
        }
        if (i == vuc.chat_topbar_icon_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_icon_default_neutralFade) {
            return xcgVar.a.b;
        }
        if (i == vuc.chat_topbar_icon_default_primary) {
            return xcgVar.a.c;
        }
        if (i == vuc.chat_topbar_icon_default_quaternary) {
            return xcgVar.a.d;
        }
        if (i == vuc.chat_topbar_icon_default_secondary) {
            return xcgVar.a.e;
        }
        if (i == vuc.chat_topbar_icon_default_tertiary) {
            return xcgVar.a.f;
        }
        if (i == vuc.chat_topbar_icon_default_themed) {
            return xcgVar.a.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrast) {
            return xcgVar.b.a;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrastStatic) {
            return xcgVar.b.b;
        }
        if (i == vuc.chat_topbar_icon_disabled_negative) {
            return xcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_disabled_neutralFade) {
            return xcgVar.b.d;
        }
        if (i == vuc.chat_topbar_icon_disabled_primary) {
            return xcgVar.b.e;
        }
        if (i == vuc.chat_topbar_icon_disabled_quaternary) {
            return xcgVar.b.f;
        }
        if (i == vuc.chat_topbar_icon_disabled_secondary) {
            return xcgVar.b.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_tertiary) {
            return xcgVar.b.h;
        }
        if (i == vuc.chat_topbar_icon_disabled_themed) {
            return xcgVar.b.i;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_primary) {
            return adgVar.a.a.a;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_secondary) {
            return adgVar.a.a.b;
        }
        if (i == vuc.chat_topbar_text_default_contrast) {
            return ddgVar.a.a;
        }
        if (i == vuc.chat_topbar_text_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_text_default_primary) {
            return ddgVar.a.b;
        }
        if (i == vuc.chat_topbar_text_default_secondary) {
            return ddgVar.a.c;
        }
        if (i == vuc.chat_topbar_text_default_themed) {
            return ddgVar.a.d;
        }
        if (i == vuc.chat_topbar_text_disabled_contrast) {
            return ddgVar.b.a;
        }
        if (i == vuc.chat_topbar_text_disabled_contrastStatic) {
            return ddgVar.b.b;
        }
        if (i == vuc.chat_topbar_text_disabled_primary) {
            return ddgVar.b.c;
        }
        if (i == vuc.chat_topbar_text_disabled_secondary) {
            return ddgVar.b.d;
        }
        if (i == vuc.chat_topbar_text_disabled_themed) {
            return ddgVar.b.e;
        }
        if (i == vuc.chat_writebar_background_emojiArea) {
            return q6iVar.a;
        }
        if (i == vuc.chat_writebar_background_input) {
            return q6iVar.b;
        }
        if (i == vuc.chat_writebar_background_neutralFade) {
            return q6iVar.c;
        }
        if (i == vuc.chat_writebar_background_surface) {
            return q6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_neutral) {
            return s6iVar.a;
        }
        if (i == vuc.chat_writebar_icon_neutralSecondary) {
            return s6iVar.b;
        }
        if (i == vuc.chat_writebar_icon_neutralTertiary) {
            return s6iVar.c;
        }
        if (i == vuc.chat_writebar_icon_themed) {
            return s6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_verificationReplyTo) {
            return s6iVar.e;
        }
        if (i == vuc.chat_writebar_stroke_areaSeparator) {
            return t6iVar.a;
        }
        if (i == vuc.chat_writebar_stroke_input) {
            return t6iVar.b;
        }
        if (i == vuc.chat_writebar_stroke_themed) {
            return t6iVar.c;
        }
        if (i == vuc.chat_writebar_text_input) {
            return u6iVar.a;
        }
        if (i == vuc.chat_writebar_text_inputMDLink) {
            return u6iVar.b;
        }
        if (i == vuc.chat_writebar_text_inputPlaceholder) {
            return u6iVar.c;
        }
        if (i == vuc.chat_writebar_text_primary) {
            return u6iVar.d;
        }
        if (i == vuc.chat_writebar_text_replyMessage) {
            return u6iVar.e;
        }
        if (i == vuc.chat_writebar_text_replyTo) {
            return u6iVar.f;
        }
        if (i == vuc.chat_writebar_text_secondary) {
            return u6iVar.g;
        }
        if (i == vuc.chat_writebar_text_themed) {
            return u6iVar.h;
        }
        throw new IllegalArgumentException(ho7.f(i, "Unknown attr res passed "));
    }

    @Override // defpackage.sy2
    public yt0 i() {
        return o;
    }

    @Override // defpackage.el5
    public dl5 j() {
        throw new IllegalStateException();
    }

    @Override // defpackage.sy2
    public r6i k() {
        return s0;
    }

    @Override // defpackage.w57
    public xmb l(q57 q57Var, i57 i57Var) {
        return new u57(q57Var, i57Var);
    }

    @Override // defpackage.el5
    public xa4 n(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        u1a.o.a("MobileVisionBase", "Error preloading model resource", exc);
    }

    @Override // defpackage.el5
    public byte[] p() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) throws JsonParseException {
        xx7Var.p();
        String strB = null;
        String strB2 = null;
        while (xx7Var.hasNext()) {
            String strName = xx7Var.name();
            int iHashCode = strName.hashCode();
            if (iHashCode != -22145738) {
                if (iHashCode == 438353305 && strName.equals("session_secret_key")) {
                    strB2 = xx7Var.B();
                } else {
                    xx7Var.v();
                }
            } else if (strName.equals("session_key")) {
                strB = xx7Var.B();
            } else {
                xx7Var.v();
            }
        }
        xx7Var.n();
        if (strB == null) {
            throw new JsonParseException("No sessionKey");
        }
        if (strB2 != null) {
            return new vk(strB, strB2);
        }
        throw new JsonParseException("No sessionSecretKey");
    }

    @Override // defpackage.c47
    public long q() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return X;
    }

    @Override // defpackage.el5
    public void release() {
    }

    @Override // defpackage.el5
    public void s(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gr3
    public void t(byte[] bArr) {
        throw new IllegalStateException("No connection");
    }

    public String toString() {
        switch (this.a) {
            case 25:
                return "NoConnection";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Z;
    }

    @Override // defpackage.gr3
    public int v(int i, byte[] bArr, int i2) {
        throw new IllegalStateException("No connection");
    }

    @Override // defpackage.el5
    public void w(byte[] bArr) {
    }

    @Override // defpackage.rof
    public tof x(hf6 hf6Var) {
        String str = hf6Var.n;
        List list = hf6Var.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new qs3(list);
                case "application/pgs":
                    return new k5i(7);
                case "application/x-mp4-vtt":
                    return new mc5(23);
                case "text/vtt":
                    return new vhb(0);
                case "application/x-quicktime-tx3g":
                    return new rog(list);
                case "text/x-ssa":
                    return new u8f(list);
                case "application/x-subrip":
                    return new unf();
                case "application/ttml+xml":
                    return new sjg();
            }
        }
        throw new IllegalArgumentException(wy1.h("Unsupported MIME type: ", str));
    }

    @Override // defpackage.mud
    public bj z(long j, gud gudVar) throws RtcCommandSerializeException {
        if (gudVar == null) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalArgumentException("Illegal 'command' value: null"));
        }
        try {
            JSONObject jSONObjectM = M(j, gudVar);
            if (jSONObjectM != null) {
                return new bj(1, jSONObjectM.toString().getBytes());
            }
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalStateException("No serializer for command: " + gudVar.getClass()));
        } catch (JSONException e) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalArgumentException("Unable to serialize command: " + gudVar.getClass(), e));
        }
    }

    public b6a(vm9 vm9Var) {
        this.a = 24;
    }

    public b6a(Set set) {
        this.a = 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }
}
