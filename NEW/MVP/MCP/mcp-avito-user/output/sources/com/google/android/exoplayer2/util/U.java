package com.google.android.exoplayer2.util;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.C37257c;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Util.java */
/* loaded from: classes6.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final int f348106a = Build.VERSION.SDK_INT;

    /* renamed from: b, reason: collision with root package name */
    public static final String f348107b = Build.DEVICE;

    /* renamed from: c, reason: collision with root package name */
    public static final String f348108c = Build.MANUFACTURER;

    /* renamed from: d, reason: collision with root package name */
    public static final String f348109d = Build.MODEL;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f348110e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f348111f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f348112g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f348113h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public static HashMap<String, String> f348114i;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f348115j;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f348116k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f348117l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f348118m;

    static {
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f348112g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f348113h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f348115j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f348116k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f348117l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f348118m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, UpdateStatusCode.DialogButton.CONFIRM, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, JfifUtil.MARKER_SOI, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, JfifUtil.MARKER_SOS, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, JfifUtil.MARKER_EOI, JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST7, 194, 197, 204, 203, 230, JfifUtil.MARKER_APP1, 232, 239, 250, 253, 244, 243};
    }

    public static String[] A() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i12 = f348106a;
        if (i12 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i12 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = I(strArrSplit[i13]);
        }
        return strArrSplit;
    }

    @j.P
    public static String B(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e12) {
            C36605v.a("Failed to read system property ".concat(str), e12);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int C(android.net.Uri r8) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 3
            java.lang.String r4 = r8.getScheme()
            if (r4 == 0) goto L13
            java.lang.String r5 = "rtsp"
            boolean r4 = com.google.common.base.C37257c.a(r5, r4)
            if (r4 == 0) goto L13
            return r3
        L13:
            java.lang.String r4 = r8.getLastPathSegment()
            r5 = 4
            if (r4 != 0) goto L1b
            return r5
        L1b:
            r6 = 46
            int r6 = r4.lastIndexOf(r6)
            if (r6 < 0) goto L6f
            int r6 = r6 + r0
            java.lang.String r4 = r4.substring(r6)
            java.lang.String r4 = com.google.common.base.C37257c.b(r4)
            r4.getClass()
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case 104579: goto L58;
                case 108321: goto L4d;
                case 3242057: goto L42;
                case 3299913: goto L39;
                default: goto L37;
            }
        L37:
            r3 = r6
            goto L62
        L39:
            java.lang.String r7 = "m3u8"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L62
            goto L37
        L42:
            java.lang.String r3 = "isml"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L4b
            goto L37
        L4b:
            r3 = r1
            goto L62
        L4d:
            java.lang.String r3 = "mpd"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L56
            goto L37
        L56:
            r3 = r0
            goto L62
        L58:
            java.lang.String r3 = "ism"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L61
            goto L37
        L61:
            r3 = r2
        L62:
            switch(r3) {
                case 0: goto L6b;
                case 1: goto L69;
                case 2: goto L6b;
                case 3: goto L67;
                default: goto L65;
            }
        L65:
            r3 = r5
            goto L6c
        L67:
            r3 = r1
            goto L6c
        L69:
            r3 = r2
            goto L6c
        L6b:
            r3 = r0
        L6c:
            if (r3 == r5) goto L6f
            return r3
        L6f:
            java.lang.String r8 = r8.getPath()
            r8.getClass()
            java.util.regex.Pattern r3 = com.google.android.exoplayer2.util.U.f348113h
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L9b
            java.lang.String r8 = r8.group(r1)
            if (r8 == 0) goto L9a
            java.lang.String r3 = "format=mpd-time-csf"
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L91
            return r2
        L91:
            java.lang.String r2 = "format=m3u8-aapl"
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto L9a
            return r1
        L9a:
            return r0
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.U.C(android.net.Uri):int");
    }

    public static int D(Uri uri, @j.P String str) {
        if (str == null) {
            return C(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static boolean E(F f12, F f13, @j.P Inflater inflater) {
        if (f12.a() <= 0) {
            return false;
        }
        if (f13.f348070a.length < f12.a()) {
            f13.b(f12.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(f12.f348070a, f12.f348071b, f12.a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = f13.f348070a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = f13.f348070a;
                    if (iInflate == bArr2.length) {
                        f13.b(bArr2.length * 2);
                    }
                } else {
                    f13.A(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean F(int i12) {
        return i12 == 3 || i12 == 2 || i12 == 268435456 || i12 == 536870912 || i12 == 805306368 || i12 == 4;
    }

    public static boolean G(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long H(long j12) {
        return (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? j12 : j12 * 1000;
    }

    public static String I(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strB = C37257c.b(str);
        int i12 = 0;
        String str2 = strB.split("-", 2)[0];
        if (f348114i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f348115j;
            HashMap<String, String> map = new HashMap<>(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i13 = 0; i13 < strArr.length; i13 += 2) {
                map.put(strArr[i13], strArr[i13 + 1]);
            }
            f348114i = map;
        }
        String str4 = f348114i.get(str2);
        if (str4 != null) {
            StringBuilder sbR = androidx.compose.foundation.H.r(str4);
            sbR.append(strB.substring(str2.length()));
            strB = sbR.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strB;
        }
        while (true) {
            String[] strArr2 = f348116k;
            if (i12 >= strArr2.length) {
                return strB;
            }
            if (strB.startsWith(strArr2[i12])) {
                return strArr2[i12 + 1] + strB.substring(strArr2[i12].length());
            }
            i12 += 2;
        }
    }

    public static Object[] J(int i12, Object[] objArr) {
        C36585a.b(i12 <= objArr.length);
        return Arrays.copyOf(objArr, i12);
    }

    public static void K(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void L(int i12, int i13, List list) {
        if (i12 < 0 || i13 > list.size() || i12 > i13) {
            throw new IllegalArgumentException();
        }
        if (i12 != i13) {
            list.subList(i12, i13).clear();
        }
    }

    public static long M(long j12, long j13, long j14) {
        if (j14 >= j13 && j14 % j13 == 0) {
            return j12 / (j14 / j13);
        }
        if (j14 < j13 && j13 % j14 == 0) {
            return (j13 / j14) * j12;
        }
        return (long) (j12 * (j13 / j14));
    }

    public static void N(long[] jArr, long j12) {
        int i12 = 0;
        if (j12 >= 1000000 && j12 % 1000000 == 0) {
            long j13 = j12 / 1000000;
            while (i12 < jArr.length) {
                jArr[i12] = jArr[i12] / j13;
                i12++;
            }
            return;
        }
        if (j12 >= 1000000 || 1000000 % j12 != 0) {
            double d12 = 1000000 / j12;
            while (i12 < jArr.length) {
                jArr[i12] = (long) (jArr[i12] * d12);
                i12++;
            }
            return;
        }
        long j14 = 1000000 / j12;
        while (i12 < jArr.length) {
            jArr[i12] = jArr[i12] * j14;
            i12++;
        }
    }

    public static String[] O(@j.P String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static boolean P(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static byte[] Q(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i12 = inputStream.read(bArr);
            if (i12 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i12);
        }
    }

    public static long R(long j12) {
        return (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? j12 : j12 / 1000;
    }

    public static boolean a(@j.P Object obj, @j.P Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j12, boolean z12) {
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

    public static int c(C36606w c36606w, long j12) {
        int i12 = c36606w.f348164a - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            if (c36606w.b(i14) < j12) {
                i13 = i14 + 1;
            } else {
                i12 = i14 - 1;
            }
        }
        int i15 = i12 + 1;
        if (i15 < c36606w.f348164a && c36606w.b(i15) == j12) {
            return i15;
        }
        if (i12 == -1) {
            return 0;
        }
        return i12;
    }

    public static int d(List list, Long l12, boolean z12) {
        int i12;
        int iBinarySearch = Collections.binarySearch(list, l12);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i13 = iBinarySearch - 1;
                if (i13 < 0 || ((Comparable) list.get(i13)).compareTo(l12) != 0) {
                    break;
                }
                iBinarySearch = i13;
            }
            i12 = iBinarySearch;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    public static int e(int[] iArr, int i12, boolean z12, boolean z13) {
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

    public static int f(long[] jArr, long j12, boolean z12) {
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

    public static int g(int i12, int i13) {
        return ((i12 + i13) - 1) / i13;
    }

    public static void h(@j.P Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int i(long j12, long j13) {
        if (j12 < j13) {
            return -1;
        }
        return j12 == j13 ? 0 : 1;
    }

    public static float j(float f12, float f13, float f14) {
        return Math.max(f13, Math.min(f12, f14));
    }

    public static int k(int i12, int i13, int i14) {
        return Math.max(i13, Math.min(i12, i14));
    }

    public static long l(long j12, long j13, long j14) {
        return Math.max(j13, Math.min(j12, j14));
    }

    public static boolean m(Object[] objArr, @j.P Comparable comparable) {
        for (Object obj : objArr) {
            if (a(obj, comparable)) {
                return true;
            }
        }
        return false;
    }

    public static Handler n(@j.P Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        C36585a.e(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static int o(int i12) {
        int i13 = f348106a;
        if (i12 == 12) {
            return i13 >= 32 ? 743676 : 0;
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
                return (i13 < 23 && i13 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int p(int i12, @j.P String str) {
        int i13 = 0;
        for (String str2 : O(str)) {
            if (i12 == z.i(z.e(str2))) {
                i13++;
            }
        }
        return i13;
    }

    @j.P
    public static String q(int i12, @j.P String str) {
        String[] strArrO = O(str);
        if (strArrO.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrO) {
            if (i12 == z.i(z.e(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static int r(int i12) {
        if (i12 == 2 || i12 == 4) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (i12 == 10) {
            return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
        }
        if (i12 == 7) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (i12 == 8) {
            return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
        }
        switch (i12) {
            case 15:
                return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
            case 16:
            case 18:
                return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
            default:
                switch (i12) {
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                    default:
                        return AuthCode.StatusCode.PERMISSION_EXPIRED;
                }
        }
    }

    public static int s(@j.P String str) throws NumberFormatException {
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

    public static String t(int i12) {
        if (i12 == 0) {
            return "NO";
        }
        if (i12 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i12 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i12 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i12 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long u(long j12, float f12) {
        return f12 == 1.0f ? j12 : Math.round(j12 * f12);
    }

    public static int v(int i12) {
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

    public static int w(int i12, int i13) {
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

    public static long x(long j12, float f12) {
        return f12 == 1.0f ? j12 : Math.round(j12 / f12);
    }

    public static int y(int i12) {
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

    public static String z(StringBuilder sb2, Formatter formatter, long j12) {
        if (j12 == -9223372036854775807L) {
            j12 = 0;
        }
        String str = j12 < 0 ? "-" : "";
        long jAbs = (Math.abs(j12) + 500) / 1000;
        long j13 = jAbs % 60;
        long j14 = (jAbs / 60) % 60;
        long j15 = jAbs / 3600;
        sb2.setLength(0);
        return j15 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j15), Long.valueOf(j14), Long.valueOf(j13)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13)).toString();
    }
}
