package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.i;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Cea608Decoder.java */
@J
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: h, reason: collision with root package name */
    public final int f51156h;

    /* renamed from: i, reason: collision with root package name */
    public final int f51157i;

    /* renamed from: j, reason: collision with root package name */
    public final int f51158j;

    /* renamed from: n, reason: collision with root package name */
    @P
    public List<androidx.media3.common.text.a> f51162n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public List<androidx.media3.common.text.a> f51163o;

    /* renamed from: p, reason: collision with root package name */
    public int f51164p;

    /* renamed from: q, reason: collision with root package name */
    public int f51165q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f51166r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f51167s;

    /* renamed from: t, reason: collision with root package name */
    public byte f51168t;

    /* renamed from: u, reason: collision with root package name */
    public byte f51169u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f51171w;

    /* renamed from: x, reason: collision with root package name */
    public long f51172x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f51153y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f51154z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f51147A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f51148B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, JfifUtil.MARKER_APP1, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, UpdateStatusCode.DialogButton.CONFIRM, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f51149C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f51150D = {193, 201, 211, JfifUtil.MARKER_SOS, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, JfifUtil.MARKER_EOI, 249, 219, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f51151E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, JfifUtil.MARKER_SOI, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    public static final boolean[] f51152F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final z f51155g = new z();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<a> f51160l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public a f51161m = new a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f51170v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f51159k = 16000000;

    /* compiled from: Cea608Decoder.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f51173a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f51174b;

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f51175c;

        /* renamed from: d, reason: collision with root package name */
        public int f51176d;

        /* renamed from: e, reason: collision with root package name */
        public int f51177e;

        /* renamed from: f, reason: collision with root package name */
        public int f51178f;

        /* renamed from: g, reason: collision with root package name */
        public int f51179g;

        /* renamed from: h, reason: collision with root package name */
        public int f51180h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: androidx.media3.extractor.text.cea.b$a$a, reason: collision with other inner class name */
        public static class C1859a {

            /* renamed from: a, reason: collision with root package name */
            public final int f51181a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f51182b;

            /* renamed from: c, reason: collision with root package name */
            public int f51183c;

            public C1859a(int i12, int i13, boolean z12) {
                this.f51181a = i12;
                this.f51182b = z12;
                this.f51183c = i13;
            }
        }

        public a(int i12, int i13) {
            ArrayList arrayList = new ArrayList();
            this.f51173a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f51174b = arrayList2;
            StringBuilder sb2 = new StringBuilder();
            this.f51175c = sb2;
            this.f51179g = i12;
            arrayList.clear();
            arrayList2.clear();
            sb2.setLength(0);
            this.f51176d = 15;
            this.f51177e = 0;
            this.f51178f = 0;
            this.f51180h = i13;
        }

        public final void a(char c12) {
            StringBuilder sb2 = this.f51175c;
            if (sb2.length() < 32) {
                sb2.append(c12);
            }
        }

        public final void b() {
            StringBuilder sb2 = this.f51175c;
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 1, length);
                ArrayList arrayList = this.f51173a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C1859a c1859a = (C1859a) arrayList.get(size);
                    int i12 = c1859a.f51183c;
                    if (i12 != length) {
                        return;
                    }
                    c1859a.f51183c = i12 - 1;
                }
            }
        }

        @P
        public final androidx.media3.common.text.a c(int i12) {
            float f12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f51174b;
                if (i13 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i13));
                spannableStringBuilder.append('\n');
                i13++;
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i14 = this.f51177e + this.f51178f;
            int length = (32 - i14) - spannableStringBuilder.length();
            int i15 = i14 - length;
            if (i12 == Integer.MIN_VALUE) {
                i12 = (this.f51179g != 2 || (Math.abs(i15) >= 3 && length >= 0)) ? (this.f51179g != 2 || i15 <= 0) ? 0 : 2 : 1;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    i14 = 32 - length;
                }
                f12 = ((i14 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f12 = 0.5f;
            }
            int i16 = this.f51176d;
            if (i16 > 7) {
                i16 -= 17;
            } else if (this.f51179g == 1) {
                i16 -= this.f51180h - 1;
            }
            a.c cVar = new a.c();
            cVar.f47839a = spannableStringBuilder;
            cVar.f47841c = Layout.Alignment.ALIGN_NORMAL;
            cVar.f47843e = i16;
            cVar.f47844f = 1;
            cVar.f47846h = f12;
            cVar.f47847i = i12;
            return cVar.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f51175c);
            int length = spannableStringBuilder.length();
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList = this.f51173a;
                if (i16 >= arrayList.size()) {
                    break;
                }
                C1859a c1859a = (C1859a) arrayList.get(i16);
                boolean z13 = c1859a.f51182b;
                int i18 = c1859a.f51181a;
                if (i18 != 8) {
                    boolean z14 = i18 == 7;
                    if (i18 != 7) {
                        i15 = b.f51147A[i18];
                    }
                    z12 = z14;
                }
                int i19 = c1859a.f51183c;
                i16++;
                if (i19 != (i16 < arrayList.size() ? ((C1859a) arrayList.get(i16)).f51183c : length)) {
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
            return this.f51173a.isEmpty() && this.f51174b.isEmpty() && this.f51175c.length() == 0;
        }
    }

    public b(String str, int i12) {
        this.f51156h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i12 == 1) {
            this.f51158j = 0;
            this.f51157i = 0;
        } else if (i12 == 2) {
            this.f51158j = 1;
            this.f51157i = 0;
        } else if (i12 == 3) {
            this.f51158j = 0;
            this.f51157i = 1;
        } else if (i12 != 4) {
            s.g();
            this.f51158j = 0;
            this.f51157i = 0;
        } else {
            this.f51158j = 1;
            this.f51157i = 1;
        }
        k(0);
        j();
        this.f51171w = true;
        this.f51172x = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.text.cea.f, androidx.media3.extractor.text.f
    public final void c(long j12) {
        this.f51238e = j12;
    }

    @Override // androidx.media3.extractor.text.cea.f
    public final androidx.media3.extractor.text.e e() {
        List<androidx.media3.common.text.a> list = this.f51162n;
        this.f51163o = list;
        list.getClass();
        return new g(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // androidx.media3.extractor.text.cea.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(androidx.media3.extractor.text.h r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.b.f(androidx.media3.extractor.text.h):void");
    }

    @Override // androidx.media3.extractor.text.cea.f, androidx.media3.decoder.e
    public final void flush() {
        super.flush();
        this.f51162n = null;
        this.f51163o = null;
        k(0);
        this.f51165q = 4;
        this.f51161m.f51180h = 4;
        j();
        this.f51166r = false;
        this.f51167s = false;
        this.f51168t = (byte) 0;
        this.f51169u = (byte) 0;
        this.f51170v = 0;
        this.f51171w = true;
        this.f51172x = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.text.cea.f, androidx.media3.decoder.e
    @P
    /* renamed from: g */
    public final i b() {
        i iVarPollFirst;
        i iVarB = super.b();
        if (iVarB != null) {
            return iVarB;
        }
        long j12 = this.f51159k;
        if (j12 == -9223372036854775807L) {
            return null;
        }
        long j13 = this.f51172x;
        if (j13 == -9223372036854775807L || this.f51238e - j13 < j12 || (iVarPollFirst = this.f51235b.pollFirst()) == null) {
            return null;
        }
        this.f51162n = Collections.emptyList();
        this.f51172x = -9223372036854775807L;
        iVarPollFirst.i(this.f51238e, e(), Long.MAX_VALUE);
        return iVarPollFirst;
    }

    @Override // androidx.media3.decoder.e
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // androidx.media3.extractor.text.cea.f
    public final boolean h() {
        return this.f51162n != this.f51163o;
    }

    public final ArrayList i() {
        ArrayList<a> arrayList = this.f51160l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.media3.common.text.a aVarC = arrayList.get(i12).c(BeduinInputModel.MIN_TEXT_VERSION);
            arrayList2.add(aVarC);
            if (aVarC != null) {
                iMin = Math.min(iMin, aVarC.f47830j);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            androidx.media3.common.text.a aVarC2 = (androidx.media3.common.text.a) arrayList2.get(i13);
            if (aVarC2 != null) {
                if (aVarC2.f47830j != iMin) {
                    aVarC2 = arrayList.get(i13).c(iMin);
                    aVarC2.getClass();
                }
                arrayList3.add(aVarC2);
            }
        }
        return arrayList3;
    }

    public final void j() {
        a aVar = this.f51161m;
        aVar.f51179g = this.f51164p;
        aVar.f51173a.clear();
        aVar.f51174b.clear();
        aVar.f51175c.setLength(0);
        aVar.f51176d = 15;
        aVar.f51177e = 0;
        aVar.f51178f = 0;
        ArrayList<a> arrayList = this.f51160l;
        arrayList.clear();
        arrayList.add(this.f51161m);
    }

    public final void k(int i12) {
        int i13 = this.f51164p;
        if (i13 == i12) {
            return;
        }
        this.f51164p = i12;
        if (i12 != 3) {
            j();
            if (i13 == 3 || i12 == 1 || i12 == 0) {
                this.f51162n = Collections.emptyList();
                return;
            }
            return;
        }
        int i14 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f51160l;
            if (i14 >= arrayList.size()) {
                return;
            }
            arrayList.get(i14).f51179g = i12;
            i14++;
        }
    }

    @Override // androidx.media3.extractor.text.cea.f, androidx.media3.decoder.e
    public final void release() {
    }
}
