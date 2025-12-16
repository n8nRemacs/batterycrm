package androidx.media3.common.util;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.C37257c;
import com.google.common.base.C37262f;
import com.google.common.util.concurrent.D0;
import com.google.common.util.concurrent.InterfaceC37569v;
import com.google.common.util.concurrent.Q0;
import com.google.common.util.concurrent.e1;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.InterfaceC42164u;
import j.InterfaceC42165v;
import j.P;
import j.X;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.internal.ws.WebSocketProtocol;
import org.webrtc.MediaStreamTrack;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @J
    public static final int f47887a;

    /* renamed from: b, reason: collision with root package name */
    @J
    public static final String f47888b;

    /* renamed from: c, reason: collision with root package name */
    @J
    public static final String f47889c;

    /* renamed from: d, reason: collision with root package name */
    @J
    public static final String f47890d;

    /* renamed from: e, reason: collision with root package name */
    @J
    public static final byte[] f47891e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f47892f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public static HashMap<String, String> f47893g;

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f47894h;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f47895i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f47896j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f47897k;

    /* compiled from: Util.java */
    @X
    public static final class a {
        @InterfaceC42164u
        public static Drawable a(Context context, Resources resources, @InterfaceC42165v int i12) {
            return resources.getDrawable(i12, context.getTheme());
        }
    }

    static {
        int i12 = Build.VERSION.SDK_INT;
        f47887a = i12;
        String str = Build.DEVICE;
        f47888b = str;
        String str2 = Build.MANUFACTURER;
        f47889c = str2;
        String str3 = Build.MODEL;
        f47890d = str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i12);
        f47891e = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f47892f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f47894h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f47895i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f47896j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f47897k = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, UpdateStatusCode.DialogButton.CONFIRM, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, JfifUtil.MARKER_SOI, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, JfifUtil.MARKER_SOS, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, JfifUtil.MARKER_EOI, JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST7, 194, 197, 204, 203, 230, JfifUtil.MARKER_APP1, 232, 239, 250, 253, 244, 243};
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static int A(Uri uri, @P String str) {
        int i12;
        if (str != null) {
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
        String scheme = uri.getScheme();
        if (scheme != null && C37257c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strB = C37257c.b(lastPathSegment.substring(iLastIndexOf + 1));
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
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.M.A(android.net.Uri, java.lang.String):int");
            }

            @J
            public static boolean B(z zVar, z zVar2, @P Inflater inflater) {
                if (zVar.a() <= 0) {
                    return false;
                }
                if (zVar2.f47962a.length < zVar.a()) {
                    zVar2.b(zVar.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(zVar.f47962a, zVar.f47963b, zVar.a());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr = zVar2.f47962a;
                        iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break;
                            }
                            byte[] bArr2 = zVar2.f47962a;
                            if (iInflate == bArr2.length) {
                                zVar2.b(bArr2.length * 2);
                            }
                        } else {
                            zVar2.E(iInflate);
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

            @J
            public static boolean C(int i12) {
                return i12 == 3 || i12 == 2 || i12 == 268435456 || i12 == 536870912 || i12 == 805306368 || i12 == 4;
            }

            @J
            public static boolean D(Context context) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            }

            @J
            public static void E(ArrayList arrayList, int i12, int i13, int i14) {
                ArrayDeque arrayDeque = new ArrayDeque();
                for (int i15 = (i13 - i12) - 1; i15 >= 0; i15--) {
                    arrayDeque.addFirst(arrayList.remove(i12 + i15));
                }
                arrayList.addAll(Math.min(i14, arrayList.size()), arrayDeque);
            }

            @J
            public static long F(long j12) {
                return (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? j12 : j12 * 1000;
            }

            @J
            public static String G(String str) throws MissingResourceException {
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
                if (f47893g == null) {
                    String[] iSOLanguages = Locale.getISOLanguages();
                    int length = iSOLanguages.length;
                    String[] strArr = f47894h;
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
                    f47893g = map;
                }
                String str4 = f47893g.get(str2);
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
                    String[] strArr2 = f47895i;
                    if (i12 >= strArr2.length) {
                        return strB;
                    }
                    if (strB.startsWith(strArr2[i12])) {
                        return strArr2[i12 + 1] + strB.substring(strArr2[i12].length());
                    }
                    i12 += 2;
                }
            }

            @J
            public static Object[] H(int i12, Object[] objArr) {
                C23110a.b(i12 <= objArr.length);
                return Arrays.copyOf(objArr, i12);
            }

            @J
            public static void I(Handler handler, Runnable runnable) {
                if (handler.getLooper().getThread().isAlive()) {
                    if (handler.getLooper() == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        handler.post(runnable);
                    }
                }
            }

            @J
            public static long J(int i12, long j12) {
                return (j12 * 1000000) / i12;
            }

            @J
            public static long K(long j12, long j13, long j14) {
                if (j14 >= j13 && j14 % j13 == 0) {
                    return j12 / (j14 / j13);
                }
                if (j14 < j13 && j13 % j14 == 0) {
                    return (j13 / j14) * j12;
                }
                return (long) (j12 * (j13 / j14));
            }

            @J
            public static void L(long[] jArr, long j12) {
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

            @J
            public static String[] M(String str) {
                return str.split("/", -1);
            }

            @J
            public static byte[] N(InputStream inputStream) throws IOException {
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

            @J
            public static String O(byte[] bArr) {
                StringBuilder sb2 = new StringBuilder(bArr.length * 2);
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                    sb2.append(Character.forDigit(bArr[i12] & 15, 16));
                }
                return sb2.toString();
            }

            @J
            public static e1 P(D0 d02, InterfaceC37569v interfaceC37569v) {
                e1 e1Var = new e1();
                e1Var.N(new J11.c(10, e1Var, d02), Q0.a());
                d02.N(new Me.m(d02, e1Var, interfaceC37569v, 4), Q0.a());
                return e1Var;
            }

            @J
            public static long Q(long j12) {
                return (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? j12 : j12 / 1000;
            }

            @J
            public static boolean a(@P Object obj, @P Object obj2) {
                return obj == null ? obj2 == null : obj.equals(obj2);
            }

            @J
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

            @J
            public static int c(t tVar, long j12) {
                int i12 = tVar.f47946a - 1;
                int i13 = 0;
                while (i13 <= i12) {
                    int i14 = (i13 + i12) >>> 1;
                    if (tVar.b(i14) < j12) {
                        i13 = i14 + 1;
                    } else {
                        i12 = i14 - 1;
                    }
                }
                int i15 = i12 + 1;
                if (i15 < tVar.f47946a && tVar.b(i15) == j12) {
                    return i15;
                }
                if (i12 == -1) {
                    return 0;
                }
                return i12;
            }

            @J
            public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t12, boolean z12, boolean z13) {
                int i12;
                int i13;
                int iBinarySearch = Collections.binarySearch(list, t12);
                if (iBinarySearch < 0) {
                    i13 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        i12 = iBinarySearch - 1;
                        if (i12 < 0 || list.get(i12).compareTo(t12) != 0) {
                            break;
                        }
                        iBinarySearch = i12;
                    }
                    i13 = z12 ? iBinarySearch : i12;
                }
                return z13 ? Math.max(0, i13) : i13;
            }

            @J
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

            @J
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

            @J
            public static int g(int i12, int i13) {
                return ((i12 + i13) - 1) / i13;
            }

            @J
            public static void h(@P Closeable closeable) throws IOException {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }

            @J
            public static int i(long j12, long j13) {
                if (j12 < j13) {
                    return -1;
                }
                return j12 == j13 ? 0 : 1;
            }

            @J
            public static float j(float f12, float f13, float f14) {
                return Math.max(f13, Math.min(f12, f14));
            }

            @J
            public static int k(int i12, int i13, int i14) {
                return Math.max(i13, Math.min(i12, i14));
            }

            @J
            public static long l(long j12, long j13, long j14) {
                return Math.max(j13, Math.min(j12, j14));
            }

            @J
            public static int m(int i12, int i13, int i14, byte[] bArr) {
                while (i12 < i13) {
                    i14 = f47896j[((i14 >>> 24) ^ (bArr[i12] & 255)) & 255] ^ (i14 << 8);
                    i12++;
                }
                return i14;
            }

            @J
            public static Handler n(@P Handler.Callback callback) {
                Looper looperMyLooper = Looper.myLooper();
                C23110a.h(looperMyLooper);
                return new Handler(looperMyLooper, callback);
            }

            @J
            public static String o(byte[] bArr) {
                return new String(bArr, C37262f.f359034c);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
            @android.annotation.SuppressLint({"InlinedApi"})
            @androidx.media3.common.util.J
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static int p(int r2) {
                /*
                    r0 = 6396(0x18fc, float:8.963E-42)
                    switch(r2) {
                        case 1: goto L28;
                        case 2: goto L25;
                        case 3: goto L22;
                        case 4: goto L1f;
                        case 5: goto L1c;
                        case 6: goto L19;
                        case 7: goto L16;
                        case 8: goto L15;
                        case 9: goto L5;
                        case 10: goto Lb;
                        case 11: goto L5;
                        case 12: goto L7;
                        default: goto L5;
                    }
                L5:
                    r2 = 0
                    return r2
                L7:
                    r2 = 743676(0xb58fc, float:1.042112E-39)
                    return r2
                Lb:
                    int r2 = androidx.media3.common.util.M.f47887a
                    r1 = 32
                    if (r2 < r1) goto L15
                    r2 = 737532(0xb40fc, float:1.033502E-39)
                    return r2
                L15:
                    return r0
                L16:
                    r2 = 1276(0x4fc, float:1.788E-42)
                    return r2
                L19:
                    r2 = 252(0xfc, float:3.53E-43)
                    return r2
                L1c:
                    r2 = 220(0xdc, float:3.08E-43)
                    return r2
                L1f:
                    r2 = 204(0xcc, float:2.86E-43)
                    return r2
                L22:
                    r2 = 28
                    return r2
                L25:
                    r2 = 12
                    return r2
                L28:
                    r2 = 4
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.M.p(int):int");
            }

            @J
            public static int q(int i12) {
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

            @J
            public static int r(@P String str) throws NumberFormatException {
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

            @J
            public static String s(int i12) {
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

            @J
            public static long t(long j12, float f12) {
                return f12 == 1.0f ? j12 : Math.round(j12 * f12);
            }

            @J
            public static int u(int i12) {
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

            @J
            public static int v(int i12, int i13) {
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

            @J
            public static String[] w() {
                String[] strArrSplit;
                Configuration configuration = Resources.getSystem().getConfiguration();
                int i12 = f47887a;
                if (i12 >= 24) {
                    strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
                } else {
                    Locale locale = configuration.locale;
                    strArrSplit = new String[]{i12 >= 21 ? locale.toLanguageTag() : locale.toString()};
                }
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    strArrSplit[i13] = G(strArrSplit[i13]);
                }
                return strArrSplit;
            }

            @P
            public static String x(String str) throws ClassNotFoundException {
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    return (String) cls.getMethod("get", String.class).invoke(cls, str);
                } catch (Exception e12) {
                    s.d("Failed to read system property ".concat(str), e12);
                    return null;
                }
            }

            @J
            public static String y(int i12) {
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
                        return i12 >= 10000 ? androidx.camera.camera2.internal.G.e(i12, "custom (", ")") : "?";
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static boolean z(@j.P androidx.media3.common.H r4) {
                /*
                    r0 = 0
                    if (r4 != 0) goto L4
                    return r0
                L4:
                    int r1 = r4.getPlaybackState()
                    r2 = 1
                    if (r1 != r2) goto L17
                    r3 = 2
                    boolean r3 = r4.u(r3)
                    if (r3 == 0) goto L17
                    r4.prepare()
                L15:
                    r0 = r2
                    goto L24
                L17:
                    r3 = 4
                    if (r1 != r3) goto L24
                    boolean r1 = r4.u(r3)
                    if (r1 == 0) goto L24
                    r4.D()
                    goto L15
                L24:
                    boolean r1 = r4.u(r2)
                    if (r1 == 0) goto L2e
                    r4.play()
                    goto L2f
                L2e:
                    r2 = r0
                L2f:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.M.z(androidx.media3.common.H):boolean");
            }
        }
