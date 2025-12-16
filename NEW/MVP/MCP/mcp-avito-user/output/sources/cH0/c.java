package Ch0;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.LineBackgroundSpan;
import android.text.style.MetricAffectingSpan;
import com.akita.view.foundation.util.f;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RoundedCornersBackgroundSpan.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCh0/c;", "Landroid/text/style/LineBackgroundSpan;", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements LineBackgroundSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RectF f2633b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f2634c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Path f2635d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f2636e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2637f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f2638g;

    /* compiled from: RoundedCornersBackgroundSpan.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCh0/c$a;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2639a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f2640b = new ArrayList();

        public a(int i12) {
            this.f2639a = i12;
        }

        @k
        public final void a(@k SpannableString spannableString, @InterfaceC42156l int i12, int i13, int i14) {
            this.f2640b.add(new Q(spannableString, new C13305a(spannableString, i12, f.a(i13), f.a(i14), 0, 0, false, 112, null)));
        }
    }

    public c(a aVar, C42822w c42822w) {
        Paint paint = new Paint();
        this.f2634c = paint;
        this.f2635d = new Path();
        this.f2636e = new ArrayList();
        this.f2638g = new ArrayList();
        paint.setAntiAlias(true);
        this.f2637f = aVar.f2639a;
        Iterator it = aVar.f2640b.iterator();
        while (it.hasNext()) {
            this.f2636e.add(((Q) it.next()).f406620c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(@k Canvas canvas, @k Paint paint, int i12, int i13, int i14, int i15, int i16, @k CharSequence charSequence, int i17, int i18, int i19) {
        int i22;
        float size;
        Iterator it;
        Q q12;
        CharSequence charSequence2 = charSequence;
        ArrayList arrayList = this.f2638g;
        arrayList.clear();
        Iterator it2 = this.f2636e.iterator();
        loop0: while (true) {
            int i23 = i17;
            int length = i18;
            while (it2.hasNext()) {
                C13305a c13305a = (C13305a) it2.next();
                if (i23 <= c13305a.f2622f && length >= c13305a.f2621e) {
                    CharSequence charSequenceSubSequence = charSequence2.subSequence(i23, length);
                    int trimmedLength = TextUtils.getTrimmedLength(charSequenceSubSequence);
                    if (!TextUtils.isEmpty(C43066x.A0(charSequenceSubSequence.toString()).toString())) {
                        if (trimmedLength != charSequenceSubSequence.length()) {
                            int length2 = charSequenceSubSequence.length();
                            int i24 = 0;
                            while (i24 < length2 && L.g(charSequenceSubSequence.charAt(i24), 32) <= 0) {
                                i24++;
                            }
                            int length3 = charSequenceSubSequence.length();
                            while (length3 > i24 && L.g(charSequenceSubSequence.charAt(length3 - 1), 32) <= 0) {
                                length3--;
                            }
                            i23 += i24;
                            length -= charSequenceSubSequence.length() - length3;
                        }
                        int i25 = c13305a.f2621e;
                        int i26 = i23 < i25 ? i25 : i23;
                        int i27 = c13305a.f2622f;
                        int i28 = length > i27 ? i27 : length;
                        if (i26 == i28) {
                            it = it2;
                            i17 = i23;
                            i18 = length;
                        } else {
                            TextPaint textPaint = new TextPaint(paint);
                            if (charSequence2 instanceof SpannedString) {
                                MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) ((SpannedString) charSequence2).getSpans(i26, i28, MetricAffectingSpan.class);
                                if (metricAffectingSpanArr.length != 0) {
                                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                                        metricAffectingSpan.updateMeasureState(textPaint);
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                size = 0.0f;
                            } else {
                                Iterator it3 = arrayList.iterator();
                                float fMeasureText = 0.0f;
                                while (it3.hasNext()) {
                                    b bVar = (b) it3.next();
                                    fMeasureText += bVar.f2624a.measureText(charSequence2, bVar.f2625b, bVar.f2626c);
                                }
                                size = fMeasureText + arrayList.size();
                            }
                            try {
                                float f12 = i12 + size;
                                float fMeasureText2 = textPaint.measureText(charSequence2, i26, i28) + f12;
                                if (i19 == 0) {
                                    it = it2;
                                    q12 = new Q(Integer.valueOf(f.a(3)), Integer.valueOf((int) (Resources.getSystem().getDisplayMetrics().density * 1.5f)));
                                } else {
                                    it = it2;
                                    q12 = new Q(0, 0);
                                }
                                int iIntValue = ((Number) q12.f406619b).intValue();
                                int iIntValue2 = ((Number) q12.f406620c).intValue();
                                float f13 = this.f2637f;
                                float f14 = f12 - f13;
                                i17 = i23;
                                float f15 = i14 - iIntValue;
                                float f16 = fMeasureText2 + f13;
                                i18 = length;
                                float fDescent = ((paint.descent() + i15) + f13) - iIntValue2;
                                String string = c13305a.f2617a.toString();
                                String string2 = charSequence2.subSequence(i26, i28).toString();
                                boolean zF2 = L.f(string, string2);
                                float f17 = c13305a.f2620d;
                                float f18 = c13305a.f2619c;
                                Q q13 = zF2 ? new Q(Float.valueOf(f18), Float.valueOf(f17)) : C43066x.i0(string, string2) ? new Q(Float.valueOf(f18), Float.valueOf(0.0f)) : C43066x.B(string, string2) ? new Q(Float.valueOf(0.0f), Float.valueOf(f17)) : new Q(Float.valueOf(0.0f), Float.valueOf(0.0f));
                                float fFloatValue = ((Number) q13.f406619b).floatValue();
                                float fFloatValue2 = ((Number) q13.f406620c).floatValue();
                                arrayList.add(new b(textPaint, i26, i28, f14, f16, f15, fDescent, C42745f0.U(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue)), c13305a));
                            } catch (IndexOutOfBoundsException unused) {
                            }
                        }
                        it2 = it;
                        charSequence2 = charSequence;
                    }
                }
                it2 = it2;
                charSequence2 = charSequence;
            }
            break loop0;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            b bVar2 = (b) it4.next();
            C13305a c13305a2 = bVar2.f2632i;
            if (c13305a2.f2623g && (i22 = c13305a2.f2618b) != 0) {
                RectF rectF = this.f2633b;
                rectF.set(bVar2.f2627d, bVar2.f2629f, bVar2.f2628e, bVar2.f2630g);
                Path path = this.f2635d;
                path.reset();
                path.addRoundRect(rectF, C42745f0.J0(bVar2.f2631h), Path.Direction.CW);
                Paint paint2 = this.f2634c;
                paint2.setColor(i22);
                canvas.drawPath(path, paint2);
            }
        }
    }
}
