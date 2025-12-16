package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.C36526i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.upstream.B;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.S;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.W1;
import j.P;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v61.InterfaceC49174e;

/* loaded from: classes6.dex */
public final class HlsPlaylistParser implements B.a<h> {

    /* renamed from: a, reason: collision with root package name */
    public final g f346432a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final f f346433b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f346408c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f346409d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f346410e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f346411f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f346412g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f346413h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f346414i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f346415j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f346416k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f346417l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f346418m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f346419n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f346420o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f346421p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f346422q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f346423r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f346424s = b("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f346425t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f346426u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f346427v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f346428w = b("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f346429x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f346430y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f346431z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f346380A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f346381B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f346382C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f346383D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f346384E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f346385F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f346386G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f346387H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f346388I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f346389J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f346390K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L, reason: collision with root package name */
    public static final Pattern f346391L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f346392M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f346393N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f346394O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f346395P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f346396Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f346397R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f346398S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f346399T = b("AUTOSELECT");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f346400U = b("DEFAULT");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f346401V = b("FORCED");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f346402W = b("INDEPENDENT");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f346403X = b("GAP");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f346404Y = b("PRECISE");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f346405Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f346406a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f346407b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final BufferedReader f346434a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayDeque f346435b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public String f346436c;

        public a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.f346435b = arrayDeque;
            this.f346434a = bufferedReader;
        }

