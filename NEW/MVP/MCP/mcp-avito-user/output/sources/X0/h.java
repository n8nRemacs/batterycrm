package x0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42167x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: LineHeightStyleSpan.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx0/h;", "Landroid/text/style/LineHeightSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f441905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f441906c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f441907d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441908e;

    /* renamed from: f, reason: collision with root package name */
    public final float f441909f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f441910g;

    /* renamed from: h, reason: collision with root package name */
    public int f441911h = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: i, reason: collision with root package name */
    public int f441912i = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: j, reason: collision with root package name */
    public int f441913j = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: k, reason: collision with root package name */
    public int f441914k = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: l, reason: collision with root package name */
    public int f441915l;

    /* renamed from: m, reason: collision with root package name */
    public int f441916m;

    public h(float f12, int i12, boolean z12, boolean z13, @InterfaceC42167x float f13, boolean z14) {
        this.f441905b = f12;
        this.f441906c = i12;
        this.f441907d = z12;
        this.f441908e = z13;
        this.f441909f = f13;
        this.f441910g = z14;
        if ((0.0f > f13 || f13 > 1.0f) && f13 != -1.0f) {
            C50028a.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@Y61.k CharSequence charSequence, int i12, int i13, int i14, int i15, @Y61.k Paint.FontMetricsInt fontMetricsInt) {
        int i16 = fontMetricsInt.descent;
        int i17 = fontMetricsInt.ascent;
        if (i16 - i17 <= 0) {
            return;
        }
        boolean z12 = i12 == 0;
        boolean z13 = i13 == this.f441906c;
        boolean z14 = this.f441908e;
        boolean z15 = this.f441907d;
        if (z12 && z13 && z15 && z14) {
            return;
        }
        if (this.f441911h == Integer.MIN_VALUE) {
            int i18 = i16 - i17;
            int iCeil = (int) Math.ceil(this.f441905b);
            int i19 = iCeil - i18;
            if (!this.f441910g || i19 > 0) {
                float fAbs = this.f441909f;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i19 <= 0 ? Math.ceil(i19 * fAbs) : Math.ceil((1.0f - fAbs) * i19));
                int i22 = fontMetricsInt.descent;
                int i23 = iCeil2 + i22;
                this.f441913j = i23;
                int i24 = i23 - iCeil;
                this.f441912i = i24;
                if (z15) {
                    i24 = fontMetricsInt.ascent;
                }
                this.f441911h = i24;
                if (z14) {
                    i23 = i22;
                }
                this.f441914k = i23;
                this.f441915l = fontMetricsInt.ascent - i24;
                this.f441916m = i23 - i22;
            } else {
                int i25 = fontMetricsInt.ascent;
                this.f441912i = i25;
                int i26 = fontMetricsInt.descent;
                this.f441913j = i26;
                this.f441911h = i25;
                this.f441914k = i26;
                this.f441915l = 0;
                this.f441916m = 0;
            }
        }
        fontMetricsInt.ascent = z12 ? this.f441911h : this.f441912i;
        fontMetricsInt.descent = z13 ? this.f441914k : this.f441913j;
    }
}
