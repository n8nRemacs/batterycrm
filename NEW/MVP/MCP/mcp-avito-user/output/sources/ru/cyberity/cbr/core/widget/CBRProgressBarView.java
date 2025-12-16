package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRThemeMetric;
import ru.cyberity.cbr.core.theme.b;

/* compiled from: CBRProgressBarView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRProgressBarView;", "Landroid/widget/ProgressBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/G0;", "onMeasure", "(II)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRProgressBarView extends ProgressBar {
    @j
    public CBRProgressBarView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Map<String, ru.cyberity.cbr.core.theme.b> mapC;
        ru.cyberity.cbr.core.theme.d customTheme = ThemeHelper.INSTANCE.getCustomTheme();
        Object obj = (customTheme == null || (mapC = customTheme.c()) == null) ? null : (ru.cyberity.cbr.core.theme.b) mapC.get(CBRMetricElement.ACTIVITY_INDICATOR_STYLE.getValue());
        b.f fVar = obj instanceof b.f ? (b.f) obj : null;
        if (fVar == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        String value = fVar.getValue();
        int dimensionPixelSize = L.f(value, CBRThemeMetric.Size.LARGE.getValue()) ? getResources().getDimensionPixelSize(R.dimen.cbr_progress_bar_size_large) : L.f(value, CBRThemeMetric.Size.SMALL.getValue()) ? getResources().getDimensionPixelSize(R.dimen.cbr_progress_bar_size_small) : getResources().getDimensionPixelSize(R.dimen.cbr_progress_bar_size_medium);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + dimensionPixelSize, getPaddingTop() + getPaddingBottom() + dimensionPixelSize);
    }

    public /* synthetic */ CBRProgressBarView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.progressBarStyle : i12);
    }

    @j
    public CBRProgressBarView(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
    }
}
