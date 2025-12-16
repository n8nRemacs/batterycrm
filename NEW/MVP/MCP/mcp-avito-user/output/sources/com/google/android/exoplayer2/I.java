package com.google.android.exoplayer2;

import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.http2.Http2;

/* compiled from: Format.java */
/* loaded from: classes6.dex */
public final class I implements InterfaceC36525h {

    /* renamed from: H, reason: collision with root package name */
    public static final I f343456H = new b().a();

    /* renamed from: I, reason: collision with root package name */
    public static final C36607v f343457I = new C36607v(4);

    /* renamed from: A, reason: collision with root package name */
    public final int f343458A;

    /* renamed from: B, reason: collision with root package name */
    public final int f343459B;

    /* renamed from: C, reason: collision with root package name */
    public final int f343460C;

    /* renamed from: D, reason: collision with root package name */
    public final int f343461D;

    /* renamed from: E, reason: collision with root package name */
    public final int f343462E;

    /* renamed from: F, reason: collision with root package name */
    public final int f343463F;

    /* renamed from: G, reason: collision with root package name */
    public int f343464G;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f343465b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f343466c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f343467d;

    /* renamed from: e, reason: collision with root package name */
    public final int f343468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f343469f;

    /* renamed from: g, reason: collision with root package name */
    public final int f343470g;

    /* renamed from: h, reason: collision with root package name */
    public final int f343471h;

    /* renamed from: i, reason: collision with root package name */
    public final int f343472i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final String f343473j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public final Metadata f343474k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final String f343475l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final String f343476m;

    /* renamed from: n, reason: collision with root package name */
    public final int f343477n;

    /* renamed from: o, reason: collision with root package name */
    public final List<byte[]> f343478o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public final DrmInitData f343479p;

    /* renamed from: q, reason: collision with root package name */
    public final long f343480q;

    /* renamed from: r, reason: collision with root package name */
    public final int f343481r;

    /* renamed from: s, reason: collision with root package name */
    public final int f343482s;

    /* renamed from: t, reason: collision with root package name */
    public final float f343483t;

    /* renamed from: u, reason: collision with root package name */
    public final int f343484u;

    /* renamed from: v, reason: collision with root package name */
    public final float f343485v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    public final byte[] f343486w;

    /* renamed from: x, reason: collision with root package name */
    public final int f343487x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public final com.google.android.exoplayer2.video.b f343488y;

    /* renamed from: z, reason: collision with root package name */
    public final int f343489z;

    public I(b bVar, a aVar) {
        this.f343465b = bVar.f343494a;
        this.f343466c = bVar.f343495b;
        this.f343467d = com.google.android.exoplayer2.util.U.I(bVar.f343496c);
        this.f343468e = bVar.f343497d;
        this.f343469f = bVar.f343498e;
        int i12 = bVar.f343499f;
        this.f343470g = i12;
        int i13 = bVar.f343500g;
        this.f343471h = i13;
        this.f343472i = i13 != -1 ? i13 : i12;
        this.f343473j = bVar.f343501h;
        this.f343474k = bVar.f343502i;
        this.f343475l = bVar.f343503j;
        this.f343476m = bVar.f343504k;
        this.f343477n = bVar.f343505l;
        List<byte[]> list = bVar.f343506m;
        this.f343478o = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = bVar.f343507n;
        this.f343479p = drmInitData;
        this.f343480q = bVar.f343508o;
        this.f343481r = bVar.f343509p;
        this.f343482s = bVar.f343510q;
        this.f343483t = bVar.f343511r;
        int i14 = bVar.f343512s;
        this.f343484u = i14 == -1 ? 0 : i14;
        float f12 = bVar.f343513t;
        this.f343485v = f12 == -1.0f ? 1.0f : f12;
        this.f343486w = bVar.f343514u;
        this.f343487x = bVar.f343515v;
        this.f343488y = bVar.f343516w;
        this.f343489z = bVar.f343517x;
        this.f343458A = bVar.f343518y;
        this.f343459B = bVar.f343519z;
        int i15 = bVar.f343490A;
        this.f343460C = i15 == -1 ? 0 : i15;
        int i16 = bVar.f343491B;
        this.f343461D = i16 != -1 ? i16 : 0;
        this.f343462E = bVar.f343492C;
        int i17 = bVar.f343493D;
        if (i17 != 0 || drmInitData == null) {
            this.f343463F = i17;
        } else {
            this.f343463F = 1;
        }
    }

