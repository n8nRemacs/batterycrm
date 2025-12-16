package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import com.google.common.base.C37257c;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.k0;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* compiled from: MimeTypes.java */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f348166a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f348167b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes.java */
    public static final class a {
    }

    /* compiled from: MimeTypes.java */
    @k0
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f348168a;

        /* renamed from: b, reason: collision with root package name */
        public final int f348169b;

        public b(int i12, int i13) {
            this.f348168a = i12;
            this.f348169b = i13;
        }

        public final int a() {
            int i12 = this.f348169b;
            if (i12 == 2) {
                return 10;
            }
            if (i12 == 5) {
                return 11;
            }
            if (i12 == 29) {
                return 12;
            }
            if (i12 == 42) {
                return 16;
            }
            if (i12 != 22) {
                return i12 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(@j.P String str, @j.P String str2) {
        b bVarG;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (bVarG = g(str2)) != null) {
                    int iA2 = bVarG.a();
                    if (iA2 == 0 || iA2 == 16) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @j.P
    public static String b(@j.P String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : U.O(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    @j.P
    public static String c(@j.P String str, @j.P String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrO = U.O(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : strArrO) {
            if (str2.equals(e(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static int d(String str, @j.P String str2) {
        b bVarG;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarG = g(str2)) == null) {
                    return 0;
                }
                return bVarG.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @j.P
    public static String e(@j.P String str) {
        b bVarG;
        String strF = null;
        if (str == null) {
            return null;
        }
        String strB = C37257c.b(str.trim());
        if (strB.startsWith("avc1") || strB.startsWith("avc3")) {
            return "video/avc";
        }
        if (strB.startsWith("hev1") || strB.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strB.startsWith("dvav") || strB.startsWith("dva1") || strB.startsWith("dvhe") || strB.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strB.startsWith("av01")) {
            return "video/av01";
        }
        if (strB.startsWith("vp9") || strB.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strB.startsWith("vp8") || strB.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strB.startsWith("mp4a")) {
            if (strB.startsWith("mp4a.") && (bVarG = g(strB)) != null) {
                strF = f(bVarG.f348168a);
            }
            return strF == null ? "audio/mp4a-latm" : strF;
        }
        if (strB.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strB.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strB.startsWith("ac-3") || strB.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strB.startsWith("ec-3") || strB.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strB.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strB.startsWith("ac-4") || strB.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strB.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strB.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strB.startsWith("dtsh") || strB.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strB.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strB.startsWith("opus")) {
            return "audio/opus";
        }
        if (strB.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strB.startsWith("flac")) {
            return "audio/flac";
        }
        if (strB.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strB.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strB.contains("cea708")) {
            return "application/cea-708";
        }
        if (strB.contains("eia608") || strB.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList<a> arrayList = f348166a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).getClass();
            if (strB.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    @j.P
    public static String f(int i12) {
        if (i12 == 32) {
            return "video/mp4v-es";
        }
        if (i12 == 33) {
            return "video/avc";
        }
        if (i12 == 35) {
            return "video/hevc";
        }
        if (i12 == 64) {
            return "audio/mp4a-latm";
        }
        if (i12 == 163) {
            return "video/wvc1";
        }
        if (i12 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i12 == 165) {
            return "audio/ac3";
        }
        if (i12 == 166) {
            return "audio/eac3";
        }
        switch (i12) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case UpdateStatusCode.DialogButton.CONFIRM /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i12) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @k0
    @j.P
    public static b g(String str) {
        Matcher matcher = f348167b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @j.P
    public static String h(@j.P String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if ("image".equals(h(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList<a> arrayList = f348166a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    @j.P
    public static String j(@j.P String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : U.O(str)) {
            String strE = e(str2);
            if (strE != null && m(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean k(@j.P String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(h(str));
    }

    public static boolean l(@j.P String str) {
        return "text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(@j.P String str) {
        return "video".equals(h(str));
    }
}
