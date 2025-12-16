package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.text.m;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Cea608Decoder.java */
/* loaded from: classes6.dex */
public final class a extends e {

    /* renamed from: h, reason: collision with root package name */
    public final int f346760h;

    /* renamed from: i, reason: collision with root package name */
    public final int f346761i;

    /* renamed from: j, reason: collision with root package name */
    public final int f346762j;

    /* renamed from: n, reason: collision with root package name */
    @P
    public List<com.google.android.exoplayer2.text.a> f346766n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public List<com.google.android.exoplayer2.text.a> f346767o;

    /* renamed from: p, reason: collision with root package name */
    public int f346768p;

    /* renamed from: q, reason: collision with root package name */
    public int f346769q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f346770r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f346771s;

    /* renamed from: t, reason: collision with root package name */
    public byte f346772t;

    /* renamed from: u, reason: collision with root package name */
    public byte f346773u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f346775w;

    /* renamed from: x, reason: collision with root package name */
    public long f346776x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f346757y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f346758z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f346751A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f346752B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, JfifUtil.MARKER_APP1, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, UpdateStatusCode.DialogButton.CONFIRM, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f346753C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f346754D = {193, 201, 211, JfifUtil.MARKER_SOS, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, JfifUtil.MARKER_EOI, 249, 219, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f346755E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, JfifUtil.MARKER_SOI, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    public static final boolean[] f346756F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final F f346759g = new F();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<C10599a> f346764l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public C10599a f346765m = new C10599a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f346774v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f346763k = 16000000;

    /* compiled from: Cea608Decoder.java */
    /* renamed from: com.google.android.exoplayer2.text.cea.a$a, reason: collision with other inner class name */
    public static final class C10599a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f346777a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f346778b;

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f346779c;

        /* renamed from: d, reason: collision with root package name */
        public int f346780d;

        /* renamed from: e, reason: collision with root package name */
        public int f346781e;

        /* renamed from: f, reason: collision with root package name */
        public int f346782f;

        /* renamed from: g, reason: collision with root package name */
        public int f346783g;

        /* renamed from: h, reason: collision with root package name */
        public int f346784h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: com.google.android.exoplayer2.text.cea.a$a$a, reason: collision with other inner class name */
        public static class C10600a {

            /* renamed from: a, reason: collision with root package name */
            public final int f346785a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f346786b;

            /* renamed from: c, reason: collision with root package name */
            public int f346787c;

            public C10600a(int i12, int i13, boolean z12) {
                this.f346785a = i12;
                this.f346786b = z12;
                this.f346787c = i13;
            }
        }

        public C10599a(int i12, int i13) {
            ArrayList arrayList = new ArrayList();
            this.f346777a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f346778b = arrayList2;
            StringBuilder sb2 = new StringBuilder();
            this.f346779c = sb2;
            this.f346783g = i12;
            arrayList.clear();
            arrayList2.clear();
            sb2.setLength(0);
            this.f346780d = 15;
            this.f346781e = 0;
            this.f346782f = 0;
            this.f346784h = i13;
        }

        public final void a(char c12) {
            StringBuilder sb2 = this.f346779c;
            if (sb2.length() < 32) {
                sb2.append(c12);
            }
        }

        public final void b() {
            StringBuilder sb2 = this.f346779c;
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 1, length);
                ArrayList arrayList = this.f346777a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C10600a c10600a = (C10600a) arrayList.get(size);
                    int i12 = c10600a.f346787c;
                    if (i12 != length) {
                        return;
                    }
                    c10600a.f346787c = i12 - 1;
                }
            }
        }

        @P
        public final com.google.android.exoplayer2.text.a c(int i12) {
            float f12;
            int i13 = this.f346781e + this.f346782f;
            int i14 = 32 - i13;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i15 = 0;
            while (true) {
                ArrayList arrayList = this.f346778b;
                if (i15 >= arrayList.size()) {
                    break;
                }
                CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i15);
                int i16 = U.f348106a;
                if (charSequenceSubSequence.length() > i14) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i14);
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                spannableStringBuilder.append('\n');
                i15++;
            }
            SpannableString spannableStringD = d();
            int i17 = U.f348106a;
            int length = spannableStringD.length();
            CharSequence charSequenceSubSequence2 = spannableStringD;
            if (length > i14) {
                charSequenceSubSequence2 = spannableStringD.subSequence(0, i14);
            }
            spannableStringBuilder.append(charSequenceSubSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i14 - spannableStringBuilder.length();
            int i18 = i13 - length2;
            if (i12 == Integer.MIN_VALUE) {
                i12 = (this.f346783g != 2 || (Math.abs(i18) >= 3 && length2 >= 0)) ? (this.f346783g != 2 || i18 <= 0) ? 0 : 2 : 1;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    i13 = 32 - length2;
                }
                f12 = ((i13 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f12 = 0.5f;
            }
            int i19 = this.f346780d;
            if (i19 > 7) {
                i19 -= 17;
            } else if (this.f346783g == 1) {
                i19 -= this.f346784h - 1;
            }
            a.c cVar = new a.c();
            cVar.f346734a = spannableStringBuilder;
            cVar.f346736c = Layout.Alignment.ALIGN_NORMAL;
            cVar.f346738e = i19;
            cVar.f346739f = 1;
            cVar.f346741h = f12;
            cVar.f346742i = i12;
            return cVar.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f346779c);
            int length = spannableStringBuilder.length();
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList = this.f346777a;
                if (i16 >= arrayList.size()) {
                    break;
                }
                C10600a c10600a = (C10600a) arrayList.get(i16);
                boolean z13 = c10600a.f346786b;
                int i18 = c10600a.f346785a;
                if (i18 != 8) {
                    boolean z14 = i18 == 7;
                    if (i18 != 7) {
                        i15 = a.f346751A[i18];
                    }
                    z12 = z14;
                }
                int i19 = c10600a.f346787c;
                i16++;
                if (i19 != (i16 < arrayList.size() ? ((C10600a) arrayList.get(i16)).f346787c : length)) {
                    if (i12 != -1 && !z13) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i19, 33);
                        i12 = -1;
                    } else if (i12 == -1 && z13) {
                        i12 = i19;
                    }
                    if (i13 != -1 && !z12) {
                        androidx.media3.extractor.text.cea.a.a(2, spannableStringBuilder, i13, i19, 33);
                        i13 = -1;
                    } else if (i13 == -1 && z12) {
                        i13 = i19;
                    }
                    if (i15 != i14) {
                        if (i14 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i17, i19, 33);
                        }
                        i14 = i15;
                        i17 = i19;
                    }
                }
            }
            if (i12 != -1 && i12 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
            }
            if (i13 != -1 && i13 != length) {
                androidx.media3.extractor.text.cea.a.a(2, spannableStringBuilder, i13, length, 33);
            }
            if (i17 != length && i14 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i17, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.f346777a.isEmpty() && this.f346778b.isEmpty() && this.f346779c.length() == 0;
        }
    }

    public a(String str, int i12) {
        this.f346760h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i12 == 1) {
            this.f346762j = 0;
            this.f346761i = 0;
        } else if (i12 == 2) {
            this.f346762j = 1;
            this.f346761i = 0;
        } else if (i12 == 3) {
            this.f346762j = 0;
            this.f346761i = 1;
        } else if (i12 != 4) {
            this.f346762j = 0;
            this.f346761i = 0;
        } else {
            this.f346762j = 1;
            this.f346761i = 1;
        }
        k(0);
        j();
        this.f346775w = true;
        this.f346776x = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.text.i
    public final void c(long j12) {
        this.f346841e = j12;
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    public final h e() {
        List<com.google.android.exoplayer2.text.a> list = this.f346766n;
        this.f346767o = list;
        list.getClass();
        return new f(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7 A[FALL_THROUGH] */
    @Override // com.google.android.exoplayer2.text.cea.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.exoplayer2.text.l r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.a.f(com.google.android.exoplayer2.text.l):void");
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.e
    public final void flush() {
        super.flush();
        this.f346766n = null;
        this.f346767o = null;
        k(0);
        this.f346769q = 4;
        this.f346765m.f346784h = 4;
        j();
        this.f346770r = false;
        this.f346771s = false;
        this.f346772t = (byte) 0;
        this.f346773u = (byte) 0;
        this.f346774v = 0;
        this.f346775w = true;
        this.f346776x = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.e
    @P
    /* renamed from: g */
    public final m b() {
        m mVarPollFirst;
        m mVarB = super.b();
        if (mVarB != null) {
            return mVarB;
        }
        long j12 = this.f346763k;
        if (j12 == -9223372036854775807L) {
            return null;
        }
        long j13 = this.f346776x;
        if (j13 == -9223372036854775807L || this.f346841e - j13 < j12 || (mVarPollFirst = this.f346838b.pollFirst()) == null) {
            return null;
        }
        this.f346766n = Collections.emptyList();
        this.f346776x = -9223372036854775807L;
        mVarPollFirst.i(this.f346841e, e(), Long.MAX_VALUE);
        return mVarPollFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    public final boolean h() {
        return this.f346766n != this.f346767o;
    }

    public final ArrayList i() {
        ArrayList<C10599a> arrayList = this.f346764l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i12 = 0; i12 < size; i12++) {
            com.google.android.exoplayer2.text.a aVarC = arrayList.get(i12).c(BeduinInputModel.MIN_TEXT_VERSION);
            arrayList2.add(aVarC);
            if (aVarC != null) {
                iMin = Math.min(iMin, aVarC.f346725j);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            com.google.android.exoplayer2.text.a aVarC2 = (com.google.android.exoplayer2.text.a) arrayList2.get(i13);
            if (aVarC2 != null) {
                if (aVarC2.f346725j != iMin) {
                    aVarC2 = arrayList.get(i13).c(iMin);
                    aVarC2.getClass();
                }
                arrayList3.add(aVarC2);
            }
        }
        return arrayList3;
    }

    public final void j() {
        C10599a c10599a = this.f346765m;
        c10599a.f346783g = this.f346768p;
        c10599a.f346777a.clear();
        c10599a.f346778b.clear();
        c10599a.f346779c.setLength(0);
        c10599a.f346780d = 15;
        c10599a.f346781e = 0;
        c10599a.f346782f = 0;
        ArrayList<C10599a> arrayList = this.f346764l;
        arrayList.clear();
        arrayList.add(this.f346765m);
    }

    public final void k(int i12) {
        int i13 = this.f346768p;
        if (i13 == i12) {
            return;
        }
        this.f346768p = i12;
        if (i12 != 3) {
            j();
            if (i13 == 3 || i12 == 1 || i12 == 0) {
                this.f346766n = Collections.emptyList();
                return;
            }
            return;
        }
        int i14 = 0;
        while (true) {
            ArrayList<C10599a> arrayList = this.f346764l;
            if (i14 >= arrayList.size()) {
                return;
            }
            arrayList.get(i14).f346783g = i12;
            i14++;
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.e
    public final void release() {
    }
}
