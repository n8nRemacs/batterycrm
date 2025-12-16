package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.imageutils.JfifUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.internal.ws.WebSocketProtocol;
import org.webrtc.MediaStreamTrack;
import v61.InterfaceC49173d;

/* loaded from: classes8.dex */
public final class pc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f388768a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f388769b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f388770c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f388771d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f388772e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f388773f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f388774g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f388775h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private static HashMap<String, String> f388776i;

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f388777j;

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f388778k;

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f388779l;

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f388780m;

    static {
        int i12 = Build.VERSION.SDK_INT;
        f388768a = i12;
        String str = Build.DEVICE;
        f388769b = str;
        String str2 = Build.MANUFACTURER;
        f388770c = str2;
        String str3 = Build.MODEL;
        f388771d = str3;
        f388772e = str + ", " + str3 + ", " + str2 + ", " + i12;
        f388773f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f388774g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f388775h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f388777j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f388778k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f388779l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f388780m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, UpdateStatusCode.DialogButton.CONFIRM, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, JfifUtil.MARKER_SOI, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, JfifUtil.MARKER_SOS, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, JfifUtil.MARKER_EOI, JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST7, 194, 197, 204, 203, 230, JfifUtil.MARKER_APP1, 232, 239, 250, 253, 244, 243};
    }

    public static long a(long j12) {
        return (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? j12 : j12 * 1000;
    }

    public static int c(int i12) {
        if (i12 == 13) {
            return 1;
        }
        switch (i12) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String d(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strB = bb.b(str);
        int i12 = 0;
        String str2 = strB.split("-", 2)[0];
        if (f388776i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f388777j.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i13 = 0;
            while (true) {
                String[] strArr = f388777j;
                if (i13 >= strArr.length) {
                    break;
                }
                map.put(strArr[i13], strArr[i13 + 1]);
                i13 += 2;
            }
            f388776i = map;
        }
        String str4 = f388776i.get(str2);
        if (str4 != null) {
            StringBuilder sbA = Cif.a(str4);
            sbA.append(strB.substring(str2.length()));
            strB = sbA.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strB;
        }
        while (true) {
            String[] strArr2 = f388778k;
            if (i12 >= strArr2.length) {
                return strB;
            }
            if (strB.startsWith(strArr2[i12])) {
                return strArr2[i12 + 1] + strB.substring(strArr2[i12].length());
            }
            i12 += 2;
        }
    }

    public static boolean e(int i12) {
        return i12 == 3 || i12 == 2 || i12 == 268435456 || i12 == 536870912 || i12 == 805306368 || i12 == 4;
    }

    @InterfaceC49173d
    public static <T> T a(@j.P T t12) {
        return t12;
    }

    public static int b(int i12) {
        if (i12 == 8) {
            return 3;
        }
        if (i12 == 16) {
            return 2;
        }
        if (i12 != 24) {
            return i12 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static Looper c() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    @j.P
    public static String e(String str) {
        int length = str.length();
        int iEnd = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.charAt(i13) == '%') {
                i12++;
            }
        }
        if (i12 == 0) {
            return str;
        }
        int i14 = length - (i12 * 2);
        StringBuilder sb2 = new StringBuilder(i14);
        Matcher matcher = f388774g.matcher(str);
        while (i12 > 0 && matcher.find()) {
            char cB2 = (char) androidx.media3.common.S.b(matcher, 1, 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(cB2);
            iEnd = matcher.end();
            i12--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i14) {
            return null;
        }
        return sb2.toString();
    }

    public static boolean a(@j.P Object obj, @j.P Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static Handler b() {
        return b((Handler.Callback) null);
    }

    public static Object[] a(int i12, Object[] objArr) {
        db.a(i12 <= objArr.length);
        return Arrays.copyOf(objArr, i12);
    }

    public static Handler b(@j.P Handler.Callback callback) {
        return new Handler(c(), callback);
    }

    public static ExecutorService c(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.I1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return pc1.a(str, runnable);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point c(android.content.Context r10) throws java.lang.ClassNotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pc1.c(android.content.Context):android.graphics.Point");
    }

    public static Object[] a(Object[] objArr, int i12) {
        db.a(i12 <= objArr.length);
        return Arrays.copyOfRange(objArr, 1, i12);
    }

    public static byte[] b(String str) {
        return str.getBytes(oi.f388554c);
    }

    public static int b(long[] jArr, long j12, boolean z12) {
        int i12;
        int iBinarySearch = Arrays.binarySearch(jArr, j12);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i13 = iBinarySearch - 1;
                if (i13 < 0 || jArr[i13] != j12) {
                    break;
                }
                iBinarySearch = i13;
            }
            i12 = iBinarySearch;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    public static <T> T[] a(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Handler a() {
        return a((Handler.Callback) null);
    }

    public static long b(long j12) {
        return (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? j12 : j12 / 1000;
    }

    public static Handler a(@j.P Handler.Callback callback) {
        return new Handler((Looper) db.b(Looper.myLooper()), callback);
    }

    public static int b(int i12, int i13) {
        if (i12 != 2) {
            if (i12 == 3) {
                return i13;
            }
            if (i12 != 4) {
                if (i12 != 268435456) {
                    if (i12 == 536870912) {
                        return i13 * 3;
                    }
                    if (i12 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i13 * 4;
        }
        return i13 * 2;
    }

    public static String b(@j.P Context context) {
        TelephonyManager telephonyManager;
        int i12 = 0;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                int length = networkCountryIso.length();
                while (i12 < length) {
                    char cCharAt = networkCountryIso.charAt(i12);
                    if (cCharAt >= 'a' && cCharAt <= 'z') {
                        char[] charArray = networkCountryIso.toCharArray();
                        while (i12 < length) {
                            char c12 = charArray[i12];
                            if (c12 >= 'a' && c12 <= 'z') {
                                charArray[i12] = (char) (c12 ^ ' ');
                            }
                            i12++;
                        }
                        return String.valueOf(charArray);
                    }
                    i12++;
                }
                return networkCountryIso;
            }
        }
        String country = Locale.getDefault().getCountry();
        int length2 = country.length();
        while (i12 < length2) {
            char cCharAt2 = country.charAt(i12);
            if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                char[] charArray2 = country.toCharArray();
                while (i12 < length2) {
                    char c13 = charArray2[i12];
                    if (c13 >= 'a' && c13 <= 'z') {
                        charArray2[i12] = (char) (c13 ^ ' ');
                    }
                    i12++;
                }
                return String.valueOf(charArray2);
            }
            i12++;
        }
        return country;
    }

    public static Handler a(Looper looper, @j.P Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static void a(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static void a(@j.P Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static String a(Locale locale) {
        if (f388768a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    public static boolean d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String a(byte[] bArr) {
        return new String(bArr, oi.f388554c);
    }

    public static String a(byte[] bArr, int i12, int i13) {
        return new String(bArr, i12, i13, oi.f388554c);
    }

    public static String d(int i12) {
        switch (i12) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i12 >= 10000) {
                    return androidx.camera.camera2.internal.G.e(i12, "custom (", ")");
                }
                return "?";
        }
    }

    public static int a(int i12, int i13) {
        return ((i12 + i13) - 1) / i13;
    }

    public static float a(float f12) {
        return Math.max(0.0f, Math.min(f12, 0.95f));
    }

    public static int a(int[] iArr, int i12, boolean z12, boolean z13) {
        int i13;
        int i14;
        int iBinarySearch = Arrays.binarySearch(iArr, i12);
        if (iBinarySearch < 0) {
            i14 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i13 = iBinarySearch - 1;
                if (i13 < 0 || iArr[i13] != i12) {
                    break;
                }
                iBinarySearch = i13;
            }
            i14 = z12 ? iBinarySearch : i13;
        }
        return z13 ? Math.max(0, i14) : i14;
    }

    public static int a(la0 la0Var, long j12) {
        int iA2 = la0Var.a() - 1;
        int i12 = 0;
        while (i12 <= iA2) {
            int i13 = (i12 + iA2) >>> 1;
            if (la0Var.a(i13) < j12) {
                i12 = i13 + 1;
            } else {
                iA2 = i13 - 1;
            }
        }
        int i14 = iA2 + 1;
        if (i14 < la0Var.a() && la0Var.a(i14) == j12) {
            return i14;
        }
        if (iA2 == -1) {
            return 0;
        }
        return iA2;
    }

    public static int a(long[] jArr, long j12, boolean z12) {
        int i12;
        int iBinarySearch = Arrays.binarySearch(jArr, j12);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i12 = iBinarySearch + 1;
            if (i12 >= jArr.length || jArr[i12] != j12) {
                break;
            }
            iBinarySearch = i12;
        }
        return z12 ? iBinarySearch : i12;
    }

    public static long a(long j12, long j13, long j14) {
        if (j14 >= j13 && j14 % j13 == 0) {
            return j12 / (j14 / j13);
        }
        if (j14 < j13 && j13 % j14 == 0) {
            return (j13 / j14) * j12;
        }
        return (long) (j12 * (j13 / j14));
    }

    public static void a(long[] jArr, long j12) {
        int i12 = 0;
        if (j12 >= 1000000 && j12 % 1000000 == 0) {
            long j13 = j12 / 1000000;
            while (i12 < jArr.length) {
                jArr[i12] = jArr[i12] / j13;
                i12++;
            }
            return;
        }
        if (j12 < 1000000 && 1000000 % j12 == 0) {
            long j14 = 1000000 / j12;
            while (i12 < jArr.length) {
                jArr[i12] = jArr[i12] * j14;
                i12++;
            }
            return;
        }
        double d12 = 1000000 / j12;
        while (i12 < jArr.length) {
            jArr[i12] = (long) (jArr[i12] * d12);
            i12++;
        }
    }

    public static String[] d() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f388768a >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArrSplit = new String[]{a(configuration.locale)};
        }
        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
            strArrSplit[i12] = d(strArrSplit[i12]);
        }
        return strArrSplit;
    }

    public static int a(int i12) {
        if (i12 == 12) {
            return f388768a >= 32 ? 743676 : 0;
        }
        switch (i12) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i13 = f388768a;
                return (i13 < 23 && i13 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    @j.X
    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static int a(Uri uri, @j.P String str) {
        int i12;
        if (str != null) {
            switch (str) {
            }
            return 4;
        }
        String scheme = uri.getScheme();
        if (scheme != null && bb.a(scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strB = bb.b(lastPathSegment.substring(iLastIndexOf + 1));
                strB.getClass();
                switch (strB.hashCode()) {
                    case 104579:
                        if (strB.equals("ism")) {
                            break;
                        }
                        break;
                    case 108321:
                        if (strB.equals("mpd")) {
                            break;
                        }
                        break;
                    case 3242057:
                        if (strB.equals("isml")) {
                            break;
                        }
                        break;
                    case 3299913:
                        if (strB.equals("m3u8")) {
                            break;
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*
                    Method dump skipped, instructions count: 282
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pc1.a(android.net.Uri, java.lang.String):int");
            }

            public static int a(int i12, byte[] bArr) {
                int i13 = -1;
                for (int i14 = 0; i14 < i12; i14++) {
                    i13 = f388779l[((i13 >>> 24) ^ (bArr[i14] & 255)) & 255] ^ (i13 << 8);
                }
                return i13;
            }

            public static int a(int i12, int i13, byte[] bArr) {
                int i14 = 0;
                while (i12 < i13) {
                    i14 = f388780m[i14 ^ (bArr[i12] & 255)];
                    i12++;
                }
                return i14;
            }

            public static boolean a(pr0 pr0Var, pr0 pr0Var2, @j.P Inflater inflater) {
                if (pr0Var.a() <= 0) {
                    return false;
                }
                if (pr0Var2.b() < pr0Var.a()) {
                    pr0Var2.a(pr0Var.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(pr0Var.c(), pr0Var.d(), pr0Var.a());
                int iInflate = 0;
                while (true) {
                    try {
                        iInflate += inflater.inflate(pr0Var2.c(), iInflate, pr0Var2.b() - iInflate);
                        if (inflater.finished()) {
                            pr0Var2.d(iInflate);
                            inflater.reset();
                            return true;
                        }
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        if (iInflate == pr0Var2.b()) {
                            pr0Var2.a(pr0Var2.b() * 2);
                        }
                    } catch (DataFormatException unused) {
                        return false;
                    } finally {
                        inflater.reset();
                    }
                }
                return false;
            }

            public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
                return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
            }

            public static int a(@j.P String str) throws NumberFormatException {
                String[] strArrSplit;
                int length;
                if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                    return 0;
                }
                String str2 = strArrSplit[length - 1];
                boolean z12 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                try {
                    str2.getClass();
                    int i12 = Integer.parseInt(str2);
                    return z12 ? -i12 : i12;
                } catch (NumberFormatException unused) {
                    return 0;
                }
            }
        }
