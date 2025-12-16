package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.yandex.mobile.ads.impl.vm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes8.dex */
public final class ei extends gi {

    /* renamed from: h, reason: collision with root package name */
    private final int f384944h;

    /* renamed from: i, reason: collision with root package name */
    private final int f384945i;

    /* renamed from: j, reason: collision with root package name */
    private final int f384946j;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private List<vm> f384950n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private List<vm> f384951o;

    /* renamed from: p, reason: collision with root package name */
    private int f384952p;

    /* renamed from: q, reason: collision with root package name */
    private int f384953q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f384954r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f384955s;

    /* renamed from: t, reason: collision with root package name */
    private byte f384956t;

    /* renamed from: u, reason: collision with root package name */
    private byte f384957u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f384959w;

    /* renamed from: x, reason: collision with root package name */
    private long f384960x;

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f384941y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f384942z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f384935A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f384936B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, JfifUtil.MARKER_APP1, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, UpdateStatusCode.DialogButton.CONFIRM, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f384937C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f384938D = {193, 201, 211, JfifUtil.MARKER_SOS, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, JfifUtil.MARKER_EOI, 249, 219, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f384939E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, JfifUtil.MARKER_SOI, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    private static final boolean[] f384940F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    private final pr0 f384943g = new pr0();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<a> f384948l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private a f384949m = new a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    private int f384958v = 0;

    /* renamed from: k, reason: collision with root package name */
    private final long f384947k = 16000000;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f384961a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f384962b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f384963c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f384964d;

        /* renamed from: e, reason: collision with root package name */
        private int f384965e;

        /* renamed from: f, reason: collision with root package name */
        private int f384966f;

        /* renamed from: g, reason: collision with root package name */
        private int f384967g;

        /* renamed from: h, reason: collision with root package name */
        private int f384968h;

        /* renamed from: com.yandex.mobile.ads.impl.ei$a$a, reason: collision with other inner class name */
        public static class C10975a {

            /* renamed from: a, reason: collision with root package name */
            public final int f384969a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f384970b;

            /* renamed from: c, reason: collision with root package name */
            public int f384971c;

            public C10975a(int i12, int i13, boolean z12) {
                this.f384969a = i12;
                this.f384970b = z12;
                this.f384971c = i13;
            }
        }

        public a(int i12, int i13) {
            b(i12);
            this.f384968h = i13;
        }

        public final void d(int i12) {
            this.f384968h = i12;
        }

        public final void b(int i12) {
            this.f384967g = i12;
            this.f384961a.clear();
            this.f384962b.clear();
            this.f384963c.setLength(0);
            this.f384964d = 15;
            this.f384965e = 0;
            this.f384966f = 0;
        }

        public final boolean c() {
            return this.f384961a.isEmpty() && this.f384962b.isEmpty() && this.f384963c.length() == 0;
        }

        public final void d() {
            this.f384962b.add(b());
            this.f384963c.setLength(0);
            this.f384961a.clear();
            int iMin = Math.min(this.f384968h, this.f384964d);
            while (this.f384962b.size() >= iMin) {
                this.f384962b.remove(0);
            }
        }

        public final void a(boolean z12, int i12) {
            this.f384961a.add(new C10975a(i12, this.f384963c.length(), z12));
        }

        public final void a() {
            int length = this.f384963c.length();
            if (length > 0) {
                this.f384963c.delete(length - 1, length);
                for (int size = this.f384961a.size() - 1; size >= 0; size--) {
                    C10975a c10975a = (C10975a) this.f384961a.get(size);
                    int i12 = c10975a.f384971c;
                    if (i12 != length) {
                        return;
                    }
                    c10975a.f384971c = i12 - 1;
                }
            }
        }

        public final void c(int i12) {
            this.f384967g = i12;
        }

        private SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f384963c);
            int length = spannableStringBuilder.length();
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            boolean z12 = false;
            while (i16 < this.f384961a.size()) {
                C10975a c10975a = (C10975a) this.f384961a.get(i16);
                boolean z13 = c10975a.f384970b;
                int i18 = c10975a.f384969a;
                if (i18 != 8) {
                    boolean z14 = i18 == 7;
                    if (i18 != 7) {
                        i15 = ei.f384935A[i18];
                    }
                    z12 = z14;
                }
                int i19 = c10975a.f384971c;
                i16++;
                if (i19 != (i16 < this.f384961a.size() ? ((C10975a) this.f384961a.get(i16)).f384971c : length)) {
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
                        i17 = i19;
                        i14 = i15;
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

        public final void a(char c12) {
            if (this.f384963c.length() < 32) {
                this.f384963c.append(c12);
            }
        }

        @j.P
        public final vm a(int i12) {
            float f12;
            int i13 = this.f384965e + this.f384966f;
            int i14 = 32 - i13;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i15 = 0; i15 < this.f384962b.size(); i15++) {
                CharSequence charSequenceSubSequence = (CharSequence) this.f384962b.get(i15);
                int i16 = pc1.f388768a;
                if (charSequenceSubSequence.length() > i14) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i14);
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString spannableStringB = b();
            int i17 = pc1.f388768a;
            int length = spannableStringB.length();
            CharSequence charSequenceSubSequence2 = spannableStringB;
            if (length > i14) {
                charSequenceSubSequence2 = spannableStringB.subSequence(0, i14);
            }
            spannableStringBuilder.append(charSequenceSubSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i14 - spannableStringBuilder.length();
            int i18 = i13 - length2;
            if (i12 == Integer.MIN_VALUE) {
                if (this.f384967g != 2 || (Math.abs(i18) >= 3 && length2 >= 0)) {
                    i12 = (this.f384967g != 2 || i18 <= 0) ? 0 : 2;
                } else {
                    i12 = 1;
                }
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    i13 = 32 - length2;
                }
                f12 = ((i13 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f12 = 0.5f;
            }
            int i19 = this.f384964d;
            if (i19 > 7) {
                i19 -= 17;
            } else if (this.f384967g == 1) {
                i19 -= this.f384968h - 1;
            }
            return new vm.a().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(1, i19).b(f12).b(i12).a();
        }
    }

    public ei(int i12, String str) {
        this.f384944h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i12 == 1) {
            this.f384946j = 0;
            this.f384945i = 0;
        } else if (i12 == 2) {
            this.f384946j = 1;
            this.f384945i = 0;
        } else if (i12 == 3) {
            this.f384946j = 0;
            this.f384945i = 1;
        } else if (i12 != 4) {
            ka0.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f384946j = 0;
            this.f384945i = 0;
        } else {
            this.f384946j = 1;
            this.f384945i = 1;
        }
        a(0);
        k();
        this.f384959w = true;
        this.f384960x = -9223372036854775807L;
    }

    private ArrayList j() {
        int size = this.f384948l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i12 = 0; i12 < size; i12++) {
            vm vmVarA = this.f384948l.get(i12).a(BeduinInputModel.MIN_TEXT_VERSION);
            arrayList.add(vmVarA);
            if (vmVarA != null) {
                iMin = Math.min(iMin, vmVarA.f390920i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            vm vmVarA2 = (vm) arrayList.get(i13);
            if (vmVarA2 != null) {
                if (vmVarA2.f390920i != iMin) {
                    vmVarA2 = this.f384948l.get(i13).a(iMin);
                    vmVarA2.getClass();
                }
                arrayList2.add(vmVarA2);
            }
        }
        return arrayList2;
    }

    private void k() {
        this.f384949m.b(this.f384952p);
        this.f384948l.clear();
        this.f384948l.add(this.f384949m);
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af A[FALL_THROUGH] */
    @Override // com.yandex.mobile.ads.impl.gi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.yandex.mobile.ads.impl.x71 r14) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ei.b(com.yandex.mobile.ads.impl.x71):void");
    }

    @Override // com.yandex.mobile.ads.impl.gi
    public final t71 c() {
        List<vm> list = this.f384950n;
        this.f384951o = list;
        list.getClass();
        return new hi(list);
    }

    @Override // com.yandex.mobile.ads.impl.gi, com.yandex.mobile.ads.impl.sn
    @j.P
    /* renamed from: e */
    public final y71 a() {
        y71 y71VarF;
        y71 y71VarA = super.a();
        if (y71VarA != null) {
            return y71VarA;
        }
        if (this.f384947k == -9223372036854775807L || this.f384960x == -9223372036854775807L || g() - this.f384960x < this.f384947k || (y71VarF = f()) == null) {
            return null;
        }
        this.f384950n = Collections.emptyList();
        this.f384960x = -9223372036854775807L;
        y71VarF.a(g(), c(), Long.MAX_VALUE);
        return y71VarF;
    }

    @Override // com.yandex.mobile.ads.impl.gi, com.yandex.mobile.ads.impl.sn
    public final void flush() {
        super.flush();
        this.f384950n = null;
        this.f384951o = null;
        a(0);
        this.f384953q = 4;
        this.f384949m.d(4);
        k();
        this.f384954r = false;
        this.f384955s = false;
        this.f384956t = (byte) 0;
        this.f384957u = (byte) 0;
        this.f384958v = 0;
        this.f384959w = true;
        this.f384960x = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.gi
    public final boolean h() {
        return this.f384950n != this.f384951o;
    }

    private void a(int i12) {
        int i13 = this.f384952p;
        if (i13 == i12) {
            return;
        }
        this.f384952p = i12;
        if (i12 == 3) {
            for (int i14 = 0; i14 < this.f384948l.size(); i14++) {
                this.f384948l.get(i14).c(i12);
            }
            return;
        }
        k();
        if (i13 == 3 || i12 == 1 || i12 == 0) {
            this.f384950n = Collections.emptyList();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public final void release() {
    }
}