        @InterfaceC49174e
        public final boolean a() throws IOException {
            String strTrim;
            if (this.f346436c != null) {
                return true;
            }
            ArrayDeque arrayDeque = this.f346435b;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f346436c = str;
                return true;
            }
            do {
                String line = this.f346434a.readLine();
                this.f346436c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f346436c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public final String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f346436c;
            this.f346436c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(g.f346510n, null);
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData c(@P String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i12 = 0; i12 < schemeDataArr.length; i12++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i12];
            schemeDataArr2[i12] = new DrmInitData.SchemeData(schemeData.f344323c, schemeData.f344324d, schemeData.f344325e, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    @P
    public static DrmInitData.SchemeData d(String str, String str2, HashMap map) throws ParserException {
        String strJ = j(str, f346389J, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f346390K;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new DrmInitData.SchemeData(C36526i.f345420d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = C36526i.f345420d;
            int i12 = U.f348106a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(C37262f.f359034c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = C36526i.f345421e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", com.google.android.exoplayer2.extractor.mp4.h.a(uuid2, bArrDecode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.util.HashMap] */
    public static f e(g gVar, @P f fVar, a aVar, String str) throws DeltaUpdateException, ParserException, NumberFormatException {
        int i12;
        String str2;
        ?? r82;
        f.b bVar;
        String str3;
        ArrayList arrayList;
        int i13;
        f.b bVar2;
        String str4;
        HashMap map;
        int i14;
        int i15;
        long j12;
        long j13;
        long j14;
        DrmInitData drmInitData;
        g gVar2 = gVar;
        f fVar2 = fVar;
        boolean z12 = gVar2.f346532c;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        f.g gVar3 = new f.g(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z13 = z12;
        f.g gVar4 = gVar3;
        String strJ = "";
        long jH2 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long jLongValue = 0;
        long j22 = 0;
        long j23 = -1;
        int i16 = 0;
        long j24 = -9223372036854775807L;
        boolean zG2 = false;
        boolean z14 = false;
        int i17 = 0;
        int i18 = 1;
        long j25 = -9223372036854775807L;
        long j26 = -9223372036854775807L;
        boolean z15 = false;
        DrmInitData drmInitDataC = null;
        DrmInitData drmInitData2 = null;
        boolean z16 = false;
        String strK = null;
        String str6 = null;
        String str7 = null;
        int i19 = 0;
        boolean z17 = false;
        f.e eVar = null;
        ArrayList arrayList6 = arrayList3;
        f.b bVar3 = null;
        while (aVar.a()) {
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList5.add(strB);
            }
            if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strB, f346422q, map2);
                if ("VOD".equals(strK2)) {
                    i16 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i16 = 2;
                }
            } else if (strB.equals("#EXT-X-I-FRAMES-ONLY")) {
                z17 = true;
            } else {
                if (strB.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long j27 = (long) (Double.parseDouble(k(strB, f346382C, Collections.emptyMap())) * 1000000.0d);
                    zG2 = g(strB, f346404Y);
                    j24 = j27;
                } else {
                    str2 = str5;
                    if (strB.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dH2 = h(strB, f346423r);
                        long j28 = dH2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH2 * 1000000.0d);
                        boolean zG3 = g(strB, f346424s);
                        double dH3 = h(strB, f346426u);
                        long j29 = dH3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH3 * 1000000.0d);
                        double dH4 = h(strB, f346427v);
                        gVar4 = new f.g(j28, zG3, j29, dH4 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH4 * 1000000.0d), g(strB, f346428w));
                    } else if (strB.startsWith("#EXT-X-PART-INF")) {
                        j26 = (long) (Double.parseDouble(k(strB, f346420o, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strB.startsWith("#EXT-X-MAP");
                        Pattern pattern = f346384E;
                        Pattern pattern2 = f346390K;
                        if (zStartsWith) {
                            String strK3 = k(strB, pattern2, map2);
                            String strJ2 = j(strB, pattern, null, map2);
                            if (strJ2 != null) {
                                int i22 = U.f348106a;
                                String[] strArrSplit = strJ2.split("@", -1);
                                j23 = Long.parseLong(strArrSplit[0]);
                                if (strArrSplit.length > 1) {
                                    j16 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            if (j23 == -1) {
                                j16 = 0;
                            }
                            if (strK != null && str6 == null) {
                                throw ParserException.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                            eVar = new f.e(j16, strK3, strK, str6, j23);
                            if (j23 != -1) {
                                j16 += j23;
                            }
                            j23 = -1;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                                j25 = Integer.parseInt(k(strB, f346418m, Collections.emptyMap())) * 1000000;
                            } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j17 = Long.parseLong(k(strB, f346429x, Collections.emptyMap()));
                                j15 = j17;
                            } else if (strB.startsWith("#EXT-X-VERSION")) {
                                i18 = Integer.parseInt(k(strB, f346421p, Collections.emptyMap()));
                            } else {
                                if (strB.startsWith("#EXT-X-DEFINE")) {
                                    String strJ3 = j(strB, f346406a0, null, map2);
                                    if (strJ3 != null) {
                                        String str8 = gVar2.f346519l.get(strJ3);
                                        if (str8 != null) {
                                            map2.put(strJ3, str8);
                                        }
                                    } else {
                                        map2.put(k(strB, f346395P, map2), k(strB, f346405Z, map2));
                                    }
                                    r82 = map3;
                                    bVar = bVar3;
                                    str3 = str7;
                                } else if (strB.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(k(strB, f346430y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    strJ = j(strB, f346431z, str2, map2);
                                    str5 = str2;
                                    arrayList5 = arrayList8;
                                    arrayList6 = arrayList7;
                                } else {
                                    String str9 = str2;
                                    if (strB.startsWith("#EXT-X-SKIP")) {
                                        int i23 = Integer.parseInt(k(strB, f346425t, Collections.emptyMap()));
                                        C36585a.d(fVar2 != null && arrayList2.isEmpty());
                                        int i24 = U.f348106a;
                                        int i25 = (int) (j15 - fVar2.f346475k);
                                        int i26 = i23 + i25;
                                        if (i25 >= 0) {
                                            AbstractC37401r1 abstractC37401r1 = fVar2.f346482r;
                                            if (i26 <= abstractC37401r1.size()) {
                                                while (i25 < i26) {
                                                    f.e eVar2 = (f.e) abstractC37401r1.get(i25);
                                                    if (j15 != fVar2.f346475k) {
                                                        int i27 = (fVar2.f346474j - i17) + eVar2.f346497e;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j32 = j19;
                                                        int i28 = 0;
                                                        while (true) {
                                                            AbstractC37401r1 abstractC37401r12 = eVar2.f346493n;
                                                            i13 = i26;
                                                            if (i28 >= abstractC37401r12.size()) {
                                                                break;
                                                            }
                                                            f.b bVar4 = (f.b) abstractC37401r12.get(i28);
                                                            arrayList9.add(new f.b(bVar4.f346494b, bVar4.f346495c, bVar4.f346496d, i27, j32, bVar4.f346499g, bVar4.f346500h, bVar4.f346501i, bVar4.f346502j, bVar4.f346503k, bVar4.f346504l, bVar4.f346487m, bVar4.f346488n));
                                                            j32 += bVar4.f346496d;
                                                            i28++;
                                                            map3 = map3;
                                                            i26 = i13;
                                                            str9 = str9;
                                                            bVar3 = bVar3;
                                                        }
                                                        bVar2 = bVar3;
                                                        str4 = str9;
                                                        map = map3;
                                                        eVar2 = new f.e(eVar2.f346494b, eVar2.f346495c, eVar2.f346492m, eVar2.f346496d, i27, j19, eVar2.f346499g, eVar2.f346500h, eVar2.f346501i, eVar2.f346502j, eVar2.f346503k, eVar2.f346504l, arrayList9);
                                                    } else {
                                                        i13 = i26;
                                                        bVar2 = bVar3;
                                                        str4 = str9;
                                                        map = map3;
                                                    }
                                                    arrayList2.add(eVar2);
                                                    j19 += eVar2.f346496d;
                                                    long j33 = eVar2.f346503k;
                                                    if (j33 != -1) {
                                                        j16 = eVar2.f346502j + j33;
                                                    }
                                                    String str10 = eVar2.f346501i;
                                                    if (str10 == null || !str10.equals(Long.toHexString(j17))) {
                                                        str6 = str10;
                                                    }
                                                    j17++;
                                                    i25++;
                                                    i19 = eVar2.f346497e;
                                                    eVar = eVar2.f346495c;
                                                    drmInitData2 = eVar2.f346499g;
                                                    strK = eVar2.f346500h;
                                                    map3 = map;
                                                    i26 = i13;
                                                    j18 = j19;
                                                    str9 = str4;
                                                    bVar3 = bVar2;
                                                    fVar2 = fVar;
                                                }
                                                str2 = str9;
                                                gVar2 = gVar;
                                                fVar2 = fVar;
                                            }
                                        }
                                        throw new DeltaUpdateException();
                                    }
                                    bVar = bVar3;
                                    str2 = str9;
                                    r82 = map3;
                                    if (strB.startsWith("#EXT-X-KEY")) {
                                        String strK4 = k(strB, f346387H, map2);
                                        String strJ4 = j(strB, f346388I, "identity", map2);
                                        if ("NONE".equals(strK4)) {
                                            treeMap.clear();
                                            drmInitData2 = null;
                                            strK = null;
                                            str6 = null;
                                        } else {
                                            String strJ5 = j(strB, f346391L, null, map2);
                                            if (!"identity".equals(strJ4)) {
                                                String str11 = str7;
                                                if (str11 == null) {
                                                    str7 = ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str7 = str11;
                                                }
                                                DrmInitData.SchemeData schemeDataD = d(strB, strJ4, map2);
                                                if (schemeDataD != null) {
                                                    treeMap.put(strJ4, schemeDataD);
                                                    str6 = strJ5;
                                                    drmInitData2 = null;
                                                }
                                                strK = null;
                                            } else if ("AES-128".equals(strK4)) {
                                                strK = k(strB, pattern2, map2);
                                                str6 = strJ5;
                                            }
                                            str6 = strJ5;
                                            strK = null;
                                        }
                                        gVar2 = gVar;
                                        fVar2 = fVar;
                                        map3 = r82;
                                    } else {
                                        str3 = str7;
                                        if (strB.startsWith("#EXT-X-BYTERANGE")) {
                                            String strK5 = k(strB, f346383D, map2);
                                            int i29 = U.f348106a;
                                            String[] strArrSplit2 = strK5.split("@", -1);
                                            j23 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j16 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i17 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            z14 = true;
                                            map3 = r82;
                                            str7 = str3;
                                        } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                                            i19++;
                                        } else if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jH2 == 0) {
                                                String strSubstring = strB.substring(strB.indexOf(58) + 1);
                                                Matcher matcher = U.f348111f.matcher(strSubstring);
                                                if (!matcher.matches()) {
                                                    throw ParserException.a("Invalid date/time format: " + strSubstring, null);
                                                }
                                                if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                                    i14 = 0;
                                                } else {
                                                    i14 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                                    if ("-".equals(matcher.group(11))) {
                                                        i14 *= -1;
                                                    }
                                                }
                                                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                                gregorianCalendar.clear();
                                                gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                                if (!TextUtils.isEmpty(matcher.group(8))) {
                                                    gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                                }
                                                long timeInMillis = gregorianCalendar.getTimeInMillis();
                                                if (i14 != 0) {
                                                    timeInMillis -= i14 * 60000;
                                                }
                                                jH2 = U.H(timeInMillis) - j19;
                                            }
                                        } else if (strB.equals("#EXT-X-GAP")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            map3 = r82;
                                            str7 = str3;
                                            str5 = str2;
                                            arrayList5 = arrayList8;
                                            arrayList6 = arrayList7;
                                            bVar3 = bVar;
                                            z16 = true;
                                        } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            map3 = r82;
                                            str7 = str3;
                                            str5 = str2;
                                            arrayList5 = arrayList8;
                                            arrayList6 = arrayList7;
                                            bVar3 = bVar;
                                            z13 = true;
                                        } else if (strB.equals("#EXT-X-ENDLIST")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            map3 = r82;
                                            str7 = str3;
                                            str5 = str2;
                                            arrayList5 = arrayList8;
                                            arrayList6 = arrayList7;
                                            bVar3 = bVar;
                                            z15 = true;
                                        } else if (strB.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long jI2 = i(strB, f346380A);
                                            Matcher matcher2 = f346381B.matcher(strB);
                                            if (matcher2.find()) {
                                                String strGroup = matcher2.group(1);
                                                strGroup.getClass();
                                                i15 = Integer.parseInt(strGroup);
                                            } else {
                                                i15 = -1;
                                            }
                                            arrayList4.add(new f.d(Uri.parse(S.c(str, k(strB, pattern2, map2))), jI2, i15));
                                        } else if (!strB.startsWith("#EXT-X-PRELOAD-HINT")) {
                                            if (strB.startsWith("#EXT-X-PART")) {
                                                String hexString = strK == null ? null : str6 != null ? str6 : Long.toHexString(j17);
                                                String strK6 = k(strB, pattern2, map2);
                                                long j34 = (long) (Double.parseDouble(k(strB, f346419n, Collections.emptyMap())) * 1000000.0d);
                                                boolean zG4 = g(strB, f346402W) | (z13 && arrayList7.isEmpty());
                                                boolean zG5 = g(strB, f346403X);
                                                String strJ6 = j(strB, pattern, null, map2);
                                                if (strJ6 != null) {
                                                    int i32 = U.f348106a;
                                                    String[] strArrSplit3 = strJ6.split("@", -1);
                                                    j12 = Long.parseLong(strArrSplit3[0]);
                                                    if (strArrSplit3.length > 1) {
                                                        j22 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    j12 = -1;
                                                }
                                                if (j12 == -1) {
                                                    j22 = 0;
                                                }
                                                if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData3 = new DrmInitData(str3, true, schemeDataArr);
                                                    if (drmInitDataC == null) {
                                                        drmInitDataC = c(str3, schemeDataArr);
                                                    }
                                                    drmInitData2 = drmInitData3;
                                                }
                                                arrayList = arrayList7;
                                                arrayList.add(new f.b(strK6, eVar, j34, i19, j18, drmInitData2, strK, hexString, j22, j12, zG5, zG4, false));
                                                j18 += j34;
                                                if (j12 != -1) {
                                                    j22 += j12;
                                                }
                                            } else {
                                                arrayList = arrayList7;
                                                if (!strB.startsWith("#")) {
                                                    String hexString2 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j17);
                                                    long j35 = j17 + 1;
                                                    String strL = l(strB, map2);
                                                    f.e eVar3 = (f.e) r82.get(strL);
                                                    if (j23 == -1) {
                                                        j13 = 0;
                                                    } else {
                                                        if (z17 && eVar == null && eVar3 == null) {
                                                            eVar3 = new f.e(0L, strL, null, null, j16);
                                                            r82.put(strL, eVar3);
                                                        }
                                                        j13 = j16;
                                                    }
                                                    if (drmInitData2 != null || treeMap.isEmpty()) {
                                                        j14 = j35;
                                                        drmInitData = drmInitData2;
                                                    } else {
                                                        j14 = j35;
                                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData = new DrmInitData(str3, true, schemeDataArr2);
                                                        if (drmInitDataC == null) {
                                                            drmInitDataC = c(str3, schemeDataArr2);
                                                        }
                                                    }
                                                    arrayList2.add(new f.e(strL, eVar != null ? eVar : eVar3, strJ, jLongValue, i19, j19, drmInitData, strK, hexString2, j13, j23, z16, arrayList));
                                                    j18 = j19 + jLongValue;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j23 != -1) {
                                                        j13 += j23;
                                                    }
                                                    j16 = j13;
                                                    fVar2 = fVar;
                                                    map3 = r82;
                                                    str7 = str3;
                                                    drmInitData2 = drmInitData;
                                                    jLongValue = 0;
                                                    j23 = -1;
                                                    j19 = j18;
                                                    j17 = j14;
                                                    str5 = str2;
                                                    strJ = str5;
                                                    arrayList5 = arrayList8;
                                                    bVar3 = bVar;
                                                    z16 = false;
                                                    arrayList6 = arrayList10;
                                                    gVar2 = gVar;
                                                }
                                            }
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            map3 = r82;
                                            arrayList6 = arrayList;
                                            str7 = str3;
                                            str5 = str2;
                                            arrayList5 = arrayList8;
                                            bVar3 = bVar;
                                        } else if (bVar == null && "PART".equals(k(strB, f346393N, map2))) {
                                            String strK7 = k(strB, pattern2, map2);
                                            long jI3 = i(strB, f346385F);
                                            long jI4 = i(strB, f346386G);
                                            String hexString3 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j17);
                                            if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                DrmInitData drmInitData4 = new DrmInitData(str3, true, schemeDataArr3);
                                                if (drmInitDataC == null) {
                                                    drmInitDataC = c(str3, schemeDataArr3);
                                                }
                                                drmInitData2 = drmInitData4;
                                            }
                                            if (jI3 == -1 || jI4 != -1) {
                                                bVar3 = new f.b(strK7, eVar, 0L, i19, j18, drmInitData2, strK, hexString3, jI3 != -1 ? jI3 : 0L, jI4, false, false, true);
                                            } else {
                                                bVar3 = bVar;
                                            }
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            map3 = r82;
                                            str7 = str3;
                                        }
                                        gVar2 = gVar;
                                        fVar2 = fVar;
                                        map3 = r82;
                                        str7 = str3;
                                    }
                                    str5 = str2;
                                    arrayList5 = arrayList8;
                                    arrayList6 = arrayList7;
                                    bVar3 = bVar;
                                }
                                arrayList = arrayList7;
                                gVar2 = gVar;
                                fVar2 = fVar;
                                map3 = r82;
                                arrayList6 = arrayList;
                                str7 = str3;
                                str5 = str2;
                                arrayList5 = arrayList8;
                                bVar3 = bVar;
                            }
                            str5 = str2;
                            arrayList5 = arrayList8;
                            arrayList6 = arrayList7;
                        }
                    }
                }
                str5 = str2;
            }
        }
        f.b bVar5 = bVar3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        HashMap map4 = new HashMap();
        int i33 = 0;
        while (i33 < arrayList4.size()) {
            f.d dVar = (f.d) arrayList4.get(i33);
            long size = dVar.f346490b;
            if (size == -1) {
                size = (j15 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = dVar.f346491c;
            if (size2 != -1) {
                i12 = 1;
            } else if (j26 != -9223372036854775807L) {
                i12 = 1;
                size2 = (arrayList11.isEmpty() ? ((f.e) W1.d(arrayList2)).f346493n : arrayList11).size() - 1;
            } else {
                i12 = 1;
            }
            Uri uri = dVar.f346489a;
            map4.put(uri, new f.d(uri, size, size2));
            i33 += i12;
        }
        if (bVar5 != null) {
            arrayList11.add(bVar5);
        }
        return new f(i16, str, arrayList12, j24, zG2, jH2, z14, i17, j15, i18, j25, j26, z13, z15, jH2 != 0, drmInitDataC, arrayList2, arrayList11, gVar4, map4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x03a2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.source.hls.playlist.g f(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.a r36, java.lang.String r37) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.f(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.g");
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw ParserException.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(String str, Map<String, String> map) {
        Matcher matcher = f346407b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:39:0x0072, B:41:0x0078, B:44:0x0083, B:46:0x008b, B:50:0x00a1, B:52:0x00a9, B:54:0x00b1, B:56:0x00b9, B:58:0x00c1, B:60:0x00c9, B:62:0x00d1, B:64:0x00d9, B:67:0x00e2, B:68:0x00e6, B:73:0x0106, B:74:0x010c, B:13:0x0031, B:15:0x0037, B:19:0x0040, B:22:0x0049, B:25:0x0055, B:27:0x005b, B:31:0x0062, B:32:0x0067), top: B:77:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x004f A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.upstream.B.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r9, com.google.android.exoplayer2.upstream.C36584n r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.a(android.net.Uri, com.google.android.exoplayer2.upstream.n):java.lang.Object");
    }

    public HlsPlaylistParser(g gVar, @P f fVar) {
        this.f346432a = gVar;
        this.f346433b = fVar;
    }
}
