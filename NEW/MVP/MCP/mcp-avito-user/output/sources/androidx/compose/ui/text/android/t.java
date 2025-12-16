package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LayoutIntrinsics.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/t;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f42030a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextPaint f42031b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42032c;

    /* renamed from: d, reason: collision with root package name */
    public float f42033d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f42034e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public BoringLayout.Metrics f42035f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f42036g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public CharSequence f42037h;

    public t(@Y61.k CharSequence charSequence, @Y61.k TextPaint textPaint, int i12) {
        this.f42030a = charSequence;
        this.f42031b = textPaint;
        this.f42032c = i12;
    }

    @Y61.l
    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.f42036g) {
            TextDirectionHeuristic textDirectionHeuristicA = O.a(this.f42032c);
            C22565d.f42007a.getClass();
            int i12 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f42030a;
            TextPaint textPaint = this.f42031b;
            if (i12 >= 33) {
                int i13 = C22564c.f42006a;
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicA, true, null);
            } else {
                int i14 = C22566e.f42008a;
                metricsIsBoring = !textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f42035f = metricsIsBoring;
            this.f42036g = true;
        }
        return this.f42035f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f42037h;
        if (charSequence == null) {
            charSequence = this.f42030a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (y.a(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.f42037h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c() {
        /*
            r6 = this;
            float r0 = r6.f42033d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f42033d
            goto L5f
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f42031b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f42030a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<x0.f> r4 = x0.f.class
            boolean r4 = androidx.compose.ui.text.android.y.a(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<x0.e> r4 = x0.e.class
            boolean r2 = androidx.compose.ui.text.android.y.a(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f42033d = r0
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.t.c():float");
    }
}
