package x0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: PlaceholderSpan.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lx0/j;", "Landroid/text/style/ReplacementSpan;", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f441917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f441918c;

    /* renamed from: d, reason: collision with root package name */
    public final float f441919d;

    /* renamed from: e, reason: collision with root package name */
    public final int f441920e;

    /* renamed from: f, reason: collision with root package name */
    public final float f441921f;

    /* renamed from: g, reason: collision with root package name */
    public final int f441922g;

    /* renamed from: h, reason: collision with root package name */
    public Paint.FontMetricsInt f441923h;

    /* renamed from: i, reason: collision with root package name */
    public int f441924i;

    /* renamed from: j, reason: collision with root package name */
    public int f441925j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f441926k;

    /* compiled from: PlaceholderSpan.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0012"}, d2 = {"Lx0/j$a;", "", "<init>", "()V", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "a", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PlaceholderSpan.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx0/j$a$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @P41.c
        /* renamed from: x0.j$a$a, reason: collision with other inner class name */
        public @interface InterfaceC12840a {
        }

        /* compiled from: PlaceholderSpan.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx0/j$a$b;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @P41.c
        public @interface b {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public j(float f12, int i12, float f13, int i13, float f14, int i14) {
        this.f441917b = f12;
        this.f441918c = i12;
        this.f441919d = f13;
        this.f441920e = i13;
        this.f441921f = f14;
        this.f441922g = i14;
    }

    public final int a() {
        if (!this.f441926k) {
            C50028a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f441925j;
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(@Y61.k Paint paint, @Y61.l CharSequence charSequence, int i12, int i13, @Y61.l Paint.FontMetricsInt fontMetricsInt) {
        float f12;
        double dCeil;
        this.f441926k = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        this.f441923h = fontMetricsInt2;
        int i14 = (fontMetricsInt2 != null ? fontMetricsInt2 : null).descent;
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = null;
        }
        if (i14 <= fontMetricsInt2.ascent) {
            C50028a.a("Invalid fontMetrics: line height can not be negative.");
        }
        float f13 = this.f441921f;
        float f14 = this.f441917b;
        int i15 = this.f441918c;
        if (i15 == 0) {
            f12 = f14 * f13;
        } else {
            if (i15 != 1) {
                C50028a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f12 = f14 * textSize;
        }
        this.f441924i = (int) Math.ceil(f12);
        float f15 = this.f441919d;
        int i16 = this.f441920e;
        if (i16 == 0) {
            dCeil = Math.ceil(f15 * f13);
        } else {
            if (i16 != 1) {
                C50028a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            dCeil = Math.ceil(f15 * textSize);
        }
        this.f441925j = (int) dCeil;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f441923h;
            int i17 = (fontMetricsInt3 != null ? fontMetricsInt3 : null).ascent;
            fontMetricsInt.ascent = i17;
            int i18 = (fontMetricsInt3 != null ? fontMetricsInt3 : null).descent;
            fontMetricsInt.descent = i18;
            if (fontMetricsInt3 == null) {
                fontMetricsInt3 = null;
            }
            fontMetricsInt.leading = fontMetricsInt3.leading;
            switch (this.f441922g) {
                case 0:
                    if (i17 > (-a())) {
                        fontMetricsInt.ascent = -a();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (a() + i17 > fontMetricsInt.descent) {
                        fontMetricsInt.descent = a() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (i17 > i18 - a()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - a();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (i18 - i17 < a()) {
                        int iA2 = fontMetricsInt.ascent - ((a() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iA2;
                        fontMetricsInt.descent = a() + iA2;
                        break;
                    }
                    break;
                default:
                    C50028a.a("Unknown verticalAlign.");
                    break;
            }
            Paint.FontMetricsInt fontMetricsInt4 = this.f441923h;
            if (fontMetricsInt4 == null) {
                fontMetricsInt4 = null;
            }
            fontMetricsInt.top = Math.min(fontMetricsInt4.top, fontMetricsInt.ascent);
            Paint.FontMetricsInt fontMetricsInt5 = this.f441923h;
            fontMetricsInt.bottom = Math.max((fontMetricsInt5 != null ? fontMetricsInt5 : null).bottom, fontMetricsInt.descent);
        }
        if (!this.f441926k) {
            C50028a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f441924i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@Y61.k Canvas canvas, @Y61.l CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @Y61.k Paint paint) {
    }
}
