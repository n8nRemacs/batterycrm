package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j.InterfaceC42167x;
import kotlin.Metadata;

/* compiled from: StaticLayoutFactory.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/F;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC22576o
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final F f41977a = new F();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final z f41978b = new z();

    @Y61.k
    public static StaticLayout a(@Y61.k CharSequence charSequence, @Y61.k TextPaint textPaint, int i12, int i13, @Y61.k TextDirectionHeuristic textDirectionHeuristic, @Y61.k Layout.Alignment alignment, @j.F int i14, @Y61.l TextUtils.TruncateAt truncateAt, @j.F int i15, @InterfaceC42167x float f12, float f13, int i16, boolean z12, boolean z13, int i17, int i18, int i19, int i22, @Y61.l int[] iArr, @Y61.l int[] iArr2) {
        new J(charSequence, 0, i13, textPaint, i12, textDirectionHeuristic, alignment, i14, truncateAt, i15, f12, f13, i16, z12, z13, i17, i18, i19, i22, iArr, iArr2);
        f41978b.getClass();
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i13, textPaint, i12);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i14);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i15);
        builderObtain.setLineSpacing(f13, f12);
        builderObtain.setIncludePad(z12);
        builderObtain.setBreakStrategy(i17);
        builderObtain.setHyphenationFrequency(i22);
        builderObtain.setIndents(iArr, iArr2);
        int i23 = Build.VERSION.SDK_INT;
        int i24 = A.f41973a;
        builderObtain.setJustificationMode(i16);
        if (i23 >= 28) {
            int i25 = B.f41974a;
            builderObtain.setUseLineSpacingFromFallbacks(z13);
        }
        if (i23 >= 33) {
            int i26 = C.f41975a;
            builderObtain.setLineBreakConfig(androidx.appcompat.app.x.b().setLineBreakStyle(i18).setLineBreakWordStyle(i19).build());
        }
        if (i23 >= 35) {
            int i27 = E.f41976a;
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }
}
