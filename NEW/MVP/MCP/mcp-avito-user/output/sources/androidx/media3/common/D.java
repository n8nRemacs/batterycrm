package androidx.media3.common;

import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.k0;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* compiled from: MimeTypes.java */
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f47217a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f47218b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes.java */
    public static final class a {
    }

    /* compiled from: MimeTypes.java */
    @k0
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f47219a;

        public b(int i12, int i13) {
            this.f47219a = i13;
        }

        public final int a() {
            int i12 = this.f47219a;
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

    @androidx.media3.common.util.J
    public static boolean a(@j.P String str, @j.P String str2) {
        b bVarD;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (bVarD = d(str2)) != null) {
                    int iA2 = bVarD.a();
                    if (iA2 == 0 || iA2 == 16) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @androidx.media3.common.util.J
    public static int b(String str, @j.P String str2) {
        b bVarD;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarD = d(str2)) == null) {
                    return 0;
                }
                return bVarD.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @androidx.media3.common.util.J
    @j.P
    public static String c(int i12) {
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
    public static b d(String str) {
        Matcher matcher = f47218b.matcher(str);
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

    @androidx.media3.common.util.J
    @j.P
    public static String e(@j.P String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    @androidx.media3.common.util.J
    public static int f(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if ("video".equals(e(str))) {
            return 2;
        }
        if (h(str)) {
            return 3;
        }
        if ("image".equals(e(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList<a> arrayList = f47217a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    @androidx.media3.common.util.J
    public static boolean g(@j.P String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(e(str));
    }

    @androidx.media3.common.util.J
    public static boolean h(@j.P String str) {
        return "text".equals(e(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }
}
