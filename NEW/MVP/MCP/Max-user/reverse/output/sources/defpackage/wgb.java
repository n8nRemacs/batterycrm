package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class wgb implements xmb {
    public final q57 a;
    public final i57 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final pl0 d;
    public final dh6 o;
    public static final Pattern X = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern Z = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern v0 = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern x0 = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern z0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern A0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern B0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern C0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern D0 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern E0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern F0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern G0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern H0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern I0 = a("CAN-SKIP-DATERANGES");
    public static final Pattern J0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern K0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern L0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern M0 = a("CAN-BLOCK-RELOAD");
    public static final Pattern N0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern O0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern P0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern Q0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern R0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern S0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern T0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern U0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern V0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern W0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern X0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern Y0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern Z0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern a1 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern b1 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern c1 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern d1 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern e1 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f1 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern g1 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern h1 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern i1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern j1 = a("AUTOSELECT");
    public static final Pattern k1 = a("DEFAULT");
    public static final Pattern l1 = a("FORCED");
    public static final Pattern m1 = a("INDEPENDENT");
    public static final Pattern n1 = a("GAP");
    public static final Pattern o1 = a("PRECISE");
    public static final Pattern p1 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern q1 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern r1 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern s1 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern t1 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern u1 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern v1 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern w1 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern x1 = a("END-ON-NEXT");
    public static final Pattern y1 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern z1 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern A1 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern B1 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern C1 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern D1 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern E1 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern F1 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern G1 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern H1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern I1 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");
    public static final Pattern J1 = Pattern.compile("#EXT-X-VK-PLAYBACK-DURATION:(\\d+)\\b");

    public wgb(q57 q57Var, i57 i57Var, pl0 pl0Var, dh6 dh6Var, Set set) {
        HashSet hashSet = new HashSet();
        this.a = q57Var;
        this.b = i57Var;
        this.d = pl0Var;
        this.o = dh6Var;
        hashSet.addAll(set);
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static y45 b(String str, w45[] w45VarArr) {
        w45[] w45VarArr2 = new w45[w45VarArr.length];
        for (int i = 0; i < w45VarArr.length; i++) {
            w45 w45Var = w45VarArr[i];
            w45VarArr2[i] = new w45(w45Var.b, w45Var.c, w45Var.d, null);
        }
        return new y45(str, true, w45VarArr2);
    }

    public static w45 e(String str, String str2, HashMap map) throws ParserException {
        String strK = k(str, Z0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = a1;
        if (zEquals) {
            String strL = l(str, pattern, map);
            return new w45(cy0.d, null, "video/mp4", Base64.decode(strL.substring(strL.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = cy0.d;
            String str3 = zxg.a;
            return new w45(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strK)) {
            return null;
        }
        String strL2 = l(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strL2.substring(strL2.indexOf(44)), 0);
        UUID uuid2 = cy0.e;
        return new w45(uuid2, null, "video/mp4", d7j.b(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06f9 A[PHI: r34
  0x06f9: PHI (r34v24 int) = (r34v20 int), (r34v21 int), (r34v22 int), (r34v25 int) binds: [B:281:0x071e, B:277:0x0711, B:273:0x0703, B:270:0x06f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0894 A[PHI: r53
  0x0894: PHI (r53v28 java.lang.Boolean) = 
  (r53v18 java.lang.Boolean)
  (r53v19 java.lang.Boolean)
  (r53v20 java.lang.Boolean)
  (r53v21 java.lang.Boolean)
  (r53v22 java.lang.Boolean)
  (r53v23 java.lang.Boolean)
  (r53v24 java.lang.Boolean)
  (r53v25 java.lang.Boolean)
  (r53v26 java.lang.Boolean)
  (r53v29 java.lang.Boolean)
 binds: [B:389:0x090d, B:385:0x0900, B:381:0x08f2, B:377:0x08e5, B:373:0x08d8, B:369:0x08cb, B:365:0x08be, B:361:0x08af, B:357:0x089f, B:354:0x0892] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i57 f(defpackage.q57 r97, defpackage.i57 r98, defpackage.te8 r99, java.lang.String r100) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 3220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.f(q57, i57, te8, java.lang.String):i57");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Type inference failed for: r43v12 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.q57 g(defpackage.te8 r43, java.lang.String r44) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.g(te8, java.lang.String):q57");
    }

    public static boolean h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String k(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : n(str2, map);
    }

    public static String l(String str, Pattern pattern, Map map) throws ParserException {
        String strK = k(str, pattern, null, map);
        if (strK != null) {
            return strK;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String n(String str, Map map) {
        Matcher matcher = H1.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void c(List list) {
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            if (str.startsWith("#EXT-X-VK-PLAYBACK-DURATION") && d(str)) {
                return;
            }
        }
    }

    public final boolean d(String str) {
        try {
            long j = Integer.parseInt(l(str, J1, Collections.EMPTY_MAP));
            if (this.d == null) {
                return true;
            }
            this.c.post(new u50(this, j, 6));
            return true;
        } catch (ParserException unused) {
            a8i.g("OVHlsPlaylistParser", "Error parsing #EXT-X-VK-PLAYBACK-DURATION tag");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x00c9, TryCatch #3 {all -> 0x00c9, blocks: (B:3:0x001d, B:5:0x0026, B:7:0x002e, B:10:0x0037, B:31:0x0076, B:33:0x007c, B:36:0x0087, B:38:0x008f, B:49:0x00cc, B:51:0x00d4, B:53:0x00dc, B:55:0x00e4, B:57:0x00ec, B:59:0x00f4, B:61:0x00fc, B:63:0x0104, B:66:0x010d, B:68:0x0115, B:69:0x011a, B:70:0x011f, B:90:0x0181, B:91:0x0187, B:12:0x003d, B:14:0x0043, B:18:0x004c, B:21:0x0055, B:23:0x005e, B:25:0x0064, B:27:0x006a, B:28:0x006f), top: B:107:0x001d }] */
    @Override // defpackage.xmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(android.net.Uri r12, defpackage.ve4 r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.m(android.net.Uri, ve4):java.lang.Object");
    }
}
