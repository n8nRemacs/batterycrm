package androidx.compose.ui.text.android;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: LayoutHelper.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/android/r;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Layout f42022a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f42023b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f42024c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final boolean[] f42025d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public char[] f42026e;

    /* compiled from: LayoutHelper.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/r$a;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f42027a;

        /* renamed from: b, reason: collision with root package name */
        public final int f42028b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f42029c;

        public a(int i12, int i13, boolean z12) {
            this.f42027a = i12;
            this.f42028b = i13;
            this.f42029c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42027a == aVar.f42027a && this.f42028b == aVar.f42028b && this.f42029c == aVar.f42029c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f42029c) + androidx.appcompat.app.r.e(this.f42028b, Integer.hashCode(this.f42027a) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BidiRun(start=");
            sb2.append(this.f42027a);
            sb2.append(", end=");
            sb2.append(this.f42028b);
            sb2.append(", isRtl=");
            return androidx.appcompat.app.r.x(sb2, this.f42029c, ')');
        }
    }

    public r(@Y61.k Layout layout) {
        this.f42022a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iH2 = C43066x.H('\n', length, 4, this.f42022a.getText());
            length = iH2 < 0 ? this.f42022a.getText().length() : iH2 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f42022a.getText().length());
        this.f42023b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add(null);
        }
        this.f42024c = arrayList2;
        this.f42025d = new boolean[this.f42023b.size()];
        this.f42023b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi a(int r15) {
        /*
            r14 = this;
            boolean[] r0 = r14.f42025d
            boolean r1 = r0[r15]
            java.util.ArrayList r2 = r14.f42024c
            if (r1 == 0) goto Lf
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        Lf:
            java.util.ArrayList r1 = r14.f42023b
            r3 = 0
            if (r15 != 0) goto L16
            r4 = r3
            goto L22
        L16:
            int r4 = r15 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L22:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            char[] r5 = r14.f42026e
            if (r5 == 0) goto L38
            int r6 = r5.length
            if (r6 >= r10) goto L36
            goto L38
        L36:
            r12 = r5
            goto L3b
        L38:
            char[] r5 = new char[r10]
            goto L36
        L3b:
            android.text.Layout r5 = r14.f42022a
            java.lang.CharSequence r6 = r5.getText()
            android.text.TextUtils.getChars(r6, r4, r1, r12, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r12, r3, r10)
            r4 = 1
            r13 = 0
            if (r1 == 0) goto L6e
            int r1 = r14.e(r15)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L5d
            r11 = r4
            goto L5e
        L5d:
            r11 = r3
        L5e:
            java.text.Bidi r1 = new java.text.Bidi
            r9 = 0
            r7 = 0
            r8 = 0
            r5 = r1
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r3 = r1.getRunCount()
            if (r3 != r4) goto L6f
        L6e:
            r1 = r13
        L6f:
            r2.set(r15, r1)
            r0[r15] = r4
            if (r1 == 0) goto L7d
            char[] r15 = r14.f42026e
            if (r12 != r15) goto L7c
            r12 = r13
            goto L7d
        L7c:
            r12 = r15
        L7d:
            r14.f42026e = r12
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.r.a(int):java.text.Bidi");
    }

    public final float b(int i12, boolean z12) {
        Layout layout = this.f42022a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i12));
        if (i12 > lineEnd) {
            i12 = lineEnd;
        }
        return z12 ? layout.getPrimaryHorizontal(i12) : layout.getSecondaryHorizontal(i12);
    }

    public final float c(int i12, boolean z12, boolean z13) {
        int i13;
        int i14;
        int iF2 = i12;
        if (!z13) {
            return b(i12, z12);
        }
        Layout layout = this.f42022a;
        int iA2 = q.a(layout, iF2, z13);
        int lineStart = layout.getLineStart(iA2);
        int lineEnd = layout.getLineEnd(iA2);
        if (iF2 != lineStart && iF2 != lineEnd) {
            return b(i12, z12);
        }
        if (iF2 == 0 || iF2 == layout.getText().length()) {
            return b(i12, z12);
        }
        int iD2 = d(iF2, z13);
        boolean z14 = layout.getParagraphDirection(layout.getLineForOffset(e(iD2))) == -1;
        int iF3 = f(lineEnd, lineStart);
        int iE2 = e(iD2);
        int i15 = lineStart - iE2;
        int i16 = iF3 - iE2;
        Bidi bidiA = a(iD2);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i15, i16) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z12 || z14 == zIsRtlCharAt) {
                z14 = !z14;
            }
            return iF2 == lineStart ? z14 : !z14 ? layout.getLineLeft(iA2) : layout.getLineRight(iA2);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i17 = 0; i17 < runCount; i17++) {
            aVarArr[i17] = new a(bidiCreateLineBidi.getRunStart(i17) + lineStart, bidiCreateLineBidi.getRunLimit(i17) + lineStart, bidiCreateLineBidi.getRunLevel(i17) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i18 = 0; i18 < runCount2; i18++) {
            bArr[i18] = (byte) bidiCreateLineBidi.getRunLevel(i18);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (iF2 == lineStart) {
            int i19 = 0;
            while (true) {
                if (i19 >= runCount) {
                    i14 = -1;
                    break;
                }
                if (aVarArr[i19].f42027a == iF2) {
                    i14 = i19;
                    break;
                }
                i19++;
            }
            boolean z15 = (z12 || z14 == aVarArr[i14].f42029c) ? !z14 : z14;
            return (i14 == 0 && z15) ? layout.getLineLeft(iA2) : (i14 != runCount - 1 || z15) ? z15 ? layout.getPrimaryHorizontal(aVarArr[i14 - 1].f42027a) : layout.getPrimaryHorizontal(aVarArr[i14 + 1].f42027a) : layout.getLineRight(iA2);
        }
        if (iF2 > iF3) {
            iF2 = f(iF2, lineStart);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= runCount) {
                i13 = -1;
                break;
            }
            if (aVarArr[i22].f42028b == iF2) {
                i13 = i22;
                break;
            }
            i22++;
        }
        boolean z16 = (z12 || z14 == aVarArr[i13].f42029c) ? z14 : !z14;
        return (i13 == 0 && z16) ? layout.getLineLeft(iA2) : (i13 != runCount - 1 || z16) ? z16 ? layout.getPrimaryHorizontal(aVarArr[i13 - 1].f42028b) : layout.getPrimaryHorizontal(aVarArr[i13 + 1].f42028b) : layout.getLineRight(iA2);
    }

    public final int d(@j.F int i12, boolean z12) {
        ArrayList arrayList = this.f42023b;
        int iO2 = C42745f0.o(arrayList, Integer.valueOf(i12));
        int i13 = iO2 < 0 ? -(iO2 + 1) : iO2 + 1;
        if (z12 && i13 > 0) {
            int i14 = i13 - 1;
            if (i12 == ((Number) arrayList.get(i14)).intValue()) {
                return i14;
            }
        }
        return i13;
    }

    public final int e(@j.F int i12) {
        if (i12 == 0) {
            return 0;
        }
        return ((Number) this.f42023b.get(i12 - 1)).intValue();
    }

    public final int f(int i12, int i13) {
        while (i12 > i13) {
            char cCharAt = this.f42022a.getText().charAt(i12 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kotlin.jvm.internal.L.g(cCharAt, 8192) < 0 || kotlin.jvm.internal.L.g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                break;
            }
            i12--;
        }
        return i12;
    }
}
