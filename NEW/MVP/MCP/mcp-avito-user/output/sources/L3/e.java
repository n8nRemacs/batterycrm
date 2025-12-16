package l3;

import android.text.style.LineHeightSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ParagraphSpacingSpan.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll3/e;", "Landroid/text/style/LineHeightSpan;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f413418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f413419c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f413420d;

    public e(int i12, int i13, @Y61.l Integer num) {
        this.f413418b = i12;
        this.f413419c = i13;
        this.f413420d = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    @Override // android.text.style.LineHeightSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void chooseHeight(@Y61.k java.lang.CharSequence r2, int r3, int r4, int r5, int r6, @Y61.k android.graphics.Paint.FontMetricsInt r7) {
        /*
            r1 = this;
            boolean r5 = r2 instanceof android.text.Spanned
            java.lang.Class<l3.h> r6 = l3.h.class
            if (r5 != 0) goto L7
            goto Lf
        L7:
            r0 = r2
            android.text.Spanned r0 = (android.text.Spanned) r0
            java.lang.Object[] r0 = r0.getSpans(r3, r4, r6)
            int r0 = r0.length
        Lf:
            r0 = 0
            if (r5 == 0) goto L15
            android.text.Spanned r2 = (android.text.Spanned) r2
            goto L16
        L15:
            r2 = r0
        L16:
            if (r2 == 0) goto L1f
            java.lang.Object[] r2 = r2.getSpans(r3, r4, r6)
            l3.h[] r2 = (l3.h[]) r2
            goto L20
        L1f:
            r2 = r0
        L20:
            if (r2 == 0) goto L2f
            int r3 = r2.length
            if (r3 != 0) goto L26
            r2 = r0
        L26:
            if (r2 == 0) goto L2f
            java.lang.Object r2 = kotlin.collections.C42756l.Q(r2)
            l3.h r2 = (l3.h) r2
            goto L30
        L2f:
            r2 = r0
        L30:
            if (r2 != 0) goto L52
            java.lang.Integer r3 = r1.f413420d
            if (r3 == 0) goto L3b
            int r2 = r3.intValue()
            goto L3f
        L3b:
            if (r2 != 0) goto L4e
            int r2 = r1.f413419c
        L3f:
            int r3 = r7.descent
            int r4 = r7.ascent
            int r3 = r3 - r4
            int r4 = r1.f413418b
            int r3 = r3 - r4
            int r3 = r3 + r2
            r7.descent = r3
            r2 = 0
            r7.ascent = r2
            return
        L4e:
            r2.b()
            throw r0
        L52:
            r2.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.e.chooseHeight(java.lang.CharSequence, int, int, int, int, android.graphics.Paint$FontMetricsInt):void");
    }

    public /* synthetic */ e(int i12, int i13, Integer num, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13, num);
    }
}
