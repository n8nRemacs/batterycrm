package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import j.InterfaceC42154j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

@SuppressLint({"InlinedApi"})
/* loaded from: classes8.dex */
public final class jc0 {

    /* renamed from: a, reason: collision with root package name */
    private static final kc0 f386824a;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f386825b;

    /* renamed from: c, reason: collision with root package name */
    @j.B
    private static final HashMap<a, List<ec0>> f386826c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f386827d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f386828e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f386829f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f386830g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f386831h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f386832i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f386833j;

    /* renamed from: k, reason: collision with root package name */
    private static int f386834k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f386835a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f386836b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f386837c;

        public a(String str, boolean z12, boolean z13) {
            this.f386835a = str;
            this.f386836b = z12;
            this.f386837c = z13;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f386835a, aVar.f386835a) && this.f386836b == aVar.f386836b && this.f386837c == aVar.f386837c;
        }

        public final int hashCode() {
            return ((v2.a(this.f386835a, 31, 31) + (this.f386836b ? 1231 : 1237)) * 31) + (this.f386837c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
        public /* synthetic */ b(Exception exc, int i12) {
            this(exc);
        }

        private b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    public interface c {
        int a();

        MediaCodecInfo a(int i12);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    public static final class d implements c {
        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final boolean b() {
            return false;
        }

        public /* synthetic */ d(int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final MediaCodecInfo a(int i12) {
            return MediaCodecList.getCodecInfoAt(i12);
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    @j.X
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f386838a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private MediaCodecInfo[] f386839b;

        public e(boolean z12, boolean z13) {
            this.f386838a = (z12 || z13) ? 1 : 0;
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final int a() {
            if (this.f386839b == null) {
                this.f386839b = new MediaCodecList(this.f386838a).getCodecInfos();
            }
            return this.f386839b.length;
        }

        @Override // com.yandex.mobile.ads.impl.jc0.c
        public final MediaCodecInfo a(int i12) {
            if (this.f386839b == null) {
                this.f386839b = new MediaCodecList(this.f386838a).getCodecInfos();
            }
            return this.f386839b[i12];
        }
    }

    public interface f<T> {
        int a(T t12);
    }

    static {
        kc0 kc0VarG = tv0.g();
        f386824a = kc0VarG;
        f386825b = Pattern.compile("^\\D?(\\d+)$");
        f386826c = new HashMap<>();
        f386827d = kc0VarG.d();
        f386828e = kc0VarG.e();
        f386829f = kc0VarG.P0();
        f386830g = kc0VarG.H();
        f386831h = kc0VarG.I();
        f386832i = kc0VarG.c();
        f386833j = kc0VarG.Z();
        f386834k = -1;
    }

    public static synchronized List<ec0> a(String str, boolean z12, boolean z13) {
        try {
            a aVar = new a(str, z12, z13);
            HashMap<a, List<ec0>> map = f386826c;
            List<ec0> list = map.get(aVar);
            if (list != null) {
                return list;
            }
            int i12 = pc1.f388768a;
            int i13 = 0;
            ArrayList<ec0> arrayListA = a(aVar, i12 >= 21 ? new e(z12, z13) : new d(i13));
            if (z12 && arrayListA.isEmpty() && 21 <= i12 && i12 <= 23) {
                arrayListA = a(aVar, new d(i13));
                if (!arrayListA.isEmpty()) {
                    ka0.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f384886a);
                }
            }
            a(str, arrayListA);
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) arrayListA);
            map.put(aVar, pVarA);
            return pVarA;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> b(com.yandex.mobile.ads.impl.vw r24) {
        /*
            Method dump skipped, instructions count: 2102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jc0.b(com.yandex.mobile.ads.impl.vw):android.util.Pair");
    }

    @InterfaceC42154j
    public static ArrayList a(com.yandex.mobile.ads.embedded.guava.collect.p pVar, vw vwVar) {
        ArrayList arrayList = new ArrayList(pVar);
        a(arrayList, new G0(vwVar, 1));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(vw vwVar, ec0 ec0Var) {
        try {
            return ec0Var.a(vwVar) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i12;
        if (f386834k == -1) {
            int iMax = 0;
            List<ec0> listA = a("video/avc", false, false);
            ec0 ec0Var = listA.isEmpty() ? null : listA.get(0);
            if (ec0Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = ec0Var.f384889d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i13 = codecProfileLevelArr[iMax].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i12 = 101376;
                                break;
                            case 64:
                                i12 = 202752;
                                break;
                            case 128:
                            case 256:
                                i12 = 414720;
                                break;
                            case 512:
                                i12 = 921600;
                                break;
                            case 1024:
                                i12 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i12 = 2097152;
                                break;
                            case 8192:
                                i12 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i12 = 5652480;
                                break;
                            case 32768:
                            case AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR /* 65536 */:
                                i12 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i12 = 35651584;
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                    } else {
                        i12 = 25344;
                    }
                    iMax2 = Math.max(i12, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, pc1.f388768a >= 21 ? 345600 : 172800);
            }
            f386834k = iMax;
        }
        return f386834k;
    }

    @j.P
    public static String a(vw vwVar) {
        Pair<Integer, Integer> pairB;
        if ("audio/eac3-joc".equals(vwVar.f391181l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(vwVar.f391181l) || (pairB = b(vwVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b A[Catch: Exception -> 0x0032, TRY_ENTER, TryCatch #4 {Exception -> 0x0032, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:78:0x016a, B:12:0x0035, B:15:0x0040, B:72:0x0143, B:75:0x014b, B:77:0x0151, B:79:0x0174, B:80:0x0197), top: B:92:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0174 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.ec0> a(com.yandex.mobile.ads.impl.jc0.a r24, com.yandex.mobile.ads.impl.jc0.c r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jc0.a(com.yandex.mobile.ads.impl.jc0$a, com.yandex.mobile.ads.impl.jc0$c):java.util.ArrayList");
    }

    @j.P
    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            kc0 kc0Var = f386824a;
            if (kc0Var.b0().equals(str)) {
                return kc0Var.L0();
            }
            if (kc0Var.f0().equals(str) || kc0Var.u0().equals(str)) {
                return kc0Var.K0();
            }
            return null;
        }
        if (str2.equals("audio/alac") && f386824a.o0().equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && f386824a.p0().equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && f386824a.n0().equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z12, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z12 && str.endsWith(".secure"))) {
            return false;
        }
        int i12 = pc1.f388768a;
        if (i12 < 21) {
            kc0 kc0Var = f386824a;
            if (kc0Var.n().equals(str) || kc0Var.p().equals(str) || kc0Var.q().equals(str) || kc0Var.o().equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i12 < 18) {
            kc0 kc0Var2 = f386824a;
            if (kc0Var2.c0().equals(str)) {
                String strB = kc0Var2.b();
                String str3 = pc1.f388769b;
                if (strB.equals(str3) || (kc0Var2.Q0().equals(pc1.f388770c) && str3.startsWith(kc0Var2.G()))) {
                    return false;
                }
            }
        }
        if (i12 == 16) {
            kc0 kc0Var3 = f386824a;
            if (kc0Var3.r0().equals(str)) {
                String strR = kc0Var3.r();
                String str4 = pc1.f388769b;
                if (strR.equals(str4) || kc0Var3.A0().equals(str4) || kc0Var3.M0().equals(str4) || kc0Var3.O0().equals(str4) || kc0Var3.N0().equals(str4) || str4.startsWith(kc0Var3.s()) || kc0Var3.j().equals(str4) || kc0Var3.k().equals(str4) || kc0Var3.l().equals(str4) || kc0Var3.m().equals(str4) || kc0Var3.T().equals(str4) || kc0Var3.F0().equals(str4)) {
                    return false;
                }
            }
        }
        if (i12 == 16) {
            kc0 kc0Var4 = f386824a;
            if (kc0Var4.q0().equals(str)) {
                String strF = kc0Var4.f();
                String str5 = pc1.f388769b;
                if (strF.equals(str5) || kc0Var4.g().equals(str5) || kc0Var4.h().equals(str5) || kc0Var4.i().equals(str5)) {
                    return false;
                }
            }
        }
        if (i12 < 24) {
            kc0 kc0Var5 = f386824a;
            if ((kc0Var5.h0().equals(str) || kc0Var5.a0().equals(str)) && kc0Var5.G0().equals(pc1.f388770c)) {
                String str6 = pc1.f388769b;
                if (str6.startsWith(kc0Var5.S0()) || str6.startsWith(kc0Var5.T0()) || str6.startsWith(kc0Var5.R0()) || kc0Var5.D0().equals(str6) || kc0Var5.Y().equals(str6) || kc0Var5.a().equals(str6) || kc0Var5.C0().equals(str6) || kc0Var5.E0().equals(str6)) {
                    return false;
                }
            }
        }
        if (i12 <= 19) {
            kc0 kc0Var6 = f386824a;
            if (kc0Var6.j0().equals(str) && kc0Var6.G0().equals(pc1.f388770c)) {
                String str7 = pc1.f388769b;
                if (str7.startsWith("d2") || str7.startsWith(kc0Var6.I0()) || str7.startsWith(kc0Var6.J()) || str7.startsWith(kc0Var6.H0()) || str7.startsWith(kc0Var6.J0())) {
                    return false;
                }
            }
        }
        if (i12 <= 19) {
            String str8 = pc1.f388769b;
            kc0 kc0Var7 = f386824a;
            if (str8.startsWith(kc0Var7.J()) && kc0Var7.s0().equals(str)) {
                return false;
            }
        }
        return (i12 <= 23 && "audio/eac3-joc".equals(str2) && f386824a.d0().equals(str)) ? false : true;
    }

    private static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (pc1.f388768a < 26) {
                String str2 = pc1.f388769b;
                kc0 kc0Var = f386824a;
                if (str2.equals(kc0Var.B0()) && arrayList.size() == 1 && ((ec0) arrayList.get(0)).f384886a.equals(kc0Var.e0())) {
                    arrayList.add(ec0.a(kc0Var.m0(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, new L0(0));
        }
        int i12 = pc1.f388768a;
        if (i12 < 21 && arrayList.size() > 1) {
            String str3 = ((ec0) arrayList.get(0)).f384886a;
            kc0 kc0Var2 = f386824a;
            if (kc0Var2.i0().equals(str3) || kc0Var2.g0().equals(str3) || kc0Var2.k0().equals(str3)) {
                a(arrayList, new L0(1));
            }
        }
        if (i12 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (f386824a.t0().equals(((ec0) arrayList.get(0)).f384886a)) {
            arrayList.add((ec0) arrayList.remove(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(ec0 ec0Var) {
        return ec0Var.f384886a.startsWith(f386824a.l0()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ec0 ec0Var) {
        String str = ec0Var.f384886a;
        kc0 kc0Var = f386824a;
        if (str.startsWith(kc0Var.l0()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (pc1.f388768a >= 26 || !str.equals(kc0Var.e0())) ? 0 : -1;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        if (pc1.f388768a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (qg0.b(str)) {
            return true;
        }
        String strB = bb.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        kc0 kc0Var = f386824a;
        if (strB.startsWith(kc0Var.x0()) || strB.startsWith(kc0Var.w0())) {
            return true;
        }
        if ((strB.startsWith(kc0Var.z0()) && strB.contains(".sw.")) || strB.equals(kc0Var.y0()) || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
            return true;
        }
        return (strB.startsWith(kc0Var.v0()) || strB.startsWith("c2.")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    private static void a(ArrayList arrayList, final f fVar) {
        Collections.sort(arrayList, new Comparator() { // from class: com.yandex.mobile.ads.impl.K0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jc0.a(fVar, obj, obj2);
            }
        });
    }
}
