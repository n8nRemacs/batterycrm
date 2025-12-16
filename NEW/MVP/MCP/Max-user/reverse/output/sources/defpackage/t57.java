package defpackage;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t57 implements wmb {
    public final p57 a;
    public final h57 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern o = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern X = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern Y = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern Z = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern s0 = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern t0 = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern u0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern v0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern w0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern x0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern y0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern z0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern A0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern B0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern C0 = a("CAN-SKIP-DATERANGES");
    public static final Pattern D0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern E0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern F0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern G0 = a("CAN-BLOCK-RELOAD");
    public static final Pattern H0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern I0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern J0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern K0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern L0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern M0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern N0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern O0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern P0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern Q0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern R0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern S0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern T0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern U0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern V0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern W0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern X0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern Y0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern Z0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern a1 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern b1 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern c1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern d1 = a("AUTOSELECT");
    public static final Pattern e1 = a("DEFAULT");
    public static final Pattern f1 = a("FORCED");
    public static final Pattern g1 = a("INDEPENDENT");
    public static final Pattern h1 = a("GAP");
    public static final Pattern i1 = a("PRECISE");
    public static final Pattern j1 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern k1 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern l1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public t57(p57 p57Var, h57 h57Var) {
        this.a = p57Var;
        this.b = h57Var;
    }

    public static Pattern a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append(str);
        sb.append("=(NO|YES)");
        return Pattern.compile(sb.toString());
    }

    public static x45 b(String str, v45[] v45VarArr) {
        v45[] v45VarArr2 = new v45[v45VarArr.length];
        for (int i = 0; i < v45VarArr.length; i++) {
            v45 v45Var = v45VarArr[i];
            v45VarArr2[i] = new v45(v45Var.b, v45Var.c, v45Var.d, null);
        }
        return new x45(str, true, v45VarArr2);
    }

    public static v45 c(String str, String str2, HashMap map) throws ParserException {
        String strI = i(str, T0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = U0;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new v45(ay0.c, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = ay0.c;
            int i = xxg.a;
            return new v45(uuid, null, "hls", str.getBytes(mb2.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = ay0.d;
        return new v45(uuid2, null, "video/mp4", c7j.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.h57 d(defpackage.p57 r110, defpackage.h57 r111, defpackage.jkc r112, java.lang.String r113) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t57.d(p57, h57, jkc, java.lang.String):h57");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0393  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.p57 e(defpackage.jkc r36, java.lang.String r37) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t57.e(jkc, java.lang.String):p57");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws ParserException {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb = new StringBuilder(u45.f(u45.f(19, strPattern), str));
        sb.append("Couldn't match ");
        sb.append(strPattern);
        sb.append(" in ");
        sb.append(str);
        throw ParserException.b(null, sb.toString());
    }

    public static String k(String str, Map map) {
        Matcher matcher = l1.matcher(str);
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:34:0x006c, B:35:0x0072, B:12:0x002f, B:14:0x0035, B:18:0x003e, B:20:0x0046, B:23:0x0053, B:25:0x0059, B:29:0x0060, B:30:0x0065, B:38:0x0076, B:40:0x007c, B:43:0x0087, B:45:0x008f, B:48:0x00a3, B:50:0x00ab, B:52:0x00b3, B:54:0x00bb, B:56:0x00c3, B:58:0x00cb, B:60:0x00d3, B:62:0x00db, B:65:0x00e4, B:66:0x00e8), top: B:73:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004d A[SYNTHETIC] */
    @Override // defpackage.wmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(android.net.Uri r8, defpackage.ve4 r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t57.l(android.net.Uri, ve4):java.lang.Object");
    }
}