    public static String d(@j.P I i12) {
        int i13;
        if (i12 == null) {
            return "null";
        }
        StringBuilder sbR = androidx.compose.foundation.H.r("id=");
        sbR.append(i12.f343465b);
        sbR.append(", mimeType=");
        sbR.append(i12.f343476m);
        int i14 = i12.f343472i;
        if (i14 != -1) {
            sbR.append(", bitrate=");
            sbR.append(i14);
        }
        String str = i12.f343473j;
        if (str != null) {
            sbR.append(", codecs=");
            sbR.append(str);
        }
        DrmInitData drmInitData = i12.f343479p;
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i15 = 0; i15 < drmInitData.f344321e; i15++) {
                UUID uuid = drmInitData.f344318b[i15].f344323c;
                if (uuid.equals(C36526i.f345418b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C36526i.f345419c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C36526i.f345421e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C36526i.f345420d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C36526i.f345417a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbR.append(", drm=[");
            com.google.common.base.C.c(',').b(sbR, linkedHashSet.iterator());
            sbR.append(']');
        }
        int i16 = i12.f343481r;
        if (i16 != -1 && (i13 = i12.f343482s) != -1) {
            sbR.append(", res=");
            sbR.append(i16);
            sbR.append("x");
            sbR.append(i13);
        }
        float f12 = i12.f343483t;
        if (f12 != -1.0f) {
            sbR.append(", fps=");
            sbR.append(f12);
        }
        int i17 = i12.f343489z;
        if (i17 != -1) {
            sbR.append(", channels=");
            sbR.append(i17);
        }
        int i18 = i12.f343458A;
        if (i18 != -1) {
            sbR.append(", sample_rate=");
            sbR.append(i18);
        }
        String str2 = i12.f343467d;
        if (str2 != null) {
            sbR.append(", language=");
            sbR.append(str2);
        }
        String str3 = i12.f343466c;
        if (str3 != null) {
            sbR.append(", label=");
            sbR.append(str3);
        }
        int i19 = i12.f343468e;
        if (i19 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((i19 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i19 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i19 & 2) != 0) {
                arrayList.add("forced");
            }
            sbR.append(", selectionFlags=[");
            com.google.common.base.C.c(',').b(sbR, arrayList.iterator());
            sbR.append("]");
        }
        int i22 = i12.f343469f;
        if (i22 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((i22 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i22 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i22 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i22 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i22 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i22 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i22 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i22 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i22 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i22 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i22 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i22 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i22 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i22 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i22 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            sbR.append(", roleFlags=[");
            com.google.common.base.C.c(',').b(sbR, arrayList2.iterator());
            sbR.append("]");
        }
        return sbR.toString();
    }

    public final b a() {
        return new b(this, null);
    }

    public final int b() {
        int i12;
        int i13 = this.f343481r;
        if (i13 == -1 || (i12 = this.f343482s) == -1) {
            return -1;
        }
        return i13 * i12;
    }

    public final boolean c(I i12) {
        List<byte[]> list = this.f343478o;
        if (list.size() != i12.f343478o.size()) {
            return false;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!Arrays.equals(list.get(i13), i12.f343478o.get(i13))) {
                return false;
            }
        }
        return true;
    }

    public final I e(I i12) {
        String str;
        String str2;
        int i13;
        int i14;
        int i15;
        if (this == i12) {
            return this;
        }
        int i16 = com.google.android.exoplayer2.util.z.i(this.f343476m);
        String str3 = i12.f343465b;
        String str4 = i12.f343466c;
        if (str4 == null) {
            str4 = this.f343466c;
        }
        if ((i16 != 3 && i16 != 1) || (str = i12.f343467d) == null) {
            str = this.f343467d;
        }
        int i17 = this.f343470g;
        if (i17 == -1) {
            i17 = i12.f343470g;
        }
        int i18 = this.f343471h;
        if (i18 == -1) {
            i18 = i12.f343471h;
        }
        String str5 = this.f343473j;
        if (str5 == null) {
            String strQ = com.google.android.exoplayer2.util.U.q(i16, i12.f343473j);
            if (com.google.android.exoplayer2.util.U.O(strQ).length == 1) {
                str5 = strQ;
            }
        }
        Metadata metadata = i12.f343474k;
        Metadata metadata2 = this.f343474k;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f345623b;
                if (entryArr.length != 0) {
                    int i19 = com.google.android.exoplayer2.util.U.f348106a;
                    Metadata.Entry[] entryArr2 = metadata2.f345623b;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata2 = new Metadata((Metadata.Entry[]) objArrCopyOf);
                }
            }
            metadata = metadata2;
        }
        float f12 = this.f343483t;
        if (f12 == -1.0f && i16 == 2) {
            f12 = i12.f343483t;
        }
        int i22 = this.f343468e | i12.f343468e;
        int i23 = this.f343469f | i12.f343469f;
        Parcelable.Creator<DrmInitData> creator = DrmInitData.CREATOR;
        ArrayList arrayList = new ArrayList();
        DrmInitData drmInitData = i12.f343479p;
        if (drmInitData != null) {
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.f344318b;
            int length = schemeDataArr.length;
            int i24 = 0;
            while (i24 < length) {
                int i25 = length;
                DrmInitData.SchemeData schemeData = schemeDataArr[i24];
                DrmInitData.SchemeData[] schemeDataArr2 = schemeDataArr;
                if (schemeData.f344326f != null) {
                    arrayList.add(schemeData);
                }
                i24++;
                length = i25;
                schemeDataArr = schemeDataArr2;
            }
            str2 = drmInitData.f344320d;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.f343479p;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.f344320d;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr3 = drmInitData2.f344318b;
            int length2 = schemeDataArr3.length;
            int i26 = 0;
            while (true) {
                String str6 = str2;
                if (i26 >= length2) {
                    break;
                }
                DrmInitData.SchemeData schemeData2 = schemeDataArr3[i26];
                DrmInitData.SchemeData[] schemeDataArr4 = schemeDataArr3;
                if (schemeData2.f344326f != null) {
                    int i27 = 0;
                    while (i27 < size) {
                        i13 = size;
                        i14 = length2;
                        if (!((DrmInitData.SchemeData) arrayList.get(i27)).f344323c.equals(schemeData2.f344323c)) {
                            i27++;
                            length2 = i14;
                            size = i13;
                        }
                    }
                    i13 = size;
                    i14 = length2;
                    i15 = 1;
                    arrayList.add(schemeData2);
                    i26 += i15;
                    str2 = str6;
                    schemeDataArr3 = schemeDataArr4;
                    length2 = i14;
                    size = i13;
                } else {
                    i13 = size;
                    i14 = length2;
                }
                i15 = 1;
                i26 += i15;
                str2 = str6;
                schemeDataArr3 = schemeDataArr4;
                length2 = i14;
                size = i13;
            }
        }
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
        b bVarA = a();
        bVarA.f343494a = str3;
        bVarA.f343495b = str4;
        bVarA.f343496c = str;
        bVarA.f343497d = i22;
        bVarA.f343498e = i23;
        bVarA.f343499f = i17;
        bVarA.f343500g = i18;
        bVarA.f343501h = str5;
        bVarA.f343502i = metadata;
        bVarA.f343507n = drmInitData3;
        bVarA.f343511r = f12;
        return bVarA.a();
    }

