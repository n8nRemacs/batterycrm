package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.b;

/* compiled from: CBRBottomSheetHandleView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRBottomSheetHandleView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/G0;", "onMeasure", "(II)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRBottomSheetHandleView extends AppCompatImageView {
    @j
    public CBRBottomSheetHandleView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        b.e metricSize = customTheme != null ? themeHelper.getMetricSize(customTheme, CBRMetricElement.BOTTOM_SHEET_HANDLE_SIZE) : null;
        Float width = metricSize != null ? metricSize.getWidth() : null;
        Float height = metricSize != null ? metricSize.getHeight() : null;
        if (width == null || height == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(View.resolveSizeAndState((int) width.floatValue(), widthMeasureSpec, 0), View.resolveSizeAndState((int) height.floatValue(), heightMeasureSpec, 0));
        }
    }

    public /* synthetic */ CBRBottomSheetHandleView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.cbr_BottomSheetHandleStyle : i12);
    }

    @j
    public CBRBottomSheetHandleView(@k Context context, @l AttributeSet attributeSet, int i12) {
        Integer color;
        Float height;
        super(context, attributeSet, i12);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        b.e themeMetricSize = themeHelper.getThemeMetricSize(CBRMetricElement.BOTTOM_SHEET_HANDLE_SIZE);
        if (themeMetricSize != null && (height = themeMetricSize.getHeight()) != null) {
            float fFloatValue = height.floatValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(fFloatValue / 2.0f);
            setImageDrawable(gradientDrawable);
        }
        CBRColorElement cBRColorElement = CBRColorElement.BOTTOM_SHEET_HANDLE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
            return;
        }
        setImageTintList(ColorStateList.valueOf(color.intValue()));
    }
}
