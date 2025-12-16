package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public final class qg0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f389160a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f389161b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f389162c = 0;

    public static final class a {
    }

    @j.k0
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f389163a;

        public b(int i12) {
            this.f389163a = i12;
        }
    }

    public static boolean a(@j.P String str, @j.P String str2) throws NumberFormatException {
        b bVar;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null) {
                    Matcher matcher = f389161b.matcher(str2);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        String strGroup2 = matcher.group(2);
                        try {
                            Integer.parseInt(strGroup, 16);
                            bVar = new b(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        int i12 = bVar.f389163a;
                        char c12 = i12 != 2 ? i12 != 5 ? i12 != 29 ? i12 != 42 ? i12 != 22 ? i12 != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                        if (c12 == 0 || c12 == 16) {
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public static int b(String str, @j.P String str2) throws NumberFormatException {
        b bVar;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null) {
                    return 0;
                }
                Matcher matcher = f389161b.matcher(str2);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    String strGroup2 = matcher.group(2);
                    try {
                        Integer.parseInt(strGroup, 16);
                        bVar = new b(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    return 0;
                }
                int i12 = bVar.f389163a;
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

    public static boolean c(@j.P String str) {
        int iIndexOf;
        return "text".equals((str != null && (iIndexOf = str.indexOf(47)) != -1) ? str.substring(0, iIndexOf) : null) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean d(@j.P String str) {
        int iIndexOf;
        return "video".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf));
    }

    @j.P
    public static String a(int i12) {
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
        if (i12 != 166) {
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
        return "audio/eac3";
    }

    public static boolean b(@j.P String str) {
        int iIndexOf;
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf));
    }

    public static int a(@j.P String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (b(str)) {
            return 1;
        }
        if (d(str)) {
            return 2;
        }
        if (c(str)) {
            return 3;
        }
        if ("image".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f389160a.size();
        for (int i12 = 0; i12 < size; i12++) {
            f389160a.get(i12).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }
}