    public final boolean equals(@j.P Object obj) {
        int i12;
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i13 = (I) obj;
        int i14 = this.f343464G;
        if (i14 == 0 || (i12 = i13.f343464G) == 0 || i14 == i12) {
            return this.f343468e == i13.f343468e && this.f343469f == i13.f343469f && this.f343470g == i13.f343470g && this.f343471h == i13.f343471h && this.f343477n == i13.f343477n && this.f343480q == i13.f343480q && this.f343481r == i13.f343481r && this.f343482s == i13.f343482s && this.f343484u == i13.f343484u && this.f343487x == i13.f343487x && this.f343489z == i13.f343489z && this.f343458A == i13.f343458A && this.f343459B == i13.f343459B && this.f343460C == i13.f343460C && this.f343461D == i13.f343461D && this.f343462E == i13.f343462E && this.f343463F == i13.f343463F && Float.compare(this.f343483t, i13.f343483t) == 0 && Float.compare(this.f343485v, i13.f343485v) == 0 && com.google.android.exoplayer2.util.U.a(this.f343465b, i13.f343465b) && com.google.android.exoplayer2.util.U.a(this.f343466c, i13.f343466c) && com.google.android.exoplayer2.util.U.a(this.f343473j, i13.f343473j) && com.google.android.exoplayer2.util.U.a(this.f343475l, i13.f343475l) && com.google.android.exoplayer2.util.U.a(this.f343476m, i13.f343476m) && com.google.android.exoplayer2.util.U.a(this.f343467d, i13.f343467d) && Arrays.equals(this.f343486w, i13.f343486w) && com.google.android.exoplayer2.util.U.a(this.f343474k, i13.f343474k) && com.google.android.exoplayer2.util.U.a(this.f343488y, i13.f343488y) && com.google.android.exoplayer2.util.U.a(this.f343479p, i13.f343479p) && c(i13);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f343464G == 0) {
            String str = this.f343465b;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f343466c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f343467d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f343468e) * 31) + this.f343469f) * 31) + this.f343470g) * 31) + this.f343471h) * 31;
            String str4 = this.f343473j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f343474k;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : Arrays.hashCode(metadata.f345623b))) * 31;
            String str5 = this.f343475l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f343476m;
            this.f343464G = ((((((((((((((((Float.floatToIntBits(this.f343485v) + ((((Float.floatToIntBits(this.f343483t) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f343477n) * 31) + ((int) this.f343480q)) * 31) + this.f343481r) * 31) + this.f343482s) * 31)) * 31) + this.f343484u) * 31)) * 31) + this.f343487x) * 31) + this.f343489z) * 31) + this.f343458A) * 31) + this.f343459B) * 31) + this.f343460C) * 31) + this.f343461D) * 31) + this.f343462E) * 31) + this.f343463F;
        }
        return this.f343464G;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f343465b);
        sb2.append(", ");
        sb2.append(this.f343466c);
        sb2.append(", ");
        sb2.append(this.f343475l);
        sb2.append(", ");
        sb2.append(this.f343476m);
        sb2.append(", ");
        sb2.append(this.f343473j);
        sb2.append(", ");
        sb2.append(this.f343472i);
        sb2.append(", ");
        sb2.append(this.f343467d);
        sb2.append(", [");
        sb2.append(this.f343481r);
        sb2.append(", ");
        sb2.append(this.f343482s);
        sb2.append(", ");
        sb2.append(this.f343483t);
        sb2.append("], [");
        sb2.append(this.f343489z);
        sb2.append(", ");
        return AK.c.i(this.f343458A, "])", sb2);
    }

    /* compiled from: Format.java */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public int f343490A;

        /* renamed from: B, reason: collision with root package name */
        public int f343491B;

        /* renamed from: C, reason: collision with root package name */
        public int f343492C;

        /* renamed from: D, reason: collision with root package name */
        public int f343493D;

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public String f343494a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public String f343495b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public String f343496c;

        /* renamed from: d, reason: collision with root package name */
        public int f343497d;

        /* renamed from: e, reason: collision with root package name */
        public int f343498e;

        /* renamed from: f, reason: collision with root package name */
        public int f343499f;

        /* renamed from: g, reason: collision with root package name */
        public int f343500g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public String f343501h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public Metadata f343502i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public String f343503j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        public String f343504k;

        /* renamed from: l, reason: collision with root package name */
        public int f343505l;

        /* renamed from: m, reason: collision with root package name */
        @j.P
        public List<byte[]> f343506m;

        /* renamed from: n, reason: collision with root package name */
        @j.P
        public DrmInitData f343507n;

        /* renamed from: o, reason: collision with root package name */
        public long f343508o;

        /* renamed from: p, reason: collision with root package name */
        public int f343509p;

        /* renamed from: q, reason: collision with root package name */
        public int f343510q;

        /* renamed from: r, reason: collision with root package name */
        public float f343511r;

        /* renamed from: s, reason: collision with root package name */
        public int f343512s;

        /* renamed from: t, reason: collision with root package name */
        public float f343513t;

        /* renamed from: u, reason: collision with root package name */
        @j.P
        public byte[] f343514u;

        /* renamed from: v, reason: collision with root package name */
        public int f343515v;

        /* renamed from: w, reason: collision with root package name */
        @j.P
        public com.google.android.exoplayer2.video.b f343516w;

        /* renamed from: x, reason: collision with root package name */
        public int f343517x;

        /* renamed from: y, reason: collision with root package name */
        public int f343518y;

        /* renamed from: z, reason: collision with root package name */
        public int f343519z;

        public b() {
            this.f343499f = -1;
            this.f343500g = -1;
            this.f343505l = -1;
            this.f343508o = Long.MAX_VALUE;
            this.f343509p = -1;
            this.f343510q = -1;
            this.f343511r = -1.0f;
            this.f343513t = 1.0f;
            this.f343515v = -1;
            this.f343517x = -1;
            this.f343518y = -1;
            this.f343519z = -1;
            this.f343492C = -1;
            this.f343493D = 0;
        }

        public final I a() {
            return new I(this, null);
        }

        public b(I i12, a aVar) {
            this.f343494a = i12.f343465b;
            this.f343495b = i12.f343466c;
            this.f343496c = i12.f343467d;
            this.f343497d = i12.f343468e;
            this.f343498e = i12.f343469f;
            this.f343499f = i12.f343470g;
            this.f343500g = i12.f343471h;
            this.f343501h = i12.f343473j;
            this.f343502i = i12.f343474k;
            this.f343503j = i12.f343475l;
            this.f343504k = i12.f343476m;
            this.f343505l = i12.f343477n;
            this.f343506m = i12.f343478o;
            this.f343507n = i12.f343479p;
            this.f343508o = i12.f343480q;
            this.f343509p = i12.f343481r;
            this.f343510q = i12.f343482s;
            this.f343511r = i12.f343483t;
            this.f343512s = i12.f343484u;
            this.f343513t = i12.f343485v;
            this.f343514u = i12.f343486w;
            this.f343515v = i12.f343487x;
            this.f343516w = i12.f343488y;
            this.f343517x = i12.f343489z;
            this.f343518y = i12.f343458A;
            this.f343519z = i12.f343459B;
            this.f343490A = i12.f343460C;
            this.f343491B = i12.f343461D;
            this.f343492C = i12.f343462E;
            this.f343493D = i12.f343463F;
        }
    }
}
